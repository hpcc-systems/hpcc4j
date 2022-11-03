package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
import org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.8
 * Class name: RoxieXrefCmdWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * Service version: 1.26
 */
public class RoxieXrefCmdWrapper
{
    protected String local_roxieCluster;
    protected List<String> local_queryIds = null;
    protected boolean local_checkAllNodes;
    protected int local_wait;

    public RoxieXrefCmdWrapper() {}

    public RoxieXrefCmdWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd roxiexrefcmd)
    {
        copy( roxiexrefcmd );
    }
    public RoxieXrefCmdWrapper( String _roxieCluster, List<String> _queryIds, boolean _checkAllNodes, int _wait )
    {
        this.local_roxieCluster = _roxieCluster;
        this.local_queryIds = _queryIds;
        this.local_checkAllNodes = _checkAllNodes;
        this.local_wait = _wait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd raw )
    {
        if (raw == null)
            return;

        this.local_roxieCluster = raw.getRoxieCluster();
        if (raw.getQueryIds() != null && raw.getQueryIds().getItem() != null)
        {
            this.local_queryIds = new ArrayList<String>();
            for ( int i = 0; i < raw.getQueryIds().getItem().length; i++)
            {
                this.local_queryIds.add(new String(raw.getQueryIds().getItem()[i]));
            }
        }        this.local_checkAllNodes = raw.getCheckAllNodes();
        this.local_wait = raw.getWait();

    }

    @Override
    public String toString()
    {
        return "RoxieXrefCmdWrapper [" + "roxieCluster = " + local_roxieCluster + ", " + "queryIds = " + local_queryIds + ", " + "checkAllNodes = " + local_checkAllNodes + ", " + "wait = " + local_wait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.RoxieXrefCmd();
        raw.setRoxieCluster( local_roxieCluster);
        if (this.local_queryIds!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_queryIds.size(); i++)
            {
                arr.addItem(this.local_queryIds.get(i));
            }
            raw.setQueryIds(arr);
        }
        raw.setCheckAllNodes( local_checkAllNodes);
        raw.setWait( local_wait);
        return raw;
    }


    public void setRoxieCluster( String _roxieCluster )
    {
        this.local_roxieCluster = _roxieCluster;
    }
    public String getRoxieCluster( )
    {
        return this.local_roxieCluster;
    }
    public void setQueryIds( List<String> _queryIds )
    {
        this.local_queryIds = _queryIds;
    }
    public List<String> getQueryIds( )
    {
        return this.local_queryIds;
    }
    public void setCheckAllNodes( boolean _checkAllNodes )
    {
        this.local_checkAllNodes = _checkAllNodes;
    }
    public boolean getCheckAllNodes( )
    {
        return this.local_checkAllNodes;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
}