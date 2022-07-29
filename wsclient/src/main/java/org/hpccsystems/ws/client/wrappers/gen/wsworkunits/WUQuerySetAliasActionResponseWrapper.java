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
 * Class name: WUQuerySetAliasActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.971Z
 */
public class WUQuerySetAliasActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected QuerySetAliasActionTypesWrapper local_action;
    protected String local_querySetName;
    protected Results_type1Wrapper local_results;

    public WUQuerySetAliasActionResponseWrapper() {}

    public WUQuerySetAliasActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse wuquerysetaliasactionresponse)
    {
        copy( wuquerysetaliasactionresponse );
    }
    public WUQuerySetAliasActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, QuerySetAliasActionTypesWrapper _action, String _querySetName, Results_type1Wrapper _results )
    {
        this.local_exceptions = _exceptions;
        this.local_action = _action;
        this.local_querySetName = _querySetName;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getAction() != null)
            this.local_action = new QuerySetAliasActionTypesWrapper( raw.getAction());
        this.local_querySetName = raw.getQuerySetName();
        if (raw.getResults() != null)
            this.local_results = new Results_type1Wrapper( raw.getResults());

    }

    @Override
    public String toString()
    {
        return "WUQuerySetAliasActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "action = " + local_action + ", " + "querySetName = " + local_querySetName + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetAliasActionResponse();
        raw.setQuerySetName( local_querySetName);
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
    public void setAction( QuerySetAliasActionTypesWrapper _action )
    {
        this.local_action = _action;
    }
    public QuerySetAliasActionTypesWrapper getAction( )
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
    public void setResults( Results_type1Wrapper _results )
    {
        this.local_results = _results;
    }
    public Results_type1Wrapper getResults( )
    {
        return this.local_results;
    }
}