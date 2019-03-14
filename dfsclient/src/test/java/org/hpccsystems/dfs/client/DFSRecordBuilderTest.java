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

import org.hpccsystems.dfs.client.TestRecordReader;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.TestFieldDefinitions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DFSRecordBuilderTest
{
    private FieldDef      testFieldDefinition = null;
    private IRecordReader testRecordReader    = null;

    @Before
    public void setup()
    {
        try
        {
            testFieldDefinition = TestFieldDefinitions.getComplexRecordDefinition();
            testRecordReader = new TestRecordReader(10);
        }
        catch (Exception e)
        {
            Assert.fail("Test setup failed with error: " + e.getMessage());
        }
    }

    @Test
    public void hpccRecordBuilderTest() throws Exception
    {
        try
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(testFieldDefinition);
            testRecordReader.initialize(recordBuilder);

            while (testRecordReader.hasNext())
            {
                Object record = testRecordReader.getNext();
                if (record == null)
                {
                    Assert.fail("Test failed: Recieved null record.");
                }
            }
        }
        catch (Exception e)
        {
            Assert.fail("Test failed with error: " + e.getMessage());
        }
    }
}
