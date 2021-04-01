package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFULogicalFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-03-26T20:56:01.816Z
 */
public class DFULogicalFileWrapper
{
	protected String local_prefix;
	protected String local_nodeGroup;
	protected String local_directory;
	protected String local_description;
	protected String local_parts;
	protected String local_name;
	protected String local_owner;
	protected String local_totalsize;
	protected String local_recordCount;
	protected String local_modified;
	protected String local_longSize;
	protected String local_longRecordCount;
	protected boolean local_isSuperfile;
	protected boolean local_isDirectory;
	protected boolean local_replicate;
	protected long local_intSize;
	protected long local_intRecordCount;
	protected boolean local_fromRoxieCluster;
	protected boolean local_browseData;
	protected boolean local_isCompressed;
	protected String local_contentType;
	protected long local_compressedFileSize;
	protected String local_superOwners;
	protected boolean local_persistent;
	protected boolean local_isProtected;
	protected String local_keyType;
	protected int local_numOfSubfiles;
	protected String local_accessed;

	public DFULogicalFileWrapper() {}

	public DFULogicalFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile dfulogicalfile)
	{
		copy( dfulogicalfile );
	}
	public DFULogicalFileWrapper( String _prefix, String _nodeGroup, String _directory, String _description, String _parts, String _name, String _owner, String _totalsize, String _recordCount, String _modified, String _longSize, String _longRecordCount, boolean _isSuperfile, boolean _isDirectory, boolean _replicate, long _intSize, long _intRecordCount, boolean _fromRoxieCluster, boolean _browseData, boolean _isCompressed, String _contentType, long _compressedFileSize, String _superOwners, boolean _persistent, boolean _isProtected, String _keyType, int _numOfSubfiles, String _accessed )
	{
		this.local_prefix = _prefix;
		this.local_nodeGroup = _nodeGroup;
		this.local_directory = _directory;
		this.local_description = _description;
		this.local_parts = _parts;
		this.local_name = _name;
		this.local_owner = _owner;
		this.local_totalsize = _totalsize;
		this.local_recordCount = _recordCount;
		this.local_modified = _modified;
		this.local_longSize = _longSize;
		this.local_longRecordCount = _longRecordCount;
		this.local_isSuperfile = _isSuperfile;
		this.local_isDirectory = _isDirectory;
		this.local_replicate = _replicate;
		this.local_intSize = _intSize;
		this.local_intRecordCount = _intRecordCount;
		this.local_fromRoxieCluster = _fromRoxieCluster;
		this.local_browseData = _browseData;
		this.local_isCompressed = _isCompressed;
		this.local_contentType = _contentType;
		this.local_compressedFileSize = _compressedFileSize;
		this.local_superOwners = _superOwners;
		this.local_persistent = _persistent;
		this.local_isProtected = _isProtected;
		this.local_keyType = _keyType;
		this.local_numOfSubfiles = _numOfSubfiles;
		this.local_accessed = _accessed;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile raw )
	{
		if (raw == null)
			return;

		this.local_prefix = raw.getPrefix();
		this.local_nodeGroup = raw.getNodeGroup();
		this.local_directory = raw.getDirectory();
		this.local_description = raw.getDescription();
		this.local_parts = raw.getParts();
		this.local_name = raw.getName();
		this.local_owner = raw.getOwner();
		this.local_totalsize = raw.getTotalsize();
		this.local_recordCount = raw.getRecordCount();
		this.local_modified = raw.getModified();
		this.local_longSize = raw.getLongSize();
		this.local_longRecordCount = raw.getLongRecordCount();
		this.local_isSuperfile = raw.getIsSuperfile();
		this.local_isDirectory = raw.getIsDirectory();
		this.local_replicate = raw.getReplicate();
		this.local_intSize = raw.getIntSize();
		this.local_intRecordCount = raw.getIntRecordCount();
		this.local_fromRoxieCluster = raw.getFromRoxieCluster();
		this.local_browseData = raw.getBrowseData();
		this.local_isCompressed = raw.getIsCompressed();
		this.local_contentType = raw.getContentType();
		this.local_compressedFileSize = raw.getCompressedFileSize();
		this.local_superOwners = raw.getSuperOwners();
		this.local_persistent = raw.getPersistent();
		this.local_isProtected = raw.getIsProtected();
		this.local_keyType = raw.getKeyType();
		this.local_numOfSubfiles = raw.getNumOfSubfiles();
		this.local_accessed = raw.getAccessed();

	}

	@Override
	public String toString()
	{
		return "DFULogicalFileWrapper [" + "prefix = " + local_prefix + ", " + "nodeGroup = " + local_nodeGroup + ", " + "directory = " + local_directory + ", " + "description = " + local_description + ", " + "parts = " + local_parts + ", " + "name = " + local_name + ", " + "owner = " + local_owner + ", " + "totalsize = " + local_totalsize + ", " + "recordCount = " + local_recordCount + ", " + "modified = " + local_modified + ", " + "longSize = " + local_longSize + ", " + "longRecordCount = " + local_longRecordCount + ", " + "isSuperfile = " + local_isSuperfile + ", " + "isDirectory = " + local_isDirectory + ", " + "replicate = " + local_replicate + ", " + "intSize = " + local_intSize + ", " + "intRecordCount = " + local_intRecordCount + ", " + "fromRoxieCluster = " + local_fromRoxieCluster + ", " + "browseData = " + local_browseData + ", " + "isCompressed = " + local_isCompressed + ", " + "contentType = " + local_contentType + ", " + "compressedFileSize = " + local_compressedFileSize + ", " + "superOwners = " + local_superOwners + ", " + "persistent = " + local_persistent + ", " + "isProtected = " + local_isProtected + ", " + "keyType = " + local_keyType + ", " + "numOfSubfiles = " + local_numOfSubfiles + ", " + "accessed = " + local_accessed + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_57.DFULogicalFile();
		raw.setPrefix( local_prefix);
		raw.setNodeGroup( local_nodeGroup);
		raw.setDirectory( local_directory);
		raw.setDescription( local_description);
		raw.setParts( local_parts);
		raw.setName( local_name);
		raw.setOwner( local_owner);
		raw.setTotalsize( local_totalsize);
		raw.setRecordCount( local_recordCount);
		raw.setModified( local_modified);
		raw.setLongSize( local_longSize);
		raw.setLongRecordCount( local_longRecordCount);
		raw.setIsSuperfile( local_isSuperfile);
		raw.setIsDirectory( local_isDirectory);
		raw.setReplicate( local_replicate);
		raw.setIntSize( local_intSize);
		raw.setIntRecordCount( local_intRecordCount);
		raw.setFromRoxieCluster( local_fromRoxieCluster);
		raw.setBrowseData( local_browseData);
		raw.setIsCompressed( local_isCompressed);
		raw.setContentType( local_contentType);
		raw.setCompressedFileSize( local_compressedFileSize);
		raw.setSuperOwners( local_superOwners);
		raw.setPersistent( local_persistent);
		raw.setIsProtected( local_isProtected);
		raw.setKeyType( local_keyType);
		raw.setNumOfSubfiles( local_numOfSubfiles);
		raw.setAccessed( local_accessed);
		return raw;
	}


	public void setPrefix( String _prefix )
	{
		this.local_prefix = _prefix;
	}
	public String getPrefix( )
	{
		return this.local_prefix;
	}
	public void setNodeGroup( String _nodeGroup )
	{
		this.local_nodeGroup = _nodeGroup;
	}
	public String getNodeGroup( )
	{
		return this.local_nodeGroup;
	}
	public void setDirectory( String _directory )
	{
		this.local_directory = _directory;
	}
	public String getDirectory( )
	{
		return this.local_directory;
	}
	public void setDescription( String _description )
	{
		this.local_description = _description;
	}
	public String getDescription( )
	{
		return this.local_description;
	}
	public void setParts( String _parts )
	{
		this.local_parts = _parts;
	}
	public String getParts( )
	{
		return this.local_parts;
	}
	public void setName( String _name )
	{
		this.local_name = _name;
	}
	public String getName( )
	{
		return this.local_name;
	}
	public void setOwner( String _owner )
	{
		this.local_owner = _owner;
	}
	public String getOwner( )
	{
		return this.local_owner;
	}
	public void setTotalsize( String _totalsize )
	{
		this.local_totalsize = _totalsize;
	}
	public String getTotalsize( )
	{
		return this.local_totalsize;
	}
	public void setRecordCount( String _recordCount )
	{
		this.local_recordCount = _recordCount;
	}
	public String getRecordCount( )
	{
		return this.local_recordCount;
	}
	public void setModified( String _modified )
	{
		this.local_modified = _modified;
	}
	public String getModified( )
	{
		return this.local_modified;
	}
	public void setLongSize( String _longSize )
	{
		this.local_longSize = _longSize;
	}
	public String getLongSize( )
	{
		return this.local_longSize;
	}
	public void setLongRecordCount( String _longRecordCount )
	{
		this.local_longRecordCount = _longRecordCount;
	}
	public String getLongRecordCount( )
	{
		return this.local_longRecordCount;
	}
	public void setIsSuperfile( boolean _isSuperfile )
	{
		this.local_isSuperfile = _isSuperfile;
	}
	public boolean getIsSuperfile( )
	{
		return this.local_isSuperfile;
	}
	public void setIsDirectory( boolean _isDirectory )
	{
		this.local_isDirectory = _isDirectory;
	}
	public boolean getIsDirectory( )
	{
		return this.local_isDirectory;
	}
	public void setReplicate( boolean _replicate )
	{
		this.local_replicate = _replicate;
	}
	public boolean getReplicate( )
	{
		return this.local_replicate;
	}
	public void setIntSize( long _intSize )
	{
		this.local_intSize = _intSize;
	}
	public long getIntSize( )
	{
		return this.local_intSize;
	}
	public void setIntRecordCount( long _intRecordCount )
	{
		this.local_intRecordCount = _intRecordCount;
	}
	public long getIntRecordCount( )
	{
		return this.local_intRecordCount;
	}
	public void setFromRoxieCluster( boolean _fromRoxieCluster )
	{
		this.local_fromRoxieCluster = _fromRoxieCluster;
	}
	public boolean getFromRoxieCluster( )
	{
		return this.local_fromRoxieCluster;
	}
	public void setBrowseData( boolean _browseData )
	{
		this.local_browseData = _browseData;
	}
	public boolean getBrowseData( )
	{
		return this.local_browseData;
	}
	public void setIsCompressed( boolean _isCompressed )
	{
		this.local_isCompressed = _isCompressed;
	}
	public boolean getIsCompressed( )
	{
		return this.local_isCompressed;
	}
	public void setContentType( String _contentType )
	{
		this.local_contentType = _contentType;
	}
	public String getContentType( )
	{
		return this.local_contentType;
	}
	public void setCompressedFileSize( long _compressedFileSize )
	{
		this.local_compressedFileSize = _compressedFileSize;
	}
	public long getCompressedFileSize( )
	{
		return this.local_compressedFileSize;
	}
	public void setSuperOwners( String _superOwners )
	{
		this.local_superOwners = _superOwners;
	}
	public String getSuperOwners( )
	{
		return this.local_superOwners;
	}
	public void setPersistent( boolean _persistent )
	{
		this.local_persistent = _persistent;
	}
	public boolean getPersistent( )
	{
		return this.local_persistent;
	}
	public void setIsProtected( boolean _isProtected )
	{
		this.local_isProtected = _isProtected;
	}
	public boolean getIsProtected( )
	{
		return this.local_isProtected;
	}
	public void setKeyType( String _keyType )
	{
		this.local_keyType = _keyType;
	}
	public String getKeyType( )
	{
		return this.local_keyType;
	}
	public void setNumOfSubfiles( int _numOfSubfiles )
	{
		this.local_numOfSubfiles = _numOfSubfiles;
	}
	public int getNumOfSubfiles( )
	{
		return this.local_numOfSubfiles;
	}
	public void setAccessed( String _accessed )
	{
		this.local_accessed = _accessed;
	}
	public String getAccessed( )
	{
		return this.local_accessed;
	}
}