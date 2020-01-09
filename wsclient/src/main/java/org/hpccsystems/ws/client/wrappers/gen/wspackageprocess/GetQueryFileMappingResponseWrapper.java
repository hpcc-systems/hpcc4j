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
 * Class name: GetQueryFileMappingResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.531Z
 */
public class GetQueryFileMappingResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected UnmappedFiles_type0Wrapper local_unmappedFiles;
protected ArrayOfSuperFileWrapper local_superFiles;

	public GetQueryFileMappingResponseWrapper() {}

	public GetQueryFileMappingResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse getqueryfilemappingresponse)
	{
		copy( getqueryfilemappingresponse );
	}
	public GetQueryFileMappingResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, UnmappedFiles_type0Wrapper _unmappedFiles, ArrayOfSuperFileWrapper _superFiles )
	{
		this.local_exceptions = _exceptions;
		this.local_unmappedFiles = _unmappedFiles;
		this.local_superFiles = _superFiles;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_unmappedFiles = new UnmappedFiles_type0Wrapper( raw.getUnmappedFiles());
		this.local_superFiles = new ArrayOfSuperFileWrapper( raw.getSuperFiles());

	}

	@Override
	public String toString()
	{
		return "GetQueryFileMappingResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "unmappedFiles = " + local_unmappedFiles + ", " + "superFiles = " + local_superFiles + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetQueryFileMappingResponse();
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
	public void setUnmappedFiles( UnmappedFiles_type0Wrapper _unmappedFiles )
	{
		this.local_unmappedFiles = _unmappedFiles;
	}
	public UnmappedFiles_type0Wrapper getUnmappedFiles( )
	{
		return this.local_unmappedFiles;
	}
	public void setSuperFiles( ArrayOfSuperFileWrapper _superFiles )
	{
		this.local_superFiles = _superFiles;
	}
	public ArrayOfSuperFileWrapper getSuperFiles( )
	{
		return this.local_superFiles;
	}
}