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
 * Class name: QuerySuperFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.491Z
 */
public class QuerySuperFileWrapper
{
    protected String local_name;
    protected SubFiles_type0Wrapper local_subFiles;
    protected SuperFiles_type0Wrapper local_superFiles;

    public QuerySuperFileWrapper() {}

    public QuerySuperFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile querysuperfile)
    {
        copy( querysuperfile );
    }
    public QuerySuperFileWrapper( String _name, SubFiles_type0Wrapper _subFiles, SuperFiles_type0Wrapper _superFiles )
    {
        this.local_name = _name;
        this.local_subFiles = _subFiles;
        this.local_superFiles = _superFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getSubFiles() != null)
            this.local_subFiles = new SubFiles_type0Wrapper( raw.getSubFiles());
        if (raw.getSuperFiles() != null)
            this.local_superFiles = new SuperFiles_type0Wrapper( raw.getSuperFiles());

    }

    @Override
    public String toString()
    {
        return "QuerySuperFileWrapper [" + "name = " + local_name + ", " + "subFiles = " + local_subFiles + ", " + "superFiles = " + local_superFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySuperFile();
        raw.setName( local_name);
        if (local_subFiles != null)
            raw.setSubFiles( local_subFiles.getRaw());
        if (local_superFiles != null)
            raw.setSuperFiles( local_superFiles.getRaw());
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setSubFiles( SubFiles_type0Wrapper _subFiles )
    {
        this.local_subFiles = _subFiles;
    }
    public SubFiles_type0Wrapper getSubFiles( )
    {
        return this.local_subFiles;
    }
    public void setSuperFiles( SuperFiles_type0Wrapper _superFiles )
    {
        this.local_superFiles = _superFiles;
    }
    public SuperFiles_type0Wrapper getSuperFiles( )
    {
        return this.local_superFiles;
    }
}