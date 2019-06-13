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
 * Class name: DeleteDropZoneFilesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.837Z
 */
public class DeleteDropZoneFilesRequestWrapper
{
protected String local_dropZoneName;
protected String local_netAddress;
protected String local_path;
protected String local_oS;
protected EspStringArrayWrapper local_names;

	public DeleteDropZoneFilesRequestWrapper() {}

	public DeleteDropZoneFilesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest deletedropzonefilesrequest)
	{
		copy( deletedropzonefilesrequest );
	}
	public DeleteDropZoneFilesRequestWrapper( String _dropZoneName, String _netAddress, String _path, String _oS, EspStringArrayWrapper _names )
	{
		this.local_dropZoneName = _dropZoneName;
		this.local_netAddress = _netAddress;
		this.local_path = _path;
		this.local_oS = _oS;
		this.local_names = _names;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest raw )
	{
		if (raw == null)
			return;

		this.local_dropZoneName = raw.getDropZoneName();
		this.local_netAddress = raw.getNetAddress();
		this.local_path = raw.getPath();
		this.local_oS = raw.getOS();
		this.local_names = new EspStringArrayWrapper( raw.getNames());

	}

	@Override
	public String toString()
	{
		return "DeleteDropZoneFilesRequestWrapper [" + "dropZoneName = " + local_dropZoneName + ", " + "netAddress = " + local_netAddress + ", " + "path = " + local_path + ", " + "oS = " + local_oS + ", " + "names = " + local_names + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDropZoneFilesRequest();
		raw.setDropZoneName( local_dropZoneName);
		raw.setNetAddress( local_netAddress);
		raw.setPath( local_path);
		raw.setOS( local_oS);
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
	public void setNames( EspStringArrayWrapper _names )
	{
		this.local_names = _names;
	}
	public EspStringArrayWrapper getNames( )
	{
		return this.local_names;
	}
}