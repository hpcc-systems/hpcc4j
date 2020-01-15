package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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

import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetAttributesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 * TimeStamp: 2019-09-06T14:44:27.941Z
 */
public class GetAttributesWrapper
{
    protected String       local_moduleName;
    protected List<String> local_typeList = new ArrayList<String>();
    protected String       local_label;

    /**
     * Instantiates a new gets the attributes wrapper.
     */
    public GetAttributesWrapper()
    {
    }

    /**
     * Instantiates a new gets the attributes wrapper.
     *
     * @param getattributes
     *            the getattributes
     */
    public GetAttributesWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes getattributes)
    {
        copy(getattributes);
    }

    /**
     * Instantiates a new gets the attributes wrapper.
     *
     * @param _moduleName
     *            the module name
     * @param _typeList
     *            the type list
     * @param _label
     *            the label
     */
    public GetAttributesWrapper(String _moduleName, List<String> _typeList, String _label)
    {
        this.local_moduleName = _moduleName;
        this.local_typeList = _typeList;
        this.local_label = _label;

    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes raw)
    {
        if (raw == null) return;

        this.local_moduleName = raw.getModuleName();
        if (raw.getTypeList() != null)
        {
            this.local_typeList = new ArrayList<String>();
            for (int i = 0; i < raw.getTypeList().getItem().length; i++)
            {
                this.local_typeList.add(new String(raw.getTypeList().getItem()[i]));
            }
        }
        this.local_label = raw.getLabel();

    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "GetAttributesWrapper [" + "moduleName = " + local_moduleName + ", " + "typeList = " + local_typeList + ", " + "label = " + local_label
                + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributes();
        raw.setModuleName(local_moduleName);
        if (this.local_typeList != null)
        {
            EspStringArray arr = new EspStringArray();
            for (int i = 0; i < this.local_typeList.size(); i++)
            {
                arr.addItem(this.local_typeList.get(i));
            }
            raw.setTypeList(arr);
        }
        raw.setLabel(local_label);
        return raw;
    }

    /**
     * Sets the module name.
     *
     * @param _moduleName
     *            the new module name
     */
    public void setModuleName(String _moduleName)
    {
        this.local_moduleName = _moduleName;
    }

    /**
     * Gets the module name.
     *
     * @return the module name
     */
    public String getModuleName()
    {
        return this.local_moduleName;
    }

    /**
     * Sets the type list.
     *
     * @param _typeList
     *            the new type list
     */
    public void setTypeList(List<String> _typeList)
    {
        this.local_typeList = _typeList;
    }

    /**
     * Gets the type list.
     *
     * @return the type list
     */
    public List<String> getTypeList()
    {
        return this.local_typeList;
    }

    /**
     * Sets the label.
     *
     * @param _label
     *            the new label
     */
    public void setLabel(String _label)
    {
        this.local_label = _label;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel()
    {
        return this.local_label;
    }
}
