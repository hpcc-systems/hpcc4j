/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
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
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.InputStream;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.network.Network;

import org.hpccsystems.dfs.client.CompileTimeConstants;

/**
 * The connection to a specific THOR node for a specific file part.
 *
 */
public class RowServiceInputStream extends InputStream
{
    private AtomicBoolean            active = new AtomicBoolean(false);
    private AtomicBoolean            closed = new AtomicBoolean(false);
    private boolean                  simulateFail;
    private boolean                  forceHandleUse = false;
    private byte[]                   cursorBin;
    private int                      handle;
    private DataPartition            dataPart;
    private FieldDef                 recordDefinition              = null;
    private String                   jsonRecordDefinition          = null;
    private FieldDef                 projectedRecordDefinition     = null;
    private String                   projectedJsonRecordDefinition = null;
    private java.io.DataInputStream  dis;
    private java.io.DataOutputStream dos;

    private int                      filePartCopyIndexPointer = 0;  //pointer into the prioritizedCopyIndexes struct
    private List<Integer>            prioritizedCopyIndexes = new ArrayList<Integer>();
    
    private Thread                   prefetchThread = null;
    private HpccFileException        prefetchException = null;

    // This Semaphore only has one permit. Calling it a mutex for clarity
    private final Semaphore          bufferWriteMutex = new Semaphore(1);

    private byte[]                   readBuffer;
    private AtomicInteger            readBufferCapacity = new AtomicInteger(0);
    private AtomicInteger            readBufferDataLen = new AtomicInteger(0);
    private int                      readPos = 0;
    private int                      markPos = -1;
    private int                      readLimit = -1;
    private int                      recordLimit = -1;

    private int                      remainingDataInCurrentRequest = 0;
    private long                     streamPos = 0;

    private long                     firstByteTimeNS = -1;
    private long                     mutexWaitTimeNS = 0;
    private long                     waitTimeNS = 0;
    private long                     sleepTimeNS = 0;
    private long                     fetchStartTimeNS = 0;
    private long                     fetchTimeNS = 0;
    private long                     fetchFinishTimeNS = 0;
    private long                     closeTimeNS = 0;
    private int                      numLongWaits = 0;
    private int                      numFetches = 0;
    private long                     numPartialBlockReads = 0;
    private long                     numBlockReads = 0;

    private Socket                   sock;
    public static final int          DEFAULT_CONNECT_TIMEOUT_MILIS = 5000; // 5 second connection timeout
    private int                      connectTimeout = DEFAULT_CONNECT_TIMEOUT_MILIS;

    private static final Charset     HPCCCharSet                   = Charset.forName("ISO-8859-1");

    // Note: The platform may respond with more data than this if records are larger than this limit.
    private static final int         DEFAULT_MAX_READ_SIZE_KB = 4096;
    private static final int         PREFETCH_SLEEP_MS        = 1;
    private static final int         LONG_WAIT_THRESHOLD_US   = 100;

    private static final Logger      log                           = LogManager.getLogger(RowServiceInputStream.class);
    
    private int maxReadSizeKB = DEFAULT_MAX_READ_SIZE_KB;
    
    // Buffer compact threshold should always be smaller than buffer prefetch threshold
    private int bufferPrefetchThresholdKB = DEFAULT_MAX_READ_SIZE_KB/2;
    private int bufferCompactThresholdKB = DEFAULT_MAX_READ_SIZE_KB/4;

