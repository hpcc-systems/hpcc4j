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
 * Class name: WebLinksQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * TimeStamp: 2022-10-31T03:36:28.642Z
 */
public class WebLinksQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfDiscoveredWebLinkWrapper local_discoveredWebLinks;
    protected ArrayOfConfiguredWebLinkWrapper local_configuredWebLinks;

    public WebLinksQueryResponseWrapper() {}

    public WebLinksQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse weblinksqueryresponse)
    {
        copy( weblinksqueryresponse );
    }
    public WebLinksQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfDiscoveredWebLinkWrapper _discoveredWebLinks, ArrayOfConfiguredWebLinkWrapper _configuredWebLinks )
    {
        this.local_exceptions = _exceptions;
        this.local_discoveredWebLinks = _discoveredWebLinks;
        this.local_configuredWebLinks = _configuredWebLinks;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getDiscoveredWebLinks() != null)
            this.local_discoveredWebLinks = new ArrayOfDiscoveredWebLinkWrapper( raw.getDiscoveredWebLinks());
        if (raw.getConfiguredWebLinks() != null)
            this.local_configuredWebLinks = new ArrayOfConfiguredWebLinkWrapper( raw.getConfiguredWebLinks());

    }

    @Override
    public String toString()
    {
        return "WebLinksQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "discoveredWebLinks = " + local_discoveredWebLinks + ", " + "configuredWebLinks = " + local_configuredWebLinks + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.WebLinksQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_discoveredWebLinks != null)
            raw.setDiscoveredWebLinks( local_discoveredWebLinks.getRaw());
        if (local_configuredWebLinks != null)
            raw.setConfiguredWebLinks( local_configuredWebLinks.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setDiscoveredWebLinks( ArrayOfDiscoveredWebLinkWrapper _discoveredWebLinks )
    {
        this.local_discoveredWebLinks = _discoveredWebLinks;
    }
    public ArrayOfDiscoveredWebLinkWrapper getDiscoveredWebLinks( )
    {
        return this.local_discoveredWebLinks;
    }
    public void setConfiguredWebLinks( ArrayOfConfiguredWebLinkWrapper _configuredWebLinks )
    {
        this.local_configuredWebLinks = _configuredWebLinks;
    }
    public ArrayOfConfiguredWebLinkWrapper getConfiguredWebLinks( )
    {
        return this.local_configuredWebLinks;
    }
}