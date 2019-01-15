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

/**
 * Used by IRecordReaders to create records
 * 
 * Notes for implementors: - Values for Datasets & Sets will implement List - RecordBuilders for the entire record
 * hierarchy will be used for multiple records. - Child RecordBuilders must be built for fields of type Record and
 * Dataset[Record]
 */
public interface IRecordBuilder
{
    public void setRecordDefinition(FieldDef parent);
    FieldDef getRecordDefinition();

    public void startRecord() throws java.lang.InstantiationException;

    public Object finalizeRecord() throws java.lang.InstantiationException;

    public void setFieldValue(int index, Object value) throws IllegalArgumentException, IllegalAccessException;

    public IRecordBuilder getChildRecordBuilder(int index);
}
