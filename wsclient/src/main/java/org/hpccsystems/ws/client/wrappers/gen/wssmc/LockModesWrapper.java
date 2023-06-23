package org.hpccsystems.ws.client.wrappers.gen.wssmc;

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
 * Class name: LockModesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 */
public class LockModesWrapper
{
    protected String local_lockModes;

    public LockModesWrapper() {}

    public LockModesWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes lockmodes)
    {
        copy( lockmodes );
    }
    public LockModesWrapper( String _lockModes )
    {
        this.local_lockModes = _lockModes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getLockModes();

    }

    @Override
    public String toString()
    {
        return "LockModesWrapper [" + "lockModes = " + local_lockModes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.LockModes raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setLockModes(lockModes);
        return raw;
    }


    public void setLockModes( String _lockModes )
    {
        this.local_lockModes = _lockModes;
    }
    public String getLockModes( )
    {
        return this.local_lockModes;
    }
}