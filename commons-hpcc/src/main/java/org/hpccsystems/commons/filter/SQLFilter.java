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
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.hpccsystems.commons.filter.SQLFragment.FragmentType;
import org.hpccsystems.commons.utils.Utils;
public class SQLFilter
{
    private List<SQLExpression> expressions;
    private List<String>        expressionUniqueColumnNames;
    private boolean             orOperatorUsed;

    /** Constant <code>andOperator</code> */
    public final static SQLOperator andOperator = new SQLOperator(SQLOperator.and);
    /** Constant <code>orOperator</code> */
    public final static SQLOperator orOperator = new SQLOperator(SQLOperator.or);

    private final static String otherThanQuote = " [^\'] ";
    private final static String quotedString = String.format(" \' %s* \' ", otherThanQuote);

    /** Constant <code>andregex="(?x) +                    // enable com"{trunked}</code> */
    public final static String andregex =
            "(?x) "+                    // enable comments, ignore white spaces
            "\\s+(?i)and\\s+"+          // match an isolated, case insensitive AND
            "(?="+                      // start positive look ahead
            "("+                        //   start group 1
            otherThanQuote + "*" +      //     match 'otherThanQuote' zero or more times
            quotedString +              //     match 'quotedString'
            ")*"+                       //   end group 1 and repeat it zero or more times
            otherThanQuote + "*" +      //   match 'otherThanQuote'
            "$"+                        // match the end of the string
            ")";                        // stop positive look ahead

    /** Constant <code>orregex="(?x) +                    // enable com"{trunked}</code> */
    public final static String orregex =
            "(?x) "+                    // enable comments, ignore white spaces
            "\\s+(?i)or\\s+"+           // match an isolated, case insensitive OR
            "(?="+                      // start positive look ahead
            "("+                        //   start group 1
            otherThanQuote +"*"+        //     match 'otherThanQuote' zero or more times
            quotedString +              //     match 'quotedString'
            ")*"+                       //   end group 1 and repeat it zero or more times
            otherThanQuote +"*"+        //   match 'otherThanQuote'
            "$"+                        // match the end of the string
            ")";                        // stop positive look ahead

    /**
     * <p>Constructor for SQLFilter.</p>
     */
    public SQLFilter()
    {
        expressions = new ArrayList<SQLExpression>();
        expressionUniqueColumnNames = new ArrayList<String>();
        orOperatorUsed = false;
    }

    /**
     * <p>addExpression.</p>
     *
     * @param expression a {@link org.hpccsystems.commons.filter.SQLExpression} object.
     */
    public void addExpression(SQLExpression expression)
    {
        expressions.add(expression);

        if (expression.getPrefixType() == FragmentType.FIELD || expression.getPrefixType() == FragmentType.FIELD_CONTENT_MODIFIER)
        {
            if (!expressionUniqueColumnNames.contains(expression.getPrefixValue()))
                expressionUniqueColumnNames.add(expression.getPrefixValue());
        }

        if (expression.getPostfixType() == FragmentType.FIELD || expression.getPostfixType() == FragmentType.FIELD_CONTENT_MODIFIER)
        {
            if (!expressionUniqueColumnNames.contains(expression.getPostfixValue()))
                expressionUniqueColumnNames.add(expression.getPostfixValue());
        }
    }

    /**
     * <p>Getter for the field <code>expressions</code>.</p>
     *
     * @return a {@link java.util.Iterator} object.
     */
    public Iterator<SQLExpression> getExpressions()
    {
        return expressions.iterator();
    }

    /**
     * <p>getExpressionsCount.</p>
     *
     * @return a int.
     */
    public int getExpressionsCount()
    {
        return expressions.size();
    }

    /** {@inheritDoc} */
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
     * <p>fullToString.</p>
     *
     * @return a {@link java.lang.String} object.
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
     * <p>toStringTranslateSource.</p>
     *
     * @param map a {@link java.util.HashMap} object.
     * @param ignoreMisTranslations a boolean.
     * @return a {@link java.lang.String} object.
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
                if (!foundFirstExpression)
                    foundFirstExpression = true;
            }
        }
        return clause;
    }

    /**
     * <p>getExpressionColumnNames.</p>
     *
     * @return an array of {@link java.lang.String} objects.
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
     * <p>getExpressionFromColumnName.</p>
     *
     * @param colname a {@link java.lang.String} object.
     * @return a {@link java.lang.String} object.
     */
    public String getExpressionFromColumnName(String colname)
    {
        String expstr = "";
        for (SQLExpression exp : expressions)
        {
            if(exp.getPrefixType() == FragmentType.FIELD && exp.getPrefixValue().equals(colname) ||
               exp.getPostfixType() == FragmentType.FIELD && exp.getPostfixValue().equals(colname))
            {
                if (expstr.length() != 0)
                    expstr += " AND ";
                expstr += exp.toString();
            }
        }

        return expstr;
    }

    /**
     * <p>containsKey.</p>
     *
     * @param colname a {@link java.lang.String} object.
     * @return a boolean.
     */
    public boolean containsKey(String colname)
    {
        if (expressionUniqueColumnNames.contains(colname))
        {
            for (SQLExpression exp : expressions)
            {
                if(exp.containsKey(colname))
                    return true;
            }
        }

        return false;
    }

    /**
     * <p>getUniqueExpressionColumnNames.</p>
     *
     * @return an array of {@link java.lang.Object} objects.
     */
    public Object[] getUniqueExpressionColumnNames()
    {
        return expressionUniqueColumnNames.toArray();
    }

    /**
     * <p>isOrOperatorUsed.</p>
     *
     * @return a boolean.
     */
    public boolean isOrOperatorUsed()
    {
        return orOperatorUsed;
    }

    /* Temporary Patch until full logic parser is implemented*/
    private String handleGroupParens(String group)
    {
        String unencapsulated = group.trim();
        if (group.charAt(0) == '(' && group.charAt(group.length() - 1) == ')')
        {
            int secopen = group.indexOf('(', 1);
            int firstclose = group.indexOf(')', 1);
            if (secopen < firstclose)
            {
                int sectolastclose = group.substring(0, group.length()-1).lastIndexOf(')');
                int lastopen = group.lastIndexOf('(');
                if (sectolastclose == -1 || sectolastclose > lastopen )
                    unencapsulated = Utils.getParenContents(group);
            }
        }
        return unencapsulated;
    }

    /**
     * <p>parseWhereClause.</p>
     *
     * @param whereclause a {@link java.lang.String} object.
     * @throws java.sql.SQLException if any.
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

                //First expressions don't need previous unifier
                if (orsIndex > 0)
                {
                    orOperatorUsed = true;
                    exp.setPreviousExpUnifier(orOperator);
                }
                else
                {
                    if (andsIndex > 0)
                        exp.setPreviousExpUnifier(andOperator);
                }
            }
        }
    }

    /**
     * <p>containsEqualityCondition.</p>
     *
     * @param map a {@link java.util.HashMap} object.
     * @param first a {@link java.lang.String} object.
     * @param second a {@link java.lang.String} object.
     * @return a boolean.
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
