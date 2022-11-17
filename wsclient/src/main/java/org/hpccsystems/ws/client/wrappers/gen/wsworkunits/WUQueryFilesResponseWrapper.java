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
 * Class name: WUQueryFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.WUQueryFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.556Z
 */
public class WUQueryFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Files_type2Wrapper local_files;

    public WUQueryFilesResponseWrapper() {}

    public WUQueryFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse wuqueryfilesresponse)
    {
        copy( wuqueryfilesresponse );
    }
    public WUQueryFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Files_type2Wrapper _files )
    {
        this.local_exceptions = _exceptions;
        this.local_files = _files;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getFiles() != null)
            this.local_files = new Files_type2Wrapper( raw.getFiles());

    }

    @Override
    public String toString()
    {
        return "WUQueryFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "files = " + local_files + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse();
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
    public void setFiles( Files_type2Wrapper _files )
    {
        this.local_files = _files;
    }
    public Files_type2Wrapper getFiles( )
    {
        return this.local_files;
    }
}