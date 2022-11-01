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
 * Class name: WUInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.550Z
 */
public class WUInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLWorkunitWrapper local_workunit;
    protected int local_autoRefresh;
    protected boolean local_canCompile;
    protected String local_thorSlaveIP;
    protected ResultViews_type0Wrapper local_resultViews;
    protected String local_secMethod;

    public WUInfoResponseWrapper() {}

    public WUInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse wuinforesponse)
    {
        copy( wuinforesponse );
    }
    public WUInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLWorkunitWrapper _workunit, int _autoRefresh, boolean _canCompile, String _thorSlaveIP, ResultViews_type0Wrapper _resultViews, String _secMethod )
    {
        this.local_exceptions = _exceptions;
        this.local_workunit = _workunit;
        this.local_autoRefresh = _autoRefresh;
        this.local_canCompile = _canCompile;
        this.local_thorSlaveIP = _thorSlaveIP;
        this.local_resultViews = _resultViews;
        this.local_secMethod = _secMethod;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getWorkunit() != null)
            this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());
        this.local_autoRefresh = raw.getAutoRefresh();
        this.local_canCompile = raw.getCanCompile();
        this.local_thorSlaveIP = raw.getThorSlaveIP();
        if (raw.getResultViews() != null)
            this.local_resultViews = new ResultViews_type0Wrapper( raw.getResultViews());
        this.local_secMethod = raw.getSecMethod();

    }

    @Override
    public String toString()
    {
        return "WUInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "workunit = " + local_workunit + ", " + "autoRefresh = " + local_autoRefresh + ", " + "canCompile = " + local_canCompile + ", " + "thorSlaveIP = " + local_thorSlaveIP + ", " + "resultViews = " + local_resultViews + ", " + "secMethod = " + local_secMethod + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_workunit != null)
            raw.setWorkunit( local_workunit.getRaw());
        raw.setAutoRefresh( local_autoRefresh);
        raw.setCanCompile( local_canCompile);
        raw.setThorSlaveIP( local_thorSlaveIP);
        if (local_resultViews != null)
            raw.setResultViews( local_resultViews.getRaw());
        raw.setSecMethod( local_secMethod);
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
    public void setWorkunit( ECLWorkunitWrapper _workunit )
    {
        this.local_workunit = _workunit;
    }
    public ECLWorkunitWrapper getWorkunit( )
    {
        return this.local_workunit;
    }
    public void setAutoRefresh( int _autoRefresh )
    {
        this.local_autoRefresh = _autoRefresh;
    }
    public int getAutoRefresh( )
    {
        return this.local_autoRefresh;
    }
    public void setCanCompile( boolean _canCompile )
    {
        this.local_canCompile = _canCompile;
    }
    public boolean getCanCompile( )
    {
        return this.local_canCompile;
    }
    public void setThorSlaveIP( String _thorSlaveIP )
    {
        this.local_thorSlaveIP = _thorSlaveIP;
    }
    public String getThorSlaveIP( )
    {
        return this.local_thorSlaveIP;
    }
    public void setResultViews( ResultViews_type0Wrapper _resultViews )
    {
        this.local_resultViews = _resultViews;
    }
    public ResultViews_type0Wrapper getResultViews( )
    {
        return this.local_resultViews;
    }
    public void setSecMethod( String _secMethod )
    {
        this.local_secMethod = _secMethod;
    }
    public String getSecMethod( )
    {
        return this.local_secMethod;
    }
}