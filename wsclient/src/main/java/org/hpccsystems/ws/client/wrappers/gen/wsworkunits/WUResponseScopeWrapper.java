package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: WUResponseScopeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.984Z
 */
public class WUResponseScopeWrapper
{
    protected String local_scopeName;
    protected String local_id;
    protected String local_scopeType;
    protected Properties_type3Wrapper local_properties;
    protected Notes_type0Wrapper local_notes;

    public WUResponseScopeWrapper() {}

    public WUResponseScopeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope wuresponsescope)
    {
        copy( wuresponsescope );
    }
    public WUResponseScopeWrapper( String _scopeName, String _id, String _scopeType, Properties_type3Wrapper _properties, Notes_type0Wrapper _notes )
    {
        this.local_scopeName = _scopeName;
        this.local_id = _id;
        this.local_scopeType = _scopeType;
        this.local_properties = _properties;
        this.local_notes = _notes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope raw )
    {
        if (raw == null)
            return;

        this.local_scopeName = raw.getScopeName();
        this.local_id = raw.getId();
        this.local_scopeType = raw.getScopeType();
        if (raw.getProperties() != null)
            this.local_properties = new Properties_type3Wrapper( raw.getProperties());
        if (raw.getNotes() != null)
            this.local_notes = new Notes_type0Wrapper( raw.getNotes());

    }

    @Override
    public String toString()
    {
        return "WUResponseScopeWrapper [" + "scopeName = " + local_scopeName + ", " + "id = " + local_id + ", " + "scopeType = " + local_scopeType + ", " + "properties = " + local_properties + ", " + "notes = " + local_notes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResponseScope();
        raw.setScopeName( local_scopeName);
        raw.setId( local_id);
        raw.setScopeType( local_scopeType);
        return raw;
    }


    public void setScopeName( String _scopeName )
    {
        this.local_scopeName = _scopeName;
    }
    public String getScopeName( )
    {
        return this.local_scopeName;
    }
    public void setId( String _id )
    {
        this.local_id = _id;
    }
    public String getId( )
    {
        return this.local_id;
    }
    public void setScopeType( String _scopeType )
    {
        this.local_scopeType = _scopeType;
    }
    public String getScopeType( )
    {
        return this.local_scopeType;
    }
    public void setProperties( Properties_type3Wrapper _properties )
    {
        this.local_properties = _properties;
    }
    public Properties_type3Wrapper getProperties( )
    {
        return this.local_properties;
    }
    public void setNotes( Notes_type0Wrapper _notes )
    {
        this.local_notes = _notes;
    }
    public Notes_type0Wrapper getNotes( )
    {
        return this.local_notes;
    }
}