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
 * Class name: CheckinAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class CheckinAttributeRequestWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;
    protected String local_description;

    public CheckinAttributeRequestWrapper() {}

    public CheckinAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest checkinattributerequest)
    {
        copy( checkinattributerequest );
    }
    public CheckinAttributeRequestWrapper( String _moduleName, String _attributeName, String _description )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;
        this.local_description = _description;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();
        this.local_description = raw.getDescription();

    }

    @Override
    public String toString()
    {
        return "CheckinAttributeRequestWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + ", " + "description = " + local_description + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributeRequest();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
        raw.setDescription( local_description);
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
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
}