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

    public DataSingletonCollection()
    {
        items = new HashMap<Integer, DataSingleton>();
    }

    public synchronized DataSingleton get(DataSingleton item)
    {
        if (items.containsKey(item.hashCode()))
        {
            return items.get(item.hashCode());
        }
        else
        {
            items.put(item.hashCode(), item);
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

    public synchronized void clear()
    {
        items.clear();
    }
}
