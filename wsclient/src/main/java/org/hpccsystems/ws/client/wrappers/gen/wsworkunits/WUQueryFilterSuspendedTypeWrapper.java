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
 * Class name: WUQueryFilterSuspendedTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilterSuspendedType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.967Z
 */
public class WUQueryFilterSuspendedTypeWrapper
{
    protected String local_wUQueryFilterSuspendedType;

    public WUQueryFilterSuspendedTypeWrapper() {}

    public WUQueryFilterSuspendedTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilterSuspendedType wuqueryfiltersuspendedtype)
    {
        copy( wuqueryfiltersuspendedtype );
    }
    public WUQueryFilterSuspendedTypeWrapper( String _wUQueryFilterSuspendedType )
    {
        this.local_wUQueryFilterSuspendedType = _wUQueryFilterSuspendedType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilterSuspendedType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUQueryFilterSuspendedType();

    }

    @Override
    public String toString()
    {
        return "WUQueryFilterSuspendedTypeWrapper [" + "wUQueryFilterSuspendedType = " + local_wUQueryFilterSuspendedType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilterSuspendedType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryFilterSuspendedType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUQueryFilterSuspendedType(wUQueryFilterSuspendedType);
        return raw;
    }


    public void setWUQueryFilterSuspendedType( String _wUQueryFilterSuspendedType )
    {
        this.local_wUQueryFilterSuspendedType = _wUQueryFilterSuspendedType;
    }
    public String getWUQueryFilterSuspendedType( )
    {
        return this.local_wUQueryFilterSuspendedType;
    }
}