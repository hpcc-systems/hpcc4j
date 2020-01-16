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
 * A generic Record
 */
public class HPCCRecord
{
    private FieldDef rootFieldDef = null;
    private Object[] fields       = null;

    /**
     * Instantiates a new HPCC record.
     *
     * @param fields
     *            the fields
     * @param def
     *            the def
     */
    public HPCCRecord(Object[] fields, FieldDef def)
    {
        this.rootFieldDef = def;
        this.fields = fields;
    }

    /**
     * Gets the field defintion.
     *
     * @param index
     *            the index
     * @return the field defintion
     */
    FieldDef getFieldDefintion(int index)
    {
        return this.rootFieldDef.getDef(index);
    }

    /**
     * Gets the field.
     *
     * @param index
     *            the index
     * @return the field
     */
    Object getField(int index)
    {
        return fields[index];
    }

    /**
     * Sets the field.
     *
     * @param index
     *            the index
     * @param value
     *            the value
     */
    void setField(int index, Object value)
    {
        fields[index] = value;
    }

    /**
     * Gets the num fields.
     *
     * @return the num fields
     */
    int getNumFields()
    {
        return fields.length;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     */
    public boolean equals(Object o)
    {
        if (o == null || (o instanceof HPCCRecord) == false)
        {
            return false;
        }

        HPCCRecord rhs = (HPCCRecord) o;
        if (fields.length != rhs.fields.length)
        {
            return false;
        }

        for (int i = 0; i < fields.length; i++)
        {
            if (fields[i].equals(rhs.fields[i]) == false)
            {
                return false;
            }
        }

        return true;
    }
};
