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
 * Class name: TpClusterQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2021-10-27T23:40:06.335Z
 */
public class TpClusterQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected boolean local_enableSNMP;
    protected String local_acceptLanguage;
    protected ArrayOfTpClusterWrapper local_tpClusters;

    public TpClusterQueryResponseWrapper() {}

    public TpClusterQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse tpclusterqueryresponse)
    {
        copy( tpclusterqueryresponse );
    }
    public TpClusterQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _enableSNMP, String _acceptLanguage, ArrayOfTpClusterWrapper _tpClusters )
    {
        this.local_exceptions = _exceptions;
        this.local_enableSNMP = _enableSNMP;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_tpClusters = _tpClusters;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_enableSNMP = raw.getEnableSNMP();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        if (raw.getTpClusters() != null)
            this.local_tpClusters = new ArrayOfTpClusterWrapper( raw.getTpClusters());

    }

    @Override
    public String toString()
    {
        return "TpClusterQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "enableSNMP = " + local_enableSNMP + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "tpClusters = " + local_tpClusters + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterQueryResponse();
        raw.setEnableSNMP( local_enableSNMP);
        raw.setAcceptLanguage( local_acceptLanguage);
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
    public void setTpClusters( ArrayOfTpClusterWrapper _tpClusters )
    {
        this.local_tpClusters = _tpClusters;
    }
    public ArrayOfTpClusterWrapper getTpClusters( )
    {
        return this.local_tpClusters;
    }
}