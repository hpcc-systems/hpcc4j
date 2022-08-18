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
 * Class name: ECLJobWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.806Z
 */
public class ECLJobWrapper
{
    protected String local_wuid;
    protected String local_graph;
    protected String local_state;
    protected String local_startedDate;
    protected String local_finishedDate;
    protected String local_cluster;
    protected String local_graphNum;
    protected String local_subGraphNum;
    protected String local_numOfRuns;
    protected int local_duration;

    public ECLJobWrapper() {}

    public ECLJobWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob ecljob)
    {
        copy( ecljob );
    }
    public ECLJobWrapper( String _wuid, String _graph, String _state, String _startedDate, String _finishedDate, String _cluster, String _graphNum, String _subGraphNum, String _numOfRuns, int _duration )
    {
        this.local_wuid = _wuid;
        this.local_graph = _graph;
        this.local_state = _state;
        this.local_startedDate = _startedDate;
        this.local_finishedDate = _finishedDate;
        this.local_cluster = _cluster;
        this.local_graphNum = _graphNum;
        this.local_subGraphNum = _subGraphNum;
        this.local_numOfRuns = _numOfRuns;
        this.local_duration = _duration;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_graph = raw.getGraph();
        this.local_state = raw.getState();
        this.local_startedDate = raw.getStartedDate();
        this.local_finishedDate = raw.getFinishedDate();
        this.local_cluster = raw.getCluster();
        this.local_graphNum = raw.getGraphNum();
        this.local_subGraphNum = raw.getSubGraphNum();
        this.local_numOfRuns = raw.getNumOfRuns();
        this.local_duration = raw.getDuration();

    }

    @Override
    public String toString()
    {
        return "ECLJobWrapper [" + "wuid = " + local_wuid + ", " + "graph = " + local_graph + ", " + "state = " + local_state + ", " + "startedDate = " + local_startedDate + ", " + "finishedDate = " + local_finishedDate + ", " + "cluster = " + local_cluster + ", " + "graphNum = " + local_graphNum + ", " + "subGraphNum = " + local_subGraphNum + ", " + "numOfRuns = " + local_numOfRuns + ", " + "duration = " + local_duration + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLJob();
        raw.setWuid( local_wuid);
        raw.setGraph( local_graph);
        raw.setState( local_state);
        raw.setStartedDate( local_startedDate);
        raw.setFinishedDate( local_finishedDate);
        raw.setCluster( local_cluster);
        raw.setGraphNum( local_graphNum);
        raw.setSubGraphNum( local_subGraphNum);
        raw.setNumOfRuns( local_numOfRuns);
        raw.setDuration( local_duration);
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
    public void setGraph( String _graph )
    {
        this.local_graph = _graph;
    }
    public String getGraph( )
    {
        return this.local_graph;
    }
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
    }
    public void setStartedDate( String _startedDate )
    {
        this.local_startedDate = _startedDate;
    }
    public String getStartedDate( )
    {
        return this.local_startedDate;
    }
    public void setFinishedDate( String _finishedDate )
    {
        this.local_finishedDate = _finishedDate;
    }
    public String getFinishedDate( )
    {
        return this.local_finishedDate;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setGraphNum( String _graphNum )
    {
        this.local_graphNum = _graphNum;
    }
    public String getGraphNum( )
    {
        return this.local_graphNum;
    }
    public void setSubGraphNum( String _subGraphNum )
    {
        this.local_subGraphNum = _subGraphNum;
    }
    public String getSubGraphNum( )
    {
        return this.local_subGraphNum;
    }
    public void setNumOfRuns( String _numOfRuns )
    {
        this.local_numOfRuns = _numOfRuns;
    }
    public String getNumOfRuns( )
    {
        return this.local_numOfRuns;
    }
    public void setDuration( int _duration )
    {
        this.local_duration = _duration;
    }
    public int getDuration( )
    {
        return this.local_duration;
    }
}