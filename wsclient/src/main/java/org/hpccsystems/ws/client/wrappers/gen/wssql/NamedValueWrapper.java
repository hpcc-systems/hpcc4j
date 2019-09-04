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
 * Class name: NamedValueWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.612Z
 */
public class NamedValueWrapper
{
protected String local_name;
protected String local_value;

	public NamedValueWrapper() {}

	public NamedValueWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue namedvalue)
	{
		copy( namedvalue );
	}
	public NamedValueWrapper( String _name, String _value )
	{
		this.local_name = _name;
		this.local_value = _value;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_value = raw.getValue();

	}

	@Override
	public String toString()
	{
		return "NamedValueWrapper [" + "name = " + local_name + ", " + "value = " + local_value + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.NamedValue();
		raw.setName( local_name);
		raw.setValue( local_value);
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
	public void setValue( String _value )
	{
		this.local_value = _value;
	}
	public String getValue( )
	{
		return this.local_value;
	}
}