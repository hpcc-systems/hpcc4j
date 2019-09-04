package org.hpccsystems.ws.client.wrappers.wsdfu;


/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2019-08-20T13:59:09.351Z
 */
public class DFUFilePartsOnClusterWrapper
{
    protected String cluster;
    protected String baseDir;
    protected String replicateDir;
    protected boolean replicate;
    protected boolean canReplicate;
    protected ArrayOfDFUPartWrapper dFUFileParts;

    public DFUFilePartsOnClusterWrapper() {}

    public DFUFilePartsOnClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster dfufilepartsoncluster)
    {
        copy( dfufilepartsoncluster );
    }

    public DFUFilePartsOnClusterWrapper( String _cluster, String _baseDir, String _replicateDir, boolean _replicate, boolean _canReplicate, ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.cluster = _cluster;
        this.baseDir = _baseDir;
        this.replicateDir = _replicateDir;
        this.replicate = _replicate;
        this.canReplicate = _canReplicate;
        this.dFUFileParts = _dFUFileParts;
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster raw )
    {
        if (raw == null)
            return;

        this.cluster = raw.getCluster();
        this.baseDir = raw.getBaseDir();
        this.replicateDir = raw.getReplicateDir();
        this.replicate = raw.getReplicate();
        this.canReplicate = raw.getCanReplicate();
        this.dFUFileParts = new ArrayOfDFUPartWrapper( raw.getDFUFileParts());
    }

    @Override
    public String toString()
    {
        return "DFUFilePartsOnClusterWrapper [" + "cluster = " + cluster + ", " + "baseDir = " + baseDir + ", " + "replicateDir = " + replicateDir + ", " + "replicate = " + replicate + ", " + "canReplicate = " + canReplicate + ", " + "dFUFileParts = " + dFUFileParts + "]";
    }

    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePartsOnCluster();
        raw.setCluster( cluster);
        raw.setBaseDir( baseDir);
        raw.setReplicateDir( replicateDir);
        raw.setReplicate( replicate);
        raw.setCanReplicate( canReplicate);
        return raw;
    }


    public void setCluster( String _cluster )
    {
        this.cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.cluster;
    }
    public void setBaseDir( String _baseDir )
    {
        this.baseDir = _baseDir;
    }
    public String getBaseDir( )
    {
        return this.baseDir;
    }
    public void setReplicateDir( String _replicateDir )
    {
        this.replicateDir = _replicateDir;
    }
    public String getReplicateDir( )
    {
        return this.replicateDir;
    }
    public void setReplicate( boolean _replicate )
    {
        this.replicate = _replicate;
    }
    public boolean getReplicate( )
    {
        return this.replicate;
    }
    public void setCanReplicate( boolean _canReplicate )
    {
        this.canReplicate = _canReplicate;
    }
    public boolean getCanReplicate( )
    {
        return this.canReplicate;
    }
    public void setDFUFileParts( ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.dFUFileParts = _dFUFileParts;
    }
    public ArrayOfDFUPartWrapper getDFUFileParts( )
    {
        return this.dFUFileParts;
    }
}
