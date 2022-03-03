/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import java.util.Arrays;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FieldFilter;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldFilterRange;

// Sets get compiled into a range as well
// Not Equal really doesn't make sense in terms of a single range
// Really needs to be two Field Filters
//
// Need to have the "comparisonType" to allow for equals & notEquals

/**
 * A helper class that represents an individual filter applied to a field.
 * 
 * A value range can be tested against the CompiledFieldFilter via {@link #matchesRange(Object, Object) matchesRange}.
 */
public class CompiledFieldFilter
{
    private static final Logger log = LogManager.getLogger(CompiledFieldFilter.class);
    
    private static final int USE_DEFAULT_MAX_STRING = -1;

    private static final String minStringValue = "";

    // 32 chars of the max extended ascii char.
    private static final String maxStringValue = "ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ";

    private int fieldIndex = -1;
    private FieldType fieldType = FieldType.UNKNOWN;

    // 0 and 1 for closed and open lower bound
    private int lowerComparisonType = 0;
    private Object lowerValue = null;

    // 0 and 1 for closed and open upper bound
    private int upperComparisonType = 0;
    private Object upperValue = null;

    // -1 will compare the entire length
    private int comparisonLength = -1;

    CompiledFieldFilter(int fdIndex, FieldType fdType, FieldFilterRange filter) throws Exception
    {
        fieldIndex = fdIndex;
        fieldType = fdType;

        String[] filterValues = filter.getValues();
        if (filterValues.length == 1)
        {
            this.lowerValue = convertValue(filterValues[0], fdType);
            this.upperValue = this.lowerValue;
        }
        else
        {
            // For more than two object we either have a range between
            // 2 values or a set. In the case of the the range they should
            // already be sorted but it cannot hurt to do it again.
            // In the case of the set we want to find the largest and smallest values
            // So sort the converted values to find the min and max for our range.
            Object[] convertedValues = new Object[filterValues.length];
            for (int i = 0; i < filterValues.length; i++)
            {
                convertedValues[i] = convertValue(filterValues[i], fdType);
            }

            Arrays.sort(convertedValues, (a, b) -> this.compareValues(a,b));

            lowerValue = convertedValues[0];
            upperValue = convertedValues[convertedValues.length-1];
        }

        if (filter.getBound() == FieldFilterRange.Bound.UPPER || filter.getBound() == FieldFilterRange.Bound.NONE)
        {
            this.lowerValue = getMinValueForType(fdType);
        }

        if (filter.getBound() == FieldFilterRange.Bound.LOWER || filter.getBound() == FieldFilterRange.Bound.NONE)
        {
            this.upperValue = getMaxValueForType(fdType);
        }

        if (filter.getLeftOpen())
        {
            this.lowerComparisonType = 1;
        }

        if (filter.getRightOpen())
        {
            this.upperComparisonType = 1;
        }
    }

    public int getFieldIndex()
    {
        return fieldIndex;
    }

    private int compareValues(Object a, Object b) 
    {
        switch (fieldType)
        {
            case INTEGER:
                {
                    Long la = (Long) a;
                    Long lb = (Long) b;
                    return la.compareTo(lb);
                }
            case BOOLEAN:
                {
                    Boolean ba = (Boolean) a;
                    Boolean bb = (Boolean) b;
                    return ba.compareTo(bb);
                }
            case REAL:
                {
                    Double da = (Double) a;
                    Double db = (Double) b;
                    return da.compareTo(db);
                }
            case DECIMAL:
                {
                    BigDecimal da = (BigDecimal) a;
                    BigDecimal db = (BigDecimal) b;
                    return da.compareTo(db);
                }
            case STRING:
                {
                    String sa = (String) a;
                    String sb = (String) b;

                    if (comparisonLength < 0)
                    {
                        return sa.compareTo(sb);
                    }
                    else
                    {
                        return sa.substring(0,comparisonLength).compareTo(sb.substring(0,comparisonLength));
                    }
                }
            default:
                // We should never get to this point as an exception will be thrown before this point 
                // for unsupported types. Creating a default with return to keep the compiler happy.
                log.error("Invalid key field type: " + fieldType + " in comparison. This should never happen.");
                return 0;
        }
    }

    public static Object getMinValueForType(FieldType type) throws Exception
    {
        switch (type)
        {
            case INTEGER:
                {
                    return Long.MIN_VALUE;
                }
            case BOOLEAN:
                {
                    return false;
                }
            case REAL:
                {
                    return Double.MIN_VALUE;
                }
            case DECIMAL:
                {
                    return BigDecimal.valueOf(Double.MIN_VALUE);
                }
            case STRING:
                {
                    return minStringValue;
                }
            default:
                throw new Exception("Invalid field type for index field.");
        }
    }

