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
 * Class name: ListStoresResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class ListStoresResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Stores_type0Wrapper local_stores;

    public ListStoresResponseWrapper() {}

    public ListStoresResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse liststoresresponse)
    {
        copy( liststoresresponse );
    }
    public ListStoresResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Stores_type0Wrapper _stores )
    {
        this.local_exceptions = _exceptions;
        this.local_stores = _stores;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStores() != null)
            this.local_stores = new Stores_type0Wrapper( raw.getStores());

    }

    @Override
    public String toString()
    {
        return "ListStoresResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "stores = " + local_stores + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_stores != null)
            raw.setStores( local_stores.getRaw());
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
    public void setStores( Stores_type0Wrapper _stores )
    {
        this.local_stores = _stores;
    }
    public Stores_type0Wrapper getStores( )
    {
        return this.local_stores;
    }
}