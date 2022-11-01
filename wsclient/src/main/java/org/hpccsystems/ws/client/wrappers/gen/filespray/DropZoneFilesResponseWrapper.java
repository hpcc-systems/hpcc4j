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
 * Class name: DropZoneFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.820Z
 */
public class DropZoneFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_dropZoneName;
    protected String local_netAddress;
    protected String local_path;
    protected int local_oS;
    protected boolean local_eCLWatchVisibleOnly;
    protected ArrayOfDropZoneWrapper local_dropZones;
    protected ArrayOfPhysicalFileStructWrapper local_files;

    public DropZoneFilesResponseWrapper() {}

    public DropZoneFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse dropzonefilesresponse)
    {
        copy( dropzonefilesresponse );
    }
    public DropZoneFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _dropZoneName, String _netAddress, String _path, int _oS, boolean _eCLWatchVisibleOnly, ArrayOfDropZoneWrapper _dropZones, ArrayOfPhysicalFileStructWrapper _files )
    {
        this.local_exceptions = _exceptions;
        this.local_dropZoneName = _dropZoneName;
        this.local_netAddress = _netAddress;
        this.local_path = _path;
        this.local_oS = _oS;
        this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
        this.local_dropZones = _dropZones;
        this.local_files = _files;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_dropZoneName = raw.getDropZoneName();
        this.local_netAddress = raw.getNetAddress();
        this.local_path = raw.getPath();
        this.local_oS = raw.getOS();
        this.local_eCLWatchVisibleOnly = raw.getECLWatchVisibleOnly();
        if (raw.getDropZones() != null)
            this.local_dropZones = new ArrayOfDropZoneWrapper( raw.getDropZones());
        if (raw.getFiles() != null)
            this.local_files = new ArrayOfPhysicalFileStructWrapper( raw.getFiles());

    }

    @Override
    public String toString()
    {
        return "DropZoneFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "dropZoneName = " + local_dropZoneName + ", " + "netAddress = " + local_netAddress + ", " + "path = " + local_path + ", " + "oS = " + local_oS + ", " + "eCLWatchVisibleOnly = " + local_eCLWatchVisibleOnly + ", " + "dropZones = " + local_dropZones + ", " + "files = " + local_files + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DropZoneFilesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setDropZoneName( local_dropZoneName);
        raw.setNetAddress( local_netAddress);
        raw.setPath( local_path);
        raw.setOS( local_oS);
        raw.setECLWatchVisibleOnly( local_eCLWatchVisibleOnly);
        if (local_dropZones != null)
            raw.setDropZones( local_dropZones.getRaw());
        if (local_files != null)
            raw.setFiles( local_files.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setDropZoneName( String _dropZoneName )
    {
        this.local_dropZoneName = _dropZoneName;
    }
    public String getDropZoneName( )
    {
        return this.local_dropZoneName;
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
    public void setOS( int _oS )
    {
        this.local_oS = _oS;
    }
    public int getOS( )
    {
        return this.local_oS;
    }
    public void setECLWatchVisibleOnly( boolean _eCLWatchVisibleOnly )
    {
        this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
    }
    public boolean getECLWatchVisibleOnly( )
    {
        return this.local_eCLWatchVisibleOnly;
    }
    public void setDropZones( ArrayOfDropZoneWrapper _dropZones )
    {
        this.local_dropZones = _dropZones;
    }
    public ArrayOfDropZoneWrapper getDropZones( )
    {
        return this.local_dropZones;
    }
    public void setFiles( ArrayOfPhysicalFileStructWrapper _files )
    {
        this.local_files = _files;
    }
    public ArrayOfPhysicalFileStructWrapper getFiles( )
    {
        return this.local_files;
    }
}