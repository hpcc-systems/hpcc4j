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

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hpccsystems.commons.filter.SQLFragment.FragmentType;
import org.hpccsystems.commons.utils.Utils;

public class SQLFilter
{
    private List<SQLExpression>     expressions;
    private List<String>            expressionUniqueColumnNames;
    private boolean                 orOperatorUsed;

    public final static SQLOperator andOperator    = new SQLOperator(SQLOperator.and);
    public final static SQLOperator orOperator     = new SQLOperator(SQLOperator.or);

    private final static String     otherThanQuote = " [^\'\"] ";
    private final static String     quotedString   = String.format(" \' %s* \' ", otherThanQuote);

    public final static String      andregex       = "(?x) " +                                        // enable comments, ignore white spaces
            "\\s+(?i)and\\s+" +                                                                       // match an isolated, case insensitive AND
            "(?=" +                                                                                   // start positive look ahead
            "(" +                                                                                     // start group 1
            otherThanQuote + "*" +                                                                    // match 'otherThanQuote' zero or more times
            quotedString +                                                                            // match 'quotedString'
            ")*" +                                                                                    // end group 1 and repeat it zero or more times
            otherThanQuote + "*" +                                                                    // match 'otherThanQuote'
            "$" +                                                                                     // match the end of the string
            ")";                                                                                      // stop positive look ahead

    public final static String      orregex        = "(?x) " +                                        // enable comments, ignore white spaces
            "\\s+(?i)or\\s+" +                                                                        // match an isolated, case insensitive OR
            "(?=" +                                                                                   // start positive look ahead
            "(" +                                                                                     // start group 1
            otherThanQuote + "*" +                                                                    // match 'otherThanQuote' zero or more times
            quotedString +                                                                            // match 'quotedString'
            ")*" +                                                                                    // end group 1 and repeat it zero or more times
            otherThanQuote + "*" +                                                                    // match 'otherThanQuote'
            "$" +                                                                                     // match the end of the string
            ")";                                                                                      // stop positive look ahead

    /**
     * Instantiates a new SQL filter.
     */
    public SQLFilter()
    {
        expressions = new ArrayList<SQLExpression>();
        expressionUniqueColumnNames = new ArrayList<String>();
        orOperatorUsed = false;
    }

    /**
     * Adds the expression.
     *
     * @param expression
     *            the expression
     */
    public void addExpression(SQLExpression expression)
    {
        expressions.add(expression);

        if (expression.getPrefixType() == FragmentType.FIELD || expression.getPrefixType() == FragmentType.FIELD_CONTENT_MODIFIER)
        {
            if (!expressionUniqueColumnNames.contains(expression.getPrefixValue())) expressionUniqueColumnNames.add(expression.getPrefixValue());
        }

        if (expression.getPostfixType() == FragmentType.FIELD || expression.getPostfixType() == FragmentType.FIELD_CONTENT_MODIFIER)
        {
            if (!expressionUniqueColumnNames.contains(expression.getPostfixValue())) expressionUniqueColumnNames.add(expression.getPostfixValue());
        }
    }

    /**
     * Gets the expressions.
     *
     * @return the expressions
     */
    public Iterator<SQLExpression> getExpressions()
    {
        return expressions.iterator();
    }

    /**
     * Gets the expressions count.
     *
     * @return the expressions count
     */
    public int getExpressionsCount()
    {
        return expressions.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        String clause = new String("");
        for (SQLExpression exp : expressions)
        {
            clause += exp.toString();
        }
        return clause;
    }

    /**
     * Full to string.
     *
     * @return the string
     */
    public String fullToString()
    {
        String clause = new String("");
        for (SQLExpression exp : expressions)
        {
            clause += exp.toStringFull(true);
        }
        return clause;
    }

    /**
     * To string translate source.
     *
     * @param map
     *            the map
     * @param ignoreMisTranslations
     *            the ignore mis translations
     * @return the string
     */
    public String toStringTranslateSource(HashMap<String, String> map, boolean ignoreMisTranslations)
    {
        String clause = new String("");
        String expstr = null;
        boolean foundFirstExpression = false;
        for (SQLExpression exp : expressions)
        {
            expstr = exp.toStringTranslateSource(map, !foundFirstExpression, ignoreMisTranslations);

            if (expstr != null)
            {
                clause += expstr;
                if (!foundFirstExpression) foundFirstExpression = true;
            }
        }
        return clause;
    }

