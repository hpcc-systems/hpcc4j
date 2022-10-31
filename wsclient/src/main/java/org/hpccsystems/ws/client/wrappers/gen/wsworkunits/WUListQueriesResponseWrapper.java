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
 * Class name: WUListQueriesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.557Z
 */
public class WUListQueriesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_numberOfQueries;
    protected long local_cacheHint;
    protected ArrayOfQuerySetQueryWrapper local_querysetQueries;

    public WUListQueriesResponseWrapper() {}

    public WUListQueriesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse wulistqueriesresponse)
    {
        copy( wulistqueriesresponse );
    }
    public WUListQueriesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _numberOfQueries, long _cacheHint, ArrayOfQuerySetQueryWrapper _querysetQueries )
    {
        this.local_exceptions = _exceptions;
        this.local_numberOfQueries = _numberOfQueries;
        this.local_cacheHint = _cacheHint;
        this.local_querysetQueries = _querysetQueries;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_numberOfQueries = raw.getNumberOfQueries();
        this.local_cacheHint = raw.getCacheHint();
        if (raw.getQuerysetQueries() != null)
            this.local_querysetQueries = new ArrayOfQuerySetQueryWrapper( raw.getQuerysetQueries());

    }

    @Override
    public String toString()
    {
        return "WUListQueriesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "numberOfQueries = " + local_numberOfQueries + ", " + "cacheHint = " + local_cacheHint + ", " + "querysetQueries = " + local_querysetQueries + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setNumberOfQueries( local_numberOfQueries);
        raw.setCacheHint( local_cacheHint);
        if (local_querysetQueries != null)
            raw.setQuerysetQueries( local_querysetQueries.getRaw());
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
    public void setNumberOfQueries( int _numberOfQueries )
    {
        this.local_numberOfQueries = _numberOfQueries;
    }
    public int getNumberOfQueries( )
    {
        return this.local_numberOfQueries;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setQuerysetQueries( ArrayOfQuerySetQueryWrapper _querysetQueries )
    {
        this.local_querysetQueries = _querysetQueries;
    }
    public ArrayOfQuerySetQueryWrapper getQuerysetQueries( )
    {
        return this.local_querysetQueries;
    }
}