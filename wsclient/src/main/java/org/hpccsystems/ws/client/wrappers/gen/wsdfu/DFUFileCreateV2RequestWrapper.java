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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUFileCreateV2RequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.875Z
 */
public class DFUFileCreateV2RequestWrapper
{
    protected String local_name;
    protected String local_cluster;
    protected DFUFileTypeWrapper local_type;
    protected String local_eCLRecordDefinition;
    protected String local_requestId;
    protected int local_expirySeconds;
    protected boolean local_returnTextResponse;
    protected boolean local_compressed;
    protected long local_sessionId;
    protected int local_lockTimeoutMs;

    public DFUFileCreateV2RequestWrapper() {}

    public DFUFileCreateV2RequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request dfufilecreatev2request)
    {
        copy( dfufilecreatev2request );
    }
    public DFUFileCreateV2RequestWrapper( String _name, String _cluster, DFUFileTypeWrapper _type, String _eCLRecordDefinition, String _requestId, int _expirySeconds, boolean _returnTextResponse, boolean _compressed, long _sessionId, int _lockTimeoutMs )
    {
        this.local_name = _name;
        this.local_cluster = _cluster;
        this.local_type = _type;
        this.local_eCLRecordDefinition = _eCLRecordDefinition;
        this.local_requestId = _requestId;
        this.local_expirySeconds = _expirySeconds;
        this.local_returnTextResponse = _returnTextResponse;
        this.local_compressed = _compressed;
        this.local_sessionId = _sessionId;
        this.local_lockTimeoutMs = _lockTimeoutMs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_cluster = raw.getCluster();
        if (raw.getType() != null)
            this.local_type = new DFUFileTypeWrapper( raw.getType());
        this.local_eCLRecordDefinition = raw.getECLRecordDefinition();
        this.local_requestId = raw.getRequestId();
        this.local_expirySeconds = raw.getExpirySeconds();
        this.local_returnTextResponse = raw.getReturnTextResponse();
        this.local_compressed = raw.getCompressed();
        this.local_sessionId = raw.getSessionId();
        this.local_lockTimeoutMs = raw.getLockTimeoutMs();

    }

    @Override
    public String toString()
    {
        return "DFUFileCreateV2RequestWrapper [" + "name = " + local_name + ", " + "cluster = " + local_cluster + ", " + "type = " + local_type + ", " + "eCLRecordDefinition = " + local_eCLRecordDefinition + ", " + "requestId = " + local_requestId + ", " + "expirySeconds = " + local_expirySeconds + ", " + "returnTextResponse = " + local_returnTextResponse + ", " + "compressed = " + local_compressed + ", " + "sessionId = " + local_sessionId + ", " + "lockTimeoutMs = " + local_lockTimeoutMs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileCreateV2Request();
        raw.setName( local_name);
        raw.setCluster( local_cluster);
        raw.setType( local_type.getRaw());
        raw.setECLRecordDefinition( local_eCLRecordDefinition);
        raw.setRequestId( local_requestId);
        raw.setExpirySeconds( local_expirySeconds);
        raw.setReturnTextResponse( local_returnTextResponse);
        raw.setCompressed( local_compressed);
        raw.setSessionId( local_sessionId);
        raw.setLockTimeoutMs( local_lockTimeoutMs);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setType( DFUFileTypeWrapper _type )
    {
        this.local_type = _type;
    }
    public DFUFileTypeWrapper getType( )
    {
        return this.local_type;
    }
    public void setECLRecordDefinition( String _eCLRecordDefinition )
    {
        this.local_eCLRecordDefinition = _eCLRecordDefinition;
    }
    public String getECLRecordDefinition( )
    {
        return this.local_eCLRecordDefinition;
    }
    public void setRequestId( String _requestId )
    {
        this.local_requestId = _requestId;
    }
    public String getRequestId( )
    {
        return this.local_requestId;
    }
    public void setExpirySeconds( int _expirySeconds )
    {
        this.local_expirySeconds = _expirySeconds;
    }
    public int getExpirySeconds( )
    {
        return this.local_expirySeconds;
    }
    public void setReturnTextResponse( boolean _returnTextResponse )
    {
        this.local_returnTextResponse = _returnTextResponse;
    }
    public boolean getReturnTextResponse( )
    {
        return this.local_returnTextResponse;
    }
    public void setCompressed( boolean _compressed )
    {
        this.local_compressed = _compressed;
    }
    public boolean getCompressed( )
    {
        return this.local_compressed;
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
}