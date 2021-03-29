package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: AddRemoteResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.625Z
 */
public class AddRemoteResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;

	public AddRemoteResponseWrapper() {}

	public AddRemoteResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse addremoteresponse)
	{
		copy( addremoteresponse );
	}
	public AddRemoteResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

	}

	@Override
	public String toString()
	{
		return "AddRemoteResponseWrapper [" + "exceptions = " + local_exceptions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.AddRemoteResponse();
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
}