package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: SMCPriorityResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.119Z
 */
public class SMCPriorityResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;

	public SMCPriorityResponseWrapper() {}

	public SMCPriorityResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse smcpriorityresponse)
	{
		copy( smcpriorityresponse );
	}
	public SMCPriorityResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

	}

	@Override
	public String toString()
	{
		return "SMCPriorityResponseWrapper [" + "exceptions = " + local_exceptions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.SMCPriorityResponse();
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