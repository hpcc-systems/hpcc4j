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
 * Class name: EspExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class EspExceptionWrapper
{
    protected String local_code;
    protected String local_audience;
    protected String local_source;
    protected String local_message;

    public EspExceptionWrapper() {}

    public EspExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException espexception)
    {
        copy( espexception );
    }
    public EspExceptionWrapper( String _code, String _audience, String _source, String _message )
    {
        this.local_code = _code;
        this.local_audience = _audience;
        this.local_source = _source;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException raw )
    {
        if (raw == null)
            return;

        this.local_code = raw.getCode();
        this.local_audience = raw.getAudience();
        this.local_source = raw.getSource();
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "EspExceptionWrapper [" + "code = " + local_code + ", " + "audience = " + local_audience + ", " + "source = " + local_source + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException();
        raw.setCode( local_code);
        raw.setAudience( local_audience);
        raw.setSource( local_source);
        raw.setMessage( local_message);
        return raw;
    }


    public void setCode( String _code )
    {
        this.local_code = _code;
    }
    public String getCode( )
    {
        return this.local_code;
    }
    public void setAudience( String _audience )
    {
        this.local_audience = _audience;
    }
    public String getAudience( )
    {
        return this.local_audience;
    }
    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
}