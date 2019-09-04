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
 * Class name: Tables_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.639Z
 */
public class Tables_type0Wrapper
{
protected List<HPCCTableWrapper> local_table = new ArrayList<HPCCTableWrapper>();

	public Tables_type0Wrapper() {}

	public Tables_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0 tables_type0)
	{
		copy( tables_type0 );
	}
	public Tables_type0Wrapper( List<HPCCTableWrapper> _table )
	{
		this.local_table = _table;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getTable() != null)
		{
			this.local_table = new ArrayList<HPCCTableWrapper>();
			for ( int i = 0; i < raw.getTable().length; i++)
			{
				this.local_table.add(new HPCCTableWrapper(raw.getTable()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Tables_type0Wrapper [" + "table = " + local_table + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Tables_type0();
		if (this.local_table!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCTable[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCTable[this.local_table.size()];
			for ( int i = 0; i < this.local_table.size(); i++)
			{
				arr[i] = this.local_table.get(i) .getRaw();
			}		raw.setTable(arr);
}
		return raw;
	}


	public void setTable( List<HPCCTableWrapper> _table )
	{
		this.local_table = _table;
	}
	public List<HPCCTableWrapper> getTable( )
	{
		return this.local_table;
	}
}