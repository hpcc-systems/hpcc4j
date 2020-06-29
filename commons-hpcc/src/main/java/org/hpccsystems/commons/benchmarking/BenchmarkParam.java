/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.hpccsystems.commons.benchmarking;

import org.json.JSONObject;

/**
 * A helper class that represents a parameter for a benchmark test.
 */
public class BenchmarkParam
{
    public String name = "";
    public String value = "";
    public String description = null;
    public String units = null;

    public BenchmarkParam(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    public JSONObject toJson()
    {
        JSONObject param = new JSONObject();
        param.put("name",name);
        param.put("value",value);

        if (units != null)
        {
            param.put("unit",units);
        }

        if (description != null)
        {
            param.put("description",description);
        }

        return param;
    }
};
