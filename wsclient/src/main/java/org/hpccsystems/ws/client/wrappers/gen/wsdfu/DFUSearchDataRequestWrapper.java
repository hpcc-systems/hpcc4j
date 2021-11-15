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
 * Class name: DFUSearchDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.304Z
 */
public class DFUSearchDataRequestWrapper
{
    protected String local_cluster;
    protected String local_clusterType;
    protected String local_openLogicalName;
    protected String local_filterBy;
    protected String local_showColumns;
    protected int local_chooseFile;
    protected long local_startIndex;
    protected long local_endIndex;
    protected String local_logicalName;
    protected String local_parentName;
    protected long local_startForGoback;
    protected int local_countForGoback;
    protected long local_start;
    protected int local_count;
    protected String local_file;
    protected String local_key;
    protected boolean local_schemaOnly;
    protected boolean local_roxieSelections;
    protected boolean local_disableUppercaseTranslation;
    protected String local_selectedKey;

    public DFUSearchDataRequestWrapper() {}

    public DFUSearchDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest dfusearchdatarequest)
    {
        copy( dfusearchdatarequest );
    }
    public DFUSearchDataRequestWrapper( String _cluster, String _clusterType, String _openLogicalName, String _filterBy, String _showColumns, int _chooseFile, long _startIndex, long _endIndex, String _logicalName, String _parentName, long _startForGoback, int _countForGoback, long _start, int _count, String _file, String _key, boolean _schemaOnly, boolean _roxieSelections, boolean _disableUppercaseTranslation, String _selectedKey )
    {
        this.local_cluster = _cluster;
        this.local_clusterType = _clusterType;
        this.local_openLogicalName = _openLogicalName;
        this.local_filterBy = _filterBy;
        this.local_showColumns = _showColumns;
        this.local_chooseFile = _chooseFile;
        this.local_startIndex = _startIndex;
        this.local_endIndex = _endIndex;
        this.local_logicalName = _logicalName;
        this.local_parentName = _parentName;
        this.local_startForGoback = _startForGoback;
        this.local_countForGoback = _countForGoback;
        this.local_start = _start;
        this.local_count = _count;
        this.local_file = _file;
        this.local_key = _key;
        this.local_schemaOnly = _schemaOnly;
        this.local_roxieSelections = _roxieSelections;
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;
        this.local_selectedKey = _selectedKey;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_clusterType = raw.getClusterType();
        this.local_openLogicalName = raw.getOpenLogicalName();
        this.local_filterBy = raw.getFilterBy();
        this.local_showColumns = raw.getShowColumns();
        this.local_chooseFile = raw.getChooseFile();
        this.local_startIndex = raw.getStartIndex();
        this.local_endIndex = raw.getEndIndex();
        this.local_logicalName = raw.getLogicalName();
        this.local_parentName = raw.getParentName();
        this.local_startForGoback = raw.getStartForGoback();
        this.local_countForGoback = raw.getCountForGoback();
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();
        this.local_file = raw.getFile();
        this.local_key = raw.getKey();
        this.local_schemaOnly = raw.getSchemaOnly();
        this.local_roxieSelections = raw.getRoxieSelections();
        this.local_disableUppercaseTranslation = raw.getDisableUppercaseTranslation();
        this.local_selectedKey = raw.getSelectedKey();

    }

    @Override
    public String toString()
    {
        return "DFUSearchDataRequestWrapper [" + "cluster = " + local_cluster + ", " + "clusterType = " + local_clusterType + ", " + "openLogicalName = " + local_openLogicalName + ", " + "filterBy = " + local_filterBy + ", " + "showColumns = " + local_showColumns + ", " + "chooseFile = " + local_chooseFile + ", " + "startIndex = " + local_startIndex + ", " + "endIndex = " + local_endIndex + ", " + "logicalName = " + local_logicalName + ", " + "parentName = " + local_parentName + ", " + "startForGoback = " + local_startForGoback + ", " + "countForGoback = " + local_countForGoback + ", " + "start = " + local_start + ", " + "count = " + local_count + ", " + "file = " + local_file + ", " + "key = " + local_key + ", " + "schemaOnly = " + local_schemaOnly + ", " + "roxieSelections = " + local_roxieSelections + ", " + "disableUppercaseTranslation = " + local_disableUppercaseTranslation + ", " + "selectedKey = " + local_selectedKey + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchDataRequest();
        raw.setCluster( local_cluster);
        raw.setClusterType( local_clusterType);
        raw.setOpenLogicalName( local_openLogicalName);
        raw.setFilterBy( local_filterBy);
        raw.setShowColumns( local_showColumns);
        raw.setChooseFile( local_chooseFile);
        raw.setStartIndex( local_startIndex);
        raw.setEndIndex( local_endIndex);
        raw.setLogicalName( local_logicalName);
        raw.setParentName( local_parentName);
        raw.setStartForGoback( local_startForGoback);
        raw.setCountForGoback( local_countForGoback);
        raw.setStart( local_start);
        raw.setCount( local_count);
        raw.setFile( local_file);
        raw.setKey( local_key);
        raw.setSchemaOnly( local_schemaOnly);
        raw.setRoxieSelections( local_roxieSelections);
        raw.setDisableUppercaseTranslation( local_disableUppercaseTranslation);
        raw.setSelectedKey( local_selectedKey);
        return raw;
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
    public void setOpenLogicalName( String _openLogicalName )
    {
        this.local_openLogicalName = _openLogicalName;
    }
    public String getOpenLogicalName( )
    {
        return this.local_openLogicalName;
    }
    public void setFilterBy( String _filterBy )
    {
        this.local_filterBy = _filterBy;
    }
    public String getFilterBy( )
    {
        return this.local_filterBy;
    }
    public void setShowColumns( String _showColumns )
    {
        this.local_showColumns = _showColumns;
    }
    public String getShowColumns( )
    {
        return this.local_showColumns;
    }
    public void setChooseFile( int _chooseFile )
    {
        this.local_chooseFile = _chooseFile;
    }
    public int getChooseFile( )
    {
        return this.local_chooseFile;
    }
    public void setStartIndex( long _startIndex )
    {
        this.local_startIndex = _startIndex;
    }
    public long getStartIndex( )
    {
        return this.local_startIndex;
    }
    public void setEndIndex( long _endIndex )
    {
        this.local_endIndex = _endIndex;
    }
    public long getEndIndex( )
    {
        return this.local_endIndex;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setParentName( String _parentName )
    {
        this.local_parentName = _parentName;
    }
    public String getParentName( )
    {
        return this.local_parentName;
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
    public void setStart( long _start )
    {
        this.local_start = _start;
    }
    public long getStart( )
    {
        return this.local_start;
    }
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
    }
    public void setFile( String _file )
    {
        this.local_file = _file;
    }
    public String getFile( )
    {
        return this.local_file;
    }
    public void setKey( String _key )
    {
        this.local_key = _key;
    }
    public String getKey( )
    {
        return this.local_key;
    }
    public void setSchemaOnly( boolean _schemaOnly )
    {
        this.local_schemaOnly = _schemaOnly;
    }
    public boolean getSchemaOnly( )
    {
        return this.local_schemaOnly;
    }
    public void setRoxieSelections( boolean _roxieSelections )
    {
        this.local_roxieSelections = _roxieSelections;
    }
    public boolean getRoxieSelections( )
    {
        return this.local_roxieSelections;
    }
    public void setDisableUppercaseTranslation( boolean _disableUppercaseTranslation )
    {
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;
    }
    public boolean getDisableUppercaseTranslation( )
    {
        return this.local_disableUppercaseTranslation;
    }
    public void setSelectedKey( String _selectedKey )
    {
        this.local_selectedKey = _selectedKey;
    }
    public String getSelectedKey( )
    {
        return this.local_selectedKey;
    }
}