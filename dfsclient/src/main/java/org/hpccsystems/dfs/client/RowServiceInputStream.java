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
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.io.InputStream;

import java.sql.Timestamp;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.benchmarking.IMetric;
import org.hpccsystems.commons.benchmarking.IProfilable;
import org.hpccsystems.commons.benchmarking.Units;
import org.hpccsystems.commons.benchmarking.SimpleMetric;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.network.Network;
import org.hpccsystems.generated.CompileTimeConstants;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Context;
import io.opentelemetry.semconv.ExceptionAttributes;
import io.opentelemetry.semconv.ServerAttributes;
import io.opentelemetry.semconv.ServiceAttributes;

/**
 * An input stream that uses the row service provided by the HPCC platform to read a particular file part.
 */
public class RowServiceInputStream extends InputStream implements IProfilable
{
    private static class ReadRequestEvent
    {
        public long requestTime = 0;
        public long requestStreamPos = 0;
        public long responseTime = 0;
        public int bytesRead = 0;
        public int requestSize = 0;
    };

    public static class RestartInformation
    {
        public long streamPos = 0;
        public byte[] tokenBin = null;
    }

    private static class RowServiceResponse
    {
        int len = 0;
        int errorCode = 0;
        int handle = -1;
        String errorMessage = null;
    }

    public static final int          DEFAULT_READ_REQUEST_SPAN_BATCH_SIZE = 25;
    public static final int          DEFAULT_CONNECT_TIMEOUT_MILIS = 5000; // 5 second connection timeout
    public static final int          DEFAULT_SOCKET_OP_TIMEOUT_MS  = 15000; // 15 second timeout on read / write operations

    // Note: The platform may respond with more data than this if records are larger than this limit.
    public static final int          DEFAULT_MAX_READ_SIZE_KB = 4096;
    private static final int         SHORT_SLEEP_MS           = 1;
    private static final int         LONG_WAIT_THRESHOLD_US   = 100;
    private static final int         MAX_HOT_LOOP_NS          = 10000;

    // This is used to prevent the prefetch thread from hot looping when
    // the network connection is slow. The read on the socket will block until
    // at least 512 bytes are available
    private static final int         MIN_SOCKET_READ_SIZE     = 512;

    public static final String BYTES_READ_METRIC = "bytesRead";
    public static final String FIRST_BYTE_TIME_METRIC = "prefetchFirstByteTime";
    public static final String WAIT_TIME_METRIC = "parseWaitTime";
    public static final String MUTEX_WAIT_TIME_METRIC = "mutexWaitTime";
    public static final String SLEEP_TIME_METRIC = "prefetchSleepTime";

    public static final String FETCH_START_TIME_METRIC = "fetchRequestStartTime";
    public static final String FETCH_TIME_METRIC = "fetchRequestReadTime";
    public static final String FETCH_FINISH_TIME_METRIC = "fetchRequestFinishTime";
    public static final String CLOSE_TIME_METRIC = "connectionCloseTime";

    public static final String LONG_WAITS_METRIC = "numLongWaits";
    public static final String FETCHES_METRIC = "numFetches";
    public static final String PARTIAL_BLOCK_READS_METRIC = "numPartialBlockReads";
    public static final String BLOCK_READS_METRIC = "numBlockReads";

    private AtomicBoolean            active = new AtomicBoolean(false);
    private AtomicBoolean            closed = new AtomicBoolean(false);
    private boolean                  simulateFail = false;
    private boolean                  forceTokenUse = false;
    private boolean                  inFetchingMode = false;
    private boolean                  useOldProtocol = true;
    private byte[]                   tokenBin;
    private int                      handle;
    private DataPartition            dataPart;
    private FieldDef                 recordDefinition              = null;
    private String                   jsonRecordDefinition          = null;
    private FieldDef                 projectedRecordDefinition     = null;
    private String                   projectedJsonRecordDefinition = null;
    private java.io.DataInputStream  dis = null;
    private java.io.DataOutputStream dos = null;
    private String                   rowServiceVersion = "";

    private Span                     fileReadSpan = null;
    private String                   traceContextHeader = null;

    private Span                     readRequestSpan = null;
    private int                      readRequestCount = 0;
    private int                      readRequestStart = 0;
    private int                      readRequestBatchSize = DEFAULT_READ_REQUEST_SPAN_BATCH_SIZE;

    private List<ReadRequestEvent>   readRequestEvents = new ArrayList<ReadRequestEvent>();
    private ReadRequestEvent         currentReadRequestEvent = null;

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

    private int                      totalDataInCurrentRequest = 0;
    private int                      remainingDataInCurrentRequest = 0;
    private long                     streamPos = 0;

    // Used for restarts
    private long                     streamPosOfFetchStart = 0;
    private List<Long>               streamPosOfFetches = new ArrayList<Long>();
    private List<byte[]>             tokenBinOfFetches = new ArrayList<byte[]>();

    // Used for fetch requests
    private List<Long>               fetchRequestOffsets = new ArrayList<Long>();

    private long                     firstByteTimeNS = -1;
    private long                     mutexWaitTimeNS = 0;
    private long                     waitTimeNS = 0;
    private long                     sleepTimeNS = 0;
    private int                      readRequestDelayMS = 0;
    private long                     fetchStartTimeNS = 0;
    private long                     fetchTimeNS = 0;
    private long                     fetchFinishTimeNS = 0;
    private long                     closeTimeNS = 0;
    private int                      numLongWaits = 0;
    private int                      numFetches = 0;
    private long                     numPartialBlockReads = 0;
    private long                     numBlockReads = 0;

    private Socket                   sock;
    private int                      connectTimeout = DEFAULT_CONNECT_TIMEOUT_MILIS;
    private int                      socketOpTimeoutMs = DEFAULT_SOCKET_OP_TIMEOUT_MS;

