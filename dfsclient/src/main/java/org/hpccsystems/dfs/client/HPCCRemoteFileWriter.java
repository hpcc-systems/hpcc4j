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

import org.apache.log4j.Logger;

import java.util.Iterator;

/**
 * Remote file writer
 */
public class HPCCRemoteFileWriter<T>
{
    private static final Logger    log                = Logger.getLogger(HPCCRemoteFileWriter.class.getName());

    private FieldDef               recordDef          = null;
    private DataPartition          dataPartition      = null;
    private RowServiceOutputStream outputStream       = null;
    private BinaryRecordWriter     binaryRecordWriter = null;
    private IRecordAccessor        recordAccessor     = null;
    private long                   recordsWritten     = 0;

    /**
     * A remote file writer
     *
     * @param dp
     *            the part of the file, name and location
     * @param recordDef
     *            the record defintion for the dataset
     * @param recordAccessor
     *            the IRecordAccessor used to access records
     * @param fileCompression
     *            how the file is compressed
     */
    public HPCCRemoteFileWriter(DataPartition dp, FieldDef recordDef, IRecordAccessor recordAccessor, CompressionAlgorithm fileCompression)
            throws Exception
    {
        this.recordDef = recordDef;
        this.dataPartition = dp;

        this.recordAccessor = recordAccessor;

        this.outputStream = new RowServiceOutputStream(dataPartition.getCopyIP(0), dataPartition.getPort(), dataPartition.getUseSsl(),
                dataPartition.getFileAccessBlob(), this.recordDef, this.dataPartition.getThisPart(), this.dataPartition.getCopyPath(0),
                fileCompression);

        this.binaryRecordWriter = new BinaryRecordWriter(this.outputStream);
        this.binaryRecordWriter.initialize(this.recordAccessor);
    }

    public void writeRecord(T record) throws Exception
    {
        this.binaryRecordWriter.writeRecord(record);
        this.recordsWritten++;
    }

    public void writeRecords(Iterator<T> it) throws Exception
    {
        while (it.hasNext())
        {
            this.binaryRecordWriter.writeRecord(it.next());
            this.recordsWritten++;
        }
    }

    public void close() throws Exception
    {
        this.binaryRecordWriter.finalize();
    }

    public long getBytesWritten()
    {
        return this.binaryRecordWriter.getTotalBytesWritten();
    }

    public long getRecordsWritten()
    {
        return recordsWritten;
    }

    /**
    * flush
    * Flush buffered data from IRecordWriter. This is a blocking operation.
    * @throws Exception
    */
    public void flush() throws Exception
    {
        this.binaryRecordWriter.flush();
    }

    /**
    * getBufferCapacity
    * @return the IRecordWriter internal buffer capacity
    */
    public int getBufferCapacity()
    {
        return this.binaryRecordWriter.getBufferCapacity();
    }

    /**
    * getRemainingBufferCapacity
    * @return the IRecordWriter remaining buffer capacity
    */
    public int getRemainingBufferCapacity()
    {
        return this.binaryRecordWriter.getRemainingBufferCapacity();
    }

}
