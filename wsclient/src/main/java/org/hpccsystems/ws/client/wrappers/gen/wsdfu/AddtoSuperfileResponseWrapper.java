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
 * Class name: AddtoSuperfileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.840Z
 */
public class AddtoSuperfileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_subfiles;
    protected String local_backToPage;
    protected SubfileNames_type0Wrapper local_subfileNames;

    public AddtoSuperfileResponseWrapper() {}

    public AddtoSuperfileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse addtosuperfileresponse)
    {
        copy( addtosuperfileresponse );
    }
    public AddtoSuperfileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _subfiles, String _backToPage, SubfileNames_type0Wrapper _subfileNames )
    {
        this.local_exceptions = _exceptions;
        this.local_subfiles = _subfiles;
        this.local_backToPage = _backToPage;
        this.local_subfileNames = _subfileNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_subfiles = raw.getSubfiles();
        this.local_backToPage = raw.getBackToPage();
        if (raw.getSubfileNames() != null)
            this.local_subfileNames = new SubfileNames_type0Wrapper( raw.getSubfileNames());

    }

    @Override
    public String toString()
    {
        return "AddtoSuperfileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "subfiles = " + local_subfiles + ", " + "backToPage = " + local_backToPage + ", " + "subfileNames = " + local_subfileNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddtoSuperfileResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setSubfiles( local_subfiles);
        raw.setBackToPage( local_backToPage);
        raw.setSubfileNames( local_subfileNames.getRaw());
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
    public void setSubfiles( String _subfiles )
    {
        this.local_subfiles = _subfiles;
    }
    public String getSubfiles( )
    {
        return this.local_subfiles;
    }
    public void setBackToPage( String _backToPage )
    {
        this.local_backToPage = _backToPage;
    }
    public String getBackToPage( )
    {
        return this.local_backToPage;
    }
    public void setSubfileNames( SubfileNames_type0Wrapper _subfileNames )
    {
        this.local_subfileNames = _subfileNames;
    }
    public SubfileNames_type0Wrapper getSubfileNames( )
    {
        return this.local_subfileNames;
    }
}