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
 * Class name: GetQueryFileMappingRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.701Z
 */
public class GetQueryFileMappingRequestWrapper
{
	protected String local_target;
	protected String local_pMID;
	protected String local_queryName;
	protected boolean local_globalScope;

	public GetQueryFileMappingRequestWrapper() {}

	public GetQueryFileMappingRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest getqueryfilemappingrequest)
	{
		copy( getqueryfilemappingrequest );
	}
	public GetQueryFileMappingRequestWrapper( String _target, String _pMID, String _queryName, boolean _globalScope )
	{
		this.local_target = _target;
		this.local_pMID = _pMID;
		this.local_queryName = _queryName;
		this.local_globalScope = _globalScope;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest raw )
	{
		if (raw == null)
			return;

		this.local_target = raw.getTarget();
		this.local_pMID = raw.getPMID();
		this.local_queryName = raw.getQueryName();
		this.local_globalScope = raw.getGlobalScope();

	}

	@Override
	public String toString()
	{
		return "GetQueryFileMappingRequestWrapper [" + "target = " + local_target + ", " + "pMID = " + local_pMID + ", " + "queryName = " + local_queryName + ", " + "globalScope = " + local_globalScope + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.GetQueryFileMappingRequest();
		raw.setTarget( local_target);
		raw.setPMID( local_pMID);
		raw.setQueryName( local_queryName);
		raw.setGlobalScope( local_globalScope);
		return raw;
	}


	public void setTarget( String _target )
	{
		this.local_target = _target;
	}
	public String getTarget( )
	{
		return this.local_target;
	}
	public void setPMID( String _pMID )
	{
		this.local_pMID = _pMID;
	}
	public String getPMID( )
	{
		return this.local_pMID;
	}
	public void setQueryName( String _queryName )
	{
		this.local_queryName = _queryName;
	}
	public String getQueryName( )
	{
		return this.local_queryName;
	}
	public void setGlobalScope( boolean _globalScope )
	{
		this.local_globalScope = _globalScope;
	}
	public boolean getGlobalScope( )
	{
		return this.local_globalScope;
	}
}