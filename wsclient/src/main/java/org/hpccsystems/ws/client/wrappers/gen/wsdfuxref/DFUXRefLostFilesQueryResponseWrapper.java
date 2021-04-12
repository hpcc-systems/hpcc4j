package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
 * Class name: DFUXRefLostFilesQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-03-24T23:14:30.218Z
 */
public class DFUXRefLostFilesQueryResponseWrapper
{
	protected String local_dFUXRefLostFilesQueryResult;

	public DFUXRefLostFilesQueryResponseWrapper() {}

	public DFUXRefLostFilesQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse dfuxreflostfilesqueryresponse)
	{
		copy( dfuxreflostfilesqueryresponse );
	}
	public DFUXRefLostFilesQueryResponseWrapper( String _dFUXRefLostFilesQueryResult )
	{
		this.local_dFUXRefLostFilesQueryResult = _dFUXRefLostFilesQueryResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse raw )
	{
		if (raw == null)
			return;

		this.local_dFUXRefLostFilesQueryResult = raw.getDFUXRefLostFilesQueryResult();

	}

	@Override
	public String toString()
	{
		return "DFUXRefLostFilesQueryResponseWrapper [" + "dFUXRefLostFilesQueryResult = " + local_dFUXRefLostFilesQueryResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_02.DFUXRefLostFilesQueryResponse();
		raw.setDFUXRefLostFilesQueryResult( local_dFUXRefLostFilesQueryResult);
		return raw;
	}


	public void setDFUXRefLostFilesQueryResult( String _dFUXRefLostFilesQueryResult )
	{
		this.local_dFUXRefLostFilesQueryResult = _dFUXRefLostFilesQueryResult;
	}
	public String getDFUXRefLostFilesQueryResult( )
	{
		return this.local_dFUXRefLostFilesQueryResult;
	}
}