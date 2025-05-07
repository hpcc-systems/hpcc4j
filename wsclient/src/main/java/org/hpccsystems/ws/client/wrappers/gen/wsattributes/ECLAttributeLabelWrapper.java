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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ECLAttributeLabelWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ECLAttributeLabelWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected int local_attributeVersion;
    protected String local_labelName;
    protected String local_modifiedDate;

    public ECLAttributeLabelWrapper() {}

    public ECLAttributeLabelWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel eclattributelabel)
    {
        copy( eclattributelabel );
    }
    public ECLAttributeLabelWrapper( String _moduleName, String _attributeName, int _attributeVersion, String _labelName, String _modifiedDate )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_attributeVersion = _attributeVersion;
        this.local_labelName = _labelName;
        this.local_modifiedDate = _modifiedDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_attributeVersion = raw.getAttributeVersion();
        this.local_labelName = raw.getLabelName();
        this.local_modifiedDate = raw.getModifiedDate();

    }

    @Override
    public String toString()
    {
        return "ECLAttributeLabelWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "attributeVersion = " + local_attributeVersion + ", " + "labelName = " + local_labelName + ", " + "modifiedDate = " + local_modifiedDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLAttributeLabel();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setAttributeVersion( local_attributeVersion);
        raw.setLabelName( local_labelName);
        raw.setModifiedDate( local_modifiedDate);
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
    public void setAttributeName( String _attributeName )
    {
        this.local_attributeName = _attributeName;
    }
    public String getAttributeName( )
    {
        return this.local_attributeName;
    }
    public void setAttributeVersion( int _attributeVersion )
    {
        this.local_attributeVersion = _attributeVersion;
    }
    public int getAttributeVersion( )
    {
        return this.local_attributeVersion;
    }
    public void setLabelName( String _labelName )
    {
        this.local_labelName = _labelName;
    }
    public String getLabelName( )
    {
        return this.local_labelName;
    }
    public void setModifiedDate( String _modifiedDate )
    {
        this.local_modifiedDate = _modifiedDate;
    }
    public String getModifiedDate( )
    {
        return this.local_modifiedDate;
    }
}