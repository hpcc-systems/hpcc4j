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
 * Class name: TpListLogFilesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpListLogFilesRequestWrapper
{
    protected String local_networkAddress;
    protected String local_path;

    public TpListLogFilesRequestWrapper() {}

    public TpListLogFilesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest tplistlogfilesrequest)
    {
        copy( tplistlogfilesrequest );
    }
    public TpListLogFilesRequestWrapper( String _networkAddress, String _path )
    {
        this.local_networkAddress = _networkAddress;
        this.local_path = _path;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest raw )
    {
        if (raw == null)
            return;

        this.local_networkAddress = raw.getNetworkAddress();
        this.local_path = raw.getPath();

    }

    @Override
    public String toString()
    {
        return "TpListLogFilesRequestWrapper [" + "networkAddress = " + local_networkAddress + ", " + "path = " + local_path + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesRequest();
        raw.setNetworkAddress( local_networkAddress);
        raw.setPath( local_path);
        return raw;
    }


    public void setNetworkAddress( String _networkAddress )
    {
        this.local_networkAddress = _networkAddress;
    }
    public String getNetworkAddress( )
    {
        return this.local_networkAddress;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
}