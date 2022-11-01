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
 * Class name: TpServicesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.487Z
 */
public class TpServicesWrapper
{
    protected ArrayOfTpDaliWrapper local_tpDalis;
    protected ArrayOfTpDfuServerWrapper local_tpDfuServers;
    protected ArrayOfTpDkcSlaveWrapper local_tpDkcSlaves;
    protected ArrayOfTpDropZoneWrapper local_tpDropZones;
    protected ArrayOfTpEclAgentWrapper local_tpEclAgents;
    protected ArrayOfTpEclServerWrapper local_tpEclServers;
    protected ArrayOfTpEclServerWrapper local_tpEclCCServers;
    protected ArrayOfTpEclSchedulerWrapper local_tpEclSchedulers;
    protected ArrayOfTpEspServerWrapper local_tpEspServers;
    protected ArrayOfTpFTSlaveWrapper local_tpFTSlaves;
    protected ArrayOfTpGenesisServerWrapper local_tpGenesisServers;
    protected ArrayOfTpLdapServerWrapper local_tpLdapServers;
    protected ArrayOfTpMySqlServerWrapper local_tpMySqlServers;
    protected ArrayOfTpSashaServerWrapper local_tpSashaServers;
    protected ArrayOfTpSparkThorWrapper local_tpSparkThors;

    public TpServicesWrapper() {}

