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
 * Class name: WUQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUQueryWrapper
{
    protected String local_wuid;
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
    protected ArrayOfApplicationValueWrapper local_applicationValues;
    protected String local_beforeWU;
    protected String local_afterWU;
    protected UnsignedInt local_totalClusterTimeThresholdMilliSec;
    protected int local_count;
    protected long local_pageSize;
    protected long local_pageStartFrom;
    protected long local_pageEndAt;
    protected WUProtectFilterWrapper local_protected;
    protected double local_minimumExecuteCost;
    protected double local_minimumFileAccessCost;
    protected double local_minimumCompileCost;
    protected String local_sortby;
    protected boolean local_descending;
    protected long local_cacheHint;

    public WUQueryWrapper() {}

    public WUQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery wuquery)
    {
        copy( wuquery );
    }
    public WUQueryWrapper( String _wuid, String _type, String _cluster, String _roxieCluster, String _owner, String _state, String _startDate, String _endDate, String _eCL, String _jobname, String _logicalFile, String _logicalFileSearchType, ArrayOfApplicationValueWrapper _applicationValues, String _beforeWU, String _afterWU, UnsignedInt _totalClusterTimeThresholdMilliSec, int _count, long _pageSize, long _pageStartFrom, long _pageEndAt, WUProtectFilterWrapper _protected, double _minimumExecuteCost, double _minimumFileAccessCost, double _minimumCompileCost, String _sortby, boolean _descending, long _cacheHint )
    {
        this.local_wuid = _wuid;
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
        this.local_applicationValues = _applicationValues;
        this.local_beforeWU = _beforeWU;
        this.local_afterWU = _afterWU;
        this.local_totalClusterTimeThresholdMilliSec = _totalClusterTimeThresholdMilliSec;
        this.local_count = _count;
        this.local_pageSize = _pageSize;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_pageEndAt = _pageEndAt;
        this.local_protected = _protected;
        this.local_minimumExecuteCost = _minimumExecuteCost;
        this.local_minimumFileAccessCost = _minimumFileAccessCost;
        this.local_minimumCompileCost = _minimumCompileCost;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_cacheHint = _cacheHint;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
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
        if (raw.getApplicationValues() != null)
            this.local_applicationValues = new ArrayOfApplicationValueWrapper( raw.getApplicationValues());
        this.local_beforeWU = raw.getBeforeWU();
        this.local_afterWU = raw.getAfterWU();
        this.local_totalClusterTimeThresholdMilliSec = raw.getTotalClusterTimeThresholdMilliSec();
        this.local_count = raw.getCount();
        this.local_pageSize = raw.getPageSize();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_pageEndAt = raw.getPageEndAt();
        if (raw.getProtected() != null)
            this.local_protected = new WUProtectFilterWrapper( raw.getProtected());
        this.local_minimumExecuteCost = raw.getMinimumExecuteCost();
        this.local_minimumFileAccessCost = raw.getMinimumFileAccessCost();
        this.local_minimumCompileCost = raw.getMinimumCompileCost();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_cacheHint = raw.getCacheHint();

    }

    @Override
    public String toString()
    {
        return "WUQueryWrapper [" + "wuid = " + local_wuid + ", " + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "roxieCluster = " + local_roxieCluster + ", " + "owner = " + local_owner + ", " + "state = " + local_state + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "eCL = " + local_eCL + ", " + "jobname = " + local_jobname + ", " + "logicalFile = " + local_logicalFile + ", " + "logicalFileSearchType = " + local_logicalFileSearchType + ", " + "applicationValues = " + local_applicationValues + ", " + "beforeWU = " + local_beforeWU + ", " + "afterWU = " + local_afterWU + ", " + "totalClusterTimeThresholdMilliSec = " + local_totalClusterTimeThresholdMilliSec + ", " + "count = " + local_count + ", " + "pageSize = " + local_pageSize + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "pageEndAt = " + local_pageEndAt + ", " + "protected = " + local_protected + ", " + "minimumExecuteCost = " + local_minimumExecuteCost + ", " + "minimumFileAccessCost = " + local_minimumFileAccessCost + ", " + "minimumCompileCost = " + local_minimumCompileCost + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "cacheHint = " + local_cacheHint + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery();
        raw.setWuid( local_wuid);
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
        if (local_applicationValues != null)
            raw.setApplicationValues( local_applicationValues.getRaw());
        raw.setBeforeWU( local_beforeWU);
        raw.setAfterWU( local_afterWU);
        raw.setTotalClusterTimeThresholdMilliSec( local_totalClusterTimeThresholdMilliSec);
        raw.setCount( local_count);
        raw.setPageSize( local_pageSize);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setPageEndAt( local_pageEndAt);
        if (local_protected != null)
            raw.setProtected( local_protected.getRaw());
        raw.setMinimumExecuteCost( local_minimumExecuteCost);
        raw.setMinimumFileAccessCost( local_minimumFileAccessCost);
        raw.setMinimumCompileCost( local_minimumCompileCost);
        raw.setSortby( local_sortby);
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
    public void setApplicationValues( ArrayOfApplicationValueWrapper _applicationValues )
    {
        this.local_applicationValues = _applicationValues;
    }
    public ArrayOfApplicationValueWrapper getApplicationValues( )
    {
        return this.local_applicationValues;
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
    public void setTotalClusterTimeThresholdMilliSec( UnsignedInt _totalClusterTimeThresholdMilliSec )
    {
        this.local_totalClusterTimeThresholdMilliSec = _totalClusterTimeThresholdMilliSec;
    }
    public UnsignedInt getTotalClusterTimeThresholdMilliSec( )
    {
        return this.local_totalClusterTimeThresholdMilliSec;
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
    public void setProtected( WUProtectFilterWrapper _protected )
    {
        this.local_protected = _protected;
    }
    public WUProtectFilterWrapper getProtected( )
    {
        return this.local_protected;
    }
    public void setMinimumExecuteCost( double _minimumExecuteCost )
    {
        this.local_minimumExecuteCost = _minimumExecuteCost;
    }
    public double getMinimumExecuteCost( )
    {
        return this.local_minimumExecuteCost;
    }
    public void setMinimumFileAccessCost( double _minimumFileAccessCost )
    {
        this.local_minimumFileAccessCost = _minimumFileAccessCost;
    }
    public double getMinimumFileAccessCost( )
    {
        return this.local_minimumFileAccessCost;
    }
    public void setMinimumCompileCost( double _minimumCompileCost )
    {
        this.local_minimumCompileCost = _minimumCompileCost;
    }
    public double getMinimumCompileCost( )
    {
        return this.local_minimumCompileCost;
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
}