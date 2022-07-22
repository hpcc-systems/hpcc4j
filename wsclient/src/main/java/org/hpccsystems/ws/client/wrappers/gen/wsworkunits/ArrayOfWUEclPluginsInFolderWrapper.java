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
 * Class name: ArrayOfWUEclPluginsInFolderWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.794Z
 */
public class ArrayOfWUEclPluginsInFolderWrapper
{
    protected List<WUEclPluginsInFolderWrapper> local_wUEclPluginsInFolder = null;

    public ArrayOfWUEclPluginsInFolderWrapper() {}

    public ArrayOfWUEclPluginsInFolderWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder arrayofwueclpluginsinfolder)
    {
        copy( arrayofwueclpluginsinfolder );
    }
    public ArrayOfWUEclPluginsInFolderWrapper( List<WUEclPluginsInFolderWrapper> _wUEclPluginsInFolder )
    {
        this.local_wUEclPluginsInFolder = _wUEclPluginsInFolder;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder raw )
    {
        if (raw == null)
            return;

        if (raw.getWUEclPluginsInFolder() != null)
        {
            this.local_wUEclPluginsInFolder = new ArrayList<WUEclPluginsInFolderWrapper>();
            for ( int i = 0; i < raw.getWUEclPluginsInFolder().length; i++)
            {
                this.local_wUEclPluginsInFolder.add(new WUEclPluginsInFolderWrapper(raw.getWUEclPluginsInFolder()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWUEclPluginsInFolderWrapper [" + "wUEclPluginsInFolder = " + local_wUEclPluginsInFolder + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUEclPluginsInFolder();
        if (this.local_wUEclPluginsInFolder!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclPluginsInFolder[this.local_wUEclPluginsInFolder.size()];
            for ( int i = 0; i < this.local_wUEclPluginsInFolder.size(); i++)
            {
                arr[i] = this.local_wUEclPluginsInFolder.get(i) .getRaw();
            }
            raw.setWUEclPluginsInFolder(arr);
        }
        return raw;
    }


    public void setWUEclPluginsInFolder( List<WUEclPluginsInFolderWrapper> _wUEclPluginsInFolder )
    {
        this.local_wUEclPluginsInFolder = _wUEclPluginsInFolder;
    }
    public List<WUEclPluginsInFolderWrapper> getWUEclPluginsInFolder( )
    {
        return this.local_wUEclPluginsInFolder;
    }
}