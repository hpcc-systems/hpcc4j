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
 * Class name: ECLWorkflowWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.811Z
 */
public class ECLWorkflowWrapper
{
    protected String local_wFID;
    protected String local_eventName;
    protected String local_eventText;
    protected int local_count;
    protected int local_countRemaining;

    public ECLWorkflowWrapper() {}

    public ECLWorkflowWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow eclworkflow)
    {
        copy( eclworkflow );
    }
    public ECLWorkflowWrapper( String _wFID, String _eventName, String _eventText, int _count, int _countRemaining )
    {
        this.local_wFID = _wFID;
        this.local_eventName = _eventName;
        this.local_eventText = _eventText;
        this.local_count = _count;
        this.local_countRemaining = _countRemaining;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow raw )
    {
        if (raw == null)
            return;

        this.local_wFID = raw.getWFID();
        this.local_eventName = raw.getEventName();
        this.local_eventText = raw.getEventText();
        this.local_count = raw.getCount();
        this.local_countRemaining = raw.getCountRemaining();

    }

    @Override
    public String toString()
    {
        return "ECLWorkflowWrapper [" + "wFID = " + local_wFID + ", " + "eventName = " + local_eventName + ", " + "eventText = " + local_eventText + ", " + "count = " + local_count + ", " + "countRemaining = " + local_countRemaining + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLWorkflow();
        raw.setWFID( local_wFID);
        raw.setEventName( local_eventName);
        raw.setEventText( local_eventText);
        raw.setCount( local_count);
        raw.setCountRemaining( local_countRemaining);
        return raw;
    }


    public void setWFID( String _wFID )
    {
        this.local_wFID = _wFID;
    }
    public String getWFID( )
    {
        return this.local_wFID;
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
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setCountRemaining( int _countRemaining )
    {
        this.local_countRemaining = _countRemaining;
    }
    public int getCountRemaining( )
    {
        return this.local_countRemaining;
    }
}