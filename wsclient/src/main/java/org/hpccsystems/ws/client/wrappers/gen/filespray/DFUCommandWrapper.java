package org.hpccsystems.ws.client.wrappers.gen.filespray;

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
 * Class name: DFUCommandWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUCommand
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class DFUCommandWrapper
{
    protected String local_dFUCommand;

    public DFUCommandWrapper() {}

    public DFUCommandWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUCommand dfucommand)
    {
        copy( dfucommand );
    }
    public DFUCommandWrapper( String _dFUCommand )
    {
        this.local_dFUCommand = _dFUCommand;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUCommand raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getDFUCommand();

    }

    @Override
    public String toString()
    {
        return "DFUCommandWrapper [" + "dFUCommand = " + local_dFUCommand + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUCommand getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUCommand raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setDFUCommand(dFUCommand);
        return raw;
    }


    public void setDFUCommand( String _dFUCommand )
    {
        this.local_dFUCommand = _dFUCommand;
    }
    public String getDFUCommand( )
    {
        return this.local_dFUCommand;
    }
}