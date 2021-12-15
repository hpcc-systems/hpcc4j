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
import java.util.HashMap;
import java.util.List;

import org.hpccsystems.commons.filter.SQLFragment.FragmentType;

public class SQLExpression
{
    private SQLOperator      prevExpUnifier;         // NULL|AND|OR. NULL = First expression in clause.

    private SQLFragment      prefix;
    private SQLOperator      operator;
    private SQLFragment      postfix;

    public final static char PARENTFIELDSEP    = '.';
    public final static char SINGLEBLANKBUFFER = ' ';

    /**
     * Instantiates a new SQL expression.
     */
    public SQLExpression()
    {
        prevExpUnifier = null;

        prefix = new SQLFragment();
        operator = null;
        postfix = new SQLFragment();
    }

    /**
     * Parses the expression.
     *
     * @param expression
     *            the expression
     * @throws SQLException
     *             the SQL exception
     */
    public void ParseExpression(String expression) throws SQLException
    {
        String trimmedExpression = expression.trim();

        SQLOperator operator = new SQLOperator(trimmedExpression);

        if (operator == null || operator.getValue() == null || !operator.isValid())
            throw new SQLException("Invalid logical operator found: " + trimmedExpression);

        String splitedsqlexp[] = operator.splitExpressionFragment(trimmedExpression);

        setPrefix(splitedsqlexp[0].trim());

        setOperator(operator);

        if (operator.isBinary())
        {
            if (splitedsqlexp.length == 2)
                setPostfix(splitedsqlexp[1].trim());
            else
                throw new SQLException("Invalid SQL Where clause found around: " + expression);
        }
    }

    /**
     * Gets the prefix value.
     *
     * @return the prefix value
     */
    public String getPrefixValue()
    {
        return prefix.getValue();
    }

    /**
     * Gets the full prefix.
     *
     * @return the full prefix
     */
    public String getFullPrefix()
    {
        return prefix.getFullColumnName();
    }

    /**
     * Gets the full postfix.
     *
     * @return the full postfix
     */
    public String getFullPostfix()
    {
        return postfix.getFullColumnName();
    }

    /**
     * Sets the prefix.
     *
     * @param prefix
     *            the new prefix
     */
    public void setPrefix(String prefix)
    {
        this.prefix.parseExpressionFragment(prefix);
    }

    /**
     * Gets the operator.
     *
     * @return the operator
     */
    public SQLOperator getOperator()
    {
        return operator;
    }

    /**
     * Sets the operator.
     *
     * @param operator
     *            the new operator
     */
    public void setOperator(SQLOperator operator)
    {
        this.operator = operator;
    }

    /**
     * Sets the operator.
     *
     * @param operator
     *            the new operator
     */
    public void setOperator(String operator)
    {
        this.operator = new SQLOperator(operator);
    }

    /**
     * Checks if is operator valid.
     *
     * @return true, if is operator valid
     */
    public boolean isOperatorValid()
    {
        return operator != null ? operator.isValid() : false;
    }

    /**
     * Gets the postfix value.
     *
     * @return the postfix value
     */
    public String getPostfixValue()
    {
        return postfix.getValue();
    }

    /**
     * Sets the postfix.
     *
     * @param postfixstr
     *            the new postfix
     */
    public void setPostfix(String postfixstr)
    {
        postfix.parseExpressionFragment(postfixstr);
    }

    /**
     * Checks if is prefix parameterized.
     *
     * @return true, if is prefix parameterized
     */
    public boolean isPrefixParameterized()
    {
        return prefix.isParameterized();
    }

    /**
     * Checks if is postfix parameterized.
     *
     * @return true, if is postfix parameterized
     */
    public boolean isPostfixParameterized()
    {
        return postfix.isParameterized();
    }

    /**
     * Gets the prefix type.
     *
     * @return the prefix type
     */
    public FragmentType getPrefixType()
    {
        return prefix.getType();
    }

    /**
     * Gets the postfix type.
     *
     * @return the postfix type
     */
    public FragmentType getPostfixType()
    {
        return postfix.getType();
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return toStringFull(false);
    }

    /**
     * To string full.
     *
     * @param outputfull
     *            the outputfull
     * @return the string
     */
    public String toStringFull(boolean outputfull)
    {
        StringBuffer tmpsb = new StringBuffer();

        if (prevExpUnifier != null) tmpsb.append(prevExpUnifier);

        switch (operator.getType())
        {
            case BINARY:
                tmpsb.append(outputfull ? getFullPrefix() : prefix.getValue()).append(SINGLEBLANKBUFFER).append(operator.toString())
                        .append(SINGLEBLANKBUFFER).append(outputfull ? getFullPostfix() : postfix.getValue());
                break;
            case PRE_UNARY:
                tmpsb.append(SINGLEBLANKBUFFER).append(operator.toString()).append(SINGLEBLANKBUFFER)
                        .append(outputfull ? getFullPrefix() : prefix.getValue()).append(SINGLEBLANKBUFFER);
                break;
            case POST_UNARY:
                tmpsb.append(SINGLEBLANKBUFFER).append(outputfull ? getFullPrefix() : prefix.getValue()).append(SINGLEBLANKBUFFER)
                        .append(operator.toString()).append(SINGLEBLANKBUFFER);
                break;
            case NOOPFALSE:
                tmpsb.append(" false ");
                break;
            case NOOPTRUE:
                tmpsb.append(" true ");
                break;
            case UNKNOWN:
            default:
                return this.toString();
        }

        return tmpsb.toString();
    }

