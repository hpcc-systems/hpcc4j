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
 * Class name: QuerySets_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.625Z
 */
public class QuerySets_type0Wrapper
{
protected List<HPCCQuerySetWrapper> local_querySet = new ArrayList<HPCCQuerySetWrapper>();

	public QuerySets_type0Wrapper() {}

	public QuerySets_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0 querysets_type0)
	{
		copy( querysets_type0 );
	}
	public QuerySets_type0Wrapper( List<HPCCQuerySetWrapper> _querySet )
	{
		this.local_querySet = _querySet;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getQuerySet() != null)
		{
			this.local_querySet = new ArrayList<HPCCQuerySetWrapper>();
			for ( int i = 0; i < raw.getQuerySet().length; i++)
			{
				this.local_querySet.add(new HPCCQuerySetWrapper(raw.getQuerySet()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "QuerySets_type0Wrapper [" + "querySet = " + local_querySet + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.QuerySets_type0();
		if (this.local_querySet!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCQuerySet[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCQuerySet[this.local_querySet.size()];
			for ( int i = 0; i < this.local_querySet.size(); i++)
			{
				arr[i] = this.local_querySet.get(i) .getRaw();
			}		raw.setQuerySet(arr);
}
		return raw;
	}


	public void setQuerySet( List<HPCCQuerySetWrapper> _querySet )
	{
		this.local_querySet = _querySet;
	}
	public List<HPCCQuerySetWrapper> getQuerySet( )
	{
		return this.local_querySet;
	}
}