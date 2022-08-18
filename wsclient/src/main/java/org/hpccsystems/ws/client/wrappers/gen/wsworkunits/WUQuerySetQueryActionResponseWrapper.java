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
 * Class name: WUQuerySetQueryActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.979Z
 */
public class WUQuerySetQueryActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected QuerySetQueryActionTypesWrapper local_action;
    protected String local_querySetName;
    protected Results_type0Wrapper local_results;

    public WUQuerySetQueryActionResponseWrapper() {}

    public WUQuerySetQueryActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse wuquerysetqueryactionresponse)
    {
        copy( wuquerysetqueryactionresponse );
    }
    public WUQuerySetQueryActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, QuerySetQueryActionTypesWrapper _action, String _querySetName, Results_type0Wrapper _results )
    {
        this.local_exceptions = _exceptions;
        this.local_action = _action;
        this.local_querySetName = _querySetName;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getAction() != null)
            this.local_action = new QuerySetQueryActionTypesWrapper( raw.getAction());
        this.local_querySetName = raw.getQuerySetName();
        if (raw.getResults() != null)
            this.local_results = new Results_type0Wrapper( raw.getResults());

    }

    @Override
    public String toString()
    {
        return "WUQuerySetQueryActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "action = " + local_action + ", " + "querySetName = " + local_querySetName + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetQueryActionResponse();
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
    public void setResults( Results_type0Wrapper _results )
    {
        this.local_results = _results;
    }
    public Results_type0Wrapper getResults( )
    {
        return this.local_results;
    }
}