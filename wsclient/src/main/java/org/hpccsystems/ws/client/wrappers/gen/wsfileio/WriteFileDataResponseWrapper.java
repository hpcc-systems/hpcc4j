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
 * Class name: WriteFileDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class WriteFileDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected long local_offset;
    protected boolean local_append;
    protected String local_result;

    public WriteFileDataResponseWrapper() {}

    public WriteFileDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse writefiledataresponse)
    {
        copy( writefiledataresponse );
    }
    public WriteFileDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _destDropZone, String _destRelativePath, long _offset, boolean _append, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_offset = _offset;
        this.local_append = _append;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_offset = raw.getOffset();
        this.local_append = raw.getAppend();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WriteFileDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "offset = " + local_offset + ", " + "append = " + local_append + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.WriteFileDataResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setOffset( local_offset);
        raw.setAppend( local_append);
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
    public void setAppend( boolean _append )
    {
        this.local_append = _append;
    }
    public boolean getAppend( )
    {
        return this.local_append;
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