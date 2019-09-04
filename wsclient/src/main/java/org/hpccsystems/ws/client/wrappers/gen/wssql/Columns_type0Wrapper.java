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
 * Class name: Columns_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.525Z
 */
public class Columns_type0Wrapper
{
protected List<HPCCColumnWrapper> local_column = new ArrayList<HPCCColumnWrapper>();

	public Columns_type0Wrapper() {}

	public Columns_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0 columns_type0)
	{
		copy( columns_type0 );
	}
	public Columns_type0Wrapper( List<HPCCColumnWrapper> _column )
	{
		this.local_column = _column;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getColumn() != null)
		{
			this.local_column = new ArrayList<HPCCColumnWrapper>();
			for ( int i = 0; i < raw.getColumn().length; i++)
			{
				this.local_column.add(new HPCCColumnWrapper(raw.getColumn()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Columns_type0Wrapper [" + "column = " + local_column + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Columns_type0();
		if (this.local_column!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCColumn[this.local_column.size()];
			for ( int i = 0; i < this.local_column.size(); i++)
			{
				arr[i] = this.local_column.get(i) .getRaw();
			}		raw.setColumn(arr);
}
		return raw;
	}


	public void setColumn( List<HPCCColumnWrapper> _column )
	{
		this.local_column = _column;
	}
	public List<HPCCColumnWrapper> getColumn( )
	{
		return this.local_column;
	}
}