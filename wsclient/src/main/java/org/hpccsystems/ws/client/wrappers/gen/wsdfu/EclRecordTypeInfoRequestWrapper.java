package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: EclRecordTypeInfoRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.154Z
 */
public class EclRecordTypeInfoRequestWrapper
{
    protected String local_ecl;
    protected boolean local_includeJsonTypeInfo;
    protected boolean local_includeBinTypeInfo;

    public EclRecordTypeInfoRequestWrapper() {}

    public EclRecordTypeInfoRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest eclrecordtypeinforequest)
    {
        copy( eclrecordtypeinforequest );
    }
    public EclRecordTypeInfoRequestWrapper( String _ecl, boolean _includeJsonTypeInfo, boolean _includeBinTypeInfo )
    {
        this.local_ecl = _ecl;
        this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
        this.local_includeBinTypeInfo = _includeBinTypeInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest raw )
    {
        if (raw == null)
            return;

        this.local_ecl = raw.getEcl();
        this.local_includeJsonTypeInfo = raw.getIncludeJsonTypeInfo();
        this.local_includeBinTypeInfo = raw.getIncludeBinTypeInfo();

    }

    @Override
    public String toString()
    {
        return "EclRecordTypeInfoRequestWrapper [" + "ecl = " + local_ecl + ", " + "includeJsonTypeInfo = " + local_includeJsonTypeInfo + ", " + "includeBinTypeInfo = " + local_includeBinTypeInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoRequest();
        raw.setEcl( local_ecl);
        raw.setIncludeJsonTypeInfo( local_includeJsonTypeInfo);
        raw.setIncludeBinTypeInfo( local_includeBinTypeInfo);
        return raw;
    }


    public void setEcl( String _ecl )
    {
        this.local_ecl = _ecl;
    }
    public String getEcl( )
    {
        return this.local_ecl;
    }
    public void setIncludeJsonTypeInfo( boolean _includeJsonTypeInfo )
    {
        this.local_includeJsonTypeInfo = _includeJsonTypeInfo;
    }
    public boolean getIncludeJsonTypeInfo( )
    {
        return this.local_includeJsonTypeInfo;
    }
    public void setIncludeBinTypeInfo( boolean _includeBinTypeInfo )
    {
        this.local_includeBinTypeInfo = _includeBinTypeInfo;
    }
    public boolean getIncludeBinTypeInfo( )
    {
        return this.local_includeBinTypeInfo;
    }
}