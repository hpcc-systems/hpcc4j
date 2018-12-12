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

import java.lang.Class;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Field;

public class ReflectionRecordBuilder<T> implements IRecordBuilder
{
    private Field[]                      fields              = null;
    private FieldDef                     fieldDef            = null;

    private ReflectionRecordBuilder<T>[] childRecordBuilders = null;

    private T                            record              = null;
    private Class<T>                     recordClass         = null;

    ReflectionRecordBuilder(Class<T> clazz)
    {
        this.recordClass = clazz;
    }

    public void setRecordDefinition(FieldDef recordDef)
    {
        this.fieldDef = recordDef;
        this.childRecordBuilders = new ReflectionRecordBuilder[this.fieldDef.getNumDefs()];
        for (int i = 0; i < this.fieldDef.getNumDefs(); i++)
        {
            FieldDef fd = this.fieldDef.getDef(i);
            boolean needsChildRecordBuilder = (fd.getFieldType() == FieldType.RECORD)
                    || (fd.getFieldType() == FieldType.DATASET && fd.getDef(0).getFieldType() == FieldType.RECORD);

            if (needsChildRecordBuilder)
            {
                try
                {
                    Field field = this.recordClass.getDeclaredField(fd.getFieldName());
                    field.setAccessible(true);
                    this.fields[i] = field;

                    FieldDef subFd = fd;
                    Class subClass = field.getType();
                    if (fd.getFieldType() == FieldType.DATASET)
                    {
                        // This should be a list type so grab its argument class
                        subClass = null;
                        Type genericFieldType = field.getGenericType();
                        if (genericFieldType instanceof ParameterizedType)
                        {
                            ParameterizedType pType = (ParameterizedType) genericFieldType;
                            Type[] fieldArgTypes = pType.getActualTypeArguments();
                            if (fieldArgTypes.length > 0)
                            {
                                subClass = (Class) fieldArgTypes[0];
                            }
                        }

                        subFd = fd.getDef(0);
                    }

                    childRecordBuilders[i] = new ReflectionRecordBuilder(subClass);
                    childRecordBuilders[i].setRecordDefinition(subFd);
                }
                catch (Exception e)
                {
                    childRecordBuilders[i] = null;
                }
            }
            else
            {
                childRecordBuilders[i] = null;
            }
        }

        this.fields = new Field[this.fieldDef.getNumDefs()];
        for (int i = 0; i < this.fieldDef.getNumDefs(); i++)
        {
            FieldDef fd = this.fieldDef.getDef(i);
            try
            {
                Field field = this.recordClass.getDeclaredField(fd.getFieldName());
                field.setAccessible(true);
                this.fields[i] = field;
            }
            catch (Exception e)
            {
                this.fields[i] = null;
            }
        }
    }

    public void startRecord() throws java.lang.InstantiationException
    {
        try
        {
            this.record = this.recordClass.newInstance();
        }
        catch (Exception e)
        {
            throw new java.lang.InstantiationException();
        }
    }

    public Object finalizeRecord() throws java.lang.InstantiationException
    {
        return this.record;
    }

    public void setFieldValue(int index, Object value) throws IllegalArgumentException, IllegalAccessException
    {
        if (this.fields[index] != null)
        {
            this.fields[index].set(this.record, value);
        }
    }

    public IRecordBuilder getChildRecordBuilder(int index)
    {
        return this.childRecordBuilders[index];
    }
}
