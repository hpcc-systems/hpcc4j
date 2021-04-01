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
 * Class name: EraseHistoryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.872Z
 */
public class EraseHistoryResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected History_type1Wrapper local_history;

	public EraseHistoryResponseWrapper() {}

	public EraseHistoryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse erasehistoryresponse)
	{
		copy( erasehistoryresponse );
	}
	public EraseHistoryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, History_type1Wrapper _history )
	{
		this.local_exceptions = _exceptions;
		this.local_history = _history;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getHistory() != null)
			this.local_history = new History_type1Wrapper( raw.getHistory());

	}

	@Override
	public String toString()
	{
		return "EraseHistoryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "history = " + local_history + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.EraseHistoryResponse();
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
	public void setHistory( History_type1Wrapper _history )
	{
		this.local_history = _history;
	}
	public History_type1Wrapper getHistory( )
	{
		return this.local_history;
	}
}