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
 * Class name: ArrayOfECLGraphWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.776Z
 */
public class ArrayOfECLGraphWrapper
{
    protected List<ECLGraphWrapper> local_eCLGraph = null;

    public ArrayOfECLGraphWrapper() {}

    public ArrayOfECLGraphWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph arrayofeclgraph)
    {
        copy( arrayofeclgraph );
    }
    public ArrayOfECLGraphWrapper( List<ECLGraphWrapper> _eCLGraph )
    {
        this.local_eCLGraph = _eCLGraph;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph raw )
    {
        if (raw == null)
            return;

        if (raw.getECLGraph() != null)
        {
            this.local_eCLGraph = new ArrayList<ECLGraphWrapper>();
            for ( int i = 0; i < raw.getECLGraph().length; i++)
            {
                this.local_eCLGraph.add(new ECLGraphWrapper(raw.getECLGraph()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLGraphWrapper [" + "eCLGraph = " + local_eCLGraph + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfECLGraph();
        if (this.local_eCLGraph!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph[this.local_eCLGraph.size()];
            for ( int i = 0; i < this.local_eCLGraph.size(); i++)
            {
                arr[i] = this.local_eCLGraph.get(i) .getRaw();
            }
            raw.setECLGraph(arr);
        }
        return raw;
    }


    public void setECLGraph( List<ECLGraphWrapper> _eCLGraph )
    {
        this.local_eCLGraph = _eCLGraph;
    }
    public List<ECLGraphWrapper> getECLGraph( )
    {
        return this.local_eCLGraph;
    }
}