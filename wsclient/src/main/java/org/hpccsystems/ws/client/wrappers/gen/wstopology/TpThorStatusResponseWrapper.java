package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpThorStatusResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.492Z
 */
public class TpThorStatusResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_name;
    protected String local_queue;
    protected String local_group;
    protected String local_thorMasterIPAddress;
    protected int local_port;
    protected String local_startTime;
    protected String local_logFile;
    protected String local_wuid;
    protected String local_graph;
    protected int local_subGraph;
    protected int local_subGraphDuration;
    protected int local_autoRefresh;

    public TpThorStatusResponseWrapper() {}

    public TpThorStatusResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse tpthorstatusresponse)
    {
        copy( tpthorstatusresponse );
    }
    public TpThorStatusResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _queue, String _group, String _thorMasterIPAddress, int _port, String _startTime, String _logFile, String _wuid, String _graph, int _subGraph, int _subGraphDuration, int _autoRefresh )
    {
        this.local_exceptions = _exceptions;
        this.local_name = _name;
        this.local_queue = _queue;
        this.local_group = _group;
        this.local_thorMasterIPAddress = _thorMasterIPAddress;
        this.local_port = _port;
        this.local_startTime = _startTime;
        this.local_logFile = _logFile;
        this.local_wuid = _wuid;
        this.local_graph = _graph;
        this.local_subGraph = _subGraph;
        this.local_subGraphDuration = _subGraphDuration;
        this.local_autoRefresh = _autoRefresh;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_name = raw.getName();
        this.local_queue = raw.getQueue();
        this.local_group = raw.getGroup();
        this.local_thorMasterIPAddress = raw.getThorMasterIPAddress();
        this.local_port = raw.getPort();
        this.local_startTime = raw.getStartTime();
        this.local_logFile = raw.getLogFile();
        this.local_wuid = raw.getWuid();
        this.local_graph = raw.getGraph();
        this.local_subGraph = raw.getSubGraph();
        this.local_subGraphDuration = raw.getSubGraphDuration();
        this.local_autoRefresh = raw.getAutoRefresh();

    }

    @Override
    public String toString()
    {
        return "TpThorStatusResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "queue = " + local_queue + ", " + "group = " + local_group + ", " + "thorMasterIPAddress = " + local_thorMasterIPAddress + ", " + "port = " + local_port + ", " + "startTime = " + local_startTime + ", " + "logFile = " + local_logFile + ", " + "wuid = " + local_wuid + ", " + "graph = " + local_graph + ", " + "subGraph = " + local_subGraph + ", " + "subGraphDuration = " + local_subGraphDuration + ", " + "autoRefresh = " + local_autoRefresh + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpThorStatusResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setName( local_name);
        raw.setQueue( local_queue);
        raw.setGroup( local_group);
        raw.setThorMasterIPAddress( local_thorMasterIPAddress);
        raw.setPort( local_port);
        raw.setStartTime( local_startTime);
        raw.setLogFile( local_logFile);
        raw.setWuid( local_wuid);
        raw.setGraph( local_graph);
        raw.setSubGraph( local_subGraph);
        raw.setSubGraphDuration( local_subGraphDuration);
        raw.setAutoRefresh( local_autoRefresh);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setQueue( String _queue )
    {
        this.local_queue = _queue;
    }
    public String getQueue( )
    {
        return this.local_queue;
    }
    public void setGroup( String _group )
    {
        this.local_group = _group;
    }
    public String getGroup( )
    {
        return this.local_group;
    }
    public void setThorMasterIPAddress( String _thorMasterIPAddress )
    {
        this.local_thorMasterIPAddress = _thorMasterIPAddress;
    }
    public String getThorMasterIPAddress( )
    {
        return this.local_thorMasterIPAddress;
    }
    public void setPort( int _port )
    {
        this.local_port = _port;
    }
    public int getPort( )
    {
        return this.local_port;
    }
    public void setStartTime( String _startTime )
    {
        this.local_startTime = _startTime;
    }
    public String getStartTime( )
    {
        return this.local_startTime;
    }
    public void setLogFile( String _logFile )
    {
        this.local_logFile = _logFile;
    }
    public String getLogFile( )
    {
        return this.local_logFile;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setGraph( String _graph )
    {
        this.local_graph = _graph;
    }
    public String getGraph( )
    {
        return this.local_graph;
    }
    public void setSubGraph( int _subGraph )
    {
        this.local_subGraph = _subGraph;
    }
    public int getSubGraph( )
    {
        return this.local_subGraph;
    }
    public void setSubGraphDuration( int _subGraphDuration )
    {
        this.local_subGraphDuration = _subGraphDuration;
    }
    public int getSubGraphDuration( )
    {
        return this.local_subGraphDuration;
    }
    public void setAutoRefresh( int _autoRefresh )
    {
        this.local_autoRefresh = _autoRefresh;
    }
    public int getAutoRefresh( )
    {
        return this.local_autoRefresh;
    }
}