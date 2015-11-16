/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.platform;

import java.util.HashMap;
import java.util.Map;

import org.hpccsystems.ws.client.HPCCWsTopologyClient;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpClusterInfoResponse;
import org.hpccsystems.ws.client.gen.wstopology.v1_22.TpTargetCluster;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class Cluster extends DataSingleton
{
    private static Map<Integer, Cluster> Clusters = new HashMap<Integer, Cluster>();

    public static synchronized Cluster get(Platform platform, String name)
    {
        Cluster cluster = new Cluster(platform, name);
        if (Clusters.containsKey(cluster.hashCode()))
        {
            return Clusters.get(cluster.hashCode());
        }
        else
        {
            Clusters.put(cluster.hashCode(), cluster);
        }
        return cluster;
    }

    private Platform              platform;
    private TpTargetCluster       info;
    private TpClusterInfoResponse info2;

    Cluster(Platform platform, String name)
    {
        this.platform = platform;
        info = new TpTargetCluster();
        info.setName(name);
        info2 = new TpClusterInfoResponse();
        info2.setName(name);
    }

    public String getName()
    {
        return info.getName();
    }

    @Override
    protected boolean isComplete()
    {
        return true;
    }

    @Override
    protected void fastRefresh()
    {
        fullRefresh();
    }

    @Override
    protected void fullRefresh()
    {
        try
        {
                HPCCWsTopologyClient wsTopologyClient = platform.getWsTopologyClient();
                TpClusterInfoResponse respsone = wsTopologyClient.getClusterInfo(info.getName());
                Update(respsone);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Update(TpTargetCluster tc)
    {
        if (info.getName().equals(tc.getName()))
        {
            info = tc;
            setChanged();
        }
    }

    void Update(TpClusterInfoResponse ci)
    {
        if (info2.getName().equals(ci.getName()))
        {
            info2 = ci;
            setChanged();
        }
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof Cluster))
        {
            return false;
        }
        Cluster that = (Cluster) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform) && EqualsUtil.areEqual(info.getName(), that.info.getName());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getName());
        return result;
    }
}
