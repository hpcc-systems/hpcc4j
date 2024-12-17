/*
 * ##############################################################################
 *
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * ##############################################################################
 */

package org.hpccsystems.spark;

import org.hpccsystems.dfs.client.IRecordBuilder;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;

import java.util.List;

import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema;
import org.apache.spark.sql.types.*;

/**
 * An implementation of IRecordBuilder that allows IRecordReader to create Spark GenericRows.
 */
public class GenericRowRecordBuilder implements IRecordBuilder
{
    private Object[]            fields              = null;
    private FieldDef            fieldDef            = null;
    private StructType          schema              = null;

    private GenericRowRecordBuilder[] childRecordBuilders = null;

    public GenericRowRecordBuilder(FieldDef recordDef) throws IllegalArgumentException
    {
        setRecordDefinition(recordDef);
    }

    public void setRecordDefinition(FieldDef fieldDef) throws IllegalArgumentException
    {
        this.fieldDef = fieldDef;
        try {
            this.schema = SparkSchemaTranslator.toSparkSchema(fieldDef);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage());
        }

        this.childRecordBuilders = new GenericRowRecordBuilder[this.fieldDef.getNumDefs()];
        for (int i = 0; i < this.fieldDef.getNumDefs(); i++)
        {
            FieldDef fd = this.fieldDef.getDef(i);
            boolean needsChildRecordBuilder = (fd.getFieldType() == FieldType.RECORD)
                    || (fd.getFieldType() == FieldType.DATASET && fd.getDef(0).getFieldType() == FieldType.RECORD);

            if (needsChildRecordBuilder)
            {
                FieldDef subFd = fd;
                if (fd.getFieldType() == FieldType.DATASET)
                {
                    subFd = fd.getDef(0);
                }
                childRecordBuilders[i] = new GenericRowRecordBuilder(subFd);
            }
            else
            {
                childRecordBuilders[i] = null;
            }
        }
    }

    public FieldDef getRecordDefinition()
    {
        return this.fieldDef;
    }

    public void startRecord() throws java.lang.InstantiationException
    {
        fields = new Object[this.fieldDef.getNumDefs()];
    }

    public Object finalizeRecord() throws java.lang.InstantiationException
    {
        GenericRowWithSchema row = new GenericRowWithSchema(fields, this.schema);
        fields = null;
        return row;
    }

    public void setFieldValue(int index, Object value) throws IllegalArgumentException, IllegalAccessException
    {
        FieldDef fd = this.fieldDef.getDef(index);
        if (fd.getFieldType() == FieldType.DATASET || fd.getFieldType() == FieldType.SET)
        {
            if (value instanceof List)
            {
                List<Object> listVal = (List<Object>) value;
                this.fields[index] = listVal.toArray();
            }
            else
            {
                this.fields[index] = new Object[0];
            }
        }
        else
        {
            this.fields[index] = value;
        }
    }

    public IRecordBuilder getChildRecordBuilder(int index)
    {
        return this.childRecordBuilders[index];
    }
}
