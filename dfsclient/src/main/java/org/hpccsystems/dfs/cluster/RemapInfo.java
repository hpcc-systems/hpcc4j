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

import java.io.Serializable;

/**
 * Information to re-map address information for Clusters that can
 * only be reached through alias addresses.
 * Addresses are re-mapped to a range of IP addresses or to an
 * IP address and a range of ports.
 */
public class RemapInfo implements Serializable
{
    static private final long serialVersionUID = 1L;
    private final int         clusterNodeCount;
    private final String      baseClusterIP;
    private final int         rowServicePort;
    private final boolean     useSSLConnectionDAFileServ;

    /**
     * Info to create a null re-map.
     */
    public RemapInfo()
    {
        this.clusterNodeCount = 0;
        this.baseClusterIP = "";
        this.rowServicePort = 0;
        this.useSSLConnectionDAFileServ = true;
    }

    public RemapInfo(String nodes, String base_ip)
    {
        this.clusterNodeCount = nodes.equals("") ? 0 : Integer.parseInt(nodes);
        this.baseClusterIP = base_ip;
        this.rowServicePort = 0;
        this.useSSLConnectionDAFileServ = true;
    }

    /**
     * Info to create a re-mapping to a range of IP addresses
     * @param thorNodes number of nodes for this THOR cluster
     * @param ip first alias IP
     */
    public RemapInfo(int thorNodes, String ip)
    {
        this.clusterNodeCount = thorNodes;
        this.baseClusterIP = ip;
        this.rowServicePort = 0;
        this.useSSLConnectionDAFileServ = true;
    }

    /**
     * Info to create a re-mapping to a single IP and a range of ports.  The
     * port number should be zero for the case (clear or SSL) that is not
     * supported by the cluster.  Both can be supported.  If both ports are
     * zero, the re-map will be to a range of IP addresses
     * @param thorNodes number of nodes for this THOR cluster
     * @param ip the IP for the cluster
     * @param rowserviceport the port to communicate with rowservice (DAFILESERV)
     * @param useSSL flag indicating if the target rowservice expects ssl based communication
     */
    public RemapInfo(int thorNodes, String ip, int rowserviceport, boolean useSSL)
    {
        this.clusterNodeCount = thorNodes;
        this.rowServicePort = rowserviceport;
        this.useSSLConnectionDAFileServ = useSSL;
        this.baseClusterIP = ip;
    }

    /**
       * The number of nodes in the THOR cluster.
       * @return number of nodes
       */
    public int getNodes()
    {
        return this.clusterNodeCount;
    }

    /**
     * Port number for  exchange with the cluster
     * @return  port number
     */
    public int getRowservicePort()
    {
        return this.rowServicePort;
    }

    /**
     * Base port number for SSL exchange with the cluster or zero if not re-mapped
     * @return SSL port number
     */
    public boolean getIsSSLConnectionRequired()
    {
        return this.useSSLConnectionDAFileServ;
    }

    /**
     * Get base IP for range or IP for port range
     * @return IP
     */
    public String getBaseIp()
    {
        return this.baseClusterIP;
    }

    /**
     * Is this a null re-mapper
     * @return boolean
     */
    public boolean isNullMapper()
    {
        return this.baseClusterIP.equals("");
    }
}
