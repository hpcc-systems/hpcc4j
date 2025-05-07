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
 * Class name: GetAttributeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributeWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_type;
    protected int local_version;
    protected boolean local_getSandbox;
    protected boolean local_getText;
    protected String local_label;
    protected boolean local_sandboxForLabel;

    public GetAttributeWrapper() {}

    public GetAttributeWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute getattribute)
    {
        copy( getattribute );
    }
    public GetAttributeWrapper( String _moduleName, String _attributeName, String _type, int _version, boolean _getSandbox, boolean _getText, String _label, boolean _sandboxForLabel )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_type = _type;
        this.local_version = _version;
        this.local_getSandbox = _getSandbox;
        this.local_getText = _getText;
        this.local_label = _label;
        this.local_sandboxForLabel = _sandboxForLabel;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_type = raw.getType();
        this.local_version = raw.getVersion();
        this.local_getSandbox = raw.getGetSandbox();
        this.local_getText = raw.getGetText();
        this.local_label = raw.getLabel();
        this.local_sandboxForLabel = raw.getSandboxForLabel();

    }

    @Override
    public String toString()
    {
        return "GetAttributeWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "type = " + local_type + ", " + "version = " + local_version + ", " + "getSandbox = " + local_getSandbox + ", " + "getText = " + local_getText + ", " + "label = " + local_label + ", " + "sandboxForLabel = " + local_sandboxForLabel + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttribute();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setType( local_type);
        raw.setVersion( local_version);
        raw.setGetSandbox( local_getSandbox);
        raw.setGetText( local_getText);
        raw.setLabel( local_label);
        raw.setSandboxForLabel( local_sandboxForLabel);
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setVersion( int _version )
    {
        this.local_version = _version;
    }
    public int getVersion( )
    {
        return this.local_version;
    }
    public void setGetSandbox( boolean _getSandbox )
    {
        this.local_getSandbox = _getSandbox;
    }
    public boolean getGetSandbox( )
    {
        return this.local_getSandbox;
    }
    public void setGetText( boolean _getText )
    {
        this.local_getText = _getText;
    }
    public boolean getGetText( )
    {
        return this.local_getText;
    }
    public void setLabel( String _label )
    {
        this.local_label = _label;
    }
    public String getLabel( )
    {
        return this.local_label;
    }
    public void setSandboxForLabel( boolean _sandboxForLabel )
    {
        this.local_sandboxForLabel = _sandboxForLabel;
    }
    public boolean getSandboxForLabel( )
    {
        return this.local_sandboxForLabel;
    }
}