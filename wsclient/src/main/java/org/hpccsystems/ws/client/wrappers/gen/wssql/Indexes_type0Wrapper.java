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
 * Class name: Indexes_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.609Z
 */
public class Indexes_type0Wrapper
{
protected List<String> local_index = new ArrayList<String>();

	public Indexes_type0Wrapper() {}

	public Indexes_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0 indexes_type0)
	{
		copy( indexes_type0 );
	}
	public Indexes_type0Wrapper( List<String> _index )
	{
		this.local_index = _index;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getIndex() != null)
		{
			this.local_index = new ArrayList<String>();
			for ( int i = 0; i < raw.getIndex().length; i++)
			{
				this.local_index.add(new String(raw.getIndex()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Indexes_type0Wrapper [" + "index = " + local_index + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Indexes_type0();
		if (this.local_index!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_index.size()];
			for ( int i = 0; i < this.local_index.size(); i++)
			{
				arr[i] = this.local_index.get(i) ;
			}		raw.setIndex(arr);
}
		return raw;
	}


	public void setIndex( List<String> _index )
	{
		this.local_index = _index;
	}
	public List<String> getIndex( )
	{
		return this.local_index;
	}
}