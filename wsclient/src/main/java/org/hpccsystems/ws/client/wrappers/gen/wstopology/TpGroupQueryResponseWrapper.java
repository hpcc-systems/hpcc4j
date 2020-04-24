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
 * Class name: TpGroupQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2020-04-24T00:43:36.278Z
 */
public class TpGroupQueryResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected ArrayOfTpGroupWrapper local_tpGroups;

	public TpGroupQueryResponseWrapper() {}

	public TpGroupQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse tpgroupqueryresponse)
	{
		copy( tpgroupqueryresponse );
	}
	public TpGroupQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfTpGroupWrapper _tpGroups )
	{
		this.local_exceptions = _exceptions;
		this.local_tpGroups = _tpGroups;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getTpGroups() != null)
			this.local_tpGroups = new ArrayOfTpGroupWrapper( raw.getTpGroups());

	}

	@Override
	public String toString()
	{
		return "TpGroupQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tpGroups = " + local_tpGroups + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.TpGroupQueryResponse();
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
	public void setTpGroups( ArrayOfTpGroupWrapper _tpGroups )
	{
		this.local_tpGroups = _tpGroups;
	}
	public ArrayOfTpGroupWrapper getTpGroups( )
	{
		return this.local_tpGroups;
	}
}