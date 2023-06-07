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
 * Class name: DFUIndexInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class DFUIndexInfoWrapper
{
    protected boolean local_isLeafCountEstimated;
    protected long local_numLeafNodes;
    protected long local_numBlobNodes;
    protected long local_numBranchNodes;
    protected long local_sizeDiskLeaves;
    protected long local_sizeDiskBlobs;
    protected long local_sizeDiskBranches;
    protected long local_sizeOriginalData;
    protected long local_sizeOriginalBranches;
    protected long local_sizeMemoryLeaves;
    protected long local_sizeMemoryBranches;
    protected double local_branchCompressionPercent;
    protected double local_dataCompressionPercent;

    public DFUIndexInfoWrapper() {}

    public DFUIndexInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo dfuindexinfo)
    {
        copy( dfuindexinfo );
    }
    public DFUIndexInfoWrapper( boolean _isLeafCountEstimated, long _numLeafNodes, long _numBlobNodes, long _numBranchNodes, long _sizeDiskLeaves, long _sizeDiskBlobs, long _sizeDiskBranches, long _sizeOriginalData, long _sizeOriginalBranches, long _sizeMemoryLeaves, long _sizeMemoryBranches, double _branchCompressionPercent, double _dataCompressionPercent )
    {
        this.local_isLeafCountEstimated = _isLeafCountEstimated;
        this.local_numLeafNodes = _numLeafNodes;
        this.local_numBlobNodes = _numBlobNodes;
        this.local_numBranchNodes = _numBranchNodes;
        this.local_sizeDiskLeaves = _sizeDiskLeaves;
        this.local_sizeDiskBlobs = _sizeDiskBlobs;
        this.local_sizeDiskBranches = _sizeDiskBranches;
        this.local_sizeOriginalData = _sizeOriginalData;
        this.local_sizeOriginalBranches = _sizeOriginalBranches;
        this.local_sizeMemoryLeaves = _sizeMemoryLeaves;
        this.local_sizeMemoryBranches = _sizeMemoryBranches;
        this.local_branchCompressionPercent = _branchCompressionPercent;
        this.local_dataCompressionPercent = _dataCompressionPercent;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo raw )
    {
        if (raw == null)
            return;

        this.local_isLeafCountEstimated = raw.getIsLeafCountEstimated();
        this.local_numLeafNodes = raw.getNumLeafNodes();
        this.local_numBlobNodes = raw.getNumBlobNodes();
        this.local_numBranchNodes = raw.getNumBranchNodes();
        this.local_sizeDiskLeaves = raw.getSizeDiskLeaves();
        this.local_sizeDiskBlobs = raw.getSizeDiskBlobs();
        this.local_sizeDiskBranches = raw.getSizeDiskBranches();
        this.local_sizeOriginalData = raw.getSizeOriginalData();
        this.local_sizeOriginalBranches = raw.getSizeOriginalBranches();
        this.local_sizeMemoryLeaves = raw.getSizeMemoryLeaves();
        this.local_sizeMemoryBranches = raw.getSizeMemoryBranches();
        this.local_branchCompressionPercent = raw.getBranchCompressionPercent();
        this.local_dataCompressionPercent = raw.getDataCompressionPercent();

    }

    @Override
    public String toString()
    {
        return "DFUIndexInfoWrapper [" + "isLeafCountEstimated = " + local_isLeafCountEstimated + ", " + "numLeafNodes = " + local_numLeafNodes + ", " + "numBlobNodes = " + local_numBlobNodes + ", " + "numBranchNodes = " + local_numBranchNodes + ", " + "sizeDiskLeaves = " + local_sizeDiskLeaves + ", " + "sizeDiskBlobs = " + local_sizeDiskBlobs + ", " + "sizeDiskBranches = " + local_sizeDiskBranches + ", " + "sizeOriginalData = " + local_sizeOriginalData + ", " + "sizeOriginalBranches = " + local_sizeOriginalBranches + ", " + "sizeMemoryLeaves = " + local_sizeMemoryLeaves + ", " + "sizeMemoryBranches = " + local_sizeMemoryBranches + ", " + "branchCompressionPercent = " + local_branchCompressionPercent + ", " + "dataCompressionPercent = " + local_dataCompressionPercent + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUIndexInfo();
        raw.setIsLeafCountEstimated( local_isLeafCountEstimated);
        raw.setNumLeafNodes( local_numLeafNodes);
        raw.setNumBlobNodes( local_numBlobNodes);
        raw.setNumBranchNodes( local_numBranchNodes);
        raw.setSizeDiskLeaves( local_sizeDiskLeaves);
        raw.setSizeDiskBlobs( local_sizeDiskBlobs);
        raw.setSizeDiskBranches( local_sizeDiskBranches);
        raw.setSizeOriginalData( local_sizeOriginalData);
        raw.setSizeOriginalBranches( local_sizeOriginalBranches);
        raw.setSizeMemoryLeaves( local_sizeMemoryLeaves);
        raw.setSizeMemoryBranches( local_sizeMemoryBranches);
        raw.setBranchCompressionPercent( local_branchCompressionPercent);
        raw.setDataCompressionPercent( local_dataCompressionPercent);
        return raw;
    }


    public void setIsLeafCountEstimated( boolean _isLeafCountEstimated )
    {
        this.local_isLeafCountEstimated = _isLeafCountEstimated;
    }
    public boolean getIsLeafCountEstimated( )
    {
        return this.local_isLeafCountEstimated;
    }
    public void setNumLeafNodes( long _numLeafNodes )
    {
        this.local_numLeafNodes = _numLeafNodes;
    }
    public long getNumLeafNodes( )
    {
        return this.local_numLeafNodes;
    }
    public void setNumBlobNodes( long _numBlobNodes )
    {
        this.local_numBlobNodes = _numBlobNodes;
    }
    public long getNumBlobNodes( )
    {
        return this.local_numBlobNodes;
    }
    public void setNumBranchNodes( long _numBranchNodes )
    {
        this.local_numBranchNodes = _numBranchNodes;
    }
    public long getNumBranchNodes( )
    {
        return this.local_numBranchNodes;
    }
    public void setSizeDiskLeaves( long _sizeDiskLeaves )
    {
        this.local_sizeDiskLeaves = _sizeDiskLeaves;
    }
    public long getSizeDiskLeaves( )
    {
        return this.local_sizeDiskLeaves;
    }
    public void setSizeDiskBlobs( long _sizeDiskBlobs )
    {
        this.local_sizeDiskBlobs = _sizeDiskBlobs;
    }
    public long getSizeDiskBlobs( )
    {
        return this.local_sizeDiskBlobs;
    }
    public void setSizeDiskBranches( long _sizeDiskBranches )
    {
        this.local_sizeDiskBranches = _sizeDiskBranches;
    }
    public long getSizeDiskBranches( )
    {
        return this.local_sizeDiskBranches;
    }
    public void setSizeOriginalData( long _sizeOriginalData )
    {
        this.local_sizeOriginalData = _sizeOriginalData;
    }
    public long getSizeOriginalData( )
    {
        return this.local_sizeOriginalData;
    }
    public void setSizeOriginalBranches( long _sizeOriginalBranches )
    {
        this.local_sizeOriginalBranches = _sizeOriginalBranches;
    }
    public long getSizeOriginalBranches( )
    {
        return this.local_sizeOriginalBranches;
    }
    public void setSizeMemoryLeaves( long _sizeMemoryLeaves )
    {
        this.local_sizeMemoryLeaves = _sizeMemoryLeaves;
    }
    public long getSizeMemoryLeaves( )
    {
        return this.local_sizeMemoryLeaves;
    }
    public void setSizeMemoryBranches( long _sizeMemoryBranches )
    {
        this.local_sizeMemoryBranches = _sizeMemoryBranches;
    }
    public long getSizeMemoryBranches( )
    {
        return this.local_sizeMemoryBranches;
    }
    public void setBranchCompressionPercent( double _branchCompressionPercent )
    {
        this.local_branchCompressionPercent = _branchCompressionPercent;
    }
    public double getBranchCompressionPercent( )
    {
        return this.local_branchCompressionPercent;
    }
    public void setDataCompressionPercent( double _dataCompressionPercent )
    {
        this.local_dataCompressionPercent = _dataCompressionPercent;
    }
    public double getDataCompressionPercent( )
    {
        return this.local_dataCompressionPercent;
    }
}