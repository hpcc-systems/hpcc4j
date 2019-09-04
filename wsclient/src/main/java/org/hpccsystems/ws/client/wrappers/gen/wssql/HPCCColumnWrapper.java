package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: HPCCColumnWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.601Z
 */
public class HPCCColumnWrapper
{
protected String local_name;
protected String local_type;

	public HPCCColumnWrapper() {}

	public HPCCColumnWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn hpcccolumn)
	{
		copy( hpcccolumn );
	}
	public HPCCColumnWrapper( String _name, String _type )
	{
		this.local_name = _name;
		this.local_type = _type;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_type = raw.getType();

	}

	@Override
	public String toString()
	{
		return "HPCCColumnWrapper [" + "name = " + local_name + ", " + "type = " + local_type + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn();
		raw.setName( local_name);
		raw.setType( local_type);
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
}