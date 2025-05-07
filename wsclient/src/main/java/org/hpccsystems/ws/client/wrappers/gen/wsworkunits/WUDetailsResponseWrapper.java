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
import org.apache.axiom.om.OMElement;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUDetailsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUDetailsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected OMElement local_maxVersion;
    protected String local_wUID;
    protected Scopes_type1Wrapper local_scopes;

    public WUDetailsResponseWrapper() {}

    public WUDetailsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse wudetailsresponse)
    {
        copy( wudetailsresponse );
    }
    public WUDetailsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, OMElement _maxVersion, String _wUID, Scopes_type1Wrapper _scopes )
    {
        this.local_exceptions = _exceptions;
        this.local_maxVersion = _maxVersion;
        this.local_wUID = _wUID;
        this.local_scopes = _scopes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_maxVersion = raw.getMaxVersion();
        this.local_wUID = raw.getWUID();
        if (raw.getScopes() != null)
            this.local_scopes = new Scopes_type1Wrapper( raw.getScopes());

    }

    @Override
    public String toString()
    {
        return "WUDetailsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "maxVersion = " + local_maxVersion + ", " + "wUID = " + local_wUID + ", " + "scopes = " + local_scopes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setMaxVersion( local_maxVersion);
        raw.setWUID( local_wUID);
        if (local_scopes != null)
            raw.setScopes( local_scopes.getRaw());
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
    public void setMaxVersion( OMElement _maxVersion )
    {
        this.local_maxVersion = _maxVersion;
    }
    public OMElement getMaxVersion( )
    {
        return this.local_maxVersion;
    }
    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
    public void setScopes( Scopes_type1Wrapper _scopes )
    {
        this.local_scopes = _scopes;
    }
    public Scopes_type1Wrapper getScopes( )
    {
        return this.local_scopes;
    }
}