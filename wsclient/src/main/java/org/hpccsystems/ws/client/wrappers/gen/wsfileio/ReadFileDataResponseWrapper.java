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
 * Class name: ReadFileDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class ReadFileDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DataHandler local_data;
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected long local_offset;
    protected long local_dataSize;
    protected String local_result;

    public ReadFileDataResponseWrapper() {}

    public ReadFileDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse readfiledataresponse)
    {
        copy( readfiledataresponse );
    }
    public ReadFileDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _data, String _destDropZone, String _destRelativePath, long _offset, long _dataSize, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_data = _data;
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_offset = _offset;
        this.local_dataSize = _dataSize;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_data = raw.getData();
        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_offset = raw.getOffset();
        this.local_dataSize = raw.getDataSize();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "ReadFileDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "data = " + local_data + ", " + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "offset = " + local_offset + ", " + "dataSize = " + local_dataSize + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.ReadFileDataResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setData( local_data);
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setOffset( local_offset);
        raw.setDataSize( local_dataSize);
        raw.setResult( local_result);
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
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
}