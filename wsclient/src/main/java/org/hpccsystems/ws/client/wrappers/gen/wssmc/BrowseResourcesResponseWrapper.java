package org.hpccsystems.ws.client.wrappers.gen.wssmc;

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
 * Class name: BrowseResourcesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class BrowseResourcesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_portalURL;
    protected String local_eSPInstance;
    protected int local_oS;
    protected boolean local_useResource;
    protected ArrayOfHPCCResourceRepositoryWrapper local_hPCCResourceRepositories;

    public BrowseResourcesResponseWrapper() {}

    public BrowseResourcesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse browseresourcesresponse)
    {
        copy( browseresourcesresponse );
    }
    public BrowseResourcesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _portalURL, String _eSPInstance, int _oS, boolean _useResource, ArrayOfHPCCResourceRepositoryWrapper _hPCCResourceRepositories )
    {
        this.local_exceptions = _exceptions;
        this.local_portalURL = _portalURL;
        this.local_eSPInstance = _eSPInstance;
        this.local_oS = _oS;
        this.local_useResource = _useResource;
        this.local_hPCCResourceRepositories = _hPCCResourceRepositories;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_portalURL = raw.getPortalURL();
        this.local_eSPInstance = raw.getESPInstance();
        this.local_oS = raw.getOS();
        this.local_useResource = raw.getUseResource();
        if (raw.getHPCCResourceRepositories() != null)
            this.local_hPCCResourceRepositories = new ArrayOfHPCCResourceRepositoryWrapper( raw.getHPCCResourceRepositories());

    }

    @Override
    public String toString()
    {
        return "BrowseResourcesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "portalURL = " + local_portalURL + ", " + "eSPInstance = " + local_eSPInstance + ", " + "oS = " + local_oS + ", " + "useResource = " + local_useResource + ", " + "hPCCResourceRepositories = " + local_hPCCResourceRepositories + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.BrowseResourcesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setPortalURL( local_portalURL);
        raw.setESPInstance( local_eSPInstance);
        raw.setOS( local_oS);
        raw.setUseResource( local_useResource);
        if (local_hPCCResourceRepositories != null)
            raw.setHPCCResourceRepositories( local_hPCCResourceRepositories.getRaw());
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
    public void setPortalURL( String _portalURL )
    {
        this.local_portalURL = _portalURL;
    }
    public String getPortalURL( )
    {
        return this.local_portalURL;
    }
    public void setESPInstance( String _eSPInstance )
    {
        this.local_eSPInstance = _eSPInstance;
    }
    public String getESPInstance( )
    {
        return this.local_eSPInstance;
    }
    public void setOS( int _oS )
    {
        this.local_oS = _oS;
    }
    public int getOS( )
    {
        return this.local_oS;
    }
    public void setUseResource( boolean _useResource )
    {
        this.local_useResource = _useResource;
    }
    public boolean getUseResource( )
    {
        return this.local_useResource;
    }
    public void setHPCCResourceRepositories( ArrayOfHPCCResourceRepositoryWrapper _hPCCResourceRepositories )
    {
        this.local_hPCCResourceRepositories = _hPCCResourceRepositories;
    }
    public ArrayOfHPCCResourceRepositoryWrapper getHPCCResourceRepositories( )
    {
        return this.local_hPCCResourceRepositories;
    }
}