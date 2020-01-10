/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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

/**
 * <p>TestFieldDefinitions class.</p>
 *
 */
public class TestFieldDefinitions
{
    private static final String complexRecordDefinitionStr = "{\r\n \"ty1\": {\r\n  \"fieldType\": 1065,\r\n  \"length\": 4294967281\r\n },\r\n \"ty2\": "
            + "{\r\n  \"fieldType\": 1054,\r\n  \"length\": 4294967281\r\n },\r\n \"ty3\": {\r\n  \"fieldType\": 33,\r\n "
            + "\"length\": 10\r\n },\r\n \"ty4\": {\r\n  \"fieldType\": 0,\r\n  \"length\": 1\r\n },\r\n \"ty5\": {\r\n  "
            + "\"fieldType\": 1,\r\n  \"length\": 3\r\n },\r\n \"ty6\": {\r\n  \"fieldType\": 1,\r\n  \"length\": 8\r\n },"
            + "\r\n \"ty7\": {\r\n  \"fieldType\": 257,\r\n  \"length\": 4\r\n },\r\n \"ty8\": {\r\n  \"fieldType\": 2,\r\n  "
            + "\"length\": 4\r\n },\r\n \"ty9\": {\r\n  \"fieldType\": 3,\r\n  \"length\": 1048608\r\n },\r\n \"ty10\": {\r\n  "
            + "\"fieldType\": 259,\r\n  \"length\": 1048608\r\n },\r\n \"ty11\": {\r\n  \"fieldType\": 1,\r\n  \"length\": 4\r\n "
            + "},\r\n \"ty12\": {\r\n  \"fieldType\": 1028,\r\n  \"length\": 0\r\n },\r\n \"ty13\": {\r\n  \"fieldType\": 3,\r\n  "
            + "\"length\": 524304\r\n },\r\n \"ty14\": {\r\n  \"fieldType\": 13,\r\n  \"length\": 9,\r\n  \"fields\": [\r\n   "
            + "{\r\n    \"name\": \"dec16\",\r\n    \"type\": \"ty13\",\r\n    \"flags\": 3\r\n   }\r\n  ]\r\n },\r\n \"ty15\": "
            + "{\r\n  \"fieldType\": 1044,\r\n  \"length\": 0,\r\n  \"child\": \"ty14\"\r\n },\r\n \"ty16\": {\r\n  \"fieldType\": "
            + "1037,\r\n  \"length\": 12,\r\n  \"fields\": [\r\n   {\r\n    \"name\": \"childindex\",\r\n    \"type\": \"ty11\",\r\n    "
            + "\"flags\": 1\r\n   },\r\n   {\r\n    \"name\": \"childstr\",\r\n    \"type\": \"ty12\",\r\n    \"flags\": 1028\r\n   },\r\n   "
            + "{\r\n    \"name\": \"childrec\",\r\n    \"type\": \"ty15\",\r\n    \"xpath\": \"childrec\\u0001Row\",\r\n    "
            + "\"flags\": 1044\r\n   }\r\n  ]\r\n },\r\n \"ty17\": {\r\n  \"fieldType\": 1044,\r\n  \"length\": 0,\r\n  \"child\": "
            + "\"ty16\"\r\n },\r\n \"ty18\": {\r\n  \"fieldType\": 1,\r\n  \"length\": 2\r\n },\r\n \"ty19\": {\r\n  \"fieldType\": 1045,\r\n  "
            + "\"length\": 0,\r\n  \"child\": \"ty18\"\r\n },\r\n \"fieldType\": 1037,\r\n \"length\": 92,\r\n \"fields\": [\r\n  {\r\n   "
            + "\"name\": \"str\",\r\n   \"type\": \"ty1\",\r\n   \"flags\": 1065\r\n  },\r\n  {\r\n   \"name\": \"qstr\",\r\n   \"type\": "
            + "\"ty2\",\r\n   \"flags\": 1054\r\n  },\r\n  {\r\n   \"name\": \"uni10\",\r\n   \"type\": \"ty3\",\r\n   \"flags\": 33\r\n  },"
            + "\r\n  {\r\n   \"name\": \"bool\",\r\n   \"type\": \"ty4\"\r\n  },\r\n  {\r\n   \"name\": \"int3\",\r\n   \"type\": \"ty5\","
            + "\r\n   \"flags\": 1\r\n  },\r\n  {\r\n   \"name\": \"int8\",\r\n   \"type\": \"ty6\",\r\n   \"flags\": 1\r\n  },\r\n  {\r\n   "
            + "\"name\": \"uns4\",\r\n   \"type\": \"ty7\",\r\n   \"flags\": 257\r\n  },\r\n  {\r\n   \"name\": \"flt4\",\r\n   \"type\": "
            + "\"ty8\",\r\n   \"flags\": 2\r\n  },\r\n  {\r\n   \"name\": \"dec32\",\r\n   \"type\": \"ty9\",\r\n   \"flags\": 3\r\n  },\r\n  "
            + "{\r\n   \"name\": \"udec32\",\r\n   \"type\": \"ty10\",\r\n   \"flags\": 259\r\n  },\r\n  {\r\n   \"name\": \"childdataset\",\r\n   "
            + "\"type\": \"ty17\",\r\n   \"xpath\": \"childdataset\\u0001Row\",\r\n   \"flags\": 1044\r\n  },\r\n  {\r\n   \"name\": \"int2set\",\r\n   "
            + "\"type\": \"ty19\",\r\n   \"xpath\": \"int2set\\u0001Item\",\r\n   \"flags\": 1045\r\n  }\r\n ]\r\n}";

    /**
     * <p>getComplexRecordDefinitionJson.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public static String getComplexRecordDefinitionJson()
    {
        return complexRecordDefinitionStr;
    }

    /**
     * <p>getComplexRecordDefinition.</p>
     *
     * @return a {@link org.hpccsystems.commons.ecl.FieldDef} object.
     * @throws java.lang.Exception if any.
     */
    public static FieldDef getComplexRecordDefinition() throws Exception
    {
        String jsonStr = getComplexRecordDefinitionJson();
        JSONObject jsonRecDef = new JSONObject(jsonStr);
        return RecordDefinitionTranslator.parseJsonRecordDefinition(jsonRecDef);
    }

}
