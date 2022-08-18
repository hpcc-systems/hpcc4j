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
 * Class name: QuerySetQueryActionTypesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.855Z
 */
public class QuerySetQueryActionTypesWrapper
{
    protected String local_querySetQueryActionTypes;

    public QuerySetQueryActionTypesWrapper() {}

    public QuerySetQueryActionTypesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes querysetqueryactiontypes)
    {
        copy( querysetqueryactiontypes );
    }
    public QuerySetQueryActionTypesWrapper( String _querySetQueryActionTypes )
    {
        this.local_querySetQueryActionTypes = _querySetQueryActionTypes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getQuerySetQueryActionTypes();

    }

    @Override
    public String toString()
    {
        return "QuerySetQueryActionTypesWrapper [" + "querySetQueryActionTypes = " + local_querySetQueryActionTypes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionTypes raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setQuerySetQueryActionTypes(querySetQueryActionTypes);
        return raw;
    }


    public void setQuerySetQueryActionTypes( String _querySetQueryActionTypes )
    {
        this.local_querySetQueryActionTypes = _querySetQueryActionTypes;
    }
    public String getQuerySetQueryActionTypes( )
    {
        return this.local_querySetQueryActionTypes;
    }
}