
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
    public static final String  eq        = new String("=");
    public static final String  neq       = new String("<>");
    public static final String  neq2      = new String("!=");
    public static final String  isNull    = new String(" IS NULL");
    public static final String  isNotNull = new String(" IS NOT NULL");
    public static final String  gt        = new String(">");
    public static final String  lt        = new String("<");
    public static final String  gte       = new String(">=");
    public static final String  lte       = new String("<=");
    public static final String  and       = new String(" AND ");
    public static final String  or        = new String(" OR ");
    //public static final String  not       = new String(" NOT ");
    //public static final String  exists    = new String(" EXISTS ");
    //public static final String  like      = new String(" LIKE ");
    public static final String  in        = new String(" IN ");
    public static final String  notIn     = new String(" NOT IN ");



    public final static String ISNULLSPLITPATTERN = "\\s+(?i)IS\\s+(?i)NULL\\s*";
    public final static String ISNOTNULLSPLITPATTERN = "\\s+(?i)IS\\s+(?i)NOT\\s+(?i)NULL\\s*";
    public final static String ANDSPLITPATTERN = "\\s+(?i)AND\\s+";
    public final static String ORSPLITPATTERN = "\\s+(?i)OR\\s+";
    public final static String NOTSPLITPATTERN = "\\s+(?i)NOT\\s+";
    //public final static String EXISTSSPLITPATTERN = "\\s+(?i)EXISTS\\s*";
    //public final static String LIKESPLITPATTERN = "\\s+(?i)LIKE\\s*";
    public final static String INSPLITPATTERN = "\\s+(?i)IN\\s+";
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

    public String getValue()
    {
        return value;
    }

    public boolean isBinary()
    {
        return type == OperatorType.BINARY;
    }

    public OperatorType getType()
    {
        return type;
    }
    public boolean isValid()
    {
        return validOps.containsKey(value);
    }

    public String [] splitExpressionFragment(String fragment)
    {
        return fragment.split(splitPattern == null ? value : splitPattern);
    }

    @Override
    public String toString()
    {
        return value == null ? "" : value;
    }
}