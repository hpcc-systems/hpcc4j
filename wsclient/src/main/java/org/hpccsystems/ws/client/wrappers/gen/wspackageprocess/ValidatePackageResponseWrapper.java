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
 * Class name: ValidatePackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.730Z
 */
public class ValidatePackageResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected Results_type0Wrapper local_results;

	public ValidatePackageResponseWrapper() {}

	public ValidatePackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse validatepackageresponse)
	{
		copy( validatepackageresponse );
	}
	public ValidatePackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Results_type0Wrapper _results )
	{
		this.local_exceptions = _exceptions;
		this.local_results = _results;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		if (raw.getResults() != null)
			this.local_results = new Results_type0Wrapper( raw.getResults());

	}

	@Override
	public String toString()
	{
		return "ValidatePackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "results = " + local_results + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.ValidatePackageResponse();
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
	public void setResults( Results_type0Wrapper _results )
	{
		this.local_results = _results;
	}
	public Results_type0Wrapper getResults( )
	{
		return this.local_results;
	}
}