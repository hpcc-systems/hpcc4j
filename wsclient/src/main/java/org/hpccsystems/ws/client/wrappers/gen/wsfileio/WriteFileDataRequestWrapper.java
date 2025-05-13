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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WriteFileDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class WriteFileDataRequestWrapper
{
    protected DataHandler local_data;
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected String local_destNetAddress;
    protected long local_offset;
    protected boolean local_append;

    public WriteFileDataRequestWrapper() {}

    public WriteFileDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest writefiledatarequest)
    {
        copy( writefiledatarequest );
    }
    public WriteFileDataRequestWrapper( DataHandler _data, String _destDropZone, String _destRelativePath, String _destNetAddress, long _offset, boolean _append )
    {
        this.local_data = _data;
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_destNetAddress = _destNetAddress;
        this.local_offset = _offset;
        this.local_append = _append;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest raw )
    {
        if (raw == null)
            return;

        this.local_data = raw.getData();
        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_destNetAddress = raw.getDestNetAddress();
        this.local_offset = raw.getOffset();
        this.local_append = raw.getAppend();

    }

    @Override
    public String toString()
    {
        return "WriteFileDataRequestWrapper [" + "data = " + local_data + ", " + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "destNetAddress = " + local_destNetAddress + ", " + "offset = " + local_offset + ", " + "append = " + local_append + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataRequest();
        raw.setData( local_data);
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setDestNetAddress( local_destNetAddress);
        raw.setOffset( local_offset);
        raw.setAppend( local_append);
        return raw;
    }


    public void setData( DataHandler _data )
    {
        this.local_data = _data;
    }
    public DataHandler getData( )
    {
        return this.local_data;
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
    public void setAppend( boolean _append )
    {
        this.local_append = _append;
    }
    public boolean getAppend( )
    {
        return this.local_append;
    }
}