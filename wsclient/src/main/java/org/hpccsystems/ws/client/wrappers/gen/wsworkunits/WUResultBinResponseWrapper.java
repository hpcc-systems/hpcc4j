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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUResultBinResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUResultBinResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected int local_sequence;
    protected String local_name;
    protected long local_start;
    protected int local_count;
    protected int local_requested;
    protected long local_total;
    protected DataHandler local_result;
    protected String local_format;

    public WUResultBinResponseWrapper() {}

    public WUResultBinResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse wuresultbinresponse)
    {
        copy( wuresultbinresponse );
    }
    public WUResultBinResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, int _sequence, String _name, long _start, int _count, int _requested, long _total, DataHandler _result, String _format )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_sequence = _sequence;
        this.local_name = _name;
        this.local_start = _start;
        this.local_count = _count;
        this.local_requested = _requested;
        this.local_total = _total;
        this.local_result = _result;
        this.local_format = _format;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_sequence = raw.getSequence();
        this.local_name = raw.getName();
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();
        this.local_requested = raw.getRequested();
        this.local_total = raw.getTotal();
        this.local_result = raw.getResult();
        this.local_format = raw.getFormat();

    }

    @Override
    public String toString()
    {
        return "WUResultBinResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "sequence = " + local_sequence + ", " + "name = " + local_name + ", " + "start = " + local_start + ", " + "count = " + local_count + ", " + "requested = " + local_requested + ", " + "total = " + local_total + ", " + "result = " + local_result + ", " + "format = " + local_format + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultBinResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setSequence( local_sequence);
        raw.setName( local_name);
        raw.setStart( local_start);
        raw.setCount( local_count);
        raw.setRequested( local_requested);
        raw.setTotal( local_total);
        raw.setResult( local_result);
        raw.setFormat( local_format);
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
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setRequested( int _requested )
    {
        this.local_requested = _requested;
    }
    public int getRequested( )
    {
        return this.local_requested;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
    public void setResult( DataHandler _result )
    {
        this.local_result = _result;
    }
    public DataHandler getResult( )
    {
        return this.local_result;
    }
    public void setFormat( String _format )
    {
        this.local_format = _format;
    }
    public String getFormat( )
    {
        return this.local_format;
    }
}