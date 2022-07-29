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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLGraphExWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.804Z
 */
public class ECLGraphExWrapper
{
    protected String local_name;
    protected String local_label;
    protected String local_type;
    protected String local_graph;
    protected boolean local_running;
    protected long local_runningId;
    protected boolean local_complete;
    protected boolean local_failed;

    public ECLGraphExWrapper() {}

    public ECLGraphExWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx eclgraphex)
    {
        copy( eclgraphex );
    }
    public ECLGraphExWrapper( String _name, String _label, String _type, String _graph, boolean _running, long _runningId, boolean _complete, boolean _failed )
    {
        this.local_name = _name;
        this.local_label = _label;
        this.local_type = _type;
        this.local_graph = _graph;
        this.local_running = _running;
        this.local_runningId = _runningId;
        this.local_complete = _complete;
        this.local_failed = _failed;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_label = raw.getLabel();
        this.local_type = raw.getType();
        this.local_graph = raw.getGraph();
        this.local_running = raw.getRunning();
        this.local_runningId = raw.getRunningId();
        this.local_complete = raw.getComplete();
        this.local_failed = raw.getFailed();

    }

    @Override
    public String toString()
    {
        return "ECLGraphExWrapper [" + "name = " + local_name + ", " + "label = " + local_label + ", " + "type = " + local_type + ", " + "graph = " + local_graph + ", " + "running = " + local_running + ", " + "runningId = " + local_runningId + ", " + "complete = " + local_complete + ", " + "failed = " + local_failed + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraphEx();
        raw.setName( local_name);
        raw.setLabel( local_label);
        raw.setType( local_type);
        raw.setGraph( local_graph);
        raw.setRunning( local_running);
        raw.setRunningId( local_runningId);
        raw.setComplete( local_complete);
        raw.setFailed( local_failed);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setLabel( String _label )
    {
        this.local_label = _label;
    }
    public String getLabel( )
    {
        return this.local_label;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setGraph( String _graph )
    {
        this.local_graph = _graph;
    }
    public String getGraph( )
    {
        return this.local_graph;
    }
    public void setRunning( boolean _running )
    {
        this.local_running = _running;
    }
    public boolean getRunning( )
    {
        return this.local_running;
    }
    public void setRunningId( long _runningId )
    {
        this.local_runningId = _runningId;
    }
    public long getRunningId( )
    {
        return this.local_runningId;
    }
    public void setComplete( boolean _complete )
    {
        this.local_complete = _complete;
    }
    public boolean getComplete( )
    {
        return this.local_complete;
    }
    public void setFailed( boolean _failed )
    {
        this.local_failed = _failed;
    }
    public boolean getFailed( )
    {
        return this.local_failed;
    }
}