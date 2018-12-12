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

import org.hpccsystems.dfs.client.PlainConnection;
import org.hpccsystems.commons.errors.HpccFileException;

import org.apache.log4j.Logger;

import java.util.Iterator;

/**
 * Remote file reader used by the HpccRDD.
 */
public class HpccRemoteFileReader<T> implements Iterator<T>
{
    private static final Logger log           = Logger.getLogger(HpccRemoteFileReader.class.getName());

    private RecordDef           recordDef;
    private DataPartition       dataPartition;
    private PlainConnection     connection    = null;
    private BinaryRecordReader  binaryRecordReader;
    private IRecordBuilder      recordBuilder = null;

    /**
     * A remote file reader that reads the part identified by the HpccPart object using the record definition provided.
     * 
     * @param def
     *            the definition of the data
     * @param fp
     *            the part of the file, name and location
     */
    public HpccRemoteFileReader(DataPartition dp, RecordDef rd, IRecordBuilder recBuilder)
    {
        this.recordDef = rd;
        this.dataPartition = dp;

        this.connection = new PlainConnection(this.dataPartition, this.recordDef);
        this.binaryRecordReader = new BinaryRecordReader(this.connection, this.recordDef.getRootDef());

        this.recordBuilder = recBuilder;
        this.recordBuilder.setRecordDefinition(this.recordDef.getRootDef());
        this.binaryRecordReader.initialize(this.recordBuilder);
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
     * Return next record
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
            log.error("Read failure for " + this.dataPartition.toString());
            throw new java.util.NoSuchElementException("Fatal read error");
        }
        return (T) rslt;
    }
}
