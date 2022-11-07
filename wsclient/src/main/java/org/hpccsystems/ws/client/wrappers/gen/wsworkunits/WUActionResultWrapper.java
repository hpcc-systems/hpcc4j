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
 * Class name: WUActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.878Z
 */
public class WUActionResultWrapper
{
    protected String local_wuid;
    protected String local_action;
    protected String local_result;

    public WUActionResultWrapper() {}

    public WUActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult wuactionresult)
    {
        copy( wuactionresult );
    }
    public WUActionResultWrapper( String _wuid, String _action, String _result )
    {
        this.local_wuid = _wuid;
        this.local_action = _action;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_action = raw.getAction();
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUActionResultWrapper [" + "wuid = " + local_wuid + ", " + "action = " + local_action + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUActionResult();
        raw.setWuid( local_wuid);
        raw.setAction( local_action);
        raw.setResult( local_result);
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
    public void setAction( String _action )
    {
        this.local_action = _action;
    }
    public String getAction( )
    {
        return this.local_action;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
}