    /**
     * Gets the expression column names.
     *
     * @return the expression column names
     */
    public String[] getExpressionColumnNames()
    {
        String[] colnames = new String[getExpressionsCount()];

        int i = 0;
        for (SQLExpression exp : expressions)
        {
            if (exp.getPrefixType() == FragmentType.FIELD || exp.getPrefixType() == FragmentType.FIELD_CONTENT_MODIFIER)
                colnames[i++] = exp.getPrefixValue();
            if (exp.getPostfixType() == FragmentType.FIELD || exp.getPostfixType() == FragmentType.FIELD_CONTENT_MODIFIER)
                colnames[i++] = exp.getPostfixValue();
        }

        return colnames;
    }

    /**
     * Gets the expression from column name.
     *
     * @param colname
     *            the colname
     * @return the expression from column name
     */
    public String getExpressionFromColumnName(String colname)
    {
        String expstr = "";
        for (SQLExpression exp : expressions)
        {
            if (exp.getPrefixType() == FragmentType.FIELD && exp.getPrefixValue().equals(colname)
                    || exp.getPostfixType() == FragmentType.FIELD && exp.getPostfixValue().equals(colname))
            {
                if (expstr.length() != 0) expstr += " AND ";
                expstr += exp.toString();
            }
        }

        return expstr;
    }

    /**
     * Contains key.
     *
     * @param colname
     *            the colname
     * @return true, if successful
     */
    public boolean containsKey(String colname)
    {
        if (expressionUniqueColumnNames.contains(colname))
        {
            for (SQLExpression exp : expressions)
            {
                if (exp.containsKey(colname)) return true;
            }
        }

        return false;
    }

    /**
     * Gets the unique expression column names.
     *
     * @return the unique expression column names
     */
    public Object[] getUniqueExpressionColumnNames()
    {
        return expressionUniqueColumnNames.toArray();
    }

    /**
     * Checks if is or operator used.
     *
     * @return true, if is or operator used
     */
    public boolean isOrOperatorUsed()
    {
        return orOperatorUsed;
    }

    /**
     * Handle group parens.
     *
     * @param group
     *            the group
     * @return the string
     */
    /* Temporary Patch until full logic parser is implemented */
    private String handleGroupParens(String group)
    {
        String unencapsulated = group.trim();
        if (group.charAt(0) == '(' && group.charAt(group.length() - 1) == ')')
        {
            int secopen = group.indexOf('(', 1);
            int firstclose = group.indexOf(')', 1);
            if (secopen < firstclose)
            {
                int sectolastclose = group.substring(0, group.length() - 1).lastIndexOf(')');
                int lastopen = group.lastIndexOf('(');
                if (sectolastclose == -1 || sectolastclose > lastopen) unencapsulated = Utils.getParenContents(group);
            }
        }
        return unencapsulated;
    }

    /**
     * Parses the where clause.
     *
     * @param whereclause
     *            the whereclause
     * @throws SQLException
     *             the SQL exception
     */
    public void parseWhereClause(String whereclause) throws SQLException
    {
        whereclause = handleGroupParens(whereclause);

        String[] splitedwhereands = whereclause.split(andregex);

        for (int andsIndex = 0; andsIndex < splitedwhereands.length; andsIndex++)
        {
            splitedwhereands[andsIndex] = handleGroupParens(splitedwhereands[andsIndex]);

            String splitedwhereandors[] = splitedwhereands[andsIndex].split(orregex);

            for (int orsIndex = 0; orsIndex < splitedwhereandors.length; orsIndex++)
            {
                splitedwhereandors[orsIndex] = handleGroupParens(splitedwhereandors[orsIndex]);
                SQLExpression exp = new SQLExpression();

                exp.ParseExpression(splitedwhereandors[orsIndex]);

                addExpression(exp);

                // First expressions don't need previous unifier
                if (orsIndex > 0)
                {
                    orOperatorUsed = true;
                    exp.setPreviousExpUnifier(orOperator);
                }
                else
                {
                    if (andsIndex > 0) exp.setPreviousExpUnifier(andOperator);
                }
            }
        }
    }

    /**
     * Contains equality condition.
     *
     * @param map
     *            the map
     * @param first
     *            the first
     * @param second
     *            the second
     * @return true, if successful
     */
    public boolean containsEqualityCondition(HashMap<String, String> map, String first, String second)
    {
        boolean andsmatch = false;
        SQLOperator prevunifier = null;
        for (SQLExpression exp : expressions)
        {
            prevunifier = exp.getPreviousExpUnifier();
            boolean localmatch = exp.isEqualityCondition(map, first, second);

            if (prevunifier == null || prevunifier.equals(andOperator))
                andsmatch |= localmatch;
            else if (prevunifier != null && prevunifier.equals(orOperator))
            {
                if (!andsmatch || !localmatch)
                {
                    return false;
                }

                andsmatch = false;
            }
        }
        return andsmatch;
    }
}
