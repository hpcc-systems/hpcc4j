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

public class HPCCRecordAccessor implements IRecordAccessor
{
    private HPCCRecord           record               = null;
    private FieldDef             fieldDef             = null;
    private HPCCRecordAccessor[] childRecordAccessors = null;

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

    public void setRecord(Object rd)
    {
        this.record = (HPCCRecord) rd;
    }

    public int getNumFields()
    {
        return this.fieldDef.getNumDefs();
    }

    public Object getFieldValue(int index)
    {
        return this.record.getField(index);
    }

    public FieldDef getFieldDefinition(int index)
    {
        return this.fieldDef.getDef(index);
    }

    public IRecordAccessor getChildRecordAccessor(int index)
    {
        return this.childRecordAccessors[index];
    }
}
