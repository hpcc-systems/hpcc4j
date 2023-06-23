package org.hpccsystems.ws.client.wrappers.gen.wsstore;

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
 * Class name: DeleteNamespaceRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class DeleteNamespaceRequestWrapper
{
    protected String local_storeName;
    protected String local_namespace;
    protected boolean local_userSpecific;
    protected String local_targetUser;

    public DeleteNamespaceRequestWrapper() {}

    public DeleteNamespaceRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest deletenamespacerequest)
    {
        copy( deletenamespacerequest );
    }
    public DeleteNamespaceRequestWrapper( String _storeName, String _namespace, boolean _userSpecific, String _targetUser )
    {
        this.local_storeName = _storeName;
        this.local_namespace = _namespace;
        this.local_userSpecific = _userSpecific;
        this.local_targetUser = _targetUser;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest raw )
    {
        if (raw == null)
            return;

        this.local_storeName = raw.getStoreName();
        this.local_namespace = raw.getNamespace();
        this.local_userSpecific = raw.getUserSpecific();
        this.local_targetUser = raw.getTargetUser();

    }

    @Override
    public String toString()
    {
        return "DeleteNamespaceRequestWrapper [" + "storeName = " + local_storeName + ", " + "namespace = " + local_namespace + ", " + "userSpecific = " + local_userSpecific + ", " + "targetUser = " + local_targetUser + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.DeleteNamespaceRequest();
        raw.setStoreName( local_storeName);
        raw.setNamespace( local_namespace);
        raw.setUserSpecific( local_userSpecific);
        raw.setTargetUser( local_targetUser);
        return raw;
    }


    public void setStoreName( String _storeName )
    {
        this.local_storeName = _storeName;
    }
    public String getStoreName( )
    {
        return this.local_storeName;
    }
    public void setNamespace( String _namespace )
    {
        this.local_namespace = _namespace;
    }
    public String getNamespace( )
    {
        return this.local_namespace;
    }
    public void setUserSpecific( boolean _userSpecific )
    {
        this.local_userSpecific = _userSpecific;
    }
    public boolean getUserSpecific( )
    {
        return this.local_userSpecific;
    }
    public void setTargetUser( String _targetUser )
    {
        this.local_targetUser = _targetUser;
    }
    public String getTargetUser( )
    {
        return this.local_targetUser;
    }
}