package org.hpccsystems.ws.client.wrappers.gen.wscloud;

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
 * Class name: GetServicesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class GetServicesResponseWrapper
{
    protected String local_result;

    public GetServicesResponseWrapper() {}

    public GetServicesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse getservicesresponse)
    {
        copy( getservicesresponse );
    }
    public GetServicesResponseWrapper( String _result )
    {
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse raw )
    {
        if (raw == null)
            return;

        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "GetServicesResponseWrapper [" + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetServicesResponse();
        raw.setResult( local_result);
        return raw;
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