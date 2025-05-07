package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
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
import org.apache.axis2.databinding.types.NonNegativeInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: CopyPackageMapRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 */
public class CopyPackageMapRequestWrapper
{
    protected String local_sourcePath;
    protected String local_remoteUserName;
    protected String local_remotePassword;
    protected String local_target;
    protected String local_process;
    protected String local_pMID;
    protected boolean local_activate;
    protected String local_daliIp;
    protected boolean local_globalScope;
    protected String local_sourceProcess;
    protected boolean local_preloadAllPackages;
    protected boolean local_replacePackageMap;
    protected boolean local_updateSuperFiles;
    protected boolean local_updateCloneFrom;
    protected boolean local_appendCluster;
    protected boolean local_dfuCopyFiles;
    protected String local_dfuQueue;
    protected NonNegativeInteger local_dfuWait;
    protected boolean local_dfuOverwrite;
    protected boolean local_onlyCopyFiles;
    protected boolean local_stopIfFilesCopied;
    protected String local_dfuPublisherWuid;
    protected String local_remoteStorage;

    public CopyPackageMapRequestWrapper() {}

    public CopyPackageMapRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest copypackagemaprequest)
    {
        copy( copypackagemaprequest );
    }
    public CopyPackageMapRequestWrapper( String _sourcePath, String _remoteUserName, String _remotePassword, String _target, String _process, String _pMID, boolean _activate, String _daliIp, boolean _globalScope, String _sourceProcess, boolean _preloadAllPackages, boolean _replacePackageMap, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster, boolean _dfuCopyFiles, String _dfuQueue, NonNegativeInteger _dfuWait, boolean _dfuOverwrite, boolean _onlyCopyFiles, boolean _stopIfFilesCopied, String _dfuPublisherWuid, String _remoteStorage )
    {
        this.local_sourcePath = _sourcePath;
        this.local_remoteUserName = _remoteUserName;
        this.local_remotePassword = _remotePassword;
        this.local_target = _target;
        this.local_process = _process;
        this.local_pMID = _pMID;
        this.local_activate = _activate;
        this.local_daliIp = _daliIp;
        this.local_globalScope = _globalScope;
        this.local_sourceProcess = _sourceProcess;
        this.local_preloadAllPackages = _preloadAllPackages;
        this.local_replacePackageMap = _replacePackageMap;
        this.local_updateSuperFiles = _updateSuperFiles;
        this.local_updateCloneFrom = _updateCloneFrom;
        this.local_appendCluster = _appendCluster;
        this.local_dfuCopyFiles = _dfuCopyFiles;
        this.local_dfuQueue = _dfuQueue;
        this.local_dfuWait = _dfuWait;
        this.local_dfuOverwrite = _dfuOverwrite;
        this.local_onlyCopyFiles = _onlyCopyFiles;
        this.local_stopIfFilesCopied = _stopIfFilesCopied;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_remoteStorage = _remoteStorage;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest raw )
    {
        if (raw == null)
            return;

        this.local_sourcePath = raw.getSourcePath();
        this.local_remoteUserName = raw.getRemoteUserName();
        this.local_remotePassword = raw.getRemotePassword();
        this.local_target = raw.getTarget();
        this.local_process = raw.getProcess();
        this.local_pMID = raw.getPMID();
        this.local_activate = raw.getActivate();
        this.local_daliIp = raw.getDaliIp();
        this.local_globalScope = raw.getGlobalScope();
        this.local_sourceProcess = raw.getSourceProcess();
        this.local_preloadAllPackages = raw.getPreloadAllPackages();
        this.local_replacePackageMap = raw.getReplacePackageMap();
        this.local_updateSuperFiles = raw.getUpdateSuperFiles();
        this.local_updateCloneFrom = raw.getUpdateCloneFrom();
        this.local_appendCluster = raw.getAppendCluster();
        this.local_dfuCopyFiles = raw.getDfuCopyFiles();
        this.local_dfuQueue = raw.getDfuQueue();
        this.local_dfuWait = raw.getDfuWait();
        this.local_dfuOverwrite = raw.getDfuOverwrite();
        this.local_onlyCopyFiles = raw.getOnlyCopyFiles();
        this.local_stopIfFilesCopied = raw.getStopIfFilesCopied();
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_remoteStorage = raw.getRemoteStorage();

    }

    @Override
    public String toString()
    {
        return "CopyPackageMapRequestWrapper [" + "sourcePath = " + local_sourcePath + ", " + "remoteUserName = " + local_remoteUserName + ", " + "remotePassword = " + local_remotePassword + ", " + "target = " + local_target + ", " + "process = " + local_process + ", " + "pMID = " + local_pMID + ", " + "activate = " + local_activate + ", " + "daliIp = " + local_daliIp + ", " + "globalScope = " + local_globalScope + ", " + "sourceProcess = " + local_sourceProcess + ", " + "preloadAllPackages = " + local_preloadAllPackages + ", " + "replacePackageMap = " + local_replacePackageMap + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + ", " + "dfuCopyFiles = " + local_dfuCopyFiles + ", " + "dfuQueue = " + local_dfuQueue + ", " + "dfuWait = " + local_dfuWait + ", " + "dfuOverwrite = " + local_dfuOverwrite + ", " + "onlyCopyFiles = " + local_onlyCopyFiles + ", " + "stopIfFilesCopied = " + local_stopIfFilesCopied + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "remoteStorage = " + local_remoteStorage + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.CopyPackageMapRequest();
        raw.setSourcePath( local_sourcePath);
        raw.setRemoteUserName( local_remoteUserName);
        raw.setRemotePassword( local_remotePassword);
        raw.setTarget( local_target);
        raw.setProcess( local_process);
        raw.setPMID( local_pMID);
        raw.setActivate( local_activate);
        raw.setDaliIp( local_daliIp);
        raw.setGlobalScope( local_globalScope);
        raw.setSourceProcess( local_sourceProcess);
        raw.setPreloadAllPackages( local_preloadAllPackages);
        raw.setReplacePackageMap( local_replacePackageMap);
        raw.setUpdateSuperFiles( local_updateSuperFiles);
        raw.setUpdateCloneFrom( local_updateCloneFrom);
        raw.setAppendCluster( local_appendCluster);
        raw.setDfuCopyFiles( local_dfuCopyFiles);
        raw.setDfuQueue( local_dfuQueue);
        raw.setDfuWait( local_dfuWait);
        raw.setDfuOverwrite( local_dfuOverwrite);
        raw.setOnlyCopyFiles( local_onlyCopyFiles);
        raw.setStopIfFilesCopied( local_stopIfFilesCopied);
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setRemoteStorage( local_remoteStorage);
        return raw;
    }


    public void setSourcePath( String _sourcePath )
    {
        this.local_sourcePath = _sourcePath;
    }
    public String getSourcePath( )
    {
        return this.local_sourcePath;
    }
    public void setRemoteUserName( String _remoteUserName )
    {
        this.local_remoteUserName = _remoteUserName;
    }
    public String getRemoteUserName( )
    {
        return this.local_remoteUserName;
    }
    public void setRemotePassword( String _remotePassword )
    {
        this.local_remotePassword = _remotePassword;
    }
    public String getRemotePassword( )
    {
        return this.local_remotePassword;
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
    public void setPMID( String _pMID )
    {
        this.local_pMID = _pMID;
    }
    public String getPMID( )
    {
        return this.local_pMID;
    }
    public void setActivate( boolean _activate )
    {
        this.local_activate = _activate;
    }
    public boolean getActivate( )
    {
        return this.local_activate;
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
    public void setDfuCopyFiles( boolean _dfuCopyFiles )
    {
        this.local_dfuCopyFiles = _dfuCopyFiles;
    }
    public boolean getDfuCopyFiles( )
    {
        return this.local_dfuCopyFiles;
    }
    public void setDfuQueue( String _dfuQueue )
    {
        this.local_dfuQueue = _dfuQueue;
    }
    public String getDfuQueue( )
    {
        return this.local_dfuQueue;
    }
    public void setDfuWait( NonNegativeInteger _dfuWait )
    {
        this.local_dfuWait = _dfuWait;
    }
    public NonNegativeInteger getDfuWait( )
    {
        return this.local_dfuWait;
    }
    public void setDfuOverwrite( boolean _dfuOverwrite )
    {
        this.local_dfuOverwrite = _dfuOverwrite;
    }
    public boolean getDfuOverwrite( )
    {
        return this.local_dfuOverwrite;
    }
    public void setOnlyCopyFiles( boolean _onlyCopyFiles )
    {
        this.local_onlyCopyFiles = _onlyCopyFiles;
    }
    public boolean getOnlyCopyFiles( )
    {
        return this.local_onlyCopyFiles;
    }
    public void setStopIfFilesCopied( boolean _stopIfFilesCopied )
    {
        this.local_stopIfFilesCopied = _stopIfFilesCopied;
    }
    public boolean getStopIfFilesCopied( )
    {
        return this.local_stopIfFilesCopied;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setRemoteStorage( String _remoteStorage )
    {
        this.local_remoteStorage = _remoteStorage;
    }
    public String getRemoteStorage( )
    {
        return this.local_remoteStorage;
    }
}