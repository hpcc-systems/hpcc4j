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
 * Class name: WURecreateQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.982Z
 */
public class WURecreateQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_querySet;
    protected String local_queryName;
    protected String local_queryId;
    protected String local_memoryLimit;
    protected NonNegativeInteger local_timeLimit;
    protected NonNegativeInteger local_warnTimeLimit;
    protected String local_priority;
    protected String local_comment;
    protected boolean local_reloadFailed;
    protected boolean local_suspended;
    protected String local_errorMessage;
    protected FileErrors_type4Wrapper local_fileErrors;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public WURecreateQueryResponseWrapper() {}

    public WURecreateQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse wurecreatequeryresponse)
    {
        copy( wurecreatequeryresponse );
    }
    public WURecreateQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _querySet, String _queryName, String _queryId, String _memoryLimit, NonNegativeInteger _timeLimit, NonNegativeInteger _warnTimeLimit, String _priority, String _comment, boolean _reloadFailed, boolean _suspended, String _errorMessage, FileErrors_type4Wrapper _fileErrors, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_querySet = _querySet;
        this.local_queryName = _queryName;
        this.local_queryId = _queryId;
        this.local_memoryLimit = _memoryLimit;
        this.local_timeLimit = _timeLimit;
        this.local_warnTimeLimit = _warnTimeLimit;
        this.local_priority = _priority;
        this.local_comment = _comment;
        this.local_reloadFailed = _reloadFailed;
        this.local_suspended = _suspended;
        this.local_errorMessage = _errorMessage;
        this.local_fileErrors = _fileErrors;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_querySet = raw.getQuerySet();
        this.local_queryName = raw.getQueryName();
        this.local_queryId = raw.getQueryId();
        this.local_memoryLimit = raw.getMemoryLimit();
        this.local_timeLimit = raw.getTimeLimit();
        this.local_warnTimeLimit = raw.getWarnTimeLimit();
        this.local_priority = raw.getPriority();
        this.local_comment = raw.getComment();
        this.local_reloadFailed = raw.getReloadFailed();
        this.local_suspended = raw.getSuspended();
        this.local_errorMessage = raw.getErrorMessage();
        if (raw.getFileErrors() != null)
            this.local_fileErrors = new FileErrors_type4Wrapper( raw.getFileErrors());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "WURecreateQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "querySet = " + local_querySet + ", " + "queryName = " + local_queryName + ", " + "queryId = " + local_queryId + ", " + "memoryLimit = " + local_memoryLimit + ", " + "timeLimit = " + local_timeLimit + ", " + "warnTimeLimit = " + local_warnTimeLimit + ", " + "priority = " + local_priority + ", " + "comment = " + local_comment + ", " + "reloadFailed = " + local_reloadFailed + ", " + "suspended = " + local_suspended + ", " + "errorMessage = " + local_errorMessage + ", " + "fileErrors = " + local_fileErrors + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURecreateQueryResponse();
        raw.setWuid( local_wuid);
        raw.setQuerySet( local_querySet);
        raw.setQueryName( local_queryName);
        raw.setQueryId( local_queryId);
        raw.setMemoryLimit( local_memoryLimit);
        raw.setTimeLimit( local_timeLimit);
        raw.setWarnTimeLimit( local_warnTimeLimit);
        raw.setPriority( local_priority);
        raw.setComment( local_comment);
        raw.setReloadFailed( local_reloadFailed);
        raw.setSuspended( local_suspended);
        raw.setErrorMessage( local_errorMessage);
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setDfuPublisherState( local_dfuPublisherState);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQueryName( String _queryName )
    {
        this.local_queryName = _queryName;
    }
    public String getQueryName( )
    {
        return this.local_queryName;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
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
    public void setReloadFailed( boolean _reloadFailed )
    {
        this.local_reloadFailed = _reloadFailed;
    }
    public boolean getReloadFailed( )
    {
        return this.local_reloadFailed;
    }
    public void setSuspended( boolean _suspended )
    {
        this.local_suspended = _suspended;
    }
    public boolean getSuspended( )
    {
        return this.local_suspended;
    }
    public void setErrorMessage( String _errorMessage )
    {
        this.local_errorMessage = _errorMessage;
    }
    public String getErrorMessage( )
    {
        return this.local_errorMessage;
    }
    public void setFileErrors( FileErrors_type4Wrapper _fileErrors )
    {
        this.local_fileErrors = _fileErrors;
    }
    public FileErrors_type4Wrapper getFileErrors( )
    {
        return this.local_fileErrors;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setDfuPublisherState( String _dfuPublisherState )
    {
        this.local_dfuPublisherState = _dfuPublisherState;
    }
    public String getDfuPublisherState( )
    {
        return this.local_dfuPublisherState;
    }
}