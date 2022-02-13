#include <jni.h>
#include "cstdint"
#include "cmath"
#include "sys/stat.h"
#include "cstring"
#include "string"
#include "sstream"
#include "ios"

using namespace std;

template <typename K>
void fillArrayWithZeros(K *data, int32_t length) {
    size_t bufferSize = length * sizeof(K);
    memset(data, 0, bufferSize);
}

inline bool strEndedWith(string const &fullString, string const &ending) {
    if (fullString.length() >= ending.length()) {
        return (0 == fullString.compare (fullString.length() - ending.length(), ending.length(), ending));
    } else {
        return false;
    }
}

inline long getSizeOfFile(FILE* fp) {

    if (!fp) {
        return -1;
    }

    int prev=ftell(fp);
    fseek(fp, 0L, SEEK_END);
    long sz = ftell(fp);

    fseek(fp,prev,SEEK_SET); //go back to where we were
    return sz;
}

inline string java_str_to_c_str(JNIEnv * env, jstring jStr) {
    const auto stringClass = env->FindClass("java/lang/String");
    const auto getBytes = env->GetMethodID(stringClass, "getBytes", "()[B");

    const auto stringJbytes = (jbyteArray) env->CallObjectMethod(jStr, getBytes);

    const auto length = env->GetArrayLength(stringJbytes);
    const auto pBytes = env->GetByteArrayElements(stringJbytes, nullptr);
    std::string str((char *)pBytes, length);
    env->ReleaseByteArrayElements(stringJbytes, pBytes, JNI_ABORT);

    return forward<string>(str);
}
