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
 * Class name: GetPODsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wscloud
 */
public class GetPODsResponseWrapper
{
    protected Pods_type0Wrapper local_pods;

    public GetPODsResponseWrapper() {}

    public GetPODsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse getpodsresponse)
    {
        copy( getpodsresponse );
    }
    public GetPODsResponseWrapper( Pods_type0Wrapper _pods )
    {
        this.local_pods = _pods;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getPods() != null)
            this.local_pods = new Pods_type0Wrapper( raw.getPods());

    }

    @Override
    public String toString()
    {
        return "GetPODsResponseWrapper [" + "pods = " + local_pods + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wscloud.latest.GetPODsResponse();
        if (local_pods != null)
            raw.setPods( local_pods.getRaw());
        return raw;
    }


    public void setPods( Pods_type0Wrapper _pods )
    {
        this.local_pods = _pods;
    }
    public Pods_type0Wrapper getPods( )
    {
        return this.local_pods;
    }
}