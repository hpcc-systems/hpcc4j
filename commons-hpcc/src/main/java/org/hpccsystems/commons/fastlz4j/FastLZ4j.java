/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/

/********************************************************************************
 * PLEASE NOTE:
 * ******************************************************************************
 * This code has been ported from the original C version of FastLZ.
 * The original version can be found here: https://ariya.github.io/FastLZ/
 * 
 * A copy of the original FastLZ license has been included for completeness.
 *******************************************************************************/

package org.hpccsystems.commons.fastlz4j;

public class FastLZ4j
{

    static final int MAX_COPY = 32;
    static final int MAX_LEN = 264;
    static final int MAX_L1_DISTANCE = 8192;
    static final int MAX_L2_DISTANCE = 8191;
    static final int MAX_FARDISTANCE = 65535 + MAX_L2_DISTANCE - 1;

    static final int HASH_LOG = 14;
    static final int HASH_SIZE = (1 << HASH_LOG);
    static final long HASH_MASK = HASH_SIZE -1;

    static long flz_readu32(byte[] buffer, int index)
    { 
        boolean little_endian = true;
        int len = 4;
        long v = 0;
        for (int i = 0; i < len; i++)
        {
            int idx = index + ((little_endian) ? len - 1 - i : i);
            v = (v << 8) | (((long) (buffer[idx] & 0xff)));
        }
        return v;
    }

    static int flz_cmp(byte[] pBuffer, int p, byte[] qBuffer, int q, int r)
    {
        final int start = p;

        if (flz_readu32(pBuffer,p) == flz_readu32(qBuffer,q))
        {
            p += 4;
            q += 4;
        }

        while (q < r)
        {
            if(pBuffer[p] != qBuffer[q])
            {
                p++;
                q++;
                break;
            }
            p++;
            q++;
        }

        return p - start;
    }

    static int flz_hash(long v)
    {
        long h = (v * 2654435769L) >> (32 - HASH_LOG);
        return (int) (h & HASH_MASK);
    }

    static void flz_copy(byte[] dest, int destPos, byte[] src, int srcPos, int length)
    {
        for (int i = 0; i < length; i++)
        {
            dest[destPos + i] = src[srcPos + i];
        }
    }

    static int flz_literals(int runs, byte[] srcBuffer, int src, byte[] destBuffer, int dest)
    {
        while (runs >= MAX_COPY)
        {
            destBuffer[dest] = (byte) MAX_COPY -1;
            dest++;

            flz_copy(destBuffer, dest, srcBuffer, src, MAX_COPY);
            src += MAX_COPY;
            dest += MAX_COPY;
            runs -= MAX_COPY;
        }

        if (runs > 0)
        {
            destBuffer[dest] = (byte) (runs-1);
            dest++;

            flz_copy(destBuffer, dest, srcBuffer, src, runs);
            dest += runs;
        }
        return dest;
    }

    static int flz_finalize(int runs, byte[] srcBuffer, int src, byte[] destBuffer, int dest)
    {
        while (runs >= MAX_COPY)
        {
            destBuffer[dest] = (byte) (MAX_COPY -1);
            dest++;
            flz_copy(destBuffer, dest, srcBuffer, src, MAX_COPY);
            src += MAX_COPY;
            dest += MAX_COPY;
            runs -= MAX_COPY;
        }

        if (runs > 0)
        {
            destBuffer[dest] = (byte) (runs -1);
            dest++;
            flz_copy(destBuffer, dest, srcBuffer, src, runs);
            dest += runs;
        }

        return dest;
    }

    static int flz1_match(int len, int distance, byte[] opBuffer, int outputPos)
    {
        --distance;
        if (len > MAX_LEN - 2)
        {
            while (len > MAX_LEN - 2)
            {
                opBuffer[outputPos] = (byte) ((7 << 5) + (distance >> 8));
                outputPos++;

                opBuffer[outputPos] = (byte) (MAX_LEN - 2 - 7 - 2);
                outputPos++;
                
                opBuffer[outputPos] = (byte) (distance & 255);
                outputPos++;

                len -= MAX_LEN - 2;
            }
        }

        if (len < 7)
        {
            opBuffer[outputPos] = (byte) ((len << 5) + (distance >> 8));
            outputPos++;
            
            opBuffer[outputPos] = (byte) (distance & 255);
            outputPos++;
        }
        else
        {
            opBuffer[outputPos] = (byte) ((7 << 5) + (distance >> 8));
            outputPos++;

            opBuffer[outputPos] = (byte) (len - 7);
            outputPos++;

            opBuffer[outputPos] = (byte) (distance & 255);
            outputPos++;
        }
        return outputPos;
    }

