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
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUProtectWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.950Z
 */
public class WUProtectWrapper
{
    protected List<String> local_wuids = null;
    protected boolean local_protect;

    public WUProtectWrapper() {}

    public WUProtectWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect wuprotect)
    {
        copy( wuprotect );
    }
    public WUProtectWrapper( List<String> _wuids, boolean _protect )
    {
        this.local_wuids = _wuids;
        this.local_protect = _protect;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect raw )
    {
        if (raw == null)
            return;

        if (raw.getWuids() != null)
        {
            this.local_wuids = new ArrayList<String>();
            for ( int i = 0; i < raw.getWuids().getItem().length; i++)
            {
                this.local_wuids.add(new String(raw.getWuids().getItem()[i]));
            }
        }        this.local_protect = raw.getProtect();

    }

    @Override
    public String toString()
    {
        return "WUProtectWrapper [" + "wuids = " + local_wuids + ", " + "protect = " + local_protect + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtect();
        if (this.local_wuids!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_wuids.size(); i++)
            {
                arr.addItem(this.local_wuids.get(i));
            }
            raw.setWuids(arr);
        }
        raw.setProtect( local_protect);
        return raw;
    }


    public void setWuids( List<String> _wuids )
    {
        this.local_wuids = _wuids;
    }
    public List<String> getWuids( )
    {
        return this.local_wuids;
    }
    public void setProtect( boolean _protect )
    {
        this.local_protect = _protect;
    }
    public boolean getProtect( )
    {
        return this.local_protect;
    }
}