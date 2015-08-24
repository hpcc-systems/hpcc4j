package org.hpccsystems.ws.client.antlr;

import org.antlr.v4.runtime.ANTLRInputStream;

/*
    Copyright (C) 2005-2015 Christian P. Lerch <christian.p.lerch[at]gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

/**
 *
 * @author Christian P. Lerch
 * @version 1.0.0
 * @since 1.0
 */

/**
 *
 * @author rpastrana for HPCC
 * Edited and reformatted
 *
 */

public class CaseControlStringStream extends ANTLRInputStream
{
    public boolean toUpperCase = false;// default: Stream is case-sensitive

    /** Copy data from string to a local char array */
    public CaseControlStringStream(String input)
    {
        super();
        this.data = input.toCharArray();
        this.n = input.length();
    }

    /** This is the preferred constructor as no data is actually copied */
    public CaseControlStringStream(char[] data, int numberOfActualCharsInArray)
    {
        super();
        this.data = data;
        this.n = numberOfActualCharsInArray;
    }

    @Override
    public int LA(int i)
    {
        int c = super.LA(i);
        return toUpperCase ? Character.toUpperCase(c) : c;
    }
}
