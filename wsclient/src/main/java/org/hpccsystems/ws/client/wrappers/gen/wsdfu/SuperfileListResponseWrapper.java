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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: SuperfileListResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.939Z
 */
public class SuperfileListResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_superfile;
    protected List<String> local_subfiles = null;

    public SuperfileListResponseWrapper() {}

    public SuperfileListResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse superfilelistresponse)
    {
        copy( superfilelistresponse );
    }
    public SuperfileListResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _superfile, List<String> _subfiles )
    {
        this.local_exceptions = _exceptions;
        this.local_superfile = _superfile;
        this.local_subfiles = _subfiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_superfile = raw.getSuperfile();
        if (raw.getSubfiles() != null)
        {
            this.local_subfiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getSubfiles().getItem().length; i++)
            {
                this.local_subfiles.add(new String(raw.getSubfiles().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "SuperfileListResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "superfile = " + local_superfile + ", " + "subfiles = " + local_subfiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SuperfileListResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setSuperfile( local_superfile);
        if (this.local_subfiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_subfiles.size(); i++)
            {
                arr.addItem(this.local_subfiles.get(i));
            }
            raw.setSubfiles(arr);
        }
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
    public void setSuperfile( String _superfile )
    {
        this.local_superfile = _superfile;
    }
    public String getSuperfile( )
    {
        return this.local_superfile;
    }
    public void setSubfiles( List<String> _subfiles )
    {
        this.local_subfiles = _subfiles;
    }
    public List<String> getSubfiles( )
    {
        return this.local_subfiles;
    }
}