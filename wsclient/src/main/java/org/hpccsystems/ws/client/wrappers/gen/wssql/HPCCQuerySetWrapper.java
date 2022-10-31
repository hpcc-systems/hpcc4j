package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: HPCCQuerySetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.397Z
 */
public class HPCCQuerySetWrapper
{
    protected String local_name;
    protected QuerySetQueries_type0Wrapper local_querySetQueries;
    protected QuerySetAliases_type0Wrapper local_querySetAliases;

    public HPCCQuerySetWrapper() {}

    public HPCCQuerySetWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet hpccqueryset)
    {
        copy( hpccqueryset );
    }
    public HPCCQuerySetWrapper( String _name, QuerySetQueries_type0Wrapper _querySetQueries, QuerySetAliases_type0Wrapper _querySetAliases )
    {
        this.local_name = _name;
        this.local_querySetQueries = _querySetQueries;
        this.local_querySetAliases = _querySetAliases;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getQuerySetQueries() != null)
            this.local_querySetQueries = new QuerySetQueries_type0Wrapper( raw.getQuerySetQueries());
        if (raw.getQuerySetAliases() != null)
            this.local_querySetAliases = new QuerySetAliases_type0Wrapper( raw.getQuerySetAliases());

    }

    @Override
    public String toString()
    {
        return "HPCCQuerySetWrapper [" + "name = " + local_name + ", " + "querySetQueries = " + local_querySetQueries + ", " + "querySetAliases = " + local_querySetAliases + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCQuerySet();
        raw.setName( local_name);
        if (local_querySetQueries != null)
            raw.setQuerySetQueries( local_querySetQueries.getRaw());
        if (local_querySetAliases != null)
            raw.setQuerySetAliases( local_querySetAliases.getRaw());
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setQuerySetQueries( QuerySetQueries_type0Wrapper _querySetQueries )
    {
        this.local_querySetQueries = _querySetQueries;
    }
    public QuerySetQueries_type0Wrapper getQuerySetQueries( )
    {
        return this.local_querySetQueries;
    }
    public void setQuerySetAliases( QuerySetAliases_type0Wrapper _querySetAliases )
    {
        this.local_querySetAliases = _querySetAliases;
    }
    public QuerySetAliases_type0Wrapper getQuerySetAliases( )
    {
        return this.local_querySetAliases;
    }
}