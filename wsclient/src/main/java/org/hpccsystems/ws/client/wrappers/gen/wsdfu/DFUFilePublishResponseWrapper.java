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
 * Class name: DFUFilePublishResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.780Z
 */
public class DFUFilePublishResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;

	public DFUFilePublishResponseWrapper() {}

	public DFUFilePublishResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse dfufilepublishresponse)
	{
		copy( dfufilepublishresponse );
	}
	public DFUFilePublishResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

	}

	@Override
	public String toString()
	{
		return "DFUFilePublishResponseWrapper [" + "exceptions = " + local_exceptions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUFilePublishResponse();
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