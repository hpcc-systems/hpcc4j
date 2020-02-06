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
 * Notes for implementors: - Values for Datasets and Sets will implement List - RecordBuilders for the entire record
 * hierarchy will be used for multiple records. - Child RecordBuilders must be built for fields of type Record and
 * Dataset[Record]
 */
public interface IRecordBuilder
{

    /**
     * Sets the record definition.
     *
     * @param parent
     *            the new record definition
     * @throws IllegalArgumentException
     *             the illegal argument exception
     */
    public void setRecordDefinition(FieldDef parent) throws IllegalArgumentException;

    /**
     * Gets the record definition.
     *
     * @return the record definition
     */
    public FieldDef getRecordDefinition();

    /**
     * Start record.
     *
     * @throws InstantiationException
     *             the instantiation exception
     */
    public void startRecord() throws java.lang.InstantiationException;

    /**
     * Finalize record.
     *
     * @return the object
     * @throws InstantiationException
     *             the instantiation exception
     */
    public Object finalizeRecord() throws java.lang.InstantiationException;

    /**
     * Sets the field value.
     *
     * @param index
     *            the index
     * @param value
     *            the value
     * @throws IllegalArgumentException
     *             the illegal argument exception
     * @throws IllegalAccessException
     *             the illegal access exception
     */
    public void setFieldValue(int index, Object value) throws IllegalArgumentException, IllegalAccessException;

    /**
     * Gets the child record builder.
     *
     * @param index
     *            the index
     * @return the child record builder
     */
    public IRecordBuilder getChildRecordBuilder(int index);
}
