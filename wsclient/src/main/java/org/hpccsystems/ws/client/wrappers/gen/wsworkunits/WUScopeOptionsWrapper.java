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
 * Class name: WUScopeOptionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.993Z
 */
public class WUScopeOptionsWrapper
{
    protected boolean local_includeMatchedScopesInResults;
    protected boolean local_includeScope;
    protected boolean local_includeId;
    protected boolean local_includeScopeType;

    public WUScopeOptionsWrapper() {}

    public WUScopeOptionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions wuscopeoptions)
    {
        copy( wuscopeoptions );
    }
    public WUScopeOptionsWrapper( boolean _includeMatchedScopesInResults, boolean _includeScope, boolean _includeId, boolean _includeScopeType )
    {
        this.local_includeMatchedScopesInResults = _includeMatchedScopesInResults;
        this.local_includeScope = _includeScope;
        this.local_includeId = _includeId;
        this.local_includeScopeType = _includeScopeType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions raw )
    {
        if (raw == null)
            return;

        this.local_includeMatchedScopesInResults = raw.getIncludeMatchedScopesInResults();
        this.local_includeScope = raw.getIncludeScope();
        this.local_includeId = raw.getIncludeId();
        this.local_includeScopeType = raw.getIncludeScopeType();

    }

    @Override
    public String toString()
    {
        return "WUScopeOptionsWrapper [" + "includeMatchedScopesInResults = " + local_includeMatchedScopesInResults + ", " + "includeScope = " + local_includeScope + ", " + "includeId = " + local_includeId + ", " + "includeScopeType = " + local_includeScopeType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUScopeOptions();
        raw.setIncludeMatchedScopesInResults( local_includeMatchedScopesInResults);
        raw.setIncludeScope( local_includeScope);
        raw.setIncludeId( local_includeId);
        raw.setIncludeScopeType( local_includeScopeType);
        return raw;
    }


    public void setIncludeMatchedScopesInResults( boolean _includeMatchedScopesInResults )
    {
        this.local_includeMatchedScopesInResults = _includeMatchedScopesInResults;
    }
    public boolean getIncludeMatchedScopesInResults( )
    {
        return this.local_includeMatchedScopesInResults;
    }
    public void setIncludeScope( boolean _includeScope )
    {
        this.local_includeScope = _includeScope;
    }
    public boolean getIncludeScope( )
    {
        return this.local_includeScope;
    }
    public void setIncludeId( boolean _includeId )
    {
        this.local_includeId = _includeId;
    }
    public boolean getIncludeId( )
    {
        return this.local_includeId;
    }
    public void setIncludeScopeType( boolean _includeScopeType )
    {
        this.local_includeScopeType = _includeScopeType;
    }
    public boolean getIncludeScopeType( )
    {
        return this.local_includeScopeType;
    }
}