    /**
     * Creates an object that represents that maximum possible value found in an index for the given type.
     * String values will use a fixed length string of 32 char of the last lexographical character ÿ.
     *
     * @param type the field type
     * @return the object representing the maximum value 
     * @throws Exception if the FieldType is invalid in an index key
     */
    public static Object getMaxValueForType(FieldType type) throws Exception
    {
        return getMaxValueForType(type, USE_DEFAULT_MAX_STRING);
    }

    /**
     * Creates an object that represents that maximum possible value found in an index for the given type.
     *
     * @param type the field type
     * @param numStringCodePoints the number of code points required for a given string
     * @return the object representing the maximum value 
     * @throws Exception if the FieldType is invalid in an index key
     */
    public static Object getMaxValueForType(FieldType type, int numStringCodePoints) throws Exception
    {
        switch (type)
        {
            case FILEPOS:
            case INTEGER:
                {
                    return Long.MAX_VALUE;
                }
            case BOOLEAN:
                {
                    return true;
                }
            case REAL:
                {
                    return Double.MAX_VALUE;
                }
            case DECIMAL:
                {
                    return BigDecimal.valueOf(Double.MAX_VALUE);
                }
            case CHAR:
            case STRING:
            case VAR_STRING:
                {
                    if (numStringCodePoints > maxStringValue.length())
                    {
                        // Create a string that is at least numCodePoints long
                        String maxVal = new String(maxStringValue);
                        for (int i = numStringCodePoints; i > 0;)
                        {
                            maxVal.concat(maxStringValue);
                            i -= maxStringValue.length();
                        }
                        return maxVal;
                    }
                    else
                    {
                        return maxStringValue;
                    }
                }
            default:
                throw new Exception("Invalid field type for index field.");
        }
    }

    public static Object convertValue(String value, FieldType type) throws Exception
    {
        switch (type)
        {
            case INTEGER:
                {
                    return Long.valueOf(value);
                }
            case BOOLEAN:
                {
                    return Boolean.valueOf(value);
                }
            case REAL:
                {
                    return Double.valueOf(value);
                }
            case DECIMAL:
                {
                    return BigDecimal.valueOf(Double.valueOf(value));
                }
            case STRING:
                {
                    String unquotedStr = (String) value;
                    if (unquotedStr.length() >= 2)
                    {
                        int startIndex = 0;
                        int endIndex = unquotedStr.length();

                        if (unquotedStr.charAt(0) == '\'')
                        {
                            startIndex = 1;
                        }

                        if (unquotedStr.charAt(unquotedStr.length()-1) == '\'')
                        {
                            endIndex = unquotedStr.length()-1;
                        }

                        unquotedStr = unquotedStr.substring(startIndex,endIndex);
                    }

                    // rtrim and return
                    return unquotedStr.replaceAll("\\s+$", "");
                }
            default:
                throw new Exception("Invalid field type for index field.");
        }
    }

    /**
     * Checks the filter against the provided value range.
     * @param inclusiveBegin the start of the field range
     * @param inclusiveEnd the end of the field range
     * @return true if the filter would match a value in the range, false otherwise.
     */
    public boolean matchesRange(Object inclusiveBegin, Object inclusiveEnd)
    {
        // 1 if inclusive begin is less than lowerValue, 0 if equal
        int beginCompare = compareValues(lowerValue, inclusiveBegin);
        
        // 1 if exclusive end is greater than lowerValue, 0 if equal
        int endCompare = compareValues(inclusiveEnd, lowerValue);

        if (beginCompare >= lowerComparisonType && endCompare >= 0)
        {
            return true;
        }
        
        // 1 if inclusive begin is less than upperValue, 0 if equal
        beginCompare = compareValues(upperValue, inclusiveBegin);
        
        // 1 if exclusive end is greater than upperValue, 0 if equal
        endCompare = compareValues(inclusiveEnd, upperValue);

        if (beginCompare >= upperComparisonType && endCompare >= 0)
        {
            return true;
        }

        return false;
    }

    public String toString()
    {
        return "'" + fieldIndex + "': <> " 
            + (lowerComparisonType == 0 ? "[" : "(") 
            + lowerValue + ", " + upperValue
            + (upperComparisonType == 0 ? "]" : ")");
    }
};