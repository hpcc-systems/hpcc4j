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