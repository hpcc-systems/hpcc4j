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
 * Class name: DFUFilePartsOnClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.883Z
 */
public class DFUFilePartsOnClusterWrapper
{
    protected String local_cluster;
    protected String local_baseDir;
    protected String local_replicateDir;
    protected boolean local_replicate;
    protected boolean local_canReplicate;
    protected ArrayOfDFUPartWrapper local_dFUFileParts;

    public DFUFilePartsOnClusterWrapper() {}

    public DFUFilePartsOnClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster dfufilepartsoncluster)
    {
        copy( dfufilepartsoncluster );
    }
    public DFUFilePartsOnClusterWrapper( String _cluster, String _baseDir, String _replicateDir, boolean _replicate, boolean _canReplicate, ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.local_cluster = _cluster;
        this.local_baseDir = _baseDir;
        this.local_replicateDir = _replicateDir;
        this.local_replicate = _replicate;
        this.local_canReplicate = _canReplicate;
        this.local_dFUFileParts = _dFUFileParts;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster raw )
    {
        if (raw == null)
            return;

        this.local_cluster = raw.getCluster();
        this.local_baseDir = raw.getBaseDir();
        this.local_replicateDir = raw.getReplicateDir();
        this.local_replicate = raw.getReplicate();
        this.local_canReplicate = raw.getCanReplicate();
        if (raw.getDFUFileParts() != null)
            this.local_dFUFileParts = new ArrayOfDFUPartWrapper( raw.getDFUFileParts());

    }

    @Override
    public String toString()
    {
        return "DFUFilePartsOnClusterWrapper [" + "cluster = " + local_cluster + ", " + "baseDir = " + local_baseDir + ", " + "replicateDir = " + local_replicateDir + ", " + "replicate = " + local_replicate + ", " + "canReplicate = " + local_canReplicate + ", " + "dFUFileParts = " + local_dFUFileParts + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster();
        raw.setCluster( local_cluster);
        raw.setBaseDir( local_baseDir);
        raw.setReplicateDir( local_replicateDir);
        raw.setReplicate( local_replicate);
        raw.setCanReplicate( local_canReplicate);
        raw.setDFUFileParts( local_dFUFileParts.getRaw());
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
    public void setBaseDir( String _baseDir )
    {
        this.local_baseDir = _baseDir;
    }
    public String getBaseDir( )
    {
        return this.local_baseDir;
    }
    public void setReplicateDir( String _replicateDir )
    {
        this.local_replicateDir = _replicateDir;
    }
    public String getReplicateDir( )
    {
        return this.local_replicateDir;
    }
    public void setReplicate( boolean _replicate )
    {
        this.local_replicate = _replicate;
    }
    public boolean getReplicate( )
    {
        return this.local_replicate;
    }
    public void setCanReplicate( boolean _canReplicate )
    {
        this.local_canReplicate = _canReplicate;
    }
    public boolean getCanReplicate( )
    {
        return this.local_canReplicate;
    }
    public void setDFUFileParts( ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.local_dFUFileParts = _dFUFileParts;
    }
    public ArrayOfDFUPartWrapper getDFUFileParts( )
    {
        return this.local_dFUFileParts;
    }
}