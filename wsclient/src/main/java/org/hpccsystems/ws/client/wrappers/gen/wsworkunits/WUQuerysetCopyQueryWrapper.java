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
 * Class name: WUQuerysetCopyQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUQuerysetCopyQueryWrapper
{
    protected String local_source;
    protected String local_target;
    protected String local_cluster;
    protected String local_daliServer;
    protected int local_activate;
    protected boolean local_overwrite;
    protected boolean local_dontCopyFiles;
    protected int local_wait;
    protected boolean local_noReload;
    protected String local_memoryLimit;
    protected NonNegativeInteger local_timeLimit;
    protected NonNegativeInteger local_warnTimeLimit;
    protected String local_priority;
    protected String local_comment;
    protected String local_sourceProcess;
    protected String local_destName;
    protected boolean local_allowForeignFiles;
    protected boolean local_updateSuperFiles;
    protected boolean local_updateCloneFrom;
    protected boolean local_appendCluster;
    protected boolean local_includeFileErrors;
    protected boolean local_sourceSSL;
    protected boolean local_dfuCopyFiles;
    protected String local_dfuQueue;
    protected NonNegativeInteger local_dfuWait;
    protected boolean local_dfuOverwrite;
    protected boolean local_onlyCopyFiles;
    protected boolean local_stopIfFilesCopied;
    protected String local_dfuPublisherWuid;
    protected String local_remoteStorage;
    protected String local_keyCompression;

    public WUQuerysetCopyQueryWrapper() {}

    public WUQuerysetCopyQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery wuquerysetcopyquery)
    {
        copy( wuquerysetcopyquery );
    }
    public WUQuerysetCopyQueryWrapper( String _source, String _target, String _cluster, String _daliServer, int _activate, boolean _overwrite, boolean _dontCopyFiles, int _wait, boolean _noReload, String _memoryLimit, NonNegativeInteger _timeLimit, NonNegativeInteger _warnTimeLimit, String _priority, String _comment, String _sourceProcess, String _destName, boolean _allowForeignFiles, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster, boolean _includeFileErrors, boolean _sourceSSL, boolean _dfuCopyFiles, String _dfuQueue, NonNegativeInteger _dfuWait, boolean _dfuOverwrite, boolean _onlyCopyFiles, boolean _stopIfFilesCopied, String _dfuPublisherWuid, String _remoteStorage, String _keyCompression )
    {
        this.local_source = _source;
        this.local_target = _target;
        this.local_cluster = _cluster;
        this.local_daliServer = _daliServer;
        this.local_activate = _activate;
        this.local_overwrite = _overwrite;
        this.local_dontCopyFiles = _dontCopyFiles;
        this.local_wait = _wait;
        this.local_noReload = _noReload;
        this.local_memoryLimit = _memoryLimit;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_priority = _priority;
        this.local_comment = _comment;
        this.local_sourceProcess = _sourceProcess;
        this.local_destName = _destName;
        this.local_allowForeignFiles = _allowForeignFiles;
        this.local_updateSuperFiles = _updateSuperFiles;
        this.local_updateCloneFrom = _updateCloneFrom;
        this.local_appendCluster = _appendCluster;
        this.local_includeFileErrors = _includeFileErrors;
        this.local_sourceSSL = _sourceSSL;
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

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery raw )
    {
        if (raw == null)
            return;

        this.local_source = raw.getSource();
        this.local_target = raw.getTarget();
        this.local_cluster = raw.getCluster();
        this.local_daliServer = raw.getDaliServer();
        this.local_activate = raw.getActivate();
        this.local_overwrite = raw.getOverwrite();
        this.local_dontCopyFiles = raw.getDontCopyFiles();
        this.local_wait = raw.getWait();
        this.local_noReload = raw.getNoReload();
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_priority = raw.getPriority();
        this.local_comment = raw.getComment();
        this.local_sourceProcess = raw.getSourceProcess();
        this.local_destName = raw.getDestName();
        this.local_allowForeignFiles = raw.getAllowForeignFiles();
        this.local_updateSuperFiles = raw.getUpdateSuperFiles();
        this.local_updateCloneFrom = raw.getUpdateCloneFrom();
        this.local_appendCluster = raw.getAppendCluster();
        this.local_includeFileErrors = raw.getIncludeFileErrors();
        this.local_sourceSSL = raw.getSourceSSL();
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
        return "WUQuerysetCopyQueryWrapper [" + "source = " + local_source + ", " + "target = " + local_target + ", " + "cluster = " + local_cluster + ", " + "daliServer = " + local_daliServer + ", " + "activate = " + local_activate + ", " + "overwrite = " + local_overwrite + ", " + "dontCopyFiles = " + local_dontCopyFiles + ", " + "wait = " + local_wait + ", " + "noReload = " + local_noReload + ", " + "memoryLimit = " + local_memoryLimit + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "priority = " + local_priority + ", " + "comment = " + local_comment + ", " + "sourceProcess = " + local_sourceProcess + ", " + "destName = " + local_destName + ", " + "allowForeignFiles = " + local_allowForeignFiles + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + ", " + "includeFileErrors = " + local_includeFileErrors + ", " + "sourceSSL = " + local_sourceSSL + ", " + "dfuCopyFiles = " + local_dfuCopyFiles + ", " + "dfuQueue = " + local_dfuQueue + ", " + "dfuWait = " + local_dfuWait + ", " + "dfuOverwrite = " + local_dfuOverwrite + ", " + "onlyCopyFiles = " + local_onlyCopyFiles + ", " + "stopIfFilesCopied = " + local_stopIfFilesCopied + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "remoteStorage = " + local_remoteStorage + ", " + "keyCompression = " + local_keyCompression + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetCopyQuery();
        raw.setSource( local_source);
        raw.setTarget( local_target);
        raw.setCluster( local_cluster);
        raw.setDaliServer( local_daliServer);
        raw.setActivate( local_activate);
        raw.setOverwrite( local_overwrite);
        raw.setDontCopyFiles( local_dontCopyFiles);
        raw.setWait( local_wait);
        raw.setNoReload( local_noReload);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setPriority( local_priority);
        raw.setComment( local_comment);
        raw.setSourceProcess( local_sourceProcess);
        raw.setDestName( local_destName);
        raw.setAllowForeignFiles( local_allowForeignFiles);
        raw.setUpdateSuperFiles( local_updateSuperFiles);
        raw.setUpdateCloneFrom( local_updateCloneFrom);
        raw.setAppendCluster( local_appendCluster);
        raw.setIncludeFileErrors( local_includeFileErrors);
        raw.setSourceSSL( local_sourceSSL);
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


    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setDaliServer( String _daliServer )
    {
        this.local_daliServer = _daliServer;
    }
    public String getDaliServer( )
    {
        return this.local_daliServer;
    }
    public void setActivate( int _activate )
    {
        this.local_activate = _activate;
    }
    public int getActivate( )
    {
        return this.local_activate;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
    }
    public void setDontCopyFiles( boolean _dontCopyFiles )
    {
        this.local_dontCopyFiles = _dontCopyFiles;
    }
    public boolean getDontCopyFiles( )
    {
        return this.local_dontCopyFiles;
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
    public void setComment( String _comment )
    {
        this.local_comment = _comment;
    }
    public String getComment( )
    {
        return this.local_comment;
    }
    public void setSourceProcess( String _sourceProcess )
    {
        this.local_sourceProcess = _sourceProcess;
    }
    public String getSourceProcess( )
    {
        return this.local_sourceProcess;
    }
    public void setDestName( String _destName )
    {
        this.local_destName = _destName;
    }
    public String getDestName( )
    {
        return this.local_destName;
    }
    public void setAllowForeignFiles( boolean _allowForeignFiles )
    {
        this.local_allowForeignFiles = _allowForeignFiles;
    }
    public boolean getAllowForeignFiles( )
    {
        return this.local_allowForeignFiles;
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
    public void setSourceSSL( boolean _sourceSSL )
    {
        this.local_sourceSSL = _sourceSSL;
    }
    public boolean getSourceSSL( )
    {
        return this.local_sourceSSL;
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