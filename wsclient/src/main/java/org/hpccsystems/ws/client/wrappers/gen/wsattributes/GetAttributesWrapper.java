package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetAttributesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributesWrapper
{
    protected String local_moduleName;
    protected List<String> local_typeList = null;
    protected String local_label;

    public GetAttributesWrapper() {}

    public GetAttributesWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes getattributes)
    {
        copy( getattributes );
    }
    public GetAttributesWrapper( String _moduleName, List<String> _typeList, String _label )
    {
        this.local_moduleName = _moduleName;
        this.local_typeList = _typeList;
        this.local_label = _label;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        if (raw.getTypeList() != null && raw.getTypeList().getItem() != null)
        {
            this.local_typeList = new ArrayList<String>();
            for ( int i = 0; i < raw.getTypeList().getItem().length; i++)
            {
                this.local_typeList.add(new String(raw.getTypeList().getItem()[i]));
            }
        }        this.local_label = raw.getLabel();

    }

    @Override
    public String toString()
    {
        return "GetAttributesWrapper [" + "moduleName = " + local_moduleName + ", " + "typeList = " + local_typeList + ", " + "label = " + local_label + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributes();
        raw.setModuleName( local_moduleName);
        if (this.local_typeList!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_typeList.size(); i++)
            {
                arr.addItem(this.local_typeList.get(i));
            }
            raw.setTypeList(arr);
        }
        raw.setLabel( local_label);
        return raw;
    }


    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setTypeList( List<String> _typeList )
    {
        this.local_typeList = _typeList;
    }
    public List<String> getTypeList( )
    {
        return this.local_typeList;
    }
    public void setLabel( String _label )
    {
        this.local_label = _label;
    }
    public String getLabel( )
    {
        return this.local_label;
    }
}