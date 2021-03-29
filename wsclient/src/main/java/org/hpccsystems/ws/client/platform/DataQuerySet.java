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

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.QuerySet;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

public class DataQuerySet extends DataSingleton
{
    private static Map<Integer, DataQuerySet> QuerySets = new HashMap<Integer, DataQuerySet>();

    /**
     * Gets the.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     * @return the data query set
     */
    public static synchronized DataQuerySet get(Platform platform, String name)
    {
        DataQuerySet dataQuerySet = new DataQuerySet(platform, name);
        if (QuerySets.containsKey(dataQuerySet.hashCode()))
        {
            return QuerySets.get(dataQuerySet.hashCode());
        }
        else
        {
            QuerySets.put(dataQuerySet.hashCode(), dataQuerySet);
        }
        return dataQuerySet;
    }

    private Platform platform;
    private QuerySet info;

    public enum Notification
    {
        QUERYSET
    }

    /**
     * Instantiates a new data query set.
     *
     * @param platform
     *            the platform
     * @param name
     *            the name
     */
    private DataQuerySet(Platform platform, String name)
    {
        this.platform = platform;
        info = new QuerySet();
        info.setQuerySetName(name);
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return info.getQuerySetName();
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    @Override
    protected boolean isComplete()
    {
        return true;
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
    }

    /**
     * Update.
     *
     * @param qs
     *            the qs
     */
    // Updates ---
    public void Update(QuerySet qs)
    {
        if (info.getQuerySetName().equals(qs.getQuerySetName()))
        {
            info = qs;
        }
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

        if (!(aThat instanceof DataQuerySet))
        {
            return false;
        }
        DataQuerySet that = (DataQuerySet) aThat;

        // now a proper field-by-field evaluation can be made
        return EqualsUtil.areEqual(platform, that.platform)
                && EqualsUtil.areEqual(info.getQuerySetName(), that.info.getQuerySetName());
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, platform);
        result = HashCodeUtil.hash(result, info.getQuerySetName());
        return result;
    }
}
