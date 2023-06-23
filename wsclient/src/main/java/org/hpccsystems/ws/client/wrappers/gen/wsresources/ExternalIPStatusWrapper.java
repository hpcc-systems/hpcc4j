package org.hpccsystems.ws.client.wrappers.gen.wsresources;

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
 * Class name: ExternalIPStatusWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 */
public class ExternalIPStatusWrapper
{
    protected String local_externalIPStatus;

    public ExternalIPStatusWrapper() {}

    public ExternalIPStatusWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus externalipstatus)
    {
        copy( externalipstatus );
    }
    public ExternalIPStatusWrapper( String _externalIPStatus )
    {
        this.local_externalIPStatus = _externalIPStatus;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getExternalIPStatus();

    }

    @Override
    public String toString()
    {
        return "ExternalIPStatusWrapper [" + "externalIPStatus = " + local_externalIPStatus + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.ExternalIPStatus raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setExternalIPStatus(externalIPStatus);
        return raw;
    }


    public void setExternalIPStatus( String _externalIPStatus )
    {
        this.local_externalIPStatus = _externalIPStatus;
    }
    public String getExternalIPStatus( )
    {
        return this.local_externalIPStatus;
    }
}