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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUPublishWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.954Z
 */
public class WUPublishWorkunitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_result;
    protected String local_querySet;
    protected String local_queryName;
    protected String local_queryId;
    protected boolean local_reloadFailed;
    protected boolean local_suspended;
    protected String local_errorMessage;
    protected ClusterFiles_type0Wrapper local_clusterFiles;
    protected FileErrors_type0Wrapper local_fileErrors;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public WUPublishWorkunitResponseWrapper() {}

    public WUPublishWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse wupublishworkunitresponse)
    {
        copy( wupublishworkunitresponse );
    }
    public WUPublishWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _result, String _querySet, String _queryName, String _queryId, boolean _reloadFailed, boolean _suspended, String _errorMessage, ClusterFiles_type0Wrapper _clusterFiles, FileErrors_type0Wrapper _fileErrors, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_result = _result;
        this.local_querySet = _querySet;
        this.local_queryName = _queryName;
        this.local_queryId = _queryId;
        this.local_reloadFailed = _reloadFailed;
        this.local_suspended = _suspended;
        this.local_errorMessage = _errorMessage;
        this.local_clusterFiles = _clusterFiles;
        this.local_fileErrors = _fileErrors;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_result = raw.getResult();
        this.local_querySet = raw.getQuerySet();
        this.local_queryName = raw.getQueryName();
        this.local_queryId = raw.getQueryId();
        this.local_reloadFailed = raw.getReloadFailed();
        this.local_suspended = raw.getSuspended();
        this.local_errorMessage = raw.getErrorMessage();
        if (raw.getClusterFiles() != null)
            this.local_clusterFiles = new ClusterFiles_type0Wrapper( raw.getClusterFiles());
        if (raw.getFileErrors() != null)
            this.local_fileErrors = new FileErrors_type0Wrapper( raw.getFileErrors());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "WUPublishWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "result = " + local_result + ", " + "querySet = " + local_querySet + ", " + "queryName = " + local_queryName + ", " + "queryId = " + local_queryId + ", " + "reloadFailed = " + local_reloadFailed + ", " + "suspended = " + local_suspended + ", " + "errorMessage = " + local_errorMessage + ", " + "clusterFiles = " + local_clusterFiles + ", " + "fileErrors = " + local_fileErrors + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUPublishWorkunitResponse();
        raw.setWuid( local_wuid);
        raw.setResult( local_result);
        raw.setQuerySet( local_querySet);
        raw.setQueryName( local_queryName);
        raw.setQueryId( local_queryId);
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
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
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
    public void setClusterFiles( ClusterFiles_type0Wrapper _clusterFiles )
    {
        this.local_clusterFiles = _clusterFiles;
    }
    public ClusterFiles_type0Wrapper getClusterFiles( )
    {
        return this.local_clusterFiles;
    }
    public void setFileErrors( FileErrors_type0Wrapper _fileErrors )
    {
        this.local_fileErrors = _fileErrors;
    }
    public FileErrors_type0Wrapper getFileErrors( )
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