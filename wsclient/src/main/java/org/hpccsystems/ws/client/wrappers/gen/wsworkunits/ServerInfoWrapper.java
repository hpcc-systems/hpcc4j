package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ServerInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.867Z
 */
public class ServerInfoWrapper
{
    protected String local_name;
    protected String local_netAddress;

    public ServerInfoWrapper() {}

    public ServerInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo serverinfo)
    {
        copy( serverinfo );
    }
    public ServerInfoWrapper( String _name, String _netAddress )
    {
        this.local_name = _name;
        this.local_netAddress = _netAddress;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_netAddress = raw.getNetAddress();

    }

    @Override
    public String toString()
    {
        return "ServerInfoWrapper [" + "name = " + local_name + ", " + "netAddress = " + local_netAddress + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo();
        raw.setName( local_name);
        raw.setNetAddress( local_netAddress);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setNetAddress( String _netAddress )
    {
        this.local_netAddress = _netAddress;
    }
    public String getNetAddress( )
    {
        return this.local_netAddress;
    }
}