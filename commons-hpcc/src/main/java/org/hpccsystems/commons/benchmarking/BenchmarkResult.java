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

import java.util.List;
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

    private class MetricInfo
    {
        public IMetric metric = null;
        public Units.Scale desiredScale = null;

        public MetricInfo(IMetric metric)
        {
            this.metric = metric;
        }
    }

    private ArrayList<BenchmarkParam> parameters = new ArrayList<BenchmarkParam>();
    private HashMap<String,MetricInfo> metrics = new HashMap<String,MetricInfo>();

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

    public IMetric getMetric(String name)
    {
        MetricInfo info = metrics.get(name);
        if (info == null)
        {
            return null;
        }

        return info.metric;
    }

    public void addMetric(IMetric metric)
    {
        if (metric == null)
        {
            throw new RuntimeException("BenchmarkResult: Error: A null IMetric was provided to addMetric.");
        }

        MetricInfo info = metrics.get(metric.getName());
        if (info == null)
        {
            metrics.put(metric.getName(), new MetricInfo(metric));
        }
        else
        {
            info.metric = metric;
        }
    }

    public void addMetrics(List<IMetric> metrics)
    {
        for (int i = 0; i < metrics.size(); i++)
        {
            addMetric(metrics.get(i));
        }
    }

    public void addParameter(BenchmarkParam param)
    {
        parameters.add(param);
    }

    public void setMetricDesiredUnitScale(String name, Units.Scale scale)
    {
        MetricInfo info = metrics.get(name);
        if (info == null)
        {
            info = new MetricInfo(null);
            metrics.put(name, info);
        }

        info.desiredScale = scale;
    }

    public JSONObject toJson()
    {
        return toJson(null);
    }

    private JSONObject serializeMetric(MetricInfo info, boolean flat)
    {
        IMetric metric = info.metric;
        Units.Scale desiredScale = Units.Scale.UNIT;
        if (info.desiredScale != null)
        {
            desiredScale = info.desiredScale;
        }
        else if(metric.getUnits() != null)
        {
            desiredScale = metric.getUnits().scale;
        }

        float value = (float) (metric.getValue() * Units.calculateScaleConversion(metric.getUnits().scale,desiredScale));

        if (flat)
        {
            JSONObject obj = new JSONObject();
            obj.put("group",testGroup);
            obj.put("test", testName);
            obj.put("result", metric.getName());
            obj.put("value", value);

            for (int i = 0; i < parameters.size(); i++)
            {
                BenchmarkParam param = parameters.get(i);
                obj.put(param.name,param.value);
            }
            
            Units units = metric.getUnits();
            if (units != null)
            {
                Units scaledUnits = new Units(units.type,desiredScale);
                obj.put("units", scaledUnits.toString());
            }
            
            String desc = metric.getDescription();
            if (desc != null)
            {
                obj.put("description", desc);
            }
            return obj;
        }
        else
        {
            JSONObject obj = new JSONObject();
            obj.put("name", metric.getName());
            
            Units units = metric.getUnits();
            if (units != null)
            {
                Units scaledUnits = new Units(units.type,desiredScale);
                obj.put("units", scaledUnits.toString());
            }
            
            String desc = metric.getDescription();
            if (desc != null)
            {
                obj.put("description", desc);
            }
            obj.put("value",value);
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
            for (HashMap.Entry<String, MetricInfo> entry : metrics.entrySet())
            {
                MetricInfo metricInfo = entry.getValue();
                if (metricInfo == null || metricInfo.metric == null)
                {
                    continue;
                }

                JSONObject obj = serializeMetric(metricInfo,false);
                jsonMetrics.put(obj);
            }
        }
        else
        {
            for (int i = 0; i < selectedResults.length; i++)
            {
                MetricInfo metricInfo = metrics.get(selectedResults[i]);
                if (metricInfo == null || metricInfo.metric == null)
                {
                    continue;
                }
                
                JSONObject obj = serializeMetric(metricInfo,false);
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
            for (HashMap.Entry<String, MetricInfo> entry : metrics.entrySet())
            {
                MetricInfo metricInfo = entry.getValue();
                if (metricInfo == null || metricInfo.metric == null)
                {
                    continue;
                }

                JSONObject obj = serializeMetric(metricInfo, true);
                results.put(obj);
            }
        }
        else
        {
            for (int i = 0; i < selectedResults.length; i++)
            {
                MetricInfo metricInfo = metrics.get(selectedResults[i]);
                if (metricInfo == null || metricInfo.metric == null)
                {
                    continue;
                }

                JSONObject obj = serializeMetric(metricInfo,true);
                results.put(obj);  
            }
        }

        return results;
    }
};
