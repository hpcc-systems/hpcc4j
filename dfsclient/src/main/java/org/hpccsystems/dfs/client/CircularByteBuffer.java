/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2025 HPCC Systems®.
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

public class CircularByteBuffer
{
    private final byte[] buffer;
    private int readPos = 0;
    private int writePos = 0;
    private int markPos = -1;
    private int bytesReadAfterMark = 0;
    private int currentNumberOfBytes = 0;

    /**
     * Instantiates a new circular byte buffer.
     * 
     * @param bufferSize the buffer size
     * @throws IllegalArgumentException if buffer size is less than or equal to 0
     */
    public CircularByteBuffer(int bufferSize) throws IllegalArgumentException
    {
        if (bufferSize <= 0)
        {
            throw new IllegalArgumentException("Buffer size must be greater than 0");
        }

        buffer = new byte[bufferSize];
    }

    /**
     * Gets the number of bytes available in the buffer.
     * 
     * @return aviailable bytes
     */
    public int getBytesAvailable()
    {
        // We only adjust for the mark internally and when providing information about available space
        return currentNumberOfBytes;
    }

    /**
     * Checks if the buffer has space.
     * 
     * @return true, if successful
     */
    public boolean hasSpace()
    {
        return getFreeSpace() > 0;
    }

    /**
     * Gets the free space in the buffer.
     * 
     * @return the free space 
     */
    public int getFreeSpace()
    {
        int adjustedByteCount = currentNumberOfBytes;
        if (markPos >= 0)
        {
            adjustedByteCount += bytesReadAfterMark;
        }

        return buffer.length - adjustedByteCount;
    }

    /**
     * Gets the contiguous free space in the buffer.
     * 
     * @return the contiguous free space
     */
    public int getContiguousFreeSpace()
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

    /**
     * Gets the location of the next write.
     * 
     * @return the write offset
     */
    public int getWriteOffset()
    {
        return writePos;
    }

    /**
     * Increments write offset.
     * 
     * @param increment number of bytes to increment
     * @return the number of bytes incremented
     */
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

    /**
     * Adds the bytes to the buffer.
     * 
     * @param srcBuffer the source buffer
     * @param offset the offset within the source buffer
     * @param length the length of bytes to add
     * @return the number of bytes added
     */
    public int add(final byte[] srcBuffer, int offset, int length)
    {
        if (currentNumberOfBytes + length > buffer.length)
        {
            length = buffer.length - currentNumberOfBytes;
        }

        for (int i = 0; i < length; i++)
        {
            buffer[writePos] = srcBuffer[offset + i];
            if (++writePos == buffer.length)
            {
                writePos = 0;
            }
        }
        currentNumberOfBytes += length;
        return length;
    }

    /**
     * Reads a byte from the buffer.
     * 
     * @return the byte read as an int [0-255] or -1 if no bytes are available
     */
    public int read()
    {
        if (currentNumberOfBytes <= 0)
        {
            return -1;
        }

        byte b = buffer[readPos];
        currentNumberOfBytes--;

        if (markPos >= 0)
        {
            bytesReadAfterMark++;
        }
        
        if (++readPos >= buffer.length)
        {
            readPos = 0;
        }

        int ret = b;
        return ret + 128;
    }

    /**
     * Reads bytes from the buffer.
     * 
     * @param targetBuffer the target buffer to write to
     * @param targetOffset the target offset within the target buffer
     * @param length the number of bytes to read
     * @return the number of bytes read
     */
    public int read(final byte[] targetBuffer, int targetOffset, int length)
    {
        if (length > currentNumberOfBytes)
        {
            length = currentNumberOfBytes;
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

        return length;
    }

    /**
     * Gets the internal buffer.
     * 
     * @return the internal buffer
     */
    public byte[] getInternalBuffer()
    {
        return buffer;
    }

    /**
     * Marks the current read position, allowing a reset to return to this position.
     * 
     * @param readLim the read limit before a reset is no longer allowed
     * @throws IllegalArgumentException if read limit exceeds available bytes
     */
    public void mark(int readLim) throws IllegalArgumentException
    {
        if (readLim > buffer.length)
        {
            throw new IllegalArgumentException("Read limit exceeds available bytes");
        }

        markPos = readPos;
        bytesReadAfterMark = 0;
    }

    /**
     * Resets the read position to the last marked position.
     */
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

    /**
     * Skips the specified number of bytes.
     * 
     * @param n the number of bytes to skip
     * @return the number of bytes skipped
     */
    public int skip(int n)
    {
        if (n > currentNumberOfBytes)
        {
            n = currentNumberOfBytes;
        }

        readPos += n;
        if (readPos >= buffer.length)
        {
            readPos -= buffer.length;
        }

        currentNumberOfBytes -= n;
        if (markPos >= 0)
        {
            bytesReadAfterMark += n;
        }
        return n;
    }
};