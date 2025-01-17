/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/

package org.hpccsystems.dfs.client;

import java.io.IOException;

public class CircularByteBuffer
{
    private final byte[] buffer;
    private int readPos = 0;
    private int writePos = 0;
    private int markPos = 0;
    private int bytesReadAfterMark = 0;
    private int currentNumberOfBytes = 0;

    public CircularByteBuffer(int bufferSize)
    {
        buffer = new byte[bufferSize];
    }

    public int getCurrentNumberOfBytes()
    {
        // We only adjust for the mark internally and when providing information about available space
        return currentNumberOfBytes;
    }

    public boolean hasSpace()
    {
        return getSpace() > 0;
    }

    public int getSpace()
    {
        int adjustedByteCount = currentNumberOfBytes;
        if (markPos >= 0)
        {
            adjustedByteCount += bytesReadAfterMark;
        }

        return buffer.length - adjustedByteCount;
    }

    public int getContiguousSpace()
    {
        if (!hasSpace())
        {
            return 0;
        }

        // If we have a marked position we don't want to allow that space to be written to until after reset has been called
        int rPos = readPos;
        if (markPos >= 0)
        {
            rPos = markPos;
        }

        if (writePos >= rPos)
        {
            return buffer.length - writePos;
        }
        else
        {
            return rPos - writePos;
        }
    }

    public int getWriteOffset()
    {
        return writePos;
    }

    public int incrementWriteOffset(int increment)
    {
        int maxIncrement = buffer.length - writePos;
        increment = Math.min(increment, maxIncrement);

        writePos += increment;
        if (writePos >= buffer.length)
        {
            writePos = 0;
        }

        currentNumberOfBytes += increment;
        return increment;
    }

    public void add(final byte[] targetBuffer, final int offset, final int length) throws IOException 
    {
        if (currentNumberOfBytes + length > buffer.length)
        {
            throw new IOException("Not enough space available");
        }

        for (int i = 0; i < length; i++)
        {
            buffer[writePos] = targetBuffer[offset + i];
            if (++writePos == buffer.length)
            {
                writePos = 0;
            }
        }
        currentNumberOfBytes += length;
    }

    public byte read() throws IOException
    {
        if (currentNumberOfBytes <= 0)
        {
            throw new IOException("No bytes available to read");
        }

        byte b = buffer[readPos];
        currentNumberOfBytes--;

        if (markPos >= 0)
        {
            bytesReadAfterMark++;
        }
        
        readPos++;
        if (readPos >= buffer.length)
        {
            readPos = 0;
        }

        return b;
    }

    public void read(final byte[] targetBuffer, final int targetOffset, final int length) throws IOException
    {
        if (length > currentNumberOfBytes)
        {
            throw new IOException("Not enough bytes available to read");
        }

        if (readPos + length <= buffer.length)
        {
            System.arraycopy(buffer, readPos, targetBuffer, targetOffset, length);
        }
        else
        {
            int firstCopyLength = buffer.length - readPos;
            System.arraycopy(buffer, readPos, targetBuffer, targetOffset, firstCopyLength);
            System.arraycopy(buffer, 0, targetBuffer, targetOffset + firstCopyLength, length - firstCopyLength);
        }

        readPos += length;
        if (readPos >= buffer.length)
        {
            readPos -= buffer.length;
        }

        currentNumberOfBytes -= length;
        if (markPos >= 0)
        {
            bytesReadAfterMark += length;
        }
    }

    public byte[] getInternalBuffer()
    {
        return buffer;
    }

    public void mark(int readLim) throws IllegalArgumentException
    {
        if (readLim > buffer.length)
        {
            throw new IllegalArgumentException("Read limit exceeds available bytes");
        }

        markPos = readPos;
        bytesReadAfterMark = 0;
    }

    public void reset()
    {
        if (markPos < 0)
        {
            return;
        }

        currentNumberOfBytes += bytesReadAfterMark;

        readPos = markPos;
        markPos = -1;
        bytesReadAfterMark = 0;
    }

    public long skip(long n) throws IOException
    {
        if (n > currentNumberOfBytes)
        {
            throw new IOException("Not enough bytes available to skip");
        }

        readPos += n;
        if (readPos >= buffer.length)
        {
            readPos -= buffer.length;
        }

        currentNumberOfBytes -= n;
        return n;
    }
};