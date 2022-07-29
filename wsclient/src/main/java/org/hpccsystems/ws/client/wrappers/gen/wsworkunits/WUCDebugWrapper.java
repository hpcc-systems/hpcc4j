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
 * Class name: WUCDebugWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.881Z
 */
public class WUCDebugWrapper
{
    protected String local_wuid;
    protected String local_command;

    public WUCDebugWrapper() {}

    public WUCDebugWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug wucdebug)
    {
        copy( wucdebug );
    }
    public WUCDebugWrapper( String _wuid, String _command )
    {
        this.local_wuid = _wuid;
        this.local_command = _command;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_command = raw.getCommand();

    }

    @Override
    public String toString()
    {
        return "WUCDebugWrapper [" + "wuid = " + local_wuid + ", " + "command = " + local_command + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCDebug();
        raw.setWuid( local_wuid);
        raw.setCommand( local_command);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setCommand( String _command )
    {
        this.local_command = _command;
    }
    public String getCommand( )
    {
        return this.local_command;
    }
}