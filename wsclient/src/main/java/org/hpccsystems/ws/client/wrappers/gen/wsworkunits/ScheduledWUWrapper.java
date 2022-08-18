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
 * Class name: ScheduledWUWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.863Z
 */
public class ScheduledWUWrapper
{
    protected String local_wuid;
    protected String local_cluster;
    protected String local_eventName;
    protected String local_eventText;
    protected String local_jobName;
    protected int local_stateID;
    protected String local_state;
    protected String local_owner;

    public ScheduledWUWrapper() {}

    public ScheduledWUWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU scheduledwu)
    {
        copy( scheduledwu );
    }
    public ScheduledWUWrapper( String _wuid, String _cluster, String _eventName, String _eventText, String _jobName, int _stateID, String _state, String _owner )
    {
        this.local_wuid = _wuid;
        this.local_cluster = _cluster;
        this.local_eventName = _eventName;
        this.local_eventText = _eventText;
        this.local_jobName = _jobName;
        this.local_stateID = _stateID;
        this.local_state = _state;
        this.local_owner = _owner;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_cluster = raw.getCluster();
        this.local_eventName = raw.getEventName();
        this.local_eventText = raw.getEventText();
        this.local_jobName = raw.getJobName();
        this.local_stateID = raw.getStateID();
        this.local_state = raw.getState();
        this.local_owner = raw.getOwner();

    }

    @Override
    public String toString()
    {
        return "ScheduledWUWrapper [" + "wuid = " + local_wuid + ", " + "cluster = " + local_cluster + ", " + "eventName = " + local_eventName + ", " + "eventText = " + local_eventText + ", " + "jobName = " + local_jobName + ", " + "stateID = " + local_stateID + ", " + "state = " + local_state + ", " + "owner = " + local_owner + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ScheduledWU();
        raw.setWuid( local_wuid);
        raw.setCluster( local_cluster);
        raw.setEventName( local_eventName);
        raw.setEventText( local_eventText);
        raw.setJobName( local_jobName);
        raw.setStateID( local_stateID);
        raw.setState( local_state);
        raw.setOwner( local_owner);
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
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setEventName( String _eventName )
    {
        this.local_eventName = _eventName;
    }
    public String getEventName( )
    {
        return this.local_eventName;
    }
    public void setEventText( String _eventText )
    {
        this.local_eventText = _eventText;
    }
    public String getEventText( )
    {
        return this.local_eventText;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
    }
    public void setStateID( int _stateID )
    {
        this.local_stateID = _stateID;
    }
    public int getStateID( )
    {
        return this.local_stateID;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
}