/*******************************************************************************
 * Copyright (c) 2011 HPCC Systems. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: HPCC Systems - initial API and implementation
 ******************************************************************************/
package org.hpccsystems.ws.client.utils;

public final class EqualsUtil
{
    /**
     * Checks for changed.
     *
     * @param target
     *            the target
     * @param source
     *            the source
     * @return true, if successful
     */
    static public boolean hasChanged(Object target, Object source)
    {
        if (source == null)
        {
            return false;
        }

        return !EqualsUtil.areEqual(target, source);
    }

    /**
     * Are equal.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(boolean aThis, boolean aThat)
    {
        return aThis == aThat;
    }

    /**
     * Are equal.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(char aThis, char aThat)
    {
        return aThis == aThat;
    }

    /**
     * Are equal.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(long aThis, long aThat)
    {
        /*
         * Implementation Note Note that byte, short, and int are handled by this method, through implicit conversion.
         */
        return aThis == aThat;
    }

    /**
     * Are equal.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(float aThis, float aThat)
    {
        return Float.floatToIntBits(aThis) == Float.floatToIntBits(aThat);
    }

    /**
     * Are equal.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(double aThis, double aThat)
    {
        return Double.doubleToLongBits(aThis) == Double.doubleToLongBits(aThat);
    }

    /**
     * Possibly-null object field.
     *
     * Includes type-safe enumerations and collections, but does not include arrays. See class comment.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areEqual(Object aThis, Object aThat)
    {
        return aThis == null ? aThat == null : aThis.equals(aThat);
    }

    /**
     * Is the null state of both objects equivalent.
     *
     * @param aThis
     *            the a this
     * @param aThat
     *            the a that
     * @return true, if successful
     */
    static public boolean areSameNullState(Object aThis, Object aThat)
    {
        return (aThis == null && aThat == null) || (aThis != null && aThat != null);
    }
}
