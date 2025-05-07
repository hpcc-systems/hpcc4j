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
 * Class name: TpMachineQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpMachineQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected boolean local_enablePreflightInfo;
    protected boolean local_hasThorSpareProcess;
    protected TpMachineTypeWrapper local_type;
    protected String local_cluster;
    protected String local_oldIP;
    protected String local_logDirectory;
    protected String local_path;
    protected int local_memThreshold;
    protected int local_diskThreshold;
    protected int local_cpuThreshold;
    protected String local_memThresholdType;
    protected String local_diskThresholdType;
    protected String local_preflightProcessFilter;
    protected boolean local_enableSNMP;
    protected String local_acceptLanguage;
    protected ArrayOfTpMachineWrapper local_tpMachines;

    public TpMachineQueryResponseWrapper() {}

    public TpMachineQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse tpmachinequeryresponse)
    {
        copy( tpmachinequeryresponse );
    }
    public TpMachineQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _enablePreflightInfo, boolean _hasThorSpareProcess, TpMachineTypeWrapper _type, String _cluster, String _oldIP, String _logDirectory, String _path, int _memThreshold, int _diskThreshold, int _cpuThreshold, String _memThresholdType, String _diskThresholdType, String _preflightProcessFilter, boolean _enableSNMP, String _acceptLanguage, ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_exceptions = _exceptions;
        this.local_enablePreflightInfo = _enablePreflightInfo;
        this.local_hasThorSpareProcess = _hasThorSpareProcess;
        this.local_type = _type;
        this.local_cluster = _cluster;
        this.local_oldIP = _oldIP;
        this.local_logDirectory = _logDirectory;
        this.local_path = _path;
        this.local_memThreshold = _memThreshold;
        this.local_diskThreshold = _diskThreshold;
        this.local_cpuThreshold = _cpuThreshold;
        this.local_memThresholdType = _memThresholdType;
        this.local_diskThresholdType = _diskThresholdType;
        this.local_preflightProcessFilter = _preflightProcessFilter;
        this.local_enableSNMP = _enableSNMP;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_tpMachines = _tpMachines;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_enablePreflightInfo = raw.getEnablePreflightInfo();
        this.local_hasThorSpareProcess = raw.getHasThorSpareProcess();
        if (raw.getType() != null)
            this.local_type = new TpMachineTypeWrapper( raw.getType());
        this.local_cluster = raw.getCluster();
        this.local_oldIP = raw.getOldIP();
        this.local_logDirectory = raw.getLogDirectory();
        this.local_path = raw.getPath();
        this.local_memThreshold = raw.getMemThreshold();
        this.local_diskThreshold = raw.getDiskThreshold();
        this.local_cpuThreshold = raw.getCpuThreshold();
        this.local_memThresholdType = raw.getMemThresholdType();
        this.local_diskThresholdType = raw.getDiskThresholdType();
        this.local_preflightProcessFilter = raw.getPreflightProcessFilter();
        this.local_enableSNMP = raw.getEnableSNMP();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        if (raw.getTpMachines() != null)
            this.local_tpMachines = new ArrayOfTpMachineWrapper( raw.getTpMachines());

    }

    @Override
    public String toString()
    {
        return "TpMachineQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "enablePreflightInfo = " + local_enablePreflightInfo + ", " + "hasThorSpareProcess = " + local_hasThorSpareProcess + ", " + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "oldIP = " + local_oldIP + ", " + "logDirectory = " + local_logDirectory + ", " + "path = " + local_path + ", " + "memThreshold = " + local_memThreshold + ", " + "diskThreshold = " + local_diskThreshold + ", " + "cpuThreshold = " + local_cpuThreshold + ", " + "memThresholdType = " + local_memThresholdType + ", " + "diskThresholdType = " + local_diskThresholdType + ", " + "preflightProcessFilter = " + local_preflightProcessFilter + ", " + "enableSNMP = " + local_enableSNMP + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "tpMachines = " + local_tpMachines + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setEnablePreflightInfo( local_enablePreflightInfo);
        raw.setHasThorSpareProcess( local_hasThorSpareProcess);
        if (local_type != null)
            raw.setType( local_type.getRaw());
        raw.setCluster( local_cluster);
        raw.setOldIP( local_oldIP);
        raw.setLogDirectory( local_logDirectory);
        raw.setPath( local_path);
        raw.setMemThreshold( local_memThreshold);
        raw.setDiskThreshold( local_diskThreshold);
        raw.setCpuThreshold( local_cpuThreshold);
        raw.setMemThresholdType( local_memThresholdType);
        raw.setDiskThresholdType( local_diskThresholdType);
        raw.setPreflightProcessFilter( local_preflightProcessFilter);
        raw.setEnableSNMP( local_enableSNMP);
        raw.setAcceptLanguage( local_acceptLanguage);
        if (local_tpMachines != null)
            raw.setTpMachines( local_tpMachines.getRaw());
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
    public void setEnablePreflightInfo( boolean _enablePreflightInfo )
    {
        this.local_enablePreflightInfo = _enablePreflightInfo;
    }
    public boolean getEnablePreflightInfo( )
    {
        return this.local_enablePreflightInfo;
    }
    public void setHasThorSpareProcess( boolean _hasThorSpareProcess )
    {
        this.local_hasThorSpareProcess = _hasThorSpareProcess;
    }
    public boolean getHasThorSpareProcess( )
    {
        return this.local_hasThorSpareProcess;
    }
    public void setType( TpMachineTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public TpMachineTypeWrapper getType( )
    {
        return this.local_type;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setOldIP( String _oldIP )
    {
        this.local_oldIP = _oldIP;
    }
    public String getOldIP( )
    {
        return this.local_oldIP;
    }
    public void setLogDirectory( String _logDirectory )
    {
        this.local_logDirectory = _logDirectory;
    }
    public String getLogDirectory( )
    {
        return this.local_logDirectory;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setMemThreshold( int _memThreshold )
    {
        this.local_memThreshold = _memThreshold;
    }
    public int getMemThreshold( )
    {
        return this.local_memThreshold;
    }
    public void setDiskThreshold( int _diskThreshold )
    {
        this.local_diskThreshold = _diskThreshold;
    }
    public int getDiskThreshold( )
    {
        return this.local_diskThreshold;
    }
    public void setCpuThreshold( int _cpuThreshold )
    {
        this.local_cpuThreshold = _cpuThreshold;
    }
    public int getCpuThreshold( )
    {
        return this.local_cpuThreshold;
    }
    public void setMemThresholdType( String _memThresholdType )
    {
        this.local_memThresholdType = _memThresholdType;
    }
    public String getMemThresholdType( )
    {
        return this.local_memThresholdType;
    }
    public void setDiskThresholdType( String _diskThresholdType )
    {
        this.local_diskThresholdType = _diskThresholdType;
    }
    public String getDiskThresholdType( )
    {
        return this.local_diskThresholdType;
    }
    public void setPreflightProcessFilter( String _preflightProcessFilter )
    {
        this.local_preflightProcessFilter = _preflightProcessFilter;
    }
    public String getPreflightProcessFilter( )
    {
        return this.local_preflightProcessFilter;
    }
    public void setEnableSNMP( boolean _enableSNMP )
    {
        this.local_enableSNMP = _enableSNMP;
    }
    public boolean getEnableSNMP( )
    {
        return this.local_enableSNMP;
    }
    public void setAcceptLanguage( String _acceptLanguage )
    {
        this.local_acceptLanguage = _acceptLanguage;
    }
    public String getAcceptLanguage( )
    {
        return this.local_acceptLanguage;
    }
    public void setTpMachines( ArrayOfTpMachineWrapper _tpMachines )
    {
        this.local_tpMachines = _tpMachines;
    }
    public ArrayOfTpMachineWrapper getTpMachines( )
    {
        return this.local_tpMachines;
    }
}