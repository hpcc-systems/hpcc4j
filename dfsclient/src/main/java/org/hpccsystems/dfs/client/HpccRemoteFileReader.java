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
import org.hpccsystems.dfs.client.RowServiceInputStream;
import org.hpccsystems.commons.errors.HpccFileException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.util.Iterator;

/**
 * Remote file reader used by the HpccRDD.
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

    public static final int    NO_RECORD_LIMIT                  = -1;
    public static final int    DEFAULT_READ_SIZE_OPTION         = -1;
    public static final int    DEFAULT_CONNECT_TIMEOUT_OPTION   = -1;

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
     * @param projectedRD
     *            the requested record format
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
     *            the connection timeout in seconds, -1 for default
     * @param limit
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @throws Exception
     *             the exception
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
     * @param projectedRD
     *            the requested record format
     * @param connectTimeout 
     *            the connection timeout in seconds, -1 for default
     * @param limit 
     *            the maximum number of records to read from the provided data partition, -1 specifies no limit
     * @param createPrefetchThread 
     *            the input stream should create and manage prefetching on its own thread. If false prefetch needs to be called on another thread periodically.
     * @param readSizeKB 
     *            read request size in KB, -1 specifies use default value
     */
    public HpccRemoteFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout, int limit, boolean createPrefetchThread, int readSizeKB) throws Exception
    {
        this.handlePrefetch = createPrefetchThread;
        this.originalRecordDef = originalRD;
        if (this.originalRecordDef == null)
        {
            throw new Exception("HpccRemoteFileReader: Original record definition is null.");
        }

        if (connectTimeout < 1) {
            connectTimeout = RowServiceInputStream.DEFAULT_CONNECT_TIMEOUT_MILIS;
        }

        this.dataPartition = dp;
        this.recordBuilder = recBuilder;

        FieldDef projectedRecordDefinition = recBuilder.getRecordDefinition();
        if (projectedRecordDefinition == null)
        {
            throw new Exception("IRecordBuilder does not have a valid record definition.");
        }

        this.inputStream = new RowServiceInputStream(this.dataPartition, this.originalRecordDef, projectedRecordDefinition, connectTimeout, limit, createPrefetchThread, readSizeKB);
        this.binaryRecordReader = new BinaryRecordReader(this.inputStream);
        this.binaryRecordReader.initialize(this.recordBuilder);
    }

    /**
     * Prefetchs more data from the underlying socket. Should only be called on a separate thread from the the consumer thread calling hasNext() / next().
     */
    public void prefetch()
    {
        if (this.handlePrefetch)
        {
            log.warn("Prefetch called on an HpccRemoteFileReader that has an internal prefetch thread.");
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
        boolean rslt = false;
        try
        {
            rslt = this.binaryRecordReader.hasNext();
        }
        catch (HpccFileException e)
        {
            rslt = false;
            log.error("Read failure for " + this.dataPartition.toString());
        }

        return rslt;
    }

    /**
     * Return next record.
     *
     * @return the record
     */
    @Override
    public T next()
    {
        Object rslt = null;
        try
        {
            rslt = this.binaryRecordReader.getNext();
        }
        catch (HpccFileException e)
        {
            log.error("Read failure for " + this.dataPartition.toString() + " " + e.getMessage());
            throw new java.util.NoSuchElementException("Fatal read error: " + e.getMessage());
        }
        return (T) rslt;
    }

    /**
     * Close.
     *
     * @throws Exception
     *             the exception
     */
    public void close() throws Exception
    {
        this.inputStream.close();
    }

    /**
     * getAvailable
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
}
