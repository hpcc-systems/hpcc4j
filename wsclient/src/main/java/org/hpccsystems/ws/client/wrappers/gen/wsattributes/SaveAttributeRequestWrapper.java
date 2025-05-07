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
 * Class name: SaveAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class SaveAttributeRequestWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected int local_flags;
    protected int local_resultType;
    protected String local_description;
    protected String local_text;

    public SaveAttributeRequestWrapper() {}

    public SaveAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest saveattributerequest)
    {
        copy( saveattributerequest );
    }
    public SaveAttributeRequestWrapper( String _moduleName, String _attributeName, int _flags, int _resultType, String _description, String _text )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_flags = _flags;
        this.local_resultType = _resultType;
        this.local_description = _description;
        this.local_text = _text;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_flags = raw.getFlags();
        this.local_resultType = raw.getResultType();
        this.local_description = raw.getDescription();
        this.local_text = raw.getText();

    }

    @Override
    public String toString()
    {
        return "SaveAttributeRequestWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "flags = " + local_flags + ", " + "resultType = " + local_resultType + ", " + "description = " + local_description + ", " + "text = " + local_text + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SaveAttributeRequest();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setFlags( local_flags);
        raw.setResultType( local_resultType);
        raw.setDescription( local_description);
        raw.setText( local_text);
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
    public void setFlags( int _flags )
    {
        this.local_flags = _flags;
    }
    public int getFlags( )
    {
        return this.local_flags;
    }
    public void setResultType( int _resultType )
    {
        this.local_resultType = _resultType;
    }
    public int getResultType( )
    {
        return this.local_resultType;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setText( String _text )
    {
        this.local_text = _text;
    }
    public String getText( )
    {
        return this.local_text;
    }
}