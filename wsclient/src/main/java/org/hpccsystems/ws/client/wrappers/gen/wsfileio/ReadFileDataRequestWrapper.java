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
 * Class name: ReadFileDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class ReadFileDataRequestWrapper
{
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected String local_destNetAddress;
    protected long local_offset;
    protected long local_dataSize;

    public ReadFileDataRequestWrapper() {}

    public ReadFileDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest readfiledatarequest)
    {
        copy( readfiledatarequest );
    }
    public ReadFileDataRequestWrapper( String _destDropZone, String _destRelativePath, String _destNetAddress, long _offset, long _dataSize )
    {
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_destNetAddress = _destNetAddress;
        this.local_offset = _offset;
        this.local_dataSize = _dataSize;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest raw )
    {
        if (raw == null)
            return;

        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_destNetAddress = raw.getDestNetAddress();
        this.local_offset = raw.getOffset();
        this.local_dataSize = raw.getDataSize();

    }

    @Override
    public String toString()
    {
        return "ReadFileDataRequestWrapper [" + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "destNetAddress = " + local_destNetAddress + ", " + "offset = " + local_offset + ", " + "dataSize = " + local_dataSize + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataRequest();
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setDestNetAddress( local_destNetAddress);
        raw.setOffset( local_offset);
        raw.setDataSize( local_dataSize);
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
    public void setOffset( long _offset )
    {
        this.local_offset = _offset;
    }
    public long getOffset( )
    {
        return this.local_offset;
    }
    public void setDataSize( long _dataSize )
    {
        this.local_dataSize = _dataSize;
    }
    public long getDataSize( )
    {
        return this.local_dataSize;
    }
}