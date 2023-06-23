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
 * Class name: ListStoresRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class ListStoresRequestWrapper
{
    protected String local_nameFilter;
    protected String local_typeFilter;
    protected String local_ownerFilter;

    public ListStoresRequestWrapper() {}

    public ListStoresRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest liststoresrequest)
    {
        copy( liststoresrequest );
    }
    public ListStoresRequestWrapper( String _nameFilter, String _typeFilter, String _ownerFilter )
    {
        this.local_nameFilter = _nameFilter;
        this.local_typeFilter = _typeFilter;
        this.local_ownerFilter = _ownerFilter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest raw )
    {
        if (raw == null)
            return;

        this.local_nameFilter = raw.getNameFilter();
        this.local_typeFilter = raw.getTypeFilter();
        this.local_ownerFilter = raw.getOwnerFilter();

    }

    @Override
    public String toString()
    {
        return "ListStoresRequestWrapper [" + "nameFilter = " + local_nameFilter + ", " + "typeFilter = " + local_typeFilter + ", " + "ownerFilter = " + local_ownerFilter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.ListStoresRequest();
        raw.setNameFilter( local_nameFilter);
        raw.setTypeFilter( local_typeFilter);
        raw.setOwnerFilter( local_ownerFilter);
        return raw;
    }


    public void setNameFilter( String _nameFilter )
    {
        this.local_nameFilter = _nameFilter;
    }
    public String getNameFilter( )
    {
        return this.local_nameFilter;
    }
    public void setTypeFilter( String _typeFilter )
    {
        this.local_typeFilter = _typeFilter;
    }
    public String getTypeFilter( )
    {
        return this.local_typeFilter;
    }
    public void setOwnerFilter( String _ownerFilter )
    {
        this.local_ownerFilter = _ownerFilter;
    }
    public String getOwnerFilter( )
    {
        return this.local_ownerFilter;
    }
}