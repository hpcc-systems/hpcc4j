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
 * Class name: TpSetMachineStatusRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpSetMachineStatusRequestWrapper
{
    protected String local_machinePath;
    protected String local_statusValue;

    public TpSetMachineStatusRequestWrapper() {}

    public TpSetMachineStatusRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest tpsetmachinestatusrequest)
    {
        copy( tpsetmachinestatusrequest );
    }
    public TpSetMachineStatusRequestWrapper( String _machinePath, String _statusValue )
    {
        this.local_machinePath = _machinePath;
        this.local_statusValue = _statusValue;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest raw )
    {
        if (raw == null)
            return;

        this.local_machinePath = raw.getMachinePath();
        this.local_statusValue = raw.getStatusValue();

    }

    @Override
    public String toString()
    {
        return "TpSetMachineStatusRequestWrapper [" + "machinePath = " + local_machinePath + ", " + "statusValue = " + local_statusValue + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSetMachineStatusRequest();
        raw.setMachinePath( local_machinePath);
        raw.setStatusValue( local_statusValue);
        return raw;
    }


    public void setMachinePath( String _machinePath )
    {
        this.local_machinePath = _machinePath;
    }
    public String getMachinePath( )
    {
        return this.local_machinePath;
    }
    public void setStatusValue( String _statusValue )
    {
        this.local_statusValue = _statusValue;
    }
    public String getStatusValue( )
    {
        return this.local_statusValue;
    }
}