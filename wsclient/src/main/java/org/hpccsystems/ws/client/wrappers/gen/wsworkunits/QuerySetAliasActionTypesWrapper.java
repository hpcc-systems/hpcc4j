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
 * Class name: QuerySetAliasActionTypesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionTypes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.852Z
 */
public class QuerySetAliasActionTypesWrapper
{
    protected String local_querySetAliasActionTypes;

    public QuerySetAliasActionTypesWrapper() {}

    public QuerySetAliasActionTypesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionTypes querysetaliasactiontypes)
    {
        copy( querysetaliasactiontypes );
    }
    public QuerySetAliasActionTypesWrapper( String _querySetAliasActionTypes )
    {
        this.local_querySetAliasActionTypes = _querySetAliasActionTypes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionTypes raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getQuerySetAliasActionTypes();

    }

    @Override
    public String toString()
    {
        return "QuerySetAliasActionTypesWrapper [" + "querySetAliasActionTypes = " + local_querySetAliasActionTypes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionTypes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionTypes raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setQuerySetAliasActionTypes(querySetAliasActionTypes);
        return raw;
    }


    public void setQuerySetAliasActionTypes( String _querySetAliasActionTypes )
    {
        this.local_querySetAliasActionTypes = _querySetAliasActionTypes;
    }
    public String getQuerySetAliasActionTypes( )
    {
        return this.local_querySetAliasActionTypes;
    }
}