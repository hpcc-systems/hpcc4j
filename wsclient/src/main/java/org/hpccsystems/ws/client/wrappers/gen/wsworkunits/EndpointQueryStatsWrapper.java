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
 * Class name: EndpointQueryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.462Z
 */
public class EndpointQueryStatsWrapper
{
    protected String local_endpoint;
    protected String local_status;
    protected ArrayOfQueryStatsWrapper local_queryStatsList;

    public EndpointQueryStatsWrapper() {}

    public EndpointQueryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats endpointquerystats)
    {
        copy( endpointquerystats );
    }
    public EndpointQueryStatsWrapper( String _endpoint, String _status, ArrayOfQueryStatsWrapper _queryStatsList )
    {
        this.local_endpoint = _endpoint;
        this.local_status = _status;
        this.local_queryStatsList = _queryStatsList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats raw )
    {
        if (raw == null)
            return;

        this.local_endpoint = raw.getEndpoint();
        this.local_status = raw.getStatus();
        if (raw.getQueryStatsList() != null)
            this.local_queryStatsList = new ArrayOfQueryStatsWrapper( raw.getQueryStatsList());

    }

    @Override
    public String toString()
    {
        return "EndpointQueryStatsWrapper [" + "endpoint = " + local_endpoint + ", " + "status = " + local_status + ", " + "queryStatsList = " + local_queryStatsList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats();
        raw.setEndpoint( local_endpoint);
        raw.setStatus( local_status);
        if (local_queryStatsList != null)
            raw.setQueryStatsList( local_queryStatsList.getRaw());
        return raw;
    }


    public void setEndpoint( String _endpoint )
    {
        this.local_endpoint = _endpoint;
    }
    public String getEndpoint( )
    {
        return this.local_endpoint;
    }
    public void setStatus( String _status )
    {
        this.local_status = _status;
    }
    public String getStatus( )
    {
        return this.local_status;
    }
    public void setQueryStatsList( ArrayOfQueryStatsWrapper _queryStatsList )
    {
        this.local_queryStatsList = _queryStatsList;
    }
    public ArrayOfQueryStatsWrapper getQueryStatsList( )
    {
        return this.local_queryStatsList;
    }
}