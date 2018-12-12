package org.hpccsystems.dfs.client;

import java.util.List;

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.ReflectionRecordBuilder;
import org.hpccsystems.dfs.client.BinaryRecordReader;
import org.hpccsystems.dfs.client.RecordDef;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldDef;

import org.hpccsystems.ws.client.utils.Connection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSReadTest
{

    private static final String testClusterIp          = "192.168.56.101";
    private static final String testIntegerKVDataset   = "~benchmark::integer::20kb";
    private static final int    testDatasetRecordCount = 1250;

    private HPCCFile            file                   = null;

    @Before
    public void setup()
    {
        try
        {
            Connection espConn = new Connection("http://" + testClusterIp + ":8010?test");
            espConn.setUserName("");
            espConn.setPassword("");

            this.file = new HPCCFile(testIntegerKVDataset, espConn);
        }
        catch (Exception e)
        {

        }
    }

    @Test
    public void testHpccRecordBuilder() throws Exception
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

        RecordDef recordDefinition = this.file.getRecordDefinition();
        if (recordDefinition == null || recordDefinition.getRootDef() == null
                || recordDefinition.getRootDef().getNumDefs() != 2)
        {
            Assert.fail("Invalid or null record definition");
        }

        int totalRecords = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder();
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i],
                    recordDefinition, recordBuilder);
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

    private class LongKVData
    {
        public Long key;
        public Long value;
    };

    @Test
    public void testReflectionRecordBuilder() throws Exception
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

        RecordDef recordDefinition = this.file.getRecordDefinition();
        if (recordDefinition == null || recordDefinition.getRootDef() == null
                || recordDefinition.getRootDef().getNumDefs() != 2)
        {
            Assert.fail("Invalid or null record definition");
        }

        int totalRecords = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            ReflectionRecordBuilder recordBuilder = new ReflectionRecordBuilder<LongKVData>(LongKVData.class);
            HpccRemoteFileReader<LongKVData> fileReader = new HpccRemoteFileReader<LongKVData>(fileParts[i],
                    recordDefinition, recordBuilder);
            while (fileReader.hasNext())
            {
                LongKVData record = fileReader.next();
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

    @After
    public void shutdown()
    {

    }
}
