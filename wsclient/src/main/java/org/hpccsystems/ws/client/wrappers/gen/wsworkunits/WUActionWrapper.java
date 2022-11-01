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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUActionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.504Z
 */
public class WUActionWrapper
{
    protected List<String> local_wuids = null;
    protected ECLWUActionsWrapper local_wUActionType;
    protected String local_cluster;
    protected String local_owner;
    protected String local_state;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_eCL;
    protected String local_jobname;
    protected String local_test;
    protected String local_currentPage;
    protected String local_pageSize;
    protected String local_sortby;
    protected boolean local_descending;
    protected String local_eventServer;
    protected String local_eventName;
    protected String local_pageFrom;
    protected int local_blockTillFinishTimer;

    public WUActionWrapper() {}

    public WUActionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction wuaction)
    {
        copy( wuaction );
    }
    public WUActionWrapper( List<String> _wuids, ECLWUActionsWrapper _wUActionType, String _cluster, String _owner, String _state, String _startDate, String _endDate, String _eCL, String _jobname, String _test, String _currentPage, String _pageSize, String _sortby, boolean _descending, String _eventServer, String _eventName, String _pageFrom, int _blockTillFinishTimer )
    {
        this.local_wuids = _wuids;
        this.local_wUActionType = _wUActionType;
        this.local_cluster = _cluster;
        this.local_owner = _owner;
        this.local_state = _state;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_eCL = _eCL;
        this.local_jobname = _jobname;
        this.local_test = _test;
        this.local_currentPage = _currentPage;
        this.local_pageSize = _pageSize;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_eventServer = _eventServer;
        this.local_eventName = _eventName;
        this.local_pageFrom = _pageFrom;
        this.local_blockTillFinishTimer = _blockTillFinishTimer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction raw )
    {
        if (raw == null)
            return;

        if (raw.getWuids() != null)
        {
            this.local_wuids = new ArrayList<String>();
            for ( int i = 0; i < raw.getWuids().getItem().length; i++)
            {
                this.local_wuids.add(new String(raw.getWuids().getItem()[i]));
            }
        }        if (raw.getWUActionType() != null)
            this.local_wUActionType = new ECLWUActionsWrapper( raw.getWUActionType());
        this.local_cluster = raw.getCluster();
        this.local_owner = raw.getOwner();
        this.local_state = raw.getState();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_eCL = raw.getECL();
        this.local_jobname = raw.getJobname();
        this.local_test = raw.getTest();
        this.local_currentPage = raw.getCurrentPage();
        this.local_pageSize = raw.getPageSize();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_eventServer = raw.getEventServer();
        this.local_eventName = raw.getEventName();
        this.local_pageFrom = raw.getPageFrom();
        this.local_blockTillFinishTimer = raw.getBlockTillFinishTimer();

    }

    @Override
    public String toString()
    {
        return "WUActionWrapper [" + "wuids = " + local_wuids + ", " + "wUActionType = " + local_wUActionType + ", " + "cluster = " + local_cluster + ", " + "owner = " + local_owner + ", " + "state = " + local_state + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "eCL = " + local_eCL + ", " + "jobname = " + local_jobname + ", " + "test = " + local_test + ", " + "currentPage = " + local_currentPage + ", " + "pageSize = " + local_pageSize + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "eventServer = " + local_eventServer + ", " + "eventName = " + local_eventName + ", " + "pageFrom = " + local_pageFrom + ", " + "blockTillFinishTimer = " + local_blockTillFinishTimer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAction();
        if (this.local_wuids!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_wuids.size(); i++)
            {
                arr.addItem(this.local_wuids.get(i));
            }
            raw.setWuids(arr);
        }
        if (local_wUActionType != null)
            raw.setWUActionType( local_wUActionType.getRaw());
        raw.setCluster( local_cluster);
        raw.setOwner( local_owner);
        raw.setState( local_state);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setECL( local_eCL);
        raw.setJobname( local_jobname);
        raw.setTest( local_test);
        raw.setCurrentPage( local_currentPage);
        raw.setPageSize( local_pageSize);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setEventServer( local_eventServer);
        raw.setEventName( local_eventName);
        raw.setPageFrom( local_pageFrom);
        raw.setBlockTillFinishTimer( local_blockTillFinishTimer);
        return raw;
    }


    public void setWuids( List<String> _wuids )
    {
        this.local_wuids = _wuids;
    }
    public List<String> getWuids( )
    {
        return this.local_wuids;
    }
    public void setWUActionType( ECLWUActionsWrapper _wUActionType )
    {
        this.local_wUActionType = _wUActionType;
    }
    public ECLWUActionsWrapper getWUActionType( )
    {
        return this.local_wUActionType;
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
    public void setTest( String _test )
    {
        this.local_test = _test;
    }
    public String getTest( )
    {
        return this.local_test;
    }
    public void setCurrentPage( String _currentPage )
    {
        this.local_currentPage = _currentPage;
    }
    public String getCurrentPage( )
    {
        return this.local_currentPage;
    }
    public void setPageSize( String _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public String getPageSize( )
    {
        return this.local_pageSize;
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
    public void setEventServer( String _eventServer )
    {
        this.local_eventServer = _eventServer;
    }
    public String getEventServer( )
    {
        return this.local_eventServer;
    }
    public void setEventName( String _eventName )
    {
        this.local_eventName = _eventName;
    }
    public String getEventName( )
    {
        return this.local_eventName;
    }
    public void setPageFrom( String _pageFrom )
    {
        this.local_pageFrom = _pageFrom;
    }
    public String getPageFrom( )
    {
        return this.local_pageFrom;
    }
    public void setBlockTillFinishTimer( int _blockTillFinishTimer )
    {
        this.local_blockTillFinishTimer = _blockTillFinishTimer;
    }
    public int getBlockTillFinishTimer( )
    {
        return this.local_blockTillFinishTimer;
    }
}