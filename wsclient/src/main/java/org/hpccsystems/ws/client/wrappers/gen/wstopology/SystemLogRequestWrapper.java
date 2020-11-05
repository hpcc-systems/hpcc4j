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
 * Class name: SystemLogRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-09-23T21:40:52.928Z
 */
public class SystemLogRequestWrapper
{
	protected String local_name;
	protected String local_type;
	protected int local_zip;

	public SystemLogRequestWrapper() {}

	public SystemLogRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest systemlogrequest)
	{
		copy( systemlogrequest );
	}
	public SystemLogRequestWrapper( String _name, String _type, int _zip )
	{
		this.local_name = _name;
		this.local_type = _type;
		this.local_zip = _zip;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_type = raw.getType();
		this.local_zip = raw.getZip();

	}

	@Override
	public String toString()
	{
		return "SystemLogRequestWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "zip = " + local_zip + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_30.SystemLogRequest();
		raw.setName( local_name);
		raw.setType( local_type);
		raw.setZip( local_zip);
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
	public void setType( String _type )
	{
		this.local_type = _type;
	}
	public String getType( )
	{
		return this.local_type;
	}
	public void setZip( int _zip )
	{
		this.local_zip = _zip;
	}
	public int getZip( )
	{
		return this.local_zip;
	}
}