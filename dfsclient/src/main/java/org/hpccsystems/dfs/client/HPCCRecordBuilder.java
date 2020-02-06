/*
 * ##############################################################################
 * 
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
 * ##############################################################################
 */

package org.hpccsystems.dfs.client;

import org.hpccsystems.dfs.client.IRecordBuilder;
import org.hpccsystems.dfs.client.HPCCRecord;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;

public class HPCCRecordBuilder implements IRecordBuilder
{
    private Object[]            fields              = null;
    private FieldDef            fieldDef            = null;

    private HPCCRecordBuilder[] childRecordBuilders = null;

    /**
     * Instantiates a new HPCC record builder.
     *
     * @param recordDef
     *            the record def
     */
    public HPCCRecordBuilder(FieldDef recordDef)
    {
        setRecordDefinition(recordDef);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#setRecordDefinition(org.hpccsystems.commons.ecl.FieldDef)
     */
    public void setRecordDefinition(FieldDef fieldDef)
    {
        this.fieldDef = fieldDef;
        this.childRecordBuilders = new HPCCRecordBuilder[this.fieldDef.getNumDefs()];
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
                childRecordBuilders[i] = new HPCCRecordBuilder(subFd);
            }
            else
            {
                childRecordBuilders[i] = null;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#getRecordDefinition()
     */
    public FieldDef getRecordDefinition()
    {
        return this.fieldDef;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#startRecord()
     */
    public void startRecord() throws java.lang.InstantiationException
    {
        fields = new Object[this.fieldDef.getNumDefs()];
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#finalizeRecord()
     */
    public Object finalizeRecord() throws java.lang.InstantiationException
    {
        HPCCRecord row = new HPCCRecord(fields, this.fieldDef);
        fields = null;
        return row;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#setFieldValue(int, java.lang.Object)
     */
    public void setFieldValue(int index, Object value) throws IllegalArgumentException, IllegalAccessException
    {
        this.fields[index] = value;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.dfs.client.IRecordBuilder#getChildRecordBuilder(int)
     */
    public IRecordBuilder getChildRecordBuilder(int index)
    {
        return this.childRecordBuilders[index];
    }
}
