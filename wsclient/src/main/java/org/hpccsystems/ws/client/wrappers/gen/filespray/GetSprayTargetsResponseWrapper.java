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
 * Class name: GetSprayTargetsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.909Z
 */
public class GetSprayTargetsResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected GroupNodes_type0Wrapper local_groupNodes;

	public GetSprayTargetsResponseWrapper() {}

	public GetSprayTargetsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse getspraytargetsresponse)
	{
		copy( getspraytargetsresponse );
	}
	public GetSprayTargetsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, GroupNodes_type0Wrapper _groupNodes )
	{
		this.local_exceptions = _exceptions;
		this.local_groupNodes = _groupNodes;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_groupNodes = new GroupNodes_type0Wrapper( raw.getGroupNodes());

	}

	@Override
	public String toString()
	{
		return "GetSprayTargetsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "groupNodes = " + local_groupNodes + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.GetSprayTargetsResponse();
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
	public void setGroupNodes( GroupNodes_type0Wrapper _groupNodes )
	{
		this.local_groupNodes = _groupNodes;
	}
	public GroupNodes_type0Wrapper getGroupNodes( )
	{
		return this.local_groupNodes;
	}
}