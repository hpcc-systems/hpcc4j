package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: GetDFUExceptionsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.896Z
 */
public class GetDFUExceptionsResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected ArrayOfDFUExceptionWrapper local_result;

	public GetDFUExceptionsResponseWrapper() {}

	public GetDFUExceptionsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse getdfuexceptionsresponse)
	{
		copy( getdfuexceptionsresponse );
	}
	public GetDFUExceptionsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfDFUExceptionWrapper _result )
	{
		this.local_exceptions = _exceptions;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_result = new ArrayOfDFUExceptionWrapper( raw.getResult());

	}

	@Override
	public String toString()
	{
		return "GetDFUExceptionsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUExceptionsResponse();
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
	public void setResult( ArrayOfDFUExceptionWrapper _result )
	{
		this.local_result = _result;
	}
	public ArrayOfDFUExceptionWrapper getResult( )
	{
		return this.local_result;
	}
}