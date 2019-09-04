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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ExecutePreparedSQLResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.581Z
 */
public class ExecutePreparedSQLResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected String local_parentWuId;
protected String local_result;
protected UnsignedInt local_resultWindowStart;
protected UnsignedInt local_resultWindowCount;
protected ECLWorkunitWrapper local_workunit;

	public ExecutePreparedSQLResponseWrapper() {}

	public ExecutePreparedSQLResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse executepreparedsqlresponse)
	{
		copy( executepreparedsqlresponse );
	}
	public ExecutePreparedSQLResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _parentWuId, String _result, UnsignedInt _resultWindowStart, UnsignedInt _resultWindowCount, ECLWorkunitWrapper _workunit )
	{
		this.local_exceptions = _exceptions;
		this.local_parentWuId = _parentWuId;
		this.local_result = _result;
		this.local_resultWindowStart = _resultWindowStart;
		this.local_resultWindowCount = _resultWindowCount;
		this.local_workunit = _workunit;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_parentWuId = raw.getParentWuId();
		this.local_result = raw.getResult();
		this.local_resultWindowStart = raw.getResultWindowStart();
		this.local_resultWindowCount = raw.getResultWindowCount();
		this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());

	}

	@Override
	public String toString()
	{
		return "ExecutePreparedSQLResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "parentWuId = " + local_parentWuId + ", " + "result = " + local_result + ", " + "resultWindowStart = " + local_resultWindowStart + ", " + "resultWindowCount = " + local_resultWindowCount + ", " + "workunit = " + local_workunit + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ExecutePreparedSQLResponse();
		raw.setParentWuId( local_parentWuId);
		raw.setResult( local_result);
		raw.setResultWindowStart( local_resultWindowStart);
		raw.setResultWindowCount( local_resultWindowCount);
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
	public void setParentWuId( String _parentWuId )
	{
		this.local_parentWuId = _parentWuId;
	}
	public String getParentWuId( )
	{
		return this.local_parentWuId;
	}
	public void setResult( String _result )
	{
		this.local_result = _result;
	}
	public String getResult( )
	{
		return this.local_result;
	}
	public void setResultWindowStart( UnsignedInt _resultWindowStart )
	{
		this.local_resultWindowStart = _resultWindowStart;
	}
	public UnsignedInt getResultWindowStart( )
	{
		return this.local_resultWindowStart;
	}
	public void setResultWindowCount( UnsignedInt _resultWindowCount )
	{
		this.local_resultWindowCount = _resultWindowCount;
	}
	public UnsignedInt getResultWindowCount( )
	{
		return this.local_resultWindowCount;
	}
	public void setWorkunit( ECLWorkunitWrapper _workunit )
	{
		this.local_workunit = _workunit;
	}
	public ECLWorkunitWrapper getWorkunit( )
	{
		return this.local_workunit;
	}
}