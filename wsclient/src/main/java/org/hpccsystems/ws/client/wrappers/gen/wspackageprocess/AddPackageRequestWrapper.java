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
 * Class name: AddPackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_04.AddPackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2020-09-23T03:53:35.661Z
 */
public class AddPackageRequestWrapper
{
    protected String local_info;
    protected boolean local_activate;
    protected boolean local_overWrite;
    protected String local_target;
    protected String local_packageMap;
    protected String local_process;
    protected String local_daliIp;
    protected boolean local_globalScope;
    protected String local_sourceProcess;
    protected boolean local_allowForeignFiles;
    protected boolean local_preloadAllPackages;
    protected boolean local_replacePackageMap;
    protected boolean local_updateSuperFiles;
    protected boolean local_updateCloneFrom;
    protected boolean local_appendCluster;

    public AddPackageRequestWrapper() {}

    public AddPackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest addpackagerequest)
    {
        copy( addpackagerequest );
    }
    public AddPackageRequestWrapper( String _info, boolean _activate, boolean _overWrite, String _target, String _packageMap, String _process, String _daliIp, boolean _globalScope, String _sourceProcess, boolean _allowForeignFiles, boolean _preloadAllPackages, boolean _replacePackageMap, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster )
    {
        this.local_info = _info;
        this.local_activate = _activate;
        this.local_overWrite = _overWrite;
        this.local_target = _target;
        this.local_packageMap = _packageMap;
        this.local_process = _process;
        this.local_daliIp = _daliIp;
        this.local_globalScope = _globalScope;
        this.local_sourceProcess = _sourceProcess;
        this.local_allowForeignFiles = _allowForeignFiles;
        this.local_preloadAllPackages = _preloadAllPackages;
        this.local_replacePackageMap = _replacePackageMap;
        this.local_updateSuperFiles = _updateSuperFiles;
        this.local_updateCloneFrom = _updateCloneFrom;
        this.local_appendCluster = _appendCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest raw )
    {
        if (raw == null)
            return;

        this.local_info = raw.getInfo();
        this.local_activate = raw.getActivate();
        this.local_overWrite = raw.getOverWrite();
        this.local_target = raw.getTarget();
        this.local_packageMap = raw.getPackageMap();
        this.local_process = raw.getProcess();
        this.local_daliIp = raw.getDaliIp();
        this.local_globalScope = raw.getGlobalScope();
        this.local_sourceProcess = raw.getSourceProcess();
        this.local_allowForeignFiles = raw.getAllowForeignFiles();
        this.local_preloadAllPackages = raw.getPreloadAllPackages();
        this.local_replacePackageMap = raw.getReplacePackageMap();
        this.local_updateSuperFiles = raw.getUpdateSuperFiles();
        this.local_updateCloneFrom = raw.getUpdateCloneFrom();
        this.local_appendCluster = raw.getAppendCluster();

    }

    @Override
    public String toString()
    {
        return "AddPackageRequestWrapper [" + "info = " + local_info + ", " + "activate = " + local_activate + ", " + "overWrite = " + local_overWrite + ", " + "target = " + local_target + ", " + "packageMap = " + local_packageMap + ", " + "process = " + local_process + ", " + "daliIp = " + local_daliIp + ", " + "globalScope = " + local_globalScope + ", " + "sourceProcess = " + local_sourceProcess + ", " + "allowForeignFiles = " + local_allowForeignFiles + ", " + "preloadAllPackages = " + local_preloadAllPackages + ", " + "replacePackageMap = " + local_replacePackageMap + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.AddPackageRequest();
        raw.setInfo( local_info);
        raw.setActivate( local_activate);
        raw.setOverWrite( local_overWrite);
        raw.setTarget( local_target);
        raw.setPackageMap( local_packageMap);
        raw.setProcess( local_process);
        raw.setDaliIp( local_daliIp);
        raw.setGlobalScope( local_globalScope);
        raw.setSourceProcess( local_sourceProcess);
        raw.setAllowForeignFiles( local_allowForeignFiles);
        raw.setPreloadAllPackages( local_preloadAllPackages);
        raw.setReplacePackageMap( local_replacePackageMap);
        raw.setUpdateSuperFiles( local_updateSuperFiles);
        raw.setUpdateCloneFrom( local_updateCloneFrom);
        raw.setAppendCluster( local_appendCluster);
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
    public void setActivate( boolean _activate )
    {
        this.local_activate = _activate;
    }
    public boolean getActivate( )
    {
        return this.local_activate;
    }
    public void setOverWrite( boolean _overWrite )
    {
        this.local_overWrite = _overWrite;
    }
    public boolean getOverWrite( )
    {
        return this.local_overWrite;
    }
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setPackageMap( String _packageMap )
    {
        this.local_packageMap = _packageMap;
    }
    public String getPackageMap( )
    {
        return this.local_packageMap;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setDaliIp( String _daliIp )
    {
        this.local_daliIp = _daliIp;
    }
    public String getDaliIp( )
    {
        return this.local_daliIp;
    }
    public void setGlobalScope( boolean _globalScope )
    {
        this.local_globalScope = _globalScope;
    }
    public boolean getGlobalScope( )
    {
        return this.local_globalScope;
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
    public void setReplacePackageMap( boolean _replacePackageMap )
    {
        this.local_replacePackageMap = _replacePackageMap;
    }
    public boolean getReplacePackageMap( )
    {
        return this.local_replacePackageMap;
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