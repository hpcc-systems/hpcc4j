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
 * Class name: WUDetailsAttrValueTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsAttrValueType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.902Z
 */
public class WUDetailsAttrValueTypeWrapper
{
    protected String local_wUDetailsAttrValueType;

    public WUDetailsAttrValueTypeWrapper() {}

    public WUDetailsAttrValueTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsAttrValueType wudetailsattrvaluetype)
    {
        copy( wudetailsattrvaluetype );
    }
    public WUDetailsAttrValueTypeWrapper( String _wUDetailsAttrValueType )
    {
        this.local_wUDetailsAttrValueType = _wUDetailsAttrValueType;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsAttrValueType raw )
    {
        if (raw == null)
            return;

//Warning raw class does not provide expected method: getWUDetailsAttrValueType();

    }

    @Override
    public String toString()
    {
        return "WUDetailsAttrValueTypeWrapper [" + "wUDetailsAttrValueType = " + local_wUDetailsAttrValueType + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsAttrValueType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDetailsAttrValueType raw = null;
 //WARNING base class does not provide expected default constructor//Warning raw class doe not provide expected method: setWUDetailsAttrValueType(wUDetailsAttrValueType);
        return raw;
    }


    public void setWUDetailsAttrValueType( String _wUDetailsAttrValueType )
    {
        this.local_wUDetailsAttrValueType = _wUDetailsAttrValueType;
    }
    public String getWUDetailsAttrValueType( )
    {
        return this.local_wUDetailsAttrValueType;
    }
}