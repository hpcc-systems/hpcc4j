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

import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.TestFieldDefinitions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.Schema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.io.File;
import java.nio.ByteBuffer;

import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.ParquetReader;
import org.apache.parquet.avro.AvroParquetReader;
import org.apache.parquet.avro.AvroParquetWriter;
import org.apache.parquet.io.api.Binary;
import org.apache.parquet.io.api.RecordConsumer;
import org.apache.parquet.schema.MessageTypeParser;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class DFSParquetReadWriteTest 
{
    @Test
    public void parquetReadWriteTest() throws Exception
    {
        FieldDef[] fieldDefs = new FieldDef[6];
        fieldDefs[0] = new FieldDef("strVal", FieldType.STRING, "STRING", 0, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("intVal", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("longVal", FieldType.INTEGER, "INTEGER8", 8, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[3] = new FieldDef("doubleVal", FieldType.REAL, "REAL8", 8, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[4] = new FieldDef("floatVal", FieldType.REAL, "REAL4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);

        FieldDef elementFieldDef = new FieldDef("intVal", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        FieldDef[] childFieldDefs = new FieldDef[1];
        childFieldDefs[0] = elementFieldDef;

        fieldDefs[5] = new FieldDef("arrayVal", FieldType.SET, "SET OF INTEGER", 0, false, false, HpccSrcType.LITTLE_ENDIAN, childFieldDefs);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        
        Object[] fields = new Object[6];
        fields[0] = "str";
        fields[1] = Integer.valueOf(42);
        fields[2] = Long.valueOf(42);
        fields[3] = Double.valueOf(42.42);
        fields[4] = Float.valueOf(42.42f);

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(10);
        fields[5] = intList;

        Object[] childFields = new Object[1];
        childFields[0] = "childField";
       
        HPCCRecord hpccRecord = new HPCCRecord(fields, recordDef);

        Schema recordSchema = AvroSchemaTranslator.toAvro(recordDef);
        System.out.println(recordSchema);
        File tempFile = File.createTempFile("parquet_test",".parquet");
        try
        {
            tempFile.deleteOnExit();

            ParquetOutputFile outFile = new ParquetOutputFile(tempFile);
            ParquetWriter<GenericRecord> parquetWriter = AvroParquetWriter.<GenericRecord> builder(outFile).withSchema(recordSchema).build();

            for (int i = 0; i < 10; i++)
            {
                GenericRecord avroRecord = (GenericRecord) AvroRecordTranslator.toAvro(recordSchema, recordDef, hpccRecord);
                parquetWriter.write(avroRecord);
            }

            parquetWriter.close();
        }
        catch (Exception e)
        {
            Assert.fail(e.getMessage());
        }

        try
        {
            ParquetInputFile inFile = new ParquetInputFile(tempFile);
            ParquetReader<GenericRecord> reader = AvroParquetReader.<GenericRecord> builder(inFile).build();

            int recordCount = 0;
            while (true)
            {
                GenericRecord record = reader.read();
                if (record == null)
                {
                    break;
                }
                HPCCRecord readRecord = (HPCCRecord) AvroRecordTranslator.toHPCC(record.getSchema(), null, recordDef, record);
                recordCount++;

                if (readRecord.equals(hpccRecord) == false)
                {
                    Assert.fail("Written records do not match read records");
                }
            }

            if (recordCount != 10)
            {
                Assert.fail("Mismatch between number for records written & read.");
            }
        }
        catch (Exception e)
        {
            Assert.fail(e.toString());
        }
    }
}

