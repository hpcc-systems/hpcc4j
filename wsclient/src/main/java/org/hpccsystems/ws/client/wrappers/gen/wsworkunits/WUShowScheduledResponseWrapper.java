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
 * Class name: WUShowScheduledResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.994Z
 */
public class WUShowScheduledResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_clusterSelected;
    protected String local_eventName;
    protected String local_pushEventName;
    protected String local_pushEventText;
    protected String local_query;
    protected ArrayOfServerInfoWrapper local_clusters;
    protected ArrayOfScheduledWUWrapper local_workunits;

    public WUShowScheduledResponseWrapper() {}

    public WUShowScheduledResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse wushowscheduledresponse)
    {
        copy( wushowscheduledresponse );
    }
    public WUShowScheduledResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _clusterSelected, String _eventName, String _pushEventName, String _pushEventText, String _query, ArrayOfServerInfoWrapper _clusters, ArrayOfScheduledWUWrapper _workunits )
    {
        this.local_exceptions = _exceptions;
        this.local_clusterSelected = _clusterSelected;
        this.local_eventName = _eventName;
        this.local_pushEventName = _pushEventName;
        this.local_pushEventText = _pushEventText;
        this.local_query = _query;
        this.local_clusters = _clusters;
        this.local_workunits = _workunits;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_clusterSelected = raw.getClusterSelected();
        this.local_eventName = raw.getEventName();
        this.local_pushEventName = raw.getPushEventName();
        this.local_pushEventText = raw.getPushEventText();
        this.local_query = raw.getQuery();
        if (raw.getClusters() != null)
            this.local_clusters = new ArrayOfServerInfoWrapper( raw.getClusters());
        if (raw.getWorkunits() != null)
            this.local_workunits = new ArrayOfScheduledWUWrapper( raw.getWorkunits());

    }

    @Override
    public String toString()
    {
        return "WUShowScheduledResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "clusterSelected = " + local_clusterSelected + ", " + "eventName = " + local_eventName + ", " + "pushEventName = " + local_pushEventName + ", " + "pushEventText = " + local_pushEventText + ", " + "query = " + local_query + ", " + "clusters = " + local_clusters + ", " + "workunits = " + local_workunits + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUShowScheduledResponse();
        raw.setClusterSelected( local_clusterSelected);
        raw.setEventName( local_eventName);
        raw.setPushEventName( local_pushEventName);
        raw.setPushEventText( local_pushEventText);
        raw.setQuery( local_query);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setClusterSelected( int _clusterSelected )
    {
        this.local_clusterSelected = _clusterSelected;
    }
    public int getClusterSelected( )
    {
        return this.local_clusterSelected;
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
    public void setQuery( String _query )
    {
        this.local_query = _query;
    }
    public String getQuery( )
    {
        return this.local_query;
    }
    public void setClusters( ArrayOfServerInfoWrapper _clusters )
    {
        this.local_clusters = _clusters;
    }
    public ArrayOfServerInfoWrapper getClusters( )
    {
        return this.local_clusters;
    }
    public void setWorkunits( ArrayOfScheduledWUWrapper _workunits )
    {
        this.local_workunits = _workunits;
    }
    public ArrayOfScheduledWUWrapper getWorkunits( )
    {
        return this.local_workunits;
    }
}