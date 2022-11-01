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
 * Class name: WUResubmitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.600Z
 */
public class WUResubmitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected WUs_type0Wrapper local_wUs;

    public WUResubmitResponseWrapper() {}

    public WUResubmitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse wuresubmitresponse)
    {
        copy( wuresubmitresponse );
    }
    public WUResubmitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, WUs_type0Wrapper _wUs )
    {
        this.local_exceptions = _exceptions;
        this.local_wUs = _wUs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getWUs() != null)
            this.local_wUs = new WUs_type0Wrapper( raw.getWUs());

    }

    @Override
    public String toString()
    {
        return "WUResubmitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wUs = " + local_wUs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUResubmitResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_wUs != null)
            raw.setWUs( local_wUs.getRaw());
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
    public void setWUs( WUs_type0Wrapper _wUs )
    {
        this.local_wUs = _wUs;
    }
    public WUs_type0Wrapper getWUs( )
    {
        return this.local_wUs;
    }
}