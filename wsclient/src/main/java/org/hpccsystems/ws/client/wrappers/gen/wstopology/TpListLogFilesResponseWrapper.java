package org.hpccsystems.ws.client.wrappers.gen.wstopology;

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
 * Class name: TpListLogFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class TpListLogFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfLogFileStructWrapper local_files;

    public TpListLogFilesResponseWrapper() {}

    public TpListLogFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse tplistlogfilesresponse)
    {
        copy( tplistlogfilesresponse );
    }
    public TpListLogFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfLogFileStructWrapper _files )
    {
        this.local_exceptions = _exceptions;
        this.local_files = _files;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getFiles() != null)
            this.local_files = new ArrayOfLogFileStructWrapper( raw.getFiles());

    }

    @Override
    public String toString()
    {
        return "TpListLogFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "files = " + local_files + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpListLogFilesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_files != null)
            raw.setFiles( local_files.getRaw());
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
    public void setFiles( ArrayOfLogFileStructWrapper _files )
    {
        this.local_files = _files;
    }
    public ArrayOfLogFileStructWrapper getFiles( )
    {
        return this.local_files;
    }
}