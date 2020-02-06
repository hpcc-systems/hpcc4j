package org.hpccsystems.commons.filter;

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

import java.util.List;
import java.util.StringTokenizer;

import org.hpccsystems.commons.utils.Utils;

public class SQLFragment
{
    public enum FragmentType
    {
        UNKNOWN_TYPE, NUMERIC_FRAGMENT, LITERAL_STRING, PARAMETERIZED, FIELD, LIST, CONTENT_MODIFIER, FIELD_CONTENT_MODIFIER, AGGREGATE_FUNCTION, BOOLEAN;
    }

    private String       fnname = null;
    private String       parent = null;
    private String       value  = null;
    private FragmentType type   = FragmentType.UNKNOWN_TYPE;

    /**
     * Instantiates a new SQL fragment.
     */
    public SQLFragment()
    {
    }

    /**
     * Instantiates a new SQL fragment.
     *
     * @param framentStr
     *            the frament str
     */
    public SQLFragment(String framentStr)
    {
        parseExpressionFragment(framentStr);
    }

    /**
     * Checks if is parameterized.
     *
     * @return true, if is parameterized
     */
    public boolean isParameterized()
    {
        return type == FragmentType.PARAMETERIZED;
    }

    /**
     * Gets the parent.
     *
     * @return the parent
     */
    public String getParent()
    {
        return parent;
    }

