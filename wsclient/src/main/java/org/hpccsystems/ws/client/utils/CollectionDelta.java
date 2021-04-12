/*******************************************************************************
 * Copyright (c) 2014 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Used internally to monitor and track changes in generic collections.
 *
 */
public class CollectionDelta
{
    private ArrayList<DataSingleton>   before;
    protected String                   cause;
    protected ArrayList<DataSingleton> added;
    protected ArrayList<DataSingleton> unchanged;
    protected ArrayList<DataSingleton> removed;

    public CollectionDelta(String cause)
    {
        this.cause = cause;
        before = new ArrayList<DataSingleton>();
    }

    public <T extends DataSingleton> CollectionDelta(String cause, Collection<T> before)
    {
        this.cause = cause;
        this.before = new ArrayList<DataSingleton>(before);
    }

    public <T extends DataSingleton> CollectionDelta calcChanges(T[] after)
    {
        return calcChanges(new ArrayList<T>(Arrays.asList(after)));
    }

    public <T extends DataSingleton> CollectionDelta calcChanges(Collection<T> after)
    {
        new ArrayList<DataSingleton>(after);
        added = new ArrayList<DataSingleton>();
        unchanged = new ArrayList<DataSingleton>();
        removed = new ArrayList<DataSingleton>(before);
        for (T item : after)
        {
            if (removed.contains(item))
            {
                unchanged.add(item);
                removed.remove(item);
            }
            else
            {
                added.add(item);
            }
        }
        return this;
    }

    public boolean hasChanged()
    {
        return !removed.isEmpty() || !added.isEmpty();
    }

    public boolean exists(DataSingleton item)
    {
        return added.contains(item) || unchanged.contains(item);
    }

    public String getCause()
    {
        return cause;
    }

    public boolean removeContains(DataSingleton item)
    {
        return removed.contains(item);
    }

    public ArrayList<DataSingleton> getAdded()
    {
        return added;
    }
}
