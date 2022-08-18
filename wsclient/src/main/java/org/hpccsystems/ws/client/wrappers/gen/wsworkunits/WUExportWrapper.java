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
 * Class name: WUExportWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.910Z
 */
public class WUExportWrapper
{
    protected String local_cluster;
    protected String local_owner;
    protected String local_state;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_jobname;

    public WUExportWrapper() {}

    public WUExportWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport wuexport)
    {
        copy( wuexport );
    }
    public WUExportWrapper( String _cluster, String _owner, String _state, String _startDate, String _endDate, String _jobname )
    {
        this.local_cluster = _cluster;
        this.local_owner = _owner;
        this.local_state = _state;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_jobname = _jobname;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_owner = raw.getOwner();
        this.local_state = raw.getState();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_jobname = raw.getJobname();

    }

    @Override
    public String toString()
    {
        return "WUExportWrapper [" + "cluster = " + local_cluster + ", " + "owner = " + local_owner + ", " + "state = " + local_state + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "jobname = " + local_jobname + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExport();
        raw.setCluster( local_cluster);
        raw.setOwner( local_owner);
        raw.setState( local_state);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setJobname( local_jobname);
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
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
}