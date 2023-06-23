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
 * Class name: ArrayOfTargetClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class ArrayOfTargetClusterWrapper
{
    protected List<TargetClusterWrapper> local_targetCluster = null;

    public ArrayOfTargetClusterWrapper() {}

    public ArrayOfTargetClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster arrayoftargetcluster)
    {
        copy( arrayoftargetcluster );
    }
    public ArrayOfTargetClusterWrapper( List<TargetClusterWrapper> _targetCluster )
    {
        this.local_targetCluster = _targetCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getTargetCluster() != null)
        {
            this.local_targetCluster = new ArrayList<TargetClusterWrapper>();
            for ( int i = 0; i < raw.getTargetCluster().length; i++)
            {
                this.local_targetCluster.add(new TargetClusterWrapper(raw.getTargetCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfTargetClusterWrapper [" + "targetCluster = " + local_targetCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfTargetCluster();
        if (this.local_targetCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.TargetCluster[this.local_targetCluster.size()];
            for ( int i = 0; i < this.local_targetCluster.size(); i++)
            {
                arr[i] = this.local_targetCluster.get(i) .getRaw();
            }
            raw.setTargetCluster(arr);
        }
        return raw;
    }


    public void setTargetCluster( List<TargetClusterWrapper> _targetCluster )
    {
        this.local_targetCluster = _targetCluster;
    }
    public List<TargetClusterWrapper> getTargetCluster( )
    {
        return this.local_targetCluster;
    }
}