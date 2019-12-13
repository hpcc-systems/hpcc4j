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
 * Class name: GetPackageMapSelectOptionsRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.511Z
 */
public class GetPackageMapSelectOptionsRequestWrapper
{
protected boolean local_includeTargets;
protected boolean local_includeProcesses;
protected boolean local_includeProcessFilters;

	public GetPackageMapSelectOptionsRequestWrapper() {}

	public GetPackageMapSelectOptionsRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest getpackagemapselectoptionsrequest)
	{
		copy( getpackagemapselectoptionsrequest );
	}
	public GetPackageMapSelectOptionsRequestWrapper( boolean _includeTargets, boolean _includeProcesses, boolean _includeProcessFilters )
	{
		this.local_includeTargets = _includeTargets;
		this.local_includeProcesses = _includeProcesses;
		this.local_includeProcessFilters = _includeProcessFilters;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest raw )
	{
		if (raw == null)
			return;

		this.local_includeTargets = raw.getIncludeTargets();
		this.local_includeProcesses = raw.getIncludeProcesses();
		this.local_includeProcessFilters = raw.getIncludeProcessFilters();

	}

	@Override
	public String toString()
	{
		return "GetPackageMapSelectOptionsRequestWrapper [" + "includeTargets = " + local_includeTargets + ", " + "includeProcesses = " + local_includeProcesses + ", " + "includeProcessFilters = " + local_includeProcessFilters + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.GetPackageMapSelectOptionsRequest();
		raw.setIncludeTargets( local_includeTargets);
		raw.setIncludeProcesses( local_includeProcesses);
		raw.setIncludeProcessFilters( local_includeProcessFilters);
		return raw;
	}


	public void setIncludeTargets( boolean _includeTargets )
	{
		this.local_includeTargets = _includeTargets;
	}
	public boolean getIncludeTargets( )
	{
		return this.local_includeTargets;
	}
	public void setIncludeProcesses( boolean _includeProcesses )
	{
		this.local_includeProcesses = _includeProcesses;
	}
	public boolean getIncludeProcesses( )
	{
		return this.local_includeProcesses;
	}
	public void setIncludeProcessFilters( boolean _includeProcessFilters )
	{
		this.local_includeProcessFilters = _includeProcessFilters;
	}
	public boolean getIncludeProcessFilters( )
	{
		return this.local_includeProcessFilters;
	}
}