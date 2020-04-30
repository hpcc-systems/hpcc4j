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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ValidatePackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-04-29T14:39:01.544Z
 */
public class ValidatePackageResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected String local_pMID;
	protected BasePackageStatusWrapper local_status;
	protected List<String> local_warnings = null;
	protected List<String> local_errors = null;
	protected ValidatePackageInfoWrapper local_packages;
	protected ValidatePackageQueriesWrapper local_queries;
	protected ValidatePackageFilesWrapper local_files;

	public ValidatePackageResponseWrapper() {}

	public ValidatePackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse validatepackageresponse)
	{
		copy( validatepackageresponse );
	}
	public ValidatePackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _pMID, BasePackageStatusWrapper _status, List<String> _warnings, List<String> _errors, ValidatePackageInfoWrapper _packages, ValidatePackageQueriesWrapper _queries, ValidatePackageFilesWrapper _files )
	{
		this.local_exceptions = _exceptions;
		this.local_pMID = _pMID;
		this.local_status = _status;
		this.local_warnings = _warnings;
		this.local_errors = _errors;
		this.local_packages = _packages;
		this.local_queries = _queries;
		this.local_files = _files;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_pMID = raw.getPMID();
		if (raw.getStatus() != null)
			this.local_status = new BasePackageStatusWrapper( raw.getStatus());
		if (raw.getWarnings() != null)
		{
			this.local_warnings = new ArrayList<String>();
			for ( int i = 0; i < raw.getWarnings().getItem().length; i++)
			{
				this.local_warnings.add(new String(raw.getWarnings().getItem()[i]));
			}
		}		if (raw.getErrors() != null)
		{
			this.local_errors = new ArrayList<String>();
			for ( int i = 0; i < raw.getErrors().getItem().length; i++)
			{
				this.local_errors.add(new String(raw.getErrors().getItem()[i]));
			}
		}		if (raw.getPackages() != null)
			this.local_packages = new ValidatePackageInfoWrapper( raw.getPackages());
		if (raw.getQueries() != null)
			this.local_queries = new ValidatePackageQueriesWrapper( raw.getQueries());
		if (raw.getFiles() != null)
			this.local_files = new ValidatePackageFilesWrapper( raw.getFiles());

	}

	@Override
	public String toString()
	{
		return "ValidatePackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "pMID = " + local_pMID + ", " + "status = " + local_status + ", " + "warnings = " + local_warnings + ", " + "errors = " + local_errors + ", " + "packages = " + local_packages + ", " + "queries = " + local_queries + ", " + "files = " + local_files + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageResponse();
		raw.setPMID( local_pMID);
		if (this.local_warnings!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_warnings.size(); i++)
			{
				arr.addItem(this.local_warnings.get(i));
			}
			raw.setWarnings(arr);
		}
		if (this.local_errors!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_errors.size(); i++)
			{
				arr.addItem(this.local_errors.get(i));
			}
			raw.setErrors(arr);
		}
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
	public void setPMID( String _pMID )
	{
		this.local_pMID = _pMID;
	}
	public String getPMID( )
	{
		return this.local_pMID;
	}
	public void setStatus( BasePackageStatusWrapper _status )
	{
		this.local_status = _status;
	}
	public BasePackageStatusWrapper getStatus( )
	{
		return this.local_status;
	}
	public void setWarnings( List<String> _warnings )
	{
		this.local_warnings = _warnings;
	}
	public List<String> getWarnings( )
	{
		return this.local_warnings;
	}
	public void setErrors( List<String> _errors )
	{
		this.local_errors = _errors;
	}
	public List<String> getErrors( )
	{
		return this.local_errors;
	}
	public void setPackages( ValidatePackageInfoWrapper _packages )
	{
		this.local_packages = _packages;
	}
	public ValidatePackageInfoWrapper getPackages( )
	{
		return this.local_packages;
	}
	public void setQueries( ValidatePackageQueriesWrapper _queries )
	{
		this.local_queries = _queries;
	}
	public ValidatePackageQueriesWrapper getQueries( )
	{
		return this.local_queries;
	}
	public void setFiles( ValidatePackageFilesWrapper _files )
	{
		this.local_files = _files;
	}
	public ValidatePackageFilesWrapper getFiles( )
	{
		return this.local_files;
	}
}