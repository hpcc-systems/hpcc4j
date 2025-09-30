/*******************************************************************************
 * Copyright (c) 2025 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.utils;

/**
 * A simple observer interface to replace the deprecated java.util.Observer.
 * An object that implements this interface can observe changes in Observable objects.
 */
public interface Observer
{
    /**
     * This method is called whenever the observed object is changed.
     *
     * @param o   the observable object
     * @param arg an argument passed to the notifyObservers method
     */
    void update(Observable o, Object arg);
}
