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
 * Class name: RenameModuleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class RenameModuleWrapper
{
    protected String local_moduleName;
    protected String local_newModuleName;

    public RenameModuleWrapper() {}

    public RenameModuleWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule renamemodule)
    {
        copy( renamemodule );
    }
    public RenameModuleWrapper( String _moduleName, String _newModuleName )
    {
        this.local_moduleName = _moduleName;
        this.local_newModuleName = _newModuleName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_newModuleName = raw.getNewModuleName();

    }

    @Override
    public String toString()
    {
        return "RenameModuleWrapper [" + "moduleName = " + local_moduleName + ", " + "newModuleName = " + local_newModuleName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.RenameModule();
        raw.setModuleName( local_moduleName);
        raw.setNewModuleName( local_newModuleName);
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
    public void setNewModuleName( String _newModuleName )
    {
        this.local_newModuleName = _newModuleName;
    }
    public String getNewModuleName( )
    {
        return this.local_newModuleName;
    }
}