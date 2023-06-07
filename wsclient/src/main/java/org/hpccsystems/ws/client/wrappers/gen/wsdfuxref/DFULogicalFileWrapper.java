package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;

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
 * Class name: DFULogicalFileWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFULogicalFileWrapper
{
    protected String local_prefix;
    protected String local_clusterName;
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
    protected boolean local_isZipfile;
    protected boolean local_isDirectory;
    protected boolean local_replicate;
    protected long local_intSize;
    protected long local_intRecordCount;
    protected boolean local_fromRoxieCluster;
    protected boolean local_browseData;

    public DFULogicalFileWrapper() {}

    public DFULogicalFileWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile dfulogicalfile)
    {
        copy( dfulogicalfile );
    }
    public DFULogicalFileWrapper( String _prefix, String _clusterName, String _directory, String _description, String _parts, String _name, String _owner, String _totalsize, String _recordCount, String _modified, String _longSize, String _longRecordCount, boolean _isSuperfile, boolean _isZipfile, boolean _isDirectory, boolean _replicate, long _intSize, long _intRecordCount, boolean _fromRoxieCluster, boolean _browseData )
    {
        this.local_prefix = _prefix;
        this.local_clusterName = _clusterName;
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
        this.local_isZipfile = _isZipfile;
        this.local_isDirectory = _isDirectory;
        this.local_replicate = _replicate;
        this.local_intSize = _intSize;
        this.local_intRecordCount = _intRecordCount;
        this.local_fromRoxieCluster = _fromRoxieCluster;
        this.local_browseData = _browseData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile raw )
    {
        if (raw == null)
            return;

        this.local_prefix = raw.getPrefix();
        this.local_clusterName = raw.getClusterName();
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
        this.local_isZipfile = raw.getIsZipfile();
        this.local_isDirectory = raw.getIsDirectory();
        this.local_replicate = raw.getReplicate();
        this.local_intSize = raw.getIntSize();
        this.local_intRecordCount = raw.getIntRecordCount();
        this.local_fromRoxieCluster = raw.getFromRoxieCluster();
        this.local_browseData = raw.getBrowseData();

    }

    @Override
    public String toString()
    {
        return "DFULogicalFileWrapper [" + "prefix = " + local_prefix + ", " + "clusterName = " + local_clusterName + ", " + "directory = " + local_directory + ", " + "description = " + local_description + ", " + "parts = " + local_parts + ", " + "name = " + local_name + ", " + "owner = " + local_owner + ", " + "totalsize = " + local_totalsize + ", " + "recordCount = " + local_recordCount + ", " + "modified = " + local_modified + ", " + "longSize = " + local_longSize + ", " + "longRecordCount = " + local_longRecordCount + ", " + "isSuperfile = " + local_isSuperfile + ", " + "isZipfile = " + local_isZipfile + ", " + "isDirectory = " + local_isDirectory + ", " + "replicate = " + local_replicate + ", " + "intSize = " + local_intSize + ", " + "intRecordCount = " + local_intRecordCount + ", " + "fromRoxieCluster = " + local_fromRoxieCluster + ", " + "browseData = " + local_browseData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFULogicalFile();
        raw.setPrefix( local_prefix);
        raw.setClusterName( local_clusterName);
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
        raw.setIsZipfile( local_isZipfile);
        raw.setIsDirectory( local_isDirectory);
        raw.setReplicate( local_replicate);
        raw.setIntSize( local_intSize);
        raw.setIntRecordCount( local_intRecordCount);
        raw.setFromRoxieCluster( local_fromRoxieCluster);
        raw.setBrowseData( local_browseData);
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
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
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
    public void setIsZipfile( boolean _isZipfile )
    {
        this.local_isZipfile = _isZipfile;
    }
    public boolean getIsZipfile( )
    {
        return this.local_isZipfile;
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
}