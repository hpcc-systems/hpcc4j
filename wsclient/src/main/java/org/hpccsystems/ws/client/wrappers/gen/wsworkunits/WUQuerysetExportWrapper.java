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
 * Class name: WUQuerysetExportWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.975Z
 */
public class WUQuerysetExportWrapper
{
    protected String local_target;
    protected boolean local_compress;
    protected boolean local_activeOnly;
    protected boolean local_protect;

    public WUQuerysetExportWrapper() {}

    public WUQuerysetExportWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport wuquerysetexport)
    {
        copy( wuquerysetexport );
    }
    public WUQuerysetExportWrapper( String _target, boolean _compress, boolean _activeOnly, boolean _protect )
    {
        this.local_target = _target;
        this.local_compress = _compress;
        this.local_activeOnly = _activeOnly;
        this.local_protect = _protect;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_compress = raw.getCompress();
        this.local_activeOnly = raw.getActiveOnly();
        this.local_protect = raw.getProtect();

    }

    @Override
    public String toString()
    {
        return "WUQuerysetExportWrapper [" + "target = " + local_target + ", " + "compress = " + local_compress + ", " + "activeOnly = " + local_activeOnly + ", " + "protect = " + local_protect + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExport();
        raw.setTarget( local_target);
        raw.setCompress( local_compress);
        raw.setActiveOnly( local_activeOnly);
        raw.setProtect( local_protect);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setCompress( boolean _compress )
    {
        this.local_compress = _compress;
    }
    public boolean getCompress( )
    {
        return this.local_compress;
    }
    public void setActiveOnly( boolean _activeOnly )
    {
        this.local_activeOnly = _activeOnly;
    }
    public boolean getActiveOnly( )
    {
        return this.local_activeOnly;
    }
    public void setProtect( boolean _protect )
    {
        this.local_protect = _protect;
    }
    public boolean getProtect( )
    {
        return this.local_protect;
    }
}