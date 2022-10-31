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
 * Class name: RoxieControlCmdResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.313Z
 */
public class RoxieControlCmdResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Endpoints_type0Wrapper local_endpoints;

    public RoxieControlCmdResponseWrapper() {}

    public RoxieControlCmdResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse roxiecontrolcmdresponse)
    {
        copy( roxiecontrolcmdresponse );
    }
    public RoxieControlCmdResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Endpoints_type0Wrapper _endpoints )
    {
        this.local_exceptions = _exceptions;
        this.local_endpoints = _endpoints;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getEndpoints() != null)
            this.local_endpoints = new Endpoints_type0Wrapper( raw.getEndpoints());

    }

    @Override
    public String toString()
    {
        return "RoxieControlCmdResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "endpoints = " + local_endpoints + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_endpoints != null)
            raw.setEndpoints( local_endpoints.getRaw());
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
    public void setEndpoints( Endpoints_type0Wrapper _endpoints )
    {
        this.local_endpoints = _endpoints;
    }
    public Endpoints_type0Wrapper getEndpoints( )
    {
        return this.local_endpoints;
    }
}