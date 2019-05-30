/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.hpccsystems.commons.ecl;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A field filter. Consists of a field name and a list of one or
 * more alternative value ranges.
 */
public class FieldFilter implements Serializable
{
    public static final long   serialVersionUID = 1L;
    private String             name;
    private ArrayList<FieldFilterRange> ranges = new ArrayList<FieldFilterRange>();

    /**
     * A field filter.
     *
     * @param fieldName
     * @param filterRange
     */
    public FieldFilter(String fieldName, FieldFilterRange filterRange)
    {
        this(fieldName, new FieldFilterRange[]{filterRange});
    }

    /**
     * A field filter that checks only a prefix of of the field.
     *
     * @param fieldName
     *            the name of a field, can be a compound name.
     * @param filterRanges
     *            the list of alternative values
     * @param prefixMatchLength
     *            length for the test, zero means entire field
     */
    public FieldFilter(String fieldName, FieldFilterRange[] filterRanges)
    {
        this.name = fieldName;
        for (int i = 0; i < filterRanges.length; i++)
        {
            ranges.add(filterRanges[i]);
        }
    }

    /**
     * A wild card field filter.
     *
     * @param fieldName
     *            the field name
     */
    public FieldFilter(String fieldName)
    {
        this.name = fieldName;
    }

    /**
     * Appends a filter clause to the current filter
     * Applied to current target field
     * Each clause if OR'ed
     *
     * @param range
     *            the fieldfilter range to append (OR)
     */
    public FieldFilter appendFilterRange(FieldFilterRange range)
    {
        if (range != null)
            ranges.add(range);
        return this;
    }

    /**
     * the field name
     */
    public String getFieldName()
    {
        return this.name;
    }

    /**
     * The sumber of ranges used in this filter.
     */
    public int getRangeCount()
    {
        return this.ranges.size();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        StringBuilder sb = new StringBuilder(20 + this.name.length() + 50 * ranges.size());
        sb.append(this.name);
        if (this.ranges.size() == 0)
        {
            sb.append("*");
        }

        if (this.ranges.size() > 0)
        {
            sb.append("=");
            sb.append(ranges.get(0).filterExpression());
            for (int i = 1; i < ranges.size(); i++)
            {
                sb.append(",");
                sb.append(ranges.get(i).filterExpression());
            }
        }
        return sb.toString();
    }
}
