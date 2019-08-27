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
 * Class name: ArrayOfDebugValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.502Z
 */
public class ArrayOfDebugValueWrapper
{
protected List<DebugValueWrapper> local_debugValue = new ArrayList<DebugValueWrapper>();

	public ArrayOfDebugValueWrapper() {}

	public ArrayOfDebugValueWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue arrayofdebugvalue)
	{
		copy( arrayofdebugvalue );
	}
	public ArrayOfDebugValueWrapper( List<DebugValueWrapper> _debugValue )
	{
		this.local_debugValue = _debugValue;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue raw )
	{
		if (raw == null)
			return;

		if (raw.getDebugValue() != null)
		{
			this.local_debugValue = new ArrayList<DebugValueWrapper>();
			for ( int i = 0; i < raw.getDebugValue().length; i++)
			{
				this.local_debugValue.add(new DebugValueWrapper(raw.getDebugValue()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "ArrayOfDebugValueWrapper [" + "debugValue = " + local_debugValue + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ArrayOfDebugValue();
		if (this.local_debugValue!= null)
		{
			org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DebugValue[] arr = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.DebugValue[this.local_debugValue.size()];
			for ( int i = 0; i < this.local_debugValue.size(); i++)
			{
				arr[i] = this.local_debugValue.get(i) .getRaw();
			}		raw.setDebugValue(arr);
}
		return raw;
	}


	public void setDebugValue( List<DebugValueWrapper> _debugValue )
	{
		this.local_debugValue = _debugValue;
	}
	public List<DebugValueWrapper> getDebugValue( )
	{
		return this.local_debugValue;
	}
}