    static int flz2_match(long len, long distance, byte[] opBuffer, int outputPos)
    {
        --distance;
        if (distance < MAX_L2_DISTANCE)
        {
            if (len < 7)
            {
                opBuffer[outputPos] = (byte) ((len << 5) + (distance >> 8));
                outputPos++;
                
                opBuffer[outputPos] = (byte) (distance & 255);
                outputPos++;
            }
            else
            {
                opBuffer[outputPos] = (byte) ((7 << 5) + (distance >> 8));
                outputPos++;

                for (len -= 7; len >= 255; len -= 255)
                {
                    opBuffer[outputPos] = (byte) 255;
                    outputPos++;
                }

                opBuffer[outputPos] = (byte) len;
                outputPos++;

                opBuffer[outputPos] = (byte) (distance & 255);
                outputPos++;
            }
        }
        else
        {
            if (len < 7)
            {
                distance -= MAX_L2_DISTANCE;

                opBuffer[outputPos] = (byte) ((len << 5) + 31);
                outputPos++;
                
                opBuffer[outputPos] = (byte) 255;
                outputPos++;
                
                opBuffer[outputPos] = (byte) (distance >> 8);
                outputPos++;

                opBuffer[outputPos] = (byte) (distance & 255);
                outputPos++;
            }
            else
            {
                distance -= MAX_L2_DISTANCE;
                opBuffer[outputPos] = (byte) ((7 << 5) + 31);
                outputPos++;

                for (len -= 7; len >= 255; len -= 255)
                {
                    opBuffer[outputPos] = (byte) 255;
                    outputPos++;
                }
                
                opBuffer[outputPos] = (byte) len;
                outputPos++;
                
                opBuffer[outputPos] = (byte) 255;
                outputPos++;
                
                opBuffer[outputPos] = (byte) (distance >> 8);
                outputPos++;

                opBuffer[outputPos] = (byte) (distance & 255);
                outputPos++;
            }
        }
        return outputPos;
    }

    static int fastlz1_compress(byte[] input, byte[] output) 
    {
        int inputPos = 0;
        int inputPosStart = inputPos;
        int inputPosBound = inputPos + input.length - 4; // because readU32
        int inputPosLimit = inputPos + input.length - 12 - 1;

        int outputPos = 0;

        long[] htab = new long[HASH_SIZE];
        long seq, hash;

        /* initializes hash table */
        for (hash = 0; hash < HASH_SIZE; ++hash)
        {
            htab[(int) hash] = 0;
        }

        /* we start with literal copy */
        int anchor = inputPos;
        inputPos += 2;

        /* main loop */
        while (inputPos < inputPosLimit)
        {
            int ref = 0;
            int distance;
            long cmp;

            /* find potential match */
            do
            {
                seq = (flz_readu32(input, inputPos) & 0xffffffL);
                hash = flz_hash(seq);
                ref = (int) (inputPosStart + htab[(int) hash]);
                htab[(int) hash] = inputPos - inputPosStart;
                distance = inputPos - ref;
                cmp = distance < (long) MAX_L1_DISTANCE ? (flz_readu32(input,ref) & 0xffffffL) : 0x1000000L;

                if (inputPos >= inputPosLimit)
                    break;

                ++inputPos;
            } while (seq != cmp);

            if (inputPos >= inputPosLimit)
                break;

            --inputPos;

            if (inputPos > anchor)
            {
                outputPos = flz_literals(inputPos - anchor, input, anchor, output, outputPos);
            }

            int len = flz_cmp(input, (ref + 3), input, inputPos + 3, inputPosBound);
            outputPos = flz1_match(len, distance, output, outputPos);

            /* update the hash at match boundary */
            inputPos += len;
            seq = flz_readu32(input, inputPos);
            hash = flz_hash(seq & 0xffffffL);
            htab[(int) hash] = inputPos++ - inputPosStart;
            seq >>= 8;
            hash = flz_hash(seq);
            htab[(int) hash] = inputPos++ - inputPosStart;

            anchor = inputPos;
        }

        int copy = input.length - anchor;
        outputPos = flz_finalize(copy, input, anchor, output, outputPos);

        return outputPos;
    }

