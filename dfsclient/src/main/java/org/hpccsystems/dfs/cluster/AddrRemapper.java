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

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileCopyWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUPartWrapper;

/**
 * Map internal IP addresses to external IP addresses.  Note that the
 * relation of parts to IP address must be in lexical order.
 *
 */
public class AddrRemapper extends ClusterRemapper
{
    private HashMap<String, String> ip_tab;
    private int                     rowServicePort;
    private boolean                 usesSSL;

    /**
     * Remapping of the IP addresses for virtual clusters.  Note that there
     * can be more parts than nodes or fewer parts than nodes, though usually
     * the number of parts equals the number of nodes for files and is one
     * higher for keys.
     * @param ri re-mapping information for an address re-mapper
     * @param strings all locations available on cluster
     * that need to be mapped
     * @throws HpccFileException when something is wrong with the info
     */
    public AddrRemapper(RemapInfo ri, DFUFileAccessInfoWrapper dfufileinfo) throws HpccFileException
    {
        super(ri);

        rowServicePort = dfufileinfo.getFileAccessPort();
        usesSSL = dfufileinfo.getFileAccessSSL();

        String[] allavailablelocations = dfufileinfo.getAllFilePartCopyLocations();
        HashSet<String> ip_set = new HashSet<String>(allavailablelocations.length);

        for (String location : allavailablelocations)
        {
            ip_set.add(location);
        }

        String[] ip_list = ip_set.toArray(new String[0]);
        Arrays.sort(ip_list);
        if (ip_list.length > ri.getNodes())
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Too many addresses, need ");
            sb.append(ip_list.length);
            sb.append(" but have only ");
            sb.append(ri.getNodes());
            throw new HpccFileException(sb.toString());
        }
        short[] target_parts = new short[4];
        StringTokenizer st = new StringTokenizer(ri.getBaseIp(), ".");
        if (st.countTokens() != 4)
        {
            throw new IllegalArgumentException("Incomplete IP address for target");
        }
        int pos = 0;
        while (st.hasMoreTokens())
        {
            target_parts[pos] = Short.parseShort(st.nextToken());
            pos++;
        }
        ip_tab = new HashMap<String, String>(ip_list.length * 2);
        for (int i = 0; i < ip_list.length; i++)
        {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 4; j++)
            {
                sb.append(target_parts[j]);
                if (j < 3) sb.append(".");
            }
            ip_tab.put(ip_list[i], sb.toString());
            target_parts[3]++;
            if (target_parts[3] < 256) continue;
            target_parts[3] = 0;
            target_parts[2]++;
            if (target_parts[2] < 256) continue;
            target_parts[2] = 0;
            target_parts[1]++;
            if (target_parts[1] < 256) continue;
            throw new IllegalArgumentException("Too many nodes for starting address");
        }
    }

    /**
     * Comparator to re-order the file parts.
     */
    private static Comparator<DFUPartWrapper> FilePartInfoComparator = new Comparator<DFUPartWrapper>()
    {
        public int compare(DFUPartWrapper fpi1, DFUPartWrapper fpi2)
        {
            if (fpi1.getCopy() < fpi2.getCopy()) return -1;
            if (fpi1.getCopy() > fpi2.getCopy()) return 1;
            if (fpi1.getId() < fpi2.getId()) return -1;
            if (fpi1.getId() > fpi2.getId()) return 1;
            return 0;
        }
    };

    /* (non-Javadoc)
    * @see org.hpccsystems.spark.thor.ClusterRemapper#reviseIPs(org.hpccsystems.ws.client.platform.DFUFilePartInfo[])
    */
    //@Override
    public String[] reviseIPs(String[] ips) throws HpccFileException
    {
        String[] revisedips = new String[ips.length];
        for (int ipindex = 0; ipindex < ips.length; ipindex++)
        {
            if (!this.ip_tab.containsKey(ips[ipindex]))
            {
                throw new HpccFileException("IP not in cluster ip mapping table");
            }
            revisedips[ipindex] = ip_tab.get(ips[ipindex]);
        }
        return revisedips;
    }

    /* (non-Javadoc)
    * @see org.hpccsystems.spark.thor.ClusterRemapper#reviseIPs(org.hpccsystems.ws.client.platform.DFUFilePartInfo[])
    */
    @Override
    public String[] reviseIPs(DFUFileCopyWrapper[] dfuFileCopies) throws HpccFileException
    {
        String[] revisedips = new String[dfuFileCopies.length];
        for (int partsindex = 0; partsindex < revisedips.length; partsindex++)
        {
            if (!this.ip_tab.containsKey(dfuFileCopies[partsindex].getCopyHost()))
            {
                throw new HpccFileException("IP not in cluster ip mapping table");
            }
            revisedips[partsindex] = ip_tab.get(dfuFileCopies[partsindex].getCopyHost());
        }
        return revisedips;
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
