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

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.WUState;

public class Graph extends DataSingleton
{
    private static Map<Integer, Graph> Graphs = new HashMap<Integer, Graph>();

    /**
     * Gets the.
     *
     * @param workunit
     *            the workunit
     * @param name
     *            the name
     * @return the graph
     */
    public static synchronized Graph get(Workunit workunit, String name)
    {
        Graph graph = new Graph(workunit, name);
        if (Graphs.containsKey(graph.hashCode()))
        {
            return Graphs.get(graph.hashCode());
        }
        else
        {
            Graphs.put(graph.hashCode(), graph);
        }
        return graph;
    }

    private Workunit workunit;
    private ECLGraph info;

    public enum Notification
    {
        GRAPH
    }

    /**
     * Instantiates a new graph.
     *
     * @param workunit
     *            the workunit
     * @param name
     *            the name
     */
    private Graph(Workunit workunit, String name)
    {
        this.workunit = workunit;
        info = new ECLGraph();
        info.setName(name);
    }

    /**
     * Gets the workunit.
     *
     * @return the workunit
     */
    public Workunit getWorkunit()
    {
        return workunit;
    }

    /**
     * Gets the wuid.
     *
     * @return the wuid
     */
    public String getWuid()
    {
        return workunit.getWuid();
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return info.getName();
    }

    /**
     * Gets the state ID.
     *
     * @return the state ID
     */
    public WUState getStateID()
    {
        if (/*info.getRunning() != null && */info.getRunning())
        {
            return WUState.RUNNING;
        }
        else if (/*info.getComplete() != null &&*/ info.getComplete())
        {
            return WUState.COMPLETED;
        }
        else if (/*info.getFailed() != null &&*/ info.getFailed())
        {
            return WUState.FAILED;
        }
        return WUState.UNKNOWN;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    public boolean isComplete()
    {
        return HPCCWsWorkUnitsClient.isWorkunitComplete(getStateID()) || workunit.isComplete();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    @Override
    protected void fastRefresh()
    {
        fullRefresh();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    @Override
    protected void fullRefresh()
    {
        workunit.getGraphs();
    }

    /**
     * Update.
     *
     * @param graph
     *            the graph
     * @return true, if successful
     */
    // Updates ---
    boolean update(ECLGraph graph)
    {
        boolean retVal = false;
        if (graph != null && info.getName().equals(graph.getName()) && !info.equals(graph))
        {
            if (UpdateState(graph))
            {
                retVal = true;

            }
        }
        monitor();
        return retVal;
    }

    /**
     * Update state.
     *
     * @param graph
     *            the graph
     * @return true, if successful
     */
    boolean UpdateState(ECLGraph graph)
    {
        if (info.getName().equals(graph.getName()) && EqualsUtil.hasChanged(info, graph))
        {
            info = graph;

            return true;
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof Graph))
        {
            return false;
        }
        Graph that = (Graph) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(workunit, that.workunit) && EqualsUtil.areEqual(info.getName(), that.info.getName());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, workunit);
        result = HashCodeUtil.hash(result, info.getName());
        return result;
    }
}
