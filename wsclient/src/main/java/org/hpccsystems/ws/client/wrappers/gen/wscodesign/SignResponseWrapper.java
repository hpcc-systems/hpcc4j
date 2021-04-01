package org.hpccsystems.ws.client.wrappers.gen.wscodesign;



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
 * Class name: SignResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 * TimeStamp: 2021-03-26T18:27:31.417Z
 */
public class SignResponseWrapper
{
	protected ArrayOfEspExceptionWrapper local_exceptions;
	protected int local_retCode;
	protected String local_errMsg;
	protected String local_signedText;

	public SignResponseWrapper() {}

	public SignResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse signresponse)
	{
		copy( signresponse );
	}
	public SignResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _retCode, String _errMsg, String _signedText )
	{
		this.local_exceptions = _exceptions;
		this.local_retCode = _retCode;
		this.local_errMsg = _errMsg;
		this.local_signedText = _signedText;

	}

	private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse raw )
	{
		if (raw == null)
			return;

		if (raw.getExceptions() != null)
			this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
		this.local_retCode = raw.getRetCode();
		this.local_errMsg = raw.getErrMsg();
		this.local_signedText = raw.getSignedText();

	}

	@Override
	public String toString()
	{
		return "SignResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "retCode = " + local_retCode + ", " + "errMsg = " + local_errMsg + ", " + "signedText = " + local_signedText + "]";
	}
	public org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse getRaw()
	{
		org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse raw = new org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SignResponse();
		raw.setRetCode( local_retCode);
		raw.setErrMsg( local_errMsg);
		raw.setSignedText( local_signedText);
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
	public void setRetCode( int _retCode )
	{
		this.local_retCode = _retCode;
	}
	public int getRetCode( )
	{
		return this.local_retCode;
	}
	public void setErrMsg( String _errMsg )
	{
		this.local_errMsg = _errMsg;
	}
	public String getErrMsg( )
	{
		return this.local_errMsg;
	}
	public void setSignedText( String _signedText )
	{
		this.local_signedText = _signedText;
	}
	public String getSignedText( )
	{
		return this.local_signedText;
	}
}