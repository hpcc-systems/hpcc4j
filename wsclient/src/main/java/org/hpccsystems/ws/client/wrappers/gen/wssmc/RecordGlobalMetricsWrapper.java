package org.hpccsystems.ws.client.wrappers.gen.wssmc;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: RecordGlobalMetricsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class RecordGlobalMetricsWrapper
{
    protected String local_category;
    protected ArrayOfDimensionWrapper local_dimensions;
    protected Stats_type0Wrapper local_stats;

    public RecordGlobalMetricsWrapper() {}

    public RecordGlobalMetricsWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics recordglobalmetrics)
    {
        copy( recordglobalmetrics );
    }
    public RecordGlobalMetricsWrapper( String _category, ArrayOfDimensionWrapper _dimensions, Stats_type0Wrapper _stats )
    {
        this.local_category = _category;
        this.local_dimensions = _dimensions;
        this.local_stats = _stats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics raw )
    {
        if (raw == null)
            return;

        this.local_category = raw.getCategory();
        if (raw.getDimensions() != null)
            this.local_dimensions = new ArrayOfDimensionWrapper( raw.getDimensions());
        if (raw.getStats() != null)
            this.local_stats = new Stats_type0Wrapper( raw.getStats());

    }

    @Override
    public String toString()
    {
        return "RecordGlobalMetricsWrapper [" + "category = " + local_category + ", " + "dimensions = " + local_dimensions + ", " + "stats = " + local_stats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RecordGlobalMetrics();
        raw.setCategory( local_category);
        if (local_dimensions != null)
            raw.setDimensions( local_dimensions.getRaw());
        if (local_stats != null)
            raw.setStats( local_stats.getRaw());
        return raw;
    }


    public void setCategory( String _category )
    {
        this.local_category = _category;
    }
    public String getCategory( )
    {
        return this.local_category;
    }
    public void setDimensions( ArrayOfDimensionWrapper _dimensions )
    {
        this.local_dimensions = _dimensions;
    }
    public ArrayOfDimensionWrapper getDimensions( )
    {
        return this.local_dimensions;
    }
    public void setStats( Stats_type0Wrapper _stats )
    {
        this.local_stats = _stats;
    }
    public Stats_type0Wrapper getStats( )
    {
        return this.local_stats;
    }
}