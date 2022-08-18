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
 * Class name: ECLGraphWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.804Z
 */
public class ECLGraphWrapper
{
    protected String local_name;
    protected String local_label;
    protected String local_type;
    protected boolean local_running;
    protected boolean local_complete;
    protected boolean local_failed;
    protected long local_runningId;
    protected String local_whenStarted;
    protected String local_whenFinished;

    public ECLGraphWrapper() {}

    public ECLGraphWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph eclgraph)
    {
        copy( eclgraph );
    }
    public ECLGraphWrapper( String _name, String _label, String _type, boolean _running, boolean _complete, boolean _failed, long _runningId, String _whenStarted, String _whenFinished )
    {
        this.local_name = _name;
        this.local_label = _label;
        this.local_type = _type;
        this.local_running = _running;
        this.local_complete = _complete;
        this.local_failed = _failed;
        this.local_runningId = _runningId;
        this.local_whenStarted = _whenStarted;
        this.local_whenFinished = _whenFinished;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_label = raw.getLabel();
        this.local_type = raw.getType();
        this.local_running = raw.getRunning();
        this.local_complete = raw.getComplete();
        this.local_failed = raw.getFailed();
        this.local_runningId = raw.getRunningId();
        this.local_whenStarted = raw.getWhenStarted();
        this.local_whenFinished = raw.getWhenFinished();

    }

    @Override
    public String toString()
    {
        return "ECLGraphWrapper [" + "name = " + local_name + ", " + "label = " + local_label + ", " + "type = " + local_type + ", " + "running = " + local_running + ", " + "complete = " + local_complete + ", " + "failed = " + local_failed + ", " + "runningId = " + local_runningId + ", " + "whenStarted = " + local_whenStarted + ", " + "whenFinished = " + local_whenFinished + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph();
        raw.setName( local_name);
        raw.setLabel( local_label);
        raw.setType( local_type);
        raw.setRunning( local_running);
        raw.setComplete( local_complete);
        raw.setFailed( local_failed);
        raw.setRunningId( local_runningId);
        raw.setWhenStarted( local_whenStarted);
        raw.setWhenFinished( local_whenFinished);
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
    public void setRunning( boolean _running )
    {
        this.local_running = _running;
    }
    public boolean getRunning( )
    {
        return this.local_running;
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
    public void setRunningId( long _runningId )
    {
        this.local_runningId = _runningId;
    }
    public long getRunningId( )
    {
        return this.local_runningId;
    }
    public void setWhenStarted( String _whenStarted )
    {
        this.local_whenStarted = _whenStarted;
    }
    public String getWhenStarted( )
    {
        return this.local_whenStarted;
    }
    public void setWhenFinished( String _whenFinished )
    {
        this.local_whenFinished = _whenFinished;
    }
    public String getWhenFinished( )
    {
        return this.local_whenFinished;
    }
}