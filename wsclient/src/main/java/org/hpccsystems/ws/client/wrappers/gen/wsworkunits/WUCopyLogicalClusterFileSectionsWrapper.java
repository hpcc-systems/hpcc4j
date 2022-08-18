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
 * Class name: WUCopyLogicalClusterFileSectionsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.889Z
 */
public class WUCopyLogicalClusterFileSectionsWrapper
{
    protected String local_clusterName;
    protected ArrayOfWULogicalFileCopyInfoWrapper local_onCluster;
    protected ArrayOfWULogicalFileCopyInfoWrapper local_notOnCluster;
    protected ArrayOfWULogicalFileCopyInfoWrapper local_foreign;
    protected ArrayOfWULogicalFileCopyInfoWrapper local_notFound;

    public WUCopyLogicalClusterFileSectionsWrapper() {}

    public WUCopyLogicalClusterFileSectionsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections wucopylogicalclusterfilesections)
    {
        copy( wucopylogicalclusterfilesections );
    }
    public WUCopyLogicalClusterFileSectionsWrapper( String _clusterName, ArrayOfWULogicalFileCopyInfoWrapper _onCluster, ArrayOfWULogicalFileCopyInfoWrapper _notOnCluster, ArrayOfWULogicalFileCopyInfoWrapper _foreign, ArrayOfWULogicalFileCopyInfoWrapper _notFound )
    {
        this.local_clusterName = _clusterName;
        this.local_onCluster = _onCluster;
        this.local_notOnCluster = _notOnCluster;
        this.local_foreign = _foreign;
        this.local_notFound = _notFound;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections raw )
    {
        if (raw == null)
            return;

        this.local_clusterName = raw.getClusterName();
        if (raw.getOnCluster() != null)
            this.local_onCluster = new ArrayOfWULogicalFileCopyInfoWrapper( raw.getOnCluster());
        if (raw.getNotOnCluster() != null)
            this.local_notOnCluster = new ArrayOfWULogicalFileCopyInfoWrapper( raw.getNotOnCluster());
        if (raw.getForeign() != null)
            this.local_foreign = new ArrayOfWULogicalFileCopyInfoWrapper( raw.getForeign());
        if (raw.getNotFound() != null)
            this.local_notFound = new ArrayOfWULogicalFileCopyInfoWrapper( raw.getNotFound());

    }

    @Override
    public String toString()
    {
        return "WUCopyLogicalClusterFileSectionsWrapper [" + "clusterName = " + local_clusterName + ", " + "onCluster = " + local_onCluster + ", " + "notOnCluster = " + local_notOnCluster + ", " + "foreign = " + local_foreign + ", " + "notFound = " + local_notFound + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalClusterFileSections();
        raw.setClusterName( local_clusterName);
        return raw;
    }


    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setOnCluster( ArrayOfWULogicalFileCopyInfoWrapper _onCluster )
    {
        this.local_onCluster = _onCluster;
    }
    public ArrayOfWULogicalFileCopyInfoWrapper getOnCluster( )
    {
        return this.local_onCluster;
    }
    public void setNotOnCluster( ArrayOfWULogicalFileCopyInfoWrapper _notOnCluster )
    {
        this.local_notOnCluster = _notOnCluster;
    }
    public ArrayOfWULogicalFileCopyInfoWrapper getNotOnCluster( )
    {
        return this.local_notOnCluster;
    }
    public void setForeign( ArrayOfWULogicalFileCopyInfoWrapper _foreign )
    {
        this.local_foreign = _foreign;
    }
    public ArrayOfWULogicalFileCopyInfoWrapper getForeign( )
    {
        return this.local_foreign;
    }
    public void setNotFound( ArrayOfWULogicalFileCopyInfoWrapper _notFound )
    {
        this.local_notFound = _notFound;
    }
    public ArrayOfWULogicalFileCopyInfoWrapper getNotFound( )
    {
        return this.local_notFound;
    }
}