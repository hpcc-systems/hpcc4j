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
 * Class name: GetDBSystemInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2021-05-14T01:46:09.108Z
 */
public class GetDBSystemInfoRequestWrapper
{
	protected boolean local_includeAll;

	public GetDBSystemInfoRequestWrapper() {}

	public GetDBSystemInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest getdbsysteminforequest)
	{
		copy( getdbsysteminforequest );
	}
	public GetDBSystemInfoRequestWrapper( boolean _includeAll )
	{
		this.local_includeAll = _includeAll;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest raw )
	{
		if (raw == null)
			return;

		this.local_includeAll = raw.getIncludeAll();

	}

	@Override
	public String toString()
	{
		return "GetDBSystemInfoRequestWrapper [" + "includeAll = " + local_includeAll + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.GetDBSystemInfoRequest();
		raw.setIncludeAll( local_includeAll);
		return raw;
	}


	public void setIncludeAll( boolean _includeAll )
	{
		this.local_includeAll = _includeAll;
	}
	public boolean getIncludeAll( )
	{
		return this.local_includeAll;
	}
}