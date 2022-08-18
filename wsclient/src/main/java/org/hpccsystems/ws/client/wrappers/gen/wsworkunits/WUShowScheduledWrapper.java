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
 * Class name: WUShowScheduledWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.994Z
 */
public class WUShowScheduledWrapper
{
    protected String local_cluster;
    protected String local_eventName;
    protected String local_pushEventName;
    protected String local_pushEventText;
    protected String local_state;
    protected String local_jobName;
    protected String local_owner;
    protected String local_eventText;

    public WUShowScheduledWrapper() {}

    public WUShowScheduledWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled wushowscheduled)
    {
        copy( wushowscheduled );
    }
    public WUShowScheduledWrapper( String _cluster, String _eventName, String _pushEventName, String _pushEventText, String _state, String _jobName, String _owner, String _eventText )
    {
        this.local_cluster = _cluster;
        this.local_eventName = _eventName;
        this.local_pushEventName = _pushEventName;
        this.local_pushEventText = _pushEventText;
        this.local_state = _state;
        this.local_jobName = _jobName;
        this.local_owner = _owner;
        this.local_eventText = _eventText;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_eventName = raw.getEventName();
        this.local_pushEventName = raw.getPushEventName();
        this.local_pushEventText = raw.getPushEventText();
        this.local_state = raw.getState();
        this.local_jobName = raw.getJobName();
        this.local_owner = raw.getOwner();
        this.local_eventText = raw.getEventText();

    }

    @Override
    public String toString()
    {
        return "WUShowScheduledWrapper [" + "cluster = " + local_cluster + ", " + "eventName = " + local_eventName + ", " + "pushEventName = " + local_pushEventName + ", " + "pushEventText = " + local_pushEventText + ", " + "state = " + local_state + ", " + "jobName = " + local_jobName + ", " + "owner = " + local_owner + ", " + "eventText = " + local_eventText + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduled();
        raw.setCluster( local_cluster);
        raw.setEventName( local_eventName);
        raw.setPushEventName( local_pushEventName);
        raw.setPushEventText( local_pushEventText);
        raw.setState( local_state);
        raw.setJobName( local_jobName);
        raw.setOwner( local_owner);
        raw.setEventText( local_eventText);
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
    public void setEventName( String _eventName )
    {
        this.local_eventName = _eventName;
    }
    public String getEventName( )
    {
        return this.local_eventName;
    }
    public void setPushEventName( String _pushEventName )
    {
        this.local_pushEventName = _pushEventName;
    }
    public String getPushEventName( )
    {
        return this.local_pushEventName;
    }
    public void setPushEventText( String _pushEventText )
    {
        this.local_pushEventText = _pushEventText;
    }
    public String getPushEventText( )
    {
        return this.local_pushEventText;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setEventText( String _eventText )
    {
        this.local_eventText = _eventText;
    }
    public String getEventText( )
    {
        return this.local_eventText;
    }
}