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
 * Class name: TpTargetClusterQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.491Z
 */
public class TpTargetClusterQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected boolean local_showDetails;
    protected int local_memThreshold;
    protected int local_diskThreshold;
    protected int local_cpuThreshold;
    protected String local_memThresholdType;
    protected String local_diskThresholdType;
    protected String local_preflightProcessFilter;
    protected String local_acceptLanguage;
    protected ArrayOfTpTargetClusterWrapper local_tpTargetClusters;

    public TpTargetClusterQueryResponseWrapper() {}

    public TpTargetClusterQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse tptargetclusterqueryresponse)
    {
        copy( tptargetclusterqueryresponse );
    }
    public TpTargetClusterQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _showDetails, int _memThreshold, int _diskThreshold, int _cpuThreshold, String _memThresholdType, String _diskThresholdType, String _preflightProcessFilter, String _acceptLanguage, ArrayOfTpTargetClusterWrapper _tpTargetClusters )
    {
        this.local_exceptions = _exceptions;
        this.local_showDetails = _showDetails;
        this.local_memThreshold = _memThreshold;
        this.local_diskThreshold = _diskThreshold;
        this.local_cpuThreshold = _cpuThreshold;
        this.local_memThresholdType = _memThresholdType;
        this.local_diskThresholdType = _diskThresholdType;
        this.local_preflightProcessFilter = _preflightProcessFilter;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_tpTargetClusters = _tpTargetClusters;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_showDetails = raw.getShowDetails();
        this.local_memThreshold = raw.getMemThreshold();
        this.local_diskThreshold = raw.getDiskThreshold();
        this.local_cpuThreshold = raw.getCpuThreshold();
        this.local_memThresholdType = raw.getMemThresholdType();
        this.local_diskThresholdType = raw.getDiskThresholdType();
        this.local_preflightProcessFilter = raw.getPreflightProcessFilter();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        if (raw.getTpTargetClusters() != null)
            this.local_tpTargetClusters = new ArrayOfTpTargetClusterWrapper( raw.getTpTargetClusters());

    }

    @Override
    public String toString()
    {
        return "TpTargetClusterQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "showDetails = " + local_showDetails + ", " + "memThreshold = " + local_memThreshold + ", " + "diskThreshold = " + local_diskThreshold + ", " + "cpuThreshold = " + local_cpuThreshold + ", " + "memThresholdType = " + local_memThresholdType + ", " + "diskThresholdType = " + local_diskThresholdType + ", " + "preflightProcessFilter = " + local_preflightProcessFilter + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "tpTargetClusters = " + local_tpTargetClusters + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpTargetClusterQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setShowDetails( local_showDetails);
        raw.setMemThreshold( local_memThreshold);
        raw.setDiskThreshold( local_diskThreshold);
        raw.setCpuThreshold( local_cpuThreshold);
        raw.setMemThresholdType( local_memThresholdType);
        raw.setDiskThresholdType( local_diskThresholdType);
        raw.setPreflightProcessFilter( local_preflightProcessFilter);
        raw.setAcceptLanguage( local_acceptLanguage);
        if (local_tpTargetClusters != null)
            raw.setTpTargetClusters( local_tpTargetClusters.getRaw());
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
    public void setShowDetails( boolean _showDetails )
    {
        this.local_showDetails = _showDetails;
    }
    public boolean getShowDetails( )
    {
        return this.local_showDetails;
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
    public void setAcceptLanguage( String _acceptLanguage )
    {
        this.local_acceptLanguage = _acceptLanguage;
    }
    public String getAcceptLanguage( )
    {
        return this.local_acceptLanguage;
    }
    public void setTpTargetClusters( ArrayOfTpTargetClusterWrapper _tpTargetClusters )
    {
        this.local_tpTargetClusters = _tpTargetClusters;
    }
    public ArrayOfTpTargetClusterWrapper getTpTargetClusters( )
    {
        return this.local_tpTargetClusters;
    }
}