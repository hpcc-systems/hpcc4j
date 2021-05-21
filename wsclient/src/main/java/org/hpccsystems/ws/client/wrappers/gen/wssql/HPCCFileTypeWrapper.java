package org.hpccsystems.ws.client.wrappers.gen.wssql;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
 * Class name: HPCCFileTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.HPCCFileType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2021-05-14T01:46:09.100Z
 */
public class HPCCFileTypeWrapper
{
	protected String local_hPCCFileType;

	public HPCCFileTypeWrapper() {}

	public HPCCFileTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.HPCCFileType hpccfiletype)
	{
		copy( hpccfiletype );
	}
	public HPCCFileTypeWrapper( String _hPCCFileType )
	{
		this.local_hPCCFileType = _hPCCFileType;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.HPCCFileType raw )
	{
		if (raw == null)
			return;

//Warning raw class does not provide expected method: getHPCCFileType();

	}

	@Override
	public String toString()
	{
		return "HPCCFileTypeWrapper [" + "hPCCFileType = " + local_hPCCFileType + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.HPCCFileType getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.HPCCFileType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setHPCCFileType(hPCCFileType);
		return raw;
	}


	public void setHPCCFileType( String _hPCCFileType )
	{
		this.local_hPCCFileType = _hPCCFileType;
	}
	public String getHPCCFileType( )
	{
		return this.local_hPCCFileType;
	}
}