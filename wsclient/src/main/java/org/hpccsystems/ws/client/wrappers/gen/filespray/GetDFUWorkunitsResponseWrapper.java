package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: GetDFUWorkunitsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.838Z
 */
public class GetDFUWorkunitsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfDFUWorkunitWrapper local_results;
    protected String local_type;
    protected String local_owner;
    protected String local_cluster;
    protected String local_stateReq;
    protected long local_pageSize;
    protected long local_prevPage;
    protected long local_nextPage;
    protected long local_lastPage;
    protected long local_numWUs;
    protected long local_pageStartFrom;
    protected long local_pageEndAt;
    protected boolean local_first;
    protected String local_sortby;
    protected boolean local_descending;
    protected String local_basicQuery;
    protected String local_filters;
    protected long local_cacheHint;

    public GetDFUWorkunitsResponseWrapper() {}

    public GetDFUWorkunitsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse getdfuworkunitsresponse)
    {
        copy( getdfuworkunitsresponse );
    }
    public GetDFUWorkunitsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfDFUWorkunitWrapper _results, String _type, String _owner, String _cluster, String _stateReq, long _pageSize, long _prevPage, long _nextPage, long _lastPage, long _numWUs, long _pageStartFrom, long _pageEndAt, boolean _first, String _sortby, boolean _descending, String _basicQuery, String _filters, long _cacheHint )
    {
        this.local_exceptions = _exceptions;
        this.local_results = _results;
        this.local_type = _type;
        this.local_owner = _owner;
        this.local_cluster = _cluster;
        this.local_stateReq = _stateReq;
        this.local_pageSize = _pageSize;
        this.local_prevPage = _prevPage;
        this.local_nextPage = _nextPage;
        this.local_lastPage = _lastPage;
        this.local_numWUs = _numWUs;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_pageEndAt = _pageEndAt;
        this.local_first = _first;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_basicQuery = _basicQuery;
        this.local_filters = _filters;
        this.local_cacheHint = _cacheHint;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getResults() != null)
            this.local_results = new ArrayOfDFUWorkunitWrapper( raw.getResults());
        this.local_type = raw.getType();
        this.local_owner = raw.getOwner();
        this.local_cluster = raw.getCluster();
        this.local_stateReq = raw.getStateReq();
        this.local_pageSize = raw.getPageSize();
        this.local_prevPage = raw.getPrevPage();
        this.local_nextPage = raw.getNextPage();
        this.local_lastPage = raw.getLastPage();
        this.local_numWUs = raw.getNumWUs();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_pageEndAt = raw.getPageEndAt();
        this.local_first = raw.getFirst();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_basicQuery = raw.getBasicQuery();
        this.local_filters = raw.getFilters();
        this.local_cacheHint = raw.getCacheHint();

    }

    @Override
    public String toString()
    {
        return "GetDFUWorkunitsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "results = " + local_results + ", " + "type = " + local_type + ", " + "owner = " + local_owner + ", " + "cluster = " + local_cluster + ", " + "stateReq = " + local_stateReq + ", " + "pageSize = " + local_pageSize + ", " + "prevPage = " + local_prevPage + ", " + "nextPage = " + local_nextPage + ", " + "lastPage = " + local_lastPage + ", " + "numWUs = " + local_numWUs + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "pageEndAt = " + local_pageEndAt + ", " + "first = " + local_first + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "basicQuery = " + local_basicQuery + ", " + "filters = " + local_filters + ", " + "cacheHint = " + local_cacheHint + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunitsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_results != null)
            raw.setResults( local_results.getRaw());
        raw.setType( local_type);
        raw.setOwner( local_owner);
        raw.setCluster( local_cluster);
        raw.setStateReq( local_stateReq);
        raw.setPageSize( local_pageSize);
        raw.setPrevPage( local_prevPage);
        raw.setNextPage( local_nextPage);
        raw.setLastPage( local_lastPage);
        raw.setNumWUs( local_numWUs);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setPageEndAt( local_pageEndAt);
        raw.setFirst( local_first);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setBasicQuery( local_basicQuery);
        raw.setFilters( local_filters);
        raw.setCacheHint( local_cacheHint);
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
    public void setResults( ArrayOfDFUWorkunitWrapper _results )
    {
        this.local_results = _results;
    }
    public ArrayOfDFUWorkunitWrapper getResults( )
    {
        return this.local_results;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setStateReq( String _stateReq )
    {
        this.local_stateReq = _stateReq;
    }
    public String getStateReq( )
    {
        return this.local_stateReq;
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
    public void setNumWUs( long _numWUs )
    {
        this.local_numWUs = _numWUs;
    }
    public long getNumWUs( )
    {
        return this.local_numWUs;
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
    public void setFirst( boolean _first )
    {
        this.local_first = _first;
    }
    public boolean getFirst( )
    {
        return this.local_first;
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
}