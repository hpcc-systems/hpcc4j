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
 * Class name: GetPartFromPackageMapResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.526Z
 */
public class GetPartFromPackageMapResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected BasePackageStatusWrapper local_status;
protected String local_content;

	public GetPartFromPackageMapResponseWrapper() {}

	public GetPartFromPackageMapResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse getpartfrompackagemapresponse)
	{
		copy( getpartfrompackagemapresponse );
	}
	public GetPartFromPackageMapResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, String _content )
	{
		this.local_exceptions = _exceptions;
		this.local_status = _status;
		this.local_content = _content;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_status = new BasePackageStatusWrapper( raw.getStatus());
		this.local_content = raw.getContent();

	}

	@Override
	public String toString()
	{
		return "GetPartFromPackageMapResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "content = " + local_content + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPartFromPackageMapResponse();
		raw.setContent( local_content);
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
	public void setContent( String _content )
	{
		this.local_content = _content;
	}
	public String getContent( )
	{
		return this.local_content;
	}
}