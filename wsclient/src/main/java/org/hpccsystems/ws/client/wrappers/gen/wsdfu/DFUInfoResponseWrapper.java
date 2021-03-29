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
 * Class name: DFUInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.813Z
 */
public class DFUInfoResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected DFUFileDetailWrapper local_fileDetail;

	public DFUInfoResponseWrapper() {}

	public DFUInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse dfuinforesponse)
	{
		copy( dfuinforesponse );
	}
	public DFUInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DFUFileDetailWrapper _fileDetail )
	{
		this.local_exceptions = _exceptions;
		this.local_fileDetail = _fileDetail;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getFileDetail() != null)
			this.local_fileDetail = new DFUFileDetailWrapper( raw.getFileDetail());

	}

	@Override
	public String toString()
	{
		return "DFUInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "fileDetail = " + local_fileDetail + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFUInfoResponse();
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
	public void setFileDetail( DFUFileDetailWrapper _fileDetail )
	{
		this.local_fileDetail = _fileDetail;
	}
	public DFUFileDetailWrapper getFileDetail( )
	{
		return this.local_fileDetail;
	}
}