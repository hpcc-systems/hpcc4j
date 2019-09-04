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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: QuerySetAliases_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.621Z
 */
public class QuerySetAliases_type0Wrapper
{
protected List<QuerySetAliasMapWrapper> local_querySetAlias = new ArrayList<QuerySetAliasMapWrapper>();

	public QuerySetAliases_type0Wrapper() {}

	public QuerySetAliases_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0 querysetaliases_type0)
	{
		copy( querysetaliases_type0 );
	}
	public QuerySetAliases_type0Wrapper( List<QuerySetAliasMapWrapper> _querySetAlias )
	{
		this.local_querySetAlias = _querySetAlias;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getQuerySetAlias() != null)
		{
			this.local_querySetAlias = new ArrayList<QuerySetAliasMapWrapper>();
			for ( int i = 0; i < raw.getQuerySetAlias().length; i++)
			{
				this.local_querySetAlias.add(new QuerySetAliasMapWrapper(raw.getQuerySetAlias()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "QuerySetAliases_type0Wrapper [" + "querySetAlias = " + local_querySetAlias + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliases_type0();
		if (this.local_querySetAlias!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetAliasMap[this.local_querySetAlias.size()];
			for ( int i = 0; i < this.local_querySetAlias.size(); i++)
			{
				arr[i] = this.local_querySetAlias.get(i) .getRaw();
			}		raw.setQuerySetAlias(arr);
}
		return raw;
	}


	public void setQuerySetAlias( List<QuerySetAliasMapWrapper> _querySetAlias )
	{
		this.local_querySetAlias = _querySetAlias;
	}
	public List<QuerySetAliasMapWrapper> getQuerySetAlias( )
	{
		return this.local_querySetAlias;
	}
}