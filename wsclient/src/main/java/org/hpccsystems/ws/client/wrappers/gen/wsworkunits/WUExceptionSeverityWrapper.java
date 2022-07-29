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
 * Class name: WUExceptionSeverityWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExceptionSeverity
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.909Z
 */
public class WUExceptionSeverityWrapper
{
    protected String local_wUExceptionSeverity;

    public WUExceptionSeverityWrapper() {}

    public WUExceptionSeverityWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExceptionSeverity wuexceptionseverity)
    {
        copy( wuexceptionseverity );
    }
    public WUExceptionSeverityWrapper( String _wUExceptionSeverity )
    {
        this.local_wUExceptionSeverity = _wUExceptionSeverity;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExceptionSeverity raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUExceptionSeverity();

    }

    @Override
    public String toString()
    {
        return "WUExceptionSeverityWrapper [" + "wUExceptionSeverity = " + local_wUExceptionSeverity + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExceptionSeverity getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExceptionSeverity raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUExceptionSeverity(wUExceptionSeverity);
        return raw;
    }


    public void setWUExceptionSeverity( String _wUExceptionSeverity )
    {
        this.local_wUExceptionSeverity = _wUExceptionSeverity;
    }
    public String getWUExceptionSeverity( )
    {
        return this.local_wUExceptionSeverity;
    }
}