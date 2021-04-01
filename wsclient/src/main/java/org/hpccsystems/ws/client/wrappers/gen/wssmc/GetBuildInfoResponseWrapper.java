package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: GetBuildInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2021-03-30T22:27:29.001Z
 */
public class GetBuildInfoResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected ArrayOfNamedValueWrapper local_buildInfo;

	public GetBuildInfoResponseWrapper() {}

	public GetBuildInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse getbuildinforesponse)
	{
		copy( getbuildinforesponse );
	}
	public GetBuildInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfNamedValueWrapper _buildInfo )
	{
		this.local_exceptions = _exceptions;
		this.local_buildInfo = _buildInfo;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getBuildInfo() != null)
			this.local_buildInfo = new ArrayOfNamedValueWrapper( raw.getBuildInfo());

	}

	@Override
	public String toString()
	{
		return "GetBuildInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "buildInfo = " + local_buildInfo + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.v1_23.GetBuildInfoResponse();
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
	public void setBuildInfo( ArrayOfNamedValueWrapper _buildInfo )
	{
		this.local_buildInfo = _buildInfo;
	}
	public ArrayOfNamedValueWrapper getBuildInfo( )
	{
		return this.local_buildInfo;
	}
}