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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: Aliases_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.765Z
 */
public class Aliases_type0Wrapper
{
    protected List<QuerySetAliasActionItemWrapper> local_alias = null;

    public Aliases_type0Wrapper() {}

    public Aliases_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0 aliases_type0)
    {
        copy( aliases_type0 );
    }
    public Aliases_type0Wrapper( List<QuerySetAliasActionItemWrapper> _alias )
    {
        this.local_alias = _alias;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getAlias() != null)
        {
            this.local_alias = new ArrayList<QuerySetAliasActionItemWrapper>();
            for ( int i = 0; i < raw.getAlias().length; i++)
            {
                this.local_alias.add(new QuerySetAliasActionItemWrapper(raw.getAlias()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Aliases_type0Wrapper [" + "alias = " + local_alias + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Aliases_type0();
        if (this.local_alias!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionItem[this.local_alias.size()];
            for ( int i = 0; i < this.local_alias.size(); i++)
            {
                arr[i] = this.local_alias.get(i) .getRaw();
            }
            raw.setAlias(arr);
        }
        return raw;
    }


    public void setAlias( List<QuerySetAliasActionItemWrapper> _alias )
    {
        this.local_alias = _alias;
    }
    public List<QuerySetAliasActionItemWrapper> getAlias( )
    {
        return this.local_alias;
    }
}