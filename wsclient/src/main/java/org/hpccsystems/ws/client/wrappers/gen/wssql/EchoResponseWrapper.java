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
 * Class name: EchoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-13T16:31:16.540Z
 */
public class EchoResponseWrapper
{
protected String local_response;

	public EchoResponseWrapper() {}

	public EchoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse echoresponse)
	{
		copy( echoresponse );
	}
	public EchoResponseWrapper( String _response )
	{
		this.local_response = _response;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse raw )
	{
		if (raw == null)
			return;

		this.local_response = raw.getResponse();

	}

	@Override
	public String toString()
	{
		return "EchoResponseWrapper [" + "response = " + local_response + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EchoResponse();
		raw.setResponse( local_response);
		return raw;
	}


	public void setResponse( String _response )
	{
		this.local_response = _response;
	}
	public String getResponse( )
	{
		return this.local_response;
	}
}