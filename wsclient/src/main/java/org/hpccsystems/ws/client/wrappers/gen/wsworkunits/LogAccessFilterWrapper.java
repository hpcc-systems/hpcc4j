package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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
import org.apache.axis2.databinding.types.UnsignedInt;
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: LogAccessFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class LogAccessFilterWrapper
{
    protected String local_wildcardFilter;
    protected TimeRangeWrapper local_absoluteTimeRange;
    protected UnsignedInt local_relativeTimeRangeBuffer;
    protected UnsignedInt local_lineLimit;
    protected long local_lineStartFrom;
    protected LogSelectColumnModeWrapper local_selectColumnMode;
    protected List<String> local_customColumns = null;
    protected List<String> local_componentsFilter = null;
    protected LogAccessLogFormatWrapper local_format;
    protected SortDirectionWrapper local_sortByTimeDirection;
    protected LogEventClassWrapper local_logEventType;

    public LogAccessFilterWrapper() {}

    public LogAccessFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter logaccessfilter)
    {
        copy( logaccessfilter );
    }
    public LogAccessFilterWrapper( String _wildcardFilter, TimeRangeWrapper _absoluteTimeRange, UnsignedInt _relativeTimeRangeBuffer, UnsignedInt _lineLimit, long _lineStartFrom, LogSelectColumnModeWrapper _selectColumnMode, List<String> _customColumns, List<String> _componentsFilter, LogAccessLogFormatWrapper _format, SortDirectionWrapper _sortByTimeDirection, LogEventClassWrapper _logEventType )
    {
        this.local_wildcardFilter = _wildcardFilter;
        this.local_absoluteTimeRange = _absoluteTimeRange;
        this.local_relativeTimeRangeBuffer = _relativeTimeRangeBuffer;
        this.local_lineLimit = _lineLimit;
        this.local_lineStartFrom = _lineStartFrom;
        this.local_selectColumnMode = _selectColumnMode;
        this.local_customColumns = _customColumns;
        this.local_componentsFilter = _componentsFilter;
        this.local_format = _format;
        this.local_sortByTimeDirection = _sortByTimeDirection;
        this.local_logEventType = _logEventType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter raw )
    {
        if (raw == null)
            return;

        this.local_wildcardFilter = raw.getWildcardFilter();
        if (raw.getAbsoluteTimeRange() != null)
            this.local_absoluteTimeRange = new TimeRangeWrapper( raw.getAbsoluteTimeRange());
        this.local_relativeTimeRangeBuffer = raw.getRelativeTimeRangeBuffer();
        this.local_lineLimit = raw.getLineLimit();
        this.local_lineStartFrom = raw.getLineStartFrom();
        if (raw.getSelectColumnMode() != null)
            this.local_selectColumnMode = new LogSelectColumnModeWrapper( raw.getSelectColumnMode());
        if (raw.getCustomColumns() != null && raw.getCustomColumns().getItem() != null)
        {
            this.local_customColumns = new ArrayList<String>();
            for ( int i = 0; i < raw.getCustomColumns().getItem().length; i++)
            {
                this.local_customColumns.add(new String(raw.getCustomColumns().getItem()[i]));
            }
        }        if (raw.getComponentsFilter() != null && raw.getComponentsFilter().getItem() != null)
        {
            this.local_componentsFilter = new ArrayList<String>();
            for ( int i = 0; i < raw.getComponentsFilter().getItem().length; i++)
            {
                this.local_componentsFilter.add(new String(raw.getComponentsFilter().getItem()[i]));
            }
        }        if (raw.getFormat() != null)
            this.local_format = new LogAccessLogFormatWrapper( raw.getFormat());
        if (raw.getSortByTimeDirection() != null)
            this.local_sortByTimeDirection = new SortDirectionWrapper( raw.getSortByTimeDirection());
        if (raw.getLogEventType() != null)
            this.local_logEventType = new LogEventClassWrapper( raw.getLogEventType());

    }

    @Override
    public String toString()
    {
        return "LogAccessFilterWrapper [" + "wildcardFilter = " + local_wildcardFilter + ", " + "absoluteTimeRange = " + local_absoluteTimeRange + ", " + "relativeTimeRangeBuffer = " + local_relativeTimeRangeBuffer + ", " + "lineLimit = " + local_lineLimit + ", " + "lineStartFrom = " + local_lineStartFrom + ", " + "selectColumnMode = " + local_selectColumnMode + ", " + "customColumns = " + local_customColumns + ", " + "componentsFilter = " + local_componentsFilter + ", " + "format = " + local_format + ", " + "sortByTimeDirection = " + local_sortByTimeDirection + ", " + "logEventType = " + local_logEventType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.LogAccessFilter();
        raw.setWildcardFilter( local_wildcardFilter);
        if (local_absoluteTimeRange != null)
            raw.setAbsoluteTimeRange( local_absoluteTimeRange.getRaw());
        raw.setRelativeTimeRangeBuffer( local_relativeTimeRangeBuffer);
        raw.setLineLimit( local_lineLimit);
        raw.setLineStartFrom( local_lineStartFrom);
        if (local_selectColumnMode != null)
            raw.setSelectColumnMode( local_selectColumnMode.getRaw());
        if (this.local_customColumns!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_customColumns.size(); i++)
            {
                arr.addItem(this.local_customColumns.get(i));
            }
            raw.setCustomColumns(arr);
        }
        if (this.local_componentsFilter!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_componentsFilter.size(); i++)
            {
                arr.addItem(this.local_componentsFilter.get(i));
            }
            raw.setComponentsFilter(arr);
        }
        if (local_format != null)
            raw.setFormat( local_format.getRaw());
        if (local_sortByTimeDirection != null)
            raw.setSortByTimeDirection( local_sortByTimeDirection.getRaw());
        if (local_logEventType != null)
            raw.setLogEventType( local_logEventType.getRaw());
        return raw;
    }


    public void setWildcardFilter( String _wildcardFilter )
    {
        this.local_wildcardFilter = _wildcardFilter;
    }
    public String getWildcardFilter( )
    {
        return this.local_wildcardFilter;
    }
    public void setAbsoluteTimeRange( TimeRangeWrapper _absoluteTimeRange )
    {
        this.local_absoluteTimeRange = _absoluteTimeRange;
    }
    public TimeRangeWrapper getAbsoluteTimeRange( )
    {
        return this.local_absoluteTimeRange;
    }
    public void setRelativeTimeRangeBuffer( UnsignedInt _relativeTimeRangeBuffer )
    {
        this.local_relativeTimeRangeBuffer = _relativeTimeRangeBuffer;
    }
    public UnsignedInt getRelativeTimeRangeBuffer( )
    {
        return this.local_relativeTimeRangeBuffer;
    }
    public void setLineLimit( UnsignedInt _lineLimit )
    {
        this.local_lineLimit = _lineLimit;
    }
    public UnsignedInt getLineLimit( )
    {
        return this.local_lineLimit;
    }
    public void setLineStartFrom( long _lineStartFrom )
    {
        this.local_lineStartFrom = _lineStartFrom;
    }
    public long getLineStartFrom( )
    {
        return this.local_lineStartFrom;
    }
    public void setSelectColumnMode( LogSelectColumnModeWrapper _selectColumnMode )
    {
        this.local_selectColumnMode = _selectColumnMode;
    }
    public LogSelectColumnModeWrapper getSelectColumnMode( )
    {
        return this.local_selectColumnMode;
    }
    public void setCustomColumns( List<String> _customColumns )
    {
        this.local_customColumns = _customColumns;
    }
    public List<String> getCustomColumns( )
    {
        return this.local_customColumns;
    }
    public void setComponentsFilter( List<String> _componentsFilter )
    {
        this.local_componentsFilter = _componentsFilter;
    }
    public List<String> getComponentsFilter( )
    {
        return this.local_componentsFilter;
    }
    public void setFormat( LogAccessLogFormatWrapper _format )
    {
        this.local_format = _format;
    }
    public LogAccessLogFormatWrapper getFormat( )
    {
        return this.local_format;
    }
    public void setSortByTimeDirection( SortDirectionWrapper _sortByTimeDirection )
    {
        this.local_sortByTimeDirection = _sortByTimeDirection;
    }
    public SortDirectionWrapper getSortByTimeDirection( )
    {
        return this.local_sortByTimeDirection;
    }
    public void setLogEventType( LogEventClassWrapper _logEventType )
    {
        this.local_logEventType = _logEventType;
    }
    public LogEventClassWrapper getLogEventType( )
    {
        return this.local_logEventType;
    }
}