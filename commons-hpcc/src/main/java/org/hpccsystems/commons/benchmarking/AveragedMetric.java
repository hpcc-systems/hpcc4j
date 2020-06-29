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

import java.util.ArrayList;
import java.lang.Float;
import java.lang.Math;

import org.json.JSONObject;
import org.json.JSONArray;

/**
 * A helper class that collects data points for a given metric and provides basic statistical functions. 
 */
public class AveragedMetric implements IMetric
{
    // First 20 Thompson Tau values. Used to determine if a datapoint is an outlier
    // Each datapoint corresponds to a threshold based on the number of samples.
    // This table contains only the first 20 values so can only be used for up to 20 samples.
    private static final double[] THOMPSON_TAU_TABLE20 = {
        0,      0,      1.1511, 1.4250, 1.5712,
        1.6563, 1.7110, 1.7491, 1.7770, 1.7984,
        1.8153, 1.8290, 1.8403, 1.8498, 1.8579,
        1.8649, 1.8710, 1.8764, 1.8811, 1.8853
    };

    private static final int MAX_DATA_POINTS = 20;
    private static final int MIN_DATA_POINTS_FOR_OUTLIERS = 3;

    private ArrayList<Double> dataPoints = new ArrayList<Double>();

    private String name = "";
    private Units units = null;
    private String description = null;

    public AveragedMetric(String name)
    {
        this.name = name;
    }

    public AveragedMetric(String name, Units units)
    {
        this.name = name;
        this.units = units;
    }

    public AveragedMetric(String name, Units units, String desc)
    {
        this.name = name;
        this.units = units;
        this.description = desc;
    }
    
    public AveragedMetric(IMetric metric)
    {
        this.name = metric.getName();
        this.units = metric.getUnits();
        this.description = metric.getDescription();
        this.addDataPoint(metric.getValue());
    }

    public void addDataPoint(double dataPoint)
    {
        if (dataPoints.size() >= MAX_DATA_POINTS)
        {
            return;
        }

        dataPoints.add(dataPoint);
    }

    public void discardOutliers()
    {
        if (dataPoints.size() < MIN_DATA_POINTS_FOR_OUTLIERS)
        {
            return;
        }

        boolean hasOutliers = true;
        do
        {
            // Calculate average of values
            double avg = 0;
            for (int i = 0; i < dataPoints.size(); i++)
            {
                avg += dataPoints.get(i).doubleValue();
            }
            avg /= dataPoints.size();

            // Calculate std deviation of values & find largest absolute deviation
            double stdDeviation = 0;
            double largestAbsDeviation = Float.MIN_VALUE;
            int largestAbsDeviationIndex = 0;

            for (int i = 0; i < dataPoints.size(); i++)
            {
                double absoluteDeviation = Math.abs(dataPoints.get(i).doubleValue() - avg);
                if (largestAbsDeviation < absoluteDeviation)
                {
                    largestAbsDeviation = absoluteDeviation;
                    largestAbsDeviationIndex = i;
                }

                stdDeviation += (absoluteDeviation * absoluteDeviation);
            }

            stdDeviation /= dataPoints.size();
            stdDeviation = (double) Math.sqrt(stdDeviation);

            // Check if it can be discarded
            double tauDeviation = THOMPSON_TAU_TABLE20[dataPoints.size()-1] * stdDeviation;
            if (largestAbsDeviation >= tauDeviation)
            {
                hasOutliers = true;
                dataPoints.remove(largestAbsDeviationIndex);
            }
            else
            {
                hasOutliers = false;
            }

            // If we discarded an outlier repeat above steps
        } while (hasOutliers && dataPoints.size() > 2);
    }

    public double getMin()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        double smallestValue = dataPoints.get(0).doubleValue();
        for (int i = 1; i < dataPoints.size(); i++)
        {
            if (dataPoints.get(i).doubleValue() < smallestValue)
            {
                smallestValue = dataPoints.get(i).doubleValue();
            }
        }

        return smallestValue;
    }

    public double getMax()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        double largestValue = dataPoints.get(0).doubleValue();
        for (int i = 1; i < dataPoints.size(); i++)
        {
            if (dataPoints.get(i).doubleValue() > largestValue)
            {
                largestValue = dataPoints.get(i).doubleValue();
            }
        }

        return largestValue;
    }

    public double getAvg()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        double avgValue = 0;
        for (int i = 0; i < dataPoints.size(); i++)
        {
            avgValue += dataPoints.get(i).doubleValue();
        }
        avgValue /= dataPoints.size();

        return avgValue;
    }

    public double getStdDev()
    {
        double avg = getAvg();
        double stdDeviation = 0;
        for (int i = 0; i < dataPoints.size(); i++)
        {
            double absoluteDeviation = dataPoints.get(i).doubleValue() - avg;
            stdDeviation += (absoluteDeviation * absoluteDeviation);
        }

        stdDeviation /= dataPoints.size();
        stdDeviation = (double) Math.sqrt(stdDeviation);
        return stdDeviation;
    }

    public void toJson(JSONArray metricArray)
    {
        discardOutliers();

        // Min
        JSONObject obj = new JSONObject();
        obj.put("name", name + ".min");
        
        if (units != null)
        {
            obj.put("units",units);
        }
        
        if (description != null)
        {
            obj.put("description",description);
        }

        obj.put("value",getMin());
        metricArray.put(obj);

        // Max
        obj = new JSONObject();
        obj.put("name", name + ".max");
        
        if (units != null)
        {
            obj.put("units",units);
        }
        
        if (description != null)
        {
            obj.put("description",description);
        }

        obj.put("value",getMax());
        metricArray.put(obj);

        // Avg
        obj = new JSONObject();
        obj.put("name", name + ".avg");
        
        if (units != null)
        {
            obj.put("units",units);
        }

        if (description != null)
        {
            obj.put("description",description);
        }

        obj.put("value",getAvg());
        metricArray.put(obj);

        // Std deviation
        obj = new JSONObject();
        obj.put("name", name + ".std_dev");

        if (units != null)
        {
            obj.put("units",units);
        }

        if (description != null)
        {
            obj.put("description",description);
        }

        obj.put("value",getStdDev());
        metricArray.put(obj);
    }

    public double getValue()
    {
        discardOutliers();
        return getAvg();
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public Units getUnits()
    {
        return units;
    }
};
