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
 * Class name: ArrayOfWULogicalFileCopyInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.795Z
 */
public class ArrayOfWULogicalFileCopyInfoWrapper
{
    protected List<WULogicalFileCopyInfoWrapper> local_wULogicalFileCopyInfo = null;

    public ArrayOfWULogicalFileCopyInfoWrapper() {}

    public ArrayOfWULogicalFileCopyInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo arrayofwulogicalfilecopyinfo)
    {
        copy( arrayofwulogicalfilecopyinfo );
    }
    public ArrayOfWULogicalFileCopyInfoWrapper( List<WULogicalFileCopyInfoWrapper> _wULogicalFileCopyInfo )
    {
        this.local_wULogicalFileCopyInfo = _wULogicalFileCopyInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo raw )
    {
        if (raw == null)
            return;

        if (raw.getWULogicalFileCopyInfo() != null)
        {
            this.local_wULogicalFileCopyInfo = new ArrayList<WULogicalFileCopyInfoWrapper>();
            for ( int i = 0; i < raw.getWULogicalFileCopyInfo().length; i++)
            {
                this.local_wULogicalFileCopyInfo.add(new WULogicalFileCopyInfoWrapper(raw.getWULogicalFileCopyInfo()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWULogicalFileCopyInfoWrapper [" + "wULogicalFileCopyInfo = " + local_wULogicalFileCopyInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWULogicalFileCopyInfo();
        if (this.local_wULogicalFileCopyInfo!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo[this.local_wULogicalFileCopyInfo.size()];
            for ( int i = 0; i < this.local_wULogicalFileCopyInfo.size(); i++)
            {
                arr[i] = this.local_wULogicalFileCopyInfo.get(i) .getRaw();
            }
            raw.setWULogicalFileCopyInfo(arr);
        }
        return raw;
    }


    public void setWULogicalFileCopyInfo( List<WULogicalFileCopyInfoWrapper> _wULogicalFileCopyInfo )
    {
        this.local_wULogicalFileCopyInfo = _wULogicalFileCopyInfo;
    }
    public List<WULogicalFileCopyInfoWrapper> getWULogicalFileCopyInfo( )
    {
        return this.local_wULogicalFileCopyInfo;
    }
}