    static int fastlz1_decompress(byte[] inputBuffer, int compressedLen, byte[] outputBuffer)
    {
        int inputPos = 0;
        int inputPosBound = compressedLen -2;

        int outputPos = 0;
        int ctrlCode = inputBuffer[inputPos] & 31;
        inputPos++;

        while (true)
        {
            if (ctrlCode >= 32) 
            {
                int len = (ctrlCode >> 5) - 1;
                int ofs = (ctrlCode & 31) << 8;

                int ref = outputPos - ofs - 1;
                if (len == 7 - 1)
                {
                    if (!(inputPos <= inputPosBound ))
                    {
                        return 0;
                    }

                    len += (inputBuffer[inputPos] & 0xFF);
                    inputPos++;
                }

                ref -= inputBuffer[inputPos] & 0xFF;
                inputPos++;

                len += 3;

                if (!((outputPos + len) < outputBuffer.length))
                {
                    return 0;
                }

                if (!(ref >= 0))
                {
                    return 0;
                }

                flz_copy(outputBuffer, outputPos, outputBuffer, ref, len);
                outputPos += len;
            }
            else
            {
                ctrlCode++;
                if (!((outputPos + ctrlCode) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!((inputPos + ctrlCode) <= inputBuffer.length))
                {
                    return 0;
                }

                flz_copy(outputBuffer, outputPos, inputBuffer, inputPos, ctrlCode);
                inputPos += ctrlCode;
                outputPos += ctrlCode;
            }

            if (inputPos > inputPosBound)
            {
                break;
            }

            ctrlCode = (inputBuffer[inputPos] & 0xFF);
            inputPos++;
        }

        return outputPos;
    }

    static int fastlz2_compress(byte[] input, byte[] output)
    {
        int inputPos = 0;
        int outputPos = 0; 

        int inputPosBound = inputPos + input.length - 4;
        int inputPosLimit = inputPos + input.length - 12 - 1;

        long[] htab = new long[HASH_SIZE];
        long seq, hash;

        // initializes hash table
        for (hash = 0; hash < HASH_SIZE; ++hash)
        {
            htab[(int) hash] = 0L;
        }

        // we start with literal copy
        int anchor = inputPos;
        inputPos += 2;

        // main loop
        while (inputPos < inputPosLimit)
        {
            int ref = 0;
            int distance;
            long cmp;

            // find potential match
            do
            {
                seq = flz_readu32(input, inputPos) & 0xffffffL;
                hash = flz_hash(seq);
                ref = (int) htab[(int) hash];
                htab[(int) hash] = inputPos;
                distance = inputPos - ref;
                cmp = (distance < MAX_FARDISTANCE) ? flz_readu32(input,ref) & 0xffffffL : 0x1000000L;

                if (inputPos >= inputPosLimit)
                    break;
                ++inputPos;
            } while (seq != cmp);

            if (inputPos >= inputPosLimit)
                break;

            --inputPos;

            // far, needs at least 5-byte match
            if (distance >= MAX_L2_DISTANCE)
            {
                if (input[ref+3] != input[inputPos+3] || input[ref+4] != input[inputPos+4])
                {
                    ++inputPos;
                    continue;
                }
            }

            if (inputPos > anchor)
            {
                outputPos = flz_literals(inputPos - anchor, input, anchor, output, outputPos);
            }

            int len = flz_cmp(input, (ref + 3), input, (inputPos + 3), inputPosBound);
            outputPos = flz2_match(len, distance, output, outputPos);

            // update the hash at match boundary
            inputPos += len;
            seq = flz_readu32(input,inputPos);
            hash = flz_hash(seq & 0xffffffL);
            htab[(int) hash] = inputPos++;
            seq >>= 8;

            hash = flz_hash(seq);
            htab[(int) hash] = inputPos++;

            anchor = inputPos;
        }

        int copy = input.length - anchor;
        outputPos = flz_finalize(copy, input, anchor, output, outputPos);

        // marker for fastlz2
        output[0] |= (1 << 5);

        return outputPos;
    }

    static int fastlz2_decompress(byte[] inputBuffer, int compressedLen, byte[] outputBuffer)
    {
        int inputPos = 0;
        int inputPosBound = compressedLen -2;

        int outputPos = 0;
        int ctrlCode = inputBuffer[inputPos] & 31;
        inputPos++;

        while (true)
        {
            if (ctrlCode >= 32)
            {
                int len = (ctrlCode >> 5) - 1;
                int ofs = (ctrlCode & 31) << 8;
                int ref = outputPos - ofs - 1;

                int code = 0;
                if (len == 7 - 1)
                {
                    do
                    {
                        if (!(inputPos <= inputPosBound ))
                        {
                            return 0;
                        }

                        code = (inputBuffer[inputPos] & 0xFF);
                        inputPos++;

                        len += code;
                    } while (code == 255);
                }
                code = (inputBuffer[inputPos] & 0xFF);
                inputPos++;

                ref -= code;
                len += 3;

                // match from 16-bit distance
                if (code == 255)
                {
                    if (ofs == (31 << 8))
                    {
                        if (!(inputPos < inputPosBound ))
                        {
                            return 0;
                        }

                        ofs = (inputBuffer[inputPos] & 0xFF) << 8;
                        inputPos++;

                        ofs += (inputBuffer[inputPos] & 0xFF);
                        inputPos++;

                        ref = outputPos - ofs - MAX_L2_DISTANCE - 1;
                    }
                }

                if (!((outputPos + len) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!(ref >= 0))
                {
                    return 0;
                }

                flz_copy(outputBuffer, outputPos, outputBuffer, ref, len);
                outputPos += len;
            }
            else
            {
                ctrlCode++;
                if (!((outputPos + ctrlCode) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!((inputPos + ctrlCode) <= inputBuffer.length))
                {
                    return 0;
                }

                flz_copy(outputBuffer, outputPos, inputBuffer, inputPos, ctrlCode);
                inputPos += ctrlCode;
                outputPos += ctrlCode;
            }

            if (inputPos >= inputBuffer.length)
                break;

            ctrlCode = inputBuffer[inputPos] & 0xFF;
            inputPos++;
        }

        return outputPos;
    }

    public static class DecompressionState
    {
        private int inputPos = -1;
        private int outputPos = -1;
        private int ctrlCode = -1;
        private int compressionLevel = -1;

        private int totalCompressedLen = -1;
        private int expectedDecompressionLen = -1;

        DecompressionState(int totalCompressedLen, int expectedDecompressionLen) throws Exception
        {
            this.totalCompressedLen = totalCompressedLen;
            this.expectedDecompressionLen = expectedDecompressionLen;

            if (this.totalCompressedLen <= 0 && this.expectedDecompressionLen <= 0)
            {
                throw new Exception("Either totalCompressedLen " + totalCompressedLen 
                                  + " or expectedDecompressionLen " + expectedDecompressionLen
                                  + " must be greater than 0 for successful decompression.");
            }
        }

        public int getDecompressedDataLen()
        {
            return outputPos;
        }
    };

    static boolean fastlz2_decompress_streaming(DecompressionState state, byte[] inputBuffer, int availableCompressedLen, byte[] outputBuffer)
    {
        if (availableCompressedLen < 3)
        {
            return false;
        }

        // Initialize
        boolean needsInit = state.inputPos < 0;
        if (needsInit)
        {
            state.inputPos = 0;
            state.outputPos = 0;
            state.ctrlCode = 0;

            state.ctrlCode = inputBuffer[state.inputPos] & 31;
            state.inputPos++;
        }

        // Intermediate state will be applied to decompression state after successfully 
        // decompressing a sequence of bytes
        int inputPos = state.inputPos;
        int outputPos = state.outputPos;
        int ctrlCode = state.ctrlCode;

        int inputPosBound = availableCompressedLen - 2;
        if (!(inputPos <= inputPosBound))
        {
            return false;
        }

        while (true)
        {
            inputPos = state.inputPos;
            outputPos = state.outputPos;
            ctrlCode = state.ctrlCode;

            if (ctrlCode >= 32)
            {
                int len = (ctrlCode >> 5) - 1;
                int ofs = (ctrlCode & 31) << 8;
                int ref = outputPos - ofs - 1;

                int code = 0;
                if (len == 7 - 1)
                {
                    do
                    {
                        // We don't have enough data to keep decompressing exit without updating state
                        if (!(inputPos <= inputPosBound))
                        {
                            return false;
                        }

                        code = (inputBuffer[inputPos] & 0xFF);
                        inputPos++;

                        len += code;
                    } while (code == 255);
                }

                code = (inputBuffer[inputPos] & 0xFF);
                inputPos++;

                ref -= code;
                len += 3;

                // match from 16-bit distance
                if (code == 255)
                {
                    if (ofs == (31 << 8))
                    {
                        // We don't have enough data to keep decompressing exit without updating state
                        if (!(inputPos < inputPosBound))
                        {
                            return false;
                        }

                        ofs = (inputBuffer[inputPos] & 0xFF) << 8;
                        inputPos++;

                        ofs += (inputBuffer[inputPos] & 0xFF);
                        inputPos++;

                        ref = outputPos - ofs - MAX_L2_DISTANCE - 1;
                    }
                }

                flz_copy(outputBuffer, outputPos, outputBuffer, ref, len);
                outputPos += len;
            }
            else
            {
                ctrlCode++;

                // Roll back here if we don't have enough data in the buffer
                if ((inputPos + ctrlCode) > availableCompressedLen)
                {
                    return false;
                }

                flz_copy(outputBuffer, outputPos, inputBuffer, inputPos, ctrlCode);
                inputPos += ctrlCode;
                outputPos += ctrlCode;
            }

            // Apply decompression state
            state.inputPos = inputPos;
            state.outputPos = outputPos;
            state.ctrlCode = ctrlCode;

            // We have finished decompressing
            if (state.inputPos >= state.totalCompressedLen
            || state.outputPos >= state.expectedDecompressionLen)
                break;

            state.ctrlCode = inputBuffer[state.inputPos] & 0xFF;
            state.inputPos++;

            // We don't have enough data to keep decompressing exit
            if (!(state.inputPos < inputPosBound))
            {
                return false;
            }
        }

        // We have finished decompressing
        return true;
    }

    public static int compress(byte[] input, byte[] output)
    {
        // for short block, choose fastlz1
        if (input.length < 65536)
            return fastlz1_compress(input, output);
        else
            return fastlz2_compress(input, output);
    }

    public static int decompress(byte[] input, int inputLength, byte[] output)
    {
        // magic identifier for compression level
        int level = (input[0] >> 5) + 1;

        if (level == 1) return fastlz1_decompress(input, inputLength, output);
        if (level == 2) return fastlz2_decompress(input, inputLength, output);

        // unknown level, trigger error
        return 0;
    }

    public static boolean decompress_streaming(DecompressionState state, byte[] input, int inputAvailableLength, byte[] output) throws Exception
    {
        if (input.length < 1)
            return false;

        // magic identifier for compression level
        if (state.compressionLevel < 0)
        {
            state.compressionLevel = (input[0] >> 5) + 1;
        }

        // For small blocks of compression wait until we have the entire block and then decompress all at once
        if (state.compressionLevel == 1)
        {
            if (state.totalCompressedLen > 0)
            {
                if (inputAvailableLength < state.totalCompressedLen)
                    return false;

                state.outputPos = fastlz1_decompress(input, inputAvailableLength, output);
                state.inputPos = state.totalCompressedLen;

                return true;
            }
            else
            {
                // We don't have a total compressed len available so attempt to decompress
                // If we don't get the expected decompression len bail

                state.outputPos = fastlz1_decompress(input, inputAvailableLength, output);
                if (state.outputPos >= state.expectedDecompressionLen)
                {
                    state.inputPos = inputAvailableLength;
                    return true;
                }

                state.outputPos = 0;
                return false;
            }
        }

        if (state.compressionLevel == 2)
        {
            return fastlz2_decompress_streaming(state, input, inputAvailableLength, output);
        }

        // unknown level, trigger error
        throw new Exception("FastLZ: Streaming decompresssion, unknown compression level: " + state.compressionLevel);
    }

    public static int compress_level(int level, byte[] input, byte[] output)
    {
        if (level == 1) return fastlz1_compress(input, output);
        if (level == 2) return fastlz2_compress(input, output);

        return 0;
    }
}
