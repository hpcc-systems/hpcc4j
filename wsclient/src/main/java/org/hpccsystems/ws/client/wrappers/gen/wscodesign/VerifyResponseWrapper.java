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
 * Class name: VerifyResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.VerifyResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 * TimeStamp: 2021-03-26T18:27:31.424Z
 */
public class VerifyResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_retCode;
    protected String local_errMsg;
    protected boolean local_isVerified;
    protected String local_signedBy;

    public VerifyResponseWrapper() {}

    public VerifyResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse verifyresponse)
    {
        copy( verifyresponse );
    }
    public VerifyResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _retCode, String _errMsg, boolean _isVerified, String _signedBy )
    {
        this.local_exceptions = _exceptions;
        this.local_retCode = _retCode;
        this.local_errMsg = _errMsg;
        this.local_isVerified = _isVerified;
        this.local_signedBy = _signedBy;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_retCode = raw.getRetCode();
        this.local_errMsg = raw.getErrMsg();
        this.local_isVerified = raw.getIsVerified();
        this.local_signedBy = raw.getSignedBy();

    }

    @Override
    public String toString()
    {
        return "VerifyResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "retCode = " + local_retCode + ", " + "errMsg = " + local_errMsg + ", " + "isVerified = " + local_isVerified + ", " + "signedBy = " + local_signedBy + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse raw = new org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.VerifyResponse();
        raw.setRetCode( local_retCode);
        raw.setErrMsg( local_errMsg);
        raw.setIsVerified( local_isVerified);
        raw.setSignedBy( local_signedBy);
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
    public void setIsVerified( boolean _isVerified )
    {
        this.local_isVerified = _isVerified;
    }
    public boolean getIsVerified( )
    {
        return this.local_isVerified;
    }
    public void setSignedBy( String _signedBy )
    {
        this.local_signedBy = _signedBy;
    }
    public String getSignedBy( )
    {
        return this.local_signedBy;
    }
}