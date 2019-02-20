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

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.ws.client.utils.Connection;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.dfs.client.RemoteTests.class)
public class DFSReadTest
{

    private static final String testClusterIp           = "127.0.0.1";
    private static final String testIntegerKVDataset    = "~benchmark::integer::20kb";
    private static final int    testDatasetRecordCount  = 1250;
    private static final String testDatasetFilterExpr   = "key=88021";

    private static final String testAllTypesDataset     = "~demo::example_dataset";
    private static final int    testAllTypesRecordCount = 2;

    private HPCCFile            file                    = null;
    private HPCCFile            file2                   = null;

    @Before
    public void setup()
    {
        try
        {
            Connection espConn = new Connection("http://" + testClusterIp + ":8010");
            espConn.setUserName("");
            espConn.setPassword("");

            this.file = new HPCCFile(testIntegerKVDataset, espConn)
                    .setProjectList("key")
                    .setFilter(testDatasetFilterExpr);

            this.file2 = new HPCCFile(testAllTypesDataset, espConn)
                    .setProjectList("str,qstr,uni10,bool,childdataset.childindex,childdataset.childstr");
        }
        catch (Exception e)
        {
            System.out.println("Setup failed with error: " + e.getMessage());
        }
    }

    @Test
    public void integrationTestReadIntegerDataset() throws Exception
    {
        if (this.file == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }

        DataPartition[] fileParts = this.file.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = this.file.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() != 2
                || this.file.getProjectedRecordDefinition().getNumDefs() != 1)
        {
            Assert.fail("Invalid or null record definition");
        }

        int totalRecords = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = null;
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(this.file.getProjectedRecordDefinition());
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

                totalRecords++;
            }
        }

        if (totalRecords != testDatasetRecordCount)
        {
            Assert.fail("Record count does not match expected record count");
        }
    }

    @Test
    public void integrationTestReadAllTypesDataset() throws Exception
    {
        if (this.file2 == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }

        DataPartition[] fileParts = this.file2.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = this.file2.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() == 0)
        {
            Assert.fail("Invalid or null record definition");
        }

        int totalRecords = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = null;
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(this.file2.getProjectedRecordDefinition());
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

                totalRecords++;
            }
        }

        if (totalRecords != testAllTypesRecordCount)
        {
            Assert.fail("Record count does not match expected record count");
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
