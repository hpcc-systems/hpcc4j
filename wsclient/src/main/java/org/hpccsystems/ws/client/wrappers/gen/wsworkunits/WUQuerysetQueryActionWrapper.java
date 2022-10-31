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
 * Class name: WUQuerysetQueryActionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.593Z
 */
public class WUQuerysetQueryActionWrapper
{
    protected QuerySetQueryActionTypesWrapper local_action;
    protected String local_querySetName;
    protected Queries_type1Wrapper local_queries;

    public WUQuerysetQueryActionWrapper() {}

    public WUQuerysetQueryActionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction wuquerysetqueryaction)
    {
        copy( wuquerysetqueryaction );
    }
    public WUQuerysetQueryActionWrapper( QuerySetQueryActionTypesWrapper _action, String _querySetName, Queries_type1Wrapper _queries )
    {
        this.local_action = _action;
        this.local_querySetName = _querySetName;
        this.local_queries = _queries;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction raw )
    {
        if (raw == null)
            return;

        if (raw.getAction() != null)
            this.local_action = new QuerySetQueryActionTypesWrapper( raw.getAction());
        this.local_querySetName = raw.getQuerySetName();
        if (raw.getQueries() != null)
            this.local_queries = new Queries_type1Wrapper( raw.getQueries());

    }

    @Override
    public String toString()
    {
        return "WUQuerysetQueryActionWrapper [" + "action = " + local_action + ", " + "querySetName = " + local_querySetName + ", " + "queries = " + local_queries + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetQueryAction();
        if (local_action != null)
            raw.setAction( local_action.getRaw());
        raw.setQuerySetName( local_querySetName);
        if (local_queries != null)
            raw.setQueries( local_queries.getRaw());
        return raw;
    }


    public void setAction( QuerySetQueryActionTypesWrapper _action )
    {
        this.local_action = _action;
    }
    public QuerySetQueryActionTypesWrapper getAction( )
    {
        return this.local_action;
    }
    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
    public void setQueries( Queries_type1Wrapper _queries )
    {
        this.local_queries = _queries;
    }
    public Queries_type1Wrapper getQueries( )
    {
        return this.local_queries;
    }
}