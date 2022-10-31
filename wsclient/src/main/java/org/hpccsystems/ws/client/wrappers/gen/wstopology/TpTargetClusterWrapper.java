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
 * Class name: TpTargetClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.490Z
 */
public class TpTargetClusterWrapper
{
    protected String local_name;
    protected String local_prefix;
    protected String local_type;
    protected ArrayOfTpClusterWrapper local_tpClusters;
    protected ArrayOfTpEclServerWrapper local_tpEclCCServers;
    protected ArrayOfTpEclServerWrapper local_tpEclServers;
    protected ArrayOfTpEclAgentWrapper local_tpEclAgents;
    protected ArrayOfTpEclSchedulerWrapper local_tpEclSchedulers;

    public TpTargetClusterWrapper() {}

    public TpTargetClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster tptargetcluster)
    {
        copy( tptargetcluster );
    }
    public TpTargetClusterWrapper( String _name, String _prefix, String _type, ArrayOfTpClusterWrapper _tpClusters, ArrayOfTpEclServerWrapper _tpEclCCServers, ArrayOfTpEclServerWrapper _tpEclServers, ArrayOfTpEclAgentWrapper _tpEclAgents, ArrayOfTpEclSchedulerWrapper _tpEclSchedulers )
    {
        this.local_name = _name;
        this.local_prefix = _prefix;
        this.local_type = _type;
        this.local_tpClusters = _tpClusters;
        this.local_tpEclCCServers = _tpEclCCServers;
        this.local_tpEclServers = _tpEclServers;
        this.local_tpEclAgents = _tpEclAgents;
        this.local_tpEclSchedulers = _tpEclSchedulers;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_prefix = raw.getPrefix();
        this.local_type = raw.getType();
        if (raw.getTpClusters() != null)
            this.local_tpClusters = new ArrayOfTpClusterWrapper( raw.getTpClusters());
        if (raw.getTpEclCCServers() != null)
            this.local_tpEclCCServers = new ArrayOfTpEclServerWrapper( raw.getTpEclCCServers());
        if (raw.getTpEclServers() != null)
            this.local_tpEclServers = new ArrayOfTpEclServerWrapper( raw.getTpEclServers());
        if (raw.getTpEclAgents() != null)
            this.local_tpEclAgents = new ArrayOfTpEclAgentWrapper( raw.getTpEclAgents());
        if (raw.getTpEclSchedulers() != null)
            this.local_tpEclSchedulers = new ArrayOfTpEclSchedulerWrapper( raw.getTpEclSchedulers());

    }

    @Override
    public String toString()
    {
        return "TpTargetClusterWrapper [" + "name = " + local_name + ", " + "prefix = " + local_prefix + ", " + "type = " + local_type + ", " + "tpClusters = " + local_tpClusters + ", " + "tpEclCCServers = " + local_tpEclCCServers + ", " + "tpEclServers = " + local_tpEclServers + ", " + "tpEclAgents = " + local_tpEclAgents + ", " + "tpEclSchedulers = " + local_tpEclSchedulers + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetCluster();
        raw.setName( local_name);
        raw.setPrefix( local_prefix);
        raw.setType( local_type);
        if (local_tpClusters != null)
            raw.setTpClusters( local_tpClusters.getRaw());
        if (local_tpEclCCServers != null)
            raw.setTpEclCCServers( local_tpEclCCServers.getRaw());
        if (local_tpEclServers != null)
            raw.setTpEclServers( local_tpEclServers.getRaw());
        if (local_tpEclAgents != null)
            raw.setTpEclAgents( local_tpEclAgents.getRaw());
        if (local_tpEclSchedulers != null)
            raw.setTpEclSchedulers( local_tpEclSchedulers.getRaw());
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
    public void setPrefix( String _prefix )
    {
        this.local_prefix = _prefix;
    }
    public String getPrefix( )
    {
        return this.local_prefix;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setTpClusters( ArrayOfTpClusterWrapper _tpClusters )
    {
        this.local_tpClusters = _tpClusters;
    }
    public ArrayOfTpClusterWrapper getTpClusters( )
    {
        return this.local_tpClusters;
    }
    public void setTpEclCCServers( ArrayOfTpEclServerWrapper _tpEclCCServers )
    {
        this.local_tpEclCCServers = _tpEclCCServers;
    }
    public ArrayOfTpEclServerWrapper getTpEclCCServers( )
    {
        return this.local_tpEclCCServers;
    }
    public void setTpEclServers( ArrayOfTpEclServerWrapper _tpEclServers )
    {
        this.local_tpEclServers = _tpEclServers;
    }
    public ArrayOfTpEclServerWrapper getTpEclServers( )
    {
        return this.local_tpEclServers;
    }
    public void setTpEclAgents( ArrayOfTpEclAgentWrapper _tpEclAgents )
    {
        this.local_tpEclAgents = _tpEclAgents;
    }
    public ArrayOfTpEclAgentWrapper getTpEclAgents( )
    {
        return this.local_tpEclAgents;
    }
    public void setTpEclSchedulers( ArrayOfTpEclSchedulerWrapper _tpEclSchedulers )
    {
        this.local_tpEclSchedulers = _tpEclSchedulers;
    }
    public ArrayOfTpEclSchedulerWrapper getTpEclSchedulers( )
    {
        return this.local_tpEclSchedulers;
    }
}