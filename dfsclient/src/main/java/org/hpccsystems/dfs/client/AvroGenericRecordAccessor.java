/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
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

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;

import org.hpccsystems.commons.ecl.FieldDef;

import org.hpccsystems.dfs.client.IRecordAccessor;

public class AvroGenericRecordAccessor implements IRecordAccessor
{
    static private final long serialVersionUID = 1L;

    private static final Logger log = LogManager.getLogger(AvroGenericRecordAccessor.class);

    private Schema avroSchema = null;
    private GenericRecord avroRecord = null;

    private FieldDef translatedRecordDef = null;
    private HPCCRecordAccessor translatedRecordAccessor = null;
    private HPCCRecord translatedRecord = null;

    public AvroGenericRecordAccessor(Schema recordSchema) throws Exception
    {
        this.avroSchema = recordSchema;
        this.translatedRecordDef = AvroSchemaTranslator.toHPCC(recordSchema, recordSchema.getName());
    }
    
    /**
     * Sets the record.
     *
     * @param record
     *            the record
     * @return the i record accessor
     */
    @Override
    public IRecordAccessor setRecord(Object rec)
    {
        if (rec instanceof GenericRecord)
        {
            this.avroRecord = (GenericRecord) rec;
        }
        else
        {
            String msg = "AvroGenericRecordAccessor: Invalid record type provided. Record should be of type: " + GenericRecord.class.getName();
            log.error(msg);

            throw new RuntimeException(msg);
        }

        try
        {
            this.translatedRecord = (HPCCRecord) AvroRecordTranslator.toHPCC(this.avroSchema, null, this.translatedRecordDef, this.avroRecord);
        }
        catch (Exception e)
        {
            String msg = "AvroGenericRecordAccessor: Invalid record type provided. Record should be of type: " + GenericRecord.class.getName();
            log.error(msg);

            throw new RuntimeException(msg);
        }

        this.translatedRecordAccessor.setRecord(this.translatedRecord);

        return this;
    }

    /**
     * Gets the num fields.
     *
     * @return the num fields
     */
    @Override
    public int getNumFields()
    {
        return this.translatedRecordDef.getNumDefs();
    }

    /**
     * Gets the field value.
     *
     * @param index
     *            the index
     * @return the field value
     */
    @Override
    public Object getFieldValue(int index)
    {
        return this.translatedRecordAccessor.getFieldValue(index);
    }

    /**
     * Gets the field definition.
     *
     * @param index
     *            the index
     * @return the field definition
     */
    @Override
    public FieldDef getFieldDefinition(int index)
    {
        return this.translatedRecordDef.getDef(index);
    }

    /**
     * Gets the child record accessor.
     *
     * @param index
     *            the index
     * @return the child record accessor
     */
    @Override
    public IRecordAccessor getChildRecordAccessor(int index)
    {
        return this.translatedRecordAccessor.getChildRecordAccessor(index);
    }
}