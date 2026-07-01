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
 * Class name: GetGlobalMetricsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GetGlobalMetricsWrapper
{
    protected String local_category;
    protected ArrayOfDimensionWrapper local_dimensions;
    protected DateTimeRangeWrapper local_dateTimeRange;

    public GetGlobalMetricsWrapper() {}

    public GetGlobalMetricsWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics getglobalmetrics)
    {
        copy( getglobalmetrics );
    }
    public GetGlobalMetricsWrapper( String _category, ArrayOfDimensionWrapper _dimensions, DateTimeRangeWrapper _dateTimeRange )
    {
        this.local_category = _category;
        this.local_dimensions = _dimensions;
        this.local_dateTimeRange = _dateTimeRange;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics raw )
    {
        if (raw == null)
            return;

        this.local_category = raw.getCategory();
        if (raw.getDimensions() != null)
            this.local_dimensions = new ArrayOfDimensionWrapper( raw.getDimensions());
        if (raw.getDateTimeRange() != null)
            this.local_dateTimeRange = new DateTimeRangeWrapper( raw.getDateTimeRange());

    }

    @Override
    public String toString()
    {
        return "GetGlobalMetricsWrapper [" + "category = " + local_category + ", " + "dimensions = " + local_dimensions + ", " + "dateTimeRange = " + local_dateTimeRange + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetrics();
        raw.setCategory( local_category);
        if (local_dimensions != null)
            raw.setDimensions( local_dimensions.getRaw());
        if (local_dateTimeRange != null)
            raw.setDateTimeRange( local_dateTimeRange.getRaw());
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
    public void setDateTimeRange( DateTimeRangeWrapper _dateTimeRange )
    {
        this.local_dateTimeRange = _dateTimeRange;
    }
    public DateTimeRangeWrapper getDateTimeRange( )
    {
        return this.local_dateTimeRange;
    }
}