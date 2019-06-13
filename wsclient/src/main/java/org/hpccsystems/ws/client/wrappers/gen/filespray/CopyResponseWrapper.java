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
 * Class name: CopyResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.822Z
 */
public class CopyResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected String local_result;

	public CopyResponseWrapper() {}

	public CopyResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse copyresponse)
	{
		copy( copyresponse );
	}
	public CopyResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _result )
	{
		this.local_exceptions = _exceptions;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_result = raw.getResult();

	}

	@Override
	public String toString()
	{
		return "CopyResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.CopyResponse();
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
	public void setResult( String _result )
	{
		this.local_result = _result;
	}
	public String getResult( )
	{
		return this.local_result;
	}
}