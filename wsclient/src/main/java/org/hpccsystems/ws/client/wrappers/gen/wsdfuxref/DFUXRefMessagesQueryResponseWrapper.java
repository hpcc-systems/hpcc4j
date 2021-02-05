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
 * Class name: DFUXRefMessagesQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * TimeStamp: 2021-01-20T21:52:27.294Z
 */
public class DFUXRefMessagesQueryResponseWrapper
{
	protected String local_dFUXRefMessagesQueryResult;

	public DFUXRefMessagesQueryResponseWrapper() {}

	public DFUXRefMessagesQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse dfuxrefmessagesqueryresponse)
	{
		copy( dfuxrefmessagesqueryresponse );
	}
	public DFUXRefMessagesQueryResponseWrapper( String _dFUXRefMessagesQueryResult )
	{
		this.local_dFUXRefMessagesQueryResult = _dFUXRefMessagesQueryResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse raw )
	{
		if (raw == null)
			return;

		this.local_dFUXRefMessagesQueryResult = raw.getDFUXRefMessagesQueryResult();

	}

	@Override
	public String toString()
	{
		return "DFUXRefMessagesQueryResponseWrapper [" + "dFUXRefMessagesQueryResult = " + local_dFUXRefMessagesQueryResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.v1_01.DFUXRefMessagesQueryResponse();
		raw.setDFUXRefMessagesQueryResult( local_dFUXRefMessagesQueryResult);
		return raw;
	}


	public void setDFUXRefMessagesQueryResult( String _dFUXRefMessagesQueryResult )
	{
		this.local_dFUXRefMessagesQueryResult = _dFUXRefMessagesQueryResult;
	}
	public String getDFUXRefMessagesQueryResult( )
	{
		return this.local_dFUXRefMessagesQueryResult;
	}
}