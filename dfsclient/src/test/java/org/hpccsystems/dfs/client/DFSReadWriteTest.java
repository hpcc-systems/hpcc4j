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
import java.util.Calendar;

import java.net.URL;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;

import org.hpccsystems.dfs.cluster.*;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldFilter;
import org.hpccsystems.commons.ecl.FieldFilterRange;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.commons.utils.Utils;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.MethodSorters;
import org.junit.experimental.categories.Category;

import static org.hpccsystems.dfs.client.HpccRemoteFileReader.DEFAULT_READ_SIZE_OPTION;
import static org.hpccsystems.dfs.client.HpccRemoteFileReader.NO_RECORD_LIMIT;
import static org.junit.Assert.*;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DFSReadWriteTest extends BaseRemoteTest
{
    private static final String[] datasets       = { "~benchmark::integer::20kb", "~unit_test::all_types::thor", "~unit_test::all_types::xml", "~unit_test::all_types::json", "~unit_test::all_types::csv" };
    private static final int[]    expectedCounts = { 1250, 5600, 10000, 10000, 10000, 10000};

    //use until standard test is working
    //        private static final String[] datasets       = { "~benchmark::integer::20kb", "~benchmark::all_types::200kb"};//, "~unit_test::all_types::xml", "~unit_test::all_types::json", "~unit_test::all_types::csv" };
    //        private static final int[]    expectedCounts = { 1250, 5600 };//, 10000, 10000, 10000, 10000};
    private static final Version newProtocolVersion = new Version(8,12,10);


    @Test
    public void readBadlyDistributedFileTest() throws Exception
    {
        //this file only has data on two nodes
        HPCCFile file = new HPCCFile(datasets[1], connString , hpccUser, hpccPass);
        assertFalse(file.isTlkIndex());
        List<HPCCRecord> records = readFile(file, connTO, false);
        assertEquals("Not all records loaded",expectedCounts[1], records.size());
    }

    @Test
    public void readWithForcedTimeoutTest() throws Exception
    {
        HPCCFile file = new HPCCFile(datasets[0], connString , hpccUser, hpccPass);

        // Set expiration to 15,000ms
        List<HPCCRecord> records = readFile(file, 15000, true);
        assertEquals("Not all records loaded",expectedCounts[0], records.size());
    }

    @Test
    public void nullCharTests() throws Exception
    {
        // Unicode
        boolean unicodePassed = true;
        {
            FieldDef recordDef = null;
            {
                FieldDef[] fieldDefs = new FieldDef[2];
                fieldDefs[0] = new FieldDef("uni", FieldType.STRING, "STRING", 100, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
                fieldDefs[1] = new FieldDef("fixedUni", FieldType.STRING, "STRING", 200, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);

                recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
            }

            List<HPCCRecord> records = new ArrayList<HPCCRecord>();
            int maxUTF16BMPChar = Character.MAX_CODE_POINT;
            for (int i = 0; i < maxUTF16BMPChar; i++)
            {

                String strMidEOS = "";
                for (int j = 0; j < 98; j++, i++)
                {
                    if (!Character.isValidCodePoint(i) || !Character.isDefined(i))
                    {
                        continue;
                    }

                    char[] chars = Character.toChars(i);
                    if (Character.isSurrogate(chars[0]))
                    {
                        continue;
                    }

                    if (j == 50 && strMidEOS.length() > 0)
                    {
                        strMidEOS += "\0";
                    }

                    String charStr = new String(chars);
                    strMidEOS += charStr;
                }

                Object[] fields = {strMidEOS, strMidEOS};
                records.add(new HPCCRecord(fields, recordDef));
            }

            String fileName = "unicode::all_chars::test";
            writeFile(records, fileName, recordDef, connTO);

            HPCCFile file = new HPCCFile(fileName, connString , hpccUser, hpccPass);
            List<HPCCRecord> readRecords = readFile(file, 10000, false, false, BinaryRecordReader.TRIM_STRINGS);

            for (int i = 0; i < records.size(); i++)
            {
                HPCCRecord record = records.get(i);
                HPCCRecord readRecord = readRecords.get(i);
                if (readRecord.equals(record) == false)
                {
                    System.out.println("Record: " + i + " did not match\n" + record + "\n" + readRecord);
                    unicodePassed = false;
                }
            }
        }

        // SBC / ASCII
        boolean sbcPassed = true;
        {
            FieldDef recordDef = null;
            {
                FieldDef[] fieldDefs = new FieldDef[2];
                fieldDefs[0] = new FieldDef("str", FieldType.STRING, "STRING", 10, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
                fieldDefs[1] = new FieldDef("fixedStr", FieldType.STRING, "STRING", 10, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

                recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
            }

            List<HPCCRecord> records = new ArrayList<HPCCRecord>();
            for (int i = 0; i < 255; i++)
            {
                String strMidEOS = "";
                for (int j = 0; j < 9; j++, i++)
                {
                    if (j == 5)
                    {
                        strMidEOS += "\0";
                    }
                    strMidEOS += new String(Character.toChars(j));
                }

                Object[] fields = {strMidEOS, strMidEOS};
                records.add(new HPCCRecord(fields, recordDef));
            }

            String fileName = "ascii::all_chars::test";
            writeFile(records, fileName, recordDef, connTO);

            HPCCFile file = new HPCCFile(fileName, connString , hpccUser, hpccPass);
            List<HPCCRecord> readRecords = readFile(file, 10000, false, false, BinaryRecordReader.TRIM_STRINGS);

            for (int i = 0; i < records.size(); i++)
            {
                HPCCRecord record = records.get(i);
                HPCCRecord readRecord = readRecords.get(i);
                if (readRecord.equals(record) == false)
                {
                    System.out.println("Record: " + i + " did not match\n" + record + "\n" + readRecord);
                    sbcPassed = false;
                }
            }
        }

        assertTrue("Unicode EOS character test failed. See mismatches above.", unicodePassed);
        assertTrue("Single byte EOS character test failed. See mismatches above.", sbcPassed);
    }

    @Test
    public void integrationReadWriteBackTest() throws Exception
    {
        for (int i = 0; i < datasets.length; i++)
        {
            HPCCFile file = new HPCCFile(datasets[i], connString, hpccUser, hpccPass);
            file.setProjectList("");

            System.out.println("Reading dataset: " + datasets[i]);
            List<HPCCRecord> records = readFile(file, connTO, false);
            if (records.size() != expectedCounts[i])
            {
                Assert.fail("Record count mismatch for dataset: " + datasets[i] + " got: " + records.size() + " expected: " + expectedCounts[i]);
            }

            // Write the dataset back
            String copyFileName = datasets[i] + "-copy";
            System.out.println("Writing dataset: " + copyFileName);
            writeFile(records, copyFileName, file.getProjectedRecordDefinition(),connTO);

            // Read and compare to original dataset
            file = new HPCCFile(copyFileName, connString , hpccUser, hpccPass);

            List<HPCCRecord> copiedRecords = readFile(file, connTO, false);
            if (copiedRecords.equals(records) == false)
            {
                Assert.fail("Written dataset does not match original dataset: " + copyFileName);
            }

            //read out a projected layout, confirm that this works
            List<String> projectedfields = new ArrayList<String>();
            for (int j=0; j < file.getRecordDefinition().getNumDefs()-1;j++)
            {
                projectedfields.add(file.getRecordDefinition().getDef(j).getFieldName());
            }

            file=new HPCCFile(copyFileName, connString , hpccUser, hpccPass);

            file.setProjectList(String.join(",", projectedfields));
            List<HPCCRecord> recs=readFile(file, connTO, false);
            if (recs.get(0).getNumFields() != file.getRecordDefinition().getNumDefs()-1)
            {
                fail("recs did not project correctly");
            }
        }
    }

    @Test
    public void readResumeTest() throws Exception
    {
        HPCCFile file = new HPCCFile(datasets[0], connString , hpccUser, hpccPass);

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

        ArrayList<HpccRemoteFileReader.FileReadResumeInfo> resumeInfo = new ArrayList<HpccRemoteFileReader.FileReadResumeInfo>();
        ArrayList<Integer> resumeFilePart = new ArrayList<Integer>();
        ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < fileParts.length; i++)
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);

            while (fileReader.hasNext())
            {
                resumeInfo.add(fileReader.getFileReadResumeInfo());
                resumeFilePart.add(i);
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

        Runtime runtime = Runtime.getRuntime();
        int readSizeKB = 100;
        ArrayList<HPCCRecord> resumedRecords = new ArrayList<HPCCRecord>();
        for (int i = 0; i < resumeInfo.size(); i++)
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(
                    fileParts[resumeFilePart.get(i)], originalRD, recordBuilder, 1000000, -1, true, readSizeKB, resumeInfo.get(i));

            if (fileReader.hasNext())
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during resumed read");
                }

                resumedRecords.add(record);
            }

            // Periodically run garbage collector to prevent buffers in remote file readers from exhausting free memory
            // This is only needed due to rapidly creating / destroying thousands of HpccRemoteFileReaders
            if ((i % 10) == 0)
            {
                runtime.gc();
            }
            fileReader.close();

            fileReader = null;
            recordBuilder = null;
        }

        assertEquals("Number of records did not match during read resume.", records.size(), resumedRecords.size());
        for (int i = 0; i < resumedRecords.size(); i++)
        {
            HPCCRecord record = records.get(i);
            HPCCRecord resumedRecord = resumedRecords.get(i);
            assertEquals("Record " + i + ": did not match\n" + record + "\n" + resumedRecord, record, resumedRecord);
        }
    }

    @Test
    public void nullWriteTest() throws Exception
    {
        String fname = datasets[1];
        HPCCFile file = new HPCCFile(fname, connString, hpccUser, hpccPass);
        file.setProjectList("");

        List<HPCCRecord> records = readFile(file, connTO, false);
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

        records = readFile(file, connTO, false);
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
    public void nullElementTests()
    {
        FieldDef[] stringSetElemFD = new FieldDef[1];
        stringSetElemFD[0] = new FieldDef("strValue", FieldType.STRING, "UTF8", 4, false, false, HpccSrcType.UTF8, new FieldDef[0]);

        FieldDef[] childDatasetElemFD = new FieldDef[1];
        {
            FieldDef[] fieldDefs = new FieldDef[1];
            fieldDefs[0] = new FieldDef("strValue", FieldType.STRING, "UTF8", 4, false, false, HpccSrcType.UTF8, new FieldDef[0]);
            childDatasetElemFD[0] = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        }

        FieldDef recordDef = null;
        {
            FieldDef[] fieldDefs = new FieldDef[3];
            fieldDefs[0] = new FieldDef("stringSet", FieldType.SET, "SET", 4, false, false, HpccSrcType.LITTLE_ENDIAN, stringSetElemFD);
            fieldDefs[1] = new FieldDef("childDataset", FieldType.DATASET, "DATASET", 4, false, false, HpccSrcType.LITTLE_ENDIAN, childDatasetElemFD);
            fieldDefs[2] = new FieldDef("binaryField", FieldType.BINARY, "BINARY", 128, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
            recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        }

        List<String> stringSet = new ArrayList<String>();
        List<HPCCRecord> childDataSet = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            if ((i % 2) == 1)
            {
                stringSet.add("" + i);

                Object[] fields = new Object[1];
                fields[0] = "" + i;
                HPCCRecord childRecord = new HPCCRecord(fields, childDatasetElemFD[0]);
                childDataSet.add(childRecord);
            }
            else
            {
                stringSet.add(null);
                childDataSet.add(null);
            }
        }

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {

            Object[] fields = new Object[3];
            fields[0] = stringSet;
            fields[1] = childDataSet;

            if ((i % 2) == 1)
            {
                fields[2] = generateRandomString(128).getBytes();
            }
            else
            {
                fields[2] = null;
            }

            HPCCRecord record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }
        writeFile(records, "null::element::test", recordDef, connTO);
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
        records = readFile(file, connTO, false);
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
    public void unsigned8ToDecimalTest() throws Exception
    {
        // Create a large record dataset
        FieldDef[] fieldDefs = new FieldDef[3];
        fieldDefs[0] = new FieldDef("field1", FieldType.INTEGER, "UNSIGNED8", 8, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("field2", FieldType.INTEGER, "UNSIGNED8", 8, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("field3", FieldType.INTEGER, "UNSIGNED8", 8, true, true, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> originalRecords = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            Object[] fields = new Object[3];
            fields[0] = new BigDecimal(Utils.extractUnsigned8Val((long) Long.MIN_VALUE));       // Max U8 value
            fields[1] = new BigDecimal(0);                                                  // Min U8 value
            fields[2] = new BigDecimal(BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE)); // First U8 value that would cause an overflow
            HPCCRecord record = new HPCCRecord(fields, recordDef);
            originalRecords.add(record);
        }

        String datasetName = "benchmark::unsigned8::10rows";
        writeFile(originalRecords, datasetName, recordDef, connTO);

        HPCCFile file = new HPCCFile(datasetName, connString , hpccUser, hpccPass);
        List<HPCCRecord> readRecords = readFile(file, connTO, false, true);
        if (readRecords.size() < 10)
        {
            Assert.fail("Failed to read " + datasetName);
        }

        for (int i = 0; i < 10; i++)
        {
            HPCCRecord readRecord = readRecords.get(i);
            HPCCRecord originalRecord = originalRecords.get(i);

            assertEquals(readRecord, originalRecord);
        }
    }

    @Test
    public void longStringTest() throws Exception
    {
        // Create a large record dataset
        FieldDef[] fieldDefs = new FieldDef[4];
        fieldDefs[0] = new FieldDef("LongVarUnicode", FieldType.VAR_STRING, "", 4, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("LongUnicode", FieldType.STRING, "", 64, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("LongVarString", FieldType.VAR_STRING, "", 4, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[3] = new FieldDef("LongString", FieldType.STRING, "", 64, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> originalRecords = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 10; i++)
        {
            Object[] fields = new Object[4];
            fields[0] = generateRandomString(1024);
            fields[1] = generateRandomString(64);
            fields[2] = generateRandomString(1024);
            fields[3] = generateRandomString(64);
            HPCCRecord record = new HPCCRecord(fields, recordDef);
            originalRecords.add(record);
        }

        String datasetName = "benchmark::long_string::10rows";
        writeFile(originalRecords, datasetName, recordDef,connTO);

        HPCCFile file = new HPCCFile(datasetName, connString , hpccUser, hpccPass);
        List<HPCCRecord> readRecords = readFile(file, connTO, false);
        if (readRecords.size() < 10)
        {
            Assert.fail("Failed to read " + datasetName + " dataset");
        }

        for (int i = 0; i < 10; i++)
        {
            HPCCRecord originalRecord = originalRecords.get(i);
            HPCCRecord readRecord = originalRecords.get(i);
            Assert.assertEquals(originalRecord, readRecord);
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
        records = readFile(file, connTO, false);

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

    final static String dimdatefilename = "dfsclient::junit::dim_date";
    @Test
    public void filteredDIMDATEJAPI445Test() throws Exception
    {
        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        FieldDef[] fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("date_sk", FieldType.INTEGER, "unsigned8", 8, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("day_of_wk_num", FieldType.INTEGER, "unsigned8", 8, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        Calendar cal = Calendar.getInstance();
        Object[] fields = {20200401,91};
        HPCCRecord record = new HPCCRecord(fields, recordDef);
        records.add(record);

        for (int i = 0; i < 10; i++)
        {
            cal.set(Calendar.YEAR, 2021);
            cal.set(Calendar.DAY_OF_YEAR, RANDOM.nextInt(365));

            fields = new Object[2];
            fields[0] = cal.get(Calendar.YEAR)*10000 + cal.get(Calendar.MONTH)*100 + cal.get(Calendar.DAY_OF_MONTH);
            fields[1] = cal.get(Calendar.DAY_OF_YEAR);
            record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }
        writeFile(records, dimdatefilename, recordDef, connTO);

        HPCCFile file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        file.setFilter("date_sk >= 20200701 and date_sk <= 20211231");

        records = readFile(file, connTO, false);
        if (records.size() == 0)
        {
            Assert.fail("Date file filter unexpectedly returned more than 0 records");
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        FileFilter ffilter = new FileFilter(new FieldFilter("date_sk", FieldFilterRange.makeGT(20210101)));
        file.setFilter(ffilter);

        records = readFile(file, connTO, false);
        if (records.size() == 0)
        {
            Assert.fail("Date file filter unexpectedly returned 0 records");
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        ffilter = new FileFilter(new FieldFilter("date_sk", FieldFilterRange.makeGT("'20211231'")));
        file.setFilter(ffilter);
        records = readFile(file, connTO, false);
        if (records.size() != 0)
        {
            Assert.fail("Date file filter unexpectedly returned more than 0 records");
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        ffilter = new FileFilter(new FieldFilter("date_sk", FieldFilterRange.makeEq("20200401")));
        file.setFilter(ffilter);
        records = readFile(file, connTO, false);
        if (records.size() != 1)
        {
            Assert.fail("Date file filter was expected to return 1 record, records returned: " + records.size());
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        ffilter = new FileFilter(" \"date_sk\" IN 20200401, 19990101, 20101231 ");
        file.setFilter(ffilter);
        records = readFile(file, connTO, false);
        if (records.size() != 1)
        {
            Assert.fail("Date file filter was expected to return 1 record, records returned: " + records.size());
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        ffilter = new FileFilter(" \"date_sk\" IN '20200401', '19990101', '20101231' ");
        file.setFilter(ffilter);
        records = readFile(file, connTO, false);
        if (records.size() != 1)
        {
            Assert.fail("Date file filter was expected to return 1 record, records returned: " + records.size());
        }

        file = new HPCCFile(dimdatefilename, connString , hpccUser, hpccPass);
        ffilter = new FileFilter(" \"date_sk\" IN 20200401");
        file.setFilter(ffilter);
        records = readFile(file, connTO, false);
        if (records.size() != 1)
        {
            Assert.fail("Date file filter was expected to return 1 record, records returned: " + records.size());
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

        records = readFile(file, connTO, false);
        if (records.size() != 1)
        {
            Assert.fail("Failed to read filtered record dataset");
        }
    }

    @Test
    public void stringProcesingTests() throws Exception
    {
        String whiteSpaceStr = " \t\n\r\f"
                             + '\u0009' + '\u000B' + '\u000C'
                             + '\u001C' + '\u001D' + '\u001E' + '\u001F';

        // Adding additional data to end of fixed length strings to test against EOS.
        // Using an odd length to make sure that the trim() functionality works on odd alignments
        int fixedStrLen = whiteSpaceStr.length() * 2 + 8 + 3;

        FieldDef[] fieldDefs = new FieldDef[9];
        fieldDefs[0] = new FieldDef("str1", FieldType.STRING, "UTF8", 4, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("str2", FieldType.STRING, "STRING", 4, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("str3", FieldType.STRING, "UNICODE", 4, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[3] = new FieldDef("str4", FieldType.VAR_STRING, "VAR_UNICODE", 4, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[4] = new FieldDef("str5", FieldType.VAR_STRING, "VAR_STRING", 4, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[5] = new FieldDef("str6", FieldType.STRING, "FIXED_SBC", fixedStrLen, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[6] = new FieldDef("str7", FieldType.STRING, "FIXED_UNCIODE", fixedStrLen, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[7] = new FieldDef("str8", FieldType.VAR_STRING, "FIXED_VAR_UNICODE", fixedStrLen, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[8] = new FieldDef("str9", FieldType.VAR_STRING, "FIXED_VAR_STRING", fixedStrLen, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        List<HPCCRecord> records = new ArrayList<HPCCRecord>();

        String[] nonEmptyStrings = new String[9];
        {
            for (int i = 0; i < 9; i++)
            {
                nonEmptyStrings[i] = whiteSpaceStr + "0" + generateRandomString(8) + whiteSpaceStr;
            }

            HPCCRecord record = new HPCCRecord(nonEmptyStrings, recordDef);
            records.add(record);
        }

        {
            Object[] fields = new Object[9];
            for (int i = 0; i < 9; i++)
            {
                fields[i] = " ";
            }

            HPCCRecord record = new HPCCRecord(fields, recordDef);
            records.add(record);
        }

        String datasetName = "test::string_processing";
        writeFile(records, datasetName, recordDef, connTO);

        HPCCFile file = new HPCCFile(datasetName, connString , hpccUser, hpccPass);
        records = readFile(file, connTO, false, false, BinaryRecordReader.TRIM_STRINGS | BinaryRecordReader.CONVERT_EMPTY_STRINGS_TO_NULL);

        assertEquals(records.size(), 2);

        for (int i = 0; i < 9; i++)
        {
            assertEquals(records.get(0).getField(i), nonEmptyStrings[i].trim());
            assertEquals(records.get(1).getField(i), null);
        }

        records = readFile(file, connTO, false, false, BinaryRecordReader.TRIM_FIXED_LEN_STRINGS);

        assertEquals(records.size(), 2);

        for (int i = 0; i < 9; i++)
        {
            if (fieldDefs[i].isFixed())
            {
                assertEquals(records.get(0).getField(i), nonEmptyStrings[i].trim());
            }
            else
            {
                assertEquals(records.get(0).getField(i), nonEmptyStrings[i]);
            }
        }
    }

    @Test
    public void stringEOSTests() throws Exception
    {
        FieldDef[] fieldDefs = new FieldDef[9];
        fieldDefs[0] = new FieldDef("str1", FieldType.STRING, "UTF8", 4, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("str2", FieldType.STRING, "STRING", 4, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[2] = new FieldDef("str3", FieldType.STRING, "UNICODE", 4, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[3] = new FieldDef("str4", FieldType.VAR_STRING, "VAR_UNICODE", 4, false, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[4] = new FieldDef("str5", FieldType.VAR_STRING, "VAR_STRING", 4, false, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[5] = new FieldDef("str6", FieldType.STRING, "FIXED_SBC", 12, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[6] = new FieldDef("str7", FieldType.STRING, "FIXED_UNCIODE", 12, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[7] = new FieldDef("str8", FieldType.VAR_STRING, "FIXED_VAR_UNICODE", 12, true, false, HpccSrcType.UTF16LE, new FieldDef[0]);
        fieldDefs[8] = new FieldDef("str9", FieldType.VAR_STRING, "FIXED_VAR_STRING", 12, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();

        String[] nonEmptyStrings = new String[9];
        {
            for (int i = 0; i < 9; i++)
            {
                nonEmptyStrings[i] = " " + generateRandomString(8) + "\0 ";
            }

            HPCCRecord record = new HPCCRecord(nonEmptyStrings, recordDef);
            records.add(record);
        }

        String datasetName = "test::string::eos";
        writeFile(records, datasetName, recordDef, connTO);

        HPCCFile file = new HPCCFile(datasetName, connString , hpccUser, hpccPass);
        records = readFile(file, connTO, false, false);

        assertEquals(records.size(), 1);

        for (int i = 0; i < 9; i++)
        {
            String field = (String) records.get(0).getField(i);
            assertEquals(field.trim(), nonEmptyStrings[i].trim());
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

    @Test
    public void protocolVersionTest()
    {
        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

        HpccRemoteFileReader<HPCCRecord> fileReader = null;
        try
        {
            HPCCFile file = new HPCCFile("benchmark::integer::20kb", connString , hpccUser, hpccPass);
            DataPartition[] fileParts = file.getFileParts();
            FieldDef originalRD = file.getRecordDefinition();

            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[0], originalRD, recordBuilder);
        }
        catch (Exception e)
        {
            Assert.fail("Exception while setting up protocol test: " + e.getMessage());
        }

        Version remoteVersion = dfuClient.getTargetHPCCBuildVersion();

        if (remoteVersion.isEqualOrNewerThan(newProtocolVersion))
        {
            assertTrue("Expected rowservice with version: " + remoteVersion.toString() + " to be using new protocol.", fileReader.getInputStream().isUsingNewProtocol());
        }
        else
        {
            assertFalse("Expected rowservice with version: " + remoteVersion.toString() + " to be using old protocol.", fileReader.getInputStream().isUsingNewProtocol());
        }
    }

    @Ignore @Test
    public void emptyCompressedFileTest()
    {
        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();
        Version remoteVersion = dfuClient.getTargetHPCCBuildVersion();

        FieldDef[] fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("key", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("value", FieldType.STRING, "STRING", 0, false, false, HpccSrcType.UTF8, new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        if (remoteVersion.isEqualOrNewerThan(newProtocolVersion))
        {
            writeFile(records, "test::empty_file", recordDef, 12000, true);
        }
        else
        {
            try
            {
                writeFileAndReportAnyExceptions(records, "test::empty_file", recordDef, 12000, true);
            }
            catch (Exception e)
            {
                // We are expecting an exception
                return;
            }

            Assert.fail("Expected an exception when the file was closed without having written any data with this version of the protocol.");
        }
    }

    @Test
    public void filePartReadRetryTest()
    {
        {
            HPCCFile readFile = null;
            try
            {
                readFile = new HPCCFile(datasets[0], connString, hpccUser, hpccPass);
                DataPartition[] fileParts = readFile.getFileParts();
                for (int i = 0; i < fileParts.length; i++)
                {
                    String firstCopyIP = fileParts[i].getCopyIP(0);
                    String firstCopyPath = fileParts[i].getCopyPath(0);
                    fileParts[i].setCopyIP(0, "1.1.1.1");
                    fileParts[i].add(1, firstCopyIP, firstCopyPath);
                }

                List<HPCCRecord> records = readFile(readFile, null, false);
                System.out.println("Record count: " + records.size());
            }
            catch (Exception e)
            {
                Assert.fail(e.getMessage());
            }
        }

        {
            HPCCFile readFile = null;
            try
            {
                readFile = new HPCCFile(datasets[0], connString, hpccUser, hpccPass);
                DataPartition[] fileParts = readFile.getFileParts();
                for (int i = 0; i < fileParts.length; i++)
                {
                    fileParts[i].add(0,"1.1.1.1", "");
                }

                List<HPCCRecord> records = readFile(readFile, null, false);
                System.out.println("Record count: " + records.size());
            }
            catch (Exception e)
            {
                Assert.fail(e.getMessage());
            }
        }
    }

    @Test
    public void invalidSignatureTest()
    {

        HPCCFile readFile = null;
        {
            Exception readException = null;
            try
            {
                readFile = new HPCCFile(datasets[0], connString, hpccUser, hpccPass);
                DataPartition[] fileParts = readFile.getFileParts();

                for (int i = 0; i < fileParts.length; i++)
                {
                    fileParts[i].setFileAccessBlob("invalid_blob");
                }

                List<HPCCRecord> records = readFile(readFile, null, false);
                System.out.println("Record count: " + records.size());
            }
            catch (Exception e)
            {
                readException = e;
            }

            // We are expecting a failure
            if (readException != null)
            {
                System.out.println("Test passed with expected exception: " + readException.getMessage());
            }
            else
            {
                Assert.fail("Expected an exception during read due to the invalid signature");
            }
        }

        {
            Exception writeException = null;
            try
            {
                FieldDef recordDef = readFile.getRecordDefinition();
                String eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDef);

                HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();
                DFUCreateFileWrapper createResult = dfuClient.createFile(datasets[0] + "-copy123", this.thorClusterFileGroup, eclRecordDefn, 300, false, DFUFileTypeWrapper.Flat, "");

                DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
                DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts,
                        new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()), dfuFileParts.length, createResult.getFileAccessInfoBlob());

                for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++)
                {
                    hpccPartitions[partitionIndex].setFileAccessBlob("invalid_blob");

                    HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
                    HPCCRemoteFileWriter<HPCCRecord> fileWriter = null;

                    fileWriter = new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef, recordAccessor, CompressionAlgorithm.NONE);
                    fileWriter.close();
                }

                dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, 0, 0, true);
            }
            catch (Exception e)
            {
                writeException = e;
            }

            // We are expecting a failure
            if (writeException != null)
            {
                System.out.println("Test passed with expected exception: " + writeException.getMessage());
            }
            else
            {
                Assert.fail("Expected an exception during write due to the invalid signature");
            }
        }
    }

    @Test
    public void earlyCloseTest() throws Exception
    {
        HPCCFile file = new HPCCFile(datasets[0], connString , hpccUser, hpccPass);

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

        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[0], originalRD, recordBuilder);

            int expectedRecordCounts = 10;
            int numRecords = 0;
            while (fileReader.hasNext())
            {
                try
                {
                    fileReader.next();
                    numRecords++;
                }
                catch (Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }

                if (numRecords == expectedRecordCounts)
                {
                    fileReader.close();
                }
            }
            assertTrue("Expected record count: " + expectedRecordCounts + " Actual count: " + numRecords, numRecords == expectedRecordCounts);
        }

        // Check that calling close() inbetween hasNext() & next() allows the current record to be read
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[0], originalRD, recordBuilder);

            int expectedRecordCounts = 11;
            int numRecords = 0;
            while (fileReader.hasNext())
            {
                if (numRecords == expectedRecordCounts-1)
                {
                    fileReader.close();
                }

                try
                {
                    fileReader.next();
                    numRecords++;
                }
                catch (Exception e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            assertTrue("Expected record count: " + expectedRecordCounts + " Actual count: " + numRecords, numRecords == expectedRecordCounts);
        }
    }

    public List<HPCCRecord> readFile(HPCCFile file, Integer connectTimeoutMillis, boolean shouldForceTimeout) throws Exception
    {
        return readFile(file, connectTimeoutMillis, shouldForceTimeout, false, BinaryRecordReader.NO_STRING_PROCESSING);
    }

    public List<HPCCRecord> readFile(HPCCFile file, Integer connectTimeoutMillis, boolean shouldForceTimeout, boolean useDecimalForUnsigned8) throws Exception
    {
        return readFile(file, connectTimeoutMillis, shouldForceTimeout, useDecimalForUnsigned8, BinaryRecordReader.NO_STRING_PROCESSING);
    }

    public List<HPCCRecord> readFile(HPCCFile file, Integer connectTimeoutMillis, boolean shouldForceTimeout, boolean useDecimalForUnsigned8, int stringProcessingFlags) throws Exception
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
                HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder, RowServiceInputStream.DEFAULT_CONNECT_TIMEOUT_MILIS, NO_RECORD_LIMIT, true, DEFAULT_READ_SIZE_OPTION,null,RowServiceInputStream.DEFAULT_SOCKET_OP_TIMEOUT_MS);
                fileReader.getRecordReader().setUseDecimalForUnsigned8(useDecimalForUnsigned8);
                fileReader.getRecordReader().setStringProcessingFlags(stringProcessingFlags);
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

        if (shouldForceTimeout)
        {
            Thread.sleep(file.getFileAccessExpirySecs()*1000);
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
        writeFile(records, fileName, recordDef, connectTimeoutMs, false);
    }

    private void writeFile(List<HPCCRecord> records, String fileName, FieldDef recordDef, Integer connectTimeoutMs, boolean compressed)
    {
        try
        {
            writeFileAndReportAnyExceptions(records, fileName, recordDef, connectTimeoutMs, compressed);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Failed to write file with error: " + e.getMessage());
        }
    }

    private void writeFileAndReportAnyExceptions(List<HPCCRecord> records, String fileName, FieldDef recordDef, Integer connectTimeoutMs, boolean compressed) throws Exception
    {
        //------------------------------------------------------------------------------
        //  Request a temp file be created in HPCC to write to
        //------------------------------------------------------------------------------

        String eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDef);

        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

        String clusterName = this.thorClusterFileGroup;
        System.out.println("Create Start");

        CompressionAlgorithm compressionAlgorithm = CompressionAlgorithm.NONE;
        DFUCreateFileWrapper createResult = null;
        if (compressed)
        {
            createResult = dfuClient.createFile(fileName, clusterName, eclRecordDefn, connTO==null?300:connTO, true, DFUFileTypeWrapper.Flat, "");
            compressionAlgorithm = CompressionAlgorithm.DEFAULT;
        }
        else
        {
            createResult = dfuClient.createFile(fileName, clusterName, eclRecordDefn, connTO==null?300:connTO, false, DFUFileTypeWrapper.Flat, "");
        }
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
        long bytesWritten = 0;
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
                        recordAccessor, compressionAlgorithm,connectTimeoutMs);
                //wait a bit longer than the default timeout to ensure the override connect timeout
                //is being honoured
                if (connectTimeoutMs != null
                        && connectTimeoutMs > RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS+1)
                {
                    Thread.sleep(RowServiceOutputStream.DEFAULT_CONNECT_TIMEOUT_MILIS+1);
                }
            } else {
                fileWriter=new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef,
                        recordAccessor, compressionAlgorithm);
            }

            for (int j = 0; j < numRecordsInPartition; j++, currentRecord++)
            {
                fileWriter.writeRecord(records.get(currentRecord));
            }
            fileWriter.close();
            bytesWritten += fileWriter.getBytesWritten();
        }

        //------------------------------------------------------------------------------
        //  Publish and finalize the temp file
        //------------------------------------------------------------------------------

        System.out.println("Publish Start");
        dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, currentRecord, bytesWritten, true);
        System.out.println("Publish Finished");
    }

    @Test
    public void readIndexTest() throws Exception
    {
        String indexName = "test::index::child_dataset::key";

        HPCCFile file = new HPCCFile(indexName, connString, hpccUser, hpccPass);

        int numRecords = 0;
        try
        {
            List<HPCCRecord> records = readFile(file, connTO, false);
            numRecords = records.size();
        }
        catch(Exception e)
        {
            Assert.fail("Error reading index: " + e.getMessage());
        }

        if (numRecords != 125)
        {
            Assert.fail("Unexpected record count. Expected: 125, Actual: " + numRecords);
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
