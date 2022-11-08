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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: ArrayOfConfiguredWebLinkWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * Service version: 1.01
 */
public class ArrayOfConfiguredWebLinkWrapper
{
    protected List<ConfiguredWebLinkWrapper> local_configuredWebLink = null;

    public ArrayOfConfiguredWebLinkWrapper() {}

    public ArrayOfConfiguredWebLinkWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink arrayofconfiguredweblink)
    {
        copy( arrayofconfiguredweblink );
    }
    public ArrayOfConfiguredWebLinkWrapper( List<ConfiguredWebLinkWrapper> _configuredWebLink )
    {
        this.local_configuredWebLink = _configuredWebLink;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink raw )
    {
        if (raw == null)
            return;

        if (raw.getConfiguredWebLink() != null)
        {
            this.local_configuredWebLink = new ArrayList<ConfiguredWebLinkWrapper>();
            for ( int i = 0; i < raw.getConfiguredWebLink().length; i++)
            {
                this.local_configuredWebLink.add(new ConfiguredWebLinkWrapper(raw.getConfiguredWebLink()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfConfiguredWebLinkWrapper [" + "configuredWebLink = " + local_configuredWebLink + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfConfiguredWebLink();
        if (this.local_configuredWebLink!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink[] arr = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ConfiguredWebLink[this.local_configuredWebLink.size()];
            for ( int i = 0; i < this.local_configuredWebLink.size(); i++)
            {
                arr[i] = this.local_configuredWebLink.get(i) .getRaw();
            }
            raw.setConfiguredWebLink(arr);
        }
        return raw;
    }


    public void setConfiguredWebLink( List<ConfiguredWebLinkWrapper> _configuredWebLink )
    {
        this.local_configuredWebLink = _configuredWebLink;
    }
    public List<ConfiguredWebLinkWrapper> getConfiguredWebLink( )
    {
        return this.local_configuredWebLink;
    }
}