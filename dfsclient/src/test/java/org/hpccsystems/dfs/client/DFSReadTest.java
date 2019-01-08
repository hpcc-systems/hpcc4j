package org.hpccsystems.dfs.client;

import java.util.List;

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.ReflectionRecordBuilder;
import org.hpccsystems.dfs.client.BinaryRecordReader;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldDef;

import org.hpccsystems.ws.client.utils.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSReadTest
{

    private static final String testClusterIp           = "192.168.56.101";
    private static final String testIntegerKVDataset    = "~benchmark::integer::20kb";
    private static final int    testDatasetRecordCount  = 1250;

    private static final String testAllTypesDataset     = "~demo::example_dataset";
    private static final int    testAllTypesRecordCount = 2;

    private HPCCFile            file                    = null;
    private HPCCFile            file2                   = null;

    @Before
    public void setup()
    {
        try
        {
            Connection espConn = new Connection("http://" + testClusterIp + ":8010?test");
            espConn.setUserName("");
            espConn.setPassword("");

            this.file = new HPCCFile(testIntegerKVDataset, espConn);
            this.file.setProjectList("key");

            this.file2 = new HPCCFile(testAllTypesDataset, espConn);
            this.file2.setProjectList("str,bool,int8,uns4,flt4");
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

        FieldDef recordDefinition = this.file.getRecordDefinition();
        if (recordDefinition == null || recordDefinition.getNumDefs() != 2
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
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder();
                fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], recordDefinition, recordBuilder,
                        this.file.getProjectedRecordDefinition());
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

        FieldDef recordDefinition = this.file2.getRecordDefinition();
        if (recordDefinition == null || recordDefinition.getNumDefs() != 8)
        {
            Assert.fail("Invalid or null record definition");
        }

        int totalRecords = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = null;
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder();
                fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], recordDefinition, recordBuilder,
                        this.file2.getProjectedRecordDefinition());
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
