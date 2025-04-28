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
 * Class name: WULogFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WULogFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_querySet;
    protected String local_queryName;
    protected String local_queryId;
    protected String local_fileName;
    protected String local_daliServer;
    protected DataHandler local_thefile;

    public WULogFileResponseWrapper() {}

    public WULogFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse wulogfileresponse)
    {
        copy( wulogfileresponse );
    }
    public WULogFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _querySet, String _queryName, String _queryId, String _fileName, String _daliServer, DataHandler _thefile )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_querySet = _querySet;
        this.local_queryName = _queryName;
        this.local_queryId = _queryId;
        this.local_fileName = _fileName;
        this.local_daliServer = _daliServer;
        this.local_thefile = _thefile;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_querySet = raw.getQuerySet();
        this.local_queryName = raw.getQueryName();
        this.local_queryId = raw.getQueryId();
        this.local_fileName = raw.getFileName();
        this.local_daliServer = raw.getDaliServer();
        this.local_thefile = raw.getThefile();

    }

    @Override
    public String toString()
    {
        return "WULogFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "querySet = " + local_querySet + ", " + "queryName = " + local_queryName + ", " + "queryId = " + local_queryId + ", " + "fileName = " + local_fileName + ", " + "daliServer = " + local_daliServer + ", " + "thefile = " + local_thefile + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setWuid( local_wuid);
        raw.setQuerySet( local_querySet);
        raw.setQueryName( local_queryName);
        raw.setQueryId( local_queryId);
        raw.setFileName( local_fileName);
        raw.setDaliServer( local_daliServer);
        raw.setThefile( local_thefile);
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
    public void setQuerySet( String _querySet )
    {
        this.local_querySet = _querySet;
    }
    public String getQuerySet( )
    {
        return this.local_querySet;
    }
    public void setQueryName( String _queryName )
    {
        this.local_queryName = _queryName;
    }
    public String getQueryName( )
    {
        return this.local_queryName;
    }
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setDaliServer( String _daliServer )
    {
        this.local_daliServer = _daliServer;
    }
    public String getDaliServer( )
    {
        return this.local_daliServer;
    }
    public void setThefile( DataHandler _thefile )
    {
        this.local_thefile = _thefile;
    }
    public DataHandler getThefile( )
    {
        return this.local_thefile;
    }
}