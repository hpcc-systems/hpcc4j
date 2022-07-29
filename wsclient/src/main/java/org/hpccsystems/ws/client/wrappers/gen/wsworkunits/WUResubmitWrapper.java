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
 * Class name: WUResubmitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.984Z
 */
public class WUResubmitWrapper
{
    protected List<String> local_wuids = null;
    protected int local_blockTillFinishTimer;
    protected boolean local_resetWorkflow;
    protected boolean local_cloneWorkunit;

    public WUResubmitWrapper() {}

    public WUResubmitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit wuresubmit)
    {
        copy( wuresubmit );
    }
    public WUResubmitWrapper( List<String> _wuids, int _blockTillFinishTimer, boolean _resetWorkflow, boolean _cloneWorkunit )
    {
        this.local_wuids = _wuids;
        this.local_blockTillFinishTimer = _blockTillFinishTimer;
        this.local_resetWorkflow = _resetWorkflow;
        this.local_cloneWorkunit = _cloneWorkunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit raw )
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
        }        this.local_blockTillFinishTimer = raw.getBlockTillFinishTimer();
        this.local_resetWorkflow = raw.getResetWorkflow();
        this.local_cloneWorkunit = raw.getCloneWorkunit();

    }

    @Override
    public String toString()
    {
        return "WUResubmitWrapper [" + "wuids = " + local_wuids + ", " + "blockTillFinishTimer = " + local_blockTillFinishTimer + ", " + "resetWorkflow = " + local_resetWorkflow + ", " + "cloneWorkunit = " + local_cloneWorkunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmit();
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
        raw.setResetWorkflow( local_resetWorkflow);
        raw.setCloneWorkunit( local_cloneWorkunit);
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
    public void setResetWorkflow( boolean _resetWorkflow )
    {
        this.local_resetWorkflow = _resetWorkflow;
    }
    public boolean getResetWorkflow( )
    {
        return this.local_resetWorkflow;
    }
    public void setCloneWorkunit( boolean _cloneWorkunit )
    {
        this.local_cloneWorkunit = _cloneWorkunit;
    }
    public boolean getCloneWorkunit( )
    {
        return this.local_cloneWorkunit;
    }
}