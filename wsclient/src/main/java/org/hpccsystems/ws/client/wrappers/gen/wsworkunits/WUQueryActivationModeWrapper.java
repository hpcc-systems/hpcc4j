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
 * Class name: WUQueryActivationModeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.960Z
 */
public class WUQueryActivationModeWrapper
{
    protected int local_wUQueryActivationMode;

    public WUQueryActivationModeWrapper() {}

    public WUQueryActivationModeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode wuqueryactivationmode)
    {
        copy( wuqueryactivationmode );
    }
    public WUQueryActivationModeWrapper( int _wUQueryActivationMode )
    {
        this.local_wUQueryActivationMode = _wUQueryActivationMode;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUQueryActivationMode();

    }

    @Override
    public String toString()
    {
        return "WUQueryActivationModeWrapper [" + "wUQueryActivationMode = " + local_wUQueryActivationMode + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryActivationMode raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUQueryActivationMode(wUQueryActivationMode);
        return raw;
    }


    public void setWUQueryActivationMode( int _wUQueryActivationMode )
    {
        this.local_wUQueryActivationMode = _wUQueryActivationMode;
    }
    public int getWUQueryActivationMode( )
    {
        return this.local_wUQueryActivationMode;
    }
}