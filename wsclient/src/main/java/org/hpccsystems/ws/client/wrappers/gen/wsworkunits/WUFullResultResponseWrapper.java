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
 * Class name: WUFullResultResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.913Z
 */
public class WUFullResultResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_results;

    public WUFullResultResponseWrapper() {}

    public WUFullResultResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse wufullresultresponse)
    {
        copy( wufullresultresponse );
    }
    public WUFullResultResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _results )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_results = raw.getResults();

    }

    @Override
    public String toString()
    {
        return "WUFullResultResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUFullResultResponse();
        raw.setWuid( local_wuid);
        raw.setResults( local_results);
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
    public void setResults( String _results )
    {
        this.local_results = _results;
    }
    public String getResults( )
    {
        return this.local_results;
    }
}