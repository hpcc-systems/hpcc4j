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
 * Class name: PrepareSQLResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.619Z
 */
public class PrepareSQLResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected ECLWorkunitWrapper local_workunit;
protected String local_result;

	public PrepareSQLResponseWrapper() {}

	public PrepareSQLResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse preparesqlresponse)
	{
		copy( preparesqlresponse );
	}
	public PrepareSQLResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLWorkunitWrapper _workunit, String _result )
	{
		this.local_exceptions = _exceptions;
		this.local_workunit = _workunit;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());
		this.local_result = raw.getResult();

	}

	@Override
	public String toString()
	{
		return "PrepareSQLResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "workunit = " + local_workunit + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.PrepareSQLResponse();
		raw.setResult( local_result);
		return raw;
	}


	public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;
	}
	public ArrayOfEspExceptionWrapper getExceptions( )
	{
		return this.local_exceptions;
	}
	public void setWorkunit( ECLWorkunitWrapper _workunit )
	{
		this.local_workunit = _workunit;
	}
	public ECLWorkunitWrapper getWorkunit( )
	{
		return this.local_workunit;
	}
	public void setResult( String _result )
	{
		this.local_result = _result;
	}
	public String getResult( )
	{
		return this.local_result;
	}
}