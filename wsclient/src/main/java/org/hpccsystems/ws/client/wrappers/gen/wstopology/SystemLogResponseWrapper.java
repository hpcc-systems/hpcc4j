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
 * Class name: SystemLogResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.890Z
 */
public class SystemLogResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected DataHandler local_thefile;

	public SystemLogResponseWrapper() {}

	public SystemLogResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse systemlogresponse)
	{
		copy( systemlogresponse );
	}
	public SystemLogResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _thefile )
	{
		this.local_exceptions = _exceptions;
		this.local_thefile = _thefile;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_thefile = raw.getThefile();

	}

	@Override
	public String toString()
	{
		return "SystemLogResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "thefile = " + local_thefile + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.SystemLogResponse();
		raw.setThefile( local_thefile);
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
	public void setThefile( DataHandler _thefile )
	{
		this.local_thefile = _thefile;
	}
	public DataHandler getThefile( )
	{
		return this.local_thefile;
	}
}