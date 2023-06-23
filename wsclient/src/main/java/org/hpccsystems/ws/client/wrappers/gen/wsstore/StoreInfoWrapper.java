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
 * Class name: StoreInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsstore
 */
public class StoreInfoWrapper
{
    protected String local_name;
    protected String local_type;
    protected String local_description;
    protected String local_owner;
    protected String local_createTime;
    protected String local_maxValSize;
    protected boolean local_isDefault;

    public StoreInfoWrapper() {}

    public StoreInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo storeinfo)
    {
        copy( storeinfo );
    }
    public StoreInfoWrapper( String _name, String _type, String _description, String _owner, String _createTime, String _maxValSize, boolean _isDefault )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_description = _description;
        this.local_owner = _owner;
        this.local_createTime = _createTime;
        this.local_maxValSize = _maxValSize;
        this.local_isDefault = _isDefault;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_description = raw.getDescription();
        this.local_owner = raw.getOwner();
        this.local_createTime = raw.getCreateTime();
        this.local_maxValSize = raw.getMaxValSize();
        this.local_isDefault = raw.getIsDefault();

    }

    @Override
    public String toString()
    {
        return "StoreInfoWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "description = " + local_description + ", " + "owner = " + local_owner + ", " + "createTime = " + local_createTime + ", " + "maxValSize = " + local_maxValSize + ", " + "isDefault = " + local_isDefault + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsstore.latest.StoreInfo();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setDescription( local_description);
        raw.setOwner( local_owner);
        raw.setCreateTime( local_createTime);
        raw.setMaxValSize( local_maxValSize);
        raw.setIsDefault( local_isDefault);
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setCreateTime( String _createTime )
    {
        this.local_createTime = _createTime;
    }
    public String getCreateTime( )
    {
        return this.local_createTime;
    }
    public void setMaxValSize( String _maxValSize )
    {
        this.local_maxValSize = _maxValSize;
    }
    public String getMaxValSize( )
    {
        return this.local_maxValSize;
    }
    public void setIsDefault( boolean _isDefault )
    {
        this.local_isDefault = _isDefault;
    }
    public boolean getIsDefault( )
    {
        return this.local_isDefault;
    }
}