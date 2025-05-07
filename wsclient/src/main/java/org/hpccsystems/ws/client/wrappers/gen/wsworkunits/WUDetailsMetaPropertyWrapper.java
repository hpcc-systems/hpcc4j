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
 * Class name: WUDetailsMetaPropertyWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUDetailsMetaPropertyWrapper
{
    protected String local_name;
    protected WUDetailsAttrValueTypeWrapper local_valueType;
    protected String local_description;

    public WUDetailsMetaPropertyWrapper() {}

    public WUDetailsMetaPropertyWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty wudetailsmetaproperty)
    {
        copy( wudetailsmetaproperty );
    }
    public WUDetailsMetaPropertyWrapper( String _name, WUDetailsAttrValueTypeWrapper _valueType, String _description )
    {
        this.local_name = _name;
        this.local_valueType = _valueType;
        this.local_description = _description;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getValueType() != null)
            this.local_valueType = new WUDetailsAttrValueTypeWrapper( raw.getValueType());
        this.local_description = raw.getDescription();

    }

    @Override
    public String toString()
    {
        return "WUDetailsMetaPropertyWrapper [" + "name = " + local_name + ", " + "valueType = " + local_valueType + ", " + "description = " + local_description + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsMetaProperty();
        raw.setName( local_name);
        if (local_valueType != null)
            raw.setValueType( local_valueType.getRaw());
        raw.setDescription( local_description);
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
    public void setValueType( WUDetailsAttrValueTypeWrapper _valueType )
    {
        this.local_valueType = _valueType;
    }
    public WUDetailsAttrValueTypeWrapper getValueType( )
    {
        return this.local_valueType;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
}