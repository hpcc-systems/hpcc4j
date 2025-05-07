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
 * Class name: TpMachineTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpMachineTypeWrapper
{
    protected String local_tpMachineType;

    public TpMachineTypeWrapper() {}

    public TpMachineTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType tpmachinetype)
    {
        copy( tpmachinetype );
    }
    public TpMachineTypeWrapper( String _tpMachineType )
    {
        this.local_tpMachineType = _tpMachineType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getTpMachineType();

    }

    @Override
    public String toString()
    {
        return "TpMachineTypeWrapper [" + "tpMachineType = " + local_tpMachineType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setTpMachineType(tpMachineType);
        return raw;
    }


    public void setTpMachineType( String _tpMachineType )
    {
        this.local_tpMachineType = _tpMachineType;
    }
    public String getTpMachineType( )
    {
        return this.local_tpMachineType;
    }
}