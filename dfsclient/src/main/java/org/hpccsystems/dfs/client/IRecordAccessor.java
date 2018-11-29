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

import org.hpccsystems.commons.ecl.FieldDef;

/**
 * Used by IRecordWriters to access fields in a Record structure.
 * 
 * Notes for implementors: 
 * - Field values for Datasets & Sets must implement the List interface
 * - RecordAccessors for the entire record hiearchy will be used for multiple records. 
 * - Child RecordAccessors must be built for fields of type Record or Dataset[Record]
 */
public interface IRecordAccessor
{
    public void setRecord(Object record);

    public int getNumFields();

    public Object getFieldValue(int index);

    public FieldDef getFieldDefinition(int index);

    public IRecordAccessor getChildRecordAccessor(int index);
}