    /**
     * To string translate source.
     *
     * @param map
     *            the map
     * @param ignoreprevunifier
     *            the ignoreprevunifier
     * @param ignoreMisTraslations
     *            the ignore mis traslations
     * @return the string
     */
    public String toStringTranslateSource(HashMap<String, String> map, boolean ignoreprevunifier, boolean ignoreMisTraslations)
    {
        StringBuffer tmpsb = new StringBuffer();

        if (!ignoreprevunifier && prevExpUnifier != null) tmpsb.append(prevExpUnifier);

        String prefixtranslate = map.get(prefix.getParent());
        String postfixtranslate = map.get(postfix.getParent());

        if (!ignoreMisTraslations
                && ((prefixtranslate == null && prefix.getParent() != null) || (postfixtranslate == null) && postfix.getParent() != null))
            return null;

        switch (operator.getType())
        {
            case BINARY:
                if (prefixtranslate != null)
                {
                    tmpsb.append(prefixtranslate);
                    tmpsb.append(PARENTFIELDSEP);
                }
                else if (prefix.getParent() != null && prefix.getParent().length() > 0)
                {
                    tmpsb.append(prefix.getParent());
                    tmpsb.append(PARENTFIELDSEP);
                }

                tmpsb.append(prefix.getValue()).append(SINGLEBLANKBUFFER).append(operator.toString()).append(SINGLEBLANKBUFFER);
                if (postfixtranslate != null)
                {
                    tmpsb.append(postfixtranslate);
                    tmpsb.append(PARENTFIELDSEP);
                }
                else if (postfix.getParent() != null && postfix.getParent().length() > 0)
                {
                    tmpsb.append(postfix.getParent());
                    tmpsb.append(PARENTFIELDSEP);
                }
                tmpsb.append(postfix.getValue());
                break;
            case PRE_UNARY:
                tmpsb.append(SINGLEBLANKBUFFER).append(operator.toString()).append(SINGLEBLANKBUFFER);
                if (prefixtranslate != null)
                {
                    tmpsb.append(prefixtranslate);
                    tmpsb.append(PARENTFIELDSEP);
                }
                else if (prefix.getParent() != null && prefix.getParent().length() > 0)
                {
                    tmpsb.append(prefix.getParent());
                    tmpsb.append(PARENTFIELDSEP);
                }
                tmpsb.append(prefix.getValue()).append(SINGLEBLANKBUFFER);
                break;
            case POST_UNARY:
                if (prefixtranslate != null)
                {
                    tmpsb.append(prefixtranslate);
                    tmpsb.append(PARENTFIELDSEP);
                }
                else if (prefix.getParent() != null && prefix.getParent().length() > 0)
                {
                    tmpsb.append(prefix.getParent());
                    tmpsb.append(PARENTFIELDSEP);
                }

                tmpsb.append(prefix.getValue()).append(SINGLEBLANKBUFFER);
                tmpsb.append(operator.toString()).append(SINGLEBLANKBUFFER);

                break;
            case NOOPFALSE:
                tmpsb.append(" false ");
                break;
            case NOOPTRUE:
                tmpsb.append(" true ");
                break;
        }

        return tmpsb.toString();
    }

    /**
     * Checks if is equality condition.
     *
     * @param map
     *            the map
     * @param first
     *            the first
     * @param second
     *            the second
     * @return true, if is equality condition
     */
    public boolean isEqualityCondition(HashMap<String, String> map, String first, String second)
    {
        String prefixtranslate = map.get(prefix.getParent());
        String postfixtranslate = map.get(postfix.getParent());

        if (prefixtranslate == null || postfixtranslate == null) return false;

        switch (operator.getType())
        {
            case BINARY:
                return (!prefixtranslate.equals(postfixtranslate) && (prefixtranslate.equals(first)
                        || postfixtranslate.equals(first) && prefixtranslate.equals(second) || postfixtranslate.equals(second)));
            case PRE_UNARY:
            case POST_UNARY:
            case NOOPFALSE:
            case NOOPTRUE:
            default:
                return false;
        }
    }

    /**
     * Sets the prefix.
     *
     * @param prefix
     *            the new prefix
     */
    public void setPrefix(SQLFragment prefix)
    {
        this.prefix = prefix;
    }

    /**
     * Sets the postfix.
     *
     * @param postfix
     *            the new postfix
     */
    public void setPostfix(SQLFragment postfix)
    {
        this.postfix = postfix;
    }

    /**
     * Update fragment tables.
     *
     * @param sqlTables
     *            the sql tables
     * @throws Exception
     *             the exception
     */
    public void updateFragmentTables(List<SQLTable> sqlTables) throws Exception
    {
        if (postfix.getType() == FragmentType.FIELD || postfix.getType() == FragmentType.FIELD_CONTENT_MODIFIER
                || postfix.getType() == FragmentType.AGGREGATE_FUNCTION)
            postfix.updateFragmentColumParent(sqlTables);

        if (prefix.getType() == FragmentType.FIELD || prefix.getType() == FragmentType.FIELD_CONTENT_MODIFIER)
            prefix.updateFragmentColumParent(sqlTables);
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
        if (getPrefixType() == FragmentType.FIELD && getPrefixValue().equals(colname)
                || getPostfixType() == FragmentType.FIELD && getPostfixValue().equals(colname))
        {
            return true;
        }
        else
            return false;
    }

    /**
     * Sets the previous exp unifier.
     *
     * @param prevexpunifier
     *            the new previous exp unifier
     */
    public void setPreviousExpUnifier(SQLOperator prevexpunifier)
    {
        this.prevExpUnifier = prevexpunifier;
    }

    /**
     * Gets the previous exp unifier.
     *
     * @return the previous exp unifier
     */
    public SQLOperator getPreviousExpUnifier()
    {
        return this.prevExpUnifier;
    }
}