    /**
     * Instantiates a new row service input stream.
     *
     * @param dp
     *            The data partition to read
     * @param rd
     *            The data record definition
     * @param pRd
     *            Field definition
     * @throws Exception
     *             the exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd) throws Exception
    {
        this(dp, rd, pRd, DEFAULT_CONNECT_TIMEOUT_MILIS);
    }

    /**
     * Instantiates a new row service input stream.
     *
     * @param dp
     *            The data partition to read
     * @param rd
     *            The data record definition
     * @param pRd
     *            Field definition
     * @param connectTimeout
     *            Connection timeout
     * @throws Exception
     *             the exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, -1);
    }

    /**
     * A plain socket connect to a THOR node for remote read.
     *
     * @param dp
     *            the data partition to read
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the rd
     * @param connectTimeout
     *            the connect timeout
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @throws Exception
     *             the exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, limit, true, -1);
    }

    /**
     * A plain socket connect to a THOR node for remote read
     * 
     * @param dp 
     *            the data partition to read  
     * @param hpccPart
     *            the remote file name and IP
     * @param rd
     *            the JSON definition for the read input and output
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread 
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB) throws Exception
    {
        this.recordDefinition = rd;
        this.projectedRecordDefinition = pRd;

        if (maxReadSizeInKB > 0)
        {
            this.maxReadSizeKB = maxReadSizeInKB;
        }

        this.bufferPrefetchThresholdKB = this.maxReadSizeKB/2;
        this.bufferCompactThresholdKB = this.maxReadSizeKB/4;

        this.jsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.recordDefinition).toString();
        this.projectedJsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.projectedRecordDefinition).toString();

        this.dataPart = dp;

        int copycount = dataPart.getCopyCount();
        for (int index = 0; index < copycount; index++)
        {
            String currentCopyLocation = dataPart.getCopyIP(index);
            if (Network.isLocalAddress(currentCopyLocation))
                prioritizedCopyIndexes.add(0, index);
            else
                prioritizedCopyIndexes.add(index);
        }

        this.handle = 0;
        this.cursorBin = new byte[0];
        this.simulateFail = false;
        this.connectTimeout = connectTimeout;
        this.recordLimit = limit;

        this.readBufferCapacity.set(this.maxReadSizeKB*1024*2);
        this.readBuffer = new byte[this.readBufferCapacity.get()];

        this.makeActive();

        if (createPrefetchThread)
        {
            RowServiceInputStream rowInputStream = this;
            Runnable prefetchTask = new Runnable()
            {
                RowServiceInputStream inputStream = rowInputStream;
                public void run()
                {
                    while (inputStream.isClosed() == false)
                    {
                        // If we don't have room in the buffer to fetch more data sleep
                        if (inputStream.getRemainingBufferCapacity() <= (inputStream.bufferPrefetchThresholdKB * 1024))
                        {
                            try
                            {
                                if (CompileTimeConstants.PROFILE_CODE)
                                {
                                    long sleepTime = System.nanoTime();
                                    Thread.sleep(PREFETCH_SLEEP_MS);
                                    sleepTime = System.nanoTime() - sleepTime;
                                    sleepTimeNS += sleepTime;
                                }
                                else
                                {
                                    Thread.sleep(PREFETCH_SLEEP_MS);
                                }
                            }
                            catch(Exception e){}
                        }

                        inputStream.prefetchData();
                    }
                }
            };

            prefetchThread = new Thread(prefetchTask);
            prefetchThread.start();
        }
    }

    /**
     * Sets the next file part copy.
     *
     * @return true, if successful
     */
    private boolean setNextFilePartCopy()
    {
        if (filePartCopyIndexPointer + 1 >= prioritizedCopyIndexes.size()) return false;

        filePartCopyIndexPointer++;
        return true;
    }

    /**
     * The SSL usage on the DAFILESRV side.
     *
     * @return use ssl flag
     */
    public boolean getUseSSL()
    {
        return this.dataPart.getUseSsl();
    }

    /**
     * The IP location for the file part's file copy.
     *
     * @return IP address
     */
    public String getIP()
    {
        return this.dataPart.getCopyIP(prioritizedCopyIndexes.get(getFilePartCopy()));
    }

    /**
     * The current file part's target copy index.
     *
     * @return Current filepart copy index (0-indexed)
     */
    private int getFilePartCopy()
    {
        return filePartCopyIndexPointer;
    }

    /**
     * The port number for the remote read service.
     *
     * @return port number
     */
    public int getPort()
    {
        return this.dataPart.getPort();
    }

    /**
     * The read transaction in JSON format.
     *
     * @return read transaction
     */
    public String getTrans()
    {
        return this.makeInitialRequest();
    }

    /**
     * The request string used with a handle.
     *
     * @return JSON string
     */
    public String getHandleTrans()
    {
        return this.makeHandleRequest();
    }

    /**
     * transaction when a cursor is required for the next read.
     *
     * @return a JSON request
     */
    public String getCursorTrans()
    {
        return this.makeCursorRequest();
    }

    /**
     * Is the read active?.
     *
     * @return true, if is active
     */
    public boolean isActive()
    {
        return this.active.get();
    }

    /**
     * Is the remote file closed? The file is closed after all of the partition content has been transferred.
     *
     * @return true if closed.
     */
    public boolean isClosed()
    {
        return this.closed.get();
    }

