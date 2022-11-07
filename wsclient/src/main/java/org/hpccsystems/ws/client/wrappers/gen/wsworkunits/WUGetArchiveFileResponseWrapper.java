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
 * Class name: WUGetArchiveFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.914Z
 */
public class WUGetArchiveFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_file;
    protected String local_message;

    public WUGetArchiveFileResponseWrapper() {}

    public WUGetArchiveFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse wugetarchivefileresponse)
    {
        copy( wugetarchivefileresponse );
    }
    public WUGetArchiveFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _file, String _message )
    {
        this.local_exceptions = _exceptions;
        this.local_file = _file;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_file = raw.getFile();
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "WUGetArchiveFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "file = " + local_file + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetArchiveFileResponse();
        raw.setFile( local_file);
        raw.setMessage( local_message);
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
    public void setFile( String _file )
    {
        this.local_file = _file;
    }
    public String getFile( )
    {
        return this.local_file;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
}