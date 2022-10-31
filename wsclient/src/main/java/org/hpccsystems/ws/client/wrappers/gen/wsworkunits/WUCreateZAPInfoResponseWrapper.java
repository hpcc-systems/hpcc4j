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
import javax.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUCreateZAPInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.520Z
 */
public class WUCreateZAPInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DataHandler local_thefile;
    protected String local_zAPFileName;

    public WUCreateZAPInfoResponseWrapper() {}

    public WUCreateZAPInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse wucreatezapinforesponse)
    {
        copy( wucreatezapinforesponse );
    }
    public WUCreateZAPInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _thefile, String _zAPFileName )
    {
        this.local_exceptions = _exceptions;
        this.local_thefile = _thefile;
        this.local_zAPFileName = _zAPFileName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_thefile = raw.getThefile();
        this.local_zAPFileName = raw.getZAPFileName();

    }

    @Override
    public String toString()
    {
        return "WUCreateZAPInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "thefile = " + local_thefile + ", " + "zAPFileName = " + local_zAPFileName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCreateZAPInfoResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setThefile( local_thefile);
        raw.setZAPFileName( local_zAPFileName);
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
    public void setThefile( DataHandler _thefile )
    {
        this.local_thefile = _thefile;
    }
    public DataHandler getThefile( )
    {
        return this.local_thefile;
    }
    public void setZAPFileName( String _zAPFileName )
    {
        this.local_zAPFileName = _zAPFileName;
    }
    public String getZAPFileName( )
    {
        return this.local_zAPFileName;
    }
}