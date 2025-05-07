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
 * Class name: RenameAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class RenameAttributeRequestWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_newModuleName;
    protected String local_newAttributeName;

    public RenameAttributeRequestWrapper() {}

    public RenameAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest renameattributerequest)
    {
        copy( renameattributerequest );
    }
    public RenameAttributeRequestWrapper( String _moduleName, String _attributeName, String _newModuleName, String _newAttributeName )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_newModuleName = _newModuleName;
        this.local_newAttributeName = _newAttributeName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_newModuleName = raw.getNewModuleName();
        this.local_newAttributeName = raw.getNewAttributeName();

    }

    @Override
    public String toString()
    {
        return "RenameAttributeRequestWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "newModuleName = " + local_newModuleName + ", " + "newAttributeName = " + local_newAttributeName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameAttributeRequest();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setNewModuleName( local_newModuleName);
        raw.setNewAttributeName( local_newAttributeName);
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
    public void setNewModuleName( String _newModuleName )
    {
        this.local_newModuleName = _newModuleName;
    }
    public String getNewModuleName( )
    {
        return this.local_newModuleName;
    }
    public void setNewAttributeName( String _newAttributeName )
    {
        this.local_newAttributeName = _newAttributeName;
    }
    public String getNewAttributeName( )
    {
        return this.local_newAttributeName;
    }
}