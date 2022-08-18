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
 * Class name: Results_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.862Z
 */
public class Results_type1Wrapper
{
    protected List<QuerySetAliasActionResultWrapper> local_result = null;

    public Results_type1Wrapper() {}

    public Results_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1 results_type1)
    {
        copy( results_type1 );
    }
    public Results_type1Wrapper( List<QuerySetAliasActionResultWrapper> _result )
    {
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1 raw )
    {
        if (raw == null)
            return;

        if (raw.getResult() != null)
        {
            this.local_result = new ArrayList<QuerySetAliasActionResultWrapper>();
            for ( int i = 0; i < raw.getResult().length; i++)
            {
                this.local_result.add(new QuerySetAliasActionResultWrapper(raw.getResult()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Results_type1Wrapper [" + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Results_type1();
        if (this.local_result!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult[this.local_result.size()];
            for ( int i = 0; i < this.local_result.size(); i++)
            {
                arr[i] = this.local_result.get(i) .getRaw();
            }
            raw.setResult(arr);
        }
        return raw;
    }


    public void setResult( List<QuerySetAliasActionResultWrapper> _result )
    {
        this.local_result = _result;
    }
    public List<QuerySetAliasActionResultWrapper> getResult( )
    {
        return this.local_result;
    }
}