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
import org.apache.axis2.databinding.types.NonNegativeInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUListQueriesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.556Z
 */
public class WUListQueriesWrapper
{
    protected String local_querySetName;
    protected String local_clusterName;
    protected String local_libraryName;
    protected long local_memoryLimitLow;
    protected long local_memoryLimitHigh;
    protected NonNegativeInteger local_timeLimitLow;
    protected NonNegativeInteger local_timeLimitHigh;
    protected NonNegativeInteger local_warnTimeLimitLow;
    protected NonNegativeInteger local_warnTimeLimitHigh;
    protected NonNegativeInteger local_priorityLow;
    protected NonNegativeInteger local_priorityHigh;
    protected boolean local_activated;
    protected WUQueryFilterSuspendedTypeWrapper local_suspendedFilter;
    protected String local_wUID;
    protected String local_queryID;
    protected String local_queryName;
    protected String local_publishedBy;
    protected NonNegativeInteger local_pageSize;
    protected NonNegativeInteger local_pageStartFrom;
    protected String local_sortby;
    protected boolean local_descending;
    protected long local_cacheHint;
    protected String local_fileName;
    protected boolean local_checkAllNodes;

    public WUListQueriesWrapper() {}

    public WUListQueriesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries wulistqueries)
    {
        copy( wulistqueries );
    }
    public WUListQueriesWrapper( String _querySetName, String _clusterName, String _libraryName, long _memoryLimitLow, long _memoryLimitHigh, NonNegativeInteger _timeLimitLow, NonNegativeInteger _timeLimitHigh, NonNegativeInteger _warnTimeLimitLow, NonNegativeInteger _warnTimeLimitHigh, NonNegativeInteger _priorityLow, NonNegativeInteger _priorityHigh, boolean _activated, WUQueryFilterSuspendedTypeWrapper _suspendedFilter, String _wUID, String _queryID, String _queryName, String _publishedBy, NonNegativeInteger _pageSize, NonNegativeInteger _pageStartFrom, String _sortby, boolean _descending, long _cacheHint, String _fileName, boolean _checkAllNodes )
    {
        this.local_querySetName = _querySetName;
        this.local_clusterName = _clusterName;
        this.local_libraryName = _libraryName;
        this.local_memoryLimitLow = _memoryLimitLow;
        this.local_memoryLimitHigh = _memoryLimitHigh;
        this.local_timeLimitLow = _timeLimitLow;
        this.local_timeLimitHigh = _timeLimitHigh;
        this.local_warnTimeLimitLow = _warnTimeLimitLow;
        this.local_warnTimeLimitHigh = _warnTimeLimitHigh;
        this.local_priorityLow = _priorityLow;
        this.local_priorityHigh = _priorityHigh;
        this.local_activated = _activated;
        this.local_suspendedFilter = _suspendedFilter;
        this.local_wUID = _wUID;
        this.local_queryID = _queryID;
        this.local_queryName = _queryName;
        this.local_publishedBy = _publishedBy;
        this.local_pageSize = _pageSize;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_cacheHint = _cacheHint;
        this.local_fileName = _fileName;
        this.local_checkAllNodes = _checkAllNodes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries raw )
    {
        if (raw == null)
            return;

        this.local_querySetName = raw.getQuerySetName();
        this.local_clusterName = raw.getClusterName();
        this.local_libraryName = raw.getLibraryName();
        this.local_memoryLimitLow = raw.getMemoryLimitLow();
        this.local_memoryLimitHigh = raw.getMemoryLimitHigh();
        this.local_timeLimitLow = raw.getTimeLimitLow();
        this.local_timeLimitHigh = raw.getTimeLimitHigh();
        this.local_warnTimeLimitLow = raw.getWarnTimeLimitLow();
        this.local_warnTimeLimitHigh = raw.getWarnTimeLimitHigh();
        this.local_priorityLow = raw.getPriorityLow();
        this.local_priorityHigh = raw.getPriorityHigh();
        this.local_activated = raw.getActivated();
        if (raw.getSuspendedFilter() != null)
            this.local_suspendedFilter = new WUQueryFilterSuspendedTypeWrapper( raw.getSuspendedFilter());
        this.local_wUID = raw.getWUID();
        this.local_queryID = raw.getQueryID();
        this.local_queryName = raw.getQueryName();
        this.local_publishedBy = raw.getPublishedBy();
        this.local_pageSize = raw.getPageSize();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_cacheHint = raw.getCacheHint();
        this.local_fileName = raw.getFileName();
        this.local_checkAllNodes = raw.getCheckAllNodes();

    }

    @Override
    public String toString()
    {
        return "WUListQueriesWrapper [" + "querySetName = " + local_querySetName + ", " + "clusterName = " + local_clusterName + ", " + "libraryName = " + local_libraryName + ", " + "memoryLimitLow = " + local_memoryLimitLow + ", " + "memoryLimitHigh = " + local_memoryLimitHigh + ", " + "timeLimitLow = " + local_timeLimitLow + ", " + "timeLimitHigh = " + local_timeLimitHigh + ", " + "warnTimeLimitLow = " + local_warnTimeLimitLow + ", " + "warnTimeLimitHigh = " + local_warnTimeLimitHigh + ", " + "priorityLow = " + local_priorityLow + ", " + "priorityHigh = " + local_priorityHigh + ", " + "activated = " + local_activated + ", " + "suspendedFilter = " + local_suspendedFilter + ", " + "wUID = " + local_wUID + ", " + "queryID = " + local_queryID + ", " + "queryName = " + local_queryName + ", " + "publishedBy = " + local_publishedBy + ", " + "pageSize = " + local_pageSize + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "cacheHint = " + local_cacheHint + ", " + "fileName = " + local_fileName + ", " + "checkAllNodes = " + local_checkAllNodes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueries();
        raw.setQuerySetName( local_querySetName);
        raw.setClusterName( local_clusterName);
        raw.setLibraryName( local_libraryName);
        raw.setMemoryLimitLow( local_memoryLimitLow);
        raw.setMemoryLimitHigh( local_memoryLimitHigh);
        raw.setTimeLimitLow( local_timeLimitLow);
        raw.setTimeLimitHigh( local_timeLimitHigh);
        raw.setWarnTimeLimitLow( local_warnTimeLimitLow);
        raw.setWarnTimeLimitHigh( local_warnTimeLimitHigh);
        raw.setPriorityLow( local_priorityLow);
        raw.setPriorityHigh( local_priorityHigh);
        raw.setActivated( local_activated);
        if (local_suspendedFilter != null)
            raw.setSuspendedFilter( local_suspendedFilter.getRaw());
        raw.setWUID( local_wUID);
        raw.setQueryID( local_queryID);
        raw.setQueryName( local_queryName);
        raw.setPublishedBy( local_publishedBy);
        raw.setPageSize( local_pageSize);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setCacheHint( local_cacheHint);
        raw.setFileName( local_fileName);
        raw.setCheckAllNodes( local_checkAllNodes);
        return raw;
    }


    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setLibraryName( String _libraryName )
    {
        this.local_libraryName = _libraryName;
    }
    public String getLibraryName( )
    {
        return this.local_libraryName;
    }
    public void setMemoryLimitLow( long _memoryLimitLow )
    {
        this.local_memoryLimitLow = _memoryLimitLow;
    }
    public long getMemoryLimitLow( )
    {
        return this.local_memoryLimitLow;
    }
    public void setMemoryLimitHigh( long _memoryLimitHigh )
    {
        this.local_memoryLimitHigh = _memoryLimitHigh;
    }
    public long getMemoryLimitHigh( )
    {
        return this.local_memoryLimitHigh;
    }
    public void setTimeLimitLow( NonNegativeInteger _timeLimitLow )
    {
        this.local_timeLimitLow = _timeLimitLow;
    }
    public NonNegativeInteger getTimeLimitLow( )
    {
        return this.local_timeLimitLow;
    }
    public void setTimeLimitHigh( NonNegativeInteger _timeLimitHigh )
    {
        this.local_timeLimitHigh = _timeLimitHigh;
    }
    public NonNegativeInteger getTimeLimitHigh( )
    {
        return this.local_timeLimitHigh;
    }
    public void setWarnTimeLimitLow( NonNegativeInteger _warnTimeLimitLow )
    {
        this.local_warnTimeLimitLow = _warnTimeLimitLow;
    }
    public NonNegativeInteger getWarnTimeLimitLow( )
    {
        return this.local_warnTimeLimitLow;
    }
    public void setWarnTimeLimitHigh( NonNegativeInteger _warnTimeLimitHigh )
    {
        this.local_warnTimeLimitHigh = _warnTimeLimitHigh;
    }
    public NonNegativeInteger getWarnTimeLimitHigh( )
    {
        return this.local_warnTimeLimitHigh;
    }
    public void setPriorityLow( NonNegativeInteger _priorityLow )
    {
        this.local_priorityLow = _priorityLow;
    }
    public NonNegativeInteger getPriorityLow( )
    {
        return this.local_priorityLow;
    }
    public void setPriorityHigh( NonNegativeInteger _priorityHigh )
    {
        this.local_priorityHigh = _priorityHigh;
    }
    public NonNegativeInteger getPriorityHigh( )
    {
        return this.local_priorityHigh;
    }
    public void setActivated( boolean _activated )
    {
        this.local_activated = _activated;
    }
    public boolean getActivated( )
    {
        return this.local_activated;
    }
    public void setSuspendedFilter( WUQueryFilterSuspendedTypeWrapper _suspendedFilter )
    {
        this.local_suspendedFilter = _suspendedFilter;
    }
    public WUQueryFilterSuspendedTypeWrapper getSuspendedFilter( )
    {
        return this.local_suspendedFilter;
    }
    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setQueryID( String _queryID )
    {
        this.local_queryID = _queryID;
    }
    public String getQueryID( )
    {
        return this.local_queryID;
    }
    public void setQueryName( String _queryName )
    {
        this.local_queryName = _queryName;
    }
    public String getQueryName( )
    {
        return this.local_queryName;
    }
    public void setPublishedBy( String _publishedBy )
    {
        this.local_publishedBy = _publishedBy;
    }
    public String getPublishedBy( )
    {
        return this.local_publishedBy;
    }
    public void setPageSize( NonNegativeInteger _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public NonNegativeInteger getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setPageStartFrom( NonNegativeInteger _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public NonNegativeInteger getPageStartFrom( )
    {
        return this.local_pageStartFrom;
    }
    public void setSortby( String _sortby )
    {
        this.local_sortby = _sortby;
    }
    public String getSortby( )
    {
        return this.local_sortby;
    }
    public void setDescending( boolean _descending )
    {
        this.local_descending = _descending;
    }
    public boolean getDescending( )
    {
        return this.local_descending;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setCheckAllNodes( boolean _checkAllNodes )
    {
        this.local_checkAllNodes = _checkAllNodes;
    }
    public boolean getCheckAllNodes( )
    {
        return this.local_checkAllNodes;
    }
}