/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef _PLAYER_SIMIPLEMULTIPLAYER_H_
#define _PLAYER_SIMIPLEMULTIPLAYER_H_

#include <vector>

#include <string>
#include <cstring>

#include <oboe/Oboe.h>

#include "OneShotSampleSource.h"
#include "SampleBuffer.h"
#include "RecordingIO.h"
#include "fluidsynth.h"
#include "CombFilter.h"
#include "AllPassFilter.h"

namespace iolib {

    typedef unsigned char byte;     // an 8-bit unsigned value

    typedef struct {
        fluid_settings_t *settings;
        fluid_synth_t *synth;
        int soundfont_id;
    } fluid_handle_t;

    /**
     * A simple streaming player for multiple SampleBuffers.
     */
    class SimpleMultiPlayer : public oboe::AudioStreamCallback {
    public:
        SimpleMultiPlayer();

        ~SimpleMultiPlayer() {
            delete mMixBuffer;
        }

        // Inherited from oboe::AudioStreamCallback
        oboe::DataCallbackResult onAudioReady(oboe::AudioStream *oboeStream, void *audioData,
                                              int32_t numFrames) override;

        virtual void onErrorAfterClose(oboe::AudioStream *oboeStream, oboe::Result error) override;

        virtual void onErrorBeforeClose(oboe::AudioStream *oboeStream, oboe::Result error) override;

        void setupAudioStream(int32_t channelCount, int32_t sampleRate);

        void teardownAudioStream();

        bool openStream();

        // Wave Sample Loading...
        /**
         * Adds the SampleSource/SampleBuffer pair to the list of source channels.
         * Transfers ownership of those objects so that they can be deleted/unloaded.
         * The indexes associated with each source channel is the order in which they
         * are added.
         */
        void addSampleSource(SampleSource *source, SampleBuffer *buffer);

        /**
         * Deallocates and deletes all added source/buffer (see addSampleSource()).
         */
        void unloadSampleData();

        void triggerDown(int32_t index, int32_t volume);

        void triggerDownSingle(int32_t index, int32_t volume);

        void triggerUp(int32_t index);

        void resetAll();

        void setRecord(bool r);

        void setRecordFilePath(const char *s);

        void setSf2Synth(fluid_handle_t *synth);

        void setReverbValue(int32_t reverb);

        int32_t getReverbValue() const;

        void setDelayValue(int32_t delay);

    private:
        // Oboe Audio Stream
        std::shared_ptr<oboe::AudioStream> mAudioStream;

        // Audio attributes
        int32_t mChannelCount;
        int32_t mSampleRate;

        // Sample Data
        int32_t mNumSampleBuffers{};
        std::vector<SampleBuffer *> mSampleBuffers;
        std::vector<SampleSource *> mSampleSources;
        float *mMixBuffer;
        float mDecayFactor;

        bool mRecord{};

        std::shared_ptr<RecordingIO> mRecordingIO{new RecordingIO()};
        fluid_handle_t *mFluidHandle{nullptr};

        void mixAudioToBuffer(float *audioData, int32_t numFrames);

        int32_t mReverbValue{0};
        int32_t mDelayValue{0};
        float mDelayVolumeFactor{4e-5f};

        std::shared_ptr<CombFilter> mCombFilter{std::make_shared<CombFilter>(0.0f, 0)};
        std::shared_ptr<AllPassFilter> mAllPassFilter{std::make_shared<AllPassFilter>(0.0f, 0)};

        void handleSf2DelayNoteOff(int32_t numFrames);
    };
}
#endif //_PLAYER_SIMIPLEMULTIPLAYER_H_
