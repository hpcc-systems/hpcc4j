package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;

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
 * Class name: WUCheckFeaturesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUCheckFeaturesWrapper
{
    protected boolean local_includeFullVersion;

    public WUCheckFeaturesWrapper() {}

    public WUCheckFeaturesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures wucheckfeatures)
    {
        copy( wucheckfeatures );
    }
    public WUCheckFeaturesWrapper( boolean _includeFullVersion )
    {
        this.local_includeFullVersion = _includeFullVersion;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures raw )
    {
        if (raw == null)
            return;

        this.local_includeFullVersion = raw.getIncludeFullVersion();

    }

    @Override
    public String toString()
    {
        return "WUCheckFeaturesWrapper [" + "includeFullVersion = " + local_includeFullVersion + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCheckFeatures();
        raw.setIncludeFullVersion( local_includeFullVersion);
        return raw;
    }


    public void setIncludeFullVersion( boolean _includeFullVersion )
    {
        this.local_includeFullVersion = _includeFullVersion;
    }
    public boolean getIncludeFullVersion( )
    {
        return this.local_includeFullVersion;
    }
}