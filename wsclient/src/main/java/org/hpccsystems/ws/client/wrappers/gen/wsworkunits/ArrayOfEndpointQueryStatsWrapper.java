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
 * Class name: ArrayOfEndpointQueryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.784Z
 */
public class ArrayOfEndpointQueryStatsWrapper
{
    protected List<EndpointQueryStatsWrapper> local_endpointQueryStats = null;

    public ArrayOfEndpointQueryStatsWrapper() {}

    public ArrayOfEndpointQueryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats arrayofendpointquerystats)
    {
        copy( arrayofendpointquerystats );
    }
    public ArrayOfEndpointQueryStatsWrapper( List<EndpointQueryStatsWrapper> _endpointQueryStats )
    {
        this.local_endpointQueryStats = _endpointQueryStats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats raw )
    {
        if (raw == null)
            return;

        if (raw.getEndpointQueryStats() != null)
        {
            this.local_endpointQueryStats = new ArrayList<EndpointQueryStatsWrapper>();
            for ( int i = 0; i < raw.getEndpointQueryStats().length; i++)
            {
                this.local_endpointQueryStats.add(new EndpointQueryStatsWrapper(raw.getEndpointQueryStats()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfEndpointQueryStatsWrapper [" + "endpointQueryStats = " + local_endpointQueryStats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfEndpointQueryStats();
        if (this.local_endpointQueryStats!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EndpointQueryStats[this.local_endpointQueryStats.size()];
            for ( int i = 0; i < this.local_endpointQueryStats.size(); i++)
            {
                arr[i] = this.local_endpointQueryStats.get(i) .getRaw();
            }
            raw.setEndpointQueryStats(arr);
        }
        return raw;
    }


    public void setEndpointQueryStats( List<EndpointQueryStatsWrapper> _endpointQueryStats )
    {
        this.local_endpointQueryStats = _endpointQueryStats;
    }
    public List<EndpointQueryStatsWrapper> getEndpointQueryStats( )
    {
        return this.local_endpointQueryStats;
    }
}