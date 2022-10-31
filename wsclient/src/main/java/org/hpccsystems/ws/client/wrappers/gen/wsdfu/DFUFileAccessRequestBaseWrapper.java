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
 * Class name: DFUFileAccessRequestBaseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.868Z
 */
public class DFUFileAccessRequestBaseWrapper
{
    protected String local_name;
    protected String local_cluster;
    protected String local_jobId;
    protected int local_expirySeconds;
    protected FileAccessRoleWrapper local_accessRole;
    protected SecAccessTypeWrapper local_accessType;
    protected boolean local_returnJsonTypeInfo;
    protected boolean local_returnBinTypeInfo;

    public DFUFileAccessRequestBaseWrapper() {}

    public DFUFileAccessRequestBaseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase dfufileaccessrequestbase)
    {
        copy( dfufileaccessrequestbase );
    }
    public DFUFileAccessRequestBaseWrapper( String _name, String _cluster, String _jobId, int _expirySeconds, FileAccessRoleWrapper _accessRole, SecAccessTypeWrapper _accessType, boolean _returnJsonTypeInfo, boolean _returnBinTypeInfo )
    {
        this.local_name = _name;
        this.local_cluster = _cluster;
        this.local_jobId = _jobId;
        this.local_expirySeconds = _expirySeconds;
        this.local_accessRole = _accessRole;
        this.local_accessType = _accessType;
        this.local_returnJsonTypeInfo = _returnJsonTypeInfo;
        this.local_returnBinTypeInfo = _returnBinTypeInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_cluster = raw.getCluster();
        this.local_jobId = raw.getJobId();
        this.local_expirySeconds = raw.getExpirySeconds();
        if (raw.getAccessRole() != null)
            this.local_accessRole = new FileAccessRoleWrapper( raw.getAccessRole());
        if (raw.getAccessType() != null)
            this.local_accessType = new SecAccessTypeWrapper( raw.getAccessType());
        this.local_returnJsonTypeInfo = raw.getReturnJsonTypeInfo();
        this.local_returnBinTypeInfo = raw.getReturnBinTypeInfo();

    }

    @Override
    public String toString()
    {
        return "DFUFileAccessRequestBaseWrapper [" + "name = " + local_name + ", " + "cluster = " + local_cluster + ", " + "jobId = " + local_jobId + ", " + "expirySeconds = " + local_expirySeconds + ", " + "accessRole = " + local_accessRole + ", " + "accessType = " + local_accessType + ", " + "returnJsonTypeInfo = " + local_returnJsonTypeInfo + ", " + "returnBinTypeInfo = " + local_returnBinTypeInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileAccessRequestBase();
        raw.setName( local_name);
        raw.setCluster( local_cluster);
        raw.setJobId( local_jobId);
        raw.setExpirySeconds( local_expirySeconds);
        raw.setAccessRole( local_accessRole.getRaw());
        raw.setAccessType( local_accessType.getRaw());
        raw.setReturnJsonTypeInfo( local_returnJsonTypeInfo);
        raw.setReturnBinTypeInfo( local_returnBinTypeInfo);
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
    public void setJobId( String _jobId )
    {
        this.local_jobId = _jobId;
    }
    public String getJobId( )
    {
        return this.local_jobId;
    }
    public void setExpirySeconds( int _expirySeconds )
    {
        this.local_expirySeconds = _expirySeconds;
    }
    public int getExpirySeconds( )
    {
        return this.local_expirySeconds;
    }
    public void setAccessRole( FileAccessRoleWrapper _accessRole )
    {
        this.local_accessRole = _accessRole;
    }
    public FileAccessRoleWrapper getAccessRole( )
    {
        return this.local_accessRole;
    }
    public void setAccessType( SecAccessTypeWrapper _accessType )
    {
        this.local_accessType = _accessType;
    }
    public SecAccessTypeWrapper getAccessType( )
    {
        return this.local_accessType;
    }
    public void setReturnJsonTypeInfo( boolean _returnJsonTypeInfo )
    {
        this.local_returnJsonTypeInfo = _returnJsonTypeInfo;
    }
    public boolean getReturnJsonTypeInfo( )
    {
        return this.local_returnJsonTypeInfo;
    }
    public void setReturnBinTypeInfo( boolean _returnBinTypeInfo )
    {
        this.local_returnBinTypeInfo = _returnBinTypeInfo;
    }
    public boolean getReturnBinTypeInfo( )
    {
        return this.local_returnBinTypeInfo;
    }
}