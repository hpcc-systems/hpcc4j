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
 * Class name: GetStatusServerInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class GetStatusServerInfoWrapper
{
    protected String local_serverName;
    protected String local_serverType;
    protected String local_networkAddress;
    protected int local_port;

    public GetStatusServerInfoWrapper() {}

    public GetStatusServerInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo getstatusserverinfo)
    {
        copy( getstatusserverinfo );
    }
    public GetStatusServerInfoWrapper( String _serverName, String _serverType, String _networkAddress, int _port )
    {
        this.local_serverName = _serverName;
        this.local_serverType = _serverType;
        this.local_networkAddress = _networkAddress;
        this.local_port = _port;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo raw )
    {
        if (raw == null)
            return;

        this.local_serverName = raw.getServerName();
        this.local_serverType = raw.getServerType();
        this.local_networkAddress = raw.getNetworkAddress();
        this.local_port = raw.getPort();

    }

    @Override
    public String toString()
    {
        return "GetStatusServerInfoWrapper [" + "serverName = " + local_serverName + ", " + "serverType = " + local_serverType + ", " + "networkAddress = " + local_networkAddress + ", " + "port = " + local_port + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetStatusServerInfo();
        raw.setServerName( local_serverName);
        raw.setServerType( local_serverType);
        raw.setNetworkAddress( local_networkAddress);
        raw.setPort( local_port);
        return raw;
    }


    public void setServerName( String _serverName )
    {
        this.local_serverName = _serverName;
    }
    public String getServerName( )
    {
        return this.local_serverName;
    }
    public void setServerType( String _serverType )
    {
        this.local_serverType = _serverType;
    }
    public String getServerType( )
    {
        return this.local_serverType;
    }
    public void setNetworkAddress( String _networkAddress )
    {
        this.local_networkAddress = _networkAddress;
    }
    public String getNetworkAddress( )
    {
        return this.local_networkAddress;
    }
    public void setPort( int _port )
    {
        this.local_port = _port;
    }
    public int getPort( )
    {
        return this.local_port;
    }
}