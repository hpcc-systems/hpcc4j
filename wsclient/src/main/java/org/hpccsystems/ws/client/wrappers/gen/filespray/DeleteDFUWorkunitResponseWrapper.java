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
 * Class name: DeleteDFUWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.829Z
 */
public class DeleteDFUWorkunitResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected boolean local_result;

	public DeleteDFUWorkunitResponseWrapper() {}

	public DeleteDFUWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse deletedfuworkunitresponse)
	{
		copy( deletedfuworkunitresponse );
	}
	public DeleteDFUWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _result )
	{
		this.local_exceptions = _exceptions;
		this.local_result = _result;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_result = raw.getResult();

	}

	@Override
	public String toString()
	{
		return "DeleteDFUWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.DeleteDFUWorkunitResponse();
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
	public void setResult( boolean _result )
	{
		this.local_result = _result;
	}
	public boolean getResult( )
	{
		return this.local_result;
	}
}