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

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.util.Iterator;

/**
 * Remote file reader the reads the data represented by a @see org.hpccsystems.dfs.client.DataPartition
 * Remote file reader the reads the data represented by a @see org.hpccsystems.dfs.client.DataPartition
 * and constructs records via the provided @see org.hpccsystems.dfs.client#IRecordBuilder.
 */
public class HpccRemoteFileReader<T> implements Iterator<T>
{
    private static final Logger   log               = LogManager.getLogger(HpccRemoteFileReader.class);

    private FieldDef              originalRecordDef = null;
    private DataPartition         dataPartition     = null;
    private RowServiceInputStream inputStream       = null;
    private BinaryRecordReader    binaryRecordReader;
    private IRecordBuilder        recordBuilder     = null;
    private boolean               handlePrefetch    = true;
    private boolean               isClosed          = false;
    private boolean               canReadNext       = true;
    private boolean               createPrefetchThread = true;
    private int                   retryCount        = 0;
    private int                   connectTimeout    = 0;
    private int                   readSizeKB        = 0;
    private int                   limit             = -1;
    private int                   maxReadRetries    = DEFAULT_READ_RETRIES;
    private int                   socketOpTimeoutMs = 0;
    private long                  openTimeMs        = 0;
    private long                  recordsRead       = 0;

    public static final int    NO_RECORD_LIMIT                  = -1;
    public static final int    DEFAULT_READ_SIZE_OPTION         = -1;
    public static final int    DEFAULT_CONNECT_TIMEOUT_OPTION   = -1;
    public static final int    DEFAULT_READ_RETRIES             = 3;

    public static class FileReadResumeInfo
    {
        public long inputStreamPos = 0;
        public byte[] tokenBin = null;
        public long recordReaderStreamPos = 0;
    };

