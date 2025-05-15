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
 * Class name: LogFileStructWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 */
public class LogFileStructWrapper
{
    protected String local_name;
    protected String local_path;
    protected String local_host;
    protected boolean local_isDir;
    protected long local_fileSize;
    protected String local_modifiedtime;

    public LogFileStructWrapper() {}

    public LogFileStructWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct logfilestruct)
    {
        copy( logfilestruct );
    }
    public LogFileStructWrapper( String _name, String _path, String _host, boolean _isDir, long _fileSize, String _modifiedtime )
    {
        this.local_name = _name;
        this.local_path = _path;
        this.local_host = _host;
        this.local_isDir = _isDir;
        this.local_fileSize = _fileSize;
        this.local_modifiedtime = _modifiedtime;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_path = raw.getPath();
        this.local_host = raw.getHost();
        this.local_isDir = raw.getIsDir();
        this.local_fileSize = raw.getFileSize();
        this.local_modifiedtime = raw.getModifiedtime();

    }

    @Override
    public String toString()
    {
        return "LogFileStructWrapper [" + "name = " + local_name + ", " + "path = " + local_path + ", " + "host = " + local_host + ", " + "isDir = " + local_isDir + ", " + "fileSize = " + local_fileSize + ", " + "modifiedtime = " + local_modifiedtime + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.LogFileStruct();
        raw.setName( local_name);
        raw.setPath( local_path);
        raw.setHost( local_host);
        raw.setIsDir( local_isDir);
        raw.setFileSize( local_fileSize);
        raw.setModifiedtime( local_modifiedtime);
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
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setHost( String _host )
    {
        this.local_host = _host;
    }
    public String getHost( )
    {
        return this.local_host;
    }
    public void setIsDir( boolean _isDir )
    {
        this.local_isDir = _isDir;
    }
    public boolean getIsDir( )
    {
        return this.local_isDir;
    }
    public void setFileSize( long _fileSize )
    {
        this.local_fileSize = _fileSize;
    }
    public long getFileSize( )
    {
        return this.local_fileSize;
    }
    public void setModifiedtime( String _modifiedtime )
    {
        this.local_modifiedtime = _modifiedtime;
    }
    public String getModifiedtime( )
    {
        return this.local_modifiedtime;
    }
}