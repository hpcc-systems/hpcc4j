package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: Graphs_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.159Z
 */
public class Graphs_type0Wrapper
{
    protected List<String> local_eCLGraph = null;

    public Graphs_type0Wrapper() {}

    public Graphs_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 graphs_type0)
    {
        copy( graphs_type0 );
    }
    public Graphs_type0Wrapper( List<String> _eCLGraph )
    {
        this.local_eCLGraph = _eCLGraph;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getECLGraph() != null)
        {
            this.local_eCLGraph = new ArrayList<String>();
            for ( int i = 0; i < raw.getECLGraph().length; i++)
            {
                this.local_eCLGraph.add(new String(raw.getECLGraph()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Graphs_type0Wrapper [" + "eCLGraph = " + local_eCLGraph + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.Graphs_type0();
        if (this.local_eCLGraph!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_eCLGraph.size()];
            for ( int i = 0; i < this.local_eCLGraph.size(); i++)
            {
                arr[i] = this.local_eCLGraph.get(i) ;
            }
            raw.setECLGraph(arr);
        }
        return raw;
    }


    public void setECLGraph( List<String> _eCLGraph )
    {
        this.local_eCLGraph = _eCLGraph;
    }
    public List<String> getECLGraph( )
    {
        return this.local_eCLGraph;
    }
}