package org.hpccsystems.ws.client.wrappers.gen.wsfileio;

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
 * Class name: CreateFileRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class CreateFileRequestWrapper
{
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected String local_destNetAddress;
    protected boolean local_overwrite;

    public CreateFileRequestWrapper() {}

    public CreateFileRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest createfilerequest)
    {
        copy( createfilerequest );
    }
    public CreateFileRequestWrapper( String _destDropZone, String _destRelativePath, String _destNetAddress, boolean _overwrite )
    {
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_destNetAddress = _destNetAddress;
        this.local_overwrite = _overwrite;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest raw )
    {
        if (raw == null)
            return;

        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_destNetAddress = raw.getDestNetAddress();
        this.local_overwrite = raw.getOverwrite();

    }

    @Override
    public String toString()
    {
        return "CreateFileRequestWrapper [" + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "destNetAddress = " + local_destNetAddress + ", " + "overwrite = " + local_overwrite + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileRequest();
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setDestNetAddress( local_destNetAddress);
        raw.setOverwrite( local_overwrite);
        return raw;
    }


    public void setDestDropZone( String _destDropZone )
    {
        this.local_destDropZone = _destDropZone;
    }
    public String getDestDropZone( )
    {
        return this.local_destDropZone;
    }
    public void setDestRelativePath( String _destRelativePath )
    {
        this.local_destRelativePath = _destRelativePath;
    }
    public String getDestRelativePath( )
    {
        return this.local_destRelativePath;
    }
    public void setDestNetAddress( String _destNetAddress )
    {
        this.local_destNetAddress = _destNetAddress;
    }
    public String getDestNetAddress( )
    {
        return this.local_destNetAddress;
    }
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
    }
}