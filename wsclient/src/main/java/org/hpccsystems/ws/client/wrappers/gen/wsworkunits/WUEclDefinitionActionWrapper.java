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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUEclDefinitionActionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUEclDefinitionActionWrapper
{
    protected List<String> local_eclDefinitions = null;
    protected EclDefinitionActionsWrapper local_actionType;
    protected String local_target;
    protected String local_remoteDali;
    protected String local_sourceProcess;
    protected String local_priority;
    protected String local_comment;
    protected String local_memoryLimit;
    protected boolean local_deletePrevious;
    protected boolean local_suspendPrevious;
    protected boolean local_noActivate;
    protected boolean local_noReload;
    protected boolean local_dontCopyFiles;
    protected boolean local_allowForeign;
    protected boolean local_updateDfs;
    protected boolean local_updateSuperfiles;
    protected boolean local_updateCloneFrom;
    protected boolean local_dontAppendCluster;
    protected int local_msToWait;
    protected int local_timeLimit;
    protected int local_warnTimeLimit;
    protected boolean local_dfuCopyFiles;
    protected boolean local_dfuOverwrite;
    protected String local_dfuQueue;
    protected boolean local_onlyCopyFiles;
    protected boolean local_stopIfFilesCopied;
    protected String local_dfuPublisherWuid;
    protected String local_remoteStorage;

    public WUEclDefinitionActionWrapper() {}

    public WUEclDefinitionActionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction wuecldefinitionaction)
    {
        copy( wuecldefinitionaction );
    }
    public WUEclDefinitionActionWrapper( List<String> _eclDefinitions, EclDefinitionActionsWrapper _actionType, String _target, String _remoteDali, String _sourceProcess, String _priority, String _comment, String _memoryLimit, boolean _deletePrevious, boolean _suspendPrevious, boolean _noActivate, boolean _noReload, boolean _dontCopyFiles, boolean _allowForeign, boolean _updateDfs, boolean _updateSuperfiles, boolean _updateCloneFrom, boolean _dontAppendCluster, int _msToWait, int _timeLimit, int _warnTimeLimit, boolean _dfuCopyFiles, boolean _dfuOverwrite, String _dfuQueue, boolean _onlyCopyFiles, boolean _stopIfFilesCopied, String _dfuPublisherWuid, String _remoteStorage )
    {
        this.local_eclDefinitions = _eclDefinitions;
        this.local_actionType = _actionType;
        this.local_target = _target;
        this.local_remoteDali = _remoteDali;
        this.local_sourceProcess = _sourceProcess;
        this.local_priority = _priority;
        this.local_comment = _comment;
        this.local_memoryLimit = _memoryLimit;
        this.local_deletePrevious = _deletePrevious;
        this.local_suspendPrevious = _suspendPrevious;
        this.local_noActivate = _noActivate;
        this.local_noReload = _noReload;
        this.local_dontCopyFiles = _dontCopyFiles;
        this.local_allowForeign = _allowForeign;
        this.local_updateDfs = _updateDfs;
        this.local_updateSuperfiles = _updateSuperfiles;
        this.local_updateCloneFrom = _updateCloneFrom;
        this.local_dontAppendCluster = _dontAppendCluster;
        this.local_msToWait = _msToWait;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_dfuCopyFiles = _dfuCopyFiles;
        this.local_dfuOverwrite = _dfuOverwrite;
        this.local_dfuQueue = _dfuQueue;
        this.local_onlyCopyFiles = _onlyCopyFiles;
        this.local_stopIfFilesCopied = _stopIfFilesCopied;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_remoteStorage = _remoteStorage;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction raw )
    {
        if (raw == null)
            return;

        if (raw.getEclDefinitions() != null && raw.getEclDefinitions().getItem() != null)
        {
            this.local_eclDefinitions = new ArrayList<String>();
            for ( int i = 0; i < raw.getEclDefinitions().getItem().length; i++)
            {
                this.local_eclDefinitions.add(new String(raw.getEclDefinitions().getItem()[i]));
            }
        }        if (raw.getActionType() != null)
            this.local_actionType = new EclDefinitionActionsWrapper( raw.getActionType());
        this.local_target = raw.getTarget();
        this.local_remoteDali = raw.getRemoteDali();
        this.local_sourceProcess = raw.getSourceProcess();
        this.local_priority = raw.getPriority();
        this.local_comment = raw.getComment();
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_deletePrevious = raw.getDeletePrevious();
        this.local_suspendPrevious = raw.getSuspendPrevious();
        this.local_noActivate = raw.getNoActivate();
        this.local_noReload = raw.getNoReload();
        this.local_dontCopyFiles = raw.getDontCopyFiles();
        this.local_allowForeign = raw.getAllowForeign();
        this.local_updateDfs = raw.getUpdateDfs();
        this.local_updateSuperfiles = raw.getUpdateSuperfiles();
        this.local_updateCloneFrom = raw.getUpdateCloneFrom();
        this.local_dontAppendCluster = raw.getDontAppendCluster();
        this.local_msToWait = raw.getMsToWait();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_dfuCopyFiles = raw.getDfuCopyFiles();
        this.local_dfuOverwrite = raw.getDfuOverwrite();
        this.local_dfuQueue = raw.getDfuQueue();
        this.local_onlyCopyFiles = raw.getOnlyCopyFiles();
        this.local_stopIfFilesCopied = raw.getStopIfFilesCopied();
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_remoteStorage = raw.getRemoteStorage();

    }

    @Override
    public String toString()
    {
        return "WUEclDefinitionActionWrapper [" + "eclDefinitions = " + local_eclDefinitions + ", " + "actionType = " + local_actionType + ", " + "target = " + local_target + ", " + "remoteDali = " + local_remoteDali + ", " + "sourceProcess = " + local_sourceProcess + ", " + "priority = " + local_priority + ", " + "comment = " + local_comment + ", " + "memoryLimit = " + local_memoryLimit + ", " + "deletePrevious = " + local_deletePrevious + ", " + "suspendPrevious = " + local_suspendPrevious + ", " + "noActivate = " + local_noActivate + ", " + "noReload = " + local_noReload + ", " + "dontCopyFiles = " + local_dontCopyFiles + ", " + "allowForeign = " + local_allowForeign + ", " + "updateDfs = " + local_updateDfs + ", " + "updateSuperfiles = " + local_updateSuperfiles + ", " + "updateCloneFrom = " + local_updateCloneFrom + ", " + "dontAppendCluster = " + local_dontAppendCluster + ", " + "msToWait = " + local_msToWait + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "dfuCopyFiles = " + local_dfuCopyFiles + ", " + "dfuOverwrite = " + local_dfuOverwrite + ", " + "dfuQueue = " + local_dfuQueue + ", " + "onlyCopyFiles = " + local_onlyCopyFiles + ", " + "stopIfFilesCopied = " + local_stopIfFilesCopied + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "remoteStorage = " + local_remoteStorage + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionAction();
        if (this.local_eclDefinitions!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_eclDefinitions.size(); i++)
            {
                arr.addItem(this.local_eclDefinitions.get(i));
            }
            raw.setEclDefinitions(arr);
        }
        if (local_actionType != null)
            raw.setActionType( local_actionType.getRaw());
        raw.setTarget( local_target);
        raw.setRemoteDali( local_remoteDali);
        raw.setSourceProcess( local_sourceProcess);
        raw.setPriority( local_priority);
        raw.setComment( local_comment);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setDeletePrevious( local_deletePrevious);
        raw.setSuspendPrevious( local_suspendPrevious);
        raw.setNoActivate( local_noActivate);
        raw.setNoReload( local_noReload);
        raw.setDontCopyFiles( local_dontCopyFiles);
        raw.setAllowForeign( local_allowForeign);
        raw.setUpdateDfs( local_updateDfs);
        raw.setUpdateSuperfiles( local_updateSuperfiles);
        raw.setUpdateCloneFrom( local_updateCloneFrom);
        raw.setDontAppendCluster( local_dontAppendCluster);
        raw.setMsToWait( local_msToWait);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setDfuCopyFiles( local_dfuCopyFiles);
        raw.setDfuOverwrite( local_dfuOverwrite);
        raw.setDfuQueue( local_dfuQueue);
        raw.setOnlyCopyFiles( local_onlyCopyFiles);
        raw.setStopIfFilesCopied( local_stopIfFilesCopied);
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setRemoteStorage( local_remoteStorage);
        return raw;
    }


    public void setEclDefinitions( List<String> _eclDefinitions )
    {
        this.local_eclDefinitions = _eclDefinitions;
    }
    public List<String> getEclDefinitions( )
    {
        return this.local_eclDefinitions;
    }
    public void setActionType( EclDefinitionActionsWrapper _actionType )
    {
        this.local_actionType = _actionType;
    }
    public EclDefinitionActionsWrapper getActionType( )
    {
        return this.local_actionType;
    }
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setRemoteDali( String _remoteDali )
    {
        this.local_remoteDali = _remoteDali;
    }
    public String getRemoteDali( )
    {
        return this.local_remoteDali;
    }
    public void setSourceProcess( String _sourceProcess )
    {
        this.local_sourceProcess = _sourceProcess;
    }
    public String getSourceProcess( )
    {
        return this.local_sourceProcess;
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
    public void setMemoryLimit( String _memoryLimit )
    {
        this.local_memoryLimit = _memoryLimit;
    }
    public String getMemoryLimit( )
    {
        return this.local_memoryLimit;
    }
    public void setDeletePrevious( boolean _deletePrevious )
    {
        this.local_deletePrevious = _deletePrevious;
    }
    public boolean getDeletePrevious( )
    {
        return this.local_deletePrevious;
    }
    public void setSuspendPrevious( boolean _suspendPrevious )
    {
        this.local_suspendPrevious = _suspendPrevious;
    }
    public boolean getSuspendPrevious( )
    {
        return this.local_suspendPrevious;
    }
    public void setNoActivate( boolean _noActivate )
    {
        this.local_noActivate = _noActivate;
    }
    public boolean getNoActivate( )
    {
        return this.local_noActivate;
    }
    public void setNoReload( boolean _noReload )
    {
        this.local_noReload = _noReload;
    }
    public boolean getNoReload( )
    {
        return this.local_noReload;
    }
    public void setDontCopyFiles( boolean _dontCopyFiles )
    {
        this.local_dontCopyFiles = _dontCopyFiles;
    }
    public boolean getDontCopyFiles( )
    {
        return this.local_dontCopyFiles;
    }
    public void setAllowForeign( boolean _allowForeign )
    {
        this.local_allowForeign = _allowForeign;
    }
    public boolean getAllowForeign( )
    {
        return this.local_allowForeign;
    }
    public void setUpdateDfs( boolean _updateDfs )
    {
        this.local_updateDfs = _updateDfs;
    }
    public boolean getUpdateDfs( )
    {
        return this.local_updateDfs;
    }
    public void setUpdateSuperfiles( boolean _updateSuperfiles )
    {
        this.local_updateSuperfiles = _updateSuperfiles;
    }
    public boolean getUpdateSuperfiles( )
    {
        return this.local_updateSuperfiles;
    }
    public void setUpdateCloneFrom( boolean _updateCloneFrom )
    {
        this.local_updateCloneFrom = _updateCloneFrom;
    }
    public boolean getUpdateCloneFrom( )
    {
        return this.local_updateCloneFrom;
    }
    public void setDontAppendCluster( boolean _dontAppendCluster )
    {
        this.local_dontAppendCluster = _dontAppendCluster;
    }
    public boolean getDontAppendCluster( )
    {
        return this.local_dontAppendCluster;
    }
    public void setMsToWait( int _msToWait )
    {
        this.local_msToWait = _msToWait;
    }
    public int getMsToWait( )
    {
        return this.local_msToWait;
    }
    public void setTimeLimit( int _timeLimit )
    {
        this.local_timeLimit = _timeLimit;
    }
    public int getTimeLimit( )
    {
        return this.local_timeLimit;
    }
    public void setWarnTimeLimit( int _warnTimeLimit )
    {
        this.local_warnTimeLimit = _warnTimeLimit;
    }
    public int getWarnTimeLimit( )
    {
        return this.local_warnTimeLimit;
    }
    public void setDfuCopyFiles( boolean _dfuCopyFiles )
    {
        this.local_dfuCopyFiles = _dfuCopyFiles;
    }
    public boolean getDfuCopyFiles( )
    {
        return this.local_dfuCopyFiles;
    }
    public void setDfuOverwrite( boolean _dfuOverwrite )
    {
        this.local_dfuOverwrite = _dfuOverwrite;
    }
    public boolean getDfuOverwrite( )
    {
        return this.local_dfuOverwrite;
    }
    public void setDfuQueue( String _dfuQueue )
    {
        this.local_dfuQueue = _dfuQueue;
    }
    public String getDfuQueue( )
    {
        return this.local_dfuQueue;
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