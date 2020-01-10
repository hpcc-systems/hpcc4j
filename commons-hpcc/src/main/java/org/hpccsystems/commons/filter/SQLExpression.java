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
import java.util.HashMap;
import java.util.List;

import org.hpccsystems.commons.filter.SQLFragment;
import org.hpccsystems.commons.filter.SQLFragment.FragmentType;
public class SQLExpression
{
    private SQLOperator        prevExpUnifier; // NULL|AND|OR. NULL = First expression in clause.

    private SQLFragment        prefix;
    private SQLOperator        operator;
    private SQLFragment        postfix;

    /** Constant <code>PARENTFIELDSEP='.'</code> */
    public final static char   PARENTFIELDSEP = '.';
    /** Constant <code>SINGLEBLANKBUFFER=' '</code> */
    public final static char   SINGLEBLANKBUFFER = ' ';

    /**
     * <p>Constructor for SQLExpression.</p>
     */
    public SQLExpression()
    {
        prevExpUnifier = null;

        prefix = new SQLFragment();
        operator = null;
        postfix = new SQLFragment();
    }

    /**
     * <p>ParseExpression.</p>
     *
     * @param expression a {@link java.lang.String} object.
     * @throws java.sql.SQLException if any.
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
     * <p>getPrefixValue.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPrefixValue()
    {
        return prefix.getValue();
    }

    /**
     * <p>getFullPrefix.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFullPrefix()
    {
        return prefix.getFullColumnName();
    }

    /**
     * <p>getFullPostfix.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getFullPostfix()
    {
        return postfix.getFullColumnName();
    }

    /**
     * <p>Setter for the field <code>prefix</code>.</p>
     *
     * @param prefix a {@link java.lang.String} object.
     */
    public void setPrefix(String prefix)
    {
        this.prefix.parseExpressionFragment(prefix);
    }

    /**
     * <p>Getter for the field <code>operator</code>.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLOperator} object.
     */
    public SQLOperator getOperator()
    {
        return operator;
    }

    /**
     * <p>Setter for the field <code>operator</code>.</p>
     *
     * @param operator a {@link org.hpccsystems.commons.filter.SQLOperator} object.
     */
    public void setOperator(SQLOperator operator)
    {
        this.operator = operator;
    }

    /**
     * <p>Setter for the field <code>operator</code>.</p>
     *
     * @param operator a {@link java.lang.String} object.
     */
    public void setOperator(String operator)
    {
        this.operator = new SQLOperator(operator);
    }

    /**
     * <p>isOperatorValid.</p>
     *
     * @return a boolean.
     */
    public boolean isOperatorValid()
    {
        return operator != null ? operator.isValid() : false;
    }

    /**
     * <p>getPostfixValue.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getPostfixValue()
    {
        return postfix.getValue();
    }

    /**
     * <p>Setter for the field <code>postfix</code>.</p>
     *
     * @param postfixstr a {@link java.lang.String} object.
     */
    public void setPostfix(String postfixstr)
    {
        postfix.parseExpressionFragment(postfixstr);
    }

    /**
     * <p>isPrefixParameterized.</p>
     *
     * @return a boolean.
     */
    public boolean isPrefixParameterized()
    {
        return prefix.isParameterized();
    }

    /**
     * <p>isPostfixParameterized.</p>
     *
     * @return a boolean.
     */
    public boolean isPostfixParameterized()
    {
        return postfix.isParameterized();
    }

    /**
     * <p>getPrefixType.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLFragment.FragmentType} object.
     */
    public FragmentType getPrefixType()
    {
        return prefix.getType();
    }

