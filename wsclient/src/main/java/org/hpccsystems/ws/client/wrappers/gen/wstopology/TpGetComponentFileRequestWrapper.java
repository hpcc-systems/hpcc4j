package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpGetComponentFileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-09-23T21:40:52.956Z
 */
public class TpGetComponentFileRequestWrapper
{
	protected String local_compType;
	protected String local_compName;
	protected String local_netAddress;
	protected String local_directory;
	protected String local_fileType;
	protected int local_osType;
	protected String local_plainText;

	public TpGetComponentFileRequestWrapper() {}

	public TpGetComponentFileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest tpgetcomponentfilerequest)
	{
		copy( tpgetcomponentfilerequest );
	}
	public TpGetComponentFileRequestWrapper( String _compType, String _compName, String _netAddress, String _directory, String _fileType, int _osType, String _plainText )
	{
		this.local_compType = _compType;
		this.local_compName = _compName;
		this.local_netAddress = _netAddress;
		this.local_directory = _directory;
		this.local_fileType = _fileType;
		this.local_osType = _osType;
		this.local_plainText = _plainText;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest raw )
	{
		if (raw == null)
			return;

		this.local_compType = raw.getCompType();
		this.local_compName = raw.getCompName();
		this.local_netAddress = raw.getNetAddress();
		this.local_directory = raw.getDirectory();
		this.local_fileType = raw.getFileType();
		this.local_osType = raw.getOsType();
		this.local_plainText = raw.getPlainText();

	}

	@Override
	public String toString()
	{
		return "TpGetComponentFileRequestWrapper [" + "compType = " + local_compType + ", " + "compName = " + local_compName + ", " + "netAddress = " + local_netAddress + ", " + "directory = " + local_directory + ", " + "fileType = " + local_fileType + ", " + "osType = " + local_osType + ", " + "plainText = " + local_plainText + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.TpGetComponentFileRequest();
		raw.setCompType( local_compType);
		raw.setCompName( local_compName);
		raw.setNetAddress( local_netAddress);
		raw.setDirectory( local_directory);
		raw.setFileType( local_fileType);
		raw.setOsType( local_osType);
		raw.setPlainText( local_plainText);
		return raw;
	}


	public void setCompType( String _compType )
	{
		this.local_compType = _compType;
	}
	public String getCompType( )
	{
		return this.local_compType;
	}
	public void setCompName( String _compName )
	{
		this.local_compName = _compName;
	}
	public String getCompName( )
	{
		return this.local_compName;
	}
	public void setNetAddress( String _netAddress )
	{
		this.local_netAddress = _netAddress;
	}
	public String getNetAddress( )
	{
		return this.local_netAddress;
	}
	public void setDirectory( String _directory )
	{
		this.local_directory = _directory;
	}
	public String getDirectory( )
	{
		return this.local_directory;
	}
	public void setFileType( String _fileType )
	{
		this.local_fileType = _fileType;
	}
	public String getFileType( )
	{
		return this.local_fileType;
	}
	public void setOsType( int _osType )
	{
		this.local_osType = _osType;
	}
	public int getOsType( )
	{
		return this.local_osType;
	}
	public void setPlainText( String _plainText )
	{
		this.local_plainText = _plainText;
	}
	public String getPlainText( )
	{
		return this.local_plainText;
	}
}