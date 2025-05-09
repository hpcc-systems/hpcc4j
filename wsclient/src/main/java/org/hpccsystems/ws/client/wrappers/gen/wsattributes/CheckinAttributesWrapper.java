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
 * Class name: CheckinAttributesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class CheckinAttributesWrapper
{
    protected ArrayOfCheckinAttributeRequestWrapper local_attributes;

    public CheckinAttributesWrapper() {}

    public CheckinAttributesWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes checkinattributes)
    {
        copy( checkinattributes );
    }
    public CheckinAttributesWrapper( ArrayOfCheckinAttributeRequestWrapper _attributes )
    {
        this.local_attributes = _attributes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes raw )
    {
        if (raw == null)
            return;

        if (raw.getAttributes() != null)
            this.local_attributes = new ArrayOfCheckinAttributeRequestWrapper( raw.getAttributes());

    }

    @Override
    public String toString()
    {
        return "CheckinAttributesWrapper [" + "attributes = " + local_attributes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.CheckinAttributes();
        if (local_attributes != null)
            raw.setAttributes( local_attributes.getRaw());
        return raw;
    }


    public void setAttributes( ArrayOfCheckinAttributeRequestWrapper _attributes )
    {
        this.local_attributes = _attributes;
    }
    public ArrayOfCheckinAttributeRequestWrapper getAttributes( )
    {
        return this.local_attributes;
    }
}