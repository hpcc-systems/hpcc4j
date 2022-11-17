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
 * Class name: RoxieControlCmdTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-10-27T20:17:20.606Z
 */
public class RoxieControlCmdTypeWrapper
{
    protected String local_roxieControlCmdType;

    public RoxieControlCmdTypeWrapper() {}

    public RoxieControlCmdTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType roxiecontrolcmdtype)
    {
        copy( roxiecontrolcmdtype );
    }
    public RoxieControlCmdTypeWrapper( String _roxieControlCmdType )
    {
        this.local_roxieControlCmdType = _roxieControlCmdType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getRoxieControlCmdType();

    }

    @Override
    public String toString()
    {
        return "RoxieControlCmdTypeWrapper [" + "roxieControlCmdType = " + local_roxieControlCmdType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieControlCmdType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setRoxieControlCmdType(roxieControlCmdType);
        return raw;
    }


    public void setRoxieControlCmdType( String _roxieControlCmdType )
    {
        this.local_roxieControlCmdType = _roxieControlCmdType;
    }
    public String getRoxieControlCmdType( )
    {
        return this.local_roxieControlCmdType;
    }
}