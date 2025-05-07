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
 * Class name: GetModulesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetModulesWrapper
{
    protected long local_modifiedSince;
    protected boolean local_includeDeleted;
    protected boolean local_getChecksum;
    protected String local_label;
    protected String local_earMark;

    public GetModulesWrapper() {}

    public GetModulesWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules getmodules)
    {
        copy( getmodules );
    }
    public GetModulesWrapper( long _modifiedSince, boolean _includeDeleted, boolean _getChecksum, String _label, String _earMark )
    {
        this.local_modifiedSince = _modifiedSince;
        this.local_includeDeleted = _includeDeleted;
        this.local_getChecksum = _getChecksum;
        this.local_label = _label;
        this.local_earMark = _earMark;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules raw )
    {
        if (raw == null)
            return;

        this.local_modifiedSince = raw.getModifiedSince();
        this.local_includeDeleted = raw.getIncludeDeleted();
        this.local_getChecksum = raw.getGetChecksum();
        this.local_label = raw.getLabel();
        this.local_earMark = raw.getEarMark();

    }

    @Override
    public String toString()
    {
        return "GetModulesWrapper [" + "modifiedSince = " + local_modifiedSince + ", " + "includeDeleted = " + local_includeDeleted + ", " + "getChecksum = " + local_getChecksum + ", " + "label = " + local_label + ", " + "earMark = " + local_earMark + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetModules();
        raw.setModifiedSince( local_modifiedSince);
        raw.setIncludeDeleted( local_includeDeleted);
        raw.setGetChecksum( local_getChecksum);
        raw.setLabel( local_label);
        raw.setEarMark( local_earMark);
        return raw;
    }


    public void setModifiedSince( long _modifiedSince )
    {
        this.local_modifiedSince = _modifiedSince;
    }
    public long getModifiedSince( )
    {
        return this.local_modifiedSince;
    }
    public void setIncludeDeleted( boolean _includeDeleted )
    {
        this.local_includeDeleted = _includeDeleted;
    }
    public boolean getIncludeDeleted( )
    {
        return this.local_includeDeleted;
    }
    public void setGetChecksum( boolean _getChecksum )
    {
        this.local_getChecksum = _getChecksum;
    }
    public boolean getGetChecksum( )
    {
        return this.local_getChecksum;
    }
    public void setLabel( String _label )
    {
        this.local_label = _label;
    }
    public String getLabel( )
    {
        return this.local_label;
    }
    public void setEarMark( String _earMark )
    {
        this.local_earMark = _earMark;
    }
    public String getEarMark( )
    {
        return this.local_earMark;
    }
}