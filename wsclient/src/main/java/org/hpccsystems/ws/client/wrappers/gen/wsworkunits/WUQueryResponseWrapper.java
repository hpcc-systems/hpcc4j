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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.585Z
 */
public class WUQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_type;
    protected String local_cluster;
    protected String local_roxieCluster;
    protected String local_owner;
    protected String local_state;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_eCL;
    protected String local_jobname;
    protected String local_logicalFile;
    protected String local_logicalFileSearchType;
    protected String local_current;
    protected String local_next;
    protected int local_count;
    protected long local_pageSize;
    protected long local_prevPage;
    protected long local_nextPage;
    protected long local_lastPage;
    protected int local_numWUs;
    protected boolean local_first;
    protected long local_pageStartFrom;
    protected long local_pageEndAt;
    protected String local_sortby;
    protected boolean local_descending;
    protected String local_basicQuery;
    protected String local_filters;
    protected long local_cacheHint;
    protected ArrayOfECLWorkunitWrapper local_workunits;

    public WUQueryResponseWrapper() {}

    public WUQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse wuqueryresponse)
    {
        copy( wuqueryresponse );
    }
    public WUQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _type, String _cluster, String _roxieCluster, String _owner, String _state, String _startDate, String _endDate, String _eCL, String _jobname, String _logicalFile, String _logicalFileSearchType, String _current, String _next, int _count, long _pageSize, long _prevPage, long _nextPage, long _lastPage, int _numWUs, boolean _first, long _pageStartFrom, long _pageEndAt, String _sortby, boolean _descending, String _basicQuery, String _filters, long _cacheHint, ArrayOfECLWorkunitWrapper _workunits )
    {
        this.local_exceptions = _exceptions;
        this.local_type = _type;
        this.local_cluster = _cluster;
        this.local_roxieCluster = _roxieCluster;
        this.local_owner = _owner;
        this.local_state = _state;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_eCL = _eCL;
        this.local_jobname = _jobname;
        this.local_logicalFile = _logicalFile;
        this.local_logicalFileSearchType = _logicalFileSearchType;
        this.local_current = _current;
        this.local_next = _next;
        this.local_count = _count;
        this.local_pageSize = _pageSize;
        this.local_prevPage = _prevPage;
        this.local_nextPage = _nextPage;
        this.local_lastPage = _lastPage;
        this.local_numWUs = _numWUs;
        this.local_first = _first;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_pageEndAt = _pageEndAt;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_basicQuery = _basicQuery;
        this.local_filters = _filters;
        this.local_cacheHint = _cacheHint;
        this.local_workunits = _workunits;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_type = raw.getType();
        this.local_cluster = raw.getCluster();
        this.local_roxieCluster = raw.getRoxieCluster();
        this.local_owner = raw.getOwner();
        this.local_state = raw.getState();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_eCL = raw.getECL();
        this.local_jobname = raw.getJobname();
        this.local_logicalFile = raw.getLogicalFile();
        this.local_logicalFileSearchType = raw.getLogicalFileSearchType();
        this.local_current = raw.getCurrent();
        this.local_next = raw.getNext();
        this.local_count = raw.getCount();
        this.local_pageSize = raw.getPageSize();
        this.local_prevPage = raw.getPrevPage();
        this.local_nextPage = raw.getNextPage();
        this.local_lastPage = raw.getLastPage();
        this.local_numWUs = raw.getNumWUs();
        this.local_first = raw.getFirst();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_pageEndAt = raw.getPageEndAt();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_basicQuery = raw.getBasicQuery();
        this.local_filters = raw.getFilters();
        this.local_cacheHint = raw.getCacheHint();
        if (raw.getWorkunits() != null)
            this.local_workunits = new ArrayOfECLWorkunitWrapper( raw.getWorkunits());

    }

    @Override
    public String toString()
    {
        return "WUQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "roxieCluster = " + local_roxieCluster + ", " + "owner = " + local_owner + ", " + "state = " + local_state + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "eCL = " + local_eCL + ", " + "jobname = " + local_jobname + ", " + "logicalFile = " + local_logicalFile + ", " + "logicalFileSearchType = " + local_logicalFileSearchType + ", " + "current = " + local_current + ", " + "next = " + local_next + ", " + "count = " + local_count + ", " + "pageSize = " + local_pageSize + ", " + "prevPage = " + local_prevPage + ", " + "nextPage = " + local_nextPage + ", " + "lastPage = " + local_lastPage + ", " + "numWUs = " + local_numWUs + ", " + "first = " + local_first + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "pageEndAt = " + local_pageEndAt + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "basicQuery = " + local_basicQuery + ", " + "filters = " + local_filters + ", " + "cacheHint = " + local_cacheHint + ", " + "workunits = " + local_workunits + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setType( local_type);
        raw.setCluster( local_cluster);
        raw.setRoxieCluster( local_roxieCluster);
        raw.setOwner( local_owner);
        raw.setState( local_state);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setECL( local_eCL);
        raw.setJobname( local_jobname);
        raw.setLogicalFile( local_logicalFile);
        raw.setLogicalFileSearchType( local_logicalFileSearchType);
        raw.setCurrent( local_current);
        raw.setNext( local_next);
        raw.setCount( local_count);
        raw.setPageSize( local_pageSize);
        raw.setPrevPage( local_prevPage);
        raw.setNextPage( local_nextPage);
        raw.setLastPage( local_lastPage);
        raw.setNumWUs( local_numWUs);
        raw.setFirst( local_first);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setPageEndAt( local_pageEndAt);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setBasicQuery( local_basicQuery);
        raw.setFilters( local_filters);
        raw.setCacheHint( local_cacheHint);
        if (local_workunits != null)
            raw.setWorkunits( local_workunits.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setRoxieCluster( String _roxieCluster )
    {
        this.local_roxieCluster = _roxieCluster;
    }
    public String getRoxieCluster( )
    {
        return this.local_roxieCluster;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setStartDate( String _startDate )
    {
        this.local_startDate = _startDate;
    }
    public String getStartDate( )
    {
        return this.local_startDate;
    }
    public void setEndDate( String _endDate )
    {
        this.local_endDate = _endDate;
    }
    public String getEndDate( )
    {
        return this.local_endDate;
    }
    public void setECL( String _eCL )
    {
        this.local_eCL = _eCL;
    }
    public String getECL( )
    {
        return this.local_eCL;
    }
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
    public void setLogicalFile( String _logicalFile )
    {
        this.local_logicalFile = _logicalFile;
    }
    public String getLogicalFile( )
    {
        return this.local_logicalFile;
    }
    public void setLogicalFileSearchType( String _logicalFileSearchType )
    {
        this.local_logicalFileSearchType = _logicalFileSearchType;
    }
    public String getLogicalFileSearchType( )
    {
        return this.local_logicalFileSearchType;
    }
    public void setCurrent( String _current )
    {
        this.local_current = _current;
    }
    public String getCurrent( )
    {
        return this.local_current;
    }
    public void setNext( String _next )
    {
        this.local_next = _next;
    }
    public String getNext( )
    {
        return this.local_next;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setPageSize( long _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public long getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setPrevPage( long _prevPage )
    {
        this.local_prevPage = _prevPage;
    }
    public long getPrevPage( )
    {
        return this.local_prevPage;
    }
    public void setNextPage( long _nextPage )
    {
        this.local_nextPage = _nextPage;
    }
    public long getNextPage( )
    {
        return this.local_nextPage;
    }
    public void setLastPage( long _lastPage )
    {
        this.local_lastPage = _lastPage;
    }
    public long getLastPage( )
    {
        return this.local_lastPage;
    }
    public void setNumWUs( int _numWUs )
    {
        this.local_numWUs = _numWUs;
    }
    public int getNumWUs( )
    {
        return this.local_numWUs;
    }
    public void setFirst( boolean _first )
    {
        this.local_first = _first;
    }
    public boolean getFirst( )
    {
        return this.local_first;
    }
    public void setPageStartFrom( long _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public long getPageStartFrom( )
    {
        return this.local_pageStartFrom;
    }
    public void setPageEndAt( long _pageEndAt )
    {
        this.local_pageEndAt = _pageEndAt;
    }
    public long getPageEndAt( )
    {
        return this.local_pageEndAt;
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
    public void setBasicQuery( String _basicQuery )
    {
        this.local_basicQuery = _basicQuery;
    }
    public String getBasicQuery( )
    {
        return this.local_basicQuery;
    }
    public void setFilters( String _filters )
    {
        this.local_filters = _filters;
    }
    public String getFilters( )
    {
        return this.local_filters;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setWorkunits( ArrayOfECLWorkunitWrapper _workunits )
    {
        this.local_workunits = _workunits;
    }
    public ArrayOfECLWorkunitWrapper getWorkunits( )
    {
        return this.local_workunits;
    }
}