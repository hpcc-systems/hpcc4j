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
 * WrapperMaker version: 1.7
 * Class name: DFUQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * Service version: 1.64
 */
public class DFUQueryRequestWrapper
{
    protected String local_prefix;
    protected String local_nodeGroup;
    protected String local_contentType;
    protected boolean local_invertContent;
    protected String local_logicalName;
    protected String local_owner;
    protected String local_startDate;
    protected String local_endDate;
    protected String local_fileType;
    protected long local_fileSizeFrom;
    protected long local_fileSizeTo;
    protected int local_firstN;
    protected int local_pageSize;
    protected int local_pageStartFrom;
    protected String local_sortby;
    protected boolean local_descending;
    protected boolean local_oneLevelDirFileReturn;
    protected long local_cacheHint;
    protected int local_maxNumberOfFiles;
    protected boolean local_includeSuperOwner;
    protected String local_startAccessedTime;
    protected String local_endAccessedTime;
    protected long local_maxSkewFrom;
    protected long local_maxSkewTo;
    protected long local_minSkewFrom;
    protected long local_minSkewTo;

    public DFUQueryRequestWrapper() {}

    public DFUQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest dfuqueryrequest)
    {
        copy( dfuqueryrequest );
    }
    public DFUQueryRequestWrapper( String _prefix, String _nodeGroup, String _contentType, boolean _invertContent, String _logicalName, String _owner, String _startDate, String _endDate, String _fileType, long _fileSizeFrom, long _fileSizeTo, int _firstN, int _pageSize, int _pageStartFrom, String _sortby, boolean _descending, boolean _oneLevelDirFileReturn, long _cacheHint, int _maxNumberOfFiles, boolean _includeSuperOwner, String _startAccessedTime, String _endAccessedTime, long _maxSkewFrom, long _maxSkewTo, long _minSkewFrom, long _minSkewTo )
    {
        this.local_prefix = _prefix;
        this.local_nodeGroup = _nodeGroup;
        this.local_contentType = _contentType;
        this.local_invertContent = _invertContent;
        this.local_logicalName = _logicalName;
        this.local_owner = _owner;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_fileType = _fileType;
        this.local_fileSizeFrom = _fileSizeFrom;
        this.local_fileSizeTo = _fileSizeTo;
        this.local_firstN = _firstN;
        this.local_pageSize = _pageSize;
        this.local_pageStartFrom = _pageStartFrom;
        this.local_sortby = _sortby;
        this.local_descending = _descending;
        this.local_oneLevelDirFileReturn = _oneLevelDirFileReturn;
        this.local_cacheHint = _cacheHint;
        this.local_maxNumberOfFiles = _maxNumberOfFiles;
        this.local_includeSuperOwner = _includeSuperOwner;
        this.local_startAccessedTime = _startAccessedTime;
        this.local_endAccessedTime = _endAccessedTime;
        this.local_maxSkewFrom = _maxSkewFrom;
        this.local_maxSkewTo = _maxSkewTo;
        this.local_minSkewFrom = _minSkewFrom;
        this.local_minSkewTo = _minSkewTo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_prefix = raw.getPrefix();
        this.local_nodeGroup = raw.getNodeGroup();
        this.local_contentType = raw.getContentType();
        this.local_invertContent = raw.getInvertContent();
        this.local_logicalName = raw.getLogicalName();
        this.local_owner = raw.getOwner();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_fileType = raw.getFileType();
        this.local_fileSizeFrom = raw.getFileSizeFrom();
        this.local_fileSizeTo = raw.getFileSizeTo();
        this.local_firstN = raw.getFirstN();
        this.local_pageSize = raw.getPageSize();
        this.local_pageStartFrom = raw.getPageStartFrom();
        this.local_sortby = raw.getSortby();
        this.local_descending = raw.getDescending();
        this.local_oneLevelDirFileReturn = raw.getOneLevelDirFileReturn();
        this.local_cacheHint = raw.getCacheHint();
        this.local_maxNumberOfFiles = raw.getMaxNumberOfFiles();
        this.local_includeSuperOwner = raw.getIncludeSuperOwner();
        this.local_startAccessedTime = raw.getStartAccessedTime();
        this.local_endAccessedTime = raw.getEndAccessedTime();
        this.local_maxSkewFrom = raw.getMaxSkewFrom();
        this.local_maxSkewTo = raw.getMaxSkewTo();
        this.local_minSkewFrom = raw.getMinSkewFrom();
        this.local_minSkewTo = raw.getMinSkewTo();

    }

    @Override
    public String toString()
    {
        return "DFUQueryRequestWrapper [" + "prefix = " + local_prefix + ", " + "nodeGroup = " + local_nodeGroup + ", " + "contentType = " + local_contentType + ", " + "invertContent = " + local_invertContent + ", " + "logicalName = " + local_logicalName + ", " + "owner = " + local_owner + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "fileType = " + local_fileType + ", " + "fileSizeFrom = " + local_fileSizeFrom + ", " + "fileSizeTo = " + local_fileSizeTo + ", " + "firstN = " + local_firstN + ", " + "pageSize = " + local_pageSize + ", " + "pageStartFrom = " + local_pageStartFrom + ", " + "sortby = " + local_sortby + ", " + "descending = " + local_descending + ", " + "oneLevelDirFileReturn = " + local_oneLevelDirFileReturn + ", " + "cacheHint = " + local_cacheHint + ", " + "maxNumberOfFiles = " + local_maxNumberOfFiles + ", " + "includeSuperOwner = " + local_includeSuperOwner + ", " + "startAccessedTime = " + local_startAccessedTime + ", " + "endAccessedTime = " + local_endAccessedTime + ", " + "maxSkewFrom = " + local_maxSkewFrom + ", " + "maxSkewTo = " + local_maxSkewTo + ", " + "minSkewFrom = " + local_minSkewFrom + ", " + "minSkewTo = " + local_minSkewTo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUQueryRequest();
        raw.setPrefix( local_prefix);
        raw.setNodeGroup( local_nodeGroup);
        raw.setContentType( local_contentType);
        raw.setInvertContent( local_invertContent);
        raw.setLogicalName( local_logicalName);
        raw.setOwner( local_owner);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setFileType( local_fileType);
        raw.setFileSizeFrom( local_fileSizeFrom);
        raw.setFileSizeTo( local_fileSizeTo);
        raw.setFirstN( local_firstN);
        raw.setPageSize( local_pageSize);
        raw.setPageStartFrom( local_pageStartFrom);
        raw.setSortby( local_sortby);
        raw.setDescending( local_descending);
        raw.setOneLevelDirFileReturn( local_oneLevelDirFileReturn);
        raw.setCacheHint( local_cacheHint);
        raw.setMaxNumberOfFiles( local_maxNumberOfFiles);
        raw.setIncludeSuperOwner( local_includeSuperOwner);
        raw.setStartAccessedTime( local_startAccessedTime);
        raw.setEndAccessedTime( local_endAccessedTime);
        raw.setMaxSkewFrom( local_maxSkewFrom);
        raw.setMaxSkewTo( local_maxSkewTo);
        raw.setMinSkewFrom( local_minSkewFrom);
        raw.setMinSkewTo( local_minSkewTo);
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
    public void setContentType( String _contentType )
    {
        this.local_contentType = _contentType;
    }
    public String getContentType( )
    {
        return this.local_contentType;
    }
    public void setInvertContent( boolean _invertContent )
    {
        this.local_invertContent = _invertContent;
    }
    public boolean getInvertContent( )
    {
        return this.local_invertContent;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
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
    public void setPageStartFrom( int _pageStartFrom )
    {
        this.local_pageStartFrom = _pageStartFrom;
    }
    public int getPageStartFrom( )
    {
        return this.local_pageStartFrom;
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
    public void setOneLevelDirFileReturn( boolean _oneLevelDirFileReturn )
    {
        this.local_oneLevelDirFileReturn = _oneLevelDirFileReturn;
    }
    public boolean getOneLevelDirFileReturn( )
    {
        return this.local_oneLevelDirFileReturn;
    }
    public void setCacheHint( long _cacheHint )
    {
        this.local_cacheHint = _cacheHint;
    }
    public long getCacheHint( )
    {
        return this.local_cacheHint;
    }
    public void setMaxNumberOfFiles( int _maxNumberOfFiles )
    {
        this.local_maxNumberOfFiles = _maxNumberOfFiles;
    }
    public int getMaxNumberOfFiles( )
    {
        return this.local_maxNumberOfFiles;
    }
    public void setIncludeSuperOwner( boolean _includeSuperOwner )
    {
        this.local_includeSuperOwner = _includeSuperOwner;
    }
    public boolean getIncludeSuperOwner( )
    {
        return this.local_includeSuperOwner;
    }
    public void setStartAccessedTime( String _startAccessedTime )
    {
        this.local_startAccessedTime = _startAccessedTime;
    }
    public String getStartAccessedTime( )
    {
        return this.local_startAccessedTime;
    }
    public void setEndAccessedTime( String _endAccessedTime )
    {
        this.local_endAccessedTime = _endAccessedTime;
    }
    public String getEndAccessedTime( )
    {
        return this.local_endAccessedTime;
    }
    public void setMaxSkewFrom( long _maxSkewFrom )
    {
        this.local_maxSkewFrom = _maxSkewFrom;
    }
    public long getMaxSkewFrom( )
    {
        return this.local_maxSkewFrom;
    }
    public void setMaxSkewTo( long _maxSkewTo )
    {
        this.local_maxSkewTo = _maxSkewTo;
    }
    public long getMaxSkewTo( )
    {
        return this.local_maxSkewTo;
    }
    public void setMinSkewFrom( long _minSkewFrom )
    {
        this.local_minSkewFrom = _minSkewFrom;
    }
    public long getMinSkewFrom( )
    {
        return this.local_minSkewFrom;
    }
    public void setMinSkewTo( long _minSkewTo )
    {
        this.local_minSkewTo = _minSkewTo;
    }
    public long getMinSkewTo( )
    {
        return this.local_minSkewTo;
    }
}