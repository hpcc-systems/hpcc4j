package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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
 * Class name: WUPublishWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUPublishWorkunitWrapper
{
    protected String local_wuid;
    protected String local_cluster;
    protected String local_queryName;
    protected String local_workUnitJobName;
    protected String local_jobName;
    protected int local_activate;
    protected boolean local_notifyCluster;
    protected int local_wait;
    protected boolean local_noReload;
    protected boolean local_updateWorkUnitName;
    protected String local_memoryLimit;
    protected NonNegativeInteger local_timeLimit;
    protected NonNegativeInteger local_warnTimeLimit;
    protected String local_priority;
    protected String local_remoteDali;
    protected String local_comment;
    protected boolean local_dontCopyFiles;
    protected String local_sourceProcess;
    protected boolean local_allowForeignFiles;
    protected boolean local_updateDfs;
    protected boolean local_updateSuperFiles;
    protected boolean local_updateCloneFrom;
    protected boolean local_appendCluster;
    protected boolean local_includeFileErrors;
    protected boolean local_dfuCopyFiles;
    protected String local_dfuQueue;
    protected NonNegativeInteger local_dfuWait;
    protected boolean local_dfuOverwrite;
    protected boolean local_onlyCopyFiles;
    protected boolean local_stopIfFilesCopied;
    protected String local_dfuPublisherWuid;
    protected String local_remoteStorage;
    protected String local_keyCompression;

    public WUPublishWorkunitWrapper() {}

    public WUPublishWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit wupublishworkunit)
    {
        copy( wupublishworkunit );
    }
    public WUPublishWorkunitWrapper( String _wuid, String _cluster, String _queryName, String _workUnitJobName, String _jobName, int _activate, boolean _notifyCluster, int _wait, boolean _noReload, boolean _updateWorkUnitName, String _memoryLimit, NonNegativeInteger _timeLimit, NonNegativeInteger _warnTimeLimit, String _priority, String _remoteDali, String _comment, boolean _dontCopyFiles, String _sourceProcess, boolean _allowForeignFiles, boolean _updateDfs, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster, boolean _includeFileErrors, boolean _dfuCopyFiles, String _dfuQueue, NonNegativeInteger _dfuWait, boolean _dfuOverwrite, boolean _onlyCopyFiles, boolean _stopIfFilesCopied, String _dfuPublisherWuid, String _remoteStorage, String _keyCompression )
    {
        this.local_wuid = _wuid;
        this.local_cluster = _cluster;
        this.local_queryName = _queryName;
        this.local_workUnitJobName = _workUnitJobName;
        this.local_jobName = _jobName;
        this.local_activate = _activate;
        this.local_notifyCluster = _notifyCluster;
        this.local_wait = _wait;
        this.local_noReload = _noReload;
        this.local_updateWorkUnitName = _updateWorkUnitName;
        this.local_memoryLimit = _memoryLimit;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_priority = _priority;
        this.local_remoteDali = _remoteDali;
        this.local_comment = _comment;
        this.local_dontCopyFiles = _dontCopyFiles;
        this.local_sourceProcess = _sourceProcess;
        this.local_allowForeignFiles = _allowForeignFiles;
        this.local_updateDfs = _updateDfs;
        this.local_updateSuperFiles = _updateSuperFiles;
        this.local_updateCloneFrom = _updateCloneFrom;
        this.local_appendCluster = _appendCluster;
        this.local_includeFileErrors = _includeFileErrors;
        this.local_dfuCopyFiles = _dfuCopyFiles;
        this.local_dfuQueue = _dfuQueue;
        this.local_dfuWait = _dfuWait;
        this.local_dfuOverwrite = _dfuOverwrite;
        this.local_onlyCopyFiles = _onlyCopyFiles;
        this.local_stopIfFilesCopied = _stopIfFilesCopied;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_remoteStorage = _remoteStorage;
        this.local_keyCompression = _keyCompression;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_cluster = raw.getCluster();
        this.local_queryName = raw.getQueryName();
        this.local_workUnitJobName = raw.getWorkUnitJobName();
        this.local_jobName = raw.getJobName();
        this.local_activate = raw.getActivate();
        this.local_notifyCluster = raw.getNotifyCluster();
        this.local_wait = raw.getWait();
        this.local_noReload = raw.getNoReload();
        this.local_updateWorkUnitName = raw.getUpdateWorkUnitName();
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_priority = raw.getPriority();
        this.local_remoteDali = raw.getRemoteDali();
        this.local_comment = raw.getComment();
        this.local_dontCopyFiles = raw.getDontCopyFiles();
        this.local_sourceProcess = raw.getSourceProcess();
        this.local_allowForeignFiles = raw.getAllowForeignFiles();
        this.local_updateDfs = raw.getUpdateDfs();
        this.local_updateSuperFiles = raw.getUpdateSuperFiles();
        this.local_updateCloneFrom = raw.getUpdateCloneFrom();
        this.local_appendCluster = raw.getAppendCluster();
        this.local_includeFileErrors = raw.getIncludeFileErrors();
        this.local_dfuCopyFiles = raw.getDfuCopyFiles();
        this.local_dfuQueue = raw.getDfuQueue();
        this.local_dfuWait = raw.getDfuWait();
        this.local_dfuOverwrite = raw.getDfuOverwrite();
        this.local_onlyCopyFiles = raw.getOnlyCopyFiles();
        this.local_stopIfFilesCopied = raw.getStopIfFilesCopied();
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_remoteStorage = raw.getRemoteStorage();
        this.local_keyCompression = raw.getKeyCompression();

    }

    @Override
    public String toString()
    {
        return "WUPublishWorkunitWrapper [" + "wuid = " + local_wuid + ", " + "cluster = " + local_cluster + ", " + "queryName = " + local_queryName + ", " + "workUnitJobName = " + local_workUnitJobName + ", " + "jobName = " + local_jobName + ", " + "activate = " + local_activate + ", " + "notifyCluster = " + local_notifyCluster + ", " + "wait = " + local_wait + ", " + "noReload = " + local_noReload + ", " + "updateWorkUnitName = " + local_updateWorkUnitName + ", " + "memoryLimit = " + local_memoryLimit + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "priority = " + local_priority + ", " + "remoteDali = " + local_remoteDali + ", " + "comment = " + local_comment + ", " + "dontCopyFiles = " + local_dontCopyFiles + ", " + "sourceProcess = " + local_sourceProcess + ", " + "allowForeignFiles = " + local_allowForeignFiles + ", " + "updateDfs = " + local_updateDfs + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + ", " + "includeFileErrors = " + local_includeFileErrors + ", " + "dfuCopyFiles = " + local_dfuCopyFiles + ", " + "dfuQueue = " + local_dfuQueue + ", " + "dfuWait = " + local_dfuWait + ", " + "dfuOverwrite = " + local_dfuOverwrite + ", " + "onlyCopyFiles = " + local_onlyCopyFiles + ", " + "stopIfFilesCopied = " + local_stopIfFilesCopied + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "remoteStorage = " + local_remoteStorage + ", " + "keyCompression = " + local_keyCompression + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunit();
        raw.setWuid( local_wuid);
        raw.setCluster( local_cluster);
        raw.setQueryName( local_queryName);
        raw.setWorkUnitJobName( local_workUnitJobName);
        raw.setJobName( local_jobName);
        raw.setActivate( local_activate);
        raw.setNotifyCluster( local_notifyCluster);
        raw.setWait( local_wait);
        raw.setNoReload( local_noReload);
        raw.setUpdateWorkUnitName( local_updateWorkUnitName);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setPriority( local_priority);
        raw.setRemoteDali( local_remoteDali);
        raw.setComment( local_comment);
        raw.setDontCopyFiles( local_dontCopyFiles);
        raw.setSourceProcess( local_sourceProcess);
        raw.setAllowForeignFiles( local_allowForeignFiles);
        raw.setUpdateDfs( local_updateDfs);
        raw.setUpdateSuperFiles( local_updateSuperFiles);
        raw.setUpdateCloneFrom( local_updateCloneFrom);
        raw.setAppendCluster( local_appendCluster);
        raw.setIncludeFileErrors( local_includeFileErrors);
        raw.setDfuCopyFiles( local_dfuCopyFiles);
        raw.setDfuQueue( local_dfuQueue);
        raw.setDfuWait( local_dfuWait);
        raw.setDfuOverwrite( local_dfuOverwrite);
        raw.setOnlyCopyFiles( local_onlyCopyFiles);
        raw.setStopIfFilesCopied( local_stopIfFilesCopied);
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setRemoteStorage( local_remoteStorage);
        raw.setKeyCompression( local_keyCompression);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setQueryName( String _queryName )
    {
        this.local_queryName = _queryName;
    }
    public String getQueryName( )
    {
        return this.local_queryName;
    }
    public void setWorkUnitJobName( String _workUnitJobName )
    {
        this.local_workUnitJobName = _workUnitJobName;
    }
    public String getWorkUnitJobName( )
    {
        return this.local_workUnitJobName;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
    }
    public void setActivate( int _activate )
    {
        this.local_activate = _activate;
    }
    public int getActivate( )
    {
        return this.local_activate;
    }
    public void setNotifyCluster( boolean _notifyCluster )
    {
        this.local_notifyCluster = _notifyCluster;
    }
    public boolean getNotifyCluster( )
    {
        return this.local_notifyCluster;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setNoReload( boolean _noReload )
    {
        this.local_noReload = _noReload;
    }
    public boolean getNoReload( )
    {
        return this.local_noReload;
    }
    public void setUpdateWorkUnitName( boolean _updateWorkUnitName )
    {
        this.local_updateWorkUnitName = _updateWorkUnitName;
    }
    public boolean getUpdateWorkUnitName( )
    {
        return this.local_updateWorkUnitName;
    }
    public void setMemoryLimit( String _memoryLimit )
    {
        this.local_memoryLimit = _memoryLimit;
    }
    public String getMemoryLimit( )
    {
        return this.local_memoryLimit;
    }
    public void setTimeLimit( NonNegativeInteger _timeLimit )
    {
        this.local_timeLimit = _timeLimit;
    }
    public NonNegativeInteger getTimeLimit( )
    {
        return this.local_timeLimit;
    }
    public void setWarnTimeLimit( NonNegativeInteger _warnTimeLimit )
    {
        this.local_warnTimeLimit = _warnTimeLimit;
    }
    public NonNegativeInteger getWarnTimeLimit( )
    {
        return this.local_warnTimeLimit;
    }
    public void setPriority( String _priority )
    {
        this.local_priority = _priority;
    }
    public String getPriority( )
    {
        return this.local_priority;
    }
    public void setRemoteDali( String _remoteDali )
    {
        this.local_remoteDali = _remoteDali;
    }
    public String getRemoteDali( )
    {
        return this.local_remoteDali;
    }
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
    public void setDontCopyFiles( boolean _dontCopyFiles )
    {
        this.local_dontCopyFiles = _dontCopyFiles;
    }
    public boolean getDontCopyFiles( )
    {
        return this.local_dontCopyFiles;
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
    public void setUpdateDfs( boolean _updateDfs )
    {
        this.local_updateDfs = _updateDfs;
    }
    public boolean getUpdateDfs( )
    {
        return this.local_updateDfs;
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
    public void setIncludeFileErrors( boolean _includeFileErrors )
    {
        this.local_includeFileErrors = _includeFileErrors;
    }
    public boolean getIncludeFileErrors( )
    {
        return this.local_includeFileErrors;
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
    public void setKeyCompression( String _keyCompression )
    {
        this.local_keyCompression = _keyCompression;
    }
    public String getKeyCompression( )
    {
        return this.local_keyCompression;
    }
}