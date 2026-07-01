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
 * Class name: TpComponentConfigurationResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpComponentConfigurationResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected TpConfigResponseFormatWrapper local_configFormat;
    protected Results_type0Wrapper local_results;

    public TpComponentConfigurationResponseWrapper() {}

    public TpComponentConfigurationResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse tpcomponentconfigurationresponse)
    {
        copy( tpcomponentconfigurationresponse );
    }
    public TpComponentConfigurationResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, TpConfigResponseFormatWrapper _configFormat, Results_type0Wrapper _results )
    {
        this.local_exceptions = _exceptions;
        this.local_configFormat = _configFormat;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getConfigFormat() != null)
            this.local_configFormat = new TpConfigResponseFormatWrapper( raw.getConfigFormat());
        if (raw.getResults() != null)
            this.local_results = new Results_type0Wrapper( raw.getResults());

    }

    @Override
    public String toString()
    {
        return "TpComponentConfigurationResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "configFormat = " + local_configFormat + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpComponentConfigurationResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_configFormat != null)
            raw.setConfigFormat( local_configFormat.getRaw());
        if (local_results != null)
            raw.setResults( local_results.getRaw());
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
    public void setConfigFormat( TpConfigResponseFormatWrapper _configFormat )
    {
        this.local_configFormat = _configFormat;
    }
    public TpConfigResponseFormatWrapper getConfigFormat( )
    {
        return this.local_configFormat;
    }
    public void setResults( Results_type0Wrapper _results )
    {
        this.local_results = _results;
    }
    public Results_type0Wrapper getResults( )
    {
        return this.local_results;
    }
}