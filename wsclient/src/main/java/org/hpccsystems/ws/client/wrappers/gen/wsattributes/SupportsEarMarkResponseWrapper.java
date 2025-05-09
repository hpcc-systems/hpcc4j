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
 * Class name: SupportsEarMarkResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class SupportsEarMarkResponseWrapper
{
    protected boolean local_support;

    public SupportsEarMarkResponseWrapper() {}

    public SupportsEarMarkResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse supportsearmarkresponse)
    {
        copy( supportsearmarkresponse );
    }
    public SupportsEarMarkResponseWrapper( boolean _support )
    {
        this.local_support = _support;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse raw )
    {
        if (raw == null)
            return;

        this.local_support = raw.getSupport();

    }

    @Override
    public String toString()
    {
        return "SupportsEarMarkResponseWrapper [" + "support = " + local_support + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.SupportsEarMarkResponse();
        raw.setSupport( local_support);
        return raw;
    }


    public void setSupport( boolean _support )
    {
        this.local_support = _support;
    }
    public boolean getSupport( )
    {
        return this.local_support;
    }
}