    private static final Charset     HPCCCharSet                   = Charset.forName("ISO-8859-1");
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
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the projected record definition
     * @param connectTimeout
     *               the connection timeout
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     * @param maxReadSizeInKB
     *            max readsize in kilobytes
     * @throws Exception
     *            general exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, limit, createPrefetchThread, maxReadSizeInKB, null, false);
    }

    /**
     * A plain socket connect to a THOR node for remote read
     *
     * @param dp
     *            the data partition to read
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the projected record definition
     * @param connectTimeout
     *               the connection timeout
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     * @param maxReadSizeInKB
     *            max readsize in kilobytes
     * @param restart
     *            RestartInformation object
     * @throws Exception
     *            general exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB, RestartInformation restart) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, limit, createPrefetchThread, maxReadSizeInKB, restart, false);
    }

    /**
     * A plain socket connect to a THOR node for remote read
     *
     * @param dp
     *            the data partition to read
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the projected record definition
     * @param connectTimeout
     *               the connection timeout
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     * @param maxReadSizeInKB
     *            max readsize in kilobytes
     * @param restartInfo
     *            information used to restart a read from a particular stream position
     * @param isFetching
     *            Will this input stream be used to serviced batched fetch requests
     * @throws Exception
     *            general exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB, RestartInformation restartInfo, boolean isFetching) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, limit, createPrefetchThread, maxReadSizeInKB, restartInfo, isFetching, DEFAULT_SOCKET_OP_TIMEOUT_MS, null);
    }

    /**
     * A plain socket connect to a THOR node for remote read
     *
     * @param dp
     *            the data partition to read
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the projected record definition
     * @param connectTimeout
     *               the connection timeout in milliseconds
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     * @param maxReadSizeInKB
     *            max readsize in kilobytes
     * @param restartInfo
     *            information used to restart a read from a particular stream position
     * @param isFetching
     *            Will this input stream be used to serviced batched fetch requests
     * @param socketOpTimeoutMS
     *            Socket (read / write) operation timeout in milliseconds
     * @throws Exception
     *            general exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB,
                                RestartInformation restartInfo, boolean isFetching, int socketOpTimeoutMS) throws Exception
    {
        this(dp, rd, pRd, connectTimeout, limit, createPrefetchThread, maxReadSizeInKB, restartInfo, isFetching, socketOpTimeoutMS, null);
    }

    /**
     * A plain socket connect to a THOR node for remote read
     *
     * @param dp
     *            the data partition to read
     * @param rd
     *            the JSON definition for the read input and output
     * @param pRd
     *            the projected record definition
     * @param connectTimeout
     *               the connection timeout in milliseconds
     * @param limit
     *            the record limit to use for reading the dataset. -1 implies no limit
     * @param createPrefetchThread
     *            Wether or not this inputstream should handle prefetching itself or if prefetch will be called externally
     * @param maxReadSizeInKB
     *            max readsize in kilobytes
     * @param restartInfo
     *            information used to restart a read from a particular stream position
     * @param isFetching
     *            Will this input stream be used to serviced batched fetch requests
     * @param socketOpTimeoutMS
     *            Socket (read / write) operation timeout in milliseconds
     * @param rdSpan
     *            OpenTelemetry span to use for tracing
     * @throws Exception
     *            general exception
     */
    public RowServiceInputStream(DataPartition dp, FieldDef rd, FieldDef pRd, int connectTimeout, int limit, boolean createPrefetchThread, int maxReadSizeInKB,
                                RestartInformation restartInfo, boolean isFetching, int socketOpTimeoutMS, Span rdSpan) throws Exception
    {
        this.recordDefinition = rd;
        this.projectedRecordDefinition = pRd;
        this.inFetchingMode = isFetching;

        if (maxReadSizeInKB > 0)
        {
            this.maxReadSizeKB = maxReadSizeInKB;
        }

        this.bufferPrefetchThresholdKB = this.maxReadSizeKB/2;
        this.bufferCompactThresholdKB = this.maxReadSizeKB/4;

        this.jsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.recordDefinition).toString();
        this.projectedJsonRecordDefinition = RecordDefinitionTranslator.toJsonRecord(this.projectedRecordDefinition).toString();

        this.dataPart = dp;

        if (rdSpan != null && rdSpan.getSpanContext().isValid())
        {
            this.fileReadSpan = rdSpan;
            this.traceContextHeader = org.hpccsystems.ws.client.utils.Utils.getTraceParentHeader(fileReadSpan);
        }

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
        this.tokenBin = null;
        this.simulateFail = false;

        if (connectTimeout > 0)
        {
            this.connectTimeout = connectTimeout;
        }

        if (socketOpTimeoutMS > 0)
        {
            this.socketOpTimeoutMs = socketOpTimeoutMS;
        }

        this.recordLimit = limit;

        this.readBufferCapacity.set(this.maxReadSizeKB*1024*2);
        this.readBuffer = new byte[this.readBufferCapacity.get()];

        if (restartInfo != null)
        {
            this.tokenBin = restartInfo.tokenBin;
            this.streamPos = restartInfo.streamPos;
            this.streamPosOfFetchStart = this.streamPos;
        }
        String prefix = "RowServiceInputStream constructor, file "  + dataPart.getFileName() +  " part " + dataPart.getThisPart() + " on IP " + getIP() + ":";

        if (inFetchingMode == false)
        {
            this.makeActive();
        }
        else
        {
            // Starting a fetch for the first record so that the connection is warm started
            // Starting the fetch on another thread to allow for records larger than the buffer size
            AtomicBoolean blockingRequestFinished = new AtomicBoolean(false);
            Thread tempFetchThread = new Thread(() -> {
                try
                {
                    Long[] emptyOffsets = {0L};
                    startBlockingFetchRequest(Arrays.asList(emptyOffsets));
                }
                catch (Exception e)
                {
                    setPrefetchException(new HpccFileException(prefix + "Error while batch fetch warm starting: " + e.getMessage()));
                }

                blockingRequestFinished.set(true);
            });
            tempFetchThread.start();

            // Consume data until we have read all data in the requested record
            while (blockingRequestFinished.get() == false)
            {
                try
                {
                    long avail = this.available();
                    if (avail > 0)
                    {
                        this.skip(avail);

                        // Sleep 1ms to prevent hot loop from eating CPU resources
                        try
                        {
                            Thread.sleep(SHORT_SLEEP_MS);
                        }
                        catch(InterruptedException e) {/*We don't care about waking early*/}
                    }
                }
                catch (IOException e)
                {
                    // Available may throw an IOException if no data is available and the stream is closed
                    // This shouldn't be treated as an error, but an indication of EOS
                    break;
                }
            }

            tempFetchThread.join();

            if (prefetchException != null)
            {
                // Will already be recorded in span
                throw prefetchException;
            }
        }

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
                        inputStream.prefetchData();

                        // Sleep after each prefetch to prevent hot loop from eating CPU resources
                        try
                        {
                            if (CompileTimeConstants.PROFILE_CODE)
                            {
                                long sleepTime = System.nanoTime();
                                Thread.sleep(SHORT_SLEEP_MS);
                                sleepTime = System.nanoTime() - sleepTime;
                                sleepTimeNS += sleepTime;
                            }
                            else
                            {
                                Thread.sleep(SHORT_SLEEP_MS);
                            }
                        }
                        catch(InterruptedException e) {/*We don't care about waking early*/}
                    }
                }
            };

            prefetchThread = new Thread(prefetchTask);
            prefetchThread.start();
        }
    }

    /**
     * Returns RestartInformation for the given streamPos if possible.
     *
     * @return RestartInformation
     */
    RestartInformation getRestartInformationForStreamPos(long streamPos)
    {
        RestartInformation restartInfo = new RestartInformation();

        synchronized (streamPosOfFetches)
        {
            // Note if we don't find a valid start point we will restart from the beginning of the file
            for (int i = streamPosOfFetches.size()-1; i >= 0; i--)
            {
                Long fetchStreamPos = streamPosOfFetches.get(i);
                if (fetchStreamPos <= streamPos)
                {
                    restartInfo.streamPos = fetchStreamPos;
                    restartInfo.tokenBin = tokenBinOfFetches.get(i);
                    break;
                }
            }
        }

        return restartInfo;
    }

    private void setPrefetchException(HpccFileException e)
    {
        this.prefetchException = e;

        if (readRequestSpan != null)
        {
            readRequestSpan.recordException(e);
            readRequestSpan.setStatus(StatusCode.ERROR);
        }
        else if (fileReadSpan != null)
        {
            Attributes attributes = Attributes.of(  AttributeKey.longKey("server.index"), Long.valueOf(getFilePartCopy()),
                                                    ExceptionAttributes.EXCEPTION_MESSAGE, e.getMessage());
            fileReadSpan.recordException(e, attributes);
        }
    }

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

    private String getCopyPath()
    {
        return this.dataPart.getCopyPath(prioritizedCopyIndexes.get(getFilePartCopy()));
    }

    private int getFilePartCopy()
    {
        return filePartCopyIndexPointer;
    }

    /**
     * The HpccFileException from the prefetch thread if an exception has occured.
     *
     * @return the prefetch exception
     */
    public HpccFileException getPrefetchException()
    {
        return this.prefetchException;
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
     * Is the remote rowservice using the new message protocol introduced in 8.12.10?
     *
     * @return true if using new protocol
     */
    public boolean isUsingNewProtocol()
    {
        return !this.useOldProtocol;
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
     * The delay in milliseconds between read requests. Primarily used for testing.
     * @param sleepTimeMS
     */
    public void setReadRequestDelay(int sleepTimeMS)
    {
        this.readRequestDelayMS = sleepTimeMS;
    }

    /**
     * Sets the read request span batch size.
     *
     * @param batchSize the read request span batch size
     */
    public void setReadRequestSpanBatchSize(int batchSize)
    {
        if (batchSize < 1)
        {
            batchSize = DEFAULT_READ_REQUEST_SPAN_BATCH_SIZE;
        }

        this.readRequestBatchSize = batchSize;
    }

    /**
     * Simulate a handle failure and use the file token instead. The handle is set to an invalid value so the THOR node
     * will indicate that the handle is unknown and request a otken.
     *
     * @param v
     *            true indicates that an invalid handle should be sent to force the fall back to a token. NOTE: this
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
     * Force the use of tokens instead of handles for established connections.
     *
     * @param v
     *            the setting
     */
    public void setForceTokenUse(boolean v)
    {
        this.forceTokenUse = v;
    }

    /**
     * This method now does nothing as handle use is now the default.
     * @param v boolean for Force Handle Use
     *
     * @deprecated
     */
    public void setForceHandleUse(boolean v)
    {
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

    /**
     * Starts a block fetching request for the requested records.
     *
     * Starts a block fetching request that will block until all of the requested records have been consumed.
     * Should only be called from a separate thread from the thread that is consuming data from the input stream.
     * @param fetchOffsets
     *          List of offset locations to fetch.
     * @throws Exception a {@link java.lang.Exception} object.
     */
    public void startBlockingFetchRequest(List<Long> fetchOffsets) throws Exception
    {
        if (inFetchingMode == false)
        {
            Exception wrappedException = new Exception("Error: attempted to start a fetch request for an input stream in sequential read mode.");
            if (fileReadSpan != null)
            {
                Attributes attributes = Attributes.of(  AttributeKey.longKey("server.index"), Long.valueOf(getFilePartCopy()),
                                                        ExceptionAttributes.EXCEPTION_MESSAGE, wrappedException.getMessage());
                fileReadSpan.recordException(wrappedException, attributes);
            }
            throw wrappedException;
        }

        // Clear stream information, but keep streamPos & markPos as they are due to potential wrapping counting streams
        readPos = 0;
        totalDataInCurrentRequest = 0;
        remainingDataInCurrentRequest = 0;

        // Clear restart info
        streamPosOfFetchStart = 0;
        synchronized (streamPosOfFetches)
        {
            streamPosOfFetches.clear();
            tokenBinOfFetches.clear();
        }

        this.fetchRequestOffsets.clear();
        this.fetchRequestOffsets.addAll(fetchOffsets);

        if (CompileTimeConstants.PROFILE_CODE)
        {
            long nsStartFetch = System.nanoTime();
            totalDataInCurrentRequest = startFetch();
            remainingDataInCurrentRequest = totalDataInCurrentRequest;
            nsStartFetch = System.nanoTime() - nsStartFetch;
            fetchStartTimeNS += nsStartFetch;
        }
        else
        {
            totalDataInCurrentRequest = startFetch();
            remainingDataInCurrentRequest = totalDataInCurrentRequest;
        }

        if (CompileTimeConstants.PROFILE_CODE)
        {
            long nsFetching = System.nanoTime();
            while (remainingDataInCurrentRequest > 0)
            {
                readDataInFetch();
            }
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
            while (remainingDataInCurrentRequest > 0)
            {
                readDataInFetch();
            }
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

    private void startNewReadRequestSpan()
    {
        if (fileReadSpan != null)
        {
            // finishReadRequestSpan will clear the readRequestSpan when it is finished
            boolean shouldStartNewSpan = readRequestSpan == null;
            if (shouldStartNewSpan)
            {
                readRequestSpan = Utils.createChildSpan(fileReadSpan, "ReadRequest[" + readRequestCount
                                    + "," + (readRequestCount + readRequestBatchSize) + "]");
                readRequestSpan.setAttribute("server.index", getFilePartCopy());
                readRequestSpan.setStatus(StatusCode.OK);
                readRequestStart = readRequestCount;
            }
            readRequestCount++;

            currentReadRequestEvent = new ReadRequestEvent();
            currentReadRequestEvent.requestTime = System.currentTimeMillis();
            currentReadRequestEvent.requestStreamPos = streamPos;
            currentReadRequestEvent.requestSize = maxReadSizeKB*1000;
        }
    }

    private void finishReadRequestSpan()
    {
        if (readRequestSpan != null)
        {
            if (currentReadRequestEvent != null)
            {
                currentReadRequestEvent.responseTime = System.currentTimeMillis();
                currentReadRequestEvent.bytesRead = totalDataInCurrentRequest;
                readRequestEvents.add(currentReadRequestEvent);

                currentReadRequestEvent = null;
            }

            int batchIndex = readRequestCount % readRequestBatchSize;
            if (batchIndex == 0 || isClosed())
            {
                List<String> requestTimes = new ArrayList<String>();
                List<String> responseTimes = new ArrayList<String>();
                List<Long> requestSizes = new ArrayList<Long>();
                List<Long> bytesRead = new ArrayList<Long>();
                List<Long> requestStreamPos = new ArrayList<Long>();

                for (ReadRequestEvent event : readRequestEvents)
                {
                    requestTimes.add( (new Timestamp(event.requestTime)).toString() );
                    responseTimes.add( (new Timestamp(event.responseTime)).toString() );
                    requestSizes.add((long)event.requestSize);
                    bytesRead.add((long)event.bytesRead);
                    requestStreamPos.add(event.requestStreamPos);
                }
                readRequestEvents.clear();

                readRequestSpan.setAttribute(AttributeKey.stringArrayKey("requestTimes"), requestTimes);
                readRequestSpan.setAttribute(AttributeKey.stringArrayKey("responseTimes"), responseTimes);
                readRequestSpan.setAttribute(AttributeKey.longArrayKey("requestSizes"), requestSizes);
                readRequestSpan.setAttribute(AttributeKey.longArrayKey("bytesRead"), bytesRead);
                readRequestSpan.setAttribute(AttributeKey.longArrayKey("requestStreamPos"), requestStreamPos);
                readRequestSpan.updateName( "ReadRequest[" + readRequestStart + "," + readRequestCount + "]");

                readRequestSpan.end();
                readRequestSpan = null;
            }
        }
    }


    // Run from prefetch thread only
    private int startFetch()
    {
        if (this.closed.get())
        {
            return -1;
        }
        String prefix = "RowServiceInputStream.startFetch(), file "   + dataPart.getFileName() + " part " + dataPart.getThisPart() + " on IP " + getIP() + ":";

        //------------------------------------------------------------------------------
        // If we haven't made the connection active, activate it now and send the
        // first request.
        //
        // If we are in fetching mode and the connection is active send the
        // "read ahead" request
        //------------------------------------------------------------------------------

        String readAheadRequest = null;
        numFetches++;
        if (!this.active.get())
        {
            startNewReadRequestSpan();

            try
            {
                makeActive();
            }
            catch (HpccFileException e)
            {
                setPrefetchException(e);
                try
                {
                    close();
                }
                catch(Exception ie){}
                return -1;
            }
        }
        else
        {
            // Send read ahead request when inFetchingMode
            if (inFetchingMode)
            {
                if (this.simulateFail) this.handle = -1;
                readAheadRequest = (this.forceTokenUse) ? this.makeTokenRequest() : this.makeHandleRequest();

                try
                {
                    int requestLen = readAheadRequest.length();
                    this.dos.writeInt(requestLen);
                    this.dos.write(readAheadRequest.getBytes(HPCCCharSet), 0, requestLen);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    setPrefetchException(new HpccFileException(prefix + "Failure sending read ahead transaction:" + e.getMessage(), e));
                    try
                    {
                        close();
                    }
                    catch(Exception ie){}
                }
            }
        }

        //------------------------------------------------------------------------------
        // Read the response from the request
        //------------------------------------------------------------------------------

        boolean inTokenRetry = false;
        do
        {
            RowServiceResponse response = null;
            try
            {
                response = readResponse();
            }
            catch (HpccFileException e)
            {
                setPrefetchException(e);
                try
                {
                    close();
                }
                catch(Exception ie){}
                return -1;
            }

            if (response.errorCode != RFCCodes.RFCStreamNoError)
            {
                setPrefetchException(new HpccFileException(prefix + response.errorMessage));
                try
                {
                    close();
                }
                catch (IOException e)
                {}

                return -1;
            }

            // If len < 0 we have finished reading the file
            if (response.len < 0)
            {
                try
                {
                    close();
                }
                catch (IOException e)
                {
                    setPrefetchException(new HpccFileException(prefix + "response length was < 0; error closing file:" + e.getMessage()));
                }
                return -1;
            }

            //------------------------------------------------------------------------------
            // Retry with the token if handle is invalid
            //------------------------------------------------------------------------------

            this.handle = response.handle;
            if (this.handle <= 0 && !inTokenRetry)
            {
                inTokenRetry = true;

                String retryTrans = this.makeTokenRequest();
                int len = retryTrans.length();
                try
                {
                    this.dos.writeInt(len);
                    this.dos.write(retryTrans.getBytes(HPCCCharSet), 0, len);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    setPrefetchException(new HpccFileException(prefix + "Failed on remote read read retry:" + e.getMessage(), e));
                    return -1;
                }
            }
            else if (this.handle == 0)
            {
                setPrefetchException(new HpccFileException(prefix + "response.handle was null, Read retry failed"));
                try
                {
                    close();
                }
                catch(Exception e){}
                return -1;
            }
            else
            {
                inTokenRetry = false;
            }
        }
        while(inTokenRetry);

        //------------------------------------------------------------------------------
        // Read / return the length of the record data in this request
        //------------------------------------------------------------------------------

        int dataLen = 0;
        try
        {
            dataLen = dis.readInt();
            if (inFetchingMode == false)
            {
                if (dataLen == 0)
                {
                    // Read handle before closing
                    dis.readInt();
                    close();
                    return 0;
                }
            }
        }
        catch (IOException e)
        {
            setPrefetchException(new HpccFileException(prefix + "Error during read block:" + e.getMessage(), e));
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
        String prefix = "RowServiceInputStream.readDataInFetch(), file "   + dataPart.getFileName() + "part " + dataPart.getThisPart() + " on IP " + getIP() + ":";
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
                bytesToRead = this.dis.available();
                if (bytesToRead < 0)
                {
                    IOException wrappedException = new IOException(prefix + "Encountered unexpected end of stream mid fetch, this.dis.available() returned " + bytesToRead + " bytes.");
                    if (fileReadSpan != null)
                    {
                        Attributes attributes = Attributes.of(  AttributeKey.longKey("server.index"), Long.valueOf(getFilePartCopy()),
                                                                ExceptionAttributes.EXCEPTION_MESSAGE, wrappedException.getMessage());
                        fileReadSpan.recordException(wrappedException, attributes);
                    }
                    throw wrappedException;
                }

                // Either due to a bug in the JVM or due to a design issue
                // available can return 0 even in cases where there is data available.
                // So always attempt to read at least some data
                if (bytesToRead < MIN_SOCKET_READ_SIZE)
                {
                    bytesToRead = MIN_SOCKET_READ_SIZE;
                }

                // Limit bytes to read based on remaining data in request and buffer capacity
                bytesToRead = Math.min(remainingBufferCapacity,
                              Math.min(bytesToRead,remainingDataInCurrentRequest));
                dis.readFully(this.readBuffer, currentBufferLen, bytesToRead);
            }
            catch (IOException e)
            {
                setPrefetchException(new HpccFileException(prefix + "Error during read block:" + e.getMessage(), e));
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
            if (this.readBufferDataLen.get() > (this.bufferPrefetchThresholdKB * 1024))
            {
                return;
            }
        }
    }

    private void finishFetch()
    {
        String prefix = "RowServiceInputStream.finishFetch(), file "   + dataPart.getFileName() + "part " + dataPart.getThisPart() + " on IP " + getIP() + ":";
        if (this.closed.get())
        {
            return;
        }

        //------------------------------------------------------------------------------
        // Read token that represents the cursor for the end of this request
        //------------------------------------------------------------------------------

        try
        {
            if (dis==null) {
                return;
            }
            int tokenLen = dis.readInt();
            if (tokenLen == 0)
            {
                close();
                return;
            }

            if (this.tokenBin == null || tokenLen > this.tokenBin.length)
            {
                this.tokenBin = new byte[tokenLen];
            }
            dis.readFully(this.tokenBin,0,tokenLen);

            this.streamPosOfFetchStart += totalDataInCurrentRequest;
            synchronized (streamPosOfFetches)
            {
                streamPosOfFetches.add(this.streamPosOfFetchStart);
                tokenBinOfFetches.add(this.tokenBin);
            }
        }
        catch (IOException e)
        {
            setPrefetchException(new HpccFileException(prefix + "Error during finish request read block: " + e.getMessage(), e));
            try
            {
                close();
            }
            catch(Exception ie){}
        }

        finishReadRequestSpan();


        //------------------------------------------------------------------------------
        // Send read ahead request
        //------------------------------------------------------------------------------

        if (inFetchingMode == false)
        {
            startNewReadRequestSpan();
            if (readRequestDelayMS > 0)
            {
                try
                {
                    Thread.sleep(readRequestDelayMS);
                }
                catch (InterruptedException e)
                {
                    // We don't care about waking early
                }
            }

            // Create the read ahead request
            if (this.simulateFail) this.handle = -1;
            String readAheadRequest = (this.forceTokenUse) ? this.makeTokenRequest() : this.makeHandleRequest();

            try
            {
                int requestLen = readAheadRequest.length();
                this.dos.writeInt(requestLen);
                this.dos.write(readAheadRequest.getBytes(HPCCCharSet), 0, requestLen);
                this.dos.flush();
            }
            catch (IOException e)
            {
                setPrefetchException(new HpccFileException(prefix + "Failure sending read ahead transaction:" + e.getMessage(), e));
                try
                {
                    close();
                }
                catch(Exception ie){}
            }
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
                totalDataInCurrentRequest = startFetch();
                remainingDataInCurrentRequest = totalDataInCurrentRequest;
                nsStartFetch = System.nanoTime() - nsStartFetch;
                fetchStartTimeNS += nsStartFetch;
            }
            else
            {
                totalDataInCurrentRequest = startFetch();
                remainingDataInCurrentRequest = totalDataInCurrentRequest;
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
        String prefix = "RowServiceInputStream.available(), file "   + dataPart.getFileName() + " part " + dataPart.getThisPart() + " on IP " + getIP() + ":";

        // Do the check for closed first here to avoid data races
        if (this.closed.get())
        {
            if (this.prefetchException != null)
            {
                throw new IOException("Prefetch thread exited early exception:" + prefetchException.getMessage(), this.prefetchException);
            }

            int bufferLen = this.readBufferDataLen.get();
            int availBytes = bufferLen - this.readPos;
            if (availBytes == 0)
            {
                // this.bufferWriteMutex.release();
                IOException wrappedException = new IOException(prefix + "End of input stream, bufferLen:" + bufferLen + ", this.readPos:" + this.readPos + ", availableBytes=0");
                throw wrappedException;
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

            finishReadRequestSpan();

            this.sendCloseFileRequest();

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
            throw new IOException(this.prefetchException.getMessage(),this.prefetchException);
        }

        // We are waiting on a single byte so hot loop
        long waitNS = System.nanoTime();
        try
        {
            while (this.available() < 1)
            {
                long currentWaitNS = System.nanoTime() - waitNS;
                if (currentWaitNS >= MAX_HOT_LOOP_NS)
                {
                    try
                    {
                        if (CompileTimeConstants.PROFILE_CODE)
                        {
                            long sleepTime = System.nanoTime();
                            Thread.sleep(SHORT_SLEEP_MS);
                            sleepTime = System.nanoTime() - sleepTime;
                            sleepTimeNS += sleepTime;
                        }
                        else
                        {
                            Thread.sleep(SHORT_SLEEP_MS);
                        }
                    }
                    catch(InterruptedException e) {/*We don't care about waking early*/}
                }
            }

            if (CompileTimeConstants.PROFILE_CODE)
            {
                waitNS = System.nanoTime() - waitNS;
                waitTimeNS += waitNS;

                float timeUS = waitNS / 1000.0f;
                if (timeUS >= LONG_WAIT_THRESHOLD_US)
                {
                    numLongWaits++;
                }
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
            throw new IOException(this.prefetchException.getMessage(),prefetchException);
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
            throw new IOException(this.prefetchException.getMessage(),prefetchException);
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
            throw new IOException(this.prefetchException.getMessage(),prefetchException);
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

    @Override
    public List<IMetric> getMetrics()
    {
        ArrayList<IMetric> metrics = new ArrayList<IMetric>();
        metrics.add(new SimpleMetric((double) this.streamPos,BYTES_READ_METRIC,new Units(Units.Type.BYTES)));
        metrics.add(new SimpleMetric((double) this.firstByteTimeNS,FIRST_BYTE_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.waitTimeNS,WAIT_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.sleepTimeNS,SLEEP_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.fetchStartTimeNS,FETCH_START_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.fetchTimeNS,FETCH_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.fetchFinishTimeNS,FETCH_FINISH_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.closeTimeNS,CLOSE_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.mutexWaitTimeNS,MUTEX_WAIT_TIME_METRIC,new Units(Units.Type.SECONDS,Units.Scale.NANO)));
        metrics.add(new SimpleMetric((double) this.numLongWaits,LONG_WAITS_METRIC,new Units(Units.Type.COUNT)));
        metrics.add(new SimpleMetric((double) this.numFetches,FETCHES_METRIC,new Units(Units.Type.COUNT)));
        metrics.add(new SimpleMetric((double) this.numPartialBlockReads,PARTIAL_BLOCK_READS_METRIC,new Units(Units.Type.COUNT)));
        metrics.add(new SimpleMetric((double) this.numBlockReads,BLOCK_READS_METRIC,new Units(Units.Type.COUNT)));

        return metrics;
    }

    private void makeActive() throws HpccFileException
    {
        this.active.set(false);
        this.handle = 0;
        String prefix = "RowServiceInputStream.makeActive, file "  + dataPart.getFileName() + " part " + dataPart.getThisPart() + " on IP " + getIP() + ":";

        Span connectSpan = null;
        if (fileReadSpan != null)
        {

            connectSpan = Utils.createChildSpan(fileReadSpan, "Connect");
            connectSpan.setAttribute("server.index", getFilePartCopy());
        }


        boolean needsRetry = false;
        do
        {
            needsRetry = false;
            try
            {
                log.debug("Attempting to connect to file part : '" + dataPart.getThisPart() + "' Copy: '"
                        + (getFilePartCopy() + 1) + "' on IP: '" + getIP() + "'" + " for Path: '" + getCopyPath() + "'");
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

                    this.sock.setSoTimeout(socketOpTimeoutMs);

                    log.debug("Connected: Remote address = " + sock.getInetAddress().toString() + " Remote port = " + sock.getPort());
                }
                catch (java.net.UnknownHostException e)
                {
                    HpccFileException wrappedException = new HpccFileException(prefix +  "Bad file part IP address or host name: " + e.getMessage(),e);

                    if (connectSpan != null)
                    {
                        connectSpan.recordException(wrappedException);
                        connectSpan.setStatus(StatusCode.ERROR);
                        connectSpan.end();
                    }

                    throw wrappedException;
                }
                catch (java.io.IOException e)
                {
                    HpccFileException wrappedException = new HpccFileException(prefix + " error making part active:" + e.getMessage(),e);

                    if (connectSpan != null)
                    {
                        connectSpan.recordException(wrappedException);
                        connectSpan.setStatus(StatusCode.ERROR);
                        connectSpan.end();
                    }

                    throw wrappedException;
                }

                try
                {
                    this.dos = new java.io.DataOutputStream(sock.getOutputStream());
                    this.dis = new java.io.DataInputStream(sock.getInputStream());
                }
                catch (java.io.IOException e)
                {
                    HpccFileException wrappedException = new HpccFileException(prefix + " Failed to make streams for datapart:" + e.getMessage(), e);

                    if (connectSpan != null)
                    {
                        connectSpan.recordException(wrappedException);
                        connectSpan.setStatus(StatusCode.ERROR);
                        connectSpan.end();
                    }

                    throw wrappedException;
                }

                if (connectSpan != null)
                {
                    connectSpan.setStatus(StatusCode.OK);
                    connectSpan.end();
                }

                //------------------------------------------------------------------------------
                // Check protocol version
                //------------------------------------------------------------------------------


                Span versionSpan = null;
                if (fileReadSpan != null)
                {
                    versionSpan = Utils.createChildSpan(fileReadSpan, "VersionRequest");
                    versionSpan.setAttribute( AttributeKey.longKey("server.index"), Long.valueOf(getFilePartCopy()) );
                    versionSpan.setStatus(StatusCode.OK);
                }

                try
                {
                    String msg = makeGetVersionRequest();
                    int msgLen = msg.length();

                    this.dos.writeInt(msgLen);
                    this.dos.write(msg.getBytes(HPCCCharSet), 0, msgLen);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    HpccFileException wrappedException = new HpccFileException(prefix+ " Failed on initial remote read transfer: " + e.getMessage(),e);
                    if (versionSpan != null)
                    {
                        versionSpan.setStatus(StatusCode.ERROR);
                        versionSpan.recordException(wrappedException);
                        versionSpan.end();
                    }

                    throw wrappedException;
                }

                RowServiceResponse response = readResponse();
                if (response.len == 0)
                {
                    useOldProtocol = true;
                }
                else
                {
                    useOldProtocol = false;

                    byte[] versionBytes = new byte[response.len];
                    try
                    {
                        this.dis.readFully(versionBytes);
                    }
                    catch (IOException e)
                    {
                        HpccFileException wrappedException = new HpccFileException(prefix + "Error while attempting to read version response:" + e.getMessage(), e);
                        if (versionSpan != null)
                        {
                            versionSpan.setStatus(StatusCode.ERROR);
                            versionSpan.recordException(wrappedException);
                            versionSpan.end();
                        }

                        throw wrappedException;
                    }

                    rowServiceVersion = new String(versionBytes, HPCCCharSet);
                }

                if (versionSpan != null)
                {
                    versionSpan.setAttribute(ServiceAttributes.SERVICE_VERSION, rowServiceVersion);
                    versionSpan.end();
                }

                //------------------------------------------------------------------------------
                // Send initial read request
                //------------------------------------------------------------------------------

                startNewReadRequestSpan();
                try
                {
                    String readTrans = null;
                    if (this.tokenBin == null)
                    {
                        this.tokenBin = new byte[0];
                        readTrans = makeInitialRequest();
                    }
                    else
                    {
                        readTrans = makeTokenRequest();
                    }

                    int transLen = readTrans.length();
                    this.dos.writeInt(transLen);
                    this.dos.write(readTrans.getBytes(HPCCCharSet), 0, transLen);
                    this.dos.flush();
                }
                catch (IOException e)
                {
                    HpccFileException wrappedException = new HpccFileException(prefix + " Failed on initial remote read read trans:" + e.getMessage(), e);

                    if (readRequestSpan != null)
                    {
                        readRequestSpan.recordException(wrappedException);
                        readRequestSpan.setStatus(StatusCode.ERROR);
                        readRequestSpan.end();
                    }

                    throw wrappedException;
                }

                if (CompileTimeConstants.PROFILE_CODE)
                {
                    firstByteTimeNS = System.nanoTime();
                }

                this.active.set(true);
            }
            catch (Exception e)
            {
                log.error(prefix + ": Could not reach file part: '" + dataPart.getThisPart() + "' copy: '" + (getFilePartCopy() + 1) + "' on IP: '" + getIP() + ":" + e.getMessage(),e);

                needsRetry = true;
                if (!setNextFilePartCopy())
                {
                    throw new HpccFileException(prefix + " Unsuccessfuly attempted to connect to all file part copies", e);
                }
            }
        } while (needsRetry);
    }

    /* Notes on protocol:
    *
    * A JSON request with these top-level fields:
    * "format" - the format of the reply. Supported formats = "binary", "xml", "json"
    * "handle" - the handle of for a file session that was previously open (for continuation)
    * "commCompression" - compression format of the communication protocol. Supports "LZ4", "LZW", "FLZ" (TBD: "ZLIB")
    * "replyLimit" - Number of K to limit each reply size to. (default 1024)
    * "node" - contains all 'activity' properties below:
    *
    * For a secured dafilesrv (streaming protocol), requests will only be accepted if the meta blob ("metaInfo") has a matching signature.
    * The request must specify "filePart" (1 based) to denote the partition # being read from or written to.
    *
    * "filePartCopy" (1 based) defaults to 1
    *
    * "kind" - supported kinds = "diskread", "diskwrite", "indexread", "indexcount" (TBD: "diskcount", "indexwrite", "disklookup")
    * NB: disk vs index will be auto detected if "kind" is absent.
    *
    * "action" - supported actions = "count" (used if "kind" is auto-detected to specify count should be performed instead of read)
    *
    * "keyFilter" - filter the results by this expression (See: HPCC-18474 for more details).
    *
    * "chooseN" - maximum # of results to return
    *
    * "compressed" - specifies whether input file is compressed. NB: not relevant to "index" types. Default = false. Auto-detected.
    *
    * "input" - specifies layout on disk of the file being read.
    *
    * "output" - where relavant, specifies the output format to be returned
    *
    * "fileName" is only used for unsecured non signed connections (normally forbidden), and specifies the fully qualified path to a physical file.
    *
    */

    /* Example JSON request:
    *
    * {
    *  "format" : "binary",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "commCompression" : "LZ4",
    *  "node" : {
    *   "metaInfo" : "",
    *   "filePart" : 2,
    *   "filePartCopy" : 1,
    *   "kind" : "diskread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "chooseN" : 5,
    *   "compressed" : "false"
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *  }
    * }
    * OR
    * {
    *  "format" : "binary",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "commCompression" : "LZ4",
    *  "node" : {
    *   "kind" : "diskread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "chooseN" : 5,
    *   "compressed" : "false"
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *  }
    * }
    * OR
    * {
    *  "format" : "xml",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "node" : {
    *   "kind" : "diskread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "chooseN" : 5,
    *   "compressed" : "false"
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *  }
    * }
    * OR
    * {
    *  "format" : "xml",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "node" : {
    *   "kind" : "indexread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *  }
    * OR
    * {
    *  "format" : "xml",
    *  "command": "newstream",
    *  "node" : {
    *   "kind" : "xmlread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *   "ActivityOptions" : { // usually not required, options here may override file meta info.
    *    "rowTag" : "/Dataset/OtherRow"
    *   }
    *  }
    * OR
    * {
    *  "format" : "xml",
    *  "command": "newstream",
    *  "node" : {
    *   "kind" : "csvread",
    *   "fileName": "examplefilename",
    *   "keyFilter" : "f1='1    '",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *   "output" : {
    *    "f2" : "string",
    *    "f1" : "real"
    *   }
    *   "ActivityOptions" : { // usually not required, options here may override file meta info.
    *    "csvQuote" : "\"",
    *    "csvSeparate" : ","
    *    "csvTerminate" : "\\n,\\r\\n",
    *   }
    *  }
    * OR
    * {
    *  "format" : "xml",
    *  "command": "newstream",
    *  "node" : {
    *   "action" : "count",            // if present performs count with/without filter and returns count
    *   "fileName": "examplefilename", // can be either index or flat file
    *   "keyFilter" : "f1='1    '",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   },
    *  }
    * }
    * OR
    * {
    *  "format" : "binary",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "commCompression" : "LZ4",
    *  "node" : {
    *   "kind" : "diskwrite",
    *   "fileName": "examplefilename",
    *   "compressed" : "false" (or "LZ4", "FLZ", "LZW")
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   }
    *  }
    * }
    * OR
    * {
    *  "format" : "binary",
    *  "handle" : "1234",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "node" : {
    *   "kind" : "indexwrite",
    *   "fileName": "examplefilename",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   }
    *  }
    * }
    *
    * Fetch fpos stream example:
    * {
    *  "format" : "binary",
    *  "command": "newstream",
    *  "replyLimit" : "64",
    *  "fetch" : {
    *   "fpos" : "30",
    *   "fpos" : "90"
    *  },
    *  "node" : {
    *   "kind" : "diskread",
    *   "fileName": "examplefilename",
    *   "input" : {
    *    "f1" : "string5",
    *    "f2" : "string5"
    *   }
    *  }
    * }
    *
    * fetch continuation:
    * {
    *  "format" : "binary",
    *  "handle" : "1234",
    *  "command": "continue",
    *  "replyLimit" : "64",
    *  "fetch" : {
    *   "fpos" : "120",
    *   "fpos" : "135",
    *   "fpos" : "150"
    *  }
    * }
    *
    * close an open file
    * {
    *  "format" : "binary",
    *  "command": "close",
    *  "handle" : "1234",
    *  "close"  : "true"
    * }
    *
    * {  "command": "version"   "handle": "-1"}
    */

    private void makeFetchObject(StringBuilder sb)
    {
        if (inFetchingMode)
        {
            sb.append("\"fetch\" : {\n");
            for (int i = 0; i < fetchRequestOffsets.size(); i++)
            {
                sb.append("\"fpos\" : " + fetchRequestOffsets.get(i));
                if (i != fetchRequestOffsets.size())
                {
                    sb.append(",\n");
                }
                else
                {
                    sb.append("\n");
                }
            }
            sb.append("},\n");
        }
    }

    private String makeGetVersionRequest()
    {
        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        final String versionMsg = RFCCodes.RFCStreamReadCmd + "{ \"command\" : \"version\", \"handle\": \"-1\", " + trace + " \"format\": \"binary\" }";
        return versionMsg;
    }

    private String makeInitialRequest()
    {
        StringBuilder sb = new StringBuilder(256);

        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\", \n");
        sb.append("\"replyLimit\" : " + this.maxReadSizeKB + ",\n");

        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        sb.append(trace);

        if (!useOldProtocol)
        {
            sb.append("\"command\" : \"newstream\", \n");
        }

        if (inFetchingMode)
        {
            makeFetchObject(sb);
        }

        sb.append(makeNodeObject());
        sb.append("\n}\n");

        return sb.toString();
    }

    private String makeNodeObject()
    {
        StringBuilder sb = new StringBuilder(256);

        sb.append(" \"node\" : {\n ");

        DataPartition.FileType fileType = this.dataPart.getFileType();
        sb.append("\"kind\" : \"");
        sb.append(fileType.toString() + "read\",\n");

        sb.append("\"metaInfo\" : \"");
        sb.append(this.dataPart.getFileAccessBlob());
        sb.append("\",\n \"filePart\" : \"");
        sb.append(this.dataPart.getThisPart());
        sb.append("\", \n");
        sb.append("\"filePartCopy\" : \"");
        sb.append(getFilePartCopy() + 1);
        sb.append("\", \n");

        // Do not apply filters and limits when inFetchingMode
        if (inFetchingMode == false)
        {
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
        }

        sb.append("\n \"input\" : ");
        sb.append(jsonRecordDefinition);
        sb.append(", \n \"output\" : ");
        sb.append(projectedJsonRecordDefinition);
        sb.append("\n }");
        return sb.toString();
    }

    private String makeHandleRequest()
    {
        StringBuilder sb = new StringBuilder(256);

        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("  \"handle\" : \"" + Integer.toString(this.handle) + "\",");

        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        sb.append(trace);

        if (!useOldProtocol)
        {
            sb.append("\"command\" : \"continue\", \n");
        }

        if (inFetchingMode)
        {
            makeFetchObject(sb);
        }

        sb.append("\n}");

        return sb.toString();
    }

    private String makeTokenRequest()
    {
        StringBuilder sb = new StringBuilder(256);

        sb.append(RFCCodes.RFCStreamReadCmd);
        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("\"replyLimit\" : " + this.maxReadSizeKB + ",\n");

        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        sb.append(trace);

        if (!useOldProtocol)
        {
            sb.append("\"command\" : \"newstream\", \n");
        }

        sb.append(makeNodeObject());
        sb.append(",\n");
        sb.append("  \"cursorBin\" : \""); // dafilesrv calls our "token" a cursor. Renamed on our side to reduce confusion
        sb.append(java.util.Base64.getEncoder().encodeToString(this.tokenBin));
        sb.append("\" \n}\n");
        return sb.toString();
    }

    private String makeCloseHandleRequest()
    {
        StringBuilder sb = new StringBuilder(256);

        sb.append("{ \"format\" : \"binary\",\n");
        sb.append("  \"handle\" : \"" + Integer.toString(this.handle) + "\",");

        final String trace = traceContextHeader != null ? "\"_trace\": { \"traceparent\" : \"" + traceContextHeader + "\" },\n" : "";
        sb.append(trace);

        sb.append("  \"command\" : \"close\"");
        sb.append("\n}");

        return sb.toString();
    }

    private void sendCloseFileRequest() throws IOException
    {
        String prefix = "RowServiceInputStream.sendCloseFileRequest(), file  "  + dataPart.getFileName() + " part " + dataPart.getThisPart() + " on IP " + getIP() + ":";

        if (useOldProtocol)
        {
            return;
        }

        Span closeSpan = null;
        if (fileReadSpan != null)
        {
            closeSpan = Utils.createChildSpan(fileReadSpan, "CloseRequest");
            closeSpan.setAttribute("server.index", getFilePartCopy());
            closeSpan.setStatus(StatusCode.OK);
        }

        String closeFileRequest = makeCloseHandleRequest();
        int jsonRequestLen = closeFileRequest.length();

        try
        {
            this.dos.writeInt(jsonRequestLen + 4 + 1);
            this.dos.write((int)RFCCodes.RFCStreamGeneral);
            this.dos.writeInt(jsonRequestLen);
            this.dos.write(closeFileRequest.getBytes(HPCCCharSet));
            this.dos.flush();
        }
        catch (IOException e)
        {
            throw new IOException(prefix + " Failed on close file with error: " + e.getMessage(), e);
        }

        try
        {
            RowServiceResponse response = readResponse();
        }
        catch (HpccFileException e)
        {
            IOException wrappedException = new IOException(prefix + "Failed to close file. Unable to read response with error: " + e.getMessage(), e);
            if (closeSpan != null)
            {
                closeSpan.recordException(wrappedException);
                closeSpan.setStatus(StatusCode.ERROR);
                closeSpan.end();
            }
            throw wrappedException;
        }

        if (closeSpan != null)
        {
            closeSpan.end();
        }
    }

    private RowServiceResponse readResponse() throws HpccFileException
    {
        RowServiceResponse response = new RowServiceResponse();
        String prefix="RowServiceInputStream.readResponse(): , file "  + dataPart.getFileName() + " part " + dataPart.getThisPart() + " on IP " + getIP() + ": ";
        try
        {
            response.len = dis.readInt();
            if (response.len < 0)
            {
                response.len &= 0x7FFFFFFF;
            }

            if (response.len == 0)
            {
                response.len = -1;
                return response;
            }

            response.errorCode = dis.readInt();
            response.len -= 4;

            if (response.errorCode != RFCCodes.RFCStreamNoError)
            {
                StringBuilder sb = new StringBuilder(256);

                sb.append("\nReceived ERROR from Thor node (");
                sb.append(this.getIP());
                sb.append("): Code: '");
                sb.append(response.errorCode);
                sb.append("'");

                if (response.len > 0)
                {
                    byte[] message = new byte[response.len];
                    dis.readFully(message, 0, response.len);
                    sb.append(" Message: '");
                    sb.append(new String(message));
                    sb.append("'");
                }

                switch (response.errorCode)
                {
                    case RFCCodes.DAFSERR_cmdstream_invalidexpiry:
                        sb.append("\nInvalid file access expiry reported - change File Access Expiry (HPCCFile) and retry");
                        break;
                    case RFCCodes.DAFSERR_cmdstream_authexpired:
                        sb.append("\nFile access expired before initial request - Retry and consider increasing File Access Expiry (HPCCFile) to something greater than " + this.socketOpTimeoutMs);
                        break;
                    default:
                        break;
                }

                response.len = -1;
                response.errorMessage = sb.toString();
                return response;
            }

            if (response.len < 4)
            {
                throw new HpccFileException(prefix + "Early data termination, no handle. response length < 4");
            }

            response.handle = dis.readInt();
            response.len -= 4;
        }
        catch (IOException e)
        {
            throw new HpccFileException(prefix + "Error while attempting to read row service response: " + e.getMessage(), e);
        }

        return response;
    }
}
