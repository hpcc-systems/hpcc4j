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
 * Class name: ArrayOfDiscoveredWebLinkWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * Service version: 1.01
 */
public class ArrayOfDiscoveredWebLinkWrapper
{
    protected List<DiscoveredWebLinkWrapper> local_discoveredWebLink = null;

    public ArrayOfDiscoveredWebLinkWrapper() {}

    public ArrayOfDiscoveredWebLinkWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink arrayofdiscoveredweblink)
    {
        copy( arrayofdiscoveredweblink );
    }
    public ArrayOfDiscoveredWebLinkWrapper( List<DiscoveredWebLinkWrapper> _discoveredWebLink )
    {
        this.local_discoveredWebLink = _discoveredWebLink;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink raw )
    {
        if (raw == null)
            return;

        if (raw.getDiscoveredWebLink() != null)
        {
            this.local_discoveredWebLink = new ArrayList<DiscoveredWebLinkWrapper>();
            for ( int i = 0; i < raw.getDiscoveredWebLink().length; i++)
            {
                this.local_discoveredWebLink.add(new DiscoveredWebLinkWrapper(raw.getDiscoveredWebLink()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDiscoveredWebLinkWrapper [" + "discoveredWebLink = " + local_discoveredWebLink + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ArrayOfDiscoveredWebLink();
        if (this.local_discoveredWebLink!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink[] arr = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink[this.local_discoveredWebLink.size()];
            for ( int i = 0; i < this.local_discoveredWebLink.size(); i++)
            {
                arr[i] = this.local_discoveredWebLink.get(i) .getRaw();
            }
            raw.setDiscoveredWebLink(arr);
        }
        return raw;
    }


    public void setDiscoveredWebLink( List<DiscoveredWebLinkWrapper> _discoveredWebLink )
    {
        this.local_discoveredWebLink = _discoveredWebLink;
    }
    public List<DiscoveredWebLinkWrapper> getDiscoveredWebLink( )
    {
        return this.local_discoveredWebLink;
    }
}