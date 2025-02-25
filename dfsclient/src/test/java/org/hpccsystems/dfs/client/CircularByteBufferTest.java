/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2025 HPCC Systems®.
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

package org.hpccsystems.dfs.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.hpccsystems.dfs.client.FileUtility;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class CircularByteBufferTest extends BaseRemoteTest
{
    @Test
    public void spaceTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(10, cbb.getFreeSpace());
        assertEquals(10, cbb.getContiguousFreeSpace());
    }

    @Test
    public void addTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(10, cbb.getFreeSpace());
        assertEquals(10, cbb.getContiguousFreeSpace());

        byte[] data = new byte[5];
        try
        {
            cbb.add(data, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(5, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(5, cbb.getFreeSpace());
        assertEquals(5, cbb.getContiguousFreeSpace());
    }

    @Test
    public void readTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(10, cbb.getFreeSpace());
        assertEquals(10, cbb.getContiguousFreeSpace());

        byte[] data = new byte[5];
        try
        {
            cbb.add(data, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(5, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(5, cbb.getFreeSpace());
        assertEquals(5, cbb.getContiguousFreeSpace());

        byte[] readData = new byte[5];
        try
        {
            cbb.read(readData, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(0, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(10, cbb.getFreeSpace());
        assertEquals(5, cbb.getContiguousFreeSpace());
    }

    @Test
    public void markResetTest()
    {
        CircularByteBuffer cbb = new CircularByteBuffer(10);
        assertEquals(0, cbb.getBytesAvailable());
        assertEquals(true, cbb.hasFreeSpace());
        assertEquals(10, cbb.getFreeSpace());
        assertEquals(10, cbb.getContiguousFreeSpace());

        byte[] data = new byte[10];
        try
        {
            cbb.add(data, 0, data.length);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }
        assertEquals(10, cbb.getBytesAvailable());
        assertEquals(false, cbb.hasFreeSpace());
        assertEquals(0, cbb.getFreeSpace());
        assertEquals(0, cbb.getContiguousFreeSpace());

        cbb.mark(10);

        byte[] readData = new byte[5];
        try
        {
            cbb.read(readData, 0, 5);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        assertEquals(5, cbb.getBytesAvailable());
        assertEquals(false, cbb.hasFreeSpace());
        assertEquals(0, cbb.getFreeSpace());
        assertEquals(0, cbb.getContiguousFreeSpace());

        cbb.reset();
        assertEquals(10, cbb.getBytesAvailable());
        assertEquals(false, cbb.hasFreeSpace());
        assertEquals(0, cbb.getFreeSpace());
        assertEquals(0, cbb.getContiguousFreeSpace());
    }

    @Test
    public void wrappingReadTest()
    {
        byte[] expectedData = (new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mauris nulla, semper a vehicula sed, pulvinar non purus quam.")).getBytes();

        CircularByteBuffer cbb = new CircularByteBuffer(64);

        int numBytesToWrite = expectedData.length;
        try
        {
            int offset = expectedData.length - numBytesToWrite;
            int bytesToWrite = Math.min(cbb.getFreeSpace(), numBytesToWrite);
            cbb.add(expectedData, offset, bytesToWrite);
            numBytesToWrite -= bytesToWrite;
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        cbb.mark(32);
        cbb.skip(16);
        cbb.reset();

        byte[] readData = new byte[expectedData.length];
        int numBytesToRead = readData.length;
        try
        {
            int offset = readData.length - numBytesToRead;
            int bytesToRead = Math.min(cbb.getBytesAvailable(), numBytesToRead);
            cbb.read(readData, offset, bytesToRead);
            numBytesToRead -= bytesToRead;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        // Second write
        try
        {
            int offset = expectedData.length - numBytesToWrite;
            int bytesToWrite = Math.min(cbb.getFreeSpace(), numBytesToWrite);
            cbb.add(expectedData, offset, bytesToWrite);
            numBytesToWrite -= bytesToWrite;
        } 
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        cbb.mark(32);
        cbb.skip(16);
        cbb.reset();

        // Second read
        try
        {
            int offset = readData.length - numBytesToRead;
            int bytesToRead = Math.min(cbb.getBytesAvailable(), numBytesToRead);
            cbb.read(readData, offset, bytesToRead);
            numBytesToRead -= bytesToRead;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail();
        }

        if (!Arrays.equals(expectedData, readData))
        {
            fail();
        }
    }

    @Test
    public void concurrentReaderWriterTest()
    {
        // Write to the buffer from one thread, read from the buffer from another thread, compare the results in a loop 1000 times
        CircularByteBuffer cbb = new CircularByteBuffer(61);

        // Lorem ipsum
        int numIterations = 1000;
        byte[] expectedData = (new String("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mauris nulla, semper a vehicula sed, pulvinar non purus quam.")).getBytes();
    
        Exception[] workerExceptions = new Exception[2];
        Thread writer = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < numIterations; i++)
                {
                    try
                    {
                        int numBytesRemaining = expectedData.length;
                        while (numBytesRemaining > 0)
                        {
                            int offset = expectedData.length - numBytesRemaining;
                            int bytesToWrite = 0;
                            synchronized (cbb)
                            {
                                bytesToWrite = Math.min(cbb.getFreeSpace(), numBytesRemaining);
                                cbb.add(expectedData, offset, bytesToWrite);
                            }

                            if (bytesToWrite == 0)
                            {
                                Thread.sleep(1);
                            }

                            numBytesRemaining -= bytesToWrite;
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        workerExceptions[0] = e;
                        return;
                    }
                }
            }
        });

        Thread reader = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < numIterations; i++)
                {
                    byte[] readData = new byte[expectedData.length];

                    synchronized (cbb)
                    {
                        cbb.mark(32);
                        cbb.skip(16);
                        cbb.reset();
                    }

                    int numBytesRemaining = readData.length;
                    try
                    {
                        while (numBytesRemaining > 0)
                        {
                            int offset = readData.length - numBytesRemaining;
                            int bytesToRead = 0;
                            synchronized (cbb)
                            {
                                bytesToRead = Math.min(cbb.getBytesAvailable(), numBytesRemaining);
                                cbb.read(readData, offset, bytesToRead);
                            }
                            numBytesRemaining -= bytesToRead;

                            if (bytesToRead == 0)
                            {
                                Thread.sleep(1);
                            }
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                        workerExceptions[1] = e;
                        return;
                    }

                    if (!Arrays.equals(expectedData, readData))
                    {
                        workerExceptions[1] = new Exception("Data mismatch");
                        return;
                    }
                }
            }
        });

        writer.start();
        reader.start();

        try
        {
            writer.join();
            reader.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
            fail();
        }

        if (workerExceptions[0] != null)
        {
            workerExceptions[0].printStackTrace();
            fail();
        }

        if (workerExceptions[1] != null)
        {
            workerExceptions[1].printStackTrace();
            fail();
        }
    }
}
 