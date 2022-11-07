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
 * Class name: WUResultSummaryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.988Z
 */
public class WUResultSummaryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected int local_sequence;
    protected int local_format;
    protected ECLResultWrapper local_result;

    public WUResultSummaryResponseWrapper() {}

    public WUResultSummaryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse wuresultsummaryresponse)
    {
        copy( wuresultsummaryresponse );
    }
    public WUResultSummaryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, int _sequence, int _format, ECLResultWrapper _result )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_sequence = _sequence;
        this.local_format = _format;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_sequence = raw.getSequence();
        this.local_format = raw.getFormat();
        if (raw.getResult() != null)
            this.local_result = new ECLResultWrapper( raw.getResult());

    }

    @Override
    public String toString()
    {
        return "WUResultSummaryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "sequence = " + local_sequence + ", " + "format = " + local_format + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResultSummaryResponse();
        raw.setWuid( local_wuid);
        raw.setSequence( local_sequence);
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
    public void setFormat( int _format )
    {
        this.local_format = _format;
    }
    public int getFormat( )
    {
        return this.local_format;
    }
    public void setResult( ECLResultWrapper _result )
    {
        this.local_result = _result;
    }
    public ECLResultWrapper getResult( )
    {
        return this.local_result;
    }
}