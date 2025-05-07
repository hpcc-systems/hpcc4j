package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: GetModulesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetModulesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLModuleWrapper local_outModules;

    public GetModulesResponseWrapper() {}

    public GetModulesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse getmodulesresponse)
    {
        copy( getmodulesresponse );
    }
    public GetModulesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLModuleWrapper _outModules )
    {
        this.local_exceptions = _exceptions;
        this.local_outModules = _outModules;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getOutModules() != null)
            this.local_outModules = new ArrayOfECLModuleWrapper( raw.getOutModules());

    }

    @Override
    public String toString()
    {
        return "GetModulesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "outModules = " + local_outModules + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModulesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_outModules != null)
            raw.setOutModules( local_outModules.getRaw());
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
    public void setOutModules( ArrayOfECLModuleWrapper _outModules )
    {
        this.local_outModules = _outModules;
    }
    public ArrayOfECLModuleWrapper getOutModules( )
    {
        return this.local_outModules;
    }
}