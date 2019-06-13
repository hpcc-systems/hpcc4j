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
 * Class name: FileListRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.887Z
 */
public class FileListRequestWrapper
{
protected String local_netaddr;
protected String local_path;
protected String local_mask;
protected String local_oS;
protected boolean local_directoryOnly;

	public FileListRequestWrapper() {}

	public FileListRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest filelistrequest)
	{
		copy( filelistrequest );
	}
	public FileListRequestWrapper( String _netaddr, String _path, String _mask, String _oS, boolean _directoryOnly )
	{
		this.local_netaddr = _netaddr;
		this.local_path = _path;
		this.local_mask = _mask;
		this.local_oS = _oS;
		this.local_directoryOnly = _directoryOnly;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest raw )
	{
		if (raw == null)
			return;

		this.local_netaddr = raw.getNetaddr();
		this.local_path = raw.getPath();
		this.local_mask = raw.getMask();
		this.local_oS = raw.getOS();
		this.local_directoryOnly = raw.getDirectoryOnly();

	}

	@Override
	public String toString()
	{
		return "FileListRequestWrapper [" + "netaddr = " + local_netaddr + ", " + "path = " + local_path + ", " + "mask = " + local_mask + ", " + "oS = " + local_oS + ", " + "directoryOnly = " + local_directoryOnly + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.FileListRequest();
		raw.setNetaddr( local_netaddr);
		raw.setPath( local_path);
		raw.setMask( local_mask);
		raw.setOS( local_oS);
		raw.setDirectoryOnly( local_directoryOnly);
		return raw;
	}


	public void setNetaddr( String _netaddr )
	{
		this.local_netaddr = _netaddr;
	}
	public String getNetaddr( )
	{
		return this.local_netaddr;
	}
	public void setPath( String _path )
	{
		this.local_path = _path;
	}
	public String getPath( )
	{
		return this.local_path;
	}
	public void setMask( String _mask )
	{
		this.local_mask = _mask;
	}
	public String getMask( )
	{
		return this.local_mask;
	}
	public void setOS( String _oS )
	{
		this.local_oS = _oS;
	}
	public String getOS( )
	{
		return this.local_oS;
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