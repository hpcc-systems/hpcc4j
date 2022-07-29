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
 * Class name: WUGetZAPInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.924Z
 */
public class WUGetZAPInfoWrapper
{
    protected String local_wUID;

    public WUGetZAPInfoWrapper() {}

    public WUGetZAPInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo wugetzapinfo)
    {
        copy( wugetzapinfo );
    }
    public WUGetZAPInfoWrapper( String _wUID )
    {
        this.local_wUID = _wUID;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo raw )
    {
        if (raw == null)
            return;

        this.local_wUID = raw.getWUID();

    }

    @Override
    public String toString()
    {
        return "WUGetZAPInfoWrapper [" + "wUID = " + local_wUID + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetZAPInfo();
        raw.setWUID( local_wUID);
        return raw;
    }


    public void setWUID( String _wUID )
    {
        this.local_wUID = _wUID;
    }
    public String getWUID( )
    {
        return this.local_wUID;
    }
}