    public TpServicesWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices tpservices)
    {
        copy( tpservices );
    }
    public TpServicesWrapper( ArrayOfTpDaliWrapper _tpDalis, ArrayOfTpDfuServerWrapper _tpDfuServers, ArrayOfTpDkcSlaveWrapper _tpDkcSlaves, ArrayOfTpDropZoneWrapper _tpDropZones, ArrayOfTpEclAgentWrapper _tpEclAgents, ArrayOfTpEclServerWrapper _tpEclServers, ArrayOfTpEclServerWrapper _tpEclCCServers, ArrayOfTpEclSchedulerWrapper _tpEclSchedulers, ArrayOfTpEspServerWrapper _tpEspServers, ArrayOfTpFTSlaveWrapper _tpFTSlaves, ArrayOfTpGenesisServerWrapper _tpGenesisServers, ArrayOfTpLdapServerWrapper _tpLdapServers, ArrayOfTpMySqlServerWrapper _tpMySqlServers, ArrayOfTpSashaServerWrapper _tpSashaServers, ArrayOfTpSparkThorWrapper _tpSparkThors )
    {
        this.local_tpDalis = _tpDalis;
        this.local_tpDfuServers = _tpDfuServers;
        this.local_tpDkcSlaves = _tpDkcSlaves;
        this.local_tpDropZones = _tpDropZones;
        this.local_tpEclAgents = _tpEclAgents;
        this.local_tpEclServers = _tpEclServers;
        this.local_tpEclCCServers = _tpEclCCServers;
        this.local_tpEclSchedulers = _tpEclSchedulers;
        this.local_tpEspServers = _tpEspServers;
        this.local_tpFTSlaves = _tpFTSlaves;
        this.local_tpGenesisServers = _tpGenesisServers;
        this.local_tpLdapServers = _tpLdapServers;
        this.local_tpMySqlServers = _tpMySqlServers;
        this.local_tpSashaServers = _tpSashaServers;
        this.local_tpSparkThors = _tpSparkThors;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices raw )
    {
        if (raw == null)
            return;

        if (raw.getTpDalis() != null)
            this.local_tpDalis = new ArrayOfTpDaliWrapper( raw.getTpDalis());
        if (raw.getTpDfuServers() != null)
            this.local_tpDfuServers = new ArrayOfTpDfuServerWrapper( raw.getTpDfuServers());
        if (raw.getTpDkcSlaves() != null)
            this.local_tpDkcSlaves = new ArrayOfTpDkcSlaveWrapper( raw.getTpDkcSlaves());
        if (raw.getTpDropZones() != null)
            this.local_tpDropZones = new ArrayOfTpDropZoneWrapper( raw.getTpDropZones());
        if (raw.getTpEclAgents() != null)
            this.local_tpEclAgents = new ArrayOfTpEclAgentWrapper( raw.getTpEclAgents());
        if (raw.getTpEclServers() != null)
            this.local_tpEclServers = new ArrayOfTpEclServerWrapper( raw.getTpEclServers());
        if (raw.getTpEclCCServers() != null)
            this.local_tpEclCCServers = new ArrayOfTpEclServerWrapper( raw.getTpEclCCServers());
        if (raw.getTpEclSchedulers() != null)
            this.local_tpEclSchedulers = new ArrayOfTpEclSchedulerWrapper( raw.getTpEclSchedulers());
        if (raw.getTpEspServers() != null)
            this.local_tpEspServers = new ArrayOfTpEspServerWrapper( raw.getTpEspServers());
        if (raw.getTpFTSlaves() != null)
            this.local_tpFTSlaves = new ArrayOfTpFTSlaveWrapper( raw.getTpFTSlaves());
        if (raw.getTpGenesisServers() != null)
            this.local_tpGenesisServers = new ArrayOfTpGenesisServerWrapper( raw.getTpGenesisServers());
        if (raw.getTpLdapServers() != null)
            this.local_tpLdapServers = new ArrayOfTpLdapServerWrapper( raw.getTpLdapServers());
        if (raw.getTpMySqlServers() != null)
            this.local_tpMySqlServers = new ArrayOfTpMySqlServerWrapper( raw.getTpMySqlServers());
        if (raw.getTpSashaServers() != null)
            this.local_tpSashaServers = new ArrayOfTpSashaServerWrapper( raw.getTpSashaServers());
        if (raw.getTpSparkThors() != null)
            this.local_tpSparkThors = new ArrayOfTpSparkThorWrapper( raw.getTpSparkThors());

    }

    @Override
    public String toString()
    {
        return "TpServicesWrapper [" + "tpDalis = " + local_tpDalis + ", " + "tpDfuServers = " + local_tpDfuServers + ", " + "tpDkcSlaves = " + local_tpDkcSlaves + ", " + "tpDropZones = " + local_tpDropZones + ", " + "tpEclAgents = " + local_tpEclAgents + ", " + "tpEclServers = " + local_tpEclServers + ", " + "tpEclCCServers = " + local_tpEclCCServers + ", " + "tpEclSchedulers = " + local_tpEclSchedulers + ", " + "tpEspServers = " + local_tpEspServers + ", " + "tpFTSlaves = " + local_tpFTSlaves + ", " + "tpGenesisServers = " + local_tpGenesisServers + ", " + "tpLdapServers = " + local_tpLdapServers + ", " + "tpMySqlServers = " + local_tpMySqlServers + ", " + "tpSashaServers = " + local_tpSashaServers + ", " + "tpSparkThors = " + local_tpSparkThors + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServices();
        if (local_tpDalis != null)
            raw.setTpDalis( local_tpDalis.getRaw());
        if (local_tpDfuServers != null)
            raw.setTpDfuServers( local_tpDfuServers.getRaw());
        if (local_tpDkcSlaves != null)
            raw.setTpDkcSlaves( local_tpDkcSlaves.getRaw());
        if (local_tpDropZones != null)
            raw.setTpDropZones( local_tpDropZones.getRaw());
        if (local_tpEclAgents != null)
            raw.setTpEclAgents( local_tpEclAgents.getRaw());
        if (local_tpEclServers != null)
            raw.setTpEclServers( local_tpEclServers.getRaw());
        if (local_tpEclCCServers != null)
            raw.setTpEclCCServers( local_tpEclCCServers.getRaw());
        if (local_tpEclSchedulers != null)
            raw.setTpEclSchedulers( local_tpEclSchedulers.getRaw());
        if (local_tpEspServers != null)
            raw.setTpEspServers( local_tpEspServers.getRaw());
        if (local_tpFTSlaves != null)
            raw.setTpFTSlaves( local_tpFTSlaves.getRaw());
        if (local_tpGenesisServers != null)
            raw.setTpGenesisServers( local_tpGenesisServers.getRaw());
        if (local_tpLdapServers != null)
            raw.setTpLdapServers( local_tpLdapServers.getRaw());
        if (local_tpMySqlServers != null)
            raw.setTpMySqlServers( local_tpMySqlServers.getRaw());
        if (local_tpSashaServers != null)
            raw.setTpSashaServers( local_tpSashaServers.getRaw());
        if (local_tpSparkThors != null)
            raw.setTpSparkThors( local_tpSparkThors.getRaw());
        return raw;
    }


    public void setTpDalis( ArrayOfTpDaliWrapper _tpDalis )
    {
        this.local_tpDalis = _tpDalis;
    }
    public ArrayOfTpDaliWrapper getTpDalis( )
    {
        return this.local_tpDalis;
    }
    public void setTpDfuServers( ArrayOfTpDfuServerWrapper _tpDfuServers )
    {
        this.local_tpDfuServers = _tpDfuServers;
    }
    public ArrayOfTpDfuServerWrapper getTpDfuServers( )
    {
        return this.local_tpDfuServers;
    }
    public void setTpDkcSlaves( ArrayOfTpDkcSlaveWrapper _tpDkcSlaves )
    {
        this.local_tpDkcSlaves = _tpDkcSlaves;
    }
    public ArrayOfTpDkcSlaveWrapper getTpDkcSlaves( )
    {
        return this.local_tpDkcSlaves;
    }
    public void setTpDropZones( ArrayOfTpDropZoneWrapper _tpDropZones )
    {
        this.local_tpDropZones = _tpDropZones;
    }
    public ArrayOfTpDropZoneWrapper getTpDropZones( )
    {
        return this.local_tpDropZones;
    }
    public void setTpEclAgents( ArrayOfTpEclAgentWrapper _tpEclAgents )
    {
        this.local_tpEclAgents = _tpEclAgents;
    }
    public ArrayOfTpEclAgentWrapper getTpEclAgents( )
    {
        return this.local_tpEclAgents;
    }
    public void setTpEclServers( ArrayOfTpEclServerWrapper _tpEclServers )
    {
        this.local_tpEclServers = _tpEclServers;
    }
    public ArrayOfTpEclServerWrapper getTpEclServers( )
    {
        return this.local_tpEclServers;
    }
    public void setTpEclCCServers( ArrayOfTpEclServerWrapper _tpEclCCServers )
    {
        this.local_tpEclCCServers = _tpEclCCServers;
    }
    public ArrayOfTpEclServerWrapper getTpEclCCServers( )
    {
        return this.local_tpEclCCServers;
    }
    public void setTpEclSchedulers( ArrayOfTpEclSchedulerWrapper _tpEclSchedulers )
    {
        this.local_tpEclSchedulers = _tpEclSchedulers;
    }
    public ArrayOfTpEclSchedulerWrapper getTpEclSchedulers( )
    {
        return this.local_tpEclSchedulers;
    }
    public void setTpEspServers( ArrayOfTpEspServerWrapper _tpEspServers )
    {
        this.local_tpEspServers = _tpEspServers;
    }
    public ArrayOfTpEspServerWrapper getTpEspServers( )
    {
        return this.local_tpEspServers;
    }
    public void setTpFTSlaves( ArrayOfTpFTSlaveWrapper _tpFTSlaves )
    {
        this.local_tpFTSlaves = _tpFTSlaves;
    }
    public ArrayOfTpFTSlaveWrapper getTpFTSlaves( )
    {
        return this.local_tpFTSlaves;
    }
    public void setTpGenesisServers( ArrayOfTpGenesisServerWrapper _tpGenesisServers )
    {
        this.local_tpGenesisServers = _tpGenesisServers;
    }
    public ArrayOfTpGenesisServerWrapper getTpGenesisServers( )
    {
        return this.local_tpGenesisServers;
    }
    public void setTpLdapServers( ArrayOfTpLdapServerWrapper _tpLdapServers )
    {
        this.local_tpLdapServers = _tpLdapServers;
    }
    public ArrayOfTpLdapServerWrapper getTpLdapServers( )
    {
        return this.local_tpLdapServers;
    }
    public void setTpMySqlServers( ArrayOfTpMySqlServerWrapper _tpMySqlServers )
    {
        this.local_tpMySqlServers = _tpMySqlServers;
    }
    public ArrayOfTpMySqlServerWrapper getTpMySqlServers( )
    {
        return this.local_tpMySqlServers;
    }
    public void setTpSashaServers( ArrayOfTpSashaServerWrapper _tpSashaServers )
    {
        this.local_tpSashaServers = _tpSashaServers;
    }
    public ArrayOfTpSashaServerWrapper getTpSashaServers( )
    {
        return this.local_tpSashaServers;
    }
    public void setTpSparkThors( ArrayOfTpSparkThorWrapper _tpSparkThors )
    {
        this.local_tpSparkThors = _tpSparkThors;
    }
    public ArrayOfTpSparkThorWrapper getTpSparkThors( )
    {
        return this.local_tpSparkThors;
    }
}