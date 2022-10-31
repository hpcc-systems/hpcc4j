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
 * Class name: WURunResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.605Z
 */
public class WURunResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_state;
    protected String local_results;

    public WURunResponseWrapper() {}

    public WURunResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse wurunresponse)
    {
        copy( wurunresponse );
    }
    public WURunResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _state, String _results )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_state = _state;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_state = raw.getState();
        this.local_results = raw.getResults();

    }

    @Override
    public String toString()
    {
        return "WURunResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "state = " + local_state + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WURunResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setState( local_state);
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
    public void setState( String _state )
    {
        this.local_state = _state;
    }
    public String getState( )
    {
        return this.local_state;
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