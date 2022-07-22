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
 * Class name: ClusterFiles_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.798Z
 */
public class ClusterFiles_type0Wrapper
{
    protected List<WUCopyLogicalClusterFileSectionsWrapper> local_cluster = null;

    public ClusterFiles_type0Wrapper() {}

    public ClusterFiles_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0 clusterfiles_type0)
    {
        copy( clusterfiles_type0 );
    }
    public ClusterFiles_type0Wrapper( List<WUCopyLogicalClusterFileSectionsWrapper> _cluster )
    {
        this.local_cluster = _cluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getCluster() != null)
        {
            this.local_cluster = new ArrayList<WUCopyLogicalClusterFileSectionsWrapper>();
            for ( int i = 0; i < raw.getCluster().length; i++)
            {
                this.local_cluster.add(new WUCopyLogicalClusterFileSectionsWrapper(raw.getCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ClusterFiles_type0Wrapper [" + "cluster = " + local_cluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterFiles_type0();
        if (this.local_cluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections[this.local_cluster.size()];
            for ( int i = 0; i < this.local_cluster.size(); i++)
            {
                arr[i] = this.local_cluster.get(i) .getRaw();
            }
            raw.setCluster(arr);
        }
        return raw;
    }


    public void setCluster( List<WUCopyLogicalClusterFileSectionsWrapper> _cluster )
    {
        this.local_cluster = _cluster;
    }
    public List<WUCopyLogicalClusterFileSectionsWrapper> getCluster( )
    {
        return this.local_cluster;
    }
}