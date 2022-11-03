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
 * WrapperMaker version: 1.8
 * Class name: WUAbortWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * Service version: 1.92
 */
public class WUAbortWrapper
{
    protected List<String> local_wuids = null;
    protected int local_blockTillFinishTimer;

    public WUAbortWrapper() {}

    public WUAbortWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort wuabort)
    {
        copy( wuabort );
    }
    public WUAbortWrapper( List<String> _wuids, int _blockTillFinishTimer )
    {
        this.local_wuids = _wuids;
        this.local_blockTillFinishTimer = _blockTillFinishTimer;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort raw )
    {
        if (raw == null)
            return;

        if (raw.getWuids() != null && raw.getWuids().getItem() != null)
        {
            this.local_wuids = new ArrayList<String>();
            for ( int i = 0; i < raw.getWuids().getItem().length; i++)
            {
                this.local_wuids.add(new String(raw.getWuids().getItem()[i]));
            }
        }        this.local_blockTillFinishTimer = raw.getBlockTillFinishTimer();

    }

    @Override
    public String toString()
    {
        return "WUAbortWrapper [" + "wuids = " + local_wuids + ", " + "blockTillFinishTimer = " + local_blockTillFinishTimer + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbort();
        if (this.local_wuids!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_wuids.size(); i++)
            {
                arr.addItem(this.local_wuids.get(i));
            }
            raw.setWuids(arr);
        }
        raw.setBlockTillFinishTimer( local_blockTillFinishTimer);
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
    public void setBlockTillFinishTimer( int _blockTillFinishTimer )
    {
        this.local_blockTillFinishTimer = _blockTillFinishTimer;
    }
    public int getBlockTillFinishTimer( )
    {
        return this.local_blockTillFinishTimer;
    }
}