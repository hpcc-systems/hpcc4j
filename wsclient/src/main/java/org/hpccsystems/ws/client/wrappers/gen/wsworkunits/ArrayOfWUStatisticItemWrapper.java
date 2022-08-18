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
 * Class name: ArrayOfWUStatisticItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.796Z
 */
public class ArrayOfWUStatisticItemWrapper
{
    protected List<WUStatisticItemWrapper> local_wUStatisticItem = null;

    public ArrayOfWUStatisticItemWrapper() {}

    public ArrayOfWUStatisticItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem arrayofwustatisticitem)
    {
        copy( arrayofwustatisticitem );
    }
    public ArrayOfWUStatisticItemWrapper( List<WUStatisticItemWrapper> _wUStatisticItem )
    {
        this.local_wUStatisticItem = _wUStatisticItem;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem raw )
    {
        if (raw == null)
            return;

        if (raw.getWUStatisticItem() != null)
        {
            this.local_wUStatisticItem = new ArrayList<WUStatisticItemWrapper>();
            for ( int i = 0; i < raw.getWUStatisticItem().length; i++)
            {
                this.local_wUStatisticItem.add(new WUStatisticItemWrapper(raw.getWUStatisticItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfWUStatisticItemWrapper [" + "wUStatisticItem = " + local_wUStatisticItem + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfWUStatisticItem();
        if (this.local_wUStatisticItem!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUStatisticItem[this.local_wUStatisticItem.size()];
            for ( int i = 0; i < this.local_wUStatisticItem.size(); i++)
            {
                arr[i] = this.local_wUStatisticItem.get(i) .getRaw();
            }
            raw.setWUStatisticItem(arr);
        }
        return raw;
    }


    public void setWUStatisticItem( List<WUStatisticItemWrapper> _wUStatisticItem )
    {
        this.local_wUStatisticItem = _wUStatisticItem;
    }
    public List<WUStatisticItemWrapper> getWUStatisticItem( )
    {
        return this.local_wUStatisticItem;
    }
}