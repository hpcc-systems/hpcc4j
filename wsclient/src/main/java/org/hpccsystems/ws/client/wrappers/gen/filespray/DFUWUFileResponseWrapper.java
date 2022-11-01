package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: DFUWUFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.815Z
 */
public class DFUWUFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_file;

    public DFUWUFileResponseWrapper() {}

    public DFUWUFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse dfuwufileresponse)
    {
        copy( dfuwufileresponse );
    }
    public DFUWUFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _file )
    {
        this.local_exceptions = _exceptions;
        this.local_file = _file;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_file = raw.getFile();

    }

    @Override
    public String toString()
    {
        return "DFUWUFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "file = " + local_file + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUFileResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setFile( local_file);
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
}