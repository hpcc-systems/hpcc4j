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
 * Class name: WUCopyQuerySetWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUCopyQuerySetWrapper
{
    protected String local_source;
    protected String local_target;
    protected boolean local_activeOnly;
    protected boolean local_cloneActiveState;
    protected boolean local_allowForeignFiles;
    protected String local_dfsServer;
    protected boolean local_copyFiles;
    protected boolean local_overwriteDfs;
    protected String local_sourceProcess;
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

    public WUCopyQuerySetWrapper() {}

    public WUCopyQuerySetWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet wucopyqueryset)
    {
        copy( wucopyqueryset );
    }
    public WUCopyQuerySetWrapper( String _source, String _target, boolean _activeOnly, boolean _cloneActiveState, boolean _allowForeignFiles, String _dfsServer, boolean _copyFiles, boolean _overwriteDfs, String _sourceProcess, boolean _updateSuperFiles, boolean _updateCloneFrom, boolean _appendCluster, boolean _includeFileErrors, boolean _sourceSSL, boolean _dfuCopyFiles, String _dfuQueue, NonNegativeInteger _dfuWait, boolean _dfuOverwrite, boolean _onlyCopyFiles, boolean _stopIfFilesCopied, String _dfuPublisherWuid, String _remoteStorage )
    {
        this.local_source = _source;
        this.local_target = _target;
        this.local_activeOnly = _activeOnly;
        this.local_cloneActiveState = _cloneActiveState;
        this.local_allowForeignFiles = _allowForeignFiles;
        this.local_dfsServer = _dfsServer;
        this.local_copyFiles = _copyFiles;
        this.local_overwriteDfs = _overwriteDfs;
        this.local_sourceProcess = _sourceProcess;
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

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet raw )
    {
        if (raw == null)
            return;

        this.local_source = raw.getSource();
        this.local_target = raw.getTarget();
        this.local_activeOnly = raw.getActiveOnly();
        this.local_cloneActiveState = raw.getCloneActiveState();
        this.local_allowForeignFiles = raw.getAllowForeignFiles();
        this.local_dfsServer = raw.getDfsServer();
        this.local_copyFiles = raw.getCopyFiles();
        this.local_overwriteDfs = raw.getOverwriteDfs();
        this.local_sourceProcess = raw.getSourceProcess();
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

    }

    @Override
    public String toString()
    {
        return "WUCopyQuerySetWrapper [" + "source = " + local_source + ", " + "target = " + local_target + ", " + "activeOnly = " + local_activeOnly + ", " + "cloneActiveState = " + local_cloneActiveState + ", " + "allowForeignFiles = " + local_allowForeignFiles + ", " + "dfsServer = " + local_dfsServer + ", " + "copyFiles = " + local_copyFiles + ", " + "overwriteDfs = " + local_overwriteDfs + ", " + "sourceProcess = " + local_sourceProcess + ", " + "updateSuperFiles = " + local_updateSuperFiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "appendCluster = " + local_appendCluster + ", " + "includeFileErrors = " + local_includeFileErrors + ", " + "sourceSSL = " + local_sourceSSL + ", " + "dfuCopyFiles = " + local_dfuCopyFiles + ", " + "dfuQueue = " + local_dfuQueue + ", " + "dfuWait = " + local_dfuWait + ", " + "dfuOverwrite = " + local_dfuOverwrite + ", " + "onlyCopyFiles = " + local_onlyCopyFiles + ", " + "stopIfFilesCopied = " + local_stopIfFilesCopied + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "remoteStorage = " + local_remoteStorage + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySet();
        raw.setSource( local_source);
        raw.setTarget( local_target);
        raw.setActiveOnly( local_activeOnly);
        raw.setCloneActiveState( local_cloneActiveState);
        raw.setAllowForeignFiles( local_allowForeignFiles);
        raw.setDfsServer( local_dfsServer);
        raw.setCopyFiles( local_copyFiles);
        raw.setOverwriteDfs( local_overwriteDfs);
        raw.setSourceProcess( local_sourceProcess);
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
    public void setActiveOnly( boolean _activeOnly )
    {
        this.local_activeOnly = _activeOnly;
    }
    public boolean getActiveOnly( )
    {
        return this.local_activeOnly;
    }
    public void setCloneActiveState( boolean _cloneActiveState )
    {
        this.local_cloneActiveState = _cloneActiveState;
    }
    public boolean getCloneActiveState( )
    {
        return this.local_cloneActiveState;
    }
    public void setAllowForeignFiles( boolean _allowForeignFiles )
    {
        this.local_allowForeignFiles = _allowForeignFiles;
    }
    public boolean getAllowForeignFiles( )
    {
        return this.local_allowForeignFiles;
    }
    public void setDfsServer( String _dfsServer )
    {
        this.local_dfsServer = _dfsServer;
    }
    public String getDfsServer( )
    {
        return this.local_dfsServer;
    }
    public void setCopyFiles( boolean _copyFiles )
    {
        this.local_copyFiles = _copyFiles;
    }
    public boolean getCopyFiles( )
    {
        return this.local_copyFiles;
    }
    public void setOverwriteDfs( boolean _overwriteDfs )
    {
        this.local_overwriteDfs = _overwriteDfs;
    }
    public boolean getOverwriteDfs( )
    {
        return this.local_overwriteDfs;
    }
    public void setSourceProcess( String _sourceProcess )
    {
        this.local_sourceProcess = _sourceProcess;
    }
    public String getSourceProcess( )
    {
        return this.local_sourceProcess;
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
}