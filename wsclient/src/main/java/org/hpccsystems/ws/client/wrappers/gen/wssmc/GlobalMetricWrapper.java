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
 * Class name: GlobalMetricWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GlobalMetricWrapper
{
    protected String local_category;
    protected Dimensions_type0Wrapper local_dimensions;
    protected DateTimeRangeWrapper local_dateTimeRange;
    protected Stats_type1Wrapper local_stats;

    public GlobalMetricWrapper() {}

    public GlobalMetricWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric globalmetric)
    {
        copy( globalmetric );
    }
    public GlobalMetricWrapper( String _category, Dimensions_type0Wrapper _dimensions, DateTimeRangeWrapper _dateTimeRange, Stats_type1Wrapper _stats )
    {
        this.local_category = _category;
        this.local_dimensions = _dimensions;
        this.local_dateTimeRange = _dateTimeRange;
        this.local_stats = _stats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric raw )
    {
        if (raw == null)
            return;

        this.local_category = raw.getCategory();
        if (raw.getDimensions() != null)
            this.local_dimensions = new Dimensions_type0Wrapper( raw.getDimensions());
        if (raw.getDateTimeRange() != null)
            this.local_dateTimeRange = new DateTimeRangeWrapper( raw.getDateTimeRange());
        if (raw.getStats() != null)
            this.local_stats = new Stats_type1Wrapper( raw.getStats());

    }

    @Override
    public String toString()
    {
        return "GlobalMetricWrapper [" + "category = " + local_category + ", " + "dimensions = " + local_dimensions + ", " + "dateTimeRange = " + local_dateTimeRange + ", " + "stats = " + local_stats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric();
        raw.setCategory( local_category);
        if (local_dimensions != null)
            raw.setDimensions( local_dimensions.getRaw());
        if (local_dateTimeRange != null)
            raw.setDateTimeRange( local_dateTimeRange.getRaw());
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
    public void setDimensions( Dimensions_type0Wrapper _dimensions )
    {
        this.local_dimensions = _dimensions;
    }
    public Dimensions_type0Wrapper getDimensions( )
    {
        return this.local_dimensions;
    }
    public void setDateTimeRange( DateTimeRangeWrapper _dateTimeRange )
    {
        this.local_dateTimeRange = _dateTimeRange;
    }
    public DateTimeRangeWrapper getDateTimeRange( )
    {
        return this.local_dateTimeRange;
    }
    public void setStats( Stats_type1Wrapper _stats )
    {
        this.local_stats = _stats;
    }
    public Stats_type1Wrapper getStats( )
    {
        return this.local_stats;
    }
}