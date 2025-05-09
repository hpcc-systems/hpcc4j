package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: EspSoapFaultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class EspSoapFaultWrapper
{
    protected ExceptionsWrapper local_faultMessage;

    public EspSoapFaultWrapper() {}

    public EspSoapFaultWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault espsoapfault)
    {
        copy( espsoapfault );
    }
    public EspSoapFaultWrapper( ExceptionsWrapper _faultMessage )
    {
        this.local_faultMessage = _faultMessage;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault raw )
    {
        if (raw == null)
            return;

        if (raw.getFaultMessage() != null)
            this.local_faultMessage = new ExceptionsWrapper( raw.getFaultMessage());

    }

    @Override
    public String toString()
    {
        return "EspSoapFaultWrapper [" + "faultMessage = " + local_faultMessage + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspSoapFault();
        if (local_faultMessage != null)
            raw.setFaultMessage( local_faultMessage.getRaw());
        return raw;
    }


    public void setFaultMessage( ExceptionsWrapper _faultMessage )
    {
        this.local_faultMessage = _faultMessage;
    }
    public ExceptionsWrapper getFaultMessage( )
    {
        return this.local_faultMessage;
    }
}