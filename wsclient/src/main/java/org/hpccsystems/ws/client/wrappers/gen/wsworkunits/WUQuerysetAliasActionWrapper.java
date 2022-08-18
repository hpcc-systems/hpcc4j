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
 * Class name: WUQuerysetAliasActionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.971Z
 */
public class WUQuerysetAliasActionWrapper
{
    protected QuerySetAliasActionTypesWrapper local_action;
    protected String local_querySetName;
    protected Aliases_type0Wrapper local_aliases;

    public WUQuerysetAliasActionWrapper() {}

    public WUQuerysetAliasActionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction wuquerysetaliasaction)
    {
        copy( wuquerysetaliasaction );
    }
    public WUQuerysetAliasActionWrapper( QuerySetAliasActionTypesWrapper _action, String _querySetName, Aliases_type0Wrapper _aliases )
    {
        this.local_action = _action;
        this.local_querySetName = _querySetName;
        this.local_aliases = _aliases;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction raw )
    {
        if (raw == null)
            return;

        if (raw.getAction() != null)
            this.local_action = new QuerySetAliasActionTypesWrapper( raw.getAction());
        this.local_querySetName = raw.getQuerySetName();
        if (raw.getAliases() != null)
            this.local_aliases = new Aliases_type0Wrapper( raw.getAliases());

    }

    @Override
    public String toString()
    {
        return "WUQuerysetAliasActionWrapper [" + "action = " + local_action + ", " + "querySetName = " + local_querySetName + ", " + "aliases = " + local_aliases + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetAliasAction();
        raw.setQuerySetName( local_querySetName);
        return raw;
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
    public void setAliases( Aliases_type0Wrapper _aliases )
    {
        this.local_aliases = _aliases;
    }
    public Aliases_type0Wrapper getAliases( )
    {
        return this.local_aliases;
    }
}