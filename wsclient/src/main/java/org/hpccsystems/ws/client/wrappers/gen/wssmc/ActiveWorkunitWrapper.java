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

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: ActiveWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * Service version: 1.26
 */
public class ActiveWorkunitWrapper
{
    protected String local_wuid;
    protected String local_state;
    protected int local_stateID;
    protected String local_owner;
    protected String local_jobname;
    protected String local_server;
    protected String local_instance;
    protected String local_priority;
    protected String local_extra;
    protected String local_graphName;
    protected String local_duration;
    protected String local_gID;
    protected String local_queueName;
    protected int local_memoryBlocked;
    protected boolean local_isPausing;
    protected String local_warning;
    protected String local_clusterName;
    protected String local_clusterType;
    protected String local_clusterQueueName;
    protected String local_targetClusterName;
    protected boolean local_noAccess;

    public ActiveWorkunitWrapper() {}

    public ActiveWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit activeworkunit)
    {
        copy( activeworkunit );
    }
    public ActiveWorkunitWrapper( String _wuid, String _state, int _stateID, String _owner, String _jobname, String _server, String _instance, String _priority, String _extra, String _graphName, String _duration, String _gID, String _queueName, int _memoryBlocked, boolean _isPausing, String _warning, String _clusterName, String _clusterType, String _clusterQueueName, String _targetClusterName, boolean _noAccess )
    {
        this.local_wuid = _wuid;
        this.local_state = _state;
        this.local_stateID = _stateID;
        this.local_owner = _owner;
        this.local_jobname = _jobname;
        this.local_server = _server;
        this.local_instance = _instance;
        this.local_priority = _priority;
        this.local_extra = _extra;
        this.local_graphName = _graphName;
        this.local_duration = _duration;
        this.local_gID = _gID;
        this.local_queueName = _queueName;
        this.local_memoryBlocked = _memoryBlocked;
        this.local_isPausing = _isPausing;
        this.local_warning = _warning;
        this.local_clusterName = _clusterName;
        this.local_clusterType = _clusterType;
        this.local_clusterQueueName = _clusterQueueName;
        this.local_targetClusterName = _targetClusterName;
        this.local_noAccess = _noAccess;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_state = raw.getState();
        this.local_stateID = raw.getStateID();
        this.local_owner = raw.getOwner();
        this.local_jobname = raw.getJobname();
        this.local_server = raw.getServer();
        this.local_instance = raw.getInstance();
        this.local_priority = raw.getPriority();
        this.local_extra = raw.getExtra();
        this.local_graphName = raw.getGraphName();
        this.local_duration = raw.getDuration();
        this.local_gID = raw.getGID();
        this.local_queueName = raw.getQueueName();
        this.local_memoryBlocked = raw.getMemoryBlocked();
        this.local_isPausing = raw.getIsPausing();
        this.local_warning = raw.getWarning();
        this.local_clusterName = raw.getClusterName();
        this.local_clusterType = raw.getClusterType();
        this.local_clusterQueueName = raw.getClusterQueueName();
        this.local_targetClusterName = raw.getTargetClusterName();
        this.local_noAccess = raw.getNoAccess();

    }

    @Override
    public String toString()
    {
        return "ActiveWorkunitWrapper [" + "wuid = " + local_wuid + ", " + "state = " + local_state + ", " + "stateID = " + local_stateID + ", " + "owner = " + local_owner + ", " + "jobname = " + local_jobname + ", " + "server = " + local_server + ", " + "instance = " + local_instance + ", " + "priority = " + local_priority + ", " + "extra = " + local_extra + ", " + "graphName = " + local_graphName + ", " + "duration = " + local_duration + ", " + "gID = " + local_gID + ", " + "queueName = " + local_queueName + ", " + "memoryBlocked = " + local_memoryBlocked + ", " + "isPausing = " + local_isPausing + ", " + "warning = " + local_warning + ", " + "clusterName = " + local_clusterName + ", " + "clusterType = " + local_clusterType + ", " + "clusterQueueName = " + local_clusterQueueName + ", " + "targetClusterName = " + local_targetClusterName + ", " + "noAccess = " + local_noAccess + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.ActiveWorkunit();
        raw.setWuid( local_wuid);
        raw.setState( local_state);
        raw.setStateID( local_stateID);
        raw.setOwner( local_owner);
        raw.setJobname( local_jobname);
        raw.setServer( local_server);
        raw.setInstance( local_instance);
        raw.setPriority( local_priority);
        raw.setExtra( local_extra);
        raw.setGraphName( local_graphName);
        raw.setDuration( local_duration);
        raw.setGID( local_gID);
        raw.setQueueName( local_queueName);
        raw.setMemoryBlocked( local_memoryBlocked);
        raw.setIsPausing( local_isPausing);
        raw.setWarning( local_warning);
        raw.setClusterName( local_clusterName);
        raw.setClusterType( local_clusterType);
        raw.setClusterQueueName( local_clusterQueueName);
        raw.setTargetClusterName( local_targetClusterName);
        raw.setNoAccess( local_noAccess);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setStateID( int _stateID )
    {
        this.local_stateID = _stateID;
    }
    public int getStateID( )
    {
        return this.local_stateID;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setJobname( String _jobname )
    {
        this.local_jobname = _jobname;
    }
    public String getJobname( )
    {
        return this.local_jobname;
    }
    public void setServer( String _server )
    {
        this.local_server = _server;
    }
    public String getServer( )
    {
        return this.local_server;
    }
    public void setInstance( String _instance )
    {
        this.local_instance = _instance;
    }
    public String getInstance( )
    {
        return this.local_instance;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setExtra( String _extra )
    {
        this.local_extra = _extra;
    }
    public String getExtra( )
    {
        return this.local_extra;
    }
    public void setGraphName( String _graphName )
    {
        this.local_graphName = _graphName;
    }
    public String getGraphName( )
    {
        return this.local_graphName;
    }
    public void setDuration( String _duration )
    {
        this.local_duration = _duration;
    }
    public String getDuration( )
    {
        return this.local_duration;
    }
    public void setGID( String _gID )
    {
        this.local_gID = _gID;
    }
    public String getGID( )
    {
        return this.local_gID;
    }
    public void setQueueName( String _queueName )
    {
        this.local_queueName = _queueName;
    }
    public String getQueueName( )
    {
        return this.local_queueName;
    }
    public void setMemoryBlocked( int _memoryBlocked )
    {
        this.local_memoryBlocked = _memoryBlocked;
    }
    public int getMemoryBlocked( )
    {
        return this.local_memoryBlocked;
    }
    public void setIsPausing( boolean _isPausing )
    {
        this.local_isPausing = _isPausing;
    }
    public boolean getIsPausing( )
    {
        return this.local_isPausing;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setClusterType( String _clusterType )
    {
        this.local_clusterType = _clusterType;
    }
    public String getClusterType( )
    {
        return this.local_clusterType;
    }
    public void setClusterQueueName( String _clusterQueueName )
    {
        this.local_clusterQueueName = _clusterQueueName;
    }
    public String getClusterQueueName( )
    {
        return this.local_clusterQueueName;
    }
    public void setTargetClusterName( String _targetClusterName )
    {
        this.local_targetClusterName = _targetClusterName;
    }
    public String getTargetClusterName( )
    {
        return this.local_targetClusterName;
    }
    public void setNoAccess( boolean _noAccess )
    {
        this.local_noAccess = _noAccess;
    }
    public boolean getNoAccess( )
    {
        return this.local_noAccess;
    }
}