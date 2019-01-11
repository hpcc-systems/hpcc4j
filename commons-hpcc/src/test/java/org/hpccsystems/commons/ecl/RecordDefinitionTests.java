/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/

package org.hpccsystems.commons.ecl;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.json.JSONObject;

import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.UnparsableContentException;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecordDefinitionTests
{

    private static final String testClusterIp        = "127.0.0.1";
    private static final String testIntegerKVDataset = "~demo::example_dataset";

    private Connection          espConn              = null;

    @Before
    public void setup()
    {
        try
        {
            this.espConn = new Connection("http://" + testClusterIp + ":8010");
            espConn.setUserName("");
            espConn.setPassword("");
        }
        catch (Exception e)
        {}
    }

    @Test
    public void testJsonRecordParsing() throws Exception
    {
        HPCCWsDFUClient dfuClient = HPCCWsDFUClient.get(this.espConn);
        String jsonRecDefStr = null;
        try
        {
            String uniqueID = "HPCC-FILE: " + "Test";
            DFUFileAccessInfoWrapper fileinfoforread = dfuClient.getFileAccess(SecAccessType.Read,
                    this.testIntegerKVDataset, "", 300, uniqueID, true, false, true);
            jsonRecDefStr = fileinfoforread.getRecordTypeInfoJson();
            JSONObject jsonRecDef = new JSONObject(jsonRecDefStr);
            FieldDef recDef = RecordDefinitionTranslator.parseJsonRecordDefinition(jsonRecDef);

            JSONObject tJsonRecDef = RecordDefinitionTranslator.toJson(recDef);

            if (tJsonRecDef.equals(jsonRecDef))
            {
                System.out.println(jsonRecDef + "\n");
                System.out.println(tJsonRecDef + "\n");
                Assert.fail("Translated JSON record definition differs from original");
            }
        }
        catch (UnparsableContentException e)
        {
            Assert.fail("Encountered invalid record definition: '" + jsonRecDefStr + "'");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            Assert.fail("Exception occurred: '" + e.getMessage() + "'");
        }

    }

    @After
    public void shutdown()
    {

    }
}
