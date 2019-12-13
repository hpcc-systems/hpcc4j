package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: SuperFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.566Z
 */
public class SuperFileWrapper
{
protected String local_name;
protected SubFiles_type0Wrapper local_subFiles;

	public SuperFileWrapper() {}

	public SuperFileWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile superfile)
	{
		copy( superfile );
	}
	public SuperFileWrapper( String _name, SubFiles_type0Wrapper _subFiles )
	{
		this.local_name = _name;
		this.local_subFiles = _subFiles;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_subFiles = new SubFiles_type0Wrapper( raw.getSubFiles());

	}

	@Override
	public String toString()
	{
		return "SuperFileWrapper [" + "name = " + local_name + ", " + "subFiles = " + local_subFiles + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.SuperFile();
		raw.setName( local_name);
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
	public void setSubFiles( SubFiles_type0Wrapper _subFiles )
	{
		this.local_subFiles = _subFiles;
	}
	public SubFiles_type0Wrapper getSubFiles( )
	{
		return this.local_subFiles;
	}
}