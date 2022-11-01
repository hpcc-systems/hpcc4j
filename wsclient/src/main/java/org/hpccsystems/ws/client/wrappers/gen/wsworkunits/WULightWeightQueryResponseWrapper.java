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
 * Class name: WULightWeightQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.553Z
 */
public class WULightWeightQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_numWUs;
    protected long local_cacheHint;
    protected ArrayOfECLWorkunitLWWrapper local_workunits;

    public WULightWeightQueryResponseWrapper() {}

    public WULightWeightQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse wulightweightqueryresponse)
    {
        copy( wulightweightqueryresponse );
    }
    public WULightWeightQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _numWUs, long _cacheHint, ArrayOfECLWorkunitLWWrapper _workunits )
    {
        this.local_exceptions = _exceptions;
        this.local_numWUs = _numWUs;
        this.local_cacheHint = _cacheHint;
        this.local_workunits = _workunits;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_numWUs = raw.getNumWUs();
        this.local_cacheHint = raw.getCacheHint();
        if (raw.getWorkunits() != null)
            this.local_workunits = new ArrayOfECLWorkunitLWWrapper( raw.getWorkunits());

    }

    @Override
    public String toString()
    {
        return "WULightWeightQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "numWUs = " + local_numWUs + ", " + "cacheHint = " + local_cacheHint + ", " + "workunits = " + local_workunits + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULightWeightQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setNumWUs( local_numWUs);
        raw.setCacheHint( local_cacheHint);
        if (local_workunits != null)
            raw.setWorkunits( local_workunits.getRaw());
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
    public void setNumWUs( int _numWUs )
    {
        this.local_numWUs = _numWUs;
    }
    public int getNumWUs( )
    {
        return this.local_numWUs;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setWorkunits( ArrayOfECLWorkunitLWWrapper _workunits )
    {
        this.local_workunits = _workunits;
    }
    public ArrayOfECLWorkunitLWWrapper getWorkunits( )
    {
        return this.local_workunits;
    }
}