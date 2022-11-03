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
 * WrapperMaker version: 1.7
 * Class name: GetDFUWorkunitsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * Service version: 1.23
 */
public class GetDFUWorkunitsWrapper
{
    protected String local_wuid;
    protected String local_owner;
    protected String local_cluster;
    protected String local_stateReq;
    protected String local_type;
    protected String local_jobname;
    protected long local_pageSize;
    protected int local_currentPage;
    protected long local_pageStartFrom;
    protected String local_sortby;
    protected boolean local_descending;
    protected long local_cacheHint;
    protected String local_parentWuid;
    protected String local_publisherWuid;

    public GetDFUWorkunitsWrapper() {}

    public GetDFUWorkunitsWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits getdfuworkunits)
    {
        copy( getdfuworkunits );
    }
    public GetDFUWorkunitsWrapper( String _wuid, String _owner, String _cluster, String _stateReq, String _type, String _jobname, long _pageSize, int _currentPage, long _pageStartFrom, String _sortby, boolean _descending, long _cacheHint, String _parentWuid, String _publisherWuid )
    {
        this.local_wuid = _wuid;
        this.local_owner = _owner;
        this.local_cluster = _cluster;
        this.local_stateReq = _stateReq;
        this.local_type = _type;
        this.local_jobname = _jobname;
        this.local_pageSize = _pageSize;
        this.local_currentPage = _currentPage;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_cacheHint = _cacheHint;
        this.local_parentWuid = _parentWuid;
        this.local_publisherWuid = _publisherWuid;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_owner = raw.getOwner();
        this.local_cluster = raw.getCluster();
        this.local_stateReq = raw.getStateReq();
        this.local_type = raw.getType();
        this.local_jobname = raw.getJobname();
        this.local_pageSize = raw.getPageSize();
        this.local_currentPage = raw.getCurrentPage();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_cacheHint = raw.getCacheHint();
        this.local_parentWuid = raw.getParentWuid();
        this.local_publisherWuid = raw.getPublisherWuid();

    }

    @Override
    public String toString()
    {
        return "GetDFUWorkunitsWrapper [" + "wuid = " + local_wuid + ", " + "owner = " + local_owner + ", " + "cluster = " + local_cluster + ", " + "stateReq = " + local_stateReq + ", " + "type = " + local_type + ", " + "jobname = " + local_jobname + ", " + "pageSize = " + local_pageSize + ", " + "currentPage = " + local_currentPage + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "cacheHint = " + local_cacheHint + ", " + "parentWuid = " + local_parentWuid + ", " + "publisherWuid = " + local_publisherWuid + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUWorkunits();
        raw.setWuid( local_wuid);
        raw.setOwner( local_owner);
        raw.setCluster( local_cluster);
        raw.setStateReq( local_stateReq);
        raw.setType( local_type);
        raw.setJobname( local_jobname);
        raw.setPageSize( local_pageSize);
        raw.setCurrentPage( local_currentPage);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setCacheHint( local_cacheHint);
        raw.setParentWuid( local_parentWuid);
        raw.setPublisherWuid( local_publisherWuid);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
    public void setPageSize( long _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public long getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setCurrentPage( int _currentPage )
    {
        this.local_currentPage = _currentPage;
    }
    public int getCurrentPage( )
    {
        return this.local_currentPage;
    }
    public void setPageStartFrom( long _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public long getPageStartFrom( )
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
    public void setParentWuid( String _parentWuid )
    {
        this.local_parentWuid = _parentWuid;
    }
    public String getParentWuid( )
    {
        return this.local_parentWuid;
    }
    public void setPublisherWuid( String _publisherWuid )
    {
        this.local_publisherWuid = _publisherWuid;
    }
    public String getPublisherWuid( )
    {
        return this.local_publisherWuid;
    }
}