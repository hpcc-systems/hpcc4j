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
 * Class name: ListKeysResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class ListKeysResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_storeName;
    protected String local_namespace;
    protected KeySet_type0Wrapper local_keySet;

    public ListKeysResponseWrapper() {}

    public ListKeysResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse listkeysresponse)
    {
        copy( listkeysresponse );
    }
    public ListKeysResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _storeName, String _namespace, KeySet_type0Wrapper _keySet )
    {
        this.local_exceptions = _exceptions;
        this.local_storeName = _storeName;
        this.local_namespace = _namespace;
        this.local_keySet = _keySet;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_storeName = raw.getStoreName();
        this.local_namespace = raw.getNamespace();
        if (raw.getKeySet() != null)
            this.local_keySet = new KeySet_type0Wrapper( raw.getKeySet());

    }

    @Override
    public String toString()
    {
        return "ListKeysResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "storeName = " + local_storeName + ", " + "namespace = " + local_namespace + ", " + "keySet = " + local_keySet + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListKeysResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setStoreName( local_storeName);
        raw.setNamespace( local_namespace);
        if (local_keySet != null)
            raw.setKeySet( local_keySet.getRaw());
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
    public void setNamespace( String _namespace )
    {
        this.local_namespace = _namespace;
    }
    public String getNamespace( )
    {
        return this.local_namespace;
    }
    public void setKeySet( KeySet_type0Wrapper _keySet )
    {
        this.local_keySet = _keySet;
    }
    public KeySet_type0Wrapper getKeySet( )
    {
        return this.local_keySet;
    }
}