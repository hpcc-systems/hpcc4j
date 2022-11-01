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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.582Z
 */
public class WUQueryFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Files_type2Wrapper local_files;
    protected SuperFiles_type1Wrapper local_superFiles;
    protected Queries_type0Wrapper local_queries;

    public WUQueryFilesResponseWrapper() {}

    public WUQueryFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse wuqueryfilesresponse)
    {
        copy( wuqueryfilesresponse );
    }
    public WUQueryFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Files_type2Wrapper _files, SuperFiles_type1Wrapper _superFiles, Queries_type0Wrapper _queries )
    {
        this.local_exceptions = _exceptions;
        this.local_files = _files;
        this.local_superFiles = _superFiles;
        this.local_queries = _queries;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getFiles() != null)
            this.local_files = new Files_type2Wrapper( raw.getFiles());
        if (raw.getSuperFiles() != null)
            this.local_superFiles = new SuperFiles_type1Wrapper( raw.getSuperFiles());
        if (raw.getQueries() != null)
            this.local_queries = new Queries_type0Wrapper( raw.getQueries());

    }

    @Override
    public String toString()
    {
        return "WUQueryFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "files = " + local_files + ", " + "superFiles = " + local_superFiles + ", " + "queries = " + local_queries + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_files != null)
            raw.setFiles( local_files.getRaw());
        if (local_superFiles != null)
            raw.setSuperFiles( local_superFiles.getRaw());
        if (local_queries != null)
            raw.setQueries( local_queries.getRaw());
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
    public void setSuperFiles( SuperFiles_type1Wrapper _superFiles )
    {
        this.local_superFiles = _superFiles;
    }
    public SuperFiles_type1Wrapper getSuperFiles( )
    {
        return this.local_superFiles;
    }
    public void setQueries( Queries_type0Wrapper _queries )
    {
        this.local_queries = _queries;
    }
    public Queries_type0Wrapper getQueries( )
    {
        return this.local_queries;
    }
}