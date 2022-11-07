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
 * Class name: WUQuerySetDetailWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.974Z
 */
public class WUQuerySetDetailWrapper
{
    protected String local_querySetName;
    protected ArrayOfQuerySetQueryWrapper local_queries;
    protected ArrayOfQuerySetAliasWrapper local_aliases;

    public WUQuerySetDetailWrapper() {}

    public WUQuerySetDetailWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail wuquerysetdetail)
    {
        copy( wuquerysetdetail );
    }
    public WUQuerySetDetailWrapper( String _querySetName, ArrayOfQuerySetQueryWrapper _queries, ArrayOfQuerySetAliasWrapper _aliases )
    {
        this.local_querySetName = _querySetName;
        this.local_queries = _queries;
        this.local_aliases = _aliases;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail raw )
    {
        if (raw == null)
            return;

        this.local_querySetName = raw.getQuerySetName();
        if (raw.getQueries() != null)
            this.local_queries = new ArrayOfQuerySetQueryWrapper( raw.getQueries());
        if (raw.getAliases() != null)
            this.local_aliases = new ArrayOfQuerySetAliasWrapper( raw.getAliases());

    }

    @Override
    public String toString()
    {
        return "WUQuerySetDetailWrapper [" + "querySetName = " + local_querySetName + ", " + "queries = " + local_queries + ", " + "aliases = " + local_aliases + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetDetail();
        raw.setQuerySetName( local_querySetName);
        return raw;
    }


    public void setQuerySetName( String _querySetName )
    {
        this.local_querySetName = _querySetName;
    }
    public String getQuerySetName( )
    {
        return this.local_querySetName;
    }
    public void setQueries( ArrayOfQuerySetQueryWrapper _queries )
    {
        this.local_queries = _queries;
    }
    public ArrayOfQuerySetQueryWrapper getQueries( )
    {
        return this.local_queries;
    }
    public void setAliases( ArrayOfQuerySetAliasWrapper _aliases )
    {
        this.local_aliases = _aliases;
    }
    public ArrayOfQuerySetAliasWrapper getAliases( )
    {
        return this.local_aliases;
    }
}