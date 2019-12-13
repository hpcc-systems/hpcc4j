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
 * Class name: AddPackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.436Z
 */
public class AddPackageResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected BasePackageStatusWrapper local_status;
protected FilesNotFound_type2Wrapper local_filesNotFound;

	public AddPackageResponseWrapper() {}

	public AddPackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse addpackageresponse)
	{
		copy( addpackageresponse );
	}
	public AddPackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, FilesNotFound_type2Wrapper _filesNotFound )
	{
		this.local_exceptions = _exceptions;
		this.local_status = _status;
		this.local_filesNotFound = _filesNotFound;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_status = new BasePackageStatusWrapper( raw.getStatus());
		this.local_filesNotFound = new FilesNotFound_type2Wrapper( raw.getFilesNotFound());

	}

	@Override
	public String toString()
	{
		return "AddPackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "filesNotFound = " + local_filesNotFound + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPackageResponse();
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
	public void setFilesNotFound( FilesNotFound_type2Wrapper _filesNotFound )
	{
		this.local_filesNotFound = _filesNotFound;
	}
	public FilesNotFound_type2Wrapper getFilesNotFound( )
	{
		return this.local_filesNotFound;
	}
}