package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: GetPackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.520Z
 */
public class GetPackageResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected BasePackageStatusWrapper local_status;
protected String local_info;

	public GetPackageResponseWrapper() {}

	public GetPackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse getpackageresponse)
	{
		copy( getpackageresponse );
	}
	public GetPackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, String _info )
	{
		this.local_exceptions = _exceptions;
		this.local_status = _status;
		this.local_info = _info;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_status = new BasePackageStatusWrapper( raw.getStatus());
		this.local_info = raw.getInfo();

	}

	@Override
	public String toString()
	{
		return "GetPackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "info = " + local_info + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageResponse();
		raw.setInfo( local_info);
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
	public void setStatus( BasePackageStatusWrapper _status )
	{
		this.local_status = _status;
	}
	public BasePackageStatusWrapper getStatus( )
	{
		return this.local_status;
	}
	public void setInfo( String _info )
	{
		this.local_info = _info;
	}
	public String getInfo( )
	{
		return this.local_info;
	}
}