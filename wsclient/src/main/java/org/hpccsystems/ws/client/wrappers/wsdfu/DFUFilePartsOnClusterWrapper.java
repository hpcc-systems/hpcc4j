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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster
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

    /**
     * Instantiates a new DFU file parts on cluster wrapper.
     */
    public DFUFilePartsOnClusterWrapper() {}

    /**
     * Instantiates a new DFU file parts on cluster wrapper.
     *
     * @param dfufilepartsoncluster
     *            the dfufilepartsoncluster
     */
    public DFUFilePartsOnClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster dfufilepartsoncluster)
    {
        copy( dfufilepartsoncluster );
    }

    /**
     * Instantiates a new DFU file parts on cluster wrapper.
     *
     * @param _cluster
     *            the cluster
     * @param _baseDir
     *            the base dir
     * @param _replicateDir
     *            the replicate dir
     * @param _replicate
     *            the replicate
     * @param _canReplicate
     *            the can replicate
     * @param _dFUFileParts
     *            the d FU file parts
     */
    public DFUFilePartsOnClusterWrapper( String _cluster, String _baseDir, String _replicateDir, boolean _replicate, boolean _canReplicate, ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.cluster = _cluster;
        this.baseDir = _baseDir;
        this.replicateDir = _replicateDir;
        this.replicate = _replicate;
        this.canReplicate = _canReplicate;
        this.dFUFileParts = _dFUFileParts;
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster raw )
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

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "DFUFilePartsOnClusterWrapper [" + "cluster = " + cluster + ", " + "baseDir = " + baseDir + ", " + "replicateDir = " + replicateDir + ", " + "replicate = " + replicate + ", " + "canReplicate = " + canReplicate + ", " + "dFUFileParts = " + dFUFileParts + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_55.DFUFilePartsOnCluster();
        raw.setCluster( cluster);
        raw.setBaseDir( baseDir);
        raw.setReplicateDir( replicateDir);
        raw.setReplicate( replicate);
        raw.setCanReplicate( canReplicate);
        return raw;
    }


    /**
     * Sets the cluster.
     *
     * @param _cluster
     *            the new cluster
     */
    public void setCluster( String _cluster )
    {
        this.cluster = _cluster;
    }
    
    /**
     * Gets the cluster.
     *
     * @return the cluster
     */
    public String getCluster( )
    {
        return this.cluster;
    }
    
    /**
     * Sets the base dir.
     *
     * @param _baseDir
     *            the new base dir
     */
    public void setBaseDir( String _baseDir )
    {
        this.baseDir = _baseDir;
    }
    
    /**
     * Gets the base dir.
     *
     * @return the base dir
     */
    public String getBaseDir( )
    {
        return this.baseDir;
    }
    
    /**
     * Sets the replicate dir.
     *
     * @param _replicateDir
     *            the new replicate dir
     */
    public void setReplicateDir( String _replicateDir )
    {
        this.replicateDir = _replicateDir;
    }
    
    /**
     * Gets the replicate dir.
     *
     * @return the replicate dir
     */
    public String getReplicateDir( )
    {
        return this.replicateDir;
    }
    
    /**
     * Sets the replicate.
     *
     * @param _replicate
     *            the new replicate
     */
    public void setReplicate( boolean _replicate )
    {
        this.replicate = _replicate;
    }
    
    /**
     * Gets the replicate.
     *
     * @return the replicate
     */
    public boolean getReplicate( )
    {
        return this.replicate;
    }
    
    /**
     * Sets the can replicate.
     *
     * @param _canReplicate
     *            the new can replicate
     */
    public void setCanReplicate( boolean _canReplicate )
    {
        this.canReplicate = _canReplicate;
    }
    
    /**
     * Gets the can replicate.
     *
     * @return the can replicate
     */
    public boolean getCanReplicate( )
    {
        return this.canReplicate;
    }
    
    /**
     * Sets the DFU file parts.
     *
     * @param _dFUFileParts
     *            the new DFU file parts
     */
    public void setDFUFileParts( ArrayOfDFUPartWrapper _dFUFileParts )
    {
        this.dFUFileParts = _dFUFileParts;
    }
    
    /**
     * Gets the DFU file parts.
     *
     * @return the DFU file parts
     */
    public ArrayOfDFUPartWrapper getDFUFileParts( )
    {
        return this.dFUFileParts;
    }
}
