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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUDetailsActivityInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.901Z
 */
public class WUDetailsActivityInfoWrapper
{
    protected UnsignedInt local_kind;
    protected String local_name;
    protected boolean local_isSink;
    protected boolean local_isSource;

    public WUDetailsActivityInfoWrapper() {}

    public WUDetailsActivityInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo wudetailsactivityinfo)
    {
        copy( wudetailsactivityinfo );
    }
    public WUDetailsActivityInfoWrapper( UnsignedInt _kind, String _name, boolean _isSink, boolean _isSource )
    {
        this.local_kind = _kind;
        this.local_name = _name;
        this.local_isSink = _isSink;
        this.local_isSource = _isSource;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo raw )
    {
        if (raw == null)
            return;

        this.local_kind = raw.getKind();
        this.local_name = raw.getName();
        this.local_isSink = raw.getIsSink();
        this.local_isSource = raw.getIsSource();

    }

    @Override
    public String toString()
    {
        return "WUDetailsActivityInfoWrapper [" + "kind = " + local_kind + ", " + "name = " + local_name + ", " + "isSink = " + local_isSink + ", " + "isSource = " + local_isSource + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsActivityInfo();
        raw.setKind( local_kind);
        raw.setName( local_name);
        raw.setIsSink( local_isSink);
        raw.setIsSource( local_isSource);
        return raw;
    }


    public void setKind( UnsignedInt _kind )
    {
        this.local_kind = _kind;
    }
    public UnsignedInt getKind( )
    {
        return this.local_kind;
    }
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setIsSink( boolean _isSink )
    {
        this.local_isSink = _isSink;
    }
    public boolean getIsSink( )
    {
        return this.local_isSink;
    }
    public void setIsSource( boolean _isSource )
    {
        this.local_isSource = _isSource;
    }
    public boolean getIsSource( )
    {
        return this.local_isSource;
    }
}