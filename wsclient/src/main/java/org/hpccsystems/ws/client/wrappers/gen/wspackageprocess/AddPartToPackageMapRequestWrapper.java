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
 * Class name: AddPartToPackageMapRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2019-12-13T14:42:31.440Z
 */
public class AddPartToPackageMapRequestWrapper
{
protected String local_target;
protected String local_process;
protected String local_packageMap;
protected boolean local_globalScope;
protected String local_partName;
protected String local_content;
protected boolean local_deletePrevious;
protected String local_daliIp;
protected String local_sourceProcess;
protected boolean local_allowForeignFiles;
protected boolean local_preloadAllPackages;
protected boolean local_updateSuperFiles;
protected boolean local_updateCloneFrom;
protected boolean local_appendCluster;

	public AddPartToPackageMapRequestWrapper() {}

	public AddPartToPackageMapRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest addparttopackagemaprequest)
	{
		copy( addparttopackagemaprequest );
	}
	public AddPartToPackageMapRequestWrapper( String _target, String _process, String _packageMap, boolean _globalScope, String _partName, String _content, boolean _deletePrevious, String _daliIp, String _sourceProcess, boolean _allowForeignFiles, boolean _preloadAllPackages, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster )
	{
		this.local_target = _target;
		this.local_process = _process;
		this.local_packageMap = _packageMap;
		this.local_globalScope = _globalScope;
		this.local_partName = _partName;
		this.local_content = _content;
		this.local_deletePrevious = _deletePrevious;
		this.local_daliIp = _daliIp;
		this.local_sourceProcess = _sourceProcess;
		this.local_allowForeignFiles = _allowForeignFiles;
		this.local_preloadAllPackages = _preloadAllPackages;
		this.local_updateSuperFiles = _updateSuperFiles;
		this.local_updateCloneFrom = _updateCloneFrom;
		this.local_appendCluster = _appendCluster;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest raw )
	{
		if (raw == null)
			return;

		this.local_target = raw.getTarget();
		this.local_process = raw.getProcess();
		this.local_packageMap = raw.getPackageMap();
		this.local_globalScope = raw.getGlobalScope();
		this.local_partName = raw.getPartName();
		this.local_content = raw.getContent();
		this.local_deletePrevious = raw.getDeletePrevious();
		this.local_daliIp = raw.getDaliIp();
		this.local_sourceProcess = raw.getSourceProcess();
		this.local_allowForeignFiles = raw.getAllowForeignFiles();
		this.local_preloadAllPackages = raw.getPreloadAllPackages();
		this.local_updateSuperFiles = raw.getUpdateSuperFiles();
		this.local_updateCloneFrom = raw.getUpdateCloneFrom();
		this.local_appendCluster = raw.getAppendCluster();

	}

	@Override
	public String toString()
	{
		return "AddPartToPackageMapRequestWrapper [" + "target = " + local_target + ", " + "process = " + local_process + ", " + "packageMap = " + local_packageMap + ", " + "globalScope = " + local_globalScope + ", " + "partName = " + local_partName + ", " + "content = " + local_content + ", " + "deletePrevious = " + local_deletePrevious + ", " + "daliIp = " + local_daliIp + ", " + "sourceProcess = " + local_sourceProcess + ", " + "allowForeignFiles = " + local_allowForeignFiles + ", " + "preloadAllPackages = " + local_preloadAllPackages + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.AddPartToPackageMapRequest();
		raw.setTarget( local_target);
		raw.setProcess( local_process);
		raw.setPackageMap( local_packageMap);
		raw.setGlobalScope( local_globalScope);
		raw.setPartName( local_partName);
		raw.setContent( local_content);
		raw.setDeletePrevious( local_deletePrevious);
		raw.setDaliIp( local_daliIp);
		raw.setSourceProcess( local_sourceProcess);
		raw.setAllowForeignFiles( local_allowForeignFiles);
		raw.setPreloadAllPackages( local_preloadAllPackages);
		raw.setUpdateSuperFiles( local_updateSuperFiles);
		raw.setUpdateCloneFrom( local_updateCloneFrom);
		raw.setAppendCluster( local_appendCluster);
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
	public void setProcess( String _process )
	{
		this.local_process = _process;
	}
	public String getProcess( )
	{
		return this.local_process;
	}
	public void setPackageMap( String _packageMap )
	{
		this.local_packageMap = _packageMap;
	}
	public String getPackageMap( )
	{
		return this.local_packageMap;
	}
	public void setGlobalScope( boolean _globalScope )
	{
		this.local_globalScope = _globalScope;
	}
	public boolean getGlobalScope( )
	{
		return this.local_globalScope;
	}
	public void setPartName( String _partName )
	{
		this.local_partName = _partName;
	}
	public String getPartName( )
	{
		return this.local_partName;
	}
	public void setContent( String _content )
	{
		this.local_content = _content;
	}
	public String getContent( )
	{
		return this.local_content;
	}
	public void setDeletePrevious( boolean _deletePrevious )
	{
		this.local_deletePrevious = _deletePrevious;
	}
	public boolean getDeletePrevious( )
	{
		return this.local_deletePrevious;
	}
	public void setDaliIp( String _daliIp )
	{
		this.local_daliIp = _daliIp;
	}
	public String getDaliIp( )
	{
		return this.local_daliIp;
	}
	public void setSourceProcess( String _sourceProcess )
	{
		this.local_sourceProcess = _sourceProcess;
	}
	public String getSourceProcess( )
	{
		return this.local_sourceProcess;
	}
	public void setAllowForeignFiles( boolean _allowForeignFiles )
	{
		this.local_allowForeignFiles = _allowForeignFiles;
	}
	public boolean getAllowForeignFiles( )
	{
		return this.local_allowForeignFiles;
	}
	public void setPreloadAllPackages( boolean _preloadAllPackages )
	{
		this.local_preloadAllPackages = _preloadAllPackages;
	}
	public boolean getPreloadAllPackages( )
	{
		return this.local_preloadAllPackages;
	}
	public void setUpdateSuperFiles( boolean _updateSuperFiles )
	{
		this.local_updateSuperFiles = _updateSuperFiles;
	}
	public boolean getUpdateSuperFiles( )
	{
		return this.local_updateSuperFiles;
	}
	public void setUpdateCloneFrom( boolean _updateCloneFrom )
	{
		this.local_updateCloneFrom = _updateCloneFrom;
	}
	public boolean getUpdateCloneFrom( )
	{
		return this.local_updateCloneFrom;
	}
	public void setAppendCluster( boolean _appendCluster )
	{
		this.local_appendCluster = _appendCluster;
	}
	public boolean getAppendCluster( )
	{
		return this.local_appendCluster;
	}
}