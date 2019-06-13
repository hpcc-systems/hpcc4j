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
 * Class name: QuerySetAliasMapWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.623Z
 */
public class QuerySetAliasMapWrapper
{
protected String local_id;
protected String local_name;

	public QuerySetAliasMapWrapper() {}

	public QuerySetAliasMapWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap querysetaliasmap)
	{
		copy( querysetaliasmap );
	}
	public QuerySetAliasMapWrapper( String _id, String _name )
	{
		this.local_id = _id;
		this.local_name = _name;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap raw )
	{
		if (raw == null)
			return;

		this.local_id = raw.getId();
		this.local_name = raw.getName();

	}

	@Override
	public String toString()
	{
		return "QuerySetAliasMapWrapper [" + "id = " + local_id + ", " + "name = " + local_name + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap();
		raw.setId( local_id);
		raw.setName( local_name);
		return raw;
	}


	public void setId( String _id )
	{
		this.local_id = _id;
	}
	public String getId( )
	{
		return this.local_id;
	}
	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
}