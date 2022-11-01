package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUArrayActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.855Z
 */
public class DFUArrayActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_backToPage;
    protected String local_redirectTo;
    protected ArrayOfDFUActionInfoWrapper local_actionResults;

    public DFUArrayActionResponseWrapper() {}

    public DFUArrayActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse dfuarrayactionresponse)
    {
        copy( dfuarrayactionresponse );
    }
    public DFUArrayActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _backToPage, String _redirectTo, ArrayOfDFUActionInfoWrapper _actionResults )
    {
        this.local_exceptions = _exceptions;
        this.local_backToPage = _backToPage;
        this.local_redirectTo = _redirectTo;
        this.local_actionResults = _actionResults;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_backToPage = raw.getBackToPage();
        this.local_redirectTo = raw.getRedirectTo();
        if (raw.getActionResults() != null)
            this.local_actionResults = new ArrayOfDFUActionInfoWrapper( raw.getActionResults());

    }

    @Override
    public String toString()
    {
        return "DFUArrayActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "backToPage = " + local_backToPage + ", " + "redirectTo = " + local_redirectTo + ", " + "actionResults = " + local_actionResults + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUArrayActionResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setBackToPage( local_backToPage);
        raw.setRedirectTo( local_redirectTo);
        raw.setActionResults( local_actionResults.getRaw());
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
    public void setBackToPage( String _backToPage )
    {
        this.local_backToPage = _backToPage;
    }
    public String getBackToPage( )
    {
        return this.local_backToPage;
    }
    public void setRedirectTo( String _redirectTo )
    {
        this.local_redirectTo = _redirectTo;
    }
    public String getRedirectTo( )
    {
        return this.local_redirectTo;
    }
    public void setActionResults( ArrayOfDFUActionInfoWrapper _actionResults )
    {
        this.local_actionResults = _actionResults;
    }
    public ArrayOfDFUActionInfoWrapper getActionResults( )
    {
        return this.local_actionResults;
    }
}