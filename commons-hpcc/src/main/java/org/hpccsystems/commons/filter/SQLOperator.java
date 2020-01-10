
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

package org.hpccsystems.commons.filter;

import java.util.HashMap;
import java.util.regex.Pattern;


/**
 * <p>SQLOperator class.</p>
 */
public class SQLOperator
{
    public enum OperatorType
    {
        UNKNOWN,
        PRE_UNARY,
        POST_UNARY,
        NOOPTRUE,
        NOOPFALSE,
        BINARY;
    }

    private static HashMap<String, OperatorType> validOps;

    // When adding a new operator, make sure to add it to validOps array
    /** Constant <code>eq="new String(=)"</code> */
    public static final String  eq        = new String("=");
    /** Constant <code>neq="new String(<>)"</code> */
    public static final String  neq       = new String("<>");
    /** Constant <code>neq2="new String(!=)"</code> */
    public static final String  neq2      = new String("!=");
    /** Constant <code>isNull="new String( IS NULL)"</code> */
    public static final String  isNull    = new String(" IS NULL");
    /** Constant <code>isNotNull="new String( IS NOT NULL)"</code> */
    public static final String  isNotNull = new String(" IS NOT NULL");
    /** Constant <code>gt="new String(>)"</code> */
    public static final String  gt        = new String(">");
    /** Constant <code>lt="new String(<)"</code> */
    public static final String  lt        = new String("<");
    /** Constant <code>gte="new String(>=)"</code> */
    public static final String  gte       = new String(">=");
    /** Constant <code>lte="new String(<=)"</code> */
    public static final String  lte       = new String("<=");
    /** Constant <code>and="new String( AND )"</code> */
    public static final String  and       = new String(" AND ");
    /** Constant <code>or="new String( OR )"</code> */
    public static final String  or        = new String(" OR ");
    //public static final String  not       = new String(" NOT ");
    //public static final String  exists    = new String(" EXISTS ");
    //public static final String  like      = new String(" LIKE ");
    /** Constant <code>in="new String( IN )"</code> */
    public static final String  in        = new String(" IN ");
    /** Constant <code>notIn="new String( NOT IN )"</code> */
    public static final String  notIn     = new String(" NOT IN ");



    /** Constant <code>ISNULLSPLITPATTERN="\\s+(?i)IS\\s+(?i)NULL\\s*"</code> */
    public final static String ISNULLSPLITPATTERN = "\\s+(?i)IS\\s+(?i)NULL\\s*";
    /** Constant <code>ISNOTNULLSPLITPATTERN="\\s+(?i)IS\\s+(?i)NOT\\s+(?i)NULL\\s*"</code> */
    public final static String ISNOTNULLSPLITPATTERN = "\\s+(?i)IS\\s+(?i)NOT\\s+(?i)NULL\\s*";
    /** Constant <code>ANDSPLITPATTERN="\\s+(?i)AND\\s+"</code> */
    public final static String ANDSPLITPATTERN = "\\s+(?i)AND\\s+";
    /** Constant <code>ORSPLITPATTERN="\\s+(?i)OR\\s+"</code> */
    public final static String ORSPLITPATTERN = "\\s+(?i)OR\\s+";
    /** Constant <code>NOTSPLITPATTERN="\\s+(?i)NOT\\s+"</code> */
    public final static String NOTSPLITPATTERN = "\\s+(?i)NOT\\s+";
    //public final static String EXISTSSPLITPATTERN = "\\s+(?i)EXISTS\\s*";
    //public final static String LIKESPLITPATTERN = "\\s+(?i)LIKE\\s*";
    /** Constant <code>INSPLITPATTERN="\\s+(?i)IN\\s+"</code> */
    public final static String INSPLITPATTERN = "\\s+(?i)IN\\s+";
    /** Constant <code>NOTINSPLITPATTERN="\\s+(?i)NOT\\s+(?i)IN\\s*"</code> */
    public final static String NOTINSPLITPATTERN = "\\s+(?i)NOT\\s+(?i)IN\\s*";

    private final static Pattern ISNULLPATTERN = Pattern.compile(
            "(.?)+"+ISNULLSPLITPATTERN,Pattern.DOTALL);

    private final static Pattern ISNOTNULLPATTERN = Pattern.compile(
            "(.?)+"+ISNOTNULLSPLITPATTERN,Pattern.DOTALL);

