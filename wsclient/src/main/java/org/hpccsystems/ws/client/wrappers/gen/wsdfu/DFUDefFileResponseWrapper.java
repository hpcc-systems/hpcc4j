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
import javax.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUDefFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.716Z
 */
public class DFUDefFileResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected DataHandler local_defFile;

	public DFUDefFileResponseWrapper() {}

	public DFUDefFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse dfudeffileresponse)
	{
		copy( dfudeffileresponse );
	}
	public DFUDefFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _defFile )
	{
		this.local_exceptions = _exceptions;
		this.local_defFile = _defFile;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_defFile = raw.getDefFile();

	}

	@Override
	public String toString()
	{
		return "DFUDefFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "defFile = " + local_defFile + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUDefFileResponse();
		raw.setDefFile( local_defFile);
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
	public void setDefFile( DataHandler _defFile )
	{
		this.local_defFile = _defFile;
	}
	public DataHandler getDefFile( )
	{
		return this.local_defFile;
	}
}