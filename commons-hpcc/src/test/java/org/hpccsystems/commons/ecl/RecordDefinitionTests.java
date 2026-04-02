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

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class RecordDefinitionTests
{
    @Before
    public void setup()
    {
    }

    @Test
    public void testJsonRecordParsing() throws Exception
    {
        String[] recordDefStrs = new String[] { TestFieldDefinitions.getComplexRecordDefinitionJson(),
                                                 TestFieldDefinitions.getAllTypesIndexRecordDefinitionJson(),
                                                 TestFieldDefinitions.getBlobIndexDefinitionJson() };
        for (String recordDefStr : recordDefStrs)
        {
            try
            {
                JSONObject expectedRefDef = new JSONObject(recordDefStr);

                FieldDef recDef = RecordDefinitionTranslator.parseJsonRecordDefinition(expectedRefDef);
                JSONObject actualRecDef = RecordDefinitionTranslator.toJsonRecord(recDef);

                // Use similar instead of equals because the order of fields in the JSON object may differ
                if (!actualRecDef.similar(expectedRefDef))
                {
                    System.out.println("Expected Record Def: " + expectedRefDef + "\n");
                    System.out.println("Actual Record Def: " + actualRecDef + "\n");
                    Assert.fail("Translated JSON record definition differs from original");
                }
            }
            catch (UnparsableContentException e)
            {
                Assert.fail("Encountered invalid record definition: '" + recordDefStr + "'");
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
                Assert.fail("Exception occurred: '" + e.getMessage() + "'");
            }
        }

    }

    @Test
    public void testInlineECLRecordGeneration() throws Exception
    {
        FieldDef complexRecDef = TestFieldDefinitions.getComplexRecordDefinition();
        try
        {
            String inlineDef = RecordDefinitionTranslator.toInlineECLRecord(complexRecDef);
            Assert.assertNotNull("Inline ECL record definition should not be null", inlineDef);
            Assert.assertTrue("Inline record should start with '{'", inlineDef.startsWith("{"));
            Assert.assertTrue("Inline record should end with '}'", inlineDef.endsWith("}"));
            Assert.assertFalse("Inline record should not contain 'RECORD' keyword", inlineDef.contains("RECORD"));
            Assert.assertFalse("Inline record should not contain 'END' keyword", inlineDef.contains("\nEND"));
        }
        catch (Exception e)
        {
            Assert.fail("Exception generating inline ECL for complex record: " + e.getMessage());
        }
    }

    @Test
    public void testInlineECLIndexRecordGeneration() throws Exception
    {
        String indexRecordJson = TestFieldDefinitions.getAllTypesIndexRecordDefinitionJson();
        try
        {
            FieldDef indexRecDef = RecordDefinitionTranslator.parseJsonRecordDefinition(new org.json.JSONObject(indexRecordJson));
            String inlineDef = RecordDefinitionTranslator.toInlineECLRecord(indexRecDef, true);
            Assert.assertNotNull("Inline ECL index record definition should not be null", inlineDef);
            Assert.assertTrue("Inline index record should start with '{'", inlineDef.startsWith("{"));
            Assert.assertTrue("Inline index record should end with '}'", inlineDef.endsWith("}"));
            Assert.assertTrue("Inline index record should contain '=>' separator", inlineDef.contains("=>"));
            Assert.assertTrue("Inline index record should contain '__internal_fpos__'", inlineDef.contains("__internal_fpos__"));
        }
        catch (Exception e)
        {
            Assert.fail("Exception generating inline ECL for index record: " + e.getMessage());
        }
    }

    @After
    public void shutdown()
    {

    }
}
