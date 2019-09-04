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
 * Class name: HPCCFieldTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCFieldType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.602Z
 */
public class HPCCFieldTypeWrapper
{
protected String local_hPCCFieldType;

	public HPCCFieldTypeWrapper() {}

	public HPCCFieldTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCFieldType hpccfieldtype)
	{
		copy( hpccfieldtype );
	}
	public HPCCFieldTypeWrapper( String _hPCCFieldType )
	{
		this.local_hPCCFieldType = _hPCCFieldType;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCFieldType raw )
	{
		if (raw == null)
			return;

//Warning raw class does not provide expected method: getHPCCFieldType();

	}

	@Override
	public String toString()
	{
		return "HPCCFieldTypeWrapper [" + "hPCCFieldType = " + local_hPCCFieldType + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCFieldType getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.HPCCFieldType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setHPCCFieldType(hPCCFieldType);
		return raw;
	}


	public void setHPCCFieldType( String _hPCCFieldType )
	{
		this.local_hPCCFieldType = _hPCCFieldType;
	}
	public String getHPCCFieldType( )
	{
		return this.local_hPCCFieldType;
	}
}