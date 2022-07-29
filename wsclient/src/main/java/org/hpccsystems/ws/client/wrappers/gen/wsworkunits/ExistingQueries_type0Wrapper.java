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
 * Class name: ExistingQueries_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.827Z
 */
public class ExistingQueries_type0Wrapper
{
    protected List<String> local_queryId = null;

    public ExistingQueries_type0Wrapper() {}

    public ExistingQueries_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0 existingqueries_type0)
    {
        copy( existingqueries_type0 );
    }
    public ExistingQueries_type0Wrapper( List<String> _queryId )
    {
        this.local_queryId = _queryId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getQueryId() != null)
        {
            this.local_queryId = new ArrayList<String>();
            for ( int i = 0; i < raw.getQueryId().length; i++)
            {
                this.local_queryId.add(new String(raw.getQueryId()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ExistingQueries_type0Wrapper [" + "queryId = " + local_queryId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ExistingQueries_type0();
        if (this.local_queryId!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_queryId.size()];
            for ( int i = 0; i < this.local_queryId.size(); i++)
            {
                arr[i] = this.local_queryId.get(i) ;
            }
            raw.setQueryId(arr);
        }
        return raw;
    }


    public void setQueryId( List<String> _queryId )
    {
        this.local_queryId = _queryId;
    }
    public List<String> getQueryId( )
    {
        return this.local_queryId;
    }
}