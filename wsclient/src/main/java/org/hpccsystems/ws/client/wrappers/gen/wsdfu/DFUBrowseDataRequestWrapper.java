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
 * Class name: DFUBrowseDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.243Z
 */
public class DFUBrowseDataRequestWrapper
{
    protected String local_logicalName;
    protected String local_filterBy;
    protected String local_showColumns;
    protected boolean local_schemaOnly;
    protected long local_startForGoback;
    protected int local_countForGoback;
    protected int local_chooseFile;
    protected String local_cluster;
    protected String local_clusterType;
    protected String local_parentName;
    protected long local_start;
    protected int local_count;
    protected boolean local_disableUppercaseTranslation;

    public DFUBrowseDataRequestWrapper() {}

    public DFUBrowseDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest dfubrowsedatarequest)
    {
        copy( dfubrowsedatarequest );
    }
    public DFUBrowseDataRequestWrapper( String _logicalName, String _filterBy, String _showColumns, boolean _schemaOnly, long _startForGoback, int _countForGoback, int _chooseFile, String _cluster, String _clusterType, String _parentName, long _start, int _count, boolean _disableUppercaseTranslation )
    {
        this.local_logicalName = _logicalName;
        this.local_filterBy = _filterBy;
        this.local_showColumns = _showColumns;
        this.local_schemaOnly = _schemaOnly;
        this.local_startForGoback = _startForGoback;
        this.local_countForGoback = _countForGoback;
        this.local_chooseFile = _chooseFile;
        this.local_cluster = _cluster;
        this.local_clusterType = _clusterType;
        this.local_parentName = _parentName;
        this.local_start = _start;
        this.local_count = _count;
        this.local_disableUppercaseTranslation = _disableUppercaseTranslation;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest raw )
    {
        if (raw == null)
            return;

        this.local_logicalName = raw.getLogicalName();
        this.local_filterBy = raw.getFilterBy();
        this.local_showColumns = raw.getShowColumns();
        this.local_schemaOnly = raw.getSchemaOnly();
        this.local_startForGoback = raw.getStartForGoback();
        this.local_countForGoback = raw.getCountForGoback();
        this.local_chooseFile = raw.getChooseFile();
        this.local_cluster = raw.getCluster();
        this.local_clusterType = raw.getClusterType();
        this.local_parentName = raw.getParentName();
        this.local_start = raw.getStart();
        this.local_count = raw.getCount();
        this.local_disableUppercaseTranslation = raw.getDisableUppercaseTranslation();

    }

    @Override
    public String toString()
    {
        return "DFUBrowseDataRequestWrapper [" + "logicalName = " + local_logicalName + ", " + "filterBy = " + local_filterBy + ", " + "showColumns = " + local_showColumns + ", " + "schemaOnly = " + local_schemaOnly + ", " + "startForGoback = " + local_startForGoback + ", " + "countForGoback = " + local_countForGoback + ", " + "chooseFile = " + local_chooseFile + ", " + "cluster = " + local_cluster + ", " + "clusterType = " + local_clusterType + ", " + "parentName = " + local_parentName + ", " + "start = " + local_start + ", " + "count = " + local_count + ", " + "disableUppercaseTranslation = " + local_disableUppercaseTranslation + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUBrowseDataRequest();
        raw.setLogicalName( local_logicalName);
        raw.setFilterBy( local_filterBy);
        raw.setShowColumns( local_showColumns);
        raw.setSchemaOnly( local_schemaOnly);
        raw.setStartForGoback( local_startForGoback);
        raw.setCountForGoback( local_countForGoback);
        raw.setChooseFile( local_chooseFile);
        raw.setCluster( local_cluster);
        raw.setClusterType( local_clusterType);
        raw.setParentName( local_parentName);
        raw.setStart( local_start);
        raw.setCount( local_count);
        raw.setDisableUppercaseTranslation( local_disableUppercaseTranslation);
        return raw;
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
    public void setShowColumns( String _showColumns )
    {
        this.local_showColumns = _showColumns;
    }
    public String getShowColumns( )
    {
        return this.local_showColumns;
    }
    public void setSchemaOnly( boolean _schemaOnly )
    {
        this.local_schemaOnly = _schemaOnly;
    }
    public boolean getSchemaOnly( )
    {
        return this.local_schemaOnly;
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
    public void setCount( int _count )
    {
        this.local_count = _count;
    }
    public int getCount( )
    {
        return this.local_count;
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