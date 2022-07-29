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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfServerInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.791Z
 */
public class ArrayOfServerInfoWrapper
{
    protected List<ServerInfoWrapper> local_serverInfo = null;

    public ArrayOfServerInfoWrapper() {}

    public ArrayOfServerInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo arrayofserverinfo)
    {
        copy( arrayofserverinfo );
    }
    public ArrayOfServerInfoWrapper( List<ServerInfoWrapper> _serverInfo )
    {
        this.local_serverInfo = _serverInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo raw )
    {
        if (raw == null)
            return;

        if (raw.getServerInfo() != null)
        {
            this.local_serverInfo = new ArrayList<ServerInfoWrapper>();
            for ( int i = 0; i < raw.getServerInfo().length; i++)
            {
                this.local_serverInfo.add(new ServerInfoWrapper(raw.getServerInfo()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfServerInfoWrapper [" + "serverInfo = " + local_serverInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfServerInfo();
        if (this.local_serverInfo!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ServerInfo[this.local_serverInfo.size()];
            for ( int i = 0; i < this.local_serverInfo.size(); i++)
            {
                arr[i] = this.local_serverInfo.get(i) .getRaw();
            }
            raw.setServerInfo(arr);
        }
        return raw;
    }


    public void setServerInfo( List<ServerInfoWrapper> _serverInfo )
    {
        this.local_serverInfo = _serverInfo;
    }
    public List<ServerInfoWrapper> getServerInfo( )
    {
        return this.local_serverInfo;
    }
}