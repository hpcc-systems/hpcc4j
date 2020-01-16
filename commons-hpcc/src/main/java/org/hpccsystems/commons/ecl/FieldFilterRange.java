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

/**
 * A filter value range. Used to construct a range (open or closed on either end)
 * of values for filtering records. The value range can be a single value for
 * an equality filter.
 */
public class FieldFilterRange implements Serializable
{
    /**
     * The Lower, Upper, Both, Unbounded are the possibilities for
     * bounding the range.
     */
    public enum Bound implements Serializable
    {
        LOWER, UPPER, BOTH, NONE;
    }

    public static final long serialVersionUID = 1L;
    private String[]         values;
    private boolean          leftOpen;
    private boolean          rightOpen;
    private boolean          number;
    private boolean          set;
    private Bound            bound;
    private short            prefix;

    /**
     * Use for single value ranges.
     *
     * @param v
     *            the value
     * @param rangeBound
     *            the range bound
     * @param leftRangeOpen
     *            the left range open
     * @param rightRangeOpen
     *            the right range open
     * @param numeric_target
     *            the field under compare is numeric
     * @param prefixMatchLength
     *            the prefix match length
     */
    public FieldFilterRange(String v, Bound rangeBound, boolean leftRangeOpen, boolean rightRangeOpen, boolean numeric_target,
            short prefixMatchLength)
    {
        this.values = new String[1];
        this.values[0] = v;
        this.bound = rangeBound;
        this.leftOpen = leftRangeOpen;
        this.rightOpen = rightRangeOpen;
        this.number = numeric_target;
        this.set = false;
        prefix = prefixMatchLength;
    }

    /**
     * Use for single value ranges.
     *
     * @param v
     *            the value
     * @param rangeBound
     *            the range bound
     * @param leftRangeOpen
     *            the left range open
     * @param rightRangeOpen
     *            the right range open
     * @param numeric_target
     *            the field under compare is numeric
     */
    public FieldFilterRange(String v, Bound rangeBound, boolean leftRangeOpen, boolean rightRangeOpen, boolean numeric_target)
    {
        this(v, rangeBound, leftRangeOpen, rightRangeOpen, numeric_target, (short) 0);
    }

    /**
     * Use for bounded range.
     *
     * @param low
     *            the low
     * @param high
     *            the high
     * @param leftRangeOpen
     *            the left range open
     * @param rightRangeOpen
     *            the right range open
     * @param numeric_target
     *            the numeric target
     */
    public FieldFilterRange(String low, String high, boolean leftRangeOpen, boolean rightRangeOpen, boolean numeric_target)
    {
        this.bound = Bound.BOTH;
        this.values = new String[2];
        this.values[0] = low;
        this.values[1] = high;
        this.leftOpen = leftRangeOpen;
        this.rightOpen = rightRangeOpen;
        this.set = false;
        this.number = numeric_target;
        prefix = (short) 0;
    }

    /**
     * Use for a set of discrete values.
     *
     * @param valueList
     *            the value list
     * @param numeric_target
     *            the numeric target
     */
    public FieldFilterRange(Object[] valueList, boolean numeric_target)
    {
        this.leftOpen = false;
        this.rightOpen = false;
        this.number = numeric_target;
        this.values = new String[valueList.length];
        for (int i = 0; i < this.values.length; i++)
        {
            this.values[i] = valueList[i].toString();
        }
        this.bound = Bound.BOTH;
        this.set = true;
        this.number = numeric_target;
        prefix = (short) 0;
    }

    /**
     * Create equality filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeEq(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.BOTH, false, false, (v instanceof Number));
    }

    /**
     * Create inequality filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeNE(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.NONE, true, true, (v instanceof Number));
    }

    /**
     * Create less than filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeLT(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.UPPER, true, true, (v instanceof Number));
    }

    /**
     * Create less or equal filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeLE(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.UPPER, true, false, (v instanceof Number));
    }

    /**
     * Create greater than filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeGT(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.LOWER, true, true, (v instanceof Number));
    }

    /**
     * Create greater or equal filter range.
     *
     * @param v
     *            the test value
     * @return the test range
     */
    static public FieldFilterRange makeGE(Object v)
    {
        return new FieldFilterRange(v.toString(), Bound.LOWER, false, true, (v instanceof Number));
    }

    /**
     * Create IN filter range
     * If all entries are numeric, numeric based compare created.
     * Otherwise, string-wise compare
     * @param vs
     *            set of values
     * @return the filter range
     */
    static public FieldFilterRange makeIn(Object[] vs)
    {
        boolean numeric = true;
        for (Object obj : vs)
        {
            if (!(obj instanceof Number))
            {
                numeric = false;
                break;
            }
        }

        return new FieldFilterRange(vs, numeric);
    }

    /**
     * Create IN filter range
     * Encapsulate entries as string values based on stringecapsulate.
     *
     * @param vs
     *            set of values
     * @param stringecapsulate
     *            the stringecapsulate
     * @return the filter range
     */
    static public FieldFilterRange makeIn(Object[] vs, boolean stringecapsulate)
    {
        return new FieldFilterRange(vs, !stringecapsulate);
    }

    /**
     * Create startswith filter range.
     *
     * @param v
     *            the subset
     * @param len
     *            the length to compare
     * @return the filter range
     * @throws Exception
     *             the exception
     */
    static public FieldFilterRange makeStartsWith(Object v, short len) throws Exception
    {
        if (len <= 0) throw new Exception("StartsWith Filter must contain positive len value");

        return new FieldFilterRange(v.toString(), Bound.BOTH, false, false, (v instanceof Number), len);
    }

    /**
     * The filter test range in appropriate syntax for the remote read engine.
     *
     * @return the filter string
     */
    public String filterExpression()
    {
        StringBuilder sb = new StringBuilder(this.values.length * 20);
        if (this.set)
        { // multiple range entries
            sb.append((this.number) ? "[" : "['");
            sb.append(this.values[0]);
            sb.append((this.number) ? "]" : "']");
            for (int i = 1; i < this.values.length; i++)
            {
                sb.append((this.number) ? ",[" : ",['");
                sb.append(this.values[i]);
                sb.append((this.number) ? "]" : "']");
            }
        }
        else
        { // single range entry
            sb.append((this.leftOpen) ? "(" : "[");
            switch (this.bound)
            {
                case BOTH:
                    sb.append((this.number) ? "" : "'");
                    sb.append(this.values[0]);
                    if (this.prefix > 0)
                    {
                        sb.append(":");
                        sb.append(Short.toString(this.prefix));
                    }
                    sb.append((this.number) ? "" : "'");
                    break;
                case LOWER:
                    sb.append((this.number) ? "" : "'");
                    sb.append(this.values[0]);
                    if (this.prefix > 0)
                    {
                        sb.append(":");
                        sb.append(Short.toString(this.prefix));
                    }
                    sb.append((this.number) ? "," : "',");
                    break;
                case UPPER:
                    sb.append((this.number) ? "," : ",'");
                    sb.append(this.values[0]);
                    if (this.prefix > 0)
                    {
                        sb.append(":");
                        sb.append(Short.toString(this.prefix));
                    }
                    sb.append((this.number) ? "" : "'");
                    break;
                default:
                    sb.append((this.number) ? "," : ",'");
                    sb.append(this.values[0]);
                    sb.append((this.number) ? "),(" : "'),('");
                    sb.append(this.values[0]);
                    sb.append((this.number) ? "," : "',");
            }
            sb.append((this.rightOpen) ? ")" : "]");
        }
        return sb.toString();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return this.filterExpression();
    }
}
