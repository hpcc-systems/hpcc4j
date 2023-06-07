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
 * Class name: ListNamespacesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class ListNamespacesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_storeName;
    protected Namespaces_type0Wrapper local_namespaces;

    public ListNamespacesResponseWrapper() {}

    public ListNamespacesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse listnamespacesresponse)
    {
        copy( listnamespacesresponse );
    }
    public ListNamespacesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _storeName, Namespaces_type0Wrapper _namespaces )
    {
        this.local_exceptions = _exceptions;
        this.local_storeName = _storeName;
        this.local_namespaces = _namespaces;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_storeName = raw.getStoreName();
        if (raw.getNamespaces() != null)
            this.local_namespaces = new Namespaces_type0Wrapper( raw.getNamespaces());

    }

    @Override
    public String toString()
    {
        return "ListNamespacesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "storeName = " + local_storeName + ", " + "namespaces = " + local_namespaces + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListNamespacesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setStoreName( local_storeName);
        if (local_namespaces != null)
            raw.setNamespaces( local_namespaces.getRaw());
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
    public void setStoreName( String _storeName )
    {
        this.local_storeName = _storeName;
    }
    public String getStoreName( )
    {
        return this.local_storeName;
    }
    public void setNamespaces( Namespaces_type0Wrapper _namespaces )
    {
        this.local_namespaces = _namespaces;
    }
    public Namespaces_type0Wrapper getNamespaces( )
    {
        return this.local_namespaces;
    }
}