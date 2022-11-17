package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: ArrayOfPhysicalFileStructWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2021-10-27T18:52:06.412Z
 */
public class ArrayOfPhysicalFileStructWrapper
{
    protected List<PhysicalFileStructWrapper> local_physicalFileStruct = null;

    public ArrayOfPhysicalFileStructWrapper() {}

    public ArrayOfPhysicalFileStructWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct arrayofphysicalfilestruct)
    {
        copy( arrayofphysicalfilestruct );
    }
    public ArrayOfPhysicalFileStructWrapper( List<PhysicalFileStructWrapper> _physicalFileStruct )
    {
        this.local_physicalFileStruct = _physicalFileStruct;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct raw )
    {
        if (raw == null)
            return;

        if (raw.getPhysicalFileStruct() != null)
        {
            this.local_physicalFileStruct = new ArrayList<PhysicalFileStructWrapper>();
            for ( int i = 0; i < raw.getPhysicalFileStruct().length; i++)
            {
                this.local_physicalFileStruct.add(new PhysicalFileStructWrapper(raw.getPhysicalFileStruct()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfPhysicalFileStructWrapper [" + "physicalFileStruct = " + local_physicalFileStruct + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.ArrayOfPhysicalFileStruct();
        if (this.local_physicalFileStruct!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.filespray.latest.PhysicalFileStruct[] arr = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.PhysicalFileStruct[this.local_physicalFileStruct.size()];
            for ( int i = 0; i < this.local_physicalFileStruct.size(); i++)
            {
                arr[i] = this.local_physicalFileStruct.get(i) .getRaw();
            }
            raw.setPhysicalFileStruct(arr);
        }
        return raw;
    }


    public void setPhysicalFileStruct( List<PhysicalFileStructWrapper> _physicalFileStruct )
    {
        this.local_physicalFileStruct = _physicalFileStruct;
    }
    public List<PhysicalFileStructWrapper> getPhysicalFileStruct( )
    {
        return this.local_physicalFileStruct;
    }
}