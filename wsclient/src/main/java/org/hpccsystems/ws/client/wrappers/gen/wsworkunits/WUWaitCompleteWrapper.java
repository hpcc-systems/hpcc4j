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
 * Class name: WUWaitCompleteWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:17.002Z
 */
public class WUWaitCompleteWrapper
{
    protected String local_wuid;
    protected int local_wait;
    protected boolean local_returnOnWait;

    public WUWaitCompleteWrapper() {}

    public WUWaitCompleteWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete wuwaitcomplete)
    {
        copy( wuwaitcomplete );
    }
    public WUWaitCompleteWrapper( String _wuid, int _wait, boolean _returnOnWait )
    {
        this.local_wuid = _wuid;
        this.local_wait = _wait;
        this.local_returnOnWait = _returnOnWait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_wait = raw.getWait();
        this.local_returnOnWait = raw.getReturnOnWait();

    }

    @Override
    public String toString()
    {
        return "WUWaitCompleteWrapper [" + "wuid = " + local_wuid + ", " + "wait = " + local_wait + ", " + "returnOnWait = " + local_returnOnWait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUWaitComplete();
        raw.setWuid( local_wuid);
        raw.setWait( local_wait);
        raw.setReturnOnWait( local_returnOnWait);
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
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setReturnOnWait( boolean _returnOnWait )
    {
        this.local_returnOnWait = _returnOnWait;
    }
    public boolean getReturnOnWait( )
    {
        return this.local_returnOnWait;
    }
}