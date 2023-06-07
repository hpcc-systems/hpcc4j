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
 * Class name: ArrayOfTpTargetClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class ArrayOfTpTargetClusterWrapper
{
    protected List<TpTargetClusterWrapper> local_tpTargetCluster = null;

    public ArrayOfTpTargetClusterWrapper() {}

    public ArrayOfTpTargetClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster arrayoftptargetcluster)
    {
        copy( arrayoftptargetcluster );
    }
    public ArrayOfTpTargetClusterWrapper( List<TpTargetClusterWrapper> _tpTargetCluster )
    {
        this.local_tpTargetCluster = _tpTargetCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getTpTargetCluster() != null)
        {
            this.local_tpTargetCluster = new ArrayList<TpTargetClusterWrapper>();
            for ( int i = 0; i < raw.getTpTargetCluster().length; i++)
            {
                this.local_tpTargetCluster.add(new TpTargetClusterWrapper(raw.getTpTargetCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpTargetClusterWrapper [" + "tpTargetCluster = " + local_tpTargetCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpTargetCluster();
        if (this.local_tpTargetCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster[this.local_tpTargetCluster.size()];
            for ( int i = 0; i < this.local_tpTargetCluster.size(); i++)
            {
                arr[i] = this.local_tpTargetCluster.get(i) .getRaw();
            }
            raw.setTpTargetCluster(arr);
        }
        return raw;
    }


    public void setTpTargetCluster( List<TpTargetClusterWrapper> _tpTargetCluster )
    {
        this.local_tpTargetCluster = _tpTargetCluster;
    }
    public List<TpTargetClusterWrapper> getTpTargetCluster( )
    {
        return this.local_tpTargetCluster;
    }
}