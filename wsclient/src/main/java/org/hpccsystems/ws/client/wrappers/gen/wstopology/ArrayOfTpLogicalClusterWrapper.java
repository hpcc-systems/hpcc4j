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
 * WrapperMaker version: 1.7
 * Class name: ArrayOfTpLogicalClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class ArrayOfTpLogicalClusterWrapper
{
    protected List<TpLogicalClusterWrapper> local_tpLogicalCluster = null;

    public ArrayOfTpLogicalClusterWrapper() {}

    public ArrayOfTpLogicalClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster arrayoftplogicalcluster)
    {
        copy( arrayoftplogicalcluster );
    }
    public ArrayOfTpLogicalClusterWrapper( List<TpLogicalClusterWrapper> _tpLogicalCluster )
    {
        this.local_tpLogicalCluster = _tpLogicalCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getTpLogicalCluster() != null)
        {
            this.local_tpLogicalCluster = new ArrayList<TpLogicalClusterWrapper>();
            for ( int i = 0; i < raw.getTpLogicalCluster().length; i++)
            {
                this.local_tpLogicalCluster.add(new TpLogicalClusterWrapper(raw.getTpLogicalCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTpLogicalClusterWrapper [" + "tpLogicalCluster = " + local_tpLogicalCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.ArrayOfTpLogicalCluster();
        if (this.local_tpLogicalCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogicalCluster[this.local_tpLogicalCluster.size()];
            for ( int i = 0; i < this.local_tpLogicalCluster.size(); i++)
            {
                arr[i] = this.local_tpLogicalCluster.get(i) .getRaw();
            }
            raw.setTpLogicalCluster(arr);
        }
        return raw;
    }


    public void setTpLogicalCluster( List<TpLogicalClusterWrapper> _tpLogicalCluster )
    {
        this.local_tpLogicalCluster = _tpLogicalCluster;
    }
    public List<TpLogicalClusterWrapper> getTpLogicalCluster( )
    {
        return this.local_tpLogicalCluster;
    }
}