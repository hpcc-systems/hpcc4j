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
 * Class name: SubmitDFUWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2020-09-23T03:42:02.644Z
 */
public class SubmitDFUWorkunitResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;

	public SubmitDFUWorkunitResponseWrapper() {}

	public SubmitDFUWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse submitdfuworkunitresponse)
	{
		copy( submitdfuworkunitresponse );
	}
	public SubmitDFUWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions )
	{
		this.local_exceptions = _exceptions;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());

	}

	@Override
	public String toString()
	{
		return "SubmitDFUWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_20.SubmitDFUWorkunitResponse();
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