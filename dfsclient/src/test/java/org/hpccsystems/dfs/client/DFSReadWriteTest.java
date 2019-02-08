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

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HPCCRecordAccessor;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.ReflectionRecordBuilder;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.dfs.cluster.*;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSReadWriteTest
{

    private static final String clusterIP = "192.168.56.101";
    private static final String[] datasets = {"~benchmark::integer::20kb","~demo::example_dataset"};
    private static final int[]    expectedCounts = {1250,6};

    @Before
    public void setup()
    {
    }

    @Test
    public void integrationReadWriteBackTest() throws Exception
    {
        /*
        FieldDef[] fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("key",FieldType.INTEGER,"INTEGER8",8,true,false,HpccSrcType.LITTLE_ENDIAN,new FieldDef[0]);
        fieldDefs[1] = new FieldDef("value",FieldType.INTEGER,"INTEGER8",8,true,false,HpccSrcType.LITTLE_ENDIAN,new FieldDef[0]);
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 16, true, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);
        ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < 1250; i++) 
        {
            Long[] fields = new Long[2];
            fields[0] = (long) i;
            fields[1] = (long) 42;
            HPCCRecord record = new HPCCRecord(fields,recordDef);
            records.add(record);
        }
        */

        for (int i = 0; i < datasets.length; i++) {
            Connection espConn = new Connection("http://" + this.clusterIP + ":8010");
            espConn.setUserName("");
            espConn.setPassword("");

            HPCCFile file = new HPCCFile(datasets[i], espConn);
            file.setProjectList("");

            List<HPCCRecord> records = readFile(file);
            if (records.size() != expectedCounts[i]) {
                Assert.fail("Record count mismatch for dataset: " + datasets[i] + " got: " 
                            + records.size() + " expected: " + expectedCounts[i]);
            }

            // Write the dataset back
            String copyFileName = datasets[i] + "-copy5";
            writeFile(records, copyFileName, file.getProjectedRecordDefinition());

            file = new HPCCFile(copyFileName,espConn);
            List<HPCCRecord> copiedRecords = readFile(file);
            if (copiedRecords.equals(records) == false) {
                Assert.fail("Written dataset does not match original dataset: " + copyFileName);
            }
        }
    }

    public List<HPCCRecord> readFile(HPCCFile file) throws Exception
    {
        if (file == null)
        {
            Assert.fail("HPCCFile construction failed.");
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

        ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < fileParts.length; i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = null;
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
                fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);
            }
            catch (Exception e)
            {
                Assert.fail("Error constructing reader: " + e.getMessage());
            }
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
        }
        
        return records;
    }

    private void writeFile(List<HPCCRecord> records, String fileName, FieldDef recordDef)
    {
        try {
            //------------------------------------------------------------------------------
            //  Request a temp file be created in HPCC to write to
            //------------------------------------------------------------------------------

            String eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDef);

            Connection conn = new Connection("http://" + clusterIP + ":8010");
            conn.setUserName("");
            conn.setPassword("");
            HPCCWsDFUClient dfuClient = HPCCWsDFUClient.get(conn);

            String clusterName = "mythor";
            DFUCreateFileWrapper createResult = dfuClient.createFile(fileName,clusterName,eclRecordDefn,300);

            DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
            DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts, new NullRemapper(new RemapInfo(),createResult.getFileAccessInfo()), dfuFileParts.length, createResult.getFileAccessInfoBlob());

            //------------------------------------------------------------------------------
            //  Write partitions to file parts
            //------------------------------------------------------------------------------

            int recordsPerPartition = records.size() / dfuFileParts.length;

            // These should be distributed evenly but we won't do this for the test
            int residualRecords = records.size() % dfuFileParts.length;

            int currentRecord = 0;
            int bytesWritten = 0;
            for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++) {
                int numRecordsInPartition = recordsPerPartition;
                if (partitionIndex == dfuFileParts.length-1) {
                    numRecordsInPartition += residualRecords;
                }

                HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
                HPCCRemoteFileWriter<HPCCRecord> fileWriter = new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef, recordAccessor, CompressionAlgorithm.NONE);
                try {
                    for (int j = 0; j < numRecordsInPartition; j++, currentRecord++) {
                        fileWriter.writeRecord(records.get(currentRecord));
                    }
                    fileWriter.close();
                    bytesWritten += fileWriter.getBytesWritten();
                } catch (Exception e) {
                    Assert.fail(e.getMessage());
                }
            }

            //------------------------------------------------------------------------------
            //  Publish and finalize the temp file
            //------------------------------------------------------------------------------

            dfuClient.publishFile(createResult.getFileID(),eclRecordDefn,currentRecord,bytesWritten,true);
        } catch (Exception e) {
            Assert.fail("Failed to publish file with error: " + e.getMessage());
        }
    }

    private class LongKVData
    {
        public Long key;
        public Long value;
    };

    @Test
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
