/*
 * Copyright (C) 2020 The Android Open Source Project
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

#ifndef _PLAYER_SAMPLESOURCE_
#define _PLAYER_SAMPLESOURCE_

#include <cstdint>
#include <queue>

#include "DataSource.h"

#include "SampleBuffer.h"

namespace iolib {

/**
 * Defines an interface for audio data provided to a player object.
 * Concrete examples include OneShotSampleBuffer. One could imagine a LoopingSampleBuffer.
 * Supports stereo position via mPan member.
 */
    class SampleSource : public DataSource {
    public:

        SampleSource(SampleBuffer *sampleBuffer) : mSampleBuffer(sampleBuffer) {}

        virtual ~SampleSource() {}

        void setPlayMode(int32_t volume) {
            std::pair<int32_t, int32_t> pair = std::make_pair(0, volume);
            if (mCurFrameIndexQueue.size() > 10) {
                mCurFrameIndexQueue.pop();
            }
            mCurFrameIndexQueue.push(pair);
        }

        void setStopMode() {
            while (!mCurFrameIndexQueue.empty()) {
                mCurFrameIndexQueue.pop();
            }
        }

        int32_t getCurFrameIndexQueueSize() {
            return mCurFrameIndexQueue.size();
        }

        std::pair<int32_t, int32_t> *frontCurFrameIndexQueue() {
            return mCurFrameIndexQueue.empty() ? nullptr : &mCurFrameIndexQueue.front();
        }

        void pushCurFrameIndexQueue(std::pair<int32_t, int32_t> pair) {
            mCurFrameIndexQueue.push(pair);
        }

        void popCurFrameIndexQueue() {
            if (!mCurFrameIndexQueue.empty()) {
                mCurFrameIndexQueue.pop();
            }
        }

    protected:
        SampleBuffer *mSampleBuffer;

        std::queue<std::pair<int32_t, int32_t>> mCurFrameIndexQueue;
    };

} // namespace iolib

#endif //_PLAYER_SAMPLESOURCE_
