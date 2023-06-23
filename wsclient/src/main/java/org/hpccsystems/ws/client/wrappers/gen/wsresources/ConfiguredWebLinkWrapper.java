package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: ConfiguredWebLinkWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ConfiguredWebLinkWrapper
{
    protected String local_name;
    protected String local_description;
    protected String local_uRL;

    public ConfiguredWebLinkWrapper() {}

    public ConfiguredWebLinkWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink configuredweblink)
    {
        copy( configuredweblink );
    }
    public ConfiguredWebLinkWrapper( String _name, String _description, String _uRL )
    {
        this.local_name = _name;
        this.local_description = _description;
        this.local_uRL = _uRL;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_description = raw.getDescription();
        this.local_uRL = raw.getURL();

    }

    @Override
    public String toString()
    {
        return "ConfiguredWebLinkWrapper [" + "name = " + local_name + ", " + "description = " + local_description + ", " + "uRL = " + local_uRL + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink();
        raw.setName( local_name);
        raw.setDescription( local_description);
        raw.setURL( local_uRL);
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
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setURL( String _uRL )
    {
        this.local_uRL = _uRL;
    }
    public String getURL( )
    {
        return this.local_uRL;
    }
}