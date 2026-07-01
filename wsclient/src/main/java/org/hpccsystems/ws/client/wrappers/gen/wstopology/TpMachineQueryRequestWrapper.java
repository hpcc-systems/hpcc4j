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
 * Class name: TpMachineQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpMachineQueryRequestWrapper
{
    protected TpMachineTypeWrapper local_type;
    protected String local_cluster;
    protected String local_oldIP;
    protected String local_path;
    protected String local_directory;
    protected String local_logDirectory;

    public TpMachineQueryRequestWrapper() {}

    public TpMachineQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest tpmachinequeryrequest)
    {
        copy( tpmachinequeryrequest );
    }
    public TpMachineQueryRequestWrapper( TpMachineTypeWrapper _type, String _cluster, String _oldIP, String _path, String _directory, String _logDirectory )
    {
        this.local_type = _type;
        this.local_cluster = _cluster;
        this.local_oldIP = _oldIP;
        this.local_path = _path;
        this.local_directory = _directory;
        this.local_logDirectory = _logDirectory;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
            this.local_type = new TpMachineTypeWrapper( raw.getType());
        this.local_cluster = raw.getCluster();
        this.local_oldIP = raw.getOldIP();
        this.local_path = raw.getPath();
        this.local_directory = raw.getDirectory();
        this.local_logDirectory = raw.getLogDirectory();

    }

    @Override
    public String toString()
    {
        return "TpMachineQueryRequestWrapper [" + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "oldIP = " + local_oldIP + ", " + "path = " + local_path + ", " + "directory = " + local_directory + ", " + "logDirectory = " + local_logDirectory + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpMachineQueryRequest();
        if (local_type != null)
            raw.setType( local_type.getRaw());
        raw.setCluster( local_cluster);
        raw.setOldIP( local_oldIP);
        raw.setPath( local_path);
        raw.setDirectory( local_directory);
        raw.setLogDirectory( local_logDirectory);
        return raw;
    }


    public void setType( TpMachineTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public TpMachineTypeWrapper getType( )
    {
        return this.local_type;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setOldIP( String _oldIP )
    {
        this.local_oldIP = _oldIP;
    }
    public String getOldIP( )
    {
        return this.local_oldIP;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setDirectory( String _directory )
    {
        this.local_directory = _directory;
    }
    public String getDirectory( )
    {
        return this.local_directory;
    }
    public void setLogDirectory( String _logDirectory )
    {
        this.local_logDirectory = _logDirectory;
    }
    public String getLogDirectory( )
    {
        return this.local_logDirectory;
    }
}