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
 * Re-map address information for Clusters that can
 * only be reached through alias addresses.
 * Addresses are re-mapped to a range of IP addresses or to an
 * IP address and a range of ports.
 */
public abstract class ClusterRemapper
{
    protected int                  nodes;
    protected final static int     DEFAULT_LEGACY_CLEAR_PORT   = 7100;
    protected final static int     DEFAULT_LEGACY_SSL_PORT     = 7700;
    protected final static int     DEFAULT_ROWSERVICE_PORT     = 7601;
    protected final static boolean DEFAULT_ROWSERVICE_USES_SSL = false;

    /**
     * Constructor for common information.
     */
    protected ClusterRemapper(RemapInfo ri) throws HpccFileException
    {
        this.nodes = ri.getNodes();
    }

    /**
     * The optionally revised array of hosts.
     * @param hosts information
     * @return Revised IP address as strings
     */
    public abstract String[] reviseIPs(String[] hosts) throws HpccFileException;

    /**
     * The optionally revised array of file part copy IPs.
     * @param fpi file part information
     * @return an IP address as a string
     */
    public abstract String[] reviseIPs(DFUFileCopyWrapper[] dfuFileCopies) throws HpccFileException;

    /**
     * The communications port number
     * @param fpi the file part information
     * @return the port number
     */
    public abstract int revisePort(DFUPartWrapper fpi);

    /**
     * Indicates if the target rowservice communicates over SSL
     * @param fpi the file part information
     * @return the port number
     */
    public abstract boolean getUsesSSLConnection(DFUPartWrapper fpi);

    /**
     * Factory for making a cluster re-map.
     * @param ri the re-mapping information
     * @param fileaccessinfo a list of file part locations
     * @return a re-mapping object consistent with the provided information
     * @throws HpccFileException
     */

    public static ClusterRemapper makeMapper(RemapInfo ri, DFUFileAccessInfoWrapper fileaccessinfo) throws HpccFileException
    {
        return ri.isNullMapper() ? new NullRemapper(ri, fileaccessinfo) : new AddrRemapper(ri, fileaccessinfo);
    }

}
