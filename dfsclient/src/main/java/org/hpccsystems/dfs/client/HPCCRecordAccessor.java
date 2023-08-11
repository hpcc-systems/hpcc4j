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
import org.hpccsystems.dfs.client.HPCCRecord;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;

/**
 * Allows consumers of IRecordAccessor to access data within an @see org.hpccsystems.dfs.client.HPCCRecord.
 */
public class HPCCRecordAccessor implements IRecordAccessor
{
    private HPCCRecord           record               = null;
    private FieldDef             fieldDef             = null;
    private HPCCRecordAccessor[] childRecordAccessors = null;

    /**
     * Instantiates a new HPCC record accessor.
     *
     * @param fieldDef
     *            the field def
     */
    public HPCCRecordAccessor(FieldDef fieldDef)
    {
        this.fieldDef = fieldDef;
        this.childRecordAccessors = new HPCCRecordAccessor[this.fieldDef.getNumDefs()];
        for (int i = 0; i < this.fieldDef.getNumDefs(); i++)
        {
            FieldDef fd = this.fieldDef.getDef(i);
            boolean needsChildRecordAccessor = (fd.getFieldType() == FieldType.RECORD)
                    || (fd.getFieldType() == FieldType.DATASET && fd.getDef(0).getFieldType() == FieldType.RECORD);

            if (needsChildRecordAccessor)
            {
                FieldDef subFd = fd;
                if (fd.getFieldType() == FieldType.DATASET)
                {
                    subFd = fd.getDef(0);
                }
                childRecordAccessors[i] = new HPCCRecordAccessor(subFd);
            }
            else
            {
                childRecordAccessors[i] = null;
            }
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordAccessor#setRecord(java.lang.Object)
     */
    public IRecordAccessor setRecord(Object rd)
    {
        this.record = (HPCCRecord) rd;
        return this;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordAccessor#getNumFields()
     */
    public int getNumFields()
    {
        return this.fieldDef.getNumDefs();
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordAccessor#getFieldValue(int)
     */
    public Object getFieldValue(int index)
    {
        if (this.record == null)
        {
            return null;
        }

        return this.record.getField(index);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordAccessor#getFieldDefinition(int)
     */
    public FieldDef getFieldDefinition(int index)
    {
        return this.fieldDef.getDef(index);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.dfs.client.IRecordAccessor#getChildRecordAccessor(int)
     */
    public IRecordAccessor getChildRecordAccessor(int index)
    {
        return this.childRecordAccessors[index];
    }
}
