package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;

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
 * Class name: DFUXRefOrphanFilesQueryRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFUXRefOrphanFilesQueryRequestWrapper
{
    protected String local_cluster;

    public DFUXRefOrphanFilesQueryRequestWrapper() {}

    public DFUXRefOrphanFilesQueryRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest dfuxreforphanfilesqueryrequest)
    {
        copy( dfuxreforphanfilesqueryrequest );
    }
    public DFUXRefOrphanFilesQueryRequestWrapper( String _cluster )
    {
        this.local_cluster = _cluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();

    }

    @Override
    public String toString()
    {
        return "DFUXRefOrphanFilesQueryRequestWrapper [" + "cluster = " + local_cluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefOrphanFilesQueryRequest();
        raw.setCluster( local_cluster);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
}