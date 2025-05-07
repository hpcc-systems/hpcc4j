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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfECLModuleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ArrayOfECLModuleWrapper
{
    protected List<ECLModuleWrapper> local_eCLModule = null;

    public ArrayOfECLModuleWrapper() {}

    public ArrayOfECLModuleWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule arrayofeclmodule)
    {
        copy( arrayofeclmodule );
    }
    public ArrayOfECLModuleWrapper( List<ECLModuleWrapper> _eCLModule )
    {
        this.local_eCLModule = _eCLModule;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule raw )
    {
        if (raw == null)
            return;

        if (raw.getECLModule() != null)
        {
            this.local_eCLModule = new ArrayList<ECLModuleWrapper>();
            for ( int i = 0; i < raw.getECLModule().length; i++)
            {
                this.local_eCLModule.add(new ECLModuleWrapper(raw.getECLModule()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfECLModuleWrapper [" + "eCLModule = " + local_eCLModule + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ArrayOfECLModule();
        if (this.local_eCLModule!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule[this.local_eCLModule.size()];
            for ( int i = 0; i < this.local_eCLModule.size(); i++)
            {
                arr[i] = this.local_eCLModule.get(i) .getRaw();
            }
            raw.setECLModule(arr);
        }
        return raw;
    }


    public void setECLModule( List<ECLModuleWrapper> _eCLModule )
    {
        this.local_eCLModule = _eCLModule;
    }
    public List<ECLModuleWrapper> getECLModule( )
    {
        return this.local_eCLModule;
    }
}