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

/**
 * A simple individual metric.
 */
public class SimpleMetric implements IMetric
{
    private double value = 0;
    private String name = "";
    private Units units = null;
    private String description = null;

    public SimpleMetric(double value, String name)
    {
        this.value = value;
        this.name = name;
    }
    
    public SimpleMetric(double value, String name, Units units)
    {
        this.value = value;
        this.name = name;
        this.units = units;
    }
    
    public SimpleMetric(double value, String name, Units units, String desc)
    {
        this.value = value;
        this.name = name;
        this.units = units;
        this.description = desc;
    }

    public SimpleMetric(IMetric metric)
    {
        this.value = metric.getValue();
        this.name = metric.getName();
        this.units = metric.getUnits();
        this.description = metric.getDescription();
    }

    public double getValue()
    {
        return this.value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getName()
    {
        return this.name;
    }

    public Units getUnits()
    {
        return this.units;
    }

    public String getDescription()
    {
        return this.description;
    }
};
