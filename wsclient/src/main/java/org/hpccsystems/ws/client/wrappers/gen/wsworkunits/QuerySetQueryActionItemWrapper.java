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
 * Class name: QuerySetQueryActionItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.486Z
 */
public class QuerySetQueryActionItemWrapper
{
    protected String local_queryId;
    protected QuerySetQueryClientStateWrapper local_clientState;

    public QuerySetQueryActionItemWrapper() {}

    public QuerySetQueryActionItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem querysetqueryactionitem)
    {
        copy( querysetqueryactionitem );
    }
    public QuerySetQueryActionItemWrapper( String _queryId, QuerySetQueryClientStateWrapper _clientState )
    {
        this.local_queryId = _queryId;
        this.local_clientState = _clientState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem raw )
    {
        if (raw == null)
            return;

        this.local_queryId = raw.getQueryId();
        if (raw.getClientState() != null)
            this.local_clientState = new QuerySetQueryClientStateWrapper( raw.getClientState());

    }

    @Override
    public String toString()
    {
        return "QuerySetQueryActionItemWrapper [" + "queryId = " + local_queryId + ", " + "clientState = " + local_clientState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionItem();
        raw.setQueryId( local_queryId);
        if (local_clientState != null)
            raw.setClientState( local_clientState.getRaw());
        return raw;
    }


    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setClientState( QuerySetQueryClientStateWrapper _clientState )
    {
        this.local_clientState = _clientState;
    }
    public QuerySetQueryClientStateWrapper getClientState( )
    {
        return this.local_clientState;
    }
}