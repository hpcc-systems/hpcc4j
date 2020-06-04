package org.hpccsystems.commons.benchmarking;

import java.util.ArrayList;
import java.lang.Float;
import java.lang.Math;

import org.json.JSONObject;
import org.json.JSONArray;

public class AveragedMetric
{
    // First 20 Thompson Tau values. Used to determine if a datapoint is an outlier
    // Each datapoint corresponds to a threshold based on the number of samples.
    // This table contains only the first 20 values so can only be used for up to 20 samples.
    private static final float[] THOMPSON_TAU_TABLE20 = {
        0f,      0f,      1.1511f, 1.4250f, 1.5712f,
        1.6563f, 1.7110f, 1.7491f, 1.7770f, 1.7984f,
        1.8153f, 1.8290f, 1.8403f, 1.8498f, 1.8579f,
        1.8649f, 1.8710f, 1.8764f, 1.8811f, 1.8853f
    };

    private ArrayList<Float> dataPoints = new ArrayList<Float>();

    public String name = "";
    public String units = null;
    public String description = null;

    public AveragedMetric(String name)
    {
        this.name = name;
    }

    public AveragedMetric(String name, String units)
    {
        this.name = name;
        this.units = units;
    }

    public AveragedMetric(String name, String units, String desc)
    {
        this.name = name;
        this.units = units;
        this.description = desc;
    }

    public void addDataPoint(float dataPoint)
    {
        if (dataPoints.size() >= 20)
        {
            return;
        }

        dataPoints.add(dataPoint);
    }

    public void discardOutliers()
    {
        if (dataPoints.size() < 3)
        {
            return;
        }

        boolean hasOutliers = true;
        do
        {
            // Calculate average of values
            float avg = 0;
            for (int i = 0; i < dataPoints.size(); i++)
            {
                avg += dataPoints.get(i).floatValue();
            }
            avg /= dataPoints.size();

            // Calculate std deviation of values & find largest absolute deviation
            float stdDeviation = 0;
            float largestAbsDeviation = Float.MIN_VALUE;
            int largestAbsDeviationIndex = 0;

            for (int i = 0; i < dataPoints.size(); i++)
            {
                float absoluteDeviation = dataPoints.get(i).floatValue() - avg;
                if (largestAbsDeviation < Math.abs(absoluteDeviation))
                {
                    largestAbsDeviation = absoluteDeviation;
                    largestAbsDeviationIndex = i;
                }

                stdDeviation += (absoluteDeviation * absoluteDeviation);
            }

            stdDeviation /= dataPoints.size();
            stdDeviation = (float) Math.sqrt(stdDeviation);

            // Check if it can be discarded
            float tauDeviation = THOMPSON_TAU_TABLE20[dataPoints.size()-1] * stdDeviation;
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

    public float getMin()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        float smallestValue = dataPoints.get(0).floatValue();
        for (int i = 1; i < dataPoints.size(); i++)
        {
            if (dataPoints.get(i).floatValue() < smallestValue)
            {
                smallestValue = dataPoints.get(i).floatValue();
            }
        }

        return smallestValue;
    }

    public float getMax()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        float largestValue = dataPoints.get(0).floatValue();
        for (int i = 1; i < dataPoints.size(); i++)
        {
            if (dataPoints.get(i).floatValue() > largestValue)
            {
                largestValue = dataPoints.get(i).floatValue();
            }
        }

        return largestValue;
    }

    public float getAvg()
    {
        if (dataPoints.size() == 0)
        {
            return 0;
        }

        float avgValue = 0;
        for (int i = 0; i < dataPoints.size(); i++)
        {
            avgValue += dataPoints.get(i).floatValue();
        }
        avgValue /= dataPoints.size();

        return avgValue;
    }

    public float getStdDev()
    {
        float avg = getAvg();
        float stdDeviation = 0;
        for (int i = 0; i < dataPoints.size(); i++)
        {
            float absoluteDeviation = dataPoints.get(i).floatValue() - avg;
            stdDeviation += (absoluteDeviation * absoluteDeviation);
        }

        stdDeviation /= dataPoints.size();
        stdDeviation = (float) Math.sqrt(stdDeviation);
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

};