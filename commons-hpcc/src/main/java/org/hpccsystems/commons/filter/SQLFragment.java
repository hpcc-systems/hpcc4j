package org.hpccsystems.commons.filter;

/**
 *****************************************************************************
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
 ******************************************************************************
 *
 */

import java.util.List;
import java.util.StringTokenizer;

import org.hpccsystems.commons.utils.Utils;
public class SQLFragment
{
    public enum FragmentType
    {
        UNKNOWN_TYPE,
        NUMERIC_FRAGMENT,
        LITERAL_STRING,
        PARAMETERIZED,
        FIELD,
        LIST,
        CONTENT_MODIFIER,
        FIELD_CONTENT_MODIFIER,
        AGGREGATE_FUNCTION,
        BOOLEAN;
    }

    private String fnname   =   null;
    private String parent   =   null;
    private String value    =   null;
    private FragmentType type = FragmentType.UNKNOWN_TYPE;

    /**
     * <p>Constructor for SQLFragment.</p>
     */
    public SQLFragment() {}
    /**
     * <p>Constructor for SQLFragment.</p>
     *
     * @param framentStr a {@link java.lang.String} object.
     */
    public SQLFragment(String framentStr)
    {
        parseExpressionFragment(framentStr);
    }

    /**
     * <p>isParameterized.</p>
     *
     * @return a boolean.
     */
    public boolean isParameterized()
    {
        return type == FragmentType.PARAMETERIZED;
    }
    /**
     * <p>Getter for the field <code>parent</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getParent()
    {
        return parent;
    }

    /**
     * <p>Setter for the field <code>parent</code>.</p>
     *
     * @param parent a {@link java.lang.String} object.
     */
    public void setParent(String parent)
    {
        this.parent = parent.toUpperCase();
    }

    /**
     * <p>Getter for the field <code>value</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getValue()
    {
        if (type == FragmentType.CONTENT_MODIFIER || type == FragmentType.FIELD_CONTENT_MODIFIER)
            return fnname + "( " + value + " )";
        else
            return value;
    }

    /**
     * <p>Setter for the field <code>value</code>.</p>
     *
     * @param value a {@link java.lang.String} object.
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    /**
     * <p>Getter for the field <code>type</code>.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLFragment.FragmentType} object.
     */
    public FragmentType getType()
    {
        return type;
    }

    /**
     * <p>Setter for the field <code>type</code>.</p>
     *
     * @param type a {@link org.hpccsystems.commons.filter.SQLFragment.FragmentType} object.
     */
    public void setType(FragmentType type)
    {
        this.type = type;
    }

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
     * <p>parseExpressionFragment.</p>
     *
     * @param fragment a {@link java.lang.String} object.
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
               /* case AGGREGATE_FUNCTION:
                    Matcher matcher = HPCCJDBCUtils.AGGFUNCPATTERN.matcher(fragment);

                    if (matcher.matches())
                    {
                        ECLFunction func = ECLFunctions.getEclFunction(matcher.group(1));

                        if (func == null)
                            HPCCJDBCUtils.traceoutln(Level.WARNING,  "Function found in HAVING clause might not be supported.");
                        else
                        {
                            if (func.getFunctionType() == FunctionType.CONTENT_MODIFIER)
                            {
                                this.type = FragmentType.CONTENT_MODIFIER;

                                setFnname(func.getEclFunction());
                                String subfragment = matcher.group(3).trim();
                                FragmentType subfragtype = determineFragmentType(subfragment);
                                switch (subfragtype)
                                {
                                    case FIELD:
                                        handleFieldType(subfragment);
                                        this.type = FragmentType.FIELD_CONTENT_MODIFIER;
                                        break;
                                    case LITERAL_STRING:
                                    case NUMERIC_FRAGMENT:
                                    case PARAMETERIZED:
                                    case BOOLEAN:
                                        setValue(subfragment);
                                        break;
                                }
                            }
                            else
                            {
                                String fnname = matcher.group(1).trim();
                                setParent(fnname);
                                setValue(fnname+"out");
                            }
                        }
                    }
                    break;*/
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
     * <p>createExpressionFragment.</p>
     *
     * @param fragment a {@link java.lang.String} object.
     * @return a {@link org.hpccsystems.commons.filter.SQLFragment} object.
     */
    public static SQLFragment createExpressionFragment(String fragment)
    {
        SQLFragment frag = new SQLFragment();

        frag.parseExpressionFragment(fragment);

        return frag;
    }

    /**
     * <p>determineFragmentType.</p>
     *
     * @param fragStr a {@link java.lang.String} object.
     * @return a {@link org.hpccsystems.commons.filter.SQLFragment.FragmentType} object.
     */
    public static FragmentType determineFragmentType (String fragStr)
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
     * <p>getFullColumnName.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFullColumnName()
    {
        if (type == FragmentType.FIELD)
            return getParent() + "." + getValue();
        else
            return getValue();
    }

    /**
     * <p>updateFragmentColumParent.</p>
     *
     * @param sqlTables a {@link java.util.List} object.
     * @throws java.lang.Exception if any.
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
     * throw exception
     */
    private String searchForPossibleTableName(List<SQLTable> sqlTables) throws Exception
    {
        for (int i = 0; i < sqlTables.size(); i++)
        {
            SQLTable currTable = sqlTables.get(i);
            if (parent.equalsIgnoreCase(currTable.getAlias()) || parent.equalsIgnoreCase(currTable.getName()))
                return currTable.getName();
        }

        throw new Exception("Invalid field found: " + getFullColumnName());
    }
    /**
     * <p>Getter for the field <code>fnname</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFnname()
    {
        return fnname;
    }
    /**
     * <p>Setter for the field <code>fnname</code>.</p>
     *
     * @param fnname a {@link java.lang.String} object.
     */
    public void setFnname(String fnname)
    {
        this.fnname = fnname;
    }
}
