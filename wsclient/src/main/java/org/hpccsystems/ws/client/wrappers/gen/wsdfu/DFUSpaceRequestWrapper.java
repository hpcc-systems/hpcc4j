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
 * Class name: DFUSpaceRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.315Z
 */
public class DFUSpaceRequestWrapper
{
    protected String local_countBy;
    protected String local_scopeUnder;
    protected String local_ownerUnder;
    protected String local_interval;
    protected String local_startDate;
    protected String local_endDate;

    public DFUSpaceRequestWrapper() {}

    public DFUSpaceRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest dfuspacerequest)
    {
        copy( dfuspacerequest );
    }
    public DFUSpaceRequestWrapper( String _countBy, String _scopeUnder, String _ownerUnder, String _interval, String _startDate, String _endDate )
    {
        this.local_countBy = _countBy;
        this.local_scopeUnder = _scopeUnder;
        this.local_ownerUnder = _ownerUnder;
        this.local_interval = _interval;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest raw )
    {
        if (raw == null)
            return;

        this.local_countBy = raw.getCountBy();
        this.local_scopeUnder = raw.getScopeUnder();
        this.local_ownerUnder = raw.getOwnerUnder();
        this.local_interval = raw.getInterval();
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();

    }

    @Override
    public String toString()
    {
        return "DFUSpaceRequestWrapper [" + "countBy = " + local_countBy + ", " + "scopeUnder = " + local_scopeUnder + ", " + "ownerUnder = " + local_ownerUnder + ", " + "interval = " + local_interval + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSpaceRequest();
        raw.setCountBy( local_countBy);
        raw.setScopeUnder( local_scopeUnder);
        raw.setOwnerUnder( local_ownerUnder);
        raw.setInterval( local_interval);
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
        return raw;
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
}