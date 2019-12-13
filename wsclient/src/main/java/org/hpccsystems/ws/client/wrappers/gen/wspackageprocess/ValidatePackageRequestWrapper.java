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
 * Class name: ValidatePackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.582Z
 */
public class ValidatePackageRequestWrapper
{
protected String local_info;
protected String local_target;
protected String local_process;
protected boolean local_active;
protected String local_pMID;
protected String local_queryIdToVerify;
protected List<String> local_queriesToVerify = new ArrayList<String>();
protected boolean local_checkDFS;
protected boolean local_globalScope;

	public ValidatePackageRequestWrapper() {}

	public ValidatePackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest validatepackagerequest)
	{
		copy( validatepackagerequest );
	}
	public ValidatePackageRequestWrapper( String _info, String _target, String _process, boolean _active, String _pMID, String _queryIdToVerify, List<String> _queriesToVerify, boolean _checkDFS, boolean _globalScope )
	{
		this.local_info = _info;
		this.local_target = _target;
		this.local_process = _process;
		this.local_active = _active;
		this.local_pMID = _pMID;
		this.local_queryIdToVerify = _queryIdToVerify;
		this.local_queriesToVerify = _queriesToVerify;
		this.local_checkDFS = _checkDFS;
		this.local_globalScope = _globalScope;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest raw )
	{
		if (raw == null)
			return;

		this.local_info = raw.getInfo();
		this.local_target = raw.getTarget();
		this.local_process = raw.getProcess();
		this.local_active = raw.getActive();
		this.local_pMID = raw.getPMID();
		this.local_queryIdToVerify = raw.getQueryIdToVerify();
		if (raw.getQueriesToVerify() != null)
		{
			this.local_queriesToVerify = new ArrayList<String>();
			for ( int i = 0; i < raw.getQueriesToVerify().getItem().length; i++)
			{
				this.local_queriesToVerify.add(new String(raw.getQueriesToVerify().getItem()[i]));
			}
		}		this.local_checkDFS = raw.getCheckDFS();
		this.local_globalScope = raw.getGlobalScope();

	}

	@Override
	public String toString()
	{
		return "ValidatePackageRequestWrapper [" + "info = " + local_info + ", " + "target = " + local_target + ", " + "process = " + local_process + ", " + "active = " + local_active + ", " + "pMID = " + local_pMID + ", " + "queryIdToVerify = " + local_queryIdToVerify + ", " + "queriesToVerify = " + local_queriesToVerify + ", " + "checkDFS = " + local_checkDFS + ", " + "globalScope = " + local_globalScope + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.ValidatePackageRequest();
		raw.setInfo( local_info);
		raw.setTarget( local_target);
		raw.setProcess( local_process);
		raw.setActive( local_active);
		raw.setPMID( local_pMID);
		raw.setQueryIdToVerify( local_queryIdToVerify);
		if (this.local_queriesToVerify!= null)
		{
			EspStringArray arr = new EspStringArray();
			for ( int i = 0; i < this.local_queriesToVerify.size(); i++)
			{
				arr.addItem(this.local_queriesToVerify.get(i));
			}
			raw.setQueriesToVerify(arr);
		}
		raw.setCheckDFS( local_checkDFS);
		raw.setGlobalScope( local_globalScope);
		return raw;
	}


	public void setInfo( String _info )
	{
		this.local_info = _info;
	}
	public String getInfo( )
	{
		return this.local_info;
	}
	public void setTarget( String _target )
	{
		this.local_target = _target;
	}
	public String getTarget( )
	{
		return this.local_target;
	}
	public void setProcess( String _process )
	{
		this.local_process = _process;
	}
	public String getProcess( )
	{
		return this.local_process;
	}
	public void setActive( boolean _active )
	{
		this.local_active = _active;
	}
	public boolean getActive( )
	{
		return this.local_active;
	}
	public void setPMID( String _pMID )
	{
		this.local_pMID = _pMID;
	}
	public String getPMID( )
	{
		return this.local_pMID;
	}
	public void setQueryIdToVerify( String _queryIdToVerify )
	{
		this.local_queryIdToVerify = _queryIdToVerify;
	}
	public String getQueryIdToVerify( )
	{
		return this.local_queryIdToVerify;
	}
	public void setQueriesToVerify( List<String> _queriesToVerify )
	{
		this.local_queriesToVerify = _queriesToVerify;
	}
	public List<String> getQueriesToVerify( )
	{
		return this.local_queriesToVerify;
	}
	public void setCheckDFS( boolean _checkDFS )
	{
		this.local_checkDFS = _checkDFS;
	}
	public boolean getCheckDFS( )
	{
		return this.local_checkDFS;
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