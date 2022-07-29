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
 * Class name: WUArchiveFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.879Z
 */
public class WUArchiveFileWrapper
{
    protected String local_name;
    protected String local_key;
    protected String local_sourcePath;
    protected String local_path;

    public WUArchiveFileWrapper() {}

    public WUArchiveFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile wuarchivefile)
    {
        copy( wuarchivefile );
    }
    public WUArchiveFileWrapper( String _name, String _key, String _sourcePath, String _path )
    {
        this.local_name = _name;
        this.local_key = _key;
        this.local_sourcePath = _sourcePath;
        this.local_path = _path;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_key = raw.getKey();
        this.local_sourcePath = raw.getSourcePath();
        this.local_path = raw.getPath();

    }

    @Override
    public String toString()
    {
        return "WUArchiveFileWrapper [" + "name = " + local_name + ", " + "key = " + local_key + ", " + "sourcePath = " + local_sourcePath + ", " + "path = " + local_path + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveFile();
        raw.setName( local_name);
        raw.setKey( local_key);
        raw.setSourcePath( local_sourcePath);
        raw.setPath( local_path);
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
    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setSourcePath( String _sourcePath )
    {
        this.local_sourcePath = _sourcePath;
    }
    public String getSourcePath( )
    {
        return this.local_sourcePath;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
}