    /**
     * Remote read handle for next read.
     *
     * @return the handle
     */
    public int getHandle()
    {
        return handle;
    }

    /**
     * Simulate a handle failure and use the file cursor instead. The handle is set to an invalid value so the THOR node
     * will indicate that the handle is unknown and request a cursor.
     *
     * @param v
     *            true indicates that an invalid handle should be sent to force the fall back to a cursor. NOTE: this
     *            class reads ahead, so the use this before the first read.
     * @return the prior value
     */
    public boolean setSimulateFail(boolean v)
    {
        boolean old = this.simulateFail;
        this.simulateFail = v;
        return old;
    }

    /**
     * Force the use of handles instead of cursors for established connections.
     *
     * @param v
     *            the setting
     */
    public void setForceHandleUse(boolean v)
    {
        this.forceHandleUse = v;
    }

    /**
     * Returns remaning capacity in the read buffer.
     *
     * @return the remaining capacity 
     */
    public int getRemainingBufferCapacity()
    {
        int totalBufferCapacity = this.readBufferCapacity.get();
        int currentBufferLen = this.readBufferDataLen.get();
        return totalBufferCapacity - currentBufferLen;
    }

    // Run from prefetch thread only
    private int startFetch()
    {
        if (this.closed.get())
        {
            return -1;
        }

        numFetches++;
        if (!this.active.get()) // attempt to the first read
        {
            try
            {
                makeActive();
            }
            catch (HpccFileException e)
            {
                prefetchException = e;
                try
                {
                    close();
                }
                catch(Exception ie){}
                return -1;
            }
        }

        int len = 0;
        try
        {
            len = readReplyLen();
        }
        catch (HpccFileException e)
        {
            prefetchException = e;
            try
            {
                close();
            }
            catch(Exception ie){}
            return -1;
        }

        if (len == 0)
        {
            try
            {
                close();
            }
            catch (IOException e)
            {
                prefetchException = new HpccFileException(e.getMessage());
            }
            return -1;
        }

        if (len < 4)
        {
            prefetchException = new HpccFileException("Early data termination, no handle");
            try
            {
                close();
            }
            catch(Exception e){}
            return -1;
        }

        try
        {
            this.handle = dis.readInt();
            if (this.handle == 0)
            {
                try
                {
                    len = retryWithCursor();
                }
                catch (HpccFileException e)
                {
                    prefetchException = e;
                    try
                    {
                        close();
                    }
                    catch(Exception ie){}
                    return -1;
                }

                if (len == 0)
                {
                    close();
                    return -1;
                }

                if (len < 4)
                {
                    prefetchException = new HpccFileException("Early data termination, no handle");
                    try
                    {
                        close();
                    }
                    catch(Exception e){}
                    return -1;
                }

                this.handle = dis.readInt();
                if (this.handle == 0)
                {
                    prefetchException = new HpccFileException("Read retry failed");
                    try
                    {
                        close();
                    }
                    catch(Exception e){}
                }
            }
        }
        catch (IOException e)
        {
            prefetchException = new HpccFileException("Error during read block", e);
            try
            {
                close();
            }
            catch(Exception ie){}
        }

        int dataLen = 0;
        try
        {
            dataLen = dis.readInt();
            if (dataLen == 0)
            {
                close();
                return 0;
            }
        }
        catch (IOException e)
        {
            prefetchException = new HpccFileException("Error during read block", e);
            try
            {
                close();
            }
            catch(Exception ie){}
        }

        return dataLen;
    }

