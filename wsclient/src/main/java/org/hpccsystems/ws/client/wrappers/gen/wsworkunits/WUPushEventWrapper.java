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
 * Class name: WUPushEventWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.955Z
 */
public class WUPushEventWrapper
{
    protected String local_eventName;
    protected String local_eventText;

    public WUPushEventWrapper() {}

    public WUPushEventWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent wupushevent)
    {
        copy( wupushevent );
    }
    public WUPushEventWrapper( String _eventName, String _eventText )
    {
        this.local_eventName = _eventName;
        this.local_eventText = _eventText;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent raw )
    {
        if (raw == null)
            return;

        this.local_eventName = raw.getEventName();
        this.local_eventText = raw.getEventText();

    }

    @Override
    public String toString()
    {
        return "WUPushEventWrapper [" + "eventName = " + local_eventName + ", " + "eventText = " + local_eventText + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPushEvent();
        raw.setEventName( local_eventName);
        raw.setEventText( local_eventText);
        return raw;
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
}