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
 * Class name: WUQuerySetFilterTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetFilterType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.976Z
 */
public class WUQuerySetFilterTypeWrapper
{
    protected String local_wUQuerySetFilterType;

    public WUQuerySetFilterTypeWrapper() {}

    public WUQuerySetFilterTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetFilterType wuquerysetfiltertype)
    {
        copy( wuquerysetfiltertype );
    }
    public WUQuerySetFilterTypeWrapper( String _wUQuerySetFilterType )
    {
        this.local_wUQuerySetFilterType = _wUQuerySetFilterType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetFilterType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUQuerySetFilterType();

    }

    @Override
    public String toString()
    {
        return "WUQuerySetFilterTypeWrapper [" + "wUQuerySetFilterType = " + local_wUQuerySetFilterType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetFilterType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetFilterType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUQuerySetFilterType(wUQuerySetFilterType);
        return raw;
    }


    public void setWUQuerySetFilterType( String _wUQuerySetFilterType )
    {
        this.local_wUQuerySetFilterType = _wUQuerySetFilterType;
    }
    public String getWUQuerySetFilterType( )
    {
        return this.local_wUQuerySetFilterType;
    }
}