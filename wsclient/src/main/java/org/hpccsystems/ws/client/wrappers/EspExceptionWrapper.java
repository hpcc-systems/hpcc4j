package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspException;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2019-08-03T01:15:45.832Z
 */
public class EspExceptionWrapper extends BaseExceptionWrapper
{
    protected String audience;
    protected String code;

    public EspExceptionWrapper() {}

	public EspExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException espexception)
	{
		copy( espexception );
	}

	public EspExceptionWrapper( String _code, String _audience, String _source, String _message )
	{
		this.code = _code;
		this.audience = _audience;
		this.source = _source;
		this.message = _message;

	}

	public EspExceptionWrapper(EspExceptionWrapper espExceptionWrapper)
    {
	    this.code = espExceptionWrapper.getCode();
        this.audience = espExceptionWrapper.getAudience();
        this.source = espExceptionWrapper.getSource();
        this.message = espExceptionWrapper.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsfileio.v1_00.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.v1_03.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsstore.v1_01.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wstopology.v1_28.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException raw )
	{
		this.code = raw.getCode();
		this.audience = raw.getAudience();
		this.source = raw.getSource();
		this.message = raw.getMessage();
	}

	@Override
	public String toString()
	{		
	    return     "EspException: Audience: " + getAudience() + " Source: " + getSource() + " Message: " + getMessage();
	}
	public org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException raw = new org.hpccsystems.ws.client.gen.axis2.filespray.v1_17.EspException();
		raw.setCode( code);
		raw.setAudience( audience);
		raw.setSource( source);
		raw.setMessage( message);
		return raw;
	}	
	
    public void setAudience( String _audience )
    {
        this.audience = _audience;
    }
    public String getAudience( )
    {
        return this.audience;
    }
    
    public void setCode( String _code )
    {
        this.code = _code;
    }
    public String getCode( )
    {
        return this.code;
    }

}