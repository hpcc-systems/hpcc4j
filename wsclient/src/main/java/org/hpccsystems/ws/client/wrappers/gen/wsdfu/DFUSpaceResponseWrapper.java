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
 * Class name: DFUSpaceResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.922Z
 */
public class DFUSpaceResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_countBy;
    protected String local_scopeUnder;
    protected String local_ownerUnder;
    protected String local_interval;
    protected String local_startDate;
    protected String local_endDate;
    protected ArrayOfDFUSpaceItemWrapper local_dFUSpaceItems;

    public DFUSpaceResponseWrapper() {}

    public DFUSpaceResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse dfuspaceresponse)
    {
        copy( dfuspaceresponse );
    }
    public DFUSpaceResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _countBy, String _scopeUnder, String _ownerUnder, String _interval, String _startDate, String _endDate, ArrayOfDFUSpaceItemWrapper _dFUSpaceItems )
    {
        this.local_exceptions = _exceptions;
        this.local_countBy = _countBy;
        this.local_scopeUnder = _scopeUnder;
        this.local_ownerUnder = _ownerUnder;
        this.local_interval = _interval;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_dFUSpaceItems = _dFUSpaceItems;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_countBy = raw.getCountBy();
        this.local_scopeUnder = raw.getScopeUnder();
        this.local_ownerUnder = raw.getOwnerUnder();
        this.local_interval = raw.getInterval();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        if (raw.getDFUSpaceItems() != null)
            this.local_dFUSpaceItems = new ArrayOfDFUSpaceItemWrapper( raw.getDFUSpaceItems());

    }

    @Override
    public String toString()
    {
        return "DFUSpaceResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "countBy = " + local_countBy + ", " + "scopeUnder = " + local_scopeUnder + ", " + "ownerUnder = " + local_ownerUnder + ", " + "interval = " + local_interval + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "dFUSpaceItems = " + local_dFUSpaceItems + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setCountBy( local_countBy);
        raw.setScopeUnder( local_scopeUnder);
        raw.setOwnerUnder( local_ownerUnder);
        raw.setInterval( local_interval);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        raw.setDFUSpaceItems( local_dFUSpaceItems.getRaw());
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
    public void setCountBy( String _countBy )
    {
        this.local_countBy = _countBy;
    }
    public String getCountBy( )
    {
        return this.local_countBy;
    }
    public void setScopeUnder( String _scopeUnder )
    {
        this.local_scopeUnder = _scopeUnder;
    }
    public String getScopeUnder( )
    {
        return this.local_scopeUnder;
    }
    public void setOwnerUnder( String _ownerUnder )
    {
        this.local_ownerUnder = _ownerUnder;
    }
    public String getOwnerUnder( )
    {
        return this.local_ownerUnder;
    }
    public void setInterval( String _interval )
    {
        this.local_interval = _interval;
    }
    public String getInterval( )
    {
        return this.local_interval;
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
    public void setDFUSpaceItems( ArrayOfDFUSpaceItemWrapper _dFUSpaceItems )
    {
        this.local_dFUSpaceItems = _dFUSpaceItems;
    }
    public ArrayOfDFUSpaceItemWrapper getDFUSpaceItems( )
    {
        return this.local_dFUSpaceItems;
    }
}