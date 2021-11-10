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
 * Class name: SigningMethodTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscodesign.v1_01.SigningMethodType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscodesign
 * TimeStamp: 2021-03-26T18:27:31.411Z
 */
public class SigningMethodTypeWrapper
{
    protected String local_signingMethodType;

    public SigningMethodTypeWrapper() {}

    public SigningMethodTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SigningMethodType signingmethodtype)
    {
        copy( signingmethodtype );
    }
    public SigningMethodTypeWrapper( String _signingMethodType )
    {
        this.local_signingMethodType = _signingMethodType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SigningMethodType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getSigningMethodType();

    }

    @Override
    public String toString()
    {
        return "SigningMethodTypeWrapper [" + "signingMethodType = " + local_signingMethodType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SigningMethodType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.SigningMethodType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setSigningMethodType(signingMethodType);
        return raw;
    }


    public void setSigningMethodType( String _signingMethodType )
    {
        this.local_signingMethodType = _signingMethodType;
    }
    public String getSigningMethodType( )
    {
        return this.local_signingMethodType;
    }
}