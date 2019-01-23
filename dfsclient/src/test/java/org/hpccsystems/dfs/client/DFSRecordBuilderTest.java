package org.hpccsystems.dfs.client;

import java.util.ArrayList;
import java.math.BigDecimal;

import org.hpccsystems.dfs.client.IRecordBuilder;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.DummyFieldDefinitions;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSRecordBuilderTest
{
    private FieldDef testFieldDefinition = null;
    private IRecordReader testRecordReader = null;

    @Before
    public void setup()
    {
        try {
            testFieldDefinition = DummyFieldDefinitions.getComplexRecordDefinition();
            testRecordReader = new DummyRecordReader(10);
        } catch(Exception e) {
            Assert.fail("Test setup failed with error: " + e.getMessage());
        }
    }

    @Test
    public void hpccRecordBuilderTest() throws Exception
    {
        try {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(testFieldDefinition);
            testRecordReader.initialize(recordBuilder);

            while (testRecordReader.hasNext()) {
                Object record = testRecordReader.getNext();
                if (record == null) {
                    Assert.fail("Test failed: Recieved null record.");
                }
            }
        } catch (Exception e) {
            Assert.fail("Test failed with error: " + e.getMessage());
        }
    }

    @After
    public void shutdown()
    {

    }

    public static void main(String[] args) throws Exception {                    
    }
}
