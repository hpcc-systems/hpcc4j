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
 * Class name: ECLTimingDataWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.810Z
 */
public class ECLTimingDataWrapper
{
    protected String local_name;
    protected int local_graphNum;
    protected int local_subGraphNum;
    protected int local_gID;
    protected int local_min;
    protected int local_mS;

    public ECLTimingDataWrapper() {}

    public ECLTimingDataWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData ecltimingdata)
    {
        copy( ecltimingdata );
    }
    public ECLTimingDataWrapper( String _name, int _graphNum, int _subGraphNum, int _gID, int _min, int _mS )
    {
        this.local_name = _name;
        this.local_graphNum = _graphNum;
        this.local_subGraphNum = _subGraphNum;
        this.local_gID = _gID;
        this.local_min = _min;
        this.local_mS = _mS;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_graphNum = raw.getGraphNum();
        this.local_subGraphNum = raw.getSubGraphNum();
        this.local_gID = raw.getGID();
        this.local_min = raw.getMin();
        this.local_mS = raw.getMS();

    }

    @Override
    public String toString()
    {
        return "ECLTimingDataWrapper [" + "name = " + local_name + ", " + "graphNum = " + local_graphNum + ", " + "subGraphNum = " + local_subGraphNum + ", " + "gID = " + local_gID + ", " + "min = " + local_min + ", " + "mS = " + local_mS + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimingData();
        raw.setName( local_name);
        raw.setGraphNum( local_graphNum);
        raw.setSubGraphNum( local_subGraphNum);
        raw.setGID( local_gID);
        raw.setMin( local_min);
        raw.setMS( local_mS);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setGraphNum( int _graphNum )
    {
        this.local_graphNum = _graphNum;
    }
    public int getGraphNum( )
    {
        return this.local_graphNum;
    }
    public void setSubGraphNum( int _subGraphNum )
    {
        this.local_subGraphNum = _subGraphNum;
    }
    public int getSubGraphNum( )
    {
        return this.local_subGraphNum;
    }
    public void setGID( int _gID )
    {
        this.local_gID = _gID;
    }
    public int getGID( )
    {
        return this.local_gID;
    }
    public void setMin( int _min )
    {
        this.local_min = _min;
    }
    public int getMin( )
    {
        return this.local_min;
    }
    public void setMS( int _mS )
    {
        this.local_mS = _mS;
    }
    public int getMS( )
    {
        return this.local_mS;
    }
}