    private void readDataInFetch()
    {
        if (this.closed.get())
        {
            return;
        }

        // Loop here while data is being consumed quickly enough
        while (remainingDataInCurrentRequest > 0)
        {
            if (CompileTimeConstants.PROFILE_CODE)
            {
                boolean acquired = this.bufferWriteMutex.tryAcquire();
                if (acquired == false)
                {
                    long aquireTime = System.nanoTime();
                    this.bufferWriteMutex.acquireUninterruptibly();
                    aquireTime = System.nanoTime() - aquireTime;
                    mutexWaitTimeNS += aquireTime;
                }
            }
            else
            {
                this.bufferWriteMutex.acquireUninterruptibly();
            }

            int totalBufferCapacity = this.readBufferCapacity.get();
            int currentBufferLen = this.readBufferDataLen.get();
            int remainingBufferCapacity = totalBufferCapacity - currentBufferLen;

            remainingBufferCapacity = totalBufferCapacity - currentBufferLen;

            // Read up to available bytes in input stream
            int bytesToRead = 0;
            try
            {
                bytesToRead = Math.min(remainingBufferCapacity,
                              Math.min(this.dis.available(),remainingDataInCurrentRequest));
                dis.readFully(this.readBuffer, currentBufferLen, bytesToRead);
            }
            catch (IOException e)
            {
                prefetchException = new HpccFileException("Error during read block", e);
                try
                {
                    close();
                }
                catch(Exception ie){}
            }

            // readBufferDataLen should only ever be updated within the mutex so no need to do compare exchange
            this.readBufferDataLen.addAndGet(bytesToRead);
            remainingDataInCurrentRequest -= bytesToRead;

            bufferWriteMutex.release();
            
            // If we don't have enough room in the buffer. Return, and let the calling prefetch thread handle sleep etc
            if (remainingDataInCurrentRequest > 0 && this.readBufferDataLen.get() > (this.bufferPrefetchThresholdKB * 1024))
            {
                return;
            }
        }
    }

    private void finishFetch()
    {
        if (this.closed.get())
        {
            return;
        }

        try
        {
            if (dis==null) {
                return;
            }
            int cursorLen = dis.readInt();
            if (cursorLen == 0)
            {
                close();
                return;
            }

            if (this.cursorBin == null || cursorLen > this.cursorBin.length)
            {
                this.cursorBin = new byte[cursorLen];
            }
            dis.readFully(this.cursorBin,0,cursorLen);
        }
        catch (IOException e)
        {
            prefetchException = new HpccFileException("Error during read block", e);
            try
            {
                close();
            }
            catch(Exception ie){}
        }

        if (this.simulateFail) this.handle = -1;
        String readAheadTrans = (this.forceHandleUse) ? this.getHandleTrans() : this.getCursorTrans();
        try
        {
            int lenTrans = readAheadTrans.length();
            this.dos.writeInt(lenTrans);
            this.dos.write(readAheadTrans.getBytes(HPCCCharSet), 0, lenTrans);
            this.dos.flush();
        }
        catch (IOException e)
        {
            prefetchException = new HpccFileException("Failure sending read ahead transaction", e);
            try
            {
                close();
            }
            catch(Exception ie){}
        }
    }

    public void prefetchData()
    {
        // If we haven't finished reading the current request continue reading it
        if (remainingDataInCurrentRequest > 0) 
        {
            if (CompileTimeConstants.PROFILE_CODE)
            {
                long nsFetching = System.nanoTime();
                readDataInFetch();
                nsFetching = System.nanoTime() - nsFetching;
                fetchTimeNS += nsFetching;
            }
            else
            {
                readDataInFetch();
            }

            if (remainingDataInCurrentRequest == 0)
            {
                if (CompileTimeConstants.PROFILE_CODE)
                {
                    long nsFinishFetch = System.nanoTime();
                    finishFetch();
                    nsFinishFetch = System.nanoTime() - nsFinishFetch;
                    fetchFinishTimeNS += nsFinishFetch;
                }
                else
                {
                    finishFetch();
                }
            }
        }
        // Otherwise start a new request
        else
        {
            if (CompileTimeConstants.PROFILE_CODE)
            {
                long nsStartFetch = System.nanoTime();
                remainingDataInCurrentRequest = startFetch();
                nsStartFetch = System.nanoTime() - nsStartFetch;
                fetchStartTimeNS += nsStartFetch;
            }
            else
            {
                remainingDataInCurrentRequest = startFetch();
            }

            if (CompileTimeConstants.PROFILE_CODE)
            {
                long nsFetching = System.nanoTime();
                readDataInFetch();
                nsFetching = System.nanoTime() - nsFetching;
                fetchTimeNS += nsFetching;

                // If this is the first fetch. numFetches gets incremented at the start of a fetch
                if (numFetches == 1 && firstByteTimeNS > 0)
                {
                    firstByteTimeNS = System.nanoTime() - firstByteTimeNS;
                }
            }
            else
            {
                readDataInFetch();
            }

            if (remainingDataInCurrentRequest == 0)
            {
                if (CompileTimeConstants.PROFILE_CODE)
                {
                    long nsFinishFetch = System.nanoTime();
                    finishFetch();
                    nsFinishFetch = System.nanoTime() - nsFinishFetch;
                    fetchFinishTimeNS += nsFinishFetch;
                }
                else
                {
                    finishFetch();
                }
            }
        }
    }
    
