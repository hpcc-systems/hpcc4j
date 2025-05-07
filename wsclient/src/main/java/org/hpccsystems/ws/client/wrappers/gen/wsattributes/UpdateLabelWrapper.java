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
 * Class name: UpdateLabelWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class UpdateLabelWrapper
{
    protected String local_name;
    protected String local_moduleName;
    protected String local_atributeName;
    protected int local_attrbuteVersion;

    public UpdateLabelWrapper() {}

    public UpdateLabelWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel updatelabel)
    {
        copy( updatelabel );
    }
    public UpdateLabelWrapper( String _name, String _moduleName, String _atributeName, int _attrbuteVersion )
    {
        this.local_name = _name;
        this.local_moduleName = _moduleName;
        this.local_atributeName = _atributeName;
        this.local_attrbuteVersion = _attrbuteVersion;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_moduleName = raw.getModuleName();
        this.local_atributeName = raw.getAtributeName();
        this.local_attrbuteVersion = raw.getAttrbuteVersion();

    }

    @Override
    public String toString()
    {
        return "UpdateLabelWrapper [" + "name = " + local_name + ", " + "moduleName = " + local_moduleName + ", " + "atributeName = " + local_atributeName + ", " + "attrbuteVersion = " + local_attrbuteVersion + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.UpdateLabel();
        raw.setName( local_name);
        raw.setModuleName( local_moduleName);
        raw.setAtributeName( local_atributeName);
        raw.setAttrbuteVersion( local_attrbuteVersion);
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
    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setAtributeName( String _atributeName )
    {
        this.local_atributeName = _atributeName;
    }
    public String getAtributeName( )
    {
        return this.local_atributeName;
    }
    public void setAttrbuteVersion( int _attrbuteVersion )
    {
        this.local_attrbuteVersion = _attrbuteVersion;
    }
    public int getAttrbuteVersion( )
    {
        return this.local_attrbuteVersion;
    }
}