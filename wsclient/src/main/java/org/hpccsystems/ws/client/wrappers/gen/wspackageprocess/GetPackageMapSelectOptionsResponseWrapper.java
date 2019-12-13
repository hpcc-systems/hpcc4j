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
 * Class name: GetPackageMapSelectOptionsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.516Z
 */
public class GetPackageMapSelectOptionsResponseWrapper
{
protected ArrayOfEspExceptionWrapper local_exceptions;
protected BasePackageStatusWrapper local_status;
protected ArrayOfTargetDataWrapper local_targets;
protected List<String> local_processFilters = new ArrayList<String>();

	public GetPackageMapSelectOptionsResponseWrapper() {}

	public GetPackageMapSelectOptionsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse getpackagemapselectoptionsresponse)
	{
		copy( getpackagemapselectoptionsresponse );
	}
	public GetPackageMapSelectOptionsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, ArrayOfTargetDataWrapper _targets, List<String> _processFilters )
	{
		this.local_exceptions = _exceptions;
		this.local_status = _status;
		this.local_targets = _targets;
		this.local_processFilters = _processFilters;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse raw )
	{
		if (raw == null)
			return;

		this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_status = new BasePackageStatusWrapper( raw.getStatus());
		this.local_targets = new ArrayOfTargetDataWrapper( raw.getTargets());
		if (raw.getProcessFilters() != null)
		{
			this.local_processFilters = new ArrayList<String>();
			for ( int i = 0; i < raw.getProcessFilters().getItem().length; i++)
			{
				this.local_processFilters.add(new String(raw.getProcessFilters().getItem()[i]));
			}
		}
	}

	@Override
	public String toString()
	{
		return "GetPackageMapSelectOptionsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "targets = " + local_targets + ", " + "processFilters = " + local_processFilters + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsResponse();
		if (this.local_processFilters!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_processFilters.size(); i++)
			{
				arr.addItem(this.local_processFilters.get(i));
			}
			raw.setProcessFilters(arr);
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
	public void setStatus( BasePackageStatusWrapper _status )
	{
		this.local_status = _status;
	}
	public BasePackageStatusWrapper getStatus( )
	{
		return this.local_status;
	}
	public void setTargets( ArrayOfTargetDataWrapper _targets )
	{
		this.local_targets = _targets;
	}
	public ArrayOfTargetDataWrapper getTargets( )
	{
		return this.local_targets;
	}
	public void setProcessFilters( List<String> _processFilters )
	{
		this.local_processFilters = _processFilters;
	}
	public List<String> getProcessFilters( )
	{
		return this.local_processFilters;
	}
}