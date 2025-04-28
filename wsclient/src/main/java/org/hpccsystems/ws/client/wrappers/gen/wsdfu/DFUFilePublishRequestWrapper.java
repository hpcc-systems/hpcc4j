package org.hpccsystems.ws.client.wrappers.gen.wsdfu;

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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUFilePublishRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFilePublishRequestWrapper
{
    protected String local_fileId;
    protected boolean local_overwrite;
    protected DataHandler local_fileDescriptorBlob;
    protected long local_sessionId;
    protected int local_lockTimeoutMs;
    protected String local_eCLRecordDefinition;
    protected long local_recordCount;
    protected long local_fileSize;

    public DFUFilePublishRequestWrapper() {}

    public DFUFilePublishRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest dfufilepublishrequest)
    {
        copy( dfufilepublishrequest );
    }
    public DFUFilePublishRequestWrapper( String _fileId, boolean _overwrite, DataHandler _fileDescriptorBlob, long _sessionId, int _lockTimeoutMs, String _eCLRecordDefinition, long _recordCount, long _fileSize )
    {
        this.local_fileId = _fileId;
        this.local_overwrite = _overwrite;
        this.local_fileDescriptorBlob = _fileDescriptorBlob;
        this.local_sessionId = _sessionId;
        this.local_lockTimeoutMs = _lockTimeoutMs;
        this.local_eCLRecordDefinition = _eCLRecordDefinition;
        this.local_recordCount = _recordCount;
        this.local_fileSize = _fileSize;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest raw )
    {
        if (raw == null)
            return;

        this.local_fileId = raw.getFileId();
        this.local_overwrite = raw.getOverwrite();
        this.local_fileDescriptorBlob = raw.getFileDescriptorBlob();
        this.local_sessionId = raw.getSessionId();
        this.local_lockTimeoutMs = raw.getLockTimeoutMs();
        this.local_eCLRecordDefinition = raw.getECLRecordDefinition();
        this.local_recordCount = raw.getRecordCount();
        this.local_fileSize = raw.getFileSize();

    }

    @Override
    public String toString()
    {
        return "DFUFilePublishRequestWrapper [" + "fileId = " + local_fileId + ", " + "overwrite = " + local_overwrite + ", " + "fileDescriptorBlob = " + local_fileDescriptorBlob + ", " + "sessionId = " + local_sessionId + ", " + "lockTimeoutMs = " + local_lockTimeoutMs + ", " + "eCLRecordDefinition = " + local_eCLRecordDefinition + ", " + "recordCount = " + local_recordCount + ", " + "fileSize = " + local_fileSize + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePublishRequest();
        raw.setFileId( local_fileId);
        raw.setOverwrite( local_overwrite);
        raw.setFileDescriptorBlob( local_fileDescriptorBlob);
        raw.setSessionId( local_sessionId);
        raw.setLockTimeoutMs( local_lockTimeoutMs);
        raw.setECLRecordDefinition( local_eCLRecordDefinition);
        raw.setRecordCount( local_recordCount);
        raw.setFileSize( local_fileSize);
        return raw;
    }


    public void setFileId( String _fileId )
    {
        this.local_fileId = _fileId;
    }
    public String getFileId( )
    {
        return this.local_fileId;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
    }
    public void setFileDescriptorBlob( DataHandler _fileDescriptorBlob )
    {
        this.local_fileDescriptorBlob = _fileDescriptorBlob;
    }
    public DataHandler getFileDescriptorBlob( )
    {
        return this.local_fileDescriptorBlob;
    }
    public void setSessionId( long _sessionId )
    {
        this.local_sessionId = _sessionId;
    }
    public long getSessionId( )
    {
        return this.local_sessionId;
    }
    public void setLockTimeoutMs( int _lockTimeoutMs )
    {
        this.local_lockTimeoutMs = _lockTimeoutMs;
    }
    public int getLockTimeoutMs( )
    {
        return this.local_lockTimeoutMs;
    }
    public void setECLRecordDefinition( String _eCLRecordDefinition )
    {
        this.local_eCLRecordDefinition = _eCLRecordDefinition;
    }
    public String getECLRecordDefinition( )
    {
        return this.local_eCLRecordDefinition;
    }
    public void setRecordCount( long _recordCount )
    {
        this.local_recordCount = _recordCount;
    }
    public long getRecordCount( )
    {
        return this.local_recordCount;
    }
    public void setFileSize( long _fileSize )
    {
        this.local_fileSize = _fileSize;
    }
    public long getFileSize( )
    {
        return this.local_fileSize;
    }
}