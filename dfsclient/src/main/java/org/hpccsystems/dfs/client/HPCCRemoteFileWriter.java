/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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
import org.hpccsystems.dfs.client.RowServiceOutputStream;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Iterator;

/**
 * Remote file writer
 */
public class HPCCRemoteFileWriter<T>
{
    private static final Logger    log                = LogManager.getLogger(HPCCRemoteFileWriter.class);

    private FieldDef               recordDef          = null;
    private DataPartition          dataPartition      = null;
    private RowServiceOutputStream outputStream       = null;
    private BinaryRecordWriter     binaryRecordWriter = null;
    private IRecordAccessor        recordAccessor     = null;
    private long                   recordsWritten     = 0;

    /**
     * A remote file writer.
     *
     * @param dp
     *            the part of the file, name and location
     * @param recordDef
     *            the record def
     * @param recordAccessor
     *            the record accessor
     * @param fileCompression
     *            the file compression
     * @throws Exception
     *             the exception
     */
    public HPCCRemoteFileWriter(DataPartition dp, FieldDef recordDef, IRecordAccessor recordAccessor, CompressionAlgorithm fileCompression)
            throws Exception
    {
        this(dp,recordDef,recordAccessor,fileCompression,RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS);
    }

    /**
     * A remote file writer.
     *
     * @param dp
     *            the part of the file, name and location
     * @param recordDef
     *            the record def
     * @param recordAccessor
     *            the record accessor
     * @param fileCompression
     *            the file compression
     * @param connectTimeoutMs
     *            the socket timeout in ms (default is 1000)
     * @throws Exception
     *             the exception
     */
    public HPCCRemoteFileWriter(DataPartition dp, FieldDef recordDef, IRecordAccessor recordAccessor, CompressionAlgorithm fileCompression, int connectTimeoutMs)
            throws Exception
    {
        this.recordDef = recordDef;
        this.dataPartition = dp;

        this.recordAccessor = recordAccessor;

        this.outputStream = new RowServiceOutputStream(dataPartition.getCopyIP(0), dataPartition.getPort(), dataPartition.getUseSsl(),
                dataPartition.getFileAccessBlob(), this.recordDef, this.dataPartition.getThisPart(), this.dataPartition.getCopyPath(0),
                fileCompression, connectTimeoutMs);

        this.binaryRecordWriter = new BinaryRecordWriter(this.outputStream);
        this.binaryRecordWriter.initialize(this.recordAccessor);
    }

    /**
     * Write record.
     *
     * @param record
     *            the record
     * @throws Exception
     *             the exception
     */
    public void writeRecord(T record) throws Exception
    {
        this.binaryRecordWriter.writeRecord(record);
        this.recordsWritten++;
    }

    /**
     * Write records.
     *
     * @param it
     *            the it
     * @throws Exception
     *             the exception
     */
    public void writeRecords(Iterator<T> it) throws Exception
    {
        while (it.hasNext())
        {
            this.binaryRecordWriter.writeRecord(it.next());
            this.recordsWritten++;
        }
    }

    /**
     * Close.
     *
     * @throws Exception
     *             the exception
     */
    public void close() throws Exception
    {
        this.report();
        this.binaryRecordWriter.finalize();
    }

    /**
     * Gets the bytes written.
     *
     * @return the bytes written
     */
    public long getBytesWritten()
    {
        return this.binaryRecordWriter.getTotalBytesWritten();
    }

    /**
     * Gets the records written.
     *
     * @return the records written
     */
    public long getRecordsWritten()
    {
        return recordsWritten;
    }

    /**
     * flush
     * Flush buffered data from IRecordWriter. This is a blocking operation.
     *
     * @throws Exception
     *             the exception
     */
    public void flush() throws Exception
    {
        this.binaryRecordWriter.flush();
    }

    /**
     * getBufferCapacity
     * Returns the IRecordWriter internal buffer capacity.
     *
     * @return the buffer capacity
     */
    public int getBufferCapacity()
    {
        return this.binaryRecordWriter.getBufferCapacity();
    }

    /**
     * getRemainingBufferCapacity
     * Returns the IRecordWriter remaining buffer capacity.
     *
     * @return the remaining buffer capacity
     */
    public int getRemainingBufferCapacity()
    {
        return this.binaryRecordWriter.getRemainingBufferCapacity();
    }

    public int getRemoteWriteMessageCount()
    {
        int count = 0;
        if (this.binaryRecordWriter != null)
            count = this.binaryRecordWriter.getStreamMessageCount();

        return count;
    }

    public String getRemoteWriteMessages()
    {
        String report = "";
        if (this.binaryRecordWriter != null)
            report = this.binaryRecordWriter.getStreamMessages();

        return report;
    }
    
    /**
     * Reports summary of messages generated during write operation.
     */
    public void report()
    {
        if (getRemoteWriteMessageCount() > 0)
        {
            log.warn(getRemoteWriteMessages());
        }
    }
}