    /**
     * <p>getPostfixType.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLFragment.FragmentType} object.
     */
    public FragmentType getPostfixType()
    {
        return postfix.getType();
    }

    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        return toStringFull(false);
    }

    /**
     * <p>toStringFull.</p>
     *
     * @param outputfull a boolean.
     * @return a {@link java.lang.String} object.
     */
    public String toStringFull(boolean outputfull)
    {
        StringBuffer tmpsb = new StringBuffer();

        if (prevExpUnifier != null)
            tmpsb.append(prevExpUnifier);

        switch (operator.getType())
        {
            case BINARY:
                tmpsb.append(outputfull ? getFullPrefix() : prefix.getValue())
                 .append(SINGLEBLANKBUFFER)
                 .append(operator.toString())
                 .append(SINGLEBLANKBUFFER)
                 .append(outputfull ? getFullPostfix() : postfix.getValue());
           break;
            case PRE_UNARY:
                tmpsb.append(SINGLEBLANKBUFFER)
                 .append(operator.toString())
                 .append(SINGLEBLANKBUFFER)
                 .append(outputfull ? getFullPrefix() : prefix.getValue())
                 .append(SINGLEBLANKBUFFER);
           break;
            case POST_UNARY:
                tmpsb.append(SINGLEBLANKBUFFER)
                 .append(outputfull ? getFullPrefix() : prefix.getValue())
                 .append(SINGLEBLANKBUFFER)
                 .append(operator.toString())
                 .append(SINGLEBLANKBUFFER);
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
     * <p>toStringTranslateSource.</p>
     *
     * @param map a {@link java.util.HashMap} object.
     * @param ignoreprevunifier a boolean.
     * @param ignoreMisTraslations a boolean.
     * @return a {@link java.lang.String} object.
     */
    public String toStringTranslateSource(HashMap<String, String> map, boolean ignoreprevunifier, boolean ignoreMisTraslations)
    {
            StringBuffer tmpsb = new StringBuffer();

            if (!ignoreprevunifier && prevExpUnifier != null )
                tmpsb.append(prevExpUnifier);

            String prefixtranslate = map.get(prefix.getParent());
            String postfixtranslate = map.get(postfix.getParent());

            if (!ignoreMisTraslations && ((prefixtranslate == null && prefix.getParent() != null) || (postfixtranslate == null) && postfix.getParent() != null))
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
     * <p>isEqualityCondition.</p>
     *
     * @param map a {@link java.util.HashMap} object.
     * @param first a {@link java.lang.String} object.
     * @param second a {@link java.lang.String} object.
     * @return a boolean.
     */
    public boolean isEqualityCondition(HashMap<String, String> map, String first, String second)
    {
        String prefixtranslate = map.get(prefix.getParent());
        String postfixtranslate = map.get(postfix.getParent());

        if (prefixtranslate == null || postfixtranslate == null)
            return false;

        switch (operator.getType())
        {
            case BINARY:
                return ( !prefixtranslate.equals(postfixtranslate) &&
                        (prefixtranslate.equals(first) || postfixtranslate.equals(first) &&
                                prefixtranslate.equals(second) || postfixtranslate.equals(second)));
            case PRE_UNARY:
            case POST_UNARY:
            case NOOPFALSE:
            case NOOPTRUE:
            default:
                return false;
        }
    }

    /**
     * <p>Setter for the field <code>prefix</code>.</p>
     *
     * @param prefix a {@link org.hpccsystems.commons.filter.SQLFragment} object.
     */
    public void setPrefix(SQLFragment prefix)
    {
        this.prefix = prefix;
    }

    /**
     * <p>Setter for the field <code>postfix</code>.</p>
     *
     * @param postfix a {@link org.hpccsystems.commons.filter.SQLFragment} object.
     */
    public void setPostfix(SQLFragment postfix)
    {
        this.postfix = postfix;
    }

    /**
     * <p>updateFragmentTables.</p>
     *
     * @param sqlTables a {@link java.util.List} object.
     * @throws java.lang.Exception if any.
     */
    public void updateFragmentTables(List<SQLTable> sqlTables) throws Exception
    {
        if (postfix.getType() == FragmentType.FIELD || postfix.getType() == FragmentType.FIELD_CONTENT_MODIFIER || postfix.getType() == FragmentType.AGGREGATE_FUNCTION)
            postfix.updateFragmentColumParent(sqlTables);

        if (prefix.getType() == FragmentType.FIELD || prefix.getType() == FragmentType.FIELD_CONTENT_MODIFIER)
            prefix.updateFragmentColumParent(sqlTables);
    }

    /**
     * <p>containsKey.</p>
     *
     * @param colname a {@link java.lang.String} object.
     * @return a boolean.
     */
    public boolean containsKey(String colname)
    {
        if(getPrefixType() == FragmentType.FIELD && getPrefixValue().equals(colname) ||
           getPostfixType() == FragmentType.FIELD && getPostfixValue().equals(colname))
        {
            return true;
        }
        else
            return false;
    }

    /**
     * <p>setPreviousExpUnifier.</p>
     *
     * @param prevexpunifier a {@link org.hpccsystems.commons.filter.SQLOperator} object.
     */
    public void setPreviousExpUnifier(SQLOperator prevexpunifier)
    {
        this.prevExpUnifier = prevexpunifier;
    }

    /**
     * <p>getPreviousExpUnifier.</p>
     *
     * @return a {@link org.hpccsystems.commons.filter.SQLOperator} object.
     */
    public SQLOperator getPreviousExpUnifier()
    {
        return this.prevExpUnifier;
    }
}
