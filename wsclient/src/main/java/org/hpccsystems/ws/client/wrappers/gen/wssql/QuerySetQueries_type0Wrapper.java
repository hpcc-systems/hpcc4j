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
 * Class name: QuerySetQueries_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.624Z
 */
public class QuerySetQueries_type0Wrapper
{
protected List<PublishedQueryWrapper> local_querySetQuery = new ArrayList<PublishedQueryWrapper>();

	public QuerySetQueries_type0Wrapper() {}

	public QuerySetQueries_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0 querysetqueries_type0)
	{
		copy( querysetqueries_type0 );
	}
	public QuerySetQueries_type0Wrapper( List<PublishedQueryWrapper> _querySetQuery )
	{
		this.local_querySetQuery = _querySetQuery;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getQuerySetQuery() != null)
		{
			this.local_querySetQuery = new ArrayList<PublishedQueryWrapper>();
			for ( int i = 0; i < raw.getQuerySetQuery().length; i++)
			{
				this.local_querySetQuery.add(new PublishedQueryWrapper(raw.getQuerySetQuery()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "QuerySetQueries_type0Wrapper [" + "querySetQuery = " + local_querySetQuery + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySetQueries_type0();
		if (this.local_querySetQuery!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PublishedQuery[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PublishedQuery[this.local_querySetQuery.size()];
			for ( int i = 0; i < this.local_querySetQuery.size(); i++)
			{
				arr[i] = this.local_querySetQuery.get(i) .getRaw();
			}		raw.setQuerySetQuery(arr);
}
		return raw;
	}


	public void setQuerySetQuery( List<PublishedQueryWrapper> _querySetQuery )
	{
		this.local_querySetQuery = _querySetQuery;
	}
	public List<PublishedQueryWrapper> getQuerySetQuery( )
	{
		return this.local_querySetQuery;
	}
}