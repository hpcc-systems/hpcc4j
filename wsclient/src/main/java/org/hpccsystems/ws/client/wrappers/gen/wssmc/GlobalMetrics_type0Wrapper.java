package org.hpccsystems.ws.client.wrappers.gen.wssmc;

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
 * Class name: GlobalMetrics_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GlobalMetrics_type0Wrapper
{
    protected List<GlobalMetricWrapper> local_globalMetric = null;

    public GlobalMetrics_type0Wrapper() {}

    public GlobalMetrics_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0 globalmetrics_type0)
    {
        copy( globalmetrics_type0 );
    }
    public GlobalMetrics_type0Wrapper( List<GlobalMetricWrapper> _globalMetric )
    {
        this.local_globalMetric = _globalMetric;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getGlobalMetric() != null)
        {
            this.local_globalMetric = new ArrayList<GlobalMetricWrapper>();
            for ( int i = 0; i < raw.getGlobalMetric().length; i++)
            {
                this.local_globalMetric.add(new GlobalMetricWrapper(raw.getGlobalMetric()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "GlobalMetrics_type0Wrapper [" + "globalMetric = " + local_globalMetric + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetrics_type0();
        if (this.local_globalMetric!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GlobalMetric[this.local_globalMetric.size()];
            for ( int i = 0; i < this.local_globalMetric.size(); i++)
            {
                arr[i] = this.local_globalMetric.get(i) .getRaw();
            }
            raw.setGlobalMetric(arr);
        }
        return raw;
    }


    public void setGlobalMetric( List<GlobalMetricWrapper> _globalMetric )
    {
        this.local_globalMetric = _globalMetric;
    }
    public List<GlobalMetricWrapper> getGlobalMetric( )
    {
        return this.local_globalMetric;
    }
}