package org.hpccsystems.ws.client.wrappers.gen.filespray;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: PhysicalFileStructWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-13T16:30:50.917Z
 */
public class PhysicalFileStructWrapper
{
protected String local_name;
protected boolean local_isDir;
protected long local_filesize;
protected String local_modifiedtime;
protected String local_path;
protected ArrayOfPhysicalFileStructWrapper local_files;

	public PhysicalFileStructWrapper() {}

	public PhysicalFileStructWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct physicalfilestruct)
	{
		copy( physicalfilestruct );
	}
	public PhysicalFileStructWrapper( String _name, boolean _isDir, long _filesize, String _modifiedtime, String _path, ArrayOfPhysicalFileStructWrapper _files )
	{
		this.local_name = _name;
		this.local_isDir = _isDir;
		this.local_filesize = _filesize;
		this.local_modifiedtime = _modifiedtime;
		this.local_path = _path;
		this.local_files = _files;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct raw )
	{
		if (raw == null)
			return;

		this.local_name = raw.getName();
		this.local_isDir = raw.getIsDir();
		this.local_filesize = raw.getFilesize();
		this.local_modifiedtime = raw.getModifiedtime();
		this.local_path = raw.getPath();
		this.local_files = new ArrayOfPhysicalFileStructWrapper( raw.getFiles());

	}

	@Override
	public String toString()
	{
		return "PhysicalFileStructWrapper [" + "name = " + local_name + ", " + "isDir = " + local_isDir + ", " + "filesize = " + local_filesize + ", " + "modifiedtime = " + local_modifiedtime + ", " + "path = " + local_path + ", " + "files = " + local_files + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.PhysicalFileStruct();
		raw.setName( local_name);
		raw.setIsDir( local_isDir);
		raw.setFilesize( local_filesize);
		raw.setModifiedtime( local_modifiedtime);
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
	public void setIsDir( boolean _isDir )
	{
		this.local_isDir = _isDir;
	}
	public boolean getIsDir( )
	{
		return this.local_isDir;
	}
	public void setFilesize( long _filesize )
	{
		this.local_filesize = _filesize;
	}
	public long getFilesize( )
	{
		return this.local_filesize;
	}
	public void setModifiedtime( String _modifiedtime )
	{
		this.local_modifiedtime = _modifiedtime;
	}
	public String getModifiedtime( )
	{
		return this.local_modifiedtime;
	}
	public void setPath( String _path )
	{
		this.local_path = _path;
	}
	public String getPath( )
	{
		return this.local_path;
	}
	public void setFiles( ArrayOfPhysicalFileStructWrapper _files )
	{
		this.local_files = _files;
	}
	public ArrayOfPhysicalFileStructWrapper getFiles( )
	{
		return this.local_files;
	}
}