/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.cluster;

import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileCopyWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUPartWrapper;

/**
 * A no action re-map of the address.  Does provide the port information.
 */
public class NullRemapper extends ClusterRemapper
{
    private int     rowServicePort = DEFAULT_ROWSERVICE_PORT;
    private boolean usesSSL        = DEFAULT_ROWSERVICE_USES_SSL;

    /**
     * @param ri
     * @param fileaccessinfo
     */
    public NullRemapper(RemapInfo ri, DFUFileAccessInfoWrapper fileaccessinfo) throws HpccFileException
    {
        super(ri);
        if (!ri.isNullMapper())
        {
            throw new IllegalArgumentException("Incompatible re-mapping information");
        }

        rowServicePort = fileaccessinfo.getFileAccessPort();
        usesSSL = fileaccessinfo.getFileAccessSSL();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.spark.thor.ClusterRemapper#reviseIPs(org.hpccsystems.ws.client.platform.DFUFilePartInfo[])
     */
    @Override
    public String[] reviseIPs(DFUFileCopyWrapper[] dfuFileCopies) throws HpccFileException
    {
        String[] revisedIPs = new String[dfuFileCopies.length];
        for (int i = 0; i < revisedIPs.length; i++)
        {
            revisedIPs[i] = dfuFileCopies[i].getCopyHost();
        }
        return revisedIPs;
    }

    /* (non-Javadoc)
    * @see org.hpccsystems.spark.thor.ClusterRemapper#reviseIPs(java.lang.String[])
    */
    @Override
    public String[] reviseIPs(String[] hosts) throws HpccFileException
    {
        return hosts;
    }

    /* (non-Javadoc)
    * @see org.hpccsystems.spark.thor.ClusterRemapper#revisePort(org.hpccsystems.ws.client.platform.DFUFilePartInfo)
    */
    @Override
    public int revisePort(DFUPartWrapper fpi)
    {
        return rowServicePort;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.spark.thor.ClusterRemapper#getUsesSSLConnection(org.hpccsystems.ws.client.platform.DFUFilePartInfo)
    */
    @Override
    public boolean getUsesSSLConnection(DFUPartWrapper fpi)
    {
        return usesSSL;
    }

}
