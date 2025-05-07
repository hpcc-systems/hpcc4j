package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: ECLModuleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ECLModuleWrapper
{
    protected String local_name;
    protected int local_flags;
    protected int local_access;
    protected long local_timestamp;
    protected boolean local_isPlugin;
    protected int local_rank;
    protected String local_fileName;
    protected String local_fileCRC;
    protected String local_version;
    protected String local_checksum;

    public ECLModuleWrapper() {}

    public ECLModuleWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule eclmodule)
    {
        copy( eclmodule );
    }
    public ECLModuleWrapper( String _name, int _flags, int _access, long _timestamp, boolean _isPlugin, int _rank, String _fileName, String _fileCRC, String _version, String _checksum )
    {
        this.local_name = _name;
        this.local_flags = _flags;
        this.local_access = _access;
        this.local_timestamp = _timestamp;
        this.local_isPlugin = _isPlugin;
        this.local_rank = _rank;
        this.local_fileName = _fileName;
        this.local_fileCRC = _fileCRC;
        this.local_version = _version;
        this.local_checksum = _checksum;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_flags = raw.getFlags();
        this.local_access = raw.getAccess();
        this.local_timestamp = raw.getTimestamp();
        this.local_isPlugin = raw.getIsPlugin();
        this.local_rank = raw.getRank();
        this.local_fileName = raw.getFileName();
        this.local_fileCRC = raw.getFileCRC();
        this.local_version = raw.getVersion();
        this.local_checksum = raw.getChecksum();

    }

    @Override
    public String toString()
    {
        return "ECLModuleWrapper [" + "name = " + local_name + ", " + "flags = " + local_flags + ", " + "access = " + local_access + ", " + "timestamp = " + local_timestamp + ", " + "isPlugin = " + local_isPlugin + ", " + "rank = " + local_rank + ", " + "fileName = " + local_fileName + ", " + "fileCRC = " + local_fileCRC + ", " + "version = " + local_version + ", " + "checksum = " + local_checksum + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ECLModule();
        raw.setName( local_name);
        raw.setFlags( local_flags);
        raw.setAccess( local_access);
        raw.setTimestamp( local_timestamp);
        raw.setIsPlugin( local_isPlugin);
        raw.setRank( local_rank);
        raw.setFileName( local_fileName);
        raw.setFileCRC( local_fileCRC);
        raw.setVersion( local_version);
        raw.setChecksum( local_checksum);
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
    public void setFlags( int _flags )
    {
        this.local_flags = _flags;
    }
    public int getFlags( )
    {
        return this.local_flags;
    }
    public void setAccess( int _access )
    {
        this.local_access = _access;
    }
    public int getAccess( )
    {
        return this.local_access;
    }
    public void setTimestamp( long _timestamp )
    {
        this.local_timestamp = _timestamp;
    }
    public long getTimestamp( )
    {
        return this.local_timestamp;
    }
    public void setIsPlugin( boolean _isPlugin )
    {
        this.local_isPlugin = _isPlugin;
    }
    public boolean getIsPlugin( )
    {
        return this.local_isPlugin;
    }
    public void setRank( int _rank )
    {
        this.local_rank = _rank;
    }
    public int getRank( )
    {
        return this.local_rank;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setFileCRC( String _fileCRC )
    {
        this.local_fileCRC = _fileCRC;
    }
    public String getFileCRC( )
    {
        return this.local_fileCRC;
    }
    public void setVersion( String _version )
    {
        this.local_version = _version;
    }
    public String getVersion( )
    {
        return this.local_version;
    }
    public void setChecksum( String _checksum )
    {
        this.local_checksum = _checksum;
    }
    public String getChecksum( )
    {
        return this.local_checksum;
    }
}