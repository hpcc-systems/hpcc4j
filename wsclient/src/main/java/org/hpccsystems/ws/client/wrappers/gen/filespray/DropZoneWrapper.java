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
 * Class name: DropZoneWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 */
public class DropZoneWrapper
{
    protected String local_name;
    protected String local_netAddress;
    protected String local_path;
    protected String local_computer;
    protected String local_linux;

    public DropZoneWrapper() {}

    public DropZoneWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone dropzone)
    {
        copy( dropzone );
    }
    public DropZoneWrapper( String _name, String _netAddress, String _path, String _computer, String _linux )
    {
        this.local_name = _name;
        this.local_netAddress = _netAddress;
        this.local_path = _path;
        this.local_computer = _computer;
        this.local_linux = _linux;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_netAddress = raw.getNetAddress();
        this.local_path = raw.getPath();
        this.local_computer = raw.getComputer();
        this.local_linux = raw.getLinux();

    }

    @Override
    public String toString()
    {
        return "DropZoneWrapper [" + "name = " + local_name + ", " + "netAddress = " + local_netAddress + ", " + "path = " + local_path + ", " + "computer = " + local_computer + ", " + "linux = " + local_linux + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZone();
        raw.setName( local_name);
        raw.setNetAddress( local_netAddress);
        raw.setPath( local_path);
        raw.setComputer( local_computer);
        raw.setLinux( local_linux);
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
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setComputer( String _computer )
    {
        this.local_computer = _computer;
    }
    public String getComputer( )
    {
        return this.local_computer;
    }
    public void setLinux( String _linux )
    {
        this.local_linux = _linux;
    }
    public String getLinux( )
    {
        return this.local_linux;
    }
}