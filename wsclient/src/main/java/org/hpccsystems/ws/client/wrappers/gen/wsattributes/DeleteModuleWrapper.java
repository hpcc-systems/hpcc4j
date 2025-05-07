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
 * Class name: DeleteModuleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class DeleteModuleWrapper
{
    protected String local_moduleName;

    public DeleteModuleWrapper() {}

    public DeleteModuleWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule deletemodule)
    {
        copy( deletemodule );
    }
    public DeleteModuleWrapper( String _moduleName )
    {
        this.local_moduleName = _moduleName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();

    }

    @Override
    public String toString()
    {
        return "DeleteModuleWrapper [" + "moduleName = " + local_moduleName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.DeleteModule();
        raw.setModuleName( local_moduleName);
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
}