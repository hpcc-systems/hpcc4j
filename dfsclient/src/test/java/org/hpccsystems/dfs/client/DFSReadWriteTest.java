/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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

import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HPCCRecordAccessor;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.dfs.cluster.*;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DFSReadWriteTest extends BaseRemoteTest
{
    private static final String[] datasets       = { "~benchmark::integer::20kb", "~benchmark::all_types::200kb"};
    private static final int[]    expectedCounts = { 1250, 5600 };

    @Test
    public void readBadlyDistributedFileTest() throws Exception
    {
        //this file only has data on two nodes
        HPCCFile file = new HPCCFile(datasets[1], connString , hpccUser, hpccPass);
        file.setProjectList("");

        List<HPCCRecord> records = readFile(file, connTO);
        assertEquals("Not all records loaded",expectedCounts[1], records.size());
    }

    @Test
    public void integrationReadWriteBackTest() throws Exception
    {
        for (int i = 0; i < datasets.length; i++)
        {
            HPCCFile file = new HPCCFile(datasets[i], connString , hpccUser, hpccPass);
            file.setProjectList("");

            List<HPCCRecord> records = readFile(file, connTO);
            if (records.size() != expectedCounts[i])
            {
                Assert.fail("Record count mismatch for dataset: " + datasets[i] + " got: " + records.size() + " expected: " + expectedCounts[i]);
            }

            // Write the dataset back
            String copyFileName = datasets[i] + "-copy13";
            writeFile(records, copyFileName, file.getProjectedRecordDefinition(),connTO);

            // Read and compare to original dataset
            file = new HPCCFile(copyFileName, connString , hpccUser, hpccPass);

            List<HPCCRecord> copiedRecords = readFile(file, connTO);
            if (copiedRecords.equals(records) == false)
            {
                Assert.fail("Written dataset does not match original dataset: " + copyFileName);
            }
            
            //read out a projected layout, confirm that this works
            List<String> projectedfields=new ArrayList<String>();
            for (int j=0; j < file.getRecordDefinition().getNumDefs()-1;j++) 
            {
                projectedfields.add(file.getRecordDefinition().getDef(j).getFieldName());
            }            
            
            file=new HPCCFile(copyFileName, connString , hpccUser, hpccPass);

            FieldDef recdef=file.getRecordDefinition();
            file.setProjectList(String.join(",", projectedfields));
            List<HPCCRecord> recs=readFile(file, connTO);
            if (recs.get(0).getNumFields() != file.getRecordDefinition().getNumDefs()-1) 
            {
                fail("recs did not project correctly");
            }
        }
    }

    @Test
    public void nullWriteTest() throws Exception
    {
        String fname = datasets[1]; 
        HPCCFile file = new HPCCFile(fname, connString, hpccUser, hpccPass);
        file.setProjectList("");

        List<HPCCRecord> records = readFile(file, connTO);
        assertEquals( "Record count mismatch for dataset:" + fname + ". got: " + records.size() + " expected:" + expectedCounts[1],expectedCounts[1],records.size());

        HPCCRecord first = records.get(0);
        for (int f = 0; f < first.getNumFields(); f++)
        {
            first.setField(f, null);
        }

        // Write the dataset back
        String copyFileName = fname + "_copy";
        writeFile(records, copyFileName, file.getProjectedRecordDefinition(),connTO);

        file = new HPCCFile(copyFileName, connString, hpccUser, hpccPass);

        records = readFile(file, connTO);
        assertEquals( "Record count mismatch for dataset:" + copyFileName + ". got: " + records.size() +
                " expected:" + expectedCounts[1],expectedCounts[1],records.size());

        HPCCRecord rec0 = records.get(0);
        for (int i = 0; i < rec0.getNumFields(); i++)
        {
            Object field = rec0.getField(0);
            if (field instanceof Long)
            {
                assertEquals((Long) field, Long.valueOf(0));
            }
            else if (field instanceof Double)
            {
                assertEquals((Double) field, Double.valueOf(0.0));
            }
            else if (field instanceof Boolean)
            {
                assertEquals((Boolean) field, Boolean.valueOf(false));
            }
            else if (field instanceof String)
            {
                assertEquals((String) field, "");
            }
            else if (field instanceof BigDecimal)
            {
                assertEquals(((BigDecimal) field).intValue(),0);
            }
            else if (field instanceof List)
            {
                assertEquals(((List) field).size(),0);
            }
        }
    }

    @Test
    public void getMetadataTest() throws Exception
    {
        String fname = datasets[0]; 
        HPCCFile file = new HPCCFile(fname, connString, hpccUser, hpccPass);
        DFUFileDetailWrapper meta=file.getOriginalFileMetadata();
        assertNotNull("Meta was null for this file",meta);
        assertNotNull("Record count was null for this file",meta.getRecordCount());
        assertEquals(expectedCounts[0],Long.valueOf(meta.getRecordCountInt64()).intValue());
    }

    @Test
    public void getNullMetadataTest() throws Exception
    {
        HPCCFile file=new HPCCFile("notthere",connString,hpccUser,hpccPass);
        DFUFileDetailWrapper meta=file.getOriginalFileMetadata();
        assertNull("Meta should be null for nonexistent file",meta);
    }

    
    private static final String       ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_";
    private static final SecureRandom RANDOM   = new SecureRandom();

    /**
     * Generates random string of given length from Base65 alphabet (numbers, lowercase letters, uppercase letters).
     *
     * @param count length
     * @return random string of given length
     */
    public static String generateRandomString(int count)
    {
        StringBuilder sb = new StringBuilder(count);
        for (int i = 0; i < count; ++i)
        {
            sb.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
        }
        return sb.toString();
    }

    @Test
    public void integrationLargeRecordTest() throws Exception
    {
        // Create a large record dataset
        FieldDef[] fieldDefs = new FieldDef[3];
        fieldDefs[0] = new FieldDef("key", FieldType.INTEGER, "lNTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("char", FieldType.CHAR, "STRING1", 1, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("value", FieldType.STRING, "STRING", 0, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            Object[] fields = new Object[3];
            fields[0] = Long.valueOf(i);
            fields[1] = "C";
            fields[2] = generateRandomString(8096 * 1024);
            HPCCRecord record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }
        writeFile(records, "benchmark::large_record_8MB::10rows", recordDef,connTO);

        HPCCFile file = new HPCCFile("benchmark::large_record_8MB::10rows", connString , hpccUser, hpccPass);
        records = readFile(file, connTO);
        if (records.size() < 10)
        {
            Assert.fail("Failed to read large record dataset");
        }

        for (int i = 0; i < 10; i++)
        {
            HPCCRecord record = records.get(i);
            String charStr = (String) record.getField(1);
            if (charStr.equals("C") == false)
            {
                Assert.fail("Record mismatch");
            }
        }
    }

    @Test
    public void numericOverflowTest() throws Exception
    {
        // Create a large record dataset
        FieldDef[] fieldDefs = new FieldDef[16];
        fieldDefs[0] = new FieldDef("int1", FieldType.INTEGER, "INTEGER1", 1, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("uint1", FieldType.INTEGER, "UNSIGNED1", 1, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("int2", FieldType.INTEGER, "INTEGER2", 2, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[3] = new FieldDef("uint2", FieldType.INTEGER, "UNSIGNED2", 2, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[4] = new FieldDef("int3", FieldType.INTEGER, "INTEGER3", 3, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[5] = new FieldDef("uint3", FieldType.INTEGER, "UNSIGNED3", 3, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[6] = new FieldDef("int4", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[7] = new FieldDef("uint4", FieldType.INTEGER, "UNSIGNED4", 4, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[8] = new FieldDef("int5", FieldType.INTEGER, "INTEGER5", 5, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[9] = new FieldDef("uint5", FieldType.INTEGER, "UNSIGNED5", 5, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[10] = new FieldDef("int6", FieldType.INTEGER, "INTEGER6", 6, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[11] = new FieldDef("uint6", FieldType.INTEGER, "UNSIGNED6", 6, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[12] = new FieldDef("int7", FieldType.INTEGER, "INTEGER7", 7, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[13] = new FieldDef("uint7", FieldType.INTEGER, "UNSIGNED7", 7, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[14] = new FieldDef("dec24", FieldType.DECIMAL, "DECIMAL24_12", 0, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[14].setPrecision(24);
        fieldDefs[14].setScale(12);
        fieldDefs[15] = new FieldDef("uint8", FieldType.INTEGER, "UNSIGNED8", 8, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        
        BigInteger intDigits = BigInteger.valueOf(1234567890000000L);
        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            Object[] fields = new Object[16];
            // 1 Byte ints
            fields[0] = Long.valueOf(128);
            fields[1] = Long.valueOf(256);
            
            // 2 Byte ints
            fields[2] = Long.valueOf(32768);
            fields[3] = Long.valueOf(65536);
            
            // 3 Byte ints
            fields[4] = Long.valueOf(8388608);
            fields[5] = Long.valueOf(16777216);
            
            // 4 Byte ints
            fields[6] = Long.valueOf(2147483648L);
            fields[7] = Long.valueOf(4294967296L);
            
            // 5 Byte ints
            fields[8] = Long.valueOf(549755813888L);
            fields[9] = Long.valueOf(1099511627776L);
            
            // 6 Byte ints
            fields[10] = Long.valueOf(140737488355328L);
            fields[11] = Long.valueOf(281474976710656L);

            // 7 Byte ints
            fields[12] = Long.valueOf(36028797018963968L);
            fields[13] = Long.valueOf(72057594037927936L);

            fields[14] = new BigDecimal(intDigits,0);
            
            fields[15]=  new BigDecimal("9223372036854775807");
            
            HPCCRecord record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }

        String fileName = "benchmark::numeric_overflow_test::10rows";
        writeFile(records, fileName, recordDef, connTO);

        HPCCFile file = new HPCCFile(fileName, connString , hpccUser, hpccPass);

        Object[] expectedFields = new Object[16];
        expectedFields[0] = Long.valueOf(-128);
        expectedFields[1] = Long.valueOf(0);
        
        expectedFields[2] = Long.valueOf(-32768);
        expectedFields[3] = Long.valueOf(0);
       
        expectedFields[4] = Long.valueOf(-8388608);
        expectedFields[5] = Long.valueOf(0);

        expectedFields[6] = Long.valueOf(-2147483648L);
        expectedFields[7] = Long.valueOf(0);

        expectedFields[8] = Long.valueOf(-549755813888L);
        expectedFields[9] = Long.valueOf(0);
        
        expectedFields[10] = Long.valueOf(-140737488355328L);
        expectedFields[11] = Long.valueOf(0);

        expectedFields[12] = Long.valueOf(-36028797018963968L);
        expectedFields[13] = Long.valueOf(0);

        BigDecimal expectedDecimal = new BigDecimal(BigInteger.valueOf(567890000000L),0);
        expectedFields[14] = expectedDecimal.setScale(12);

        expectedFields[15]=  new BigDecimal("9223372036854775807");
        
        HPCCRecord expectedRecord = new HPCCRecord(expectedFields, recordDef);
        records = readFile(file, connTO);

        BigInteger UNSIGNED_LONG_MASK = BigInteger.ONE.shiftLeft(Long.SIZE).subtract(BigInteger.ONE);
        for (int i = 0; i < 10; i++)
        {
            HPCCRecord record = records.get(i);
            BigDecimal actDecimal = (BigDecimal) record.getField(14);
            record.setField(14,actDecimal.setScale(12));
            
            record.setField(15,new BigDecimal(BigInteger.valueOf(((Long)record.getField(15)).longValue())
                    .and(UNSIGNED_LONG_MASK)));

            if (record.equals(expectedRecord) == false)
            {
                System.out.println("Expected: " + expectedRecord);
                System.out.println("Actual: " + record);
                Assert.fail("Records did not match.");
            }
        }
    }

    @Test
    public void filteredTest() throws Exception
    {
        // Create a large record dataset
        FieldDef[] fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("key", FieldType.INTEGER, "lNTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("value", FieldType.STRING, "STRING", 0, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            Object[] fields = new Object[2];
            fields[0] = Long.valueOf(i);
            fields[1] = generateRandomString(8096 * 1024);
            HPCCRecord record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }
        writeFile(records, "benchmark::large_record_8MB::10rows", recordDef,connTO);

        HPCCFile file = new HPCCFile("benchmark::large_record_8MB::10rows", connString , hpccUser, hpccPass);
        file.setFilter("key = 0 OR key > 10");

        records = readFile(file, connTO);
        if (records.size() != 1)
        {
            Assert.fail("Failed to read filtered record dataset");
        }
    }

    @Test
    public void resumeFileReadTest() throws Exception
    {
        HPCCFile file = new HPCCFile("benchmark::integer::20kb", connString , hpccUser, hpccPass);
        
        DataPartition[] fileParts = file.getFileParts();
        FieldDef originalRD = file.getRecordDefinition();

        // Get a list of records per partition
        ArrayList<ArrayList<HPCCRecord>> recordPartitions = new ArrayList<ArrayList<HPCCRecord>>();
        for (int i = 0; i < fileParts.length; i++)
        {
            ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
            
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);
            while (fileReader.hasNext())
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during read");
                }

                records.add(record);
            }
            fileReader.close();

            recordPartitions.add(records);
        }

        // Read have the records in each partition and then grab the resume info for the file reader
        file = new HPCCFile("benchmark::integer::20kb", connString , hpccUser, hpccPass);
        
        fileParts = file.getFileParts();
        originalRD = file.getRecordDefinition();

        // Get a list of records per partition and resume info
        ArrayList<ArrayList<HPCCRecord>> resumedRecordPartitions = new ArrayList<ArrayList<HPCCRecord>>();
        ArrayList<HpccRemoteFileReader.FileReadResumeInfo> partitionResumeList = new ArrayList<HpccRemoteFileReader.FileReadResumeInfo>();

        for (int i = 0; i < fileParts.length; i++)
        {
            ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
            
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);

            int numRecordsToRead = recordPartitions.get(i).size() / 2;
            while (fileReader.hasNext() && records.size() < numRecordsToRead)
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during read");
                }

                records.add(record);
            }

            fileReader.close();
            partitionResumeList.add(fileReader.getFileReadResumeInfo());

            resumedRecordPartitions.add(records);
        }

        // Resume reads
        file = new HPCCFile("benchmark::integer::20kb", connString , hpccUser, hpccPass);
        
        fileParts = file.getFileParts();
        originalRD = file.getRecordDefinition();

        for (int i = 0; i < fileParts.length; i++)
        {
            ArrayList<HPCCRecord> records = resumedRecordPartitions.get(i);
            
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());

            // Create a new file reader with the resume info from above
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder,
                                                                                                -1, -1, true, -1, partitionResumeList.get(i));

            while (fileReader.hasNext())
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during resume read");
                }

                records.add(record);
            }

            fileReader.close();
        }

        // Compare the records
        for (int i = 0; i < recordPartitions.size(); i++)
        {
            ArrayList<HPCCRecord> records = recordPartitions.get(i);
            ArrayList<HPCCRecord> resumedRecords = resumedRecordPartitions.get(i);
            if (records.size() != resumedRecords.size())
            {
                System.out.println("Actual record count: " + records.size() + " resumed record count: " + resumedRecords.size());
                Assert.fail("Resumed records didn't match original records");
            }

            for (int j = 0; j < records.size(); j++)
            {
                if (records.get(j).equals(resumedRecords.get(j)) == false)
                {
                    System.out.println("Original Record " + j + ":");
                    System.out.println(records.get(j));
                    
                    System.out.println("\nResumed Record " + j + ":");
                    System.out.println(resumedRecords.get(j));

                    Assert.fail("Resumed records didn't match original records");
                }
            }
        }
    }

    public List<HPCCRecord> readFile(HPCCFile file, Integer connectTimeoutMillis) throws Exception
    {
        if (file == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }
        if (connectTimeoutMillis != null) 
        {
            file.setFileAccessExpirySecs(connectTimeoutMillis/1000);
        }
        DataPartition[] fileParts = file.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = file.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() == 0)
        {
            Assert.fail("Invalid or null record definition");
        }

        ArrayList<HpccRemoteFileReader<HPCCRecord>> fileReaders = new ArrayList<HpccRemoteFileReader<HPCCRecord>>();
        for (int i = 0; i < fileParts.length; i++)
        {
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
                HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);
                fileReaders.add(fileReader);
            }
            catch (Exception e)
            {
                Throwable cause = e.getCause();
                if (cause instanceof  HpccFileException)
                {
                    if (cause.getCause() instanceof java.net.SocketTimeoutException)
                        System.out.println("File Read failed due to connect timeout, if filepart location is on an unreachable ip consider setting up a cluster remapper");
                }

                Assert.fail("Error constructing reader: " + e.getMessage());
            }
        }

        ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < fileReaders.size(); i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = fileReaders.get(i);
            while (fileReader.hasNext())
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during read");
                }

                records.add(record);
            }
            fileReader.close();

            if (fileReader.getRemoteReadMessageCount() > 0)
                System.out.println("Messages from file part (" + i + ") read operation:\n" + fileReader.getRemoteReadMessages());
        }

        return records;
    }

    private void writeFile(List<HPCCRecord> records, String fileName, FieldDef recordDef, Integer connectTimeoutMs)
    {
        try
        {
            //------------------------------------------------------------------------------
            //  Request a temp file be created in HPCC to write to
            //------------------------------------------------------------------------------

            String eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDef);

            HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

            String clusterName = this.thorClusterFileGroup;
            System.out.println("Create Start");
            DFUCreateFileWrapper createResult = dfuClient.createFile(fileName, clusterName, eclRecordDefn, connTO==null?300:connTO, false, DFUFileTypeWrapper.Flat, "");
            System.out.println("Create Finished");

            DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
            DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts,
                    new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()), dfuFileParts.length, createResult.getFileAccessInfoBlob());

            //------------------------------------------------------------------------------
            //  Write partitions to file parts
            //------------------------------------------------------------------------------

            int recordsPerPartition = records.size() / dfuFileParts.length;

            // These should be distributed evenly but we won't do this for the test
            int residualRecords = records.size() % dfuFileParts.length;

            int currentRecord = 0;
            int bytesWritten = 0;
            for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++)
            {
                int numRecordsInPartition = recordsPerPartition;
                if (partitionIndex == dfuFileParts.length - 1)
                {
                    numRecordsInPartition += residualRecords;
                }

                HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
                HPCCRemoteFileWriter<HPCCRecord> fileWriter = null;
                if (connectTimeoutMs != null) 
                {
                    fileWriter=new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef,
                            recordAccessor, CompressionAlgorithm.NONE,connectTimeoutMs);
                    //wait a bit longer than the default timeout to ensure the override connect timeout
                    //is being honoured
                    if (connectTimeoutMs != null 
                            && connectTimeoutMs > RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS+1) 
                    {
                        Thread.sleep(RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS+1);
                    }
                } else {
                    fileWriter=new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef,
                            recordAccessor, CompressionAlgorithm.NONE);
                }
                try
                {
                    for (int j = 0; j < numRecordsInPartition; j++, currentRecord++)
                    {
                        fileWriter.writeRecord(records.get(currentRecord));
                    }
                    fileWriter.close();
                    bytesWritten += fileWriter.getBytesWritten();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    Assert.fail(e.getMessage());
                }
            }

            //------------------------------------------------------------------------------
            //  Publish and finalize the temp file
            //------------------------------------------------------------------------------

            System.out.println("Publish Start");
            dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, currentRecord, bytesWritten, true);
            System.out.println("Publish Finished");
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Failed to write file with error: " + e.getMessage());
        }
    }


    private class LongKVData
    {
        public Long key;
        public Long value;
    };

    public void testReflectionRecordBuilder() throws Exception
    {
        /*
         * if (this.file == null) { Assert.fail("HPCCFile construction failed."); }
         * 
         * DataPartition[] fileParts = this.file.getFileParts(); if (fileParts == null || fileParts.length == 0) {
         * Assert.fail("No file parts found"); }
         * 
         * FieldDef recordDefinition = this.file.getRecordDefinition(); if (recordDefinition == null ||
         * recordDefinition.getNumDefs() != 2) { Assert.fail("Invalid or null record definition"); }
         * 
         * int totalRecords = 0; for (int i = 0; i < fileParts.length; i++) { ReflectionRecordBuilder recordBuilder =
         * new ReflectionRecordBuilder<LongKVData>(LongKVData.class); HpccRemoteFileReader<LongKVData> fileReader = new
         * HpccRemoteFileReader<LongKVData>(fileParts[i], recordDefinition, recordBuilder); while (fileReader.hasNext())
         * { LongKVData record = fileReader.next(); if (record == null) {
         * Assert.fail("Received null record during read"); }
         * 
         * totalRecords++; } }
         * 
         * if (totalRecords != testDatasetRecordCount) {
         * Assert.fail("Record count does not match expected record count"); }
         */
    }

    @After
    public void shutdown()
    {

    }
}
