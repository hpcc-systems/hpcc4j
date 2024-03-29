package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;

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
 * Class name: GetPackageMapByIdRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 */
public class GetPackageMapByIdRequestWrapper
{
    protected String local_packageMapId;

    public GetPackageMapByIdRequestWrapper() {}

    public GetPackageMapByIdRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest getpackagemapbyidrequest)
    {
        copy( getpackagemapbyidrequest );
    }
    public GetPackageMapByIdRequestWrapper( String _packageMapId )
    {
        this.local_packageMapId = _packageMapId;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest raw )
    {
        if (raw == null)
            return;

        this.local_packageMapId = raw.getPackageMapId();

    }

    @Override
    public String toString()
    {
        return "GetPackageMapByIdRequestWrapper [" + "packageMapId = " + local_packageMapId + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageMapByIdRequest();
        raw.setPackageMapId( local_packageMapId);
        return raw;
    }


    public void setPackageMapId( String _packageMapId )
    {
        this.local_packageMapId = _packageMapId;
    }
    public String getPackageMapId( )
    {
        return this.local_packageMapId;
    }
}