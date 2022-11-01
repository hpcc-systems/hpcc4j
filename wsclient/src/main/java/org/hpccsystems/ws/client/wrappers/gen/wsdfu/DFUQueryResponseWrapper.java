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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.906Z
 */
public class DFUQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfDFULogicalFileWrapper local_dFULogicalFiles;
    protected String local_prefix;
    protected String local_nodeGroup;
    protected String local_logicalName;
    protected String local_description;
    protected String local_owner;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_fileType;
    protected long local_fileSizeFrom;
    protected long local_fileSizeTo;
    protected int local_firstN;
    protected int local_pageSize;
    protected long local_pageStartFrom;
    protected long local_lastPageFrom;
    protected long local_pageEndAt;
    protected long local_prevPageFrom;
    protected long local_nextPageFrom;
    protected long local_numFiles;
    protected String local_sortby;
    protected boolean local_descending;
    protected String local_basicQuery;
    protected String local_parametersForPaging;
    protected String local_filters;
    protected long local_cacheHint;
    protected boolean local_isSubsetOfFiles;
    protected String local_warning;

    public DFUQueryResponseWrapper() {}

    public DFUQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse dfuqueryresponse)
    {
        copy( dfuqueryresponse );
    }
    public DFUQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfDFULogicalFileWrapper _dFULogicalFiles, String _prefix, String _nodeGroup, String _logicalName, String _description, String _owner, String _startDate, String _endDate, String _fileType, long _fileSizeFrom, long _fileSizeTo, int _firstN, int _pageSize, long _pageStartFrom, long _lastPageFrom, long _pageEndAt, long _prevPageFrom, long _nextPageFrom, long _numFiles, String _sortby, boolean _descending, String _basicQuery, String _parametersForPaging, String _filters, long _cacheHint, boolean _isSubsetOfFiles, String _warning )
    {
        this.local_exceptions = _exceptions;
        this.local_dFULogicalFiles = _dFULogicalFiles;
        this.local_prefix = _prefix;
        this.local_nodeGroup = _nodeGroup;
        this.local_logicalName = _logicalName;
        this.local_description = _description;
        this.local_owner = _owner;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_fileType = _fileType;
        this.local_fileSizeFrom = _fileSizeFrom;
        this.local_fileSizeTo = _fileSizeTo;
        this.local_firstN = _firstN;
        this.local_pageSize = _pageSize;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_lastPageFrom = _lastPageFrom;
        this.local_pageEndAt = _pageEndAt;
        this.local_prevPageFrom = _prevPageFrom;
        this.local_nextPageFrom = _nextPageFrom;
        this.local_numFiles = _numFiles;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_basicQuery = _basicQuery;
        this.local_parametersForPaging = _parametersForPaging;
        this.local_filters = _filters;
        this.local_cacheHint = _cacheHint;
        this.local_isSubsetOfFiles = _isSubsetOfFiles;
        this.local_warning = _warning;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getDFULogicalFiles() != null)
            this.local_dFULogicalFiles = new ArrayOfDFULogicalFileWrapper( raw.getDFULogicalFiles());
        this.local_prefix = raw.getPrefix();
        this.local_nodeGroup = raw.getNodeGroup();
        this.local_logicalName = raw.getLogicalName();
        this.local_description = raw.getDescription();
        this.local_owner = raw.getOwner();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_fileType = raw.getFileType();
        this.local_fileSizeFrom = raw.getFileSizeFrom();
        this.local_fileSizeTo = raw.getFileSizeTo();
        this.local_firstN = raw.getFirstN();
        this.local_pageSize = raw.getPageSize();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_lastPageFrom = raw.getLastPageFrom();
        this.local_pageEndAt = raw.getPageEndAt();
        this.local_prevPageFrom = raw.getPrevPageFrom();
        this.local_nextPageFrom = raw.getNextPageFrom();
        this.local_numFiles = raw.getNumFiles();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_basicQuery = raw.getBasicQuery();
        this.local_parametersForPaging = raw.getParametersForPaging();
        this.local_filters = raw.getFilters();
        this.local_cacheHint = raw.getCacheHint();
        this.local_isSubsetOfFiles = raw.getIsSubsetOfFiles();
        this.local_warning = raw.getWarning();

    }

    @Override
    public String toString()
    {
        return "DFUQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "dFULogicalFiles = " + local_dFULogicalFiles + ", " + "prefix = " + local_prefix + ", " + "nodeGroup = " + local_nodeGroup + ", " + "logicalName = " + local_logicalName + ", " + "description = " + local_description + ", " + "owner = " + local_owner + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "fileType = " + local_fileType + ", " + "fileSizeFrom = " + local_fileSizeFrom + ", " + "fileSizeTo = " + local_fileSizeTo + ", " + "firstN = " + local_firstN + ", " + "pageSize = " + local_pageSize + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "lastPageFrom = " + local_lastPageFrom + ", " + "pageEndAt = " + local_pageEndAt + ", " + "prevPageFrom = " + local_prevPageFrom + ", " + "nextPageFrom = " + local_nextPageFrom + ", " + "numFiles = " + local_numFiles + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "basicQuery = " + local_basicQuery + ", " + "parametersForPaging = " + local_parametersForPaging + ", " + "filters = " + local_filters + ", " + "cacheHint = " + local_cacheHint + ", " + "isSubsetOfFiles = " + local_isSubsetOfFiles + ", " + "warning = " + local_warning + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setDFULogicalFiles( local_dFULogicalFiles.getRaw());
        raw.setPrefix( local_prefix);
        raw.setNodeGroup( local_nodeGroup);
        raw.setLogicalName( local_logicalName);
        raw.setDescription( local_description);
        raw.setOwner( local_owner);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setFileType( local_fileType);
        raw.setFileSizeFrom( local_fileSizeFrom);
        raw.setFileSizeTo( local_fileSizeTo);
        raw.setFirstN( local_firstN);
        raw.setPageSize( local_pageSize);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setLastPageFrom( local_lastPageFrom);
        raw.setPageEndAt( local_pageEndAt);
        raw.setPrevPageFrom( local_prevPageFrom);
        raw.setNextPageFrom( local_nextPageFrom);
        raw.setNumFiles( local_numFiles);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setBasicQuery( local_basicQuery);
        raw.setParametersForPaging( local_parametersForPaging);
        raw.setFilters( local_filters);
        raw.setCacheHint( local_cacheHint);
        raw.setIsSubsetOfFiles( local_isSubsetOfFiles);
        raw.setWarning( local_warning);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setDFULogicalFiles( ArrayOfDFULogicalFileWrapper _dFULogicalFiles )
    {
        this.local_dFULogicalFiles = _dFULogicalFiles;
    }
    public ArrayOfDFULogicalFileWrapper getDFULogicalFiles( )
    {
        return this.local_dFULogicalFiles;
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
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setStartDate( String _startDate )
    {
        this.local_startDate = _startDate;
    }
    public String getStartDate( )
    {
        return this.local_startDate;
    }
    public void setEndDate( String _endDate )
    {
        this.local_endDate = _endDate;
    }
    public String getEndDate( )
    {
        return this.local_endDate;
    }
    public void setFileType( String _fileType )
    {
        this.local_fileType = _fileType;
    }
    public String getFileType( )
    {
        return this.local_fileType;
    }
    public void setFileSizeFrom( long _fileSizeFrom )
    {
        this.local_fileSizeFrom = _fileSizeFrom;
    }
    public long getFileSizeFrom( )
    {
        return this.local_fileSizeFrom;
    }
    public void setFileSizeTo( long _fileSizeTo )
    {
        this.local_fileSizeTo = _fileSizeTo;
    }
    public long getFileSizeTo( )
    {
        return this.local_fileSizeTo;
    }
    public void setFirstN( int _firstN )
    {
        this.local_firstN = _firstN;
    }
    public int getFirstN( )
    {
        return this.local_firstN;
    }
    public void setPageSize( int _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public int getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setPageStartFrom( long _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public long getPageStartFrom( )
    {
        return this.local_pageStartFrom;
    }
    public void setLastPageFrom( long _lastPageFrom )
    {
        this.local_lastPageFrom = _lastPageFrom;
    }
    public long getLastPageFrom( )
    {
        return this.local_lastPageFrom;
    }
    public void setPageEndAt( long _pageEndAt )
    {
        this.local_pageEndAt = _pageEndAt;
    }
    public long getPageEndAt( )
    {
        return this.local_pageEndAt;
    }
    public void setPrevPageFrom( long _prevPageFrom )
    {
        this.local_prevPageFrom = _prevPageFrom;
    }
    public long getPrevPageFrom( )
    {
        return this.local_prevPageFrom;
    }
    public void setNextPageFrom( long _nextPageFrom )
    {
        this.local_nextPageFrom = _nextPageFrom;
    }
    public long getNextPageFrom( )
    {
        return this.local_nextPageFrom;
    }
    public void setNumFiles( long _numFiles )
    {
        this.local_numFiles = _numFiles;
    }
    public long getNumFiles( )
    {
        return this.local_numFiles;
    }
    public void setSortby( String _sortby )
    {
        this.local_sortby = _sortby;
    }
    public String getSortby( )
    {
        return this.local_sortby;
    }
    public void setDescending( boolean _descending )
    {
        this.local_descending = _descending;
    }
    public boolean getDescending( )
    {
        return this.local_descending;
    }
    public void setBasicQuery( String _basicQuery )
    {
        this.local_basicQuery = _basicQuery;
    }
    public String getBasicQuery( )
    {
        return this.local_basicQuery;
    }
    public void setParametersForPaging( String _parametersForPaging )
    {
        this.local_parametersForPaging = _parametersForPaging;
    }
    public String getParametersForPaging( )
    {
        return this.local_parametersForPaging;
    }
    public void setFilters( String _filters )
    {
        this.local_filters = _filters;
    }
    public String getFilters( )
    {
        return this.local_filters;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setIsSubsetOfFiles( boolean _isSubsetOfFiles )
    {
        this.local_isSubsetOfFiles = _isSubsetOfFiles;
    }
    public boolean getIsSubsetOfFiles( )
    {
        return this.local_isSubsetOfFiles;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
}