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
 * Class name: ArrayOfClusterQueryStateWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.774Z
 */
public class ArrayOfClusterQueryStateWrapper
{
    protected List<ClusterQueryStateWrapper> local_clusterQueryState = null;

    public ArrayOfClusterQueryStateWrapper() {}

    public ArrayOfClusterQueryStateWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState arrayofclusterquerystate)
    {
        copy( arrayofclusterquerystate );
    }
    public ArrayOfClusterQueryStateWrapper( List<ClusterQueryStateWrapper> _clusterQueryState )
    {
        this.local_clusterQueryState = _clusterQueryState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState raw )
    {
        if (raw == null)
            return;

        if (raw.getClusterQueryState() != null)
        {
            this.local_clusterQueryState = new ArrayList<ClusterQueryStateWrapper>();
            for ( int i = 0; i < raw.getClusterQueryState().length; i++)
            {
                this.local_clusterQueryState.add(new ClusterQueryStateWrapper(raw.getClusterQueryState()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfClusterQueryStateWrapper [" + "clusterQueryState = " + local_clusterQueryState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfClusterQueryState();
        if (this.local_clusterQueryState!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ClusterQueryState[this.local_clusterQueryState.size()];
            for ( int i = 0; i < this.local_clusterQueryState.size(); i++)
            {
                arr[i] = this.local_clusterQueryState.get(i) .getRaw();
            }
            raw.setClusterQueryState(arr);
        }
        return raw;
    }


    public void setClusterQueryState( List<ClusterQueryStateWrapper> _clusterQueryState )
    {
        this.local_clusterQueryState = _clusterQueryState;
    }
    public List<ClusterQueryStateWrapper> getClusterQueryState( )
    {
        return this.local_clusterQueryState;
    }
}