    /**
     * Instantiates a new hpcc remote file reader.
     *
     * @param dp
     *            the dp
     * @param originalRD
     *            the original RD
     * @param recBuilder
     *            the rec builder
     * @throws Exception
     *             the exception
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder) throws Exception
    {
        this(dp,originalRD,recBuilder,DEFAULT_CONNECT_TIMEOUT_OPTION);
    }

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     *
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout
     *            the connection timeout in seconds, -1 for default
     * @throws Exception
     *             the exception
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout) throws Exception
    {
        this(dp, originalRD, recBuilder, connectTimeout, NO_RECORD_LIMIT);
    }

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     *
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout
     *            the connection timeout in milliseconds, -1 for default
     * @param limit
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @throws Exception
     *            general exception
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout, int limit) throws Exception
    {
        this(dp, originalRD, recBuilder, connectTimeout, limit, true, DEFAULT_READ_SIZE_OPTION);
    }

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     *
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout
     *            the connection timeout in seconds, -1 for default
     * @param limit
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @param createPrefetchThread
     *            the input stream should create and manage prefetching on its own thread. If false prefetch needs to be called on another thread periodically.
     * @param readSizeKB
     *            read request size in KB, -1 specifies use default value
     * @throws Exception
     * 			  general exception
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout, int limit, boolean createPrefetchThread, int readSizeKB) throws Exception
    {
        this(dp, originalRD, recBuilder, connectTimeout, limit, createPrefetchThread, readSizeKB, null);
    }

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     *
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout
     *            the connection timeout in seconds, -1 for default
     * @param limit
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @param createPrefetchThread
     *            the input stream should create and manage prefetching on its own thread. If false prefetch needs to be called on another thread periodically.
     * @param readSizeKB
     *            read request size in KB, -1 specifies use default value
     * @param resumeInfo
     *            FileReadeResumeInfo data required to restart a read from a particular point in a file
     * @throws Exception
     * 			  general exception
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout, int limit, boolean createPrefetchThread, int readSizeKB, FileReadResumeInfo resumeInfo) throws Exception
    {
        this(dp, originalRD, recBuilder, connectTimeout, limit, createPrefetchThread, readSizeKB, resumeInfo, RowServiceInputStream.DEFAULT_SOCKET_OP_TIMEOUT_MS);
    }

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     *
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout
     *            the connection timeout in milliseconds, -1 for default
     * @param limit
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @param createPrefetchThread
     *            the input stream should create and manage prefetching on its own thread. If false prefetch needs to be called on another thread periodically.
     * @param readSizeKB
     *            read request size in KB, -1 specifies use default value
     * @param resumeInfo
     *            FileReadeResumeInfo data required to restart a read from a particular point in a file, null for reading from start
     * @param socketOpTimeoutMs
     *            Socket (read / write) operation timeout in milliseconds
     * @throws Exception
     * 			  general exception
     */
   public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout, int limit, boolean createPrefetchThread, int readSizeKB, FileReadResumeInfo resumeInfo, int socketOpTimeoutMs) throws Exception
    {
        this.handlePrefetch = createPrefetchThread;
        this.originalRecordDef = originalRD;
        this.dataPartition = dp;
        this.recordBuilder = recBuilder;
        this.readSizeKB = readSizeKB;
        this.limit = limit;
        this.createPrefetchThread = createPrefetchThread;
        this.socketOpTimeoutMs = socketOpTimeoutMs;

        if (connectTimeout < 1)
        {
            connectTimeout = RowServiceInputStream.DEFAULT_CONNECT_TIMEOUT_MILIS;
        }
        this.connectTimeout = connectTimeout;

        if (this.originalRecordDef == null)
        {
            throw new Exception("HpccRemoteFileReader: Provided original record definition is null, original record definition is required.");
        }

        FieldDef projectedRecordDefinition = recBuilder.getRecordDefinition();
        if (projectedRecordDefinition == null)
        {
            throw new Exception("IRecordBuilder does not have a valid record definition.");
        }

        if (resumeInfo == null)
        {
            this.inputStream = new RowServiceInputStream(this.dataPartition, this.originalRecordDef, projectedRecordDefinition, connectTimeout, limit, createPrefetchThread, readSizeKB, null, false, socketOpTimeoutMs);
            this.binaryRecordReader = new BinaryRecordReader(this.inputStream);
            this.binaryRecordReader.initialize(this.recordBuilder);

            if (dp.getFileType() == DataPartition.FileType.INDEX)
            {
                this.binaryRecordReader.setIsIndex(true);
            }
        }
        else
        {
            RowServiceInputStream.RestartInformation restartInfo = new RowServiceInputStream.RestartInformation();
            restartInfo.streamPos = resumeInfo.inputStreamPos;
            restartInfo.tokenBin = resumeInfo.tokenBin;

            this.inputStream = new RowServiceInputStream(this.dataPartition, this.originalRecordDef, projectedRecordDefinition, connectTimeout, limit, createPrefetchThread, readSizeKB, restartInfo, false, socketOpTimeoutMs);
            long bytesToSkip = resumeInfo.recordReaderStreamPos - resumeInfo.inputStreamPos;
            if (bytesToSkip < 0)
            {
                throw new Exception("Unable to restart unexpected stream pos in record reader.");
            }
            this.inputStream.skip(bytesToSkip);

            this.binaryRecordReader = new BinaryRecordReader(this.inputStream, resumeInfo.recordReaderStreamPos);
            this.binaryRecordReader.initialize(this.recordBuilder);
        }

        log.info("HPCCRemoteFileReader: Opening file part: " + dataPartition.getThisPart()
                + (resumeInfo != null ? " resume position: " + resumeInfo.inputStreamPos : "" ));
        log.trace("Original record definition:\n"
                + RecordDefinitionTranslator.toJsonRecord(originalRD)
                + " projected record definition:\n"
                + RecordDefinitionTranslator.toJsonRecord(projectedRecordDefinition));
        openTimeMs = System.currentTimeMillis();
    }

    private boolean retryRead()
    {
        if (retryCount < maxReadRetries)
        {
            log.info("Retrying read for " + this.dataPartition.toString() + " retry count: " + retryCount);
            retryCount++;

            FileReadResumeInfo resumeInfo = getFileReadResumeInfo();
            RowServiceInputStream.RestartInformation restartInfo = new RowServiceInputStream.RestartInformation();
            restartInfo.streamPos = resumeInfo.inputStreamPos;
            restartInfo.tokenBin = resumeInfo.tokenBin;

            try
            {
                this.inputStream.close();
            }
            catch (Exception e) {}

            try
            {
                this.inputStream = new RowServiceInputStream(this.dataPartition, this.originalRecordDef,
                        this.recordBuilder.getRecordDefinition(), this.connectTimeout, this.limit, this.createPrefetchThread,
                        this.readSizeKB, restartInfo, false, this.socketOpTimeoutMs);
                long bytesToSkip = resumeInfo.recordReaderStreamPos - resumeInfo.inputStreamPos;
                if (bytesToSkip < 0)
                {
                    throw new Exception("Unable to restart read stream, unexpected stream position in record reader.");
                }
                this.inputStream.skip(bytesToSkip);

                this.binaryRecordReader = new BinaryRecordReader(this.inputStream, resumeInfo.recordReaderStreamPos);
                this.binaryRecordReader.initialize(this.recordBuilder);
            }
            catch (Exception e)
            {
                log.error("Failed to retry read for " + this.dataPartition.toString() + " " + e.getMessage(), e);
                return false;
            }

            return true;
        }

        return false;
    }

    /**
     * Sets the maximum number of times to retry a read operation before failing.
     *
     * @param maxReadRetries maximum number of read retries
     */
    public void setMaxReadRetries(int maxReadRetries)
    {
        this.maxReadRetries = maxReadRetries;
    }

    /**
     * Returns the stream position within the file.
     *
     * @return stream position
     */
    public long getStreamPosition()
    {
        return this.binaryRecordReader.getStreamPosAfterLastRecord();
    }

    /**
     * Returns read resume info for the current position within the file.
     *
     * @return FileReadResumeInfo
     */
    public FileReadResumeInfo getFileReadResumeInfo()
    {
        return getFileReadResumeInfo(this.getStreamPosition());
    }

    /**
     * Returns read resume info for the specified position within the file.
     *
     * @param streamPosition the stream position to resume from
     * @return FileReadResumeInfo
     */
    public FileReadResumeInfo getFileReadResumeInfo(Long streamPosition)
    {
        FileReadResumeInfo resumeInfo = new FileReadResumeInfo();
        resumeInfo.recordReaderStreamPos = streamPosition;

        RowServiceInputStream.RestartInformation isRestartInfo = this.inputStream.getRestartInformationForStreamPos(resumeInfo.recordReaderStreamPos);
        resumeInfo.inputStreamPos = isRestartInfo.streamPos;
        resumeInfo.tokenBin = isRestartInfo.tokenBin;

        return resumeInfo;
    }

    /**
     * Returns the number of messages created during the reading process
     *
     * @return number of messages created
     */
    public int getRemoteReadMessageCount()
    {
        int count = 0;
        if (binaryRecordReader != null)
            count = binaryRecordReader.getStreamMessageCount();

        return count;
    }

    /**
     * Returns messages created during the file reading process
     *
     * @return Messages concatenated into a String
     */
    public String getRemoteReadMessages()
    {
        String report = "";
        if (binaryRecordReader != null)
            report = binaryRecordReader.getStreamMessages();

        return report;
    }

    /**
     * Prefetchs more data from the underlying socket. Should only be called on a separate thread from the the consumer thread calling hasNext() / next().
     */
    public void prefetch()
    {
        if (handlePrefetch)
        {
            log.warn("Prefetch called on an HpccRemoteFileReader that has an internal prefetch thread.");
            return;
        }

        if (isClosed)
        {
            log.warn("Prefetch called on an HpccRemoteFileReader that has been closed.");
            return;
        }

        this.inputStream.prefetchData();
    }

    /**
     * Is there more data
     *
     * @return true if there is a next record
     */
    @Override
    public boolean hasNext()
    {
        if (isClosed)
        {
            log.warn("hasNext() called on an HpccRemoteFileReader that has been closed.");
            return false;
        }

        // Keep track of whether we have said there is another record.
        // This allows us to handle edge cases around close() being called between hasNext() and next()
        canReadNext = false;

        try
        {
            canReadNext = this.binaryRecordReader.hasNext();

            // Has next may not catch the prefetch exception if it occurs at the beginning of a read
            // This is due to InputStream.hasNext() being allowed to throw an IOException when closed.
            if (this.inputStream.getPrefetchException() != null)
            {
                throw this.inputStream.getPrefetchException();
            }
        }
        catch (HpccFileException e)
        {
            if (!retryRead())
            {
                canReadNext = false;
                log.error("Read failure for " + this.dataPartition.toString() +":" + e.getMessage(),e);
                java.util.NoSuchElementException exception = new java.util.NoSuchElementException("Fatal read error: " + e.getMessage());
                exception.initCause(e);
                throw exception;
            }

            return hasNext();
        }

        return canReadNext;
    }

    /**
     * Return next record.
     *
     * @return the record
     */
    @Override
    public T next()
    {
        if (isClosed && !canReadNext)
        {
            throw new java.util.NoSuchElementException("Fatal read error: Attempting to read next() from a closed file reader.");
        }

        Object rslt = null;
        try
        {
            rslt = this.binaryRecordReader.getNext();
        }
        catch (HpccFileException e)
        {
            if (!retryRead())
            {
                log.error("Read failure for " + this.dataPartition.toString() + " " + e.getMessage(), e);
                java.util.NoSuchElementException exception = new java.util.NoSuchElementException("Fatal read error: " + e.getMessage());
                exception.initCause(e);
                throw exception;
            }

            return next();
        }

        recordsRead++;

        // Reset this after each read so we can handle edge cases where close() was called between hasNext() / next()
        canReadNext = false;

        return (T) rslt;
    }

    /**
     * Closes inputstream, reports summary of messages generated during read operation.
     *
     * @throws Exception
     *             the exception
     */
    public void close() throws Exception
    {
        if (isClosed)
        {
            log.warn("Calling close on an already closed file reader for file part: " + this.dataPartition.toString());
            return;
        }

        report();
        this.inputStream.close();
        isClosed = true;

        long closeTimeMs = System.currentTimeMillis();
        double readTimeS = (closeTimeMs -  openTimeMs) / 1000.0;
        log.info("HPCCRemoteFileReader: Closing file part: " + dataPartition.getThisPart() + " for " + dataPartition.getFileName()
                + " read time: " + readTimeS + "s "
                + " records read: " + recordsRead);
    }

    /**
     * Returns the number of bytes available to read immediately.
     *
     * @return the available
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public int getAvailable() throws IOException
    {
        return this.binaryRecordReader.getAvailable();
    }

    /**
     * Returns the RowServiceInputStream used to read the file from dafilesrv
     *
     * @return the input stream
     */
    public RowServiceInputStream getInputStream()
    {
        return this.inputStream;
    }

    /**
     * Returns the BinaryRecordReader used to construct records
     *
     * @return the record reader
     */
    public BinaryRecordReader getRecordReader()
    {
        return this.binaryRecordReader;
    }

    /**
     * Reports summary of messages generated during read operation.
     *
     */
    public void report()
    {
        if (getRemoteReadMessageCount() > 0)
        {
            log.warn("DataPartition '" + this.dataPartition + "' read operation messages for " + dataPartition.getFileName() + ":\n");
            log.warn(getRemoteReadMessages());
        }
    }
}