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

import org.hpccsystems.commons.ecl.FieldDef;
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
import java.nio.ByteBuffer;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class DFSAvroTranslationTest 
{
    @Test
    public void avroBasicRecordTranslation() throws Exception
    {
        // Create schema
        ArrayList<Schema.Field> fields = new ArrayList<Schema.Field>();
        fields.add(new Schema.Field("string",Schema.create(Schema.Type.STRING)));
        fields.add(new Schema.Field("boolean",Schema.create(Schema.Type.BOOLEAN)));
        fields.add(new Schema.Field("int",Schema.create(Schema.Type.INT)));
        fields.add(new Schema.Field("long",Schema.create(Schema.Type.LONG)));
        fields.add(new Schema.Field("double",Schema.create(Schema.Type.DOUBLE)));
        fields.add(new Schema.Field("float",Schema.create(Schema.Type.FLOAT)));
        fields.add(new Schema.Field("bytes",Schema.create(Schema.Type.BYTES)));

        Schema arraySchema = Schema.createArray(Schema.create(Schema.Type.INT));
        fields.add(new Schema.Field("array",arraySchema,null,(Object)null));

        Boolean isError = false;
        ArrayList<Schema.Field> childFields = new ArrayList<Schema.Field>();
        childFields.add(new Schema.Field("int",Schema.create(Schema.Type.INT)));
        Schema childRecordSchema = Schema.createRecord("childRec", "", "", isError, childFields);
        fields.add(new Schema.Field("record",childRecordSchema,null,(Object)null));

        // Set field values
        Schema recordSchema = Schema.createRecord("rec", "", "", isError, fields);
        GenericRecordBuilder avroRecordBuilder = new GenericRecordBuilder(recordSchema);
        avroRecordBuilder.set(fields.get(0),"str");
        avroRecordBuilder.set(fields.get(1),Boolean.valueOf(false));
        avroRecordBuilder.set(fields.get(2),Integer.valueOf(42));
        avroRecordBuilder.set(fields.get(3),Long.valueOf(42));
        avroRecordBuilder.set(fields.get(4),Double.valueOf(42.42));
        avroRecordBuilder.set(fields.get(5),Float.valueOf(42.42f));

        // Create byte buffer
        ByteBuffer buf = ByteBuffer.allocate(16);
        for (int i = 0; i < 8; i++) buf.putChar('a');
        avroRecordBuilder.set(fields.get(6),buf);

        // Create an array
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(42);
        avroRecordBuilder.set(fields.get(7),intList);

        // Create child record
        GenericRecordBuilder avroChildRecordBuilder = new GenericRecordBuilder(childRecordSchema);
        avroChildRecordBuilder.set(childFields.get(0),42);
        avroRecordBuilder.set(fields.get(8),avroChildRecordBuilder.build());

        GenericRecord avroRecord = avroRecordBuilder.build();

        FieldDef recordDef = AvroSchemaTranslator.toHPCC(recordSchema,"rec");
        HPCCRecord hpccRecord = (HPCCRecord) AvroRecordTranslator.toHPCC(recordSchema, null, recordDef, avroRecord);
        System.out.println("Hpcc Record: " + hpccRecord.toString());

        // Compare records
        for (int i = 0; i < hpccRecord.getNumFields(); i++)
        {
            Object hpccField = hpccRecord.getField(i);
            Object avroField = avroRecord.get(i);
            if (avroField instanceof ByteBuffer)
            {
                byte[] avroBytes = ((ByteBuffer) avroField).array();
                if (Arrays.equals(avroBytes,(byte[])hpccField) == false)
                {
                    Assert.fail("Mismatch between fields: " + fields.get(i).name());
                }
            }
            else if (avroField instanceof IndexedRecord)
            {
                IndexedRecord avChildRec = (IndexedRecord) avroField;
                HPCCRecord hpccChildRec = (HPCCRecord) hpccField;
                for (int j = 0; j < hpccChildRec.getNumFields(); j++)
                {
                    if (hpccChildRec.getField(j).equals(avChildRec.get(j)) == false)
                    {
                        Assert.fail("Mismatch between child records");
                    }
                }

            }
            else if (hpccField.equals(avroField) == false)
            {
                System.out.println("HPCC: " + hpccField.toString() + " AVRO: " + avroField.toString());
                Assert.fail("Mismatch between fields: " + fields.get(i).name());
            }
        }
    }
}
