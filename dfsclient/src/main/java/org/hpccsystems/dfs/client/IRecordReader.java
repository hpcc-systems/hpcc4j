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

import org.hpccsystems.dfs.client.IRecordBuilder;

import java.io.IOException;

import org.hpccsystems.commons.errors.HpccFileException;

/**
 * Interface for the HPCC Systems remote file readers.
 */
public interface IRecordReader
{

    public void initialize(IRecordBuilder recordBuilder) throws Exception;

    /**
    * hasNext
    * Are there more records?  The first time used will trigger a
    * remote file read.
    * @return true if there is at least one more record
    * @throws HpccFileException if there was a failure on the back end.  This
    * error is not recoverable by a retry.
    */
    public boolean hasNext() throws HpccFileException;

    /**
     * getNext
     * Produce the next record.
     * @return a record
     * @throws HpccFileException error on the back end, not recoverable
     */
    public Object getNext() throws HpccFileException;

    /**
     * getAvailable
     * Returns the number of bytes available to read immediately.
     * @return
     */
    public int getAvailable() throws IOException;
}
