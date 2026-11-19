package org.hpccsystems.ws.client.wrappers.gen.wssql;

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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class Graphs_type0Wrapper
{
    protected List<String> local_graph = null;

    public Graphs_type0Wrapper() {}

    public Graphs_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0 graphs_type0)
    {
        copy( graphs_type0 );
    }
    public Graphs_type0Wrapper( List<String> _graph )
    {
        this.local_graph = _graph;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getGraph() != null)
        {
            this.local_graph = new ArrayList<String>();
            for ( int i = 0; i < raw.getGraph().length; i++)
            {
                this.local_graph.add(new String(raw.getGraph()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Graphs_type0Wrapper [" + "graph = " + local_graph + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.Graphs_type0();
        if (this.local_graph!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_graph.size()];
            for ( int i = 0; i < this.local_graph.size(); i++)
            {
                arr[i] = this.local_graph.get(i) ;
            }
            raw.setGraph(arr);
        }
        return raw;
    }


    public void setGraph( List<String> _graph )
    {
        this.local_graph = _graph;
    }
    public List<String> getGraph( )
    {
        return this.local_graph;
    }
}