    private final static Pattern ANDPATTERN = Pattern.compile(
            "(.?){1}"+ANDSPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    private final static Pattern ORPATTERN = Pattern.compile(
            "(.?){1}"+ORSPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    //private final static Pattern NOTPATTERN = Pattern.compile(
    //        NOTSPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    //private final static Pattern EXISTSPATTERN = Pattern.compile(
    //        EXISTSSPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    //private final static Pattern LIKEPATTERN = Pattern.compile(
    //        LIKESPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    private final static Pattern INPATTERN = Pattern.compile(
        "(.?)+"+INSPLITPATTERN+"(.?)+",Pattern.DOTALL);

    private final static Pattern NOTINPATTERN = Pattern.compile(
            "(.?){1}"+NOTINSPLITPATTERN+"(.?){1}",Pattern.DOTALL);

    static
    {
        validOps = new HashMap<String, SQLOperator.OperatorType>();

        validOps.put(eq, OperatorType.BINARY);
        validOps.put(neq, OperatorType.BINARY);
        validOps.put(neq2, OperatorType.BINARY);
        //validOps.put(isNull, OPERATOR_TYPE.POSTUNARY);
        //validOps.put(isNotNull, OPERATOR_TYPE.POSTUNARY);
        validOps.put(isNull, OperatorType.NOOPFALSE);
        validOps.put(isNotNull, OperatorType.NOOPTRUE);
        validOps.put(gt, OperatorType.BINARY);
        validOps.put(lt, OperatorType.BINARY);
        validOps.put(gte, OperatorType.BINARY);
        validOps.put(lte, OperatorType.BINARY);
        validOps.put(and, OperatorType.BINARY);
        validOps.put(or, OperatorType.BINARY);
        //validOps.put(not, OPERATOR_TYPE.PRE_UNARY);
        //validOps.put(exists, OPERATOR_TYPE.PRE_UNARY);
        //validOps.put(like, OPERATOR_TYPE.BINARY);
        validOps.put(in, OperatorType.BINARY);
        validOps.put(notIn, OperatorType.BINARY);
    }

    private final String    value;
    private OperatorType   type;
    private String          splitPattern = null;

    /**
     * <p>Constructor for SQLOperator.</p>
     *
     * @param fragment a {@link java.lang.String} object.
     */
    public SQLOperator(String fragment)
    {
        String upperFragment = fragment.toUpperCase();

        if (validOps.containsKey(upperFragment))
        {
            value = upperFragment;
            type = validOps.get(value);
        }
        else
        {
            if (upperFragment.indexOf(SQLOperator.gte) != -1)
                value = SQLOperator.gte;
            else if (upperFragment.indexOf(SQLOperator.lte) != -1)
                value = SQLOperator.lte;
            else if (upperFragment.indexOf(SQLOperator.neq) != -1)
                value = SQLOperator.neq;
            else if (upperFragment.indexOf(SQLOperator.neq2) != -1)
                value = SQLOperator.neq2;
            else if (upperFragment.indexOf(SQLOperator.eq) != -1)
                value = SQLOperator.eq;
            else if (upperFragment.indexOf(SQLOperator.gt) != -1)
                value = SQLOperator.gt;
            else if (upperFragment.indexOf(SQLOperator.lt) != -1)
                value = SQLOperator.lt;
            else if (ANDPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = ANDSPLITPATTERN;
                value = SQLOperator.and;
            }
            else if (ORPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = ORSPLITPATTERN;
                value = SQLOperator.or;
            }
            else if (ISNOTNULLPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = ISNOTNULLSPLITPATTERN;
                value = SQLOperator.isNotNull;
            }
            else if (ISNULLPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = ISNULLSPLITPATTERN;
                value = SQLOperator.isNull;
            }
            else if (NOTINPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = NOTINSPLITPATTERN;
                value = SQLOperator.notIn;
            }
            else if (INPATTERN.matcher(upperFragment).matches())
            {
                splitPattern = INSPLITPATTERN;
                value = SQLOperator.in;
            }

            else
                value = null;
        }

        if (value != null)
            type = validOps.get(value);
    }

    /**
     * <p>Getter for the field <code>value</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getValue()
    {
        return value;
    }

    /**
     * <p>isBinary.</p>
     *
     * @return a boolean.
     */
    public boolean isBinary()
    {
        return type == OperatorType.BINARY;
    }

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLOperator.OperatorType} object.
     */
    public OperatorType getType()
    {
        return type;
    }
    /**
     * <p>isValid.</p>
     *
     * @return a boolean.
     */
    public boolean isValid()
    {
        return validOps.containsKey(value);
    }

    /**
     * <p>splitExpressionFragment.</p>
     *
     * @param fragment a {@link java.lang.String} object.
     * @return an array of {@link java.lang.String} objects.
     */
    public String [] splitExpressionFragment(String fragment)
    {
        return fragment.split(splitPattern == null ? value : splitPattern);
    }

    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        return value == null ? "" : value;
    }
}
