package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



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
 * WrapperMaker version: 1.7
 * Class name: ErrorMessageFormatWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * Service version: 1.92
 */
public class ErrorMessageFormatWrapper
{
    protected String local_errorMessageFormat;

    public ErrorMessageFormatWrapper() {}

    public ErrorMessageFormatWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat errormessageformat)
    {
        copy( errormessageformat );
    }
    public ErrorMessageFormatWrapper( String _errorMessageFormat )
    {
        this.local_errorMessageFormat = _errorMessageFormat;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getErrorMessageFormat();

    }

    @Override
    public String toString()
    {
        return "ErrorMessageFormatWrapper [" + "errorMessageFormat = " + local_errorMessageFormat + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ErrorMessageFormat raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setErrorMessageFormat(errorMessageFormat);
        return raw;
    }


    public void setErrorMessageFormat( String _errorMessageFormat )
    {
        this.local_errorMessageFormat = _errorMessageFormat;
    }
    public String getErrorMessageFormat( )
    {
        return this.local_errorMessageFormat;
    }
}