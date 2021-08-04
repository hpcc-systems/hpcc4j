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

package org.hpccsystems.commons.fastlz;

public class FastLZ
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

    static int flz1_match(int len, int distance, byte[] opBuffer, int op)
    {
        --distance;
        if (len > MAX_LEN - 2)
        {
            while (len > MAX_LEN - 2)
            {
                opBuffer[op] = (byte) ((7 << 5) + (distance >> 8));
                op++;

                opBuffer[op] = (byte) (MAX_LEN - 2 - 7 - 2);
                op++;
                
                opBuffer[op] = (byte) (distance & 255);
                op++;

                len -= MAX_LEN - 2;
            }
        }

        if (len < 7)
        {
            opBuffer[op] = (byte) ((len << 5) + (distance >> 8));
            op++;
            
            opBuffer[op] = (byte) (distance & 255);
            op++;
        }
        else
        {
            opBuffer[op] = (byte) ((7 << 5) + (distance >> 8));
            op++;

            opBuffer[op] = (byte) (len - 7);
            op++;

            opBuffer[op] = (byte) (distance & 255);
            op++;
        }
        return op;
    }

    static int flz2_match(long len, long distance, byte[] opBuffer, int op)
    {
        --distance;
        if (distance < MAX_L2_DISTANCE)
        {
            if (len < 7)
            {
                opBuffer[op] = (byte) ((len << 5) + (distance >> 8));
                op++;
                
                opBuffer[op] = (byte) (distance & 255);
                op++;
            }
            else
            {
                opBuffer[op] = (byte) ((7 << 5) + (distance >> 8));
                op++;

                for (len -= 7; len >= 255; len -= 255)
                {
                    opBuffer[op] = (byte) 255;
                    op++;
                }

                opBuffer[op] = (byte) len;
                op++;

                opBuffer[op] = (byte) (distance & 255);
                op++;
            }
        }
        else
        {
            /* far away, but not yet in the another galaxy... */
            if (len < 7)
            {
                distance -= MAX_L2_DISTANCE;

                opBuffer[op] = (byte) ((len << 5) + 31);
                op++;
                
                opBuffer[op] = (byte) 255;
                op++;
                
                opBuffer[op] = (byte) (distance >> 8);
                op++;

                opBuffer[op] = (byte) (distance & 255);
                op++;
            }
            else
            {
                distance -= MAX_L2_DISTANCE;
                opBuffer[op] = (byte) ((7 << 5) + 31);
                op++;

                for (len -= 7; len >= 255; len -= 255)
                {
                    opBuffer[op] = (byte) 255;
                    op++;
                }
                
                opBuffer[op] = (byte) len;
                op++;
                
                opBuffer[op] = (byte) 255;
                op++;
                
                opBuffer[op] = (byte) (distance >> 8);
                op++;

                opBuffer[op] = (byte) (distance & 255);
                op++;
            }
        }
        return op;
    }

    static int fastlz1_compress(byte[] input, byte[] output) 
    {
        int ip = 0;
        int ip_start = ip;
        int ip_bound = ip + input.length - 4; // because readU32
        int ip_limit = ip + input.length - 12 - 1;

        int op = 0;

        long[] htab = new long[HASH_SIZE];
        long seq, hash;

        /* initializes hash table */
        for (hash = 0; hash < HASH_SIZE; ++hash)
        {
            htab[(int) hash] = 0;
        }

        /* we start with literal copy */
        int anchor = ip;
        ip += 2;

        /* main loop */
        while (ip < ip_limit)
        {
            int ref = 0;
            int distance;
            long cmp;

            /* find potential match */
            do
            {
                seq = (flz_readu32(input, ip) & 0xffffffL);
                hash = flz_hash(seq);
                ref = (int) (ip_start + htab[(int) hash]);
                htab[(int) hash] = ip - ip_start;
                distance = ip - ref;
                cmp = distance < (long) MAX_L1_DISTANCE ? (flz_readu32(input,ref) & 0xffffffL) : 0x1000000L;

                if (ip >= ip_limit)
                    break;

                ++ip;
            } while (seq != cmp);

            if (ip >= ip_limit)
                break;

            --ip;

            if (ip > anchor)
            {
                op = flz_literals(ip - anchor, input, anchor, output, op);
            }

            int len = flz_cmp(input, (ref + 3), input, ip + 3, ip_bound);
            op = flz1_match(len, distance, output, op);

            /* update the hash at match boundary */
            ip += len;
            seq = flz_readu32(input, ip);
            hash = flz_hash(seq & 0xffffffL);
            htab[(int) hash] = ip++ - ip_start;
            seq >>= 8;
            hash = flz_hash(seq);
            htab[(int) hash] = ip++ - ip_start;

            anchor = ip;
        }

        int copy = input.length - anchor;
        op = flz_finalize(copy, input, anchor, output, op);

        return op;
    }

    static int fastlz1_decompress(byte[] inputBuffer, int compressedLen, byte[] outputBuffer)
    {
        int ip = 0;
        int ip_bound = compressedLen -2;

        int op = 0;
        int ctrl = inputBuffer[ip] & 31;
        ip++;

        while (true)
        {
            if (ctrl >= 32) 
            {
                int len = (ctrl >> 5) - 1;
                int ofs = (ctrl & 31) << 8;

                int ref = op - ofs - 1;
                if (len == 7 - 1)
                {
                    if (!(ip <= ip_bound ))
                    {
                        return 0;
                    }

                    len += (inputBuffer[ip] & 0xFF);
                    ip++;
                }

                ref -= inputBuffer[ip] & 0xFF;
                ip++;

                len += 3;

                if (!((op + len) < outputBuffer.length))
                {
                    return 0;
                }

                if (!(ref >= 0))
                {
                    return 0;
                }

                flz_copy(outputBuffer, op, outputBuffer, ref, len);
                op += len;
            }
            else
            {
                ctrl++;
                if (!((op + ctrl) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!((ip + ctrl) <= inputBuffer.length))
                {
                    return 0;
                }

                flz_copy(outputBuffer, op, inputBuffer, ip, ctrl);
                ip += ctrl;
                op += ctrl;
            }

            if (ip > ip_bound)
            {
                break;
            }

            ctrl = (inputBuffer[ip] & 0xFF);
            ip++;
        }

        return op;
    }

    static int fastlz2_compress(byte[] input, byte[] output)
    {
        int ip = 0;
        int op = 0; 

        int ip_bound = ip + input.length - 4;
        int ip_limit = ip + input.length - 12 - 1;

        long[] htab = new long[HASH_SIZE];
        long seq, hash;

        // initializes hash table
        for (hash = 0; hash < HASH_SIZE; ++hash)
        {
            htab[(int) hash] = 0L;
        }

        // we start with literal copy
        int anchor = ip;
        ip += 2;

        // main loop
        while (ip < ip_limit)
        {
            int ref = 0;
            int distance;
            long cmp;

            // find potential match
            do
            {
                seq = flz_readu32(input, ip) & 0xffffffL;
                hash = flz_hash(seq);
                ref = (int) htab[(int) hash];
                htab[(int) hash] = ip;
                distance = ip - ref;
                cmp = (distance < MAX_FARDISTANCE) ? flz_readu32(input,ref) & 0xffffffL : 0x1000000L;

                if (ip >= ip_limit)
                    break;
                ++ip;
            } while (seq != cmp);

            if (ip >= ip_limit)
                break;

            --ip;

            // far, needs at least 5-byte match
            if (distance >= MAX_L2_DISTANCE)
            {
                if (input[ref+3] != input[ip+3] || input[ref+4] != input[ip+4])
                {
                    ++ip;
                    continue;
                }
            }

            if (ip > anchor)
            {
                op = flz_literals(ip - anchor, input, anchor, output, op);
            }

            int len = flz_cmp(input, (ref + 3), input, (ip + 3), ip_bound);
            op = flz2_match(len, distance, output, op);

            // update the hash at match boundary
            ip += len;
            seq = flz_readu32(input,ip);
            hash = flz_hash(seq & 0xffffffL);
            htab[(int) hash] = ip++;
            seq >>= 8;

            hash = flz_hash(seq);
            htab[(int) hash] = ip++;

            anchor = ip;
        }

        int copy = input.length - anchor;
        op = flz_finalize(copy, input, anchor, output, op);

        // marker for fastlz2
        output[0] |= (1 << 5);

        return op;
    }

    static int fastlz2_decompress(byte[] inputBuffer, int compressedLen, byte[] outputBuffer)
    {
        int ip = 0;
        int ip_bound = compressedLen -2;

        int op = 0;
        int ctrl = inputBuffer[ip] & 31;
        ip++;

        while (true)
        {
            if (ctrl >= 32)
            {
                int len = (ctrl >> 5) - 1;
                int ofs = (ctrl & 31) << 8;
                int ref = op - ofs - 1;

                int code = 0;
                if (len == 7 - 1)
                {
                    do
                    {
                        if (!(ip <= ip_bound ))
                        {
                            return 0;
                        }

                        code = (inputBuffer[ip] & 0xFF);
                        ip++;

                        len += code;
                    } while (code == 255);
                }
                code = (inputBuffer[ip] & 0xFF);
                ip++;

                ref -= code;
                len += 3;

                // match from 16-bit distance
                if (code == 255)
                {
                    if (ofs == (31 << 8))
                    {
                        if (!(ip < ip_bound ))
                        {
                            return 0;
                        }

                        ofs = (inputBuffer[ip] & 0xFF) << 8;
                        ip++;

                        ofs += (inputBuffer[ip] & 0xFF);
                        ip++;

                        ref = op - ofs - MAX_L2_DISTANCE - 1;
                    }
                }

                if (!((op + len) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!(ref >= 0))
                {
                    return 0;
                }

                flz_copy(outputBuffer, op, outputBuffer, ref, len);
                op += len;
            }
            else
            {
                ctrl++;
                if (!((op + ctrl) <= outputBuffer.length))
                {
                    return 0;
                }

                if (!((ip + ctrl) <= inputBuffer.length))
                {
                    return 0;
                }

                flz_copy(outputBuffer, op, inputBuffer, ip, ctrl);
                ip += ctrl;
                op += ctrl;
            }

            if (ip >= inputBuffer.length)
                break;

            ctrl = inputBuffer[ip] & 0xFF;
            ip++;
        }

        return op;
    }

    public static class DecompressionState
    {
        private int ip = -1;
        private int op = -1;
        private int ctrl = -1;
        private int compressionLevel = -1;

        private int totalCompressedLen = -1;
        private int expectedDecompressionLen = -1;

        DecompressionState(int totalCompressedLen, int expectedDecompressionLen) throws Exception
        {
            this.totalCompressedLen = totalCompressedLen;
            this.expectedDecompressionLen = expectedDecompressionLen;

            if (this.totalCompressedLen <= 0 && this.expectedDecompressionLen <= 0)
            {
                throw new Exception("Either totalCompressedLen or expectedDecompressionLen must be greater than 0 for successfull decompression.");
            }
        }

        public int getDecompressedDataLen()
        {
            return op;
        }
    };

    static boolean fastlz2_decompress_streaming(DecompressionState state, byte[] inputBuffer, int availableCompressedLen, byte[] outputBuffer)
    {
        if (availableCompressedLen < 3)
        {
            return false;
        }

        // Initialize
        boolean needsInit = state.ip < 0;
        if (needsInit)
        {
            state.ip = 0;
            state.op = 0;
            state.ctrl = 0;

            state.ctrl = inputBuffer[state.ip] & 31;
            state.ip++;
        }

        // Intermediate state will be applied to decompression state after successfully 
        // decompressing a sequence of bytes
        int ip = state.ip;
        int op = state.op;
        int ctrl = state.ctrl;

        int ip_bound = availableCompressedLen - 2;
        if (!(ip <= ip_bound))
        {
            return false;
        }

        while (true)
        {
            ip = state.ip;
            op = state.op;
            ctrl = state.ctrl;

            if (ctrl >= 32)
            {
                int len = (ctrl >> 5) - 1;
                int ofs = (ctrl & 31) << 8;
                int ref = op - ofs - 1;

                int code = 0;
                if (len == 7 - 1)
                {
                    do
                    {
                        // We don't have enough data to keep decompressing exit without updating state
                        if (!(ip <= ip_bound))
                        {
                            return false;
                        }

                        code = (inputBuffer[ip] & 0xFF);
                        ip++;

                        len += code;
                    } while (code == 255);
                }

                code = (inputBuffer[ip] & 0xFF);
                ip++;

                ref -= code;
                len += 3;

                // match from 16-bit distance
                if (code == 255)
                {
                    if (ofs == (31 << 8))
                    {
                        // We don't have enough data to keep decompressing exit without updating state
                        if (!(ip < ip_bound))
                        {
                            return false;
                        }

                        ofs = (inputBuffer[ip] & 0xFF) << 8;
                        ip++;

                        ofs += (inputBuffer[ip] & 0xFF);
                        ip++;

                        ref = op - ofs - MAX_L2_DISTANCE - 1;
                    }
                }

                flz_copy(outputBuffer, op, outputBuffer, ref, len);
                op += len;
            }
            else
            {
                ctrl++;

                // Roll back here if we don't have enough data in the buffer
                if ((ip + ctrl) > availableCompressedLen)
                {
                    return false;
                }

                flz_copy(outputBuffer, op, inputBuffer, ip, ctrl);
                ip += ctrl;
                op += ctrl;
            }

            // Apply decompression state
            state.ip = ip;
            state.op = op;
            state.ctrl = ctrl;

            // We have finished decompressing
            if (state.ip >= state.totalCompressedLen
            || state.op >= state.expectedDecompressionLen)
                break;

            state.ctrl = inputBuffer[state.ip] & 0xFF;
            state.ip++;

            // We don't have enough data to keep decompressing exit
            if (!(state.ip < ip_bound))
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

        // else...
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

                state.op = fastlz1_decompress(input, inputAvailableLength, output);
                state.ip = state.totalCompressedLen;

                return true;
            }
            else
            {
                // We don't have a total compressed len available so attempt to decompress
                // If we don't get the expected decompression len bail

                state.op = fastlz1_decompress(input, inputAvailableLength, output);
                if (state.op >= state.expectedDecompressionLen)
                {
                    state.ip = inputAvailableLength;
                    return true;
                }

                state.op = 0;
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
