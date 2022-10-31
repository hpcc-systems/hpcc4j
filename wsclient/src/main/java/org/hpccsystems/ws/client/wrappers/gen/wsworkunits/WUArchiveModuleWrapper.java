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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUArchiveModuleWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.507Z
 */
public class WUArchiveModuleWrapper
{
    protected String local_name;
    protected String local_fullName;
    protected UnsignedInt local_flags;
    protected String local_key;
    protected String local_plugin;
    protected String local_sourcePath;
    protected String local_version;
    protected String local_path;
    protected ArchiveModules_type0Wrapper local_archiveModules;
    protected Files_type0Wrapper local_files;

    public WUArchiveModuleWrapper() {}

    public WUArchiveModuleWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule wuarchivemodule)
    {
        copy( wuarchivemodule );
    }
    public WUArchiveModuleWrapper( String _name, String _fullName, UnsignedInt _flags, String _key, String _plugin, String _sourcePath, String _version, String _path, ArchiveModules_type0Wrapper _archiveModules, Files_type0Wrapper _files )
    {
        this.local_name = _name;
        this.local_fullName = _fullName;
        this.local_flags = _flags;
        this.local_key = _key;
        this.local_plugin = _plugin;
        this.local_sourcePath = _sourcePath;
        this.local_version = _version;
        this.local_path = _path;
        this.local_archiveModules = _archiveModules;
        this.local_files = _files;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_fullName = raw.getFullName();
        this.local_flags = raw.getFlags();
        this.local_key = raw.getKey();
        this.local_plugin = raw.getPlugin();
        this.local_sourcePath = raw.getSourcePath();
        this.local_version = raw.getVersion();
        this.local_path = raw.getPath();
        if (raw.getArchiveModules() != null)
            this.local_archiveModules = new ArchiveModules_type0Wrapper( raw.getArchiveModules());
        if (raw.getFiles() != null)
            this.local_files = new Files_type0Wrapper( raw.getFiles());

    }

    @Override
    public String toString()
    {
        return "WUArchiveModuleWrapper [" + "name = " + local_name + ", " + "fullName = " + local_fullName + ", " + "flags = " + local_flags + ", " + "key = " + local_key + ", " + "plugin = " + local_plugin + ", " + "sourcePath = " + local_sourcePath + ", " + "version = " + local_version + ", " + "path = " + local_path + ", " + "archiveModules = " + local_archiveModules + ", " + "files = " + local_files + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUArchiveModule();
        raw.setName( local_name);
        raw.setFullName( local_fullName);
        raw.setFlags( local_flags);
        raw.setKey( local_key);
        raw.setPlugin( local_plugin);
        raw.setSourcePath( local_sourcePath);
        raw.setVersion( local_version);
        raw.setPath( local_path);
        if (local_archiveModules != null)
            raw.setArchiveModules( local_archiveModules.getRaw());
        if (local_files != null)
            raw.setFiles( local_files.getRaw());
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
    public void setFullName( String _fullName )
    {
        this.local_fullName = _fullName;
    }
    public String getFullName( )
    {
        return this.local_fullName;
    }
    public void setFlags( UnsignedInt _flags )
    {
        this.local_flags = _flags;
    }
    public UnsignedInt getFlags( )
    {
        return this.local_flags;
    }
    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setPlugin( String _plugin )
    {
        this.local_plugin = _plugin;
    }
    public String getPlugin( )
    {
        return this.local_plugin;
    }
    public void setSourcePath( String _sourcePath )
    {
        this.local_sourcePath = _sourcePath;
    }
    public String getSourcePath( )
    {
        return this.local_sourcePath;
    }
    public void setVersion( String _version )
    {
        this.local_version = _version;
    }
    public String getVersion( )
    {
        return this.local_version;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setArchiveModules( ArchiveModules_type0Wrapper _archiveModules )
    {
        this.local_archiveModules = _archiveModules;
    }
    public ArchiveModules_type0Wrapper getArchiveModules( )
    {
        return this.local_archiveModules;
    }
    public void setFiles( Files_type0Wrapper _files )
    {
        this.local_files = _files;
    }
    public Files_type0Wrapper getFiles( )
    {
        return this.local_files;
    }
}