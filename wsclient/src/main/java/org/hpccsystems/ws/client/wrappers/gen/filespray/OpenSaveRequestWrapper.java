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
 * Class name: OpenSaveRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.914Z
 */
public class OpenSaveRequestWrapper
{
protected String local_location;
protected String local_path;
protected String local_name;
protected String local_type;
protected String local_dateTime;
protected boolean local_binaryFile;

	public OpenSaveRequestWrapper() {}

	public OpenSaveRequestWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest opensaverequest)
	{
		copy( opensaverequest );
	}
	public OpenSaveRequestWrapper( String _location, String _path, String _name, String _type, String _dateTime, boolean _binaryFile )
	{
		this.local_location = _location;
		this.local_path = _path;
		this.local_name = _name;
		this.local_type = _type;
		this.local_dateTime = _dateTime;
		this.local_binaryFile = _binaryFile;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest raw )
	{
		if (raw == null)
			return;

		this.local_location = raw.getLocation();
		this.local_path = raw.getPath();
		this.local_name = raw.getName();
		this.local_type = raw.getType();
		this.local_dateTime = raw.getDateTime();
		this.local_binaryFile = raw.getBinaryFile();

	}

	@Override
	public String toString()
	{
		return "OpenSaveRequestWrapper [" + "location = " + local_location + ", " + "path = " + local_path + ", " + "name = " + local_name + ", " + "type = " + local_type + ", " + "dateTime = " + local_dateTime + ", " + "binaryFile = " + local_binaryFile + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.OpenSaveRequest();
		raw.setLocation( local_location);
		raw.setPath( local_path);
		raw.setName( local_name);
		raw.setType( local_type);
		raw.setDateTime( local_dateTime);
		raw.setBinaryFile( local_binaryFile);
		return raw;
	}


	public void setLocation( String _location )
	{
		this.local_location = _location;
	}
	public String getLocation( )
	{
		return this.local_location;
	}
	public void setPath( String _path )
	{
		this.local_path = _path;
	}
	public String getPath( )
	{
		return this.local_path;
	}
	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
	public void setType( String _type )
	{
		this.local_type = _type;
	}
	public String getType( )
	{
		return this.local_type;
	}
	public void setDateTime( String _dateTime )
	{
		this.local_dateTime = _dateTime;
	}
	public String getDateTime( )
	{
		return this.local_dateTime;
	}
	public void setBinaryFile( boolean _binaryFile )
	{
		this.local_binaryFile = _binaryFile;
	}
	public boolean getBinaryFile( )
	{
		return this.local_binaryFile;
	}
}