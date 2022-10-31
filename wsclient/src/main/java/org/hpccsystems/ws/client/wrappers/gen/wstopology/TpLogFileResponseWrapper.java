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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: TpLogFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.475Z
 */
public class TpLogFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_name;
    protected String local_type;
    protected String local_startDate;
    protected String local_endDate;
    protected int local_lastHours;
    protected int local_firstRows;
    protected int local_lastRows;
    protected boolean local_reversely;
    protected boolean local_zip;
    protected int local_filterType;
    protected String local_logData;
    protected boolean local_hasDate;
    protected long local_fileSize;
    protected long local_pageFrom;
    protected long local_pageTo;
    protected int local_pageNumber;
    protected int local_prevPage;
    protected int local_nextPage;
    protected int local_totalPages;
    protected String local_acceptLanguage;
    protected List<String> local_logFieldNames = null;

    public TpLogFileResponseWrapper() {}

    public TpLogFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse tplogfileresponse)
    {
        copy( tplogfileresponse );
    }
    public TpLogFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _name, String _type, String _startDate, String _endDate, int _lastHours, int _firstRows, int _lastRows, boolean _reversely, boolean _zip, int _filterType, String _logData, boolean _hasDate, long _fileSize, long _pageFrom, long _pageTo, int _pageNumber, int _prevPage, int _nextPage, int _totalPages, String _acceptLanguage, List<String> _logFieldNames )
    {
        this.local_exceptions = _exceptions;
        this.local_name = _name;
        this.local_type = _type;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_lastHours = _lastHours;
        this.local_firstRows = _firstRows;
        this.local_lastRows = _lastRows;
        this.local_reversely = _reversely;
        this.local_zip = _zip;
        this.local_filterType = _filterType;
        this.local_logData = _logData;
        this.local_hasDate = _hasDate;
        this.local_fileSize = _fileSize;
        this.local_pageFrom = _pageFrom;
        this.local_pageTo = _pageTo;
        this.local_pageNumber = _pageNumber;
        this.local_prevPage = _prevPage;
        this.local_nextPage = _nextPage;
        this.local_totalPages = _totalPages;
        this.local_acceptLanguage = _acceptLanguage;
        this.local_logFieldNames = _logFieldNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        this.local_lastHours = raw.getLastHours();
        this.local_firstRows = raw.getFirstRows();
        this.local_lastRows = raw.getLastRows();
        this.local_reversely = raw.getReversely();
        this.local_zip = raw.getZip();
        this.local_filterType = raw.getFilterType();
        this.local_logData = raw.getLogData();
        this.local_hasDate = raw.getHasDate();
        this.local_fileSize = raw.getFileSize();
        this.local_pageFrom = raw.getPageFrom();
        this.local_pageTo = raw.getPageTo();
        this.local_pageNumber = raw.getPageNumber();
        this.local_prevPage = raw.getPrevPage();
        this.local_nextPage = raw.getNextPage();
        this.local_totalPages = raw.getTotalPages();
        this.local_acceptLanguage = raw.getAcceptLanguage();
        if (raw.getLogFieldNames() != null)
        {
            this.local_logFieldNames = new ArrayList<String>();
            for ( int i = 0; i < raw.getLogFieldNames().getItem().length; i++)
            {
                this.local_logFieldNames.add(new String(raw.getLogFieldNames().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "TpLogFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "name = " + local_name + ", " + "type = " + local_type + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "lastHours = " + local_lastHours + ", " + "firstRows = " + local_firstRows + ", " + "lastRows = " + local_lastRows + ", " + "reversely = " + local_reversely + ", " + "zip = " + local_zip + ", " + "filterType = " + local_filterType + ", " + "logData = " + local_logData + ", " + "hasDate = " + local_hasDate + ", " + "fileSize = " + local_fileSize + ", " + "pageFrom = " + local_pageFrom + ", " + "pageTo = " + local_pageTo + ", " + "pageNumber = " + local_pageNumber + ", " + "prevPage = " + local_prevPage + ", " + "nextPage = " + local_nextPage + ", " + "totalPages = " + local_totalPages + ", " + "acceptLanguage = " + local_acceptLanguage + ", " + "logFieldNames = " + local_logFieldNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpLogFileResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setLastHours( local_lastHours);
        raw.setFirstRows( local_firstRows);
        raw.setLastRows( local_lastRows);
        raw.setReversely( local_reversely);
        raw.setZip( local_zip);
        raw.setFilterType( local_filterType);
        raw.setLogData( local_logData);
        raw.setHasDate( local_hasDate);
        raw.setFileSize( local_fileSize);
        raw.setPageFrom( local_pageFrom);
        raw.setPageTo( local_pageTo);
        raw.setPageNumber( local_pageNumber);
        raw.setPrevPage( local_prevPage);
        raw.setNextPage( local_nextPage);
        raw.setTotalPages( local_totalPages);
        raw.setAcceptLanguage( local_acceptLanguage);
        if (this.local_logFieldNames!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_logFieldNames.size(); i++)
            {
                arr.addItem(this.local_logFieldNames.get(i));
            }
            raw.setLogFieldNames(arr);
        }
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
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
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
    public void setLastHours( int _lastHours )
    {
        this.local_lastHours = _lastHours;
    }
    public int getLastHours( )
    {
        return this.local_lastHours;
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
    public void setFilterType( int _filterType )
    {
        this.local_filterType = _filterType;
    }
    public int getFilterType( )
    {
        return this.local_filterType;
    }
    public void setLogData( String _logData )
    {
        this.local_logData = _logData;
    }
    public String getLogData( )
    {
        return this.local_logData;
    }
    public void setHasDate( boolean _hasDate )
    {
        this.local_hasDate = _hasDate;
    }
    public boolean getHasDate( )
    {
        return this.local_hasDate;
    }
    public void setFileSize( long _fileSize )
    {
        this.local_fileSize = _fileSize;
    }
    public long getFileSize( )
    {
        return this.local_fileSize;
    }
    public void setPageFrom( long _pageFrom )
    {
        this.local_pageFrom = _pageFrom;
    }
    public long getPageFrom( )
    {
        return this.local_pageFrom;
    }
    public void setPageTo( long _pageTo )
    {
        this.local_pageTo = _pageTo;
    }
    public long getPageTo( )
    {
        return this.local_pageTo;
    }
    public void setPageNumber( int _pageNumber )
    {
        this.local_pageNumber = _pageNumber;
    }
    public int getPageNumber( )
    {
        return this.local_pageNumber;
    }
    public void setPrevPage( int _prevPage )
    {
        this.local_prevPage = _prevPage;
    }
    public int getPrevPage( )
    {
        return this.local_prevPage;
    }
    public void setNextPage( int _nextPage )
    {
        this.local_nextPage = _nextPage;
    }
    public int getNextPage( )
    {
        return this.local_nextPage;
    }
    public void setTotalPages( int _totalPages )
    {
        this.local_totalPages = _totalPages;
    }
    public int getTotalPages( )
    {
        return this.local_totalPages;
    }
    public void setAcceptLanguage( String _acceptLanguage )
    {
        this.local_acceptLanguage = _acceptLanguage;
    }
    public String getAcceptLanguage( )
    {
        return this.local_acceptLanguage;
    }
    public void setLogFieldNames( List<String> _logFieldNames )
    {
        this.local_logFieldNames = _logFieldNames;
    }
    public List<String> getLogFieldNames( )
    {
        return this.local_logFieldNames;
    }
}