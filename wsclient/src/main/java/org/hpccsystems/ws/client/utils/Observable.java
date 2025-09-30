/*******************************************************************************
 * Copyright (c) 2025 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple observable pattern implementation to replace the deprecated java.util.Observable.
 * This class allows observers to be notified when the state of an object changes.
 */
public class Observable
{
    private final List<Observer> observers = new ArrayList<>();
    private boolean changed = false;

    /**
     * Adds an observer to the set of observers for this object.
     *
     * @param o the observer to be added
     * @throws NullPointerException if the parameter o is null
     */
    public synchronized void addObserver(Observer o)
    {
        if (o == null)
        {
            throw new NullPointerException();
        }
        if (!observers.contains(o))
        {
            observers.add(o);
        }
    }

    /**
     * Deletes an observer from the set of observers of this object.
     *
     * @param o the observer to be deleted
     */
    public synchronized void deleteObserver(Observer o)
    {
        observers.remove(o);
    }

    /**
     * Notifies all observers if this object has been marked as changed.
     */
    public void notifyObservers()
    {
        notifyObservers(null);
    }

    /**
     * Notifies all observers if this object has been marked as changed.
     *
     * @param arg an argument to pass to observers
     */
    public void notifyObservers(Object arg)
    {
        Object[] arrLocal;

        synchronized (this)
        {
            if (!changed)
            {
                return;
            }
            arrLocal = observers.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--)
        {
            ((Observer) arrLocal[i]).update(this, arg);
        }
    }

    /**
     * Deletes all observers from the set of observers of this object.
     */
    public synchronized void deleteObservers()
    {
        observers.clear();
    }

    /**
     * Marks this Observable object as having been changed.
     */
    protected synchronized void setChanged()
    {
        changed = true;
    }

    /**
     * Clears the changed state of this object.
     */
    protected synchronized void clearChanged()
    {
        changed = false;
    }

    /**
     * Tests if this object has changed.
     *
     * @return true if this object has been marked as changed, false otherwise
     */
    public synchronized boolean hasChanged()
    {
        return changed;
    }

    /**
     * Returns the number of observers of this Observable object.
     *
     * @return the number of observers
     */
    public synchronized int countObservers()
    {
        return observers.size();
    }
}
