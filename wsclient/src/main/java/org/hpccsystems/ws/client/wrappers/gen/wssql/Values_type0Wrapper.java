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
 * Class name: Values_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.642Z
 */
public class Values_type0Wrapper
{
protected List<String> local_value = new ArrayList<String>();

	public Values_type0Wrapper() {}

	public Values_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0 values_type0)
	{
		copy( values_type0 );
	}
	public Values_type0Wrapper( List<String> _value )
	{
		this.local_value = _value;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0 raw )
	{
		if (raw == null)
			return;

		if (raw.getValue() != null)
		{
			this.local_value = new ArrayList<String>();
			for ( int i = 0; i < raw.getValue().length; i++)
			{
				this.local_value.add(new String(raw.getValue()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "Values_type0Wrapper [" + "value = " + local_value + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0 getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.Values_type0();
		if (this.local_value!= null)
		{
			java.lang.String[] arr = new java.lang.String[this.local_value.size()];
			for ( int i = 0; i < this.local_value.size(); i++)
			{
				arr[i] = this.local_value.get(i) ;
			}		raw.setValue(arr);
}
		return raw;
	}


	public void setValue( List<String> _value )
	{
		this.local_value = _value;
	}
	public List<String> getValue( )
	{
		return this.local_value;
	}
}