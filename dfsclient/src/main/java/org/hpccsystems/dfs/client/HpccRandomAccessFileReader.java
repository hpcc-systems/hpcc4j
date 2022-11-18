/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems®.
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
import org.hpccsystems.commons.errors.HpccFileException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

/**
 * File reader that allows random access of records in an HPCC Systems file part.
 * 
 * A connection to the remote dafilesrv will be opened upon initialization and remain open to process fetch requests in batches.
 */
public class HpccRandomAccessFileReader<T> implements Iterator<T>
{
    private static final Logger   log               = LogManager.getLogger(HpccRandomAccessFileReader.class);

    private FieldDef              originalRecordDef = null;
    private DataPartition         dataPartition     = null;
    private RowServiceInputStream inputStream       = null;
    private BinaryRecordReader    binaryRecordReader;
    private IRecordBuilder        recordBuilder     = null;
    private ArrayList<Long>       requestedRecordOffsets = new ArrayList<Long>();
    private ArrayList<Long>       queuedRecordOffsets = new ArrayList<Long>();
    private Thread                fetchRequestThread = null;

    /**
     * A random access file reader that reads the part identified by the HpccPart object using the record definition provided.
     * 
     * @param dp
     *            the part of the file, name and location
     * @param originalRD
     *            the record defintion for the dataset
     * @param recBuilder
     *            the IRecordBuilder used to construct records
     * @param connectTimeout 
     *            the connection timeout in seconds, -1 and/or 0 for default
     * @throws Exception
     * 			  general exception
     */
    public HpccRandomAccessFileReader(DataPartition dp, FieldDef originalRD, IRecordBuilder recBuilder, int connectTimeout) throws Exception
    {
        this.originalRecordDef = originalRD;
        if (this.originalRecordDef == null)
        {
            throw new Exception("HpccRemoteFileReader: Original record definition is null.");
        }

        if (connectTimeout < 1)
        {
            connectTimeout = RowServiceInputStream.DEFAULT_CONNECT_TIMEOUT_MILIS;
        }

        this.dataPartition = dp;
        this.recordBuilder = recBuilder;

        FieldDef projectedRecordDefinition = recBuilder.getRecordDefinition();
        if (projectedRecordDefinition == null)
        {
            throw new Exception("IRecordBuilder does not have a valid record definition.");
        }
        
        boolean isFetching = true;
        boolean createPrefetchThread = false;
        this.inputStream = new RowServiceInputStream(this.dataPartition, this.originalRecordDef, projectedRecordDefinition, connectTimeout, 
                                                    -1, createPrefetchThread, -1, null, isFetching);
        this.binaryRecordReader = new BinaryRecordReader(this.inputStream);
        this.binaryRecordReader.initialize(this.recordBuilder);
    }

    /**
     * Add a list of records to be fetched via hasNext() / next()
     * @param recordOffsets
     *            the record offset 
     */
    public void addRecordRequests(List<Long> recordOffsets)
    {
        queuedRecordOffsets.addAll(recordOffsets);
    }

    public int getRemoteReadMessageCount()
    {
        int count = 0;
        if (binaryRecordReader != null)
            count = binaryRecordReader.getStreamMessageCount();

        return count;
    }

    public String getRemoteReadMessages()
    {
        String report = "";
        if (binaryRecordReader != null)
            report = binaryRecordReader.getStreamMessages();

        return report;
    }

    /**
     * Is there more data
     * 
     * @return true if there is a next record
     */
    @Override
    public boolean hasNext()
    {
        int numRemainingRecords = requestedRecordOffsets.size() + queuedRecordOffsets.size();
        if (numRemainingRecords == 0)
        {
            return false;
        }

        return true;
    }

    /**
     * Return next record, can return null if an invalid record offset was requested.
     *
     * @return the record
     */
    @Override
    public T next()
    {
        if (hasNext() == false)
        {
            String errorMessage = "No records remaining in request or no records have been requested.";
            log.error(errorMessage);
            throw new java.util.NoSuchElementException(errorMessage);
        }

        // If we have consumed all of the requested records make a new request based on the queued requests
        if (requestedRecordOffsets.size() == 0)
        {
            requestedRecordOffsets.addAll(queuedRecordOffsets);
            queuedRecordOffsets.clear();

            Runnable fetchRequestTask = new Runnable()
            {
                RowServiceInputStream inputStream = HpccRandomAccessFileReader.this.inputStream;
                public void run()
                {
                    try
                    {
                        inputStream.startBlockingFetchRequest(requestedRecordOffsets);
                    }
                    catch(Exception e)
                    {
                        String errorMessage = "Error while performing block fetch request: " + e.getMessage();
                        log.error(errorMessage);
                        throw new java.util.NoSuchElementException(errorMessage);
                    }
                }
            };

            fetchRequestThread = new Thread(fetchRequestTask);
            fetchRequestThread.start();
        }

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

        this.requestedRecordOffsets.remove(0);
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
        report();
        this.inputStream.close();
    }

    public RowServiceInputStream getInputStream()
    {
        return this.inputStream;
    }

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
            log.warn("DataPartition '" + this.dataPartition + "' read operation messages:\n");
            log.warn(getRemoteReadMessages());
        }
    }
}
