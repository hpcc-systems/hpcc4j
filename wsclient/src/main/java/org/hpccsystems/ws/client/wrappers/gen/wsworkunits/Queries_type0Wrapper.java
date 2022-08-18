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
 * Class name: Queries_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.848Z
 */
public class Queries_type0Wrapper
{
    protected List<QueryFilesUsedWrapper> local_query = null;

    public Queries_type0Wrapper() {}

    public Queries_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0 queries_type0)
    {
        copy( queries_type0 );
    }
    public Queries_type0Wrapper( List<QueryFilesUsedWrapper> _query )
    {
        this.local_query = _query;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getQuery() != null)
        {
            this.local_query = new ArrayList<QueryFilesUsedWrapper>();
            for ( int i = 0; i < raw.getQuery().length; i++)
            {
                this.local_query.add(new QueryFilesUsedWrapper(raw.getQuery()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Queries_type0Wrapper [" + "query = " + local_query + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Queries_type0();
        if (this.local_query!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed[this.local_query.size()];
            for ( int i = 0; i < this.local_query.size(); i++)
            {
                arr[i] = this.local_query.get(i) .getRaw();
            }
            raw.setQuery(arr);
        }
        return raw;
    }


    public void setQuery( List<QueryFilesUsedWrapper> _query )
    {
        this.local_query = _query;
    }
    public List<QueryFilesUsedWrapper> getQuery( )
    {
        return this.local_query;
    }
}