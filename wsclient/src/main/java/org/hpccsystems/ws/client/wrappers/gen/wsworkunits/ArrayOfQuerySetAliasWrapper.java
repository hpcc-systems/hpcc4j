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
 * Class name: ArrayOfQuerySetAliasWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.787Z
 */
public class ArrayOfQuerySetAliasWrapper
{
    protected List<QuerySetAliasWrapper> local_querySetAlias = null;

    public ArrayOfQuerySetAliasWrapper() {}

    public ArrayOfQuerySetAliasWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias arrayofquerysetalias)
    {
        copy( arrayofquerysetalias );
    }
    public ArrayOfQuerySetAliasWrapper( List<QuerySetAliasWrapper> _querySetAlias )
    {
        this.local_querySetAlias = _querySetAlias;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias raw )
    {
        if (raw == null)
            return;

        if (raw.getQuerySetAlias() != null)
        {
            this.local_querySetAlias = new ArrayList<QuerySetAliasWrapper>();
            for ( int i = 0; i < raw.getQuerySetAlias().length; i++)
            {
                this.local_querySetAlias.add(new QuerySetAliasWrapper(raw.getQuerySetAlias()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQuerySetAliasWrapper [" + "querySetAlias = " + local_querySetAlias + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetAlias();
        if (this.local_querySetAlias!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAlias[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAlias[this.local_querySetAlias.size()];
            for ( int i = 0; i < this.local_querySetAlias.size(); i++)
            {
                arr[i] = this.local_querySetAlias.get(i) .getRaw();
            }
            raw.setQuerySetAlias(arr);
        }
        return raw;
    }


    public void setQuerySetAlias( List<QuerySetAliasWrapper> _querySetAlias )
    {
        this.local_querySetAlias = _querySetAlias;
    }
    public List<QuerySetAliasWrapper> getQuerySetAlias( )
    {
        return this.local_querySetAlias;
    }
}