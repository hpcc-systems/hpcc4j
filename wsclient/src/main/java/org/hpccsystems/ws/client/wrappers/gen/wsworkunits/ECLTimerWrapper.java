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
 * Class name: ECLTimerWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.810Z
 */
public class ECLTimerWrapper
{
    protected String local_name;
    protected String local_value;
    protected int local_count;
    protected String local_graphName;
    protected int local_subGraphId;
    protected long local_timestamp;
    protected String local_when;

    public ECLTimerWrapper() {}

    public ECLTimerWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer ecltimer)
    {
        copy( ecltimer );
    }
    public ECLTimerWrapper( String _name, String _value, int _count, String _graphName, int _subGraphId, long _timestamp, String _when )
    {
        this.local_name = _name;
        this.local_value = _value;
        this.local_count = _count;
        this.local_graphName = _graphName;
        this.local_subGraphId = _subGraphId;
        this.local_timestamp = _timestamp;
        this.local_when = _when;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_value = raw.getValue();
        this.local_count = raw.getCount();
        this.local_graphName = raw.getGraphName();
        this.local_subGraphId = raw.getSubGraphId();
        this.local_timestamp = raw.getTimestamp();
        this.local_when = raw.getWhen();

    }

    @Override
    public String toString()
    {
        return "ECLTimerWrapper [" + "name = " + local_name + ", " + "value = " + local_value + ", " + "count = " + local_count + ", " + "graphName = " + local_graphName + ", " + "subGraphId = " + local_subGraphId + ", " + "timestamp = " + local_timestamp + ", " + "when = " + local_when + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLTimer();
        raw.setName( local_name);
        raw.setValue( local_value);
        raw.setCount( local_count);
        raw.setGraphName( local_graphName);
        raw.setSubGraphId( local_subGraphId);
        raw.setTimestamp( local_timestamp);
        raw.setWhen( local_when);
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
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setGraphName( String _graphName )
    {
        this.local_graphName = _graphName;
    }
    public String getGraphName( )
    {
        return this.local_graphName;
    }
    public void setSubGraphId( int _subGraphId )
    {
        this.local_subGraphId = _subGraphId;
    }
    public int getSubGraphId( )
    {
        return this.local_subGraphId;
    }
    public void setTimestamp( long _timestamp )
    {
        this.local_timestamp = _timestamp;
    }
    public long getTimestamp( )
    {
        return this.local_timestamp;
    }
    public void setWhen( String _when )
    {
        this.local_when = _when;
    }
    public String getWhen( )
    {
        return this.local_when;
    }
}