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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WULightWeightQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.935Z
 */
public class WULightWeightQueryWrapper
{
    protected String local_wuid;
    protected String local_type;
    protected String local_cluster;
    protected String local_owner;
    protected String local_jobName;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_beforeWU;
    protected String local_afterWU;
    protected String local_state;
    protected ArrayOfApplicationValueWrapper local_applicationValues;
    protected long local_pageStartFrom;
    protected UnsignedInt local_pageSize;
    protected String local_sortBy;
    protected boolean local_descending;
    protected long local_cacheHint;

    public WULightWeightQueryWrapper() {}

    public WULightWeightQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery wulightweightquery)
    {
        copy( wulightweightquery );
    }
    public WULightWeightQueryWrapper( String _wuid, String _type, String _cluster, String _owner, String _jobName, String _startDate, String _endDate, String _beforeWU, String _afterWU, String _state, ArrayOfApplicationValueWrapper _applicationValues, long _pageStartFrom, UnsignedInt _pageSize, String _sortBy, boolean _descending, long _cacheHint )
    {
        this.local_wuid = _wuid;
        this.local_type = _type;
        this.local_cluster = _cluster;
        this.local_owner = _owner;
        this.local_jobName = _jobName;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_beforeWU = _beforeWU;
        this.local_afterWU = _afterWU;
        this.local_state = _state;
        this.local_applicationValues = _applicationValues;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_pageSize = _pageSize;
        this.local_sortBy = _sortBy;
        this.local_descending = _descending;
        this.local_cacheHint = _cacheHint;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_type = raw.getType();
        this.local_cluster = raw.getCluster();
        this.local_owner = raw.getOwner();
        this.local_jobName = raw.getJobName();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_beforeWU = raw.getBeforeWU();
        this.local_afterWU = raw.getAfterWU();
        this.local_state = raw.getState();
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_pageSize = raw.getPageSize();
        this.local_sortBy = raw.getSortBy();
        this.local_descending = raw.getDescending();
        this.local_cacheHint = raw.getCacheHint();

    }

    @Override
    public String toString()
    {
        return "WULightWeightQueryWrapper [" + "wuid = " + local_wuid + ", " + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "owner = " + local_owner + ", " + "jobName = " + local_jobName + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "beforeWU = " + local_beforeWU + ", " + "afterWU = " + local_afterWU + ", " + "state = " + local_state + ", " + "applicationValues = " + local_applicationValues + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "pageSize = " + local_pageSize + ", " + "sortBy = " + local_sortBy + ", " + "descending = " + local_descending + ", " + "cacheHint = " + local_cacheHint + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQuery();
        raw.setWuid( local_wuid);
        raw.setType( local_type);
        raw.setCluster( local_cluster);
        raw.setOwner( local_owner);
        raw.setJobName( local_jobName);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setBeforeWU( local_beforeWU);
        raw.setAfterWU( local_afterWU);
        raw.setState( local_state);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setPageSize( local_pageSize);
        raw.setSortBy( local_sortBy);
        raw.setDescending( local_descending);
        raw.setCacheHint( local_cacheHint);
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
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
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
    public void setBeforeWU( String _beforeWU )
    {
        this.local_beforeWU = _beforeWU;
    }
    public String getBeforeWU( )
    {
        return this.local_beforeWU;
    }
    public void setAfterWU( String _afterWU )
    {
        this.local_afterWU = _afterWU;
    }
    public String getAfterWU( )
    {
        return this.local_afterWU;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
    }
    public void setPageStartFrom( long _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public long getPageStartFrom( )
    {
        return this.local_pageStartFrom;
    }
    public void setPageSize( UnsignedInt _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public UnsignedInt getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setSortBy( String _sortBy )
    {
        this.local_sortBy = _sortBy;
    }
    public String getSortBy( )
    {
        return this.local_sortBy;
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
}