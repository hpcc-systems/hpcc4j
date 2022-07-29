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
 * Class name: QueryFilesUsedWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.849Z
 */
public class QueryFilesUsedWrapper
{
    protected String local_queryId;
    protected Files_type3Wrapper local_files;
    protected SuperFiles_type2Wrapper local_superFiles;

    public QueryFilesUsedWrapper() {}

    public QueryFilesUsedWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed queryfilesused)
    {
        copy( queryfilesused );
    }
    public QueryFilesUsedWrapper( String _queryId, Files_type3Wrapper _files, SuperFiles_type2Wrapper _superFiles )
    {
        this.local_queryId = _queryId;
        this.local_files = _files;
        this.local_superFiles = _superFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed raw )
    {
        if (raw == null)
            return;

        this.local_queryId = raw.getQueryId();
        if (raw.getFiles() != null)
            this.local_files = new Files_type3Wrapper( raw.getFiles());
        if (raw.getSuperFiles() != null)
            this.local_superFiles = new SuperFiles_type2Wrapper( raw.getSuperFiles());

    }

    @Override
    public String toString()
    {
        return "QueryFilesUsedWrapper [" + "queryId = " + local_queryId + ", " + "files = " + local_files + ", " + "superFiles = " + local_superFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryFilesUsed();
        raw.setQueryId( local_queryId);
        return raw;
    }


    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setFiles( Files_type3Wrapper _files )
    {
        this.local_files = _files;
    }
    public Files_type3Wrapper getFiles( )
    {
        return this.local_files;
    }
    public void setSuperFiles( SuperFiles_type2Wrapper _superFiles )
    {
        this.local_superFiles = _superFiles;
    }
    public SuperFiles_type2Wrapper getSuperFiles( )
    {
        return this.local_superFiles;
    }
}