package org.hpccsystems.commons.benchmarking;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONArray;

/**
 * A helper class that can be used to record the results of a benchmark test.
 */
public class BenchmarkResult
{
    private String testGroup = "";
    private String testName = "";
    private String testDescription = "";

    private ArrayList<BenchmarkParam> parameters = new ArrayList<BenchmarkParam>();
    private HashMap<String,AveragedMetric> metrics = new HashMap<String,AveragedMetric>();

    public BenchmarkResult(String group, String name)
    {
        testGroup = group;
        testName = name;
    }

    public BenchmarkResult(String group, String name, String description)
    {
        testGroup = group;
        testName = name;
        testDescription = description;
    }

    public AveragedMetric getMetric(String name)
    {
        return metrics.get(name);
    }

    public void addMetric(AveragedMetric metric)
    {
        metrics.put(metric.name,metric);
    }

    public void addParameter(BenchmarkParam param)
    {
        parameters.add(param);
    }

    public JSONObject toJson()
    {
        return toJson(null);
    }

    private JSONObject serializeMetric(AveragedMetric metric, boolean flat)
    {
        if (flat)
        {
            JSONObject obj = new JSONObject();
            obj.put("group",testGroup);
            obj.put("test", testName);
            obj.put("result", metric.name);
            obj.put("value", metric.getAvg());

            if (metric.units != null)
            {
                obj.put("units", metric.units);
            }
            
            if (metric.description != null)
            {
                obj.put("description", metric.description);
            }
            return obj;
        }
        else
        {
            JSONObject obj = new JSONObject();
            obj.put("name", metric.name);
            
            if (metric.units != null)
            {
                obj.put("units",metric.units);
            }
            
            if (metric.description != null)
            {
                obj.put("description",metric.description);
            }

            obj.put("value",metric.getAvg());
            return obj;
        }
    }

    public JSONObject toJson(String[] selectedResults)
    {
        JSONObject test = new JSONObject();
        test.put("name",this.testName);
        test.put("description",this.testDescription);

        // Write test params
        JSONArray jsonParams = new JSONArray();

        for (int i = 0; i < parameters.size(); i++)
        {
            JSONObject param = parameters.get(i).toJson();
            jsonParams.put(param);
        }

        test.put("parameters",parameters);

        // Write test results
        JSONArray jsonMetrics = new JSONArray();

        if (selectedResults == null || selectedResults.length == 0)
        {
            for (HashMap.Entry<String, AveragedMetric> entry : metrics.entrySet())
            {
                AveragedMetric metric = entry.getValue();
                metric.discardOutliers();
                
                JSONObject obj = serializeMetric(metric,false);
                jsonMetrics.put(obj);
            }
        }
        else
        {
            for (int i = 0; i < selectedResults.length; i++)
            {
                AveragedMetric metric = metrics.get(selectedResults[i]);
                if (metric == null)
                {
                    continue;
                }

                metric.discardOutliers();
                
                JSONObject obj = serializeMetric(metric,false);
                jsonMetrics.put(obj);  
            }
        }

        test.put("results",jsonMetrics);

        return test;
    }

    public JSONArray toFlatJson()
    {
        return toFlatJson(null);
    }

    public JSONArray toFlatJson(String[] selectedResults)
    {
        JSONArray results = new JSONArray();

        if (selectedResults == null || selectedResults.length == 0)
        {
            for (HashMap.Entry<String, AveragedMetric> entry : metrics.entrySet())
            {
                AveragedMetric metric = entry.getValue();
                metric.discardOutliers();
                
                JSONObject obj = serializeMetric(metric, true);
                results.put(obj);
            }
        }
        else
        {
            for (int i = 0; i < selectedResults.length; i++)
            {
                AveragedMetric metric = metrics.get(selectedResults[i]);
                if (metric == null)
                {
                    continue;
                }

                metric.discardOutliers();
                
                JSONObject obj = serializeMetric(metric,true);
                results.put(obj);  
            }
        }

        return results;
    }
};