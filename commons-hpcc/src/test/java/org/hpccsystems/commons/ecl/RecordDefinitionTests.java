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

import org.json.JSONObject;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.ecl.TestFieldDefinitions;
import org.hpccsystems.commons.errors.UnparsableContentException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.FastTests.class)
public class RecordDefinitionTests
{
    @Before
    public void setup()
    {
    }

    @Test
    public void testJsonRecordParsing() throws Exception
    {
        String jsonRecDefStr = TestFieldDefinitions.getComplexRecordDefinitionJson();
        try
        {
            JSONObject jsonRecDef = new JSONObject(jsonRecDefStr);
             
            FieldDef recDef = RecordDefinitionTranslator.parseJsonRecordDefinition(jsonRecDef);

            JSONObject tJsonRecDef = RecordDefinitionTranslator.toJsonRecord(recDef);

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
