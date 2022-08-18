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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUGVCGraphInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.928Z
 */
public class WUGVCGraphInfoWrapper
{
    protected String local_wuid;
    protected String local_name;
    protected String local_gID;
    protected int local_batchWU;
    protected int local_subgraphId;

    public WUGVCGraphInfoWrapper() {}

    public WUGVCGraphInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo wugvcgraphinfo)
    {
        copy( wugvcgraphinfo );
    }
    public WUGVCGraphInfoWrapper( String _wuid, String _name, String _gID, int _batchWU, int _subgraphId )
    {
        this.local_wuid = _wuid;
        this.local_name = _name;
        this.local_gID = _gID;
        this.local_batchWU = _batchWU;
        this.local_subgraphId = _subgraphId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_name = raw.getName();
        this.local_gID = raw.getGID();
        this.local_batchWU = raw.getBatchWU();
        this.local_subgraphId = raw.getSubgraphId();

    }

    @Override
    public String toString()
    {
        return "WUGVCGraphInfoWrapper [" + "wuid = " + local_wuid + ", " + "name = " + local_name + ", " + "gID = " + local_gID + ", " + "batchWU = " + local_batchWU + ", " + "subgraphId = " + local_subgraphId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfo();
        raw.setWuid( local_wuid);
        raw.setName( local_name);
        raw.setGID( local_gID);
        raw.setBatchWU( local_batchWU);
        raw.setSubgraphId( local_subgraphId);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setGID( String _gID )
    {
        this.local_gID = _gID;
    }
    public String getGID( )
    {
        return this.local_gID;
    }
    public void setBatchWU( int _batchWU )
    {
        this.local_batchWU = _batchWU;
    }
    public int getBatchWU( )
    {
        return this.local_batchWU;
    }
    public void setSubgraphId( int _subgraphId )
    {
        this.local_subgraphId = _subgraphId;
    }
    public int getSubgraphId( )
    {
        return this.local_subgraphId;
    }
}