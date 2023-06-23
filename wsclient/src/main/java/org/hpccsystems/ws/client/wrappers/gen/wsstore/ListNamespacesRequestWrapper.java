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
 * Class name: ListNamespacesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class ListNamespacesRequestWrapper
{
    protected String local_storeName;
    protected boolean local_userSpecific;

    public ListNamespacesRequestWrapper() {}

    public ListNamespacesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest listnamespacesrequest)
    {
        copy( listnamespacesrequest );
    }
    public ListNamespacesRequestWrapper( String _storeName, boolean _userSpecific )
    {
        this.local_storeName = _storeName;
        this.local_userSpecific = _userSpecific;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest raw )
    {
        if (raw == null)
            return;

        this.local_storeName = raw.getStoreName();
        this.local_userSpecific = raw.getUserSpecific();

    }

    @Override
    public String toString()
    {
        return "ListNamespacesRequestWrapper [" + "storeName = " + local_storeName + ", " + "userSpecific = " + local_userSpecific + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesRequest();
        raw.setStoreName( local_storeName);
        raw.setUserSpecific( local_userSpecific);
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
    public void setUserSpecific( boolean _userSpecific )
    {
        this.local_userSpecific = _userSpecific;
    }
    public boolean getUserSpecific( )
    {
        return this.local_userSpecific;
    }
}