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
 * Class name: WUJobListWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.933Z
 */
public class WUJobListWrapper
{
    protected String local_cluster;
    protected String local_process;
    protected String local_startDate;
    protected String local_endDate;
    protected boolean local_showAll;
    protected int local_businessStartHour;
    protected int local_businessEndHour;

    public WUJobListWrapper() {}

    public WUJobListWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList wujoblist)
    {
        copy( wujoblist );
    }
    public WUJobListWrapper( String _cluster, String _process, String _startDate, String _endDate, boolean _showAll, int _businessStartHour, int _businessEndHour )
    {
        this.local_cluster = _cluster;
        this.local_process = _process;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_showAll = _showAll;
        this.local_businessStartHour = _businessStartHour;
        this.local_businessEndHour = _businessEndHour;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_process = raw.getProcess();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_showAll = raw.getShowAll();
        this.local_businessStartHour = raw.getBusinessStartHour();
        this.local_businessEndHour = raw.getBusinessEndHour();

    }

    @Override
    public String toString()
    {
        return "WUJobListWrapper [" + "cluster = " + local_cluster + ", " + "process = " + local_process + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "showAll = " + local_showAll + ", " + "businessStartHour = " + local_businessStartHour + ", " + "businessEndHour = " + local_businessEndHour + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobList();
        raw.setCluster( local_cluster);
        raw.setProcess( local_process);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setShowAll( local_showAll);
        raw.setBusinessStartHour( local_businessStartHour);
        raw.setBusinessEndHour( local_businessEndHour);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
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
    public void setShowAll( boolean _showAll )
    {
        this.local_showAll = _showAll;
    }
    public boolean getShowAll( )
    {
        return this.local_showAll;
    }
    public void setBusinessStartHour( int _businessStartHour )
    {
        this.local_businessStartHour = _businessStartHour;
    }
    public int getBusinessStartHour( )
    {
        return this.local_businessStartHour;
    }
    public void setBusinessEndHour( int _businessEndHour )
    {
        this.local_businessEndHour = _businessEndHour;
    }
    public int getBusinessEndHour( )
    {
        return this.local_businessEndHour;
    }
}