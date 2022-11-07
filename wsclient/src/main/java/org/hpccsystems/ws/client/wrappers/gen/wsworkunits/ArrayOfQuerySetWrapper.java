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
 * Class name: ArrayOfQuerySetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.787Z
 */
public class ArrayOfQuerySetWrapper
{
    protected List<QuerySetWrapper> local_querySet = null;

    public ArrayOfQuerySetWrapper() {}

    public ArrayOfQuerySetWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet arrayofqueryset)
    {
        copy( arrayofqueryset );
    }
    public ArrayOfQuerySetWrapper( List<QuerySetWrapper> _querySet )
    {
        this.local_querySet = _querySet;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet raw )
    {
        if (raw == null)
            return;

        if (raw.getQuerySet() != null)
        {
            this.local_querySet = new ArrayList<QuerySetWrapper>();
            for ( int i = 0; i < raw.getQuerySet().length; i++)
            {
                this.local_querySet.add(new QuerySetWrapper(raw.getQuerySet()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQuerySetWrapper [" + "querySet = " + local_querySet + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySet();
        if (this.local_querySet!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySet[this.local_querySet.size()];
            for ( int i = 0; i < this.local_querySet.size(); i++)
            {
                arr[i] = this.local_querySet.get(i) .getRaw();
            }
            raw.setQuerySet(arr);
        }
        return raw;
    }


    public void setQuerySet( List<QuerySetWrapper> _querySet )
    {
        this.local_querySet = _querySet;
    }
    public List<QuerySetWrapper> getQuerySet( )
    {
        return this.local_querySet;
    }
}