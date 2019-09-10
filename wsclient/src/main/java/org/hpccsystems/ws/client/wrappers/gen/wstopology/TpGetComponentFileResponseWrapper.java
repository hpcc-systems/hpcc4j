package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
import javax.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpGetComponentFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.940Z
 */
public class TpGetComponentFileResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected DataHandler local_fileContents;

	public TpGetComponentFileResponseWrapper() {}

	public TpGetComponentFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse tpgetcomponentfileresponse)
	{
		copy( tpgetcomponentfileresponse );
	}
	public TpGetComponentFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _fileContents )
	{
		this.local_exceptions = _exceptions;
		this.local_fileContents = _fileContents;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_fileContents = raw.getFileContents();

	}

	@Override
	public String toString()
	{
		return "TpGetComponentFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "fileContents = " + local_fileContents + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGetComponentFileResponse();
		raw.setFileContents( local_fileContents);
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
	public void setFileContents( DataHandler _fileContents )
	{
		this.local_fileContents = _fileContents;
	}
	public DataHandler getFileContents( )
	{
		return this.local_fileContents;
	}
}