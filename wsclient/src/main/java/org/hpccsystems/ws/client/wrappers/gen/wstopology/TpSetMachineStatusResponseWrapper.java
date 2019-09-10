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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpSetMachineStatusResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2019-09-05T13:55:47.981Z
 */
public class TpSetMachineStatusResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected boolean local_tpSetMachineStatusResult;

	public TpSetMachineStatusResponseWrapper() {}

	public TpSetMachineStatusResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse tpsetmachinestatusresponse)
	{
		copy( tpsetmachinestatusresponse );
	}
	public TpSetMachineStatusResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _tpSetMachineStatusResult )
	{
		this.local_exceptions = _exceptions;
		this.local_tpSetMachineStatusResult = _tpSetMachineStatusResult;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_tpSetMachineStatusResult = raw.getTpSetMachineStatusResult();

	}

	@Override
	public String toString()
	{
		return "TpSetMachineStatusResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tpSetMachineStatusResult = " + local_tpSetMachineStatusResult + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpSetMachineStatusResponse();
		raw.setTpSetMachineStatusResult( local_tpSetMachineStatusResult);
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
	public void setTpSetMachineStatusResult( boolean _tpSetMachineStatusResult )
	{
		this.local_tpSetMachineStatusResult = _tpSetMachineStatusResult;
	}
	public boolean getTpSetMachineStatusResult( )
	{
		return this.local_tpSetMachineStatusResult;
	}
}