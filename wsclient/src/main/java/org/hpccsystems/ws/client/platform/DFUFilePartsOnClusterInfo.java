package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.platform.DFUFilePartInfo;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePartsOnCluster;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUPart;

/**
 * @author John Holt
 *
 */
public class DFUFilePartsOnClusterInfo extends DFUFilePartsOnCluster
{
    static final long serialVersionUID = 1;

    public DFUFilePartsOnClusterInfo(DFUFilePartsOnCluster raw)
    {
        super(raw.getCluster(), raw.getBaseDir(), raw.getReplicateDir(), raw.getReplicate(), raw.getCanReplicate(), raw.getDFUFileParts());
    }

    /**
     * File parts for the file on the specific cluster
     *
     * @return an array of metadata describing each file part
     */
    public DFUFilePartInfo[] getDFUFileParts()
    {
        DFUPart[] fp = super.getDFUFileParts();
        DFUFilePartInfo[] fpi = new DFUFilePartInfo[fp.length];
        for (int i = 0; i < fp.length; i++)
            fpi[i] = new DFUFilePartInfo(fp[i]);
        return fpi;
    }
}
