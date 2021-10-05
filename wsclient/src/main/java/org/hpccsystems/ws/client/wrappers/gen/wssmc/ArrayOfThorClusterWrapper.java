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
 * Class name: ArrayOfThorClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-10-27T20:17:20.572Z
 */
public class ArrayOfThorClusterWrapper
{
    protected List<ThorClusterWrapper> local_thorCluster = null;

    public ArrayOfThorClusterWrapper() {}

    public ArrayOfThorClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster arrayofthorcluster)
    {
        copy( arrayofthorcluster );
    }
    public ArrayOfThorClusterWrapper( List<ThorClusterWrapper> _thorCluster )
    {
        this.local_thorCluster = _thorCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getThorCluster() != null)
        {
            this.local_thorCluster = new ArrayList<ThorClusterWrapper>();
            for ( int i = 0; i < raw.getThorCluster().length; i++)
            {
                this.local_thorCluster.add(new ThorClusterWrapper(raw.getThorCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfThorClusterWrapper [" + "thorCluster = " + local_thorCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ArrayOfThorCluster();
        if (this.local_thorCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ThorCluster[this.local_thorCluster.size()];
            for ( int i = 0; i < this.local_thorCluster.size(); i++)
            {
                arr[i] = this.local_thorCluster.get(i) .getRaw();
            }
            raw.setThorCluster(arr);
        }
        return raw;
    }


    public void setThorCluster( List<ThorClusterWrapper> _thorCluster )
    {
        this.local_thorCluster = _thorCluster;
    }
    public List<ThorClusterWrapper> getThorCluster( )
    {
        return this.local_thorCluster;
    }
}