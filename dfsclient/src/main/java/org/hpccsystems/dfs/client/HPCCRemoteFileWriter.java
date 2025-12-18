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
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.Iterator;

/**
 * Remote file writer the writes data to the file part represented by @see org.hpccsystems.dfs.client.DataPartition
 * and uses the provided @see org.hpccsystems.dfs.client.IRecordAccessor to access records.
 */
public class HPCCRemoteFileWriter<T>
{
    private static final Logger    log                = LogManager.getLogger(HPCCRemoteFileWriter.class);

    private DataPartition          dataPartition      = null;
    private RowServiceOutputStream outputStream       = null;
    private BinaryRecordWriter     binaryRecordWriter = null;
    private IRecordAccessor        recordAccessor     = null;
    private long                   recordsWritten     = 0;
    private long                   openTimeMs         = 0;

    private FileWriteContext       context            = null;

    private Span                   writeSpan          = null;
    private String                 writeSpanName      = null;

    public static class FileWriteContext
    {
        public FieldDef recordDef = null;
        public CompressionAlgorithm fileCompression = CompressionAlgorithm.DEFAULT;
        public int connectTimeoutMs = -1;
        public int socketOpTimeoutMs = -1;
        public Span parentSpan = null;
    }

    private static FileWriteContext constructReadContext(FieldDef recordDef, CompressionAlgorithm fileCompression, int connectTimeoutMs, int socketOpTimeoutMs)
    {
        FileWriteContext context = new FileWriteContext();
        context.recordDef = recordDef;
        context.fileCompression = fileCompression;
        context.connectTimeoutMs = connectTimeoutMs;
        context.socketOpTimeoutMs = socketOpTimeoutMs;

        return context;
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
     *            the socket timeout in ms (default is 5000)
     * @throws Exception
     *             the exception
     */
    public HPCCRemoteFileWriter(DataPartition dp, FieldDef recordDef, IRecordAccessor recordAccessor, CompressionAlgorithm fileCompression, int connectTimeoutMs)
            throws Exception
    {
        this(dp,recordDef,recordAccessor,fileCompression,RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS, RowServiceOutputStream.DEFAULT_SOCKET_OP_TIMEOUT_MS);
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
     *            the socket timeout in ms (default is 5000)
     * @param socketOpTimeoutMs
     *            the socket operation timeout in ms (default is 15000)
     * @throws Exception
     *             the exception
     */
    public HPCCRemoteFileWriter(DataPartition dp, FieldDef recordDef, IRecordAccessor recordAccessor, CompressionAlgorithm fileCompression, int connectTimeoutMs, int socketOpTimeoutMs)
            throws Exception
    {
        this(constructReadContext(recordDef, fileCompression, connectTimeoutMs, socketOpTimeoutMs), dp, recordAccessor);
    }

    public HPCCRemoteFileWriter(FileWriteContext ctx, DataPartition dp, IRecordAccessor recordAccessor)
            throws Exception
    {
        this.dataPartition = dp;
        this.context = ctx;

        this.recordAccessor = recordAccessor;

        this.writeSpanName = "HPCCRemoteFileWriter/Write_" + dp.getFileName() + "_" + dp.getThisPart();
        this.writeSpan = Utils.createChildSpan(context.parentSpan, writeSpanName);
        this.writeSpan.setStatus(StatusCode.OK);

        String primaryIP = dp.getCopyIP(0);
        String secondaryIP = "";
        if (dp.getCopyCount() > 1)
        {
            secondaryIP = dp.getCopyIP(1);
        }

        Attributes attributes = Attributes.of(  AttributeKey.stringKey("server.0.address"), primaryIP,
                                                AttributeKey.stringKey("server.1.address"), secondaryIP,
                                                AttributeKey.stringKey("server.port"), Integer.toString(dp.getPort()));
        writeSpan.setAllAttributes(attributes);

        this.outputStream = new RowServiceOutputStream(dataPartition.getCopyIP(0), dataPartition.getPort(), dataPartition.getUseSsl(),
                dataPartition.getFileAccessBlob(), context.recordDef, this.dataPartition.getThisPart(), this.dataPartition.getCopyPath(0),
                context.fileCompression, context.connectTimeoutMs, context.socketOpTimeoutMs, this.writeSpan);

        this.binaryRecordWriter = new BinaryRecordWriter(this.outputStream);
        this.binaryRecordWriter.initialize(this.recordAccessor);

        log.info("HPCCRemoteFileWriter: Opening file part: " + dataPartition.getThisPart()
                + " compression: " + context.fileCompression.name());
        log.trace("Record definition:\n"
                + RecordDefinitionTranslator.toJsonRecord(context.recordDef));
        openTimeMs = System.currentTimeMillis();
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
        try
        {
            this.binaryRecordWriter.writeRecord(record);
            this.recordsWritten++;
        }
        catch (Exception e)
        {
            log.error("HPCCRemoteFileWriter: Error writing record: " + e.getMessage());
            this.writeSpan.recordException(e);
            this.writeSpan.setStatus(StatusCode.ERROR);
            this.writeSpan.end();

            throw e;
        }
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
            try
            {
                this.binaryRecordWriter.writeRecord(it.next());
                this.recordsWritten++;
            }
            catch (Exception e)
            {
                log.error("HPCCRemoteFileWriter: Error writing record: " + e.getMessage());
                this.writeSpan.recordException(e);
                this.writeSpan.setStatus(StatusCode.ERROR);
                this.writeSpan.end();

                throw e;
            }
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

        this.writeSpan.end();

        long closeTimeMs = System.currentTimeMillis();
        double writeTimeS = (closeTimeMs -  openTimeMs) / 1000.0;
        log.info("HPCCRemoteFileWriter: Closing file part: " + dataPartition.getThisPart()
                + " write time: " + writeTimeS + "s "
                + " records written: " + recordsWritten);
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
