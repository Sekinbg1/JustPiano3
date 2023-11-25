#include <jni.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <unistd.h>
#include "fluidsynth.h"

#include <android/log.h>

// parselib includes
#include <stream/MemInputStream.h>
#include <wav/WavStreamReader.h>

#include <player/OneShotSampleSource.h>
#include <player/SimpleMultiPlayer.h>

static const char *TAG = "SoundEngine";

// JNI functions are "C" calling convention
#ifdef __cplusplus
extern "C" {
#endif

using namespace iolib;
using namespace parselib;

typedef struct {
    fluid_audio_driver_t *audio_driver;
    fluid_settings_t *settings;
    fluid_synth_t *synth;
    int soundfont_id;
} fluid_handle_t;

static SimpleMultiPlayer sDTPlayer;
static fluid_handle_t *handle;

JNIEXPORT void JNICALL Java_ly_pp_justpiano3_utils_SoundEngineUtil_setupAudioStreamNative(
        JNIEnv *env, jclass, jint numChannels, jint sampleRate) {
    __android_log_print(ANDROID_LOG_INFO, TAG, "%s", "init()");

    // we know in this case that the sample buffers are all 1-channel, 41K
    sDTPlayer.setupAudioStream(numChannels, sampleRate);
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_teardownAudioStreamNative(JNIEnv *, jclass) {
    __android_log_print(ANDROID_LOG_INFO, TAG, "%s", "deinit()");

    // we know in this case that the sample buffers are all 1-channel, 44.1K
    sDTPlayer.teardownAudioStream();
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_loadWavAssetNative(JNIEnv *env, jclass,
                                                               jbyteArray bytearray) {
    int len = env->GetArrayLength(bytearray);

    auto *buf = new unsigned char[len];
    env->GetByteArrayRegion(bytearray, 0, len, reinterpret_cast<jbyte *>(buf));

    MemInputStream stream(buf, len);

    WavStreamReader reader(&stream);
    reader.parse();

    auto *sampleBuffer = new SampleBuffer();
    sampleBuffer->loadSampleData(&reader);

    auto *source = new OneShotSampleSource(sampleBuffer);
    sDTPlayer.addSampleSource(source, sampleBuffer);

    delete[] buf;
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_unloadWavAssetsNative(JNIEnv *env, jclass) {
    sDTPlayer.unloadSampleData();
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_triggerDown(JNIEnv *env, jclass, jint index,
                                                        jint volume) {
    if (handle != nullptr && handle->synth != nullptr) {
        fluid_synth_noteon(handle->synth, 0, 108 - index, volume);
        sDTPlayer.triggerDownSingle(index, volume);
    } else {
        sDTPlayer.triggerDown(index, volume);
    }
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_triggerUp(JNIEnv *env, jclass, jint index) {
    sDTPlayer.triggerUp(index);
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_triggerUpAll(JNIEnv *env, jclass) {
    sDTPlayer.resetAll();
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_clearOutputReset(JNIEnv *, jclass) {
    sDTPlayer.clearOutputReset();
}

JNIEXPORT void JNICALL Java_ly_pp_justpiano3_utils_SoundEngineUtil_setRecord(
        JNIEnv *env, jclass, jboolean record) {
    sDTPlayer.setRecord(record);
}

JNIEXPORT void JNICALL Java_ly_pp_justpiano3_utils_SoundEngineUtil_setRecordFilePath(
        JNIEnv *env, jclass, jstring recordFilePath) {
    const char *path = env->GetStringUTFChars(recordFilePath, NULL);
    sDTPlayer.setRecordFilePath(path);
}

JNIEXPORT void JNICALL Java_ly_pp_justpiano3_utils_SoundEngineUtil_setReverbValue(
        JNIEnv *env, jclass, jint reverbValue) {
    sDTPlayer.setReverbValue(reverbValue);
    if (handle != nullptr && handle->settings != nullptr) {
        fluid_settings_setnum(handle->settings, "synth.reverb.active", reverbValue == 0 ? 0 : 1);
        fluid_settings_setnum(handle->settings, "synth.reverb.room-size", 0.8f);
        fluid_settings_setnum(handle->settings, "synth.reverb.damping", (float) reverbValue / 100);
        fluid_settings_setnum(handle->settings, "synth.reverb.level", (float) reverbValue / 100);
    }
}

JNIEXPORT void JNICALL Java_ly_pp_justpiano3_utils_SoundEngineUtil_setDelayValue(
        JNIEnv *env, jclass, jint delayValue) {
    sDTPlayer.setDelayValue(delayValue);
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_malloc(JNIEnv *env, jclass) {
    handle = (fluid_handle_t *) malloc(sizeof(fluid_handle_t));
    handle->settings = new_fluid_settings();
    handle->synth = nullptr;
    handle->soundfont_id = 0;
    fluid_settings_setint(handle->settings, "audio.realtime-prio", 99);
    fluid_settings_setint(handle->settings, "synth.polyphony", 1024);
    fluid_settings_setnum(handle->settings, "synth.gain", 1);
    fluid_settings_setint(handle->settings, "synth.midi-channels", 1);
    fluid_settings_setint(handle->settings, "synth.min-note-length", 0);
    fluid_settings_setint(handle->settings, "synth.chorus.active", 1);
    fluid_settings_setnum(handle->settings, "synth.reverb.active",
                          sDTPlayer.getReverbValue() == 0 ? 0 : 1);
    fluid_settings_setnum(handle->settings, "synth.reverb.room-size", 0.8f);
    fluid_settings_setnum(handle->settings, "synth.reverb.damp", 0.5f);
    fluid_settings_setnum(handle->settings, "synth.reverb.level",
                          (float) sDTPlayer.getReverbValue() / 100);
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_free(JNIEnv *env, jclass) {
    if (handle != nullptr) {
        if (handle->synth != nullptr) {
            delete_fluid_synth(handle->synth);
        }
        if (handle->settings != nullptr) {
            delete_fluid_settings(handle->settings);
        }
        free(handle);
        handle = nullptr;
    }
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_open(JNIEnv *env, jclass) {
    if (handle != nullptr && handle->settings != nullptr) {
        if (handle->synth != nullptr) {
            delete_fluid_synth(handle->synth);
        }
        handle->synth = new_fluid_synth(handle->settings);
        fluid_synth_set_interp_method(handle->synth, -1, FLUID_INTERP_HIGHEST);
    }
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_close(JNIEnv *env, jclass) {
    if (handle != nullptr) {
        if (handle->synth != nullptr) {
            delete_fluid_synth(handle->synth);
        }
        handle->synth = nullptr;
    }
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_loadSf2(JNIEnv *env, jclass, jstring filePath) {
    if (handle != nullptr && handle->synth != nullptr && handle->soundfont_id <= 0) {
        const char *path = env->GetStringUTFChars(filePath, nullptr);
        handle->soundfont_id = fluid_synth_sfload(handle->synth, path, 1);
        fluid_sfont_t *soundFont = fluid_synth_get_sfont_by_id(handle->synth, handle->soundfont_id);
        fluid_sfont_iteration_start(soundFont);
        fluid_preset_t *preset;
        while ((preset = fluid_sfont_iteration_next(soundFont)) != nullptr) {
            int bank = fluid_preset_get_banknum(preset);
            int presetNumber = fluid_preset_get_num(preset);
            if (fluid_sfont_get_preset(soundFont, bank, presetNumber) != nullptr) {
                fluid_synth_program_change(handle->synth, 0, presetNumber);
                sDTPlayer.setSf2Synth(handle->synth, true);
                break;
            }
        }
        handle->audio_driver = new_fluid_audio_driver(handle->settings, handle->synth);
    }
}

JNIEXPORT void JNICALL
Java_ly_pp_justpiano3_utils_SoundEngineUtil_unloadSf2(JNIEnv *env, jclass) {
    if (handle != nullptr && handle->synth != nullptr && handle->soundfont_id > 0) {
        delete_fluid_audio_driver(handle->audio_driver);
        sDTPlayer.setSf2Synth(handle->synth, false);
        fluid_synth_sfunload(handle->synth, handle->soundfont_id, 1);
        handle->soundfont_id = 0;
    }
}

#ifdef __cplusplus
}
#endif
