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
 * Class name: CreateFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsfileio
 */
public class CreateFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_destDropZone;
    protected String local_destRelativePath;
    protected boolean local_overwrite;
    protected String local_result;

    public CreateFileResponseWrapper() {}

    public CreateFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse createfileresponse)
    {
        copy( createfileresponse );
    }
    public CreateFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _destDropZone, String _destRelativePath, boolean _overwrite, String _result )
    {
        this.local_exceptions = _exceptions;
        this.local_destDropZone = _destDropZone;
        this.local_destRelativePath = _destRelativePath;
        this.local_overwrite = _overwrite;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_destDropZone = raw.getDestDropZone();
        this.local_destRelativePath = raw.getDestRelativePath();
        this.local_overwrite = raw.getOverwrite();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "CreateFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "destDropZone = " + local_destDropZone + ", " + "destRelativePath = " + local_destRelativePath + ", " + "overwrite = " + local_overwrite + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.CreateFileResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setDestDropZone( local_destDropZone);
        raw.setDestRelativePath( local_destRelativePath);
        raw.setOverwrite( local_overwrite);
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
    public void setOverwrite( boolean _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public boolean getOverwrite( )
    {
        return this.local_overwrite;
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