    /*
     * (non-Javadoc)
     * 
     * Move unread data to front of buffer to make room for more data.
     */
    private void compactBuffer()
    {
        if (CompileTimeConstants.PROFILE_CODE)
        {
            boolean acquired = this.bufferWriteMutex.tryAcquire();
            if (acquired == false)
            {
                long aquireTime = System.nanoTime();
                this.bufferWriteMutex.acquireUninterruptibly();
                aquireTime = System.nanoTime() - aquireTime;
                mutexWaitTimeNS += aquireTime;
            }
        }
        else
        {
            this.bufferWriteMutex.acquireUninterruptibly();
        }

        if (this.readPos >= this.bufferCompactThresholdKB * 1024)
        {
            // Don't loose the markPos during compaction
            int compactStartLoc = this.readPos;
            if (this.markPos >= 0)
            {
                int markOffset = this.readPos - this.markPos;
                if (markOffset <= readLimit)
                {
                    compactStartLoc = this.markPos;
                    this.markPos = 0;
                }
                else
                {
                    // We have gone past our read limit so go ahead reset the markPos
                    this.markPos = -1;
                }
            }

            int remainingBytesInBuffer = this.readBufferDataLen.addAndGet(-compactStartLoc);
            System.arraycopy(this.readBuffer,compactStartLoc,this.readBuffer,0,remainingBytesInBuffer);
            this.readPos -= compactStartLoc;
        }
        this.bufferWriteMutex.release();
    }
    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#available()
     */
    @Override
    public int available() throws IOException
    {
        // Do the check for closed first here to avoid data races
        if (this.closed.get())
        {
            int bufferLen = this.readBufferDataLen.get();
            int availBytes = bufferLen - this.readPos;
            if (availBytes == 0)
            {
                // this.bufferWriteMutex.release();
                throw new IOException("End of input stream.");
            }
        }

        int bufferLen = this.readBufferDataLen.get();
        int availBytes = bufferLen - this.readPos;

        return availBytes;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#close()
     */
    @Override
    public void close() throws IOException
    {
        // Using getAndSet to prevent main thread and background thread from 
        // closing at the same time
        if (this.closed.getAndSet(true) == false)
        {
            // If close was not called from the prefetch thread wait for it to finish
            if (this.prefetchThread != null && Thread.currentThread() != this.prefetchThread)
            {
                try
                {
                    this.prefetchThread.join();
                }
                catch(Exception e){}
            }

            this.dos.close();
            if (this.dis != null)
            {
                this.dis.close();
            }
            this.sock.close();
            this.dos = null;
            this.dis = null;
            this.sock = null;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#mark(int)
     */
    @Override
    public void mark(int readLim)
    {
        if (CompileTimeConstants.PROFILE_CODE)
        {
            boolean acquired = this.bufferWriteMutex.tryAcquire();
            if (acquired == false)
            {
                long aquireTime = System.nanoTime();
                this.bufferWriteMutex.acquireUninterruptibly();
                aquireTime = System.nanoTime() - aquireTime;
                mutexWaitTimeNS += aquireTime;
            }
        }
        else
        {
            this.bufferWriteMutex.acquireUninterruptibly();
        }

        int availableReadCapacity = (this.readBufferCapacity.get() - this.readPos);
        this.readLimit = readLim;

        // Check to see if we can handle this readLimit with the current buffer / readPos
        if (availableReadCapacity <= this.readLimit)
        {
            int requiredBufferLength = this.readPos + this.readLimit;

            // Check to see if compaction will work
            int remainingBytesInBuffer = this.readBufferDataLen.addAndGet(-this.readPos);
            if (this.readBufferCapacity.get() >= requiredBufferLength)
            {
                System.arraycopy(this.readBuffer,this.readPos,this.readBuffer,0,remainingBytesInBuffer);
                this.readPos = 0;
            }
            // Need a larger buffer
            else
            {
                byte[] newBuffer = new byte[requiredBufferLength];
                System.arraycopy(this.readBuffer,this.readPos,newBuffer,0,remainingBytesInBuffer);
                this.readBuffer = newBuffer;
                this.readBufferCapacity.set(requiredBufferLength);
                this.readPos = 0;
            }
        }

        this.markPos = this.readPos;
        this.bufferWriteMutex.release();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#markSupported()
     */
    @Override
    public boolean markSupported()
    {
        return true;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#read()
     */
    // Returns next byte [0-255] -1 on EOS
    @Override
    public int read() throws IOException
    {
        if (this.prefetchException != null)
        {
            throw new IOException(this.prefetchException.getMessage());
        }

        // We are waiting on a single byte so hot loop
        long waitNS = 0;
        try
        {
            // Available will throw an exception when it reaches EOS and available bytes == 0
            if (CompileTimeConstants.PROFILE_CODE)
            {
                waitNS = System.nanoTime();
                while (this.available() < 1) {}
                waitNS = System.nanoTime() - waitNS;
                waitTimeNS += waitNS;

                float timeUS = waitNS / 1000.0f;
                if (timeUS >= LONG_WAIT_THRESHOLD_US)
                {
                    numLongWaits++;
                }
            }
            else
            {
                while (this.available() < 1) {}
            }
        }
        catch (IOException e)
        {
            // waitNS in this case is the time it took for the stream to close
            if (CompileTimeConstants.PROFILE_CODE)
            {
                closeTimeNS = System.nanoTime() - waitNS;
            }

            // Read failed due to EOS. Other side closed socket
            return -1;
        }


        // Java byte range [-128,127] 
        int ret = this.readBuffer[this.readPos] + 128;
        this.readPos++;
        this.streamPos++;

        compactBuffer();

        return ret;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#read(byte[])
     */
    // Returns -1 on EOS
    @Override
    public int read(byte[] b) throws IOException
    {
        return read(b, 0, b.length);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#read(byte[], int, int)
     */
    // Returns -1 on EOS
    @Override
    public int read(byte[] b, int off, int len) throws IOException
    {
        if (this.prefetchException != null)
        {
            throw new IOException(this.prefetchException.getMessage());
        }

        int available = 0;
        try
        {
            available = this.available();
        }
        catch (IOException e)
        {
            return -1;
        }

        int bytesToRead = len;
        if (bytesToRead > available)
        {
            bytesToRead = available;
            numPartialBlockReads++;
        }
        numBlockReads++;

        System.arraycopy(this.readBuffer,this.readPos,b,off,bytesToRead);
        this.readPos += bytesToRead;
        this.streamPos += bytesToRead;

        compactBuffer();

        return bytesToRead;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#reset()
     */
    @Override
    public void reset() throws IOException
    {
        if (this.prefetchException != null)
        {
            throw new IOException(this.prefetchException.getMessage());
        }

        if (this.markPos < 0)
        {
            throw new IOException("Unable to reset to marked position. "
                    + "Either a mark has not been set or the reset length exceeds internal buffer length.");
        }

        this.streamPos -= (this.readPos - this.markPos);
        this.readPos = this.markPos;
        this.markPos = -1;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.io.InputStream#skip(long)
     */
    @Override
    public long skip(long n) throws IOException
    {
        if (this.prefetchException != null)
        {
            throw new IOException(this.prefetchException.getMessage());
        }

        // Have to read the data if we need to skip
        long remainingBytesToSkip = n;
        while (remainingBytesToSkip > 0)
        {
            int available = 0;
            try
            {
                available = this.available();
            }
            catch (IOException e)
            {
                break;
            }

            int bytesToSkip = (int) remainingBytesToSkip;
            if (bytesToSkip > available)
            {
                bytesToSkip = available; 
            }

            this.readPos += bytesToSkip;
            remainingBytesToSkip -= bytesToSkip;
            
            compactBuffer();
        }

        long bytesSkipped = (n - remainingBytesToSkip);
        this.streamPos += bytesSkipped;

        return bytesSkipped;
    }

    public long getBytesRead()
    {
        return this.streamPos;
    }

    public long getFirstByteTimeNS()
    {
        return firstByteTimeNS;
    }

    public long getWaitTimeNS()
    {
        return waitTimeNS;
    }

    public long getSleepTimeNS()
    {
        return sleepTimeNS;
    }

    public long getFetchStartTimeNS()
    {
        return fetchStartTimeNS;
    }

    public long getFetchTimeNS()
    {
        return fetchTimeNS;
    }

    public long getFetchFinishTimeNS()
    {
        return fetchFinishTimeNS;
    }

    public long getCloseTimeNS()
    {
        return closeTimeNS;
    }

    public long getMutexWaitTimeNS()
    {
        return mutexWaitTimeNS;
    }

    public int getNumLongWaits()
    {
        return numLongWaits;
    }

    public int getNumFetches()
    {
        return numFetches;
    }

    public long getNumPartialBlockReads()
    {
        return numPartialBlockReads;
    }

    public long getNumBlockReads()
    {
        return numBlockReads;
    }

    /**
     * Open client socket to the primary and open the streams.
     *
     * @throws HpccFileException
     *             the hpcc file exception
     */
    private void makeActive() throws HpccFileException
    {
        this.active.set(false);
        this.handle = 0;
        this.cursorBin = new byte[0];

        while (true)
        {
            try
            {
                log.debug("Attempting to connect to file part : '" + dataPart.getThisPart() + "' Copy: '" + (getFilePartCopy() + 1) + "' on IP: '"
                        + getIP() + "'");

                try
                {
                    if (getUseSSL())
                    {
                        SSLSocketFactory ssf = (SSLSocketFactory) SSLSocketFactory.getDefault();
                        sock = (SSLSocket) ssf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of
                        // data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), this.connectTimeout);

                        log.debug("Attempting SSL handshake...");
                        ((SSLSocket) sock).startHandshake();
                        log.debug("SSL handshake successful...");
                        log.debug("   Remote address = " + sock.getInetAddress().toString() + " Remote port = " + sock.getPort());
                    }
                    else
                    {
                        SocketFactory sf = SocketFactory.getDefault();
                        sock = sf.createSocket();

                        // Optimize for bandwidth over latency and connection time.
                        // We are opening up a long standing connection and potentially reading a significant amount of
                        // data
                        // So we don't care as much about individual packet latency or connection time overhead
                        sock.setPerformancePreferences(0, 1, 2);
                        sock.connect(new InetSocketAddress(this.getIP(), this.dataPart.getPort()), this.connectTimeout);
                    }
                    log.debug("Connected: Remote address = " + sock.getInetAddress().toString() + " Remote port = " + sock.getPort());
                }
                catch (java.net.UnknownHostException e)
                {
                    throw new HpccFileException("Bad file part addr " + this.getIP(), e);
                }
                catch (java.io.IOException e)
                {
                    throw new HpccFileException(e);
                }

                try
                {
                    this.dos = new java.io.DataOutputStream(sock.getOutputStream());
                    this.dis = new java.io.DataInputStream(sock.getInputStream());
                }
                catch (java.io.IOException e)
                {
                    throw new HpccFileException("Failed to create streams", e);
                }

                this.active.set(true);
                try
                {
                    String readTrans = makeInitialRequest();
                    int transLen = readTrans.length();
                    this.dos.writeInt(transLen);
                    this.dos.write(readTrans.getBytes(HPCCCharSet), 0, transLen);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    throw new HpccFileException("Failed on initial remote read read trans", e);
                }
            
                if (CompileTimeConstants.PROFILE_CODE)
                {
                    firstByteTimeNS = System.nanoTime();
                }
                return;
            }
            catch (Exception e)
            {
                log.error("Could not reach file part: '" + dataPart.getThisPart() + "' copy: '" + (getFilePartCopy() + 1) + "' on IP: '" + getIP()
                        + "'");
                log.error(e.getMessage());

                if (!setNextFilePartCopy())
                    // This should be a multi exception
                    throw new HpccFileException("Unsuccessfuly attempted to connect to all file part copies", e);
            }
        }

    }

    /**
     * Creates a request string using the record definition, filename, and current state of the file transfer.
     *
     * @return JSON request string
     */
    private String makeInitialRequest()
    {
        StringBuilder sb = new StringBuilder(2048);
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\", \n");
        sb.append("\"replyLimit\" : " + this.maxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append("\n}\n");

        return sb.toString();
    }

    /**
     * Make the node part of the JSON request string.
     *
     * @return Json
     */
    private String makeNodeObject()
    {
        StringBuilder sb = new StringBuilder(50 + jsonRecordDefinition.length() + projectedJsonRecordDefinition.length());
        sb.append(" \"node\" : {\n ");

        DataPartition.FileType fileType = this.dataPart.getFileType();
        boolean needToSpecifyFileType = fileType.typeCanBeDeduced() == false;
        if (needToSpecifyFileType)
        {
            sb.append("\"kind\" : \"");
            sb.append(fileType.toString() + "read\",\n");
        }

        sb.append("\"metaInfo\" : \"");
        sb.append(this.dataPart.getFileAccessBlob());
        sb.append("\",\n \"filePart\" : \"");
        sb.append(this.dataPart.getThisPart());
        sb.append("\", \n");
        sb.append("\"filePartCopy\" : \"");
        sb.append(getFilePartCopy() + 1);
        sb.append("\", \n");
        FileFilter fileFilter = this.dataPart.getFilter();
        if (fileFilter != null && fileFilter.isEmpty() == false)
        {
            sb.append(" ");
            sb.append(this.dataPart.getFilter().toJson());
            sb.append(",\n");
        }

        if (this.recordLimit > -1)
        {
            sb.append("\"chooseN\" : \"" + this.recordLimit + "\",\n");
        }

        sb.append("\n \"input\" : ");
        sb.append(jsonRecordDefinition);
        sb.append(", \n \"output\" : ");
        sb.append(projectedJsonRecordDefinition);
        sb.append("\n }");
        return sb.toString();
    }

    /**
     * Request using a handle to read the next block.
     *
     * @return the request as a JSON string
     */
    private String makeHandleRequest()
    {
        StringBuilder sb = new StringBuilder(100);
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("  \"handle\" : \"");
        sb.append(Integer.toString(this.handle));
        sb.append("\" \n}");

        return sb.toString();
    }

    /**
     * Make cursor request.
     *
     * @return the string
     */
    private String makeCursorRequest()
    {
        StringBuilder sb = new StringBuilder(
                130 + this.jsonRecordDefinition.length() + this.projectedJsonRecordDefinition.length() + (int) (this.cursorBin.length * 1.4));
        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("\"replyLimit\" : " + this.maxReadSizeKB + ",\n");
        sb.append(makeNodeObject());
        sb.append(",\n");
        sb.append("  \"cursorBin\" : \"");
        sb.append(java.util.Base64.getEncoder().encodeToString(this.cursorBin));
        sb.append("\" \n}\n");
        return sb.toString();
    }

    /**
     * Read the reply length and process failures if indicated.
     *
     * @return length of the reply less failure indicator
     * @throws HpccFileException
     *             the hpcc file exception
     */
    private int readReplyLen() throws HpccFileException
    {
        int len = 0;
        boolean hi_flag = false; // is a response without this set always an error?
        try
        {
            len = dis.readInt();
            if (len < 0)
            {
                hi_flag = true;
                len &= 0x7FFFFFFF;
            }

            if (len == 0) return 0;

            int status = dis.readInt();
            len -= 4; // account for the status int 4-byte
            if (status != RFCCodes.RFCStreamNoError)
            {
                StringBuilder sb = new StringBuilder();
                sb.append("\nReceived ERROR from Thor node (");
                sb.append(this.getIP());
                sb.append("): Code: '");
                sb.append(status);
                sb.append("'");

                if (len > 0)
                {
                    byte[] message = new byte[len];
                    dis.readFully(message, 0, len);
                    sb.append(" Message: '");
                    sb.append(new String(message));
                    sb.append("'");
                }

                switch (status)
                {
                    case RFCCodes.DAFSERR_cmdstream_invalidexpiry:
                        sb.append("\nInvalid file access expiry reported - change File Access Expiry (HPCCFile) and retry");
                        break;
                    case RFCCodes.DAFSERR_cmdstream_authexpired:
                        sb.append("\nFile access expired before initial request - Retry and consider increasing File Access Expiry (HPCCFile)");
                        break;
                    default:
                        break;
                }

                throw new HpccFileException(sb.toString());
            }
        }
        catch (IOException e)
        {
            throw new HpccFileException("Error during read block", e);
        }
        return len;
    }

    /**
     * Retry with a cursor and read the reply. Process failures as indicated.
     *
     * @return the length pf the reply less failure indication
     * @throws HpccFileException
     *             the hpcc file exception
     */
    private int retryWithCursor() throws HpccFileException
    {
        String retryTrans = this.makeCursorRequest();
        int len = retryTrans.length();
        try
        {
            this.dos.writeInt(len);
            this.dos.write(retryTrans.getBytes(HPCCCharSet), 0, len);
            this.dos.flush();
        }
        catch (IOException e)
        {
            throw new HpccFileException("Failed on remote read read retry", e);
        }
        return readReplyLen();
    }
}
