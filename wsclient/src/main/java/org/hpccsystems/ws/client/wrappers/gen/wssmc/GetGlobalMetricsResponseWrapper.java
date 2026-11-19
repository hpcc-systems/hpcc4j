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
 * Class name: GetGlobalMetricsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GetGlobalMetricsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected GlobalMetrics_type0Wrapper local_globalMetrics;

    public GetGlobalMetricsResponseWrapper() {}

    public GetGlobalMetricsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse getglobalmetricsresponse)
    {
        copy( getglobalmetricsresponse );
    }
    public GetGlobalMetricsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, GlobalMetrics_type0Wrapper _globalMetrics )
    {
        this.local_exceptions = _exceptions;
        this.local_globalMetrics = _globalMetrics;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getGlobalMetrics() != null)
            this.local_globalMetrics = new GlobalMetrics_type0Wrapper( raw.getGlobalMetrics());

    }

    @Override
    public String toString()
    {
        return "GetGlobalMetricsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "globalMetrics = " + local_globalMetrics + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetGlobalMetricsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_globalMetrics != null)
            raw.setGlobalMetrics( local_globalMetrics.getRaw());
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
    public void setGlobalMetrics( GlobalMetrics_type0Wrapper _globalMetrics )
    {
        this.local_globalMetrics = _globalMetrics;
    }
    public GlobalMetrics_type0Wrapper getGlobalMetrics( )
    {
        return this.local_globalMetrics;
    }
}