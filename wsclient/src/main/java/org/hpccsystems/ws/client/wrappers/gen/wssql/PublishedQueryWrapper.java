package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
 * Class name: PublishedQueryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.403Z
 */
public class PublishedQueryWrapper
{
    protected String local_name;
    protected String local_id;
    protected String local_wuid;
    protected boolean local_suspended;
    protected QuerySignatureWrapper local_signature;

    public PublishedQueryWrapper() {}

    public PublishedQueryWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery publishedquery)
    {
        copy( publishedquery );
    }
    public PublishedQueryWrapper( String _name, String _id, String _wuid, boolean _suspended, QuerySignatureWrapper _signature )
    {
        this.local_name = _name;
        this.local_id = _id;
        this.local_wuid = _wuid;
        this.local_suspended = _suspended;
        this.local_signature = _signature;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_id = raw.getId();
        this.local_wuid = raw.getWuid();
        this.local_suspended = raw.getSuspended();
        if (raw.getSignature() != null)
            this.local_signature = new QuerySignatureWrapper( raw.getSignature());

    }

    @Override
    public String toString()
    {
        return "PublishedQueryWrapper [" + "name = " + local_name + ", " + "id = " + local_id + ", " + "wuid = " + local_wuid + ", " + "suspended = " + local_suspended + ", " + "signature = " + local_signature + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.PublishedQuery();
        raw.setName( local_name);
        raw.setId( local_id);
        raw.setWuid( local_wuid);
        raw.setSuspended( local_suspended);
        if (local_signature != null)
            raw.setSignature( local_signature.getRaw());
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
    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setSuspended( boolean _suspended )
    {
        this.local_suspended = _suspended;
    }
    public boolean getSuspended( )
    {
        return this.local_suspended;
    }
    public void setSignature( QuerySignatureWrapper _signature )
    {
        this.local_signature = _signature;
    }
    public QuerySignatureWrapper getSignature( )
    {
        return this.local_signature;
    }
}