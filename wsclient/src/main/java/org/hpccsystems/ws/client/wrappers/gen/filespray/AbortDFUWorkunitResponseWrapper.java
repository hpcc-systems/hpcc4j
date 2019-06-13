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
 * Class name: AbortDFUWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.790Z
 */
public class AbortDFUWorkunitResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;

	public AbortDFUWorkunitResponseWrapper() {}

	public AbortDFUWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse abortdfuworkunitresponse)
	{
		copy( abortdfuworkunitresponse );
	}
	public AbortDFUWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

	}

	@Override
	public String toString()
	{
		return "AbortDFUWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.AbortDFUWorkunitResponse();
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