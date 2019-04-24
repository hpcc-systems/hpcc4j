/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
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

import org.hpccsystems.dfs.client.IRecordAccessor;

import org.hpccsystems.commons.errors.HpccFileException;

/**
 * Interface for the HPCC Systems record writer.
 */
public interface IRecordWriter
{

    public void initialize(IRecordAccessor accessor);

    /**
    * writeRecord 
    * Converts the provided Row into an HPCC record and writes it to the output channel
    * @param Row
    * @throws Exception
    */
    public void writeRecord(Object record) throws Exception;

    /**
    * finalize 
    * Must be called after all records have been written.
    * Will flush the internal buffer to the output channel.
    * @throws Exception
    */
    public void finalize() throws Exception;

    /**
    * getTotalBytesWritten 
    * Returns the total bytes written thus far. This will not match the bytes written to the ByteChannel until finialize is called.
    * @return long
    * @throws Exception
    */
    public long getTotalBytesWritten();

    /**
    * flush
    * Flush buffered data to InputStream. This is a blocking operation.
    * @throws Exception 
    */
    public void flush() throws Exception;

    /**
    * getBufferCapacity
    * Returns the internal buffer capacity
    * @return 
    */
    public int getBufferCapacity();

    /**
    * getRemainingBufferCapacity
    * Returns the remaining capacity in the internal buffer
    * @return
    */
    public int getRemainingBufferCapacity();

}
