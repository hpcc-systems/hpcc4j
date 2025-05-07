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
 * Class name: CheckoutAttributeRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class CheckoutAttributeRequestWrapper
{
    protected String local_moduleName;
    protected String local_attributeName;

    public CheckoutAttributeRequestWrapper() {}

    public CheckoutAttributeRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest checkoutattributerequest)
    {
        copy( checkoutattributerequest );
    }
    public CheckoutAttributeRequestWrapper( String _moduleName, String _attributeName )
    {
        this.local_moduleName = _moduleName;
        this.local_attributeName = _attributeName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest raw )
    {
        if (raw == null)
            return;

        this.local_moduleName = raw.getModuleName();
        this.local_attributeName = raw.getAttributeName();

    }

    @Override
    public String toString()
    {
        return "CheckoutAttributeRequestWrapper [" + "moduleName = " + local_moduleName + ", " + "attributeName = " + local_attributeName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckoutAttributeRequest();
        raw.setModuleName( local_moduleName);
        raw.setAttributeName( local_attributeName);
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
}