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
 * Class name: TpMachineInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.480Z
 */
public class TpMachineInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected TpMachineWrapper local_machineInfo;

    public TpMachineInfoResponseWrapper() {}

    public TpMachineInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse tpmachineinforesponse)
    {
        copy( tpmachineinforesponse );
    }
    public TpMachineInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, TpMachineWrapper _machineInfo )
    {
        this.local_exceptions = _exceptions;
        this.local_machineInfo = _machineInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getMachineInfo() != null)
            this.local_machineInfo = new TpMachineWrapper( raw.getMachineInfo());

    }

    @Override
    public String toString()
    {
        return "TpMachineInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "machineInfo = " + local_machineInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_machineInfo != null)
            raw.setMachineInfo( local_machineInfo.getRaw());
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
    public void setMachineInfo( TpMachineWrapper _machineInfo )
    {
        this.local_machineInfo = _machineInfo;
    }
    public TpMachineWrapper getMachineInfo( )
    {
        return this.local_machineInfo;
    }
}