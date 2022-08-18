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
 * Class name: ArrayOfQuerySetQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.788Z
 */
public class ArrayOfQuerySetQueryWrapper
{
    protected List<QuerySetQueryWrapper> local_querySetQuery = null;

    public ArrayOfQuerySetQueryWrapper() {}

    public ArrayOfQuerySetQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery arrayofquerysetquery)
    {
        copy( arrayofquerysetquery );
    }
    public ArrayOfQuerySetQueryWrapper( List<QuerySetQueryWrapper> _querySetQuery )
    {
        this.local_querySetQuery = _querySetQuery;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery raw )
    {
        if (raw == null)
            return;

        if (raw.getQuerySetQuery() != null)
        {
            this.local_querySetQuery = new ArrayList<QuerySetQueryWrapper>();
            for ( int i = 0; i < raw.getQuerySetQuery().length; i++)
            {
                this.local_querySetQuery.add(new QuerySetQueryWrapper(raw.getQuerySetQuery()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQuerySetQueryWrapper [" + "querySetQuery = " + local_querySetQuery + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySetQuery();
        if (this.local_querySetQuery!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQuery[this.local_querySetQuery.size()];
            for ( int i = 0; i < this.local_querySetQuery.size(); i++)
            {
                arr[i] = this.local_querySetQuery.get(i) .getRaw();
            }
            raw.setQuerySetQuery(arr);
        }
        return raw;
    }


    public void setQuerySetQuery( List<QuerySetQueryWrapper> _querySetQuery )
    {
        this.local_querySetQuery = _querySetQuery;
    }
    public List<QuerySetQueryWrapper> getQuerySetQuery( )
    {
        return this.local_querySetQuery;
    }
}