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
 * Class name: WUGetNumFileToCopyResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.919Z
 */
public class WUGetNumFileToCopyResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Endpoints_type0Wrapper local_endpoints;
    protected long local_cacheHint;
    protected long local_total;

    public WUGetNumFileToCopyResponseWrapper() {}

    public WUGetNumFileToCopyResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse wugetnumfiletocopyresponse)
    {
        copy( wugetnumfiletocopyresponse );
    }
    public WUGetNumFileToCopyResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Endpoints_type0Wrapper _endpoints, long _cacheHint, long _total )
    {
        this.local_exceptions = _exceptions;
        this.local_endpoints = _endpoints;
        this.local_cacheHint = _cacheHint;
        this.local_total = _total;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getEndpoints() != null)
            this.local_endpoints = new Endpoints_type0Wrapper( raw.getEndpoints());
        this.local_cacheHint = raw.getCacheHint();
        this.local_total = raw.getTotal();

    }

    @Override
    public String toString()
    {
        return "WUGetNumFileToCopyResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "endpoints = " + local_endpoints + ", " + "cacheHint = " + local_cacheHint + ", " + "total = " + local_total + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetNumFileToCopyResponse();
        raw.setCacheHint( local_cacheHint);
        raw.setTotal( local_total);
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
    public void setEndpoints( Endpoints_type0Wrapper _endpoints )
    {
        this.local_endpoints = _endpoints;
    }
    public Endpoints_type0Wrapper getEndpoints( )
    {
        return this.local_endpoints;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
}