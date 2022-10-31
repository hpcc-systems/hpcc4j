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
 * Class name: WUQueryConfigResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.577Z
 */
public class WUQueryConfigResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected boolean local_reloadFailed;
    protected Results_type2Wrapper local_results;

    public WUQueryConfigResponseWrapper() {}

    public WUQueryConfigResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse wuqueryconfigresponse)
    {
        copy( wuqueryconfigresponse );
    }
    public WUQueryConfigResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _reloadFailed, Results_type2Wrapper _results )
    {
        this.local_exceptions = _exceptions;
        this.local_reloadFailed = _reloadFailed;
        this.local_results = _results;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_reloadFailed = raw.getReloadFailed();
        if (raw.getResults() != null)
            this.local_results = new Results_type2Wrapper( raw.getResults());

    }

    @Override
    public String toString()
    {
        return "WUQueryConfigResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "reloadFailed = " + local_reloadFailed + ", " + "results = " + local_results + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryConfigResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setReloadFailed( local_reloadFailed);
        if (local_results != null)
            raw.setResults( local_results.getRaw());
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
    public void setReloadFailed( boolean _reloadFailed )
    {
        this.local_reloadFailed = _reloadFailed;
    }
    public boolean getReloadFailed( )
    {
        return this.local_reloadFailed;
    }
    public void setResults( Results_type2Wrapper _results )
    {
        this.local_results = _results;
    }
    public Results_type2Wrapper getResults( )
    {
        return this.local_results;
    }
}