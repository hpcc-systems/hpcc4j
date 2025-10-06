/*******************************************************************************
 * Copyright (c) 2014 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class DataSingletonCollection
{
    Map<Integer, DataSingleton> items;
    CollectionDelta             notificationDelta;
    int                         notifcationDepth;

    public DataSingletonCollection()
    {
        items = new HashMap<Integer, DataSingleton>();
        notificationDelta = null;
        notifcationDepth = 0;
    }

    public synchronized DataSingleton get(DataSingleton item)
    {
        if (items.containsKey(item.hashCode()))
        {
            return items.get(item.hashCode());
        }
        else
        {
            try
            {
                pushTransaction("DataSingletonCollection.get");
                items.put(item.hashCode(), item);
            }
            finally
            {
                popTransaction();
            }
        }
        return item;
    }

    public synchronized DataSingleton getNoCreate(DataSingleton item)
    {
        if (items.containsKey(item.hashCode()))
        {
            return items.get(item.hashCode());
        }
        return null;
    }

    public synchronized void remove(DataSingleton item)
    {
        if (items.containsKey(item.hashCode()))
        {
            items.remove(item);
        }
    }

    public synchronized Collection<DataSingleton> getAll()
    {
        return items.values();
    }

    public synchronized void pushTransaction(String cause)
    {
        if (notifcationDepth == 0)
        {
            notificationDelta = new CollectionDelta(cause, items.values());
        }
        ++notifcationDepth;
    }

    public synchronized void popTransaction()
    {
        --notifcationDepth;
        if (notifcationDepth == 0)
        {
            notificationDelta = null;
        }
    }

    public synchronized void clear()
    {
        items.clear();
    }
}
