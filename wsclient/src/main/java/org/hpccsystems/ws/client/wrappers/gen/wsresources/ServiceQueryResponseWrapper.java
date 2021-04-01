package org.hpccsystems.ws.client.wrappers.gen.wsresources;



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
 * Class name: ServiceQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * TimeStamp: 2021-03-26T16:29:03.965Z
 */
public class ServiceQueryResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected Services_type0Wrapper local_services;

	public ServiceQueryResponseWrapper() {}

	public ServiceQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse servicequeryresponse)
	{
		copy( servicequeryresponse );
	}
	public ServiceQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Services_type0Wrapper _services )
	{
		this.local_exceptions = _exceptions;
		this.local_services = _services;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getServices() != null)
			this.local_services = new Services_type0Wrapper( raw.getServices());

	}

	@Override
	public String toString()
	{
		return "ServiceQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "services = " + local_services + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.v1_00.ServiceQueryResponse();
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
	public void setServices( Services_type0Wrapper _services )
	{
		this.local_services = _services;
	}
	public Services_type0Wrapper getServices( )
	{
		return this.local_services;
	}
}