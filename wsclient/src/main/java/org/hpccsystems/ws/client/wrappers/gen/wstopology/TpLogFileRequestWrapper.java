package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpLogFileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2021-10-27T23:40:06.354Z
 */
public class TpLogFileRequestWrapper
{
    protected String local_name;
    protected String local_type;
    protected int local_lastHours;
    protected String local_startDate;
    protected String local_endDate;
    protected int local_firstRows;
    protected int local_lastRows;
    protected int local_filterType;
    protected boolean local_reversely;
    protected boolean local_zip;
    protected int local_pageNumber;
    protected boolean local_loadData;
    protected boolean local_includeLogFieldNames;

    public TpLogFileRequestWrapper() {}

    public TpLogFileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest tplogfilerequest)
    {
        copy( tplogfilerequest );
    }
    public TpLogFileRequestWrapper( String _name, String _type, int _lastHours, String _startDate, String _endDate, int _firstRows, int _lastRows, int _filterType, boolean _reversely, boolean _zip, int _pageNumber, boolean _loadData, boolean _includeLogFieldNames )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_lastHours = _lastHours;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_firstRows = _firstRows;
        this.local_lastRows = _lastRows;
        this.local_filterType = _filterType;
        this.local_reversely = _reversely;
        this.local_zip = _zip;
        this.local_pageNumber = _pageNumber;
        this.local_loadData = _loadData;
        this.local_includeLogFieldNames = _includeLogFieldNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_lastHours = raw.getLastHours();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_firstRows = raw.getFirstRows();
        this.local_lastRows = raw.getLastRows();
        this.local_filterType = raw.getFilterType();
        this.local_reversely = raw.getReversely();
        this.local_zip = raw.getZip();
        this.local_pageNumber = raw.getPageNumber();
        this.local_loadData = raw.getLoadData();
        this.local_includeLogFieldNames = raw.getIncludeLogFieldNames();

    }

    @Override
    public String toString()
    {
        return "TpLogFileRequestWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "lastHours = " + local_lastHours + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "firstRows = " + local_firstRows + ", " + "lastRows = " + local_lastRows + ", " + "filterType = " + local_filterType + ", " + "reversely = " + local_reversely + ", " + "zip = " + local_zip + ", " + "pageNumber = " + local_pageNumber + ", " + "loadData = " + local_loadData + ", " + "includeLogFieldNames = " + local_includeLogFieldNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileRequest();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setLastHours( local_lastHours);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setFirstRows( local_firstRows);
        raw.setLastRows( local_lastRows);
        raw.setFilterType( local_filterType);
        raw.setReversely( local_reversely);
        raw.setZip( local_zip);
        raw.setPageNumber( local_pageNumber);
        raw.setLoadData( local_loadData);
        raw.setIncludeLogFieldNames( local_includeLogFieldNames);
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setLastHours( int _lastHours )
    {
        this.local_lastHours = _lastHours;
    }
    public int getLastHours( )
    {
        return this.local_lastHours;
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
    public void setFirstRows( int _firstRows )
    {
        this.local_firstRows = _firstRows;
    }
    public int getFirstRows( )
    {
        return this.local_firstRows;
    }
    public void setLastRows( int _lastRows )
    {
        this.local_lastRows = _lastRows;
    }
    public int getLastRows( )
    {
        return this.local_lastRows;
    }
    public void setFilterType( int _filterType )
    {
        this.local_filterType = _filterType;
    }
    public int getFilterType( )
    {
        return this.local_filterType;
    }
    public void setReversely( boolean _reversely )
    {
        this.local_reversely = _reversely;
    }
    public boolean getReversely( )
    {
        return this.local_reversely;
    }
    public void setZip( boolean _zip )
    {
        this.local_zip = _zip;
    }
    public boolean getZip( )
    {
        return this.local_zip;
    }
    public void setPageNumber( int _pageNumber )
    {
        this.local_pageNumber = _pageNumber;
    }
    public int getPageNumber( )
    {
        return this.local_pageNumber;
    }
    public void setLoadData( boolean _loadData )
    {
        this.local_loadData = _loadData;
    }
    public boolean getLoadData( )
    {
        return this.local_loadData;
    }
    public void setIncludeLogFieldNames( boolean _includeLogFieldNames )
    {
        this.local_includeLogFieldNames = _includeLogFieldNames;
    }
    public boolean getIncludeLogFieldNames( )
    {
        return this.local_includeLogFieldNames;
    }
}