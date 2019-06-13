package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: DropZoneFilesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.874Z
 */
public class DropZoneFilesRequestWrapper
{
protected String local_dropZoneName;
protected String local_netAddress;
protected String local_path;
protected String local_oS;
protected String local_subfolder;
protected boolean local_eCLWatchVisibleOnly;
protected boolean local_directoryOnly;

	public DropZoneFilesRequestWrapper() {}

	public DropZoneFilesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest dropzonefilesrequest)
	{
		copy( dropzonefilesrequest );
	}
	public DropZoneFilesRequestWrapper( String _dropZoneName, String _netAddress, String _path, String _oS, String _subfolder, boolean _eCLWatchVisibleOnly, boolean _directoryOnly )
	{
		this.local_dropZoneName = _dropZoneName;
		this.local_netAddress = _netAddress;
		this.local_path = _path;
		this.local_oS = _oS;
		this.local_subfolder = _subfolder;
		this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
		this.local_directoryOnly = _directoryOnly;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest raw )
	{
		if (raw == null)
			return;

		this.local_dropZoneName = raw.getDropZoneName();
		this.local_netAddress = raw.getNetAddress();
		this.local_path = raw.getPath();
		this.local_oS = raw.getOS();
		this.local_subfolder = raw.getSubfolder();
		this.local_eCLWatchVisibleOnly = raw.getECLWatchVisibleOnly();
		this.local_directoryOnly = raw.getDirectoryOnly();

	}

	@Override
	public String toString()
	{
		return "DropZoneFilesRequestWrapper [" + "dropZoneName = " + local_dropZoneName + ", " + "netAddress = " + local_netAddress + ", " + "path = " + local_path + ", " + "oS = " + local_oS + ", " + "subfolder = " + local_subfolder + ", " + "eCLWatchVisibleOnly = " + local_eCLWatchVisibleOnly + ", " + "directoryOnly = " + local_directoryOnly + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFilesRequest();
		raw.setDropZoneName( local_dropZoneName);
		raw.setNetAddress( local_netAddress);
		raw.setPath( local_path);
		raw.setOS( local_oS);
		raw.setSubfolder( local_subfolder);
		raw.setECLWatchVisibleOnly( local_eCLWatchVisibleOnly);
		raw.setDirectoryOnly( local_directoryOnly);
		return raw;
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
	public void setOS( String _oS )
	{
		this.local_oS = _oS;
	}
	public String getOS( )
	{
		return this.local_oS;
	}
	public void setSubfolder( String _subfolder )
	{
		this.local_subfolder = _subfolder;
	}
	public String getSubfolder( )
	{
		return this.local_subfolder;
	}
	public void setECLWatchVisibleOnly( boolean _eCLWatchVisibleOnly )
	{
		this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
	}
	public boolean getECLWatchVisibleOnly( )
	{
		return this.local_eCLWatchVisibleOnly;
	}
	public void setDirectoryOnly( boolean _directoryOnly )
	{
		this.local_directoryOnly = _directoryOnly;
	}
	public boolean getDirectoryOnly( )
	{
		return this.local_directoryOnly;
	}
}