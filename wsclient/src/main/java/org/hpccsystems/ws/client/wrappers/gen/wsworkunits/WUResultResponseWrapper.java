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
 * Class name: WUResultResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.602Z
 */
public class WUResultResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected int local_sequence;
    protected String local_logicalName;
    protected String local_cluster;
    protected String local_name;
    protected long local_start;
    protected int local_requested;
    protected int local_count;
    protected long local_total;
    protected String local_result;

    public WUResultResponseWrapper() {}

    public WUResultResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse wuresultresponse)
    {
        copy( wuresultresponse );
    }
    public WUResultResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, int _sequence, String _logicalName, String _cluster, String _name, long _start, int _requested, int _count, long _total, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_sequence = _sequence;
        this.local_logicalName = _logicalName;
        this.local_cluster = _cluster;
        this.local_name = _name;
        this.local_start = _start;
        this.local_requested = _requested;
        this.local_count = _count;
        this.local_total = _total;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_sequence = raw.getSequence();
        this.local_logicalName = raw.getLogicalName();
        this.local_cluster = raw.getCluster();
        this.local_name = raw.getName();
        this.local_start = raw.getStart();
        this.local_requested = raw.getRequested();
        this.local_count = raw.getCount();
        this.local_total = raw.getTotal();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUResultResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "sequence = " + local_sequence + ", " + "logicalName = " + local_logicalName + ", " + "cluster = " + local_cluster + ", " + "name = " + local_name + ", " + "start = " + local_start + ", " + "requested = " + local_requested + ", " + "count = " + local_count + ", " + "total = " + local_total + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setSequence( local_sequence);
        raw.setLogicalName( local_logicalName);
        raw.setCluster( local_cluster);
        raw.setName( local_name);
        raw.setStart( local_start);
        raw.setRequested( local_requested);
        raw.setCount( local_count);
        raw.setTotal( local_total);
        raw.setResult( local_result);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setStart( long _start )
    {
        this.local_start = _start;
    }
    public long getStart( )
    {
        return this.local_start;
    }
    public void setRequested( int _requested )
    {
        this.local_requested = _requested;
    }
    public int getRequested( )
    {
        return this.local_requested;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
}