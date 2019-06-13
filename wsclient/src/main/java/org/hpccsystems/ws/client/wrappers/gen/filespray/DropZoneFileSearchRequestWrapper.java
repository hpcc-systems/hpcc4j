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
 * Class name: DropZoneFileSearchRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.871Z
 */
public class DropZoneFileSearchRequestWrapper
{
protected String local_dropZoneName;
protected String local_server;
protected boolean local_eCLWatchVisibleOnly;
protected String local_nameFilter;

	public DropZoneFileSearchRequestWrapper() {}

	public DropZoneFileSearchRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest dropzonefilesearchrequest)
	{
		copy( dropzonefilesearchrequest );
	}
	public DropZoneFileSearchRequestWrapper( String _dropZoneName, String _server, boolean _eCLWatchVisibleOnly, String _nameFilter )
	{
		this.local_dropZoneName = _dropZoneName;
		this.local_server = _server;
		this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
		this.local_nameFilter = _nameFilter;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest raw )
	{
		if (raw == null)
			return;

		this.local_dropZoneName = raw.getDropZoneName();
		this.local_server = raw.getServer();
		this.local_eCLWatchVisibleOnly = raw.getECLWatchVisibleOnly();
		this.local_nameFilter = raw.getNameFilter();

	}

	@Override
	public String toString()
	{
		return "DropZoneFileSearchRequestWrapper [" + "dropZoneName = " + local_dropZoneName + ", " + "server = " + local_server + ", " + "eCLWatchVisibleOnly = " + local_eCLWatchVisibleOnly + ", " + "nameFilter = " + local_nameFilter + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DropZoneFileSearchRequest();
		raw.setDropZoneName( local_dropZoneName);
		raw.setServer( local_server);
		raw.setECLWatchVisibleOnly( local_eCLWatchVisibleOnly);
		raw.setNameFilter( local_nameFilter);
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
	public void setServer( String _server )
	{
		this.local_server = _server;
	}
	public String getServer( )
	{
		return this.local_server;
	}
	public void setECLWatchVisibleOnly( boolean _eCLWatchVisibleOnly )
	{
		this.local_eCLWatchVisibleOnly = _eCLWatchVisibleOnly;
	}
	public boolean getECLWatchVisibleOnly( )
	{
		return this.local_eCLWatchVisibleOnly;
	}
	public void setNameFilter( String _nameFilter )
	{
		this.local_nameFilter = _nameFilter;
	}
	public String getNameFilter( )
	{
		return this.local_nameFilter;
	}
}