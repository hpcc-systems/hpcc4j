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
 * Class name: TpServiceQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.486Z
 */
public class TpServiceQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_memThreshold;
    protected int local_diskThreshold;
    protected int local_cpuThreshold;
    protected boolean local_encapsulatedSystem;
    protected boolean local_enableSNMP;
    protected String local_preflightProcessFilter;
    protected String local_acceptLanguage;
    protected String local_memThresholdType;
    protected String local_diskThresholdType;
    protected TpServicesWrapper local_serviceList;

    public TpServiceQueryResponseWrapper() {}

    public TpServiceQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse tpservicequeryresponse)
    {
        copy( tpservicequeryresponse );
    }
    public TpServiceQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _memThreshold, int _diskThreshold, int _cpuThreshold, boolean _encapsulatedSystem, boolean _enableSNMP, String _preflightProcessFilter, String _acceptLanguage, String _memThresholdType, String _diskThresholdType, TpServicesWrapper _serviceList )
    {
        this.local_exceptions = _exceptions;
        this.local_memThreshold = _memThreshold;
        this.local_diskThreshold = _diskThreshold;
        this.local_cpuThreshold = _cpuThreshold;
        this.local_encapsulatedSystem = _encapsulatedSystem;
        this.local_enableSNMP = _enableSNMP;
        this.local_preflightProcessFilter = _preflightProcessFilter;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_memThresholdType = _memThresholdType;
        this.local_diskThresholdType = _diskThresholdType;
        this.local_serviceList = _serviceList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_memThreshold = raw.getMemThreshold();
        this.local_diskThreshold = raw.getDiskThreshold();
        this.local_cpuThreshold = raw.getCpuThreshold();
        this.local_encapsulatedSystem = raw.getEncapsulatedSystem();
        this.local_enableSNMP = raw.getEnableSNMP();
        this.local_preflightProcessFilter = raw.getPreflightProcessFilter();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        this.local_memThresholdType = raw.getMemThresholdType();
        this.local_diskThresholdType = raw.getDiskThresholdType();
        if (raw.getServiceList() != null)
            this.local_serviceList = new TpServicesWrapper( raw.getServiceList());

    }

    @Override
    public String toString()
    {
        return "TpServiceQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "memThreshold = " + local_memThreshold + ", " + "diskThreshold = " + local_diskThreshold + ", " + "cpuThreshold = " + local_cpuThreshold + ", " + "encapsulatedSystem = " + local_encapsulatedSystem + ", " + "enableSNMP = " + local_enableSNMP + ", " + "preflightProcessFilter = " + local_preflightProcessFilter + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "memThresholdType = " + local_memThresholdType + ", " + "diskThresholdType = " + local_diskThresholdType + ", " + "serviceList = " + local_serviceList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpServiceQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setMemThreshold( local_memThreshold);
        raw.setDiskThreshold( local_diskThreshold);
        raw.setCpuThreshold( local_cpuThreshold);
        raw.setEncapsulatedSystem( local_encapsulatedSystem);
        raw.setEnableSNMP( local_enableSNMP);
        raw.setPreflightProcessFilter( local_preflightProcessFilter);
        raw.setAcceptLanguage( local_acceptLanguage);
        raw.setMemThresholdType( local_memThresholdType);
        raw.setDiskThresholdType( local_diskThresholdType);
        if (local_serviceList != null)
            raw.setServiceList( local_serviceList.getRaw());
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
    public void setEncapsulatedSystem( boolean _encapsulatedSystem )
    {
        this.local_encapsulatedSystem = _encapsulatedSystem;
    }
    public boolean getEncapsulatedSystem( )
    {
        return this.local_encapsulatedSystem;
    }
    public void setEnableSNMP( boolean _enableSNMP )
    {
        this.local_enableSNMP = _enableSNMP;
    }
    public boolean getEnableSNMP( )
    {
        return this.local_enableSNMP;
    }
    public void setPreflightProcessFilter( String _preflightProcessFilter )
    {
        this.local_preflightProcessFilter = _preflightProcessFilter;
    }
    public String getPreflightProcessFilter( )
    {
        return this.local_preflightProcessFilter;
    }
    public void setAcceptLanguage( String _acceptLanguage )
    {
        this.local_acceptLanguage = _acceptLanguage;
    }
    public String getAcceptLanguage( )
    {
        return this.local_acceptLanguage;
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
    public void setServiceList( TpServicesWrapper _serviceList )
    {
        this.local_serviceList = _serviceList;
    }
    public TpServicesWrapper getServiceList( )
    {
        return this.local_serviceList;
    }
}