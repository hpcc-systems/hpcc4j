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
 * Class name: QuerySignatureWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2021-05-14T01:46:09.107Z
 */
public class QuerySignatureWrapper
{
	protected InParams_type0Wrapper local_inParams;
	protected ResultSets_type0Wrapper local_resultSets;

	public QuerySignatureWrapper() {}

	public QuerySignatureWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature querysignature)
	{
		copy( querysignature );
	}
	public QuerySignatureWrapper( InParams_type0Wrapper _inParams, ResultSets_type0Wrapper _resultSets )
	{
		this.local_inParams = _inParams;
		this.local_resultSets = _resultSets;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature raw )
	{
		if (raw == null)
			return;

		if (raw.getInParams() != null)
			this.local_inParams = new InParams_type0Wrapper( raw.getInParams());
		if (raw.getResultSets() != null)
			this.local_resultSets = new ResultSets_type0Wrapper( raw.getResultSets());

	}

	@Override
	public String toString()
	{
		return "QuerySignatureWrapper [" + "inParams = " + local_inParams + ", " + "resultSets = " + local_resultSets + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v3_06.QuerySignature();
		return raw;
	}


	public void setInParams( InParams_type0Wrapper _inParams )
	{
		this.local_inParams = _inParams;
	}
	public InParams_type0Wrapper getInParams( )
	{
		return this.local_inParams;
	}
	public void setResultSets( ResultSets_type0Wrapper _resultSets )
	{
		this.local_resultSets = _resultSets;
	}
	public ResultSets_type0Wrapper getResultSets( )
	{
		return this.local_resultSets;
	}
}