    /**
     * Sets the parent.
     *
     * @param parent
     *            the new parent
     */
    public void setParent(String parent)
    {
        this.parent = parent.toUpperCase();
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue()
    {
        if (type == FragmentType.CONTENT_MODIFIER || type == FragmentType.FIELD_CONTENT_MODIFIER)
            return fnname + "( " + value + " )";
        else
            return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public FragmentType getType()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the new type
     */
    public void setType(FragmentType type)
    {
        this.type = type;
    }

    /**
     * Handle field type.
     *
     * @param fragment
     *            the fragment
     */
    private void handleFieldType(String fragment)
    {
        String fragsplit[] = fragment.split(Utils.DOTSEPERATORREGEX, 2);
        if (fragsplit.length == 1)
        {
            setValue(Utils.handleQuotedString(fragsplit[0]));
        }
        else
        {
            setParent(Utils.handleQuotedString(fragsplit[0]));
            setValue(Utils.handleQuotedString(fragsplit[1]));
        }
    }

    /**
     * Parses the expression fragment.
     *
     * @param fragment
     *            the fragment
     */
    public void parseExpressionFragment(String fragment)
    {
        try
        {
            this.type = determineFragmentType(fragment);

            switch (type)
            {
                case LITERAL_STRING:
                    fragment = Utils.replaceSQLwithECLEscapeChar(fragment);
                case NUMERIC_FRAGMENT:
                case PARAMETERIZED:
                case BOOLEAN:
                    setValue(fragment);
                    break;
                case FIELD:
                    handleFieldType(fragment);
                    break;
                case LIST:

                    if (Utils.hasPossibleEscapedQuoteLiteral(fragment))
                    {
                        StringBuilder tmp = new StringBuilder();

                        StringTokenizer comatokens = new StringTokenizer(Utils.getParenContents(fragment), ",");

                        while (comatokens.hasMoreTokens())
                        {
                            if (tmp.length() == 0)
                                tmp.append("[");
                            else
                                tmp.append(", ");

                            tmp.append(Utils.replaceSQLwithECLEscapeChar(comatokens.nextToken().trim()));
                        }
                        tmp.append("]");

                        setValue(tmp.toString());
                    }
                    else
                        setValue("[" + Utils.getParenContents(fragment) + "]");

                    break;
                /*
                 * case AGGREGATE_FUNCTION:
                 * Matcher matcher = HPCCJDBCUtils.AGGFUNCPATTERN.matcher(fragment);
                 * 
                 * if (matcher.matches())
                 * {
                 * ECLFunction func = ECLFunctions.getEclFunction(matcher.group(1));
                 * 
                 * if (func == null)
                 * HPCCJDBCUtils.traceoutln(Level.WARNING, "Function found in HAVING clause might not be supported.");
                 * else
                 * {
                 * if (func.getFunctionType() == FunctionType.CONTENT_MODIFIER)
                 * {
                 * this.type = FragmentType.CONTENT_MODIFIER;
                 * 
                 * setFnname(func.getEclFunction());
                 * String subfragment = matcher.group(3).trim();
                 * FragmentType subfragtype = determineFragmentType(subfragment);
                 * switch (subfragtype)
                 * {
                 * case FIELD:
                 * handleFieldType(subfragment);
                 * this.type = FragmentType.FIELD_CONTENT_MODIFIER;
                 * break;
                 * case LITERAL_STRING:
                 * case NUMERIC_FRAGMENT:
                 * case PARAMETERIZED:
                 * case BOOLEAN:
                 * setValue(subfragment);
                 * break;
                 * }
                 * }
                 * else
                 * {
                 * String fnname = matcher.group(1).trim();
                 * setParent(fnname);
                 * setValue(fnname+"out");
                 * }
                 * }
                 * }
                 * break;
                 */
                default:
                    break;
            }
        }
        catch (Exception e)
        {
            System.out.println("Error while parsing SQL fragment: " + fragment);
        }
    }

    /**
     * Creates the expression fragment.
     *
     * @param fragment
     *            the fragment
     * @return the SQL fragment
     */
    public static SQLFragment createExpressionFragment(String fragment)
    {
        SQLFragment frag = new SQLFragment();

        frag.parseExpressionFragment(fragment);

        return frag;
    }

    /**
     * Determine fragment type.
     *
     * @param fragStr
     *            the frag str
     * @return the fragment type
     */
    public static FragmentType determineFragmentType(String fragStr)
    {
        if (fragStr == null || fragStr.length() <= 0)
        {
            return FragmentType.UNKNOWN_TYPE;
        }
        else if (Utils.isParameterizedStr(fragStr))
        {
            return FragmentType.PARAMETERIZED;
        }
        else if (Utils.isLiteralString(fragStr))
        {
            return FragmentType.LITERAL_STRING;
        }
        else if (Utils.isBooleanKeyWord(fragStr))
        {
            return FragmentType.BOOLEAN;
        }
        else if (Utils.isNumeric(fragStr))
        {
            return FragmentType.NUMERIC_FRAGMENT;
        }
        else if (Utils.isInParenthesis(fragStr))
        {
            return FragmentType.LIST;
        }
        else if (Utils.isAggFunction(fragStr))
        {
            return FragmentType.AGGREGATE_FUNCTION;
        }
        else
        {
            return FragmentType.FIELD;
        }
    }

    /**
     * Gets the full column name.
     *
     * @return the full column name
     */
    public String getFullColumnName()
    {
        if (type == FragmentType.FIELD)
            return getParent() + "." + getValue();
        else
            return getValue();
    }

    /**
     * Update fragment colum parent.
     *
     * @param sqlTables
     *            the sql tables
     * @throws Exception
     *             the exception
     */
    public void updateFragmentColumParent(List<SQLTable> sqlTables) throws Exception
    {
        if (type == FragmentType.FIELD || type == FragmentType.FIELD_CONTENT_MODIFIER)
        {
            if (parent != null && parent.length() > 0)
            {
                setParent(searchForPossibleTableName(sqlTables));
            }
            else if (sqlTables.size() == 1)
            {
                setParent(sqlTables.get(0).getName());
            }
            else
            {
                throw new Exception("Ambiguous field found: " + getValue());
            }
        }
    }

    /**
     * Returns table name if the tablename or alias match Otherwise
     * throw exception.
     *
     * @param sqlTables
     *            the sql tables
     * @return the string
     * @throws Exception
     *             the exception
     */
    private String searchForPossibleTableName(List<SQLTable> sqlTables) throws Exception
    {
        for (int i = 0; i < sqlTables.size(); i++)
        {
            SQLTable currTable = sqlTables.get(i);
            if (parent.equalsIgnoreCase(currTable.getAlias()) || parent.equalsIgnoreCase(currTable.getName())) return currTable.getName();
        }

        throw new Exception("Invalid field found: " + getFullColumnName());
    }

    /**
     * Gets the fnname.
     *
     * @return the fnname
     */
    public String getFnname()
    {
        return fnname;
    }

    /**
     * Sets the fnname.
     *
     * @param fnname
     *            the new fnname
     */
    public void setFnname(String fnname)
    {
        this.fnname = fnname;
    }
}
