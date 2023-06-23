package org.hpccsystems.ws.client.wrappers.gen.wscodesign;

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
 * Class name: SignRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 */
public class SignRequestWrapper
{
    protected SigningMethodTypeWrapper local_signingMethod;
    protected String local_userID;
    protected String local_keyPass;
    protected String local_text;

    public SignRequestWrapper() {}

    public SignRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest signrequest)
    {
        copy( signrequest );
    }
    public SignRequestWrapper( SigningMethodTypeWrapper _signingMethod, String _userID, String _keyPass, String _text )
    {
        this.local_signingMethod = _signingMethod;
        this.local_userID = _userID;
        this.local_keyPass = _keyPass;
        this.local_text = _text;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest raw )
    {
        if (raw == null)
            return;

        if (raw.getSigningMethod() != null)
            this.local_signingMethod = new SigningMethodTypeWrapper( raw.getSigningMethod());
        this.local_userID = raw.getUserID();
        this.local_keyPass = raw.getKeyPass();
        this.local_text = raw.getText();

    }

    @Override
    public String toString()
    {
        return "SignRequestWrapper [" + "signingMethod = " + local_signingMethod + ", " + "userID = " + local_userID + ", " + "keyPass = " + local_keyPass + ", " + "text = " + local_text + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest raw = new org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SignRequest();
        if (local_signingMethod != null)
            raw.setSigningMethod( local_signingMethod.getRaw());
        raw.setUserID( local_userID);
        raw.setKeyPass( local_keyPass);
        raw.setText( local_text);
        return raw;
    }


    public void setSigningMethod( SigningMethodTypeWrapper _signingMethod )
    {
        this.local_signingMethod = _signingMethod;
    }
    public SigningMethodTypeWrapper getSigningMethod( )
    {
        return this.local_signingMethod;
    }
    public void setUserID( String _userID )
    {
        this.local_userID = _userID;
    }
    public String getUserID( )
    {
        return this.local_userID;
    }
    public void setKeyPass( String _keyPass )
    {
        this.local_keyPass = _keyPass;
    }
    public String getKeyPass( )
    {
        return this.local_keyPass;
    }
    public void setText( String _text )
    {
        this.local_text = _text;
    }
    public String getText( )
    {
        return this.local_text;
    }
}