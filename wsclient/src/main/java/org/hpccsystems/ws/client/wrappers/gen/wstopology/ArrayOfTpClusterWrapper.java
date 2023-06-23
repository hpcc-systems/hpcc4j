package org.hpccsystems.ws.client.wrappers.gen.wstopology;

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
 * Class name: ArrayOfTpClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class ArrayOfTpClusterWrapper
{
    protected List<TpClusterWrapper> local_tpCluster = null;

    public ArrayOfTpClusterWrapper() {}

    public ArrayOfTpClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster arrayoftpcluster)
    {
        copy( arrayoftpcluster );
    }
    public ArrayOfTpClusterWrapper( List<TpClusterWrapper> _tpCluster )
    {
        this.local_tpCluster = _tpCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getTpCluster() != null)
        {
            this.local_tpCluster = new ArrayList<TpClusterWrapper>();
            for ( int i = 0; i < raw.getTpCluster().length; i++)
            {
                this.local_tpCluster.add(new TpClusterWrapper(raw.getTpCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpClusterWrapper [" + "tpCluster = " + local_tpCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpCluster();
        if (this.local_tpCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpCluster[this.local_tpCluster.size()];
            for ( int i = 0; i < this.local_tpCluster.size(); i++)
            {
                arr[i] = this.local_tpCluster.get(i) .getRaw();
            }
            raw.setTpCluster(arr);
        }
        return raw;
    }


    public void setTpCluster( List<TpClusterWrapper> _tpCluster )
    {
        this.local_tpCluster = _tpCluster;
    }
    public List<TpClusterWrapper> getTpCluster( )
    {
        return this.local_tpCluster;
    }
}