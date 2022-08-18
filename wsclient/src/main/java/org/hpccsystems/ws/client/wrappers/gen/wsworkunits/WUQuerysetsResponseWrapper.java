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
 * Class name: WUQuerysetsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.980Z
 */
public class WUQuerysetsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfQuerySetWrapper local_querysets;

    public WUQuerysetsResponseWrapper() {}

    public WUQuerysetsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse wuquerysetsresponse)
    {
        copy( wuquerysetsresponse );
    }
    public WUQuerysetsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfQuerySetWrapper _querysets )
    {
        this.local_exceptions = _exceptions;
        this.local_querysets = _querysets;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getQuerysets() != null)
            this.local_querysets = new ArrayOfQuerySetWrapper( raw.getQuerysets());

    }

    @Override
    public String toString()
    {
        return "WUQuerysetsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "querysets = " + local_querysets + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetsResponse();
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
    public void setQuerysets( ArrayOfQuerySetWrapper _querysets )
    {
        this.local_querysets = _querysets;
    }
    public ArrayOfQuerySetWrapper getQuerysets( )
    {
        return this.local_querysets;
    }
}