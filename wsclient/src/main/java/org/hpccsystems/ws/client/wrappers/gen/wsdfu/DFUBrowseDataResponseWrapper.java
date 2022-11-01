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
 * Class name: DFUBrowseDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.860Z
 */
public class DFUBrowseDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_name;
    protected String local_logicalName;
    protected String local_filterBy;
    protected String local_filterForGoBack;
    protected ColumnsHidden_type0Wrapper local_columnsHidden;
    protected int local_columnCount;
    protected long local_startForGoback;
    protected int local_countForGoback;
    protected int local_chooseFile;
    protected boolean local_schemaOnly;
    protected String local_cluster;
    protected String local_clusterType;
    protected String local_parentName;
    protected long local_start;
    protected long local_count;
    protected long local_pageSize;
    protected long local_total;
    protected String local_result;
    protected String local_msgToDisplay;
    protected boolean local_disableUppercaseTranslation;

    public DFUBrowseDataResponseWrapper() {}

    public DFUBrowseDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse dfubrowsedataresponse)
    {
        copy( dfubrowsedataresponse );
    }
    public DFUBrowseDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _logicalName, String _filterBy, String _filterForGoBack, ColumnsHidden_type0Wrapper _columnsHidden, int _columnCount, long _startForGoback, int _countForGoback, int _chooseFile, boolean _schemaOnly, String _cluster, String _clusterType, String _parentName, long _start, long _count, long _pageSize, long _total, String _result, String _msgToDisplay, boolean _disableUppercaseTranslation )
    {
        this.local_exceptions = _exceptions;
        this.local_name = _name;
        this.local_logicalName = _logicalName;
        this.local_filterBy = _filterBy;
        this.local_filterForGoBack = _filterForGoBack;
        this.local_columnsHidden = _columnsHidden;
        this.local_columnCount = _columnCount;
        this.local_startForGoback = _startForGoback;
        this.local_countForGoback = _countForGoback;
        this.local_chooseFile = _chooseFile;
        this.local_schemaOnly = _schemaOnly;
        this.local_cluster = _cluster;
        this.local_clusterType = _clusterType;
        this.local_parentName = _parentName;
        this.local_start = _start;
        this.local_count = _count;
        this.local_pageSize = _pageSize;
        this.local_total = _total;
        this.local_result = _result;
        this.local_msgToDisplay = _msgToDisplay;
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_name = raw.getName();
        this.local_logicalName = raw.getLogicalName();
        this.local_filterBy = raw.getFilterBy();
        this.local_filterForGoBack = raw.getFilterForGoBack();
        if (raw.getColumnsHidden() != null)
            this.local_columnsHidden = new ColumnsHidden_type0Wrapper( raw.getColumnsHidden());
        this.local_columnCount = raw.getColumnCount();
        this.local_startForGoback = raw.getStartForGoback();
        this.local_countForGoback = raw.getCountForGoback();
        this.local_chooseFile = raw.getChooseFile();
        this.local_schemaOnly = raw.getSchemaOnly();
        this.local_cluster = raw.getCluster();
        this.local_clusterType = raw.getClusterType();
        this.local_parentName = raw.getParentName();
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();
        this.local_pageSize = raw.getPageSize();
        this.local_total = raw.getTotal();
        this.local_result = raw.getResult();
        this.local_msgToDisplay = raw.getMsgToDisplay();
        this.local_disableUppercaseTranslation = raw.getDisableUppercaseTranslation();

    }

    @Override
    public String toString()
    {
        return "DFUBrowseDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "logicalName = " + local_logicalName + ", " + "filterBy = " + local_filterBy + ", " + "filterForGoBack = " + local_filterForGoBack + ", " + "columnsHidden = " + local_columnsHidden + ", " + "columnCount = " + local_columnCount + ", " + "startForGoback = " + local_startForGoback + ", " + "countForGoback = " + local_countForGoback + ", " + "chooseFile = " + local_chooseFile + ", " + "schemaOnly = " + local_schemaOnly + ", " + "cluster = " + local_cluster + ", " + "clusterType = " + local_clusterType + ", " + "parentName = " + local_parentName + ", " + "start = " + local_start + ", " + "count = " + local_count + ", " + "pageSize = " + local_pageSize + ", " + "total = " + local_total + ", " + "result = " + local_result + ", " + "msgToDisplay = " + local_msgToDisplay + ", " + "disableUppercaseTranslation = " + local_disableUppercaseTranslation + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setName( local_name);
        raw.setLogicalName( local_logicalName);
        raw.setFilterBy( local_filterBy);
        raw.setFilterForGoBack( local_filterForGoBack);
        raw.setColumnsHidden( local_columnsHidden.getRaw());
        raw.setColumnCount( local_columnCount);
        raw.setStartForGoback( local_startForGoback);
        raw.setCountForGoback( local_countForGoback);
        raw.setChooseFile( local_chooseFile);
        raw.setSchemaOnly( local_schemaOnly);
        raw.setCluster( local_cluster);
        raw.setClusterType( local_clusterType);
        raw.setParentName( local_parentName);
        raw.setStart( local_start);
        raw.setCount( local_count);
        raw.setPageSize( local_pageSize);
        raw.setTotal( local_total);
        raw.setResult( local_result);
        raw.setMsgToDisplay( local_msgToDisplay);
        raw.setDisableUppercaseTranslation( local_disableUppercaseTranslation);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setFilterBy( String _filterBy )
    {
        this.local_filterBy = _filterBy;
    }
    public String getFilterBy( )
    {
        return this.local_filterBy;
    }
    public void setFilterForGoBack( String _filterForGoBack )
    {
        this.local_filterForGoBack = _filterForGoBack;
    }
    public String getFilterForGoBack( )
    {
        return this.local_filterForGoBack;
    }
    public void setColumnsHidden( ColumnsHidden_type0Wrapper _columnsHidden )
    {
        this.local_columnsHidden = _columnsHidden;
    }
    public ColumnsHidden_type0Wrapper getColumnsHidden( )
    {
        return this.local_columnsHidden;
    }
    public void setColumnCount( int _columnCount )
    {
        this.local_columnCount = _columnCount;
    }
    public int getColumnCount( )
    {
        return this.local_columnCount;
    }
    public void setStartForGoback( long _startForGoback )
    {
        this.local_startForGoback = _startForGoback;
    }
    public long getStartForGoback( )
    {
        return this.local_startForGoback;
    }
    public void setCountForGoback( int _countForGoback )
    {
        this.local_countForGoback = _countForGoback;
    }
    public int getCountForGoback( )
    {
        return this.local_countForGoback;
    }
    public void setChooseFile( int _chooseFile )
    {
        this.local_chooseFile = _chooseFile;
    }
    public int getChooseFile( )
    {
        return this.local_chooseFile;
    }
    public void setSchemaOnly( boolean _schemaOnly )
    {
        this.local_schemaOnly = _schemaOnly;
    }
    public boolean getSchemaOnly( )
    {
        return this.local_schemaOnly;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setClusterType( String _clusterType )
    {
        this.local_clusterType = _clusterType;
    }
    public String getClusterType( )
    {
        return this.local_clusterType;
    }
    public void setParentName( String _parentName )
    {
        this.local_parentName = _parentName;
    }
    public String getParentName( )
    {
        return this.local_parentName;
    }
    public void setStart( long _start )
    {
        this.local_start = _start;
    }
    public long getStart( )
    {
        return this.local_start;
    }
    public void setCount( long _count )
    {
        this.local_count = _count;
    }
    public long getCount( )
    {
        return this.local_count;
    }
    public void setPageSize( long _pageSize )
    {
        this.local_pageSize = _pageSize;
    }
    public long getPageSize( )
    {
        return this.local_pageSize;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
    public void setMsgToDisplay( String _msgToDisplay )
    {
        this.local_msgToDisplay = _msgToDisplay;
    }
    public String getMsgToDisplay( )
    {
        return this.local_msgToDisplay;
    }
    public void setDisableUppercaseTranslation( boolean _disableUppercaseTranslation )
    {
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;
    }
    public boolean getDisableUppercaseTranslation( )
    {
        return this.local_disableUppercaseTranslation;
    }
}