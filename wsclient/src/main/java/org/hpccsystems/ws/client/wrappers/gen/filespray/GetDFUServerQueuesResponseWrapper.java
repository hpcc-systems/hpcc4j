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
 * Class name: GetDFUServerQueuesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.899Z
 */
public class GetDFUServerQueuesResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected EspStringArrayWrapper local_names;

	public GetDFUServerQueuesResponseWrapper() {}

	public GetDFUServerQueuesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse getdfuserverqueuesresponse)
	{
		copy( getdfuserverqueuesresponse );
	}
	public GetDFUServerQueuesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, EspStringArrayWrapper _names )
	{
		this.local_exceptions = _exceptions;
		this.local_names = _names;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_names = new EspStringArrayWrapper( raw.getNames());

	}

	@Override
	public String toString()
	{
		return "GetDFUServerQueuesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "names = " + local_names + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetDFUServerQueuesResponse();
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
	public void setNames( EspStringArrayWrapper _names )
	{
		this.local_names = _names;
	}
	public EspStringArrayWrapper getNames( )
	{
		return this.local_names;
	}
}