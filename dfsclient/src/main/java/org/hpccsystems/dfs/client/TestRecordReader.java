/*******************************************************************************
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
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import org.hpccsystems.dfs.client.IRecordBuilder;
import org.hpccsystems.dfs.client.IRecordReader;

import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;

import java.io.IOException;
import java.util.ArrayList;
import java.math.BigDecimal;

/**
 * A TestRecordReader for use with testing
 */
public class TestRecordReader implements IRecordReader
{
    private int    totalTopLevelRecords      = 0;
    private int    generatedRecordCount      = 0;

    IRecordBuilder recordBuilder             = null;
    FieldDef       projectedRecordDefinition = null;

    TestRecordReader(int numTopLevelRecords)
    {
        totalTopLevelRecords = numTopLevelRecords;
    }

    public void initialize(IRecordBuilder recordBuilder) throws Exception
    {
        this.recordBuilder = recordBuilder;
        this.projectedRecordDefinition = recordBuilder.getRecordDefinition();

        if (this.projectedRecordDefinition.getFieldType() != FieldType.RECORD)
        {
            throw new Exception("Aborting record builder test. Invalid record defintion provided");
        }
    }

    /**
     * Are there more records?
     * 
     * @return true if there is at least one more record
     * @throws HpccFileException
     *             if there was a failure on the back end. This error is not recoverable by a retry.
     */
    public boolean hasNext() throws HpccFileException
    {
        return generatedRecordCount < totalTopLevelRecords;
    }

    /**
     * Produce the next record.
     * 
     * @return a record
     * @throws HpccFileException
     *             error on the back end, not recoverable
     */
    public Object getNext() throws HpccFileException
    {
        generatedRecordCount++;
        return createMockRecord(this.recordBuilder, this.projectedRecordDefinition);
    }

    private Object createMockValue(FieldDef fieldDef) throws HpccFileException
    {
        switch (fieldDef.getFieldType())
        {
            case INTEGER:
                return new Long(0);
            case REAL:
                return new Double(1.1);
            case DECIMAL:
                return new BigDecimal(1.1);
            case BINARY:
                return new byte[0];
            case BOOLEAN:
                return new Boolean(false);
            case STRING:
            case CHAR:
            case VAR_STRING:
                return new String("Test");
            default:
                throw new HpccFileException(
                        "Encountered unexpected type while creating mock value: " + fieldDef.getFieldType());
        }
    }

    private Object createMockRecord(IRecordBuilder recordBuilder, FieldDef recordDefinition) throws HpccFileException
    {
        try
        {
            recordBuilder.startRecord();
        }
        catch (Exception e)
        {
            throw new HpccFileException("Failed to start record with error: " + e.getMessage());
        }

        for (int i = 0; i < recordDefinition.getNumDefs(); ++i)
        {
            FieldDef fd = recordDefinition.getDef(i);
            Object fieldValue = null;
            switch (fd.getFieldType())
            {
                case RECORD:
                {
                    IRecordBuilder childRecordBuilder = recordBuilder.getChildRecordBuilder(i);
                    if (childRecordBuilder == null)
                    {
                        throw new HpccFileException(
                                "Recieved null childRecordBuilder for record: " + fd.getFieldName());
                    }

                    fieldValue = createMockRecord(childRecordBuilder, fd);
                    break;
                }
                case DATASET:
                {
                    IRecordBuilder childRecordBuilder = recordBuilder.getChildRecordBuilder(i);
                    if (childRecordBuilder == null)
                    {
                        throw new HpccFileException(
                                "Recieved null childRecordBuilder for dataset: " + fd.getFieldName());
                    }

                    Object childRecord = createMockRecord(childRecordBuilder, fd.getDef(0));
                    ArrayList<Object> dataset = new ArrayList<Object>();
                    dataset.add(childRecord);
                    fieldValue = dataset;
                    break;
                }
                case SET:
                {
                    Object childValue = createMockValue(fd.getDef(0));
                    ArrayList<Object> set = new ArrayList<Object>();
                    set.add(childValue);
                    fieldValue = set;
                    break;
                }
                case INTEGER:
                case REAL:
                case DECIMAL:
                case BINARY:
                case BOOLEAN:
                case STRING:
                case CHAR:
                case VAR_STRING:
                    fieldValue = createMockValue(fd);
                    break;
                default:
                    throw new HpccFileException(
                            "Encountered unexpected type while creating mock record: " + fd.getFieldType());
            }

            try
            {
                recordBuilder.setFieldValue(i, fieldValue);
            }
            catch (Exception e)
            {
                throw new HpccFileException("Failed to set value for field: " + fd.getFieldName() + " of type: "
                        + fd.getFieldType() + " with error: " + e.getMessage());
            }
        }

        Object record = null;
        try
        {
            record = recordBuilder.finalizeRecord();
        }
        catch (Exception e)
        {
            throw new HpccFileException("Failed to finalize record with error: " + e.getMessage());
        }

        if (record == null)
        {
            throw new HpccFileException("Finalize record returned a null reference");
        }

        return record;
    }

    /**
     * getAvailable
     * Returns the number of bytes available to read immediately.
     * @return
     */
    public int getAvailable() throws IOException
    {
        return 1024;
    }

}
