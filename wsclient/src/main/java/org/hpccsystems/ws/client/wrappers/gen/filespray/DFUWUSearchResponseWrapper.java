package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
 * Class name: DFUWUSearchResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * TimeStamp: 2022-10-31T03:36:11.816Z
 */
public class DFUWUSearchResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ClusterNames_type0Wrapper local_clusterNames;

    public DFUWUSearchResponseWrapper() {}

    public DFUWUSearchResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse dfuwusearchresponse)
    {
        copy( dfuwusearchresponse );
    }
    public DFUWUSearchResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ClusterNames_type0Wrapper _clusterNames )
    {
        this.local_exceptions = _exceptions;
        this.local_clusterNames = _clusterNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getClusterNames() != null)
            this.local_clusterNames = new ClusterNames_type0Wrapper( raw.getClusterNames());

    }

    @Override
    public String toString()
    {
        return "DFUWUSearchResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "clusterNames = " + local_clusterNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.DFUWUSearchResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_clusterNames != null)
            raw.setClusterNames( local_clusterNames.getRaw());
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
    public void setClusterNames( ClusterNames_type0Wrapper _clusterNames )
    {
        this.local_clusterNames = _clusterNames;
    }
    public ClusterNames_type0Wrapper getClusterNames( )
    {
        return this.local_clusterNames;
    }
}