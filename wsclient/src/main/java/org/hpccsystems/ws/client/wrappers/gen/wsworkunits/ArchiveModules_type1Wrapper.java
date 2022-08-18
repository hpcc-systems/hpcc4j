package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * Class name: ArchiveModules_type1Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.772Z
 */
public class ArchiveModules_type1Wrapper
{
    protected List<WUArchiveModuleWrapper> local_archiveModule = null;

    public ArchiveModules_type1Wrapper() {}

    public ArchiveModules_type1Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1 archivemodules_type1)
    {
        copy( archivemodules_type1 );
    }
    public ArchiveModules_type1Wrapper( List<WUArchiveModuleWrapper> _archiveModule )
    {
        this.local_archiveModule = _archiveModule;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1 raw )
    {
        if (raw == null)
            return;

        if (raw.getArchiveModule() != null)
        {
            this.local_archiveModule = new ArrayList<WUArchiveModuleWrapper>();
            for ( int i = 0; i < raw.getArchiveModule().length; i++)
            {
                this.local_archiveModule.add(new WUArchiveModuleWrapper(raw.getArchiveModule()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArchiveModules_type1Wrapper [" + "archiveModule = " + local_archiveModule + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArchiveModules_type1();
        if (this.local_archiveModule!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule[this.local_archiveModule.size()];
            for ( int i = 0; i < this.local_archiveModule.size(); i++)
            {
                arr[i] = this.local_archiveModule.get(i) .getRaw();
            }
            raw.setArchiveModule(arr);
        }
        return raw;
    }


    public void setArchiveModule( List<WUArchiveModuleWrapper> _archiveModule )
    {
        this.local_archiveModule = _archiveModule;
    }
    public List<WUArchiveModuleWrapper> getArchiveModule( )
    {
        return this.local_archiveModule;
    }
}