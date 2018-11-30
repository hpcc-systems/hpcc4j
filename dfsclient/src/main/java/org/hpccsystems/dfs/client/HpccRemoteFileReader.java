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

import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.PlainConnection;

import org.hpccsystems.commons.errors.HpccFileException;

/**
 * Remote file reader used by the HpccRDD.
 */
public class HpccRemoteFileReader
{
  private RecordDef def;
  protected DataPartition fp;
  protected PlainConnection connection = null;
  protected BinaryRecordReader brr;
  /**
   * A remote file reader that reads the part identified by the
   * HpccPart object using the record definition provided.
   * @param def the definition of the data
   * @param fp the part of the file, name and location
   */
  public HpccRemoteFileReader(DataPartition fp, RecordDef rd) {
    this.def = rd;
    this.fp = fp;

    this.connection = new PlainConnection(this.fp,this.def);
    this.brr = new BinaryRecordReader(this.connection);
    
    HPCCRecordBuilder rowBuilder = new HPCCRecordBuilder(this.def.getRootDef());
    this.brr.initialize(rowBuilder);
  }
  /**
   * Is there more data
   * @return true if there is a next record
   */
  public boolean hasNext() {
    boolean rslt = false;
    try {
      rslt = brr.hasNext();
    } catch (HpccFileException e) {
      rslt = false;
      System.err.println("Read failure for " + fp.toString());
      e.printStackTrace(System.err);
    }
    return rslt;
  }

  /**
   * Return next record
   * @return the record
   */
  public HPCCRecord next() {
    Object rslt = null;
    try {
      rslt = brr.getNext();
    } catch (HpccFileException e) {
      System.err.println("Read failure for " + fp.toString());
      e.printStackTrace(System.err);
      throw new java.util.NoSuchElementException("Fatal read error");
    }
    return (HPCCRecord) rslt;
  }
}
