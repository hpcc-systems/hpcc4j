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
 * Class name: WUListArchiveFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.937Z
 */
public class WUListArchiveFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArchiveModules_type1Wrapper local_archiveModules;
    protected Files_type1Wrapper local_files;
    protected String local_message;

    public WUListArchiveFilesResponseWrapper() {}

    public WUListArchiveFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse wulistarchivefilesresponse)
    {
        copy( wulistarchivefilesresponse );
    }
    public WUListArchiveFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArchiveModules_type1Wrapper _archiveModules, Files_type1Wrapper _files, String _message )
    {
        this.local_exceptions = _exceptions;
        this.local_archiveModules = _archiveModules;
        this.local_files = _files;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getArchiveModules() != null)
            this.local_archiveModules = new ArchiveModules_type1Wrapper( raw.getArchiveModules());
        if (raw.getFiles() != null)
            this.local_files = new Files_type1Wrapper( raw.getFiles());
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "WUListArchiveFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "archiveModules = " + local_archiveModules + ", " + "files = " + local_files + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListArchiveFilesResponse();
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
    public void setArchiveModules( ArchiveModules_type1Wrapper _archiveModules )
    {
        this.local_archiveModules = _archiveModules;
    }
    public ArchiveModules_type1Wrapper getArchiveModules( )
    {
        return this.local_archiveModules;
    }
    public void setFiles( Files_type1Wrapper _files )
    {
        this.local_files = _files;
    }
    public Files_type1Wrapper getFiles( )
    {
        return this.local_files;
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