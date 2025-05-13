package org.hpccsystems.ws.client.wrappers.gen.wsdfu;

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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUFileDetailWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUFileDetailWrapper
{
    protected String local_name;
    protected String local_filename;
    protected String local_prefix;
    protected String local_nodeGroup;
    protected int local_numParts;
    protected String local_description;
    protected String local_dir;
    protected String local_pathMask;
    protected String local_filesize;
    protected long local_fileSizeInt64;
    protected String local_recordSize;
    protected String local_recordCount;
    protected long local_recordSizeInt64;
    protected long local_recordCountInt64;
    protected String local_wuid;
    protected String local_owner;
    protected String local_jobName;
    protected String local_persistent;
    protected String local_format;
    protected String local_maxRecordSize;
    protected String local_csvSeparate;
    protected String local_csvQuote;
    protected String local_csvTerminate;
    protected String local_csvEscape;
    protected String local_modified;
    protected String local_ecl;
    protected DFUFileStatWrapper local_stat;
    protected ArrayOfDFUFilePartsOnClusterWrapper local_dFUFilePartsOnClusters;
    protected boolean local_isSuperfile;
    protected boolean local_showFileContent;
    protected List<String> local_subfiles = null;
    protected ArrayOfDFULogicalFileWrapper local_superfiles;
    protected ArrayOfDFUFileProtectWrapper local_protectList;
    protected boolean local_fromRoxieCluster;
    protected Graphs_type0Wrapper local_graphs;
    protected String local_userPermission;
    protected String local_contentType;
    protected long local_compressedFileSize;
    protected String local_percentCompressed;
    protected boolean local_isCompressed;
    protected boolean local_isRestricted;
    protected boolean local_browseData;
    protected String local_jsonInfo;
    protected DataHandler local_binInfo;
    protected String local_packageID;
    protected DFUFilePartitionWrapper local_partition;
    protected ArrayOfDFUFileBloomWrapper local_blooms;
    protected int local_expireDays;
    protected String local_keyType;
    protected double local_atRestCost;
    protected double local_accessCost;
    protected String local_expirationDate;
    protected DFUIndexInfoWrapper local_extendedIndexInfo;

    public DFUFileDetailWrapper() {}

    public DFUFileDetailWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail dfufiledetail)
    {
        copy( dfufiledetail );
    }
    public DFUFileDetailWrapper( String _name, String _filename, String _prefix, String _nodeGroup, int _numParts, String _description, String _dir, String _pathMask, String _filesize, long _fileSizeInt64, String _recordSize, String _recordCount, long _recordSizeInt64, long _recordCountInt64, String _wuid, String _owner, String _jobName, String _persistent, String _format, String _maxRecordSize, String _csvSeparate, String _csvQuote, String _csvTerminate, String _csvEscape, String _modified, String _ecl, DFUFileStatWrapper _stat, ArrayOfDFUFilePartsOnClusterWrapper _dFUFilePartsOnClusters, boolean _isSuperfile, boolean _showFileContent, List<String> _subfiles, ArrayOfDFULogicalFileWrapper _superfiles, ArrayOfDFUFileProtectWrapper _protectList, boolean _fromRoxieCluster, Graphs_type0Wrapper _graphs, String _userPermission, String _contentType, long _compressedFileSize, String _percentCompressed, boolean _isCompressed, boolean _isRestricted, boolean _browseData, String _jsonInfo, DataHandler _binInfo, String _packageID, DFUFilePartitionWrapper _partition, ArrayOfDFUFileBloomWrapper _blooms, int _expireDays, String _keyType, double _atRestCost, double _accessCost, String _expirationDate, DFUIndexInfoWrapper _extendedIndexInfo )
    {
        this.local_name = _name;
        this.local_filename = _filename;
        this.local_prefix = _prefix;
        this.local_nodeGroup = _nodeGroup;
        this.local_numParts = _numParts;
        this.local_description = _description;
        this.local_dir = _dir;
        this.local_pathMask = _pathMask;
        this.local_filesize = _filesize;
        this.local_fileSizeInt64 = _fileSizeInt64;
        this.local_recordSize = _recordSize;
        this.local_recordCount = _recordCount;
        this.local_recordSizeInt64 = _recordSizeInt64;
        this.local_recordCountInt64 = _recordCountInt64;
        this.local_wuid = _wuid;
        this.local_owner = _owner;
        this.local_jobName = _jobName;
        this.local_persistent = _persistent;
        this.local_format = _format;
        this.local_maxRecordSize = _maxRecordSize;
        this.local_csvSeparate = _csvSeparate;
        this.local_csvQuote = _csvQuote;
        this.local_csvTerminate = _csvTerminate;
        this.local_csvEscape = _csvEscape;
        this.local_modified = _modified;
        this.local_ecl = _ecl;
        this.local_stat = _stat;
        this.local_dFUFilePartsOnClusters = _dFUFilePartsOnClusters;
        this.local_isSuperfile = _isSuperfile;
        this.local_showFileContent = _showFileContent;
        this.local_subfiles = _subfiles;
        this.local_superfiles = _superfiles;
        this.local_protectList = _protectList;
        this.local_fromRoxieCluster = _fromRoxieCluster;
        this.local_graphs = _graphs;
        this.local_userPermission = _userPermission;
        this.local_contentType = _contentType;
        this.local_compressedFileSize = _compressedFileSize;
        this.local_percentCompressed = _percentCompressed;
        this.local_isCompressed = _isCompressed;
        this.local_isRestricted = _isRestricted;
        this.local_browseData = _browseData;
        this.local_jsonInfo = _jsonInfo;
        this.local_binInfo = _binInfo;
        this.local_packageID = _packageID;
        this.local_partition = _partition;
        this.local_blooms = _blooms;
        this.local_expireDays = _expireDays;
        this.local_keyType = _keyType;
        this.local_atRestCost = _atRestCost;
        this.local_accessCost = _accessCost;
        this.local_expirationDate = _expirationDate;
        this.local_extendedIndexInfo = _extendedIndexInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_filename = raw.getFilename();
        this.local_prefix = raw.getPrefix();
        this.local_nodeGroup = raw.getNodeGroup();
        this.local_numParts = raw.getNumParts();
        this.local_description = raw.getDescription();
        this.local_dir = raw.getDir();
        this.local_pathMask = raw.getPathMask();
        this.local_filesize = raw.getFilesize();
        this.local_fileSizeInt64 = raw.getFileSizeInt64();
        this.local_recordSize = raw.getRecordSize();
        this.local_recordCount = raw.getRecordCount();
        this.local_recordSizeInt64 = raw.getRecordSizeInt64();
        this.local_recordCountInt64 = raw.getRecordCountInt64();
        this.local_wuid = raw.getWuid();
        this.local_owner = raw.getOwner();
        this.local_jobName = raw.getJobName();
        this.local_persistent = raw.getPersistent();
        this.local_format = raw.getFormat();
        this.local_maxRecordSize = raw.getMaxRecordSize();
        this.local_csvSeparate = raw.getCsvSeparate();
        this.local_csvQuote = raw.getCsvQuote();
        this.local_csvTerminate = raw.getCsvTerminate();
        this.local_csvEscape = raw.getCsvEscape();
        this.local_modified = raw.getModified();
        this.local_ecl = raw.getEcl();
        if (raw.getStat() != null)
            this.local_stat = new DFUFileStatWrapper( raw.getStat());
        if (raw.getDFUFilePartsOnClusters() != null)
            this.local_dFUFilePartsOnClusters = new ArrayOfDFUFilePartsOnClusterWrapper( raw.getDFUFilePartsOnClusters());
        this.local_isSuperfile = raw.getIsSuperfile();
        this.local_showFileContent = raw.getShowFileContent();
        if (raw.getSubfiles() != null && raw.getSubfiles().getItem() != null)
        {
            this.local_subfiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getSubfiles().getItem().length; i++)
            {
                this.local_subfiles.add(new String(raw.getSubfiles().getItem()[i]));
            }
        }        if (raw.getSuperfiles() != null)
            this.local_superfiles = new ArrayOfDFULogicalFileWrapper( raw.getSuperfiles());
        if (raw.getProtectList() != null)
            this.local_protectList = new ArrayOfDFUFileProtectWrapper( raw.getProtectList());
        this.local_fromRoxieCluster = raw.getFromRoxieCluster();
        if (raw.getGraphs() != null)
            this.local_graphs = new Graphs_type0Wrapper( raw.getGraphs());
        this.local_userPermission = raw.getUserPermission();
        this.local_contentType = raw.getContentType();
        this.local_compressedFileSize = raw.getCompressedFileSize();
        this.local_percentCompressed = raw.getPercentCompressed();
        this.local_isCompressed = raw.getIsCompressed();
        this.local_isRestricted = raw.getIsRestricted();
        this.local_browseData = raw.getBrowseData();
        this.local_jsonInfo = raw.getJsonInfo();
        this.local_binInfo = raw.getBinInfo();
        this.local_packageID = raw.getPackageID();
        if (raw.getPartition() != null)
            this.local_partition = new DFUFilePartitionWrapper( raw.getPartition());
        if (raw.getBlooms() != null)
            this.local_blooms = new ArrayOfDFUFileBloomWrapper( raw.getBlooms());
        this.local_expireDays = raw.getExpireDays();
        this.local_keyType = raw.getKeyType();
        this.local_atRestCost = raw.getAtRestCost();
        this.local_accessCost = raw.getAccessCost();
        this.local_expirationDate = raw.getExpirationDate();
        if (raw.getExtendedIndexInfo() != null)
            this.local_extendedIndexInfo = new DFUIndexInfoWrapper( raw.getExtendedIndexInfo());

    }

    @Override
    public String toString()
    {
        return "DFUFileDetailWrapper [" + "name = " + local_name + ", " + "filename = " + local_filename + ", " + "prefix = " + local_prefix + ", " + "nodeGroup = " + local_nodeGroup + ", " + "numParts = " + local_numParts + ", " + "description = " + local_description + ", " + "dir = " + local_dir + ", " + "pathMask = " + local_pathMask + ", " + "filesize = " + local_filesize + ", " + "fileSizeInt64 = " + local_fileSizeInt64 + ", " + "recordSize = " + local_recordSize + ", " + "recordCount = " + local_recordCount + ", " + "recordSizeInt64 = " + local_recordSizeInt64 + ", " + "recordCountInt64 = " + local_recordCountInt64 + ", " + "wuid = " + local_wuid + ", " + "owner = " + local_owner + ", " + "jobName = " + local_jobName + ", " + "persistent = " + local_persistent + ", " + "format = " + local_format + ", " + "maxRecordSize = " + local_maxRecordSize + ", " + "csvSeparate = " + local_csvSeparate + ", " + "csvQuote = " + local_csvQuote + ", " + "csvTerminate = " + local_csvTerminate + ", " + "csvEscape = " + local_csvEscape + ", " + "modified = " + local_modified + ", " + "ecl = " + local_ecl + ", " + "stat = " + local_stat + ", " + "dFUFilePartsOnClusters = " + local_dFUFilePartsOnClusters + ", " + "isSuperfile = " + local_isSuperfile + ", " + "showFileContent = " + local_showFileContent + ", " + "subfiles = " + local_subfiles + ", " + "superfiles = " + local_superfiles + ", " + "protectList = " + local_protectList + ", " + "fromRoxieCluster = " + local_fromRoxieCluster + ", " + "graphs = " + local_graphs + ", " + "userPermission = " + local_userPermission + ", " + "contentType = " + local_contentType + ", " + "compressedFileSize = " + local_compressedFileSize + ", " + "percentCompressed = " + local_percentCompressed + ", " + "isCompressed = " + local_isCompressed + ", " + "isRestricted = " + local_isRestricted + ", " + "browseData = " + local_browseData + ", " + "jsonInfo = " + local_jsonInfo + ", " + "binInfo = " + local_binInfo + ", " + "packageID = " + local_packageID + ", " + "partition = " + local_partition + ", " + "blooms = " + local_blooms + ", " + "expireDays = " + local_expireDays + ", " + "keyType = " + local_keyType + ", " + "atRestCost = " + local_atRestCost + ", " + "accessCost = " + local_accessCost + ", " + "expirationDate = " + local_expirationDate + ", " + "extendedIndexInfo = " + local_extendedIndexInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFileDetail();
        raw.setName( local_name);
        raw.setFilename( local_filename);
        raw.setPrefix( local_prefix);
        raw.setNodeGroup( local_nodeGroup);
        raw.setNumParts( local_numParts);
        raw.setDescription( local_description);
        raw.setDir( local_dir);
        raw.setPathMask( local_pathMask);
        raw.setFilesize( local_filesize);
        raw.setFileSizeInt64( local_fileSizeInt64);
        raw.setRecordSize( local_recordSize);
        raw.setRecordCount( local_recordCount);
        raw.setRecordSizeInt64( local_recordSizeInt64);
        raw.setRecordCountInt64( local_recordCountInt64);
        raw.setWuid( local_wuid);
        raw.setOwner( local_owner);
        raw.setJobName( local_jobName);
        raw.setPersistent( local_persistent);
        raw.setFormat( local_format);
        raw.setMaxRecordSize( local_maxRecordSize);
        raw.setCsvSeparate( local_csvSeparate);
        raw.setCsvQuote( local_csvQuote);
        raw.setCsvTerminate( local_csvTerminate);
        raw.setCsvEscape( local_csvEscape);
        raw.setModified( local_modified);
        raw.setEcl( local_ecl);
        if (local_stat != null)
            raw.setStat( local_stat.getRaw());
        if (local_dFUFilePartsOnClusters != null)
            raw.setDFUFilePartsOnClusters( local_dFUFilePartsOnClusters.getRaw());
        raw.setIsSuperfile( local_isSuperfile);
        raw.setShowFileContent( local_showFileContent);
        if (this.local_subfiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_subfiles.size(); i++)
            {
                arr.addItem(this.local_subfiles.get(i));
            }
            raw.setSubfiles(arr);
        }
        if (local_superfiles != null)
            raw.setSuperfiles( local_superfiles.getRaw());
        if (local_protectList != null)
            raw.setProtectList( local_protectList.getRaw());
        raw.setFromRoxieCluster( local_fromRoxieCluster);
        if (local_graphs != null)
            raw.setGraphs( local_graphs.getRaw());
        raw.setUserPermission( local_userPermission);
        raw.setContentType( local_contentType);
        raw.setCompressedFileSize( local_compressedFileSize);
        raw.setPercentCompressed( local_percentCompressed);
        raw.setIsCompressed( local_isCompressed);
        raw.setIsRestricted( local_isRestricted);
        raw.setBrowseData( local_browseData);
        raw.setJsonInfo( local_jsonInfo);
        raw.setBinInfo( local_binInfo);
        raw.setPackageID( local_packageID);
        if (local_partition != null)
            raw.setPartition( local_partition.getRaw());
        if (local_blooms != null)
            raw.setBlooms( local_blooms.getRaw());
        raw.setExpireDays( local_expireDays);
        raw.setKeyType( local_keyType);
        raw.setAtRestCost( local_atRestCost);
        raw.setAccessCost( local_accessCost);
        raw.setExpirationDate( local_expirationDate);
        if (local_extendedIndexInfo != null)
            raw.setExtendedIndexInfo( local_extendedIndexInfo.getRaw());
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
    public void setFilename( String _filename )
    {
        this.local_filename = _filename;
    }
    public String getFilename( )
    {
        return this.local_filename;
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
    public void setNumParts( int _numParts )
    {
        this.local_numParts = _numParts;
    }
    public int getNumParts( )
    {
        return this.local_numParts;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setDir( String _dir )
    {
        this.local_dir = _dir;
    }
    public String getDir( )
    {
        return this.local_dir;
    }
    public void setPathMask( String _pathMask )
    {
        this.local_pathMask = _pathMask;
    }
    public String getPathMask( )
    {
        return this.local_pathMask;
    }
    public void setFilesize( String _filesize )
    {
        this.local_filesize = _filesize;
    }
    public String getFilesize( )
    {
        return this.local_filesize;
    }
    public void setFileSizeInt64( long _fileSizeInt64 )
    {
        this.local_fileSizeInt64 = _fileSizeInt64;
    }
    public long getFileSizeInt64( )
    {
        return this.local_fileSizeInt64;
    }
    public void setRecordSize( String _recordSize )
    {
        this.local_recordSize = _recordSize;
    }
    public String getRecordSize( )
    {
        return this.local_recordSize;
    }
    public void setRecordCount( String _recordCount )
    {
        this.local_recordCount = _recordCount;
    }
    public String getRecordCount( )
    {
        return this.local_recordCount;
    }
    public void setRecordSizeInt64( long _recordSizeInt64 )
    {
        this.local_recordSizeInt64 = _recordSizeInt64;
    }
    public long getRecordSizeInt64( )
    {
        return this.local_recordSizeInt64;
    }
    public void setRecordCountInt64( long _recordCountInt64 )
    {
        this.local_recordCountInt64 = _recordCountInt64;
    }
    public long getRecordCountInt64( )
    {
        return this.local_recordCountInt64;
    }
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setJobName( String _jobName )
    {
        this.local_jobName = _jobName;
    }
    public String getJobName( )
    {
        return this.local_jobName;
    }
    public void setPersistent( String _persistent )
    {
        this.local_persistent = _persistent;
    }
    public String getPersistent( )
    {
        return this.local_persistent;
    }
    public void setFormat( String _format )
    {
        this.local_format = _format;
    }
    public String getFormat( )
    {
        return this.local_format;
    }
    public void setMaxRecordSize( String _maxRecordSize )
    {
        this.local_maxRecordSize = _maxRecordSize;
    }
    public String getMaxRecordSize( )
    {
        return this.local_maxRecordSize;
    }
    public void setCsvSeparate( String _csvSeparate )
    {
        this.local_csvSeparate = _csvSeparate;
    }
    public String getCsvSeparate( )
    {
        return this.local_csvSeparate;
    }
    public void setCsvQuote( String _csvQuote )
    {
        this.local_csvQuote = _csvQuote;
    }
    public String getCsvQuote( )
    {
        return this.local_csvQuote;
    }
    public void setCsvTerminate( String _csvTerminate )
    {
        this.local_csvTerminate = _csvTerminate;
    }
    public String getCsvTerminate( )
    {
        return this.local_csvTerminate;
    }
    public void setCsvEscape( String _csvEscape )
    {
        this.local_csvEscape = _csvEscape;
    }
    public String getCsvEscape( )
    {
        return this.local_csvEscape;
    }
    public void setModified( String _modified )
    {
        this.local_modified = _modified;
    }
    public String getModified( )
    {
        return this.local_modified;
    }
    public void setEcl( String _ecl )
    {
        this.local_ecl = _ecl;
    }
    public String getEcl( )
    {
        return this.local_ecl;
    }
    public void setStat( DFUFileStatWrapper _stat )
    {
        this.local_stat = _stat;
    }
    public DFUFileStatWrapper getStat( )
    {
        return this.local_stat;
    }
    public void setDFUFilePartsOnClusters( ArrayOfDFUFilePartsOnClusterWrapper _dFUFilePartsOnClusters )
    {
        this.local_dFUFilePartsOnClusters = _dFUFilePartsOnClusters;
    }
    public ArrayOfDFUFilePartsOnClusterWrapper getDFUFilePartsOnClusters( )
    {
        return this.local_dFUFilePartsOnClusters;
    }
    public void setIsSuperfile( boolean _isSuperfile )
    {
        this.local_isSuperfile = _isSuperfile;
    }
    public boolean getIsSuperfile( )
    {
        return this.local_isSuperfile;
    }
    public void setShowFileContent( boolean _showFileContent )
    {
        this.local_showFileContent = _showFileContent;
    }
    public boolean getShowFileContent( )
    {
        return this.local_showFileContent;
    }
    public void setSubfiles( List<String> _subfiles )
    {
        this.local_subfiles = _subfiles;
    }
    public List<String> getSubfiles( )
    {
        return this.local_subfiles;
    }
    public void setSuperfiles( ArrayOfDFULogicalFileWrapper _superfiles )
    {
        this.local_superfiles = _superfiles;
    }
    public ArrayOfDFULogicalFileWrapper getSuperfiles( )
    {
        return this.local_superfiles;
    }
    public void setProtectList( ArrayOfDFUFileProtectWrapper _protectList )
    {
        this.local_protectList = _protectList;
    }
    public ArrayOfDFUFileProtectWrapper getProtectList( )
    {
        return this.local_protectList;
    }
    public void setFromRoxieCluster( boolean _fromRoxieCluster )
    {
        this.local_fromRoxieCluster = _fromRoxieCluster;
    }
    public boolean getFromRoxieCluster( )
    {
        return this.local_fromRoxieCluster;
    }
    public void setGraphs( Graphs_type0Wrapper _graphs )
    {
        this.local_graphs = _graphs;
    }
    public Graphs_type0Wrapper getGraphs( )
    {
        return this.local_graphs;
    }
    public void setUserPermission( String _userPermission )
    {
        this.local_userPermission = _userPermission;
    }
    public String getUserPermission( )
    {
        return this.local_userPermission;
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
    public void setPercentCompressed( String _percentCompressed )
    {
        this.local_percentCompressed = _percentCompressed;
    }
    public String getPercentCompressed( )
    {
        return this.local_percentCompressed;
    }
    public void setIsCompressed( boolean _isCompressed )
    {
        this.local_isCompressed = _isCompressed;
    }
    public boolean getIsCompressed( )
    {
        return this.local_isCompressed;
    }
    public void setIsRestricted( boolean _isRestricted )
    {
        this.local_isRestricted = _isRestricted;
    }
    public boolean getIsRestricted( )
    {
        return this.local_isRestricted;
    }
    public void setBrowseData( boolean _browseData )
    {
        this.local_browseData = _browseData;
    }
    public boolean getBrowseData( )
    {
        return this.local_browseData;
    }
    public void setJsonInfo( String _jsonInfo )
    {
        this.local_jsonInfo = _jsonInfo;
    }
    public String getJsonInfo( )
    {
        return this.local_jsonInfo;
    }
    public void setBinInfo( DataHandler _binInfo )
    {
        this.local_binInfo = _binInfo;
    }
    public DataHandler getBinInfo( )
    {
        return this.local_binInfo;
    }
    public void setPackageID( String _packageID )
    {
        this.local_packageID = _packageID;
    }
    public String getPackageID( )
    {
        return this.local_packageID;
    }
    public void setPartition( DFUFilePartitionWrapper _partition )
    {
        this.local_partition = _partition;
    }
    public DFUFilePartitionWrapper getPartition( )
    {
        return this.local_partition;
    }
    public void setBlooms( ArrayOfDFUFileBloomWrapper _blooms )
    {
        this.local_blooms = _blooms;
    }
    public ArrayOfDFUFileBloomWrapper getBlooms( )
    {
        return this.local_blooms;
    }
    public void setExpireDays( int _expireDays )
    {
        this.local_expireDays = _expireDays;
    }
    public int getExpireDays( )
    {
        return this.local_expireDays;
    }
    public void setKeyType( String _keyType )
    {
        this.local_keyType = _keyType;
    }
    public String getKeyType( )
    {
        return this.local_keyType;
    }
    public void setAtRestCost( double _atRestCost )
    {
        this.local_atRestCost = _atRestCost;
    }
    public double getAtRestCost( )
    {
        return this.local_atRestCost;
    }
    public void setAccessCost( double _accessCost )
    {
        this.local_accessCost = _accessCost;
    }
    public double getAccessCost( )
    {
        return this.local_accessCost;
    }
    public void setExpirationDate( String _expirationDate )
    {
        this.local_expirationDate = _expirationDate;
    }
    public String getExpirationDate( )
    {
        return this.local_expirationDate;
    }
    public void setExtendedIndexInfo( DFUIndexInfoWrapper _extendedIndexInfo )
    {
        this.local_extendedIndexInfo = _extendedIndexInfo;
    }
    public DFUIndexInfoWrapper getExtendedIndexInfo( )
    {
        return this.local_extendedIndexInfo;
    }
}