package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: GetAttributeHistoryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributeHistoryWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_fromDate;
    protected String local_toDate;

    public GetAttributeHistoryWrapper() {}

    public GetAttributeHistoryWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory getattributehistory)
    {
        copy( getattributehistory );
    }
    public GetAttributeHistoryWrapper( String _moduleName, String _attributeName, String _fromDate, String _toDate )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_fromDate = _fromDate;
        this.local_toDate = _toDate;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_fromDate = raw.getFromDate();
        this.local_toDate = raw.getToDate();

    }

    @Override
    public String toString()
    {
        return "GetAttributeHistoryWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "fromDate = " + local_fromDate + ", " + "toDate = " + local_toDate + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeHistory();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setFromDate( local_fromDate);
        raw.setToDate( local_toDate);
        return raw;
    }


    public void setModuleName( String _moduleName )
    {
        this.local_moduleName = _moduleName;
    }
    public String getModuleName( )
    {
        return this.local_moduleName;
    }
    public void setAttributeName( String _attributeName )
    {
        this.local_attributeName = _attributeName;
    }
    public String getAttributeName( )
    {
        return this.local_attributeName;
    }
    public void setFromDate( String _fromDate )
    {
        this.local_fromDate = _fromDate;
    }
    public String getFromDate( )
    {
        return this.local_fromDate;
    }
    public void setToDate( String _toDate )
    {
        this.local_toDate = _toDate;
    }
    public String getToDate( )
    {
        return this.local_toDate;
    }
}