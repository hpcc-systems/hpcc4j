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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: EclRecordTypeInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class EclRecordTypeInfoResponseWrapper
{
    protected String local_jsonInfo;
    protected DataHandler local_binInfo;

    public EclRecordTypeInfoResponseWrapper() {}

    public EclRecordTypeInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse eclrecordtypeinforesponse)
    {
        copy( eclrecordtypeinforesponse );
    }
    public EclRecordTypeInfoResponseWrapper( String _jsonInfo, DataHandler _binInfo )
    {
        this.local_jsonInfo = _jsonInfo;
        this.local_binInfo = _binInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse raw )
    {
        if (raw == null)
            return;

        this.local_jsonInfo = raw.getJsonInfo();
        this.local_binInfo = raw.getBinInfo();

    }

    @Override
    public String toString()
    {
        return "EclRecordTypeInfoResponseWrapper [" + "jsonInfo = " + local_jsonInfo + ", " + "binInfo = " + local_binInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EclRecordTypeInfoResponse();
        raw.setJsonInfo( local_jsonInfo);
        raw.setBinInfo( local_binInfo);
        return raw;
    }


    public void setJsonInfo( String _jsonInfo )
    {
        this.local_jsonInfo = _jsonInfo;
    }
    public String getJsonInfo( )
    {
        return this.local_jsonInfo;
    }
    public void setBinInfo( DataHandler _binInfo )
    {
        this.local_binInfo = _binInfo;
    }
    public DataHandler getBinInfo( )
    {
        return this.local_binInfo;
    }
}