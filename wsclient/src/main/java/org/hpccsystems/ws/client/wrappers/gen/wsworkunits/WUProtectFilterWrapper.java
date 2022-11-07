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
 * Class name: WUProtectFilterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtectFilter
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.951Z
 */
public class WUProtectFilterWrapper
{
    protected String local_wUProtectFilter;

    public WUProtectFilterWrapper() {}

    public WUProtectFilterWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtectFilter wuprotectfilter)
    {
        copy( wuprotectfilter );
    }
    public WUProtectFilterWrapper( String _wUProtectFilter )
    {
        this.local_wUProtectFilter = _wUProtectFilter;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtectFilter raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUProtectFilter();

    }

    @Override
    public String toString()
    {
        return "WUProtectFilterWrapper [" + "wUProtectFilter = " + local_wUProtectFilter + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtectFilter getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProtectFilter raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUProtectFilter(wUProtectFilter);
        return raw;
    }


    public void setWUProtectFilter( String _wUProtectFilter )
    {
        this.local_wUProtectFilter = _wUProtectFilter;
    }
    public String getWUProtectFilter( )
    {
        return this.local_wUProtectFilter;
    }
}