package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
import org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetDFUServerQueuesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.834Z
 */
public class GetDFUServerQueuesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected List<String> local_names = null;

    public GetDFUServerQueuesResponseWrapper() {}

    public GetDFUServerQueuesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse getdfuserverqueuesresponse)
    {
        copy( getdfuserverqueuesresponse );
    }
    public GetDFUServerQueuesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, List<String> _names )
    {
        this.local_exceptions = _exceptions;
        this.local_names = _names;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getNames() != null)
        {
            this.local_names = new ArrayList<String>();
            for ( int i = 0; i < raw.getNames().getItem().length; i++)
            {
                this.local_names.add(new String(raw.getNames().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "GetDFUServerQueuesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "names = " + local_names + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.GetDFUServerQueuesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (this.local_names!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_names.size(); i++)
            {
                arr.addItem(this.local_names.get(i));
            }
            raw.setNames(arr);
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
    public void setNames( List<String> _names )
    {
        this.local_names = _names;
    }
    public List<String> getNames( )
    {
        return this.local_names;
    }
}