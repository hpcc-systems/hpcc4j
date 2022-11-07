package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;



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
 * Class name: EchoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-07-25T17:42:18.153Z
 */
public class EchoRequestWrapper
{
    protected String local_request;

    public EchoRequestWrapper() {}

    public EchoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest echorequest)
    {
        copy( echorequest );
    }
    public EchoRequestWrapper( String _request )
    {
        this.local_request = _request;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest raw )
    {
        if (raw == null)
            return;

        this.local_request = raw.getRequest();

    }

    @Override
    public String toString()
    {
        return "EchoRequestWrapper [" + "request = " + local_request + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EchoRequest();
        raw.setRequest( local_request);
        return raw;
    }


    public void setRequest( String _request )
    {
        this.local_request = _request;
    }
    public String getRequest( )
    {
        return this.local_request;
    }
}