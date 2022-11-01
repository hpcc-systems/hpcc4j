package org.hpccsystems.ws.client.wrappers.gen.wssmc;



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
 * Class name: GetThorQueueAvailabilityResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssmc
 * TimeStamp: 2022-10-31T03:36:23.295Z
 */
public class GetThorQueueAvailabilityResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfThorClusterWrapper local_thorClusters;

    public GetThorQueueAvailabilityResponseWrapper() {}

    public GetThorQueueAvailabilityResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse getthorqueueavailabilityresponse)
    {
        copy( getthorqueueavailabilityresponse );
    }
    public GetThorQueueAvailabilityResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfThorClusterWrapper _thorClusters )
    {
        this.local_exceptions = _exceptions;
        this.local_thorClusters = _thorClusters;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getThorClusters() != null)
            this.local_thorClusters = new ArrayOfThorClusterWrapper( raw.getThorClusters());

    }

    @Override
    public String toString()
    {
        return "GetThorQueueAvailabilityResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "thorClusters = " + local_thorClusters + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssmc.latest.GetThorQueueAvailabilityResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_thorClusters != null)
            raw.setThorClusters( local_thorClusters.getRaw());
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setThorClusters( ArrayOfThorClusterWrapper _thorClusters )
    {
        this.local_thorClusters = _thorClusters;
    }
    public ArrayOfThorClusterWrapper getThorClusters( )
    {
        return this.local_thorClusters;
    }
}