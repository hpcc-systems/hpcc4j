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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.hpccsystems.commons.filter.SQLExpression;
import org.hpccsystems.commons.filter.SQLFilter;
import org.hpccsystems.commons.filter.SQLOperator;
import org.hpccsystems.commons.filter.SQLFragment.FragmentType;
import org.hpccsystems.commons.filter.SQLOperator.OperatorType;
import org.json.JSONArray;
import org.json.JSONObject;

import net.sf.jsqlparser.expression.BinaryExpression;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;
import net.sf.jsqlparser.expression.ExpressionVisitorAdapter;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.Parenthesis;
import net.sf.jsqlparser.expression.operators.arithmetic.Addition;
import net.sf.jsqlparser.expression.operators.arithmetic.Concat;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.ComparisonOperator;
import net.sf.jsqlparser.expression.operators.relational.EqualsTo;
import net.sf.jsqlparser.expression.operators.relational.InExpression;
import net.sf.jsqlparser.expression.operators.relational.NotEqualsTo;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.util.deparser.ExpressionDeParser;

/**
 * A filter to select records from a file or key. The filter is conjunction of
 * field filters with each field having a list of one or more value ranges.
 *
 * filter : setfilter | wildfilter ;
    setfilter :  field equals set
    wildfilter : field wildcard
    set         : setfragment (, setfragment)*
    setfragment : ( upperinclusive | upperexclusive) setvalue ( lowerinclusive | lowerexclusive) //ignore the single paren notation for now
    setvalue    : INTEGER_NUM | QUOTEDUTF8STR
    QUOTEDUTF8STR : squote utf8string squote;
    upperinclusive    : '[' ;
    lowerinclusive    : ']' ;
    upperexclusive    : '(' ;
    lowerexclusive    : ')' ;
    wildcard : '*' ;
    equals   : '=' ;
    range    : ':' ;
    squote   : '\'' ;
    field : ( 'A'..'Z' | 'a'..'z') (( 'A'..'Z' | 'a'..'z') | UNDERSCORE | ETC | INTEGER_NUM  )* INTEGER_NUM)?;
    INTEGER_NUM : ( '1'..'9')( '0'..'9')*;
 *
 */
public class FileFilter implements Serializable
{
    private static final Logger  log                 = Logger.getLogger(FileFilter.class.getName());

    public static final long serialVersionUID = 2L;

    private List<FieldFilter> fieldfilters = new ArrayList<FieldFilter>();
    private List<FileFilter> andFileFilters = new ArrayList<FileFilter>();
    private Expression filter = null;
    /**
     * A file filter expression to select records, using a string.
     * An expression can be comprised of multiple comma delimited clauses
     *
     * An empty filter, selects all records
     */
    public FileFilter()
    {
        //expressions initialized but yet to be populated
    }

    /**
     * Creates a FileFilter based on an SQL filter
     * for example "(table.field2 <= 'a' AND table.field2 != 4) OR table.field2 != 5 AND field3 In ('Germany', 'France', 'UK')"
     * @param sqlfilter
     * @throws Exception
     */
    public FileFilter(String sqlfilter) throws Exception
    {
        if (sqlfilter != null && !sqlfilter.isEmpty())
        {
            ConvertToHPCCFileFilter(sqlfilter);
            filter = CCJSqlParserUtil.parseCondExpression(sqlfilter);
            System.out.println(filter.getClass().getCanonicalName());
            System.out.println(filter.toString());
            ExpressionVisitor expressionVisitor = new ExpressionVisitorAdapter();

            StringBuilder b = new StringBuilder();
            filter.accept(new ExpressionDeParser(null, b)
            {
                int depth = 0;

                @Override
                public void visit(Parenthesis parenthesis)
                {
                    //if (parenthesis.isNot())
                    //{
                    //    getBuffer().append("NOT");
                    //}

                    depth++;
                    parenthesis.getExpression().accept(this);
                    depth--;
                }

                @Override
                public void visit(OrExpression orExpression)
                {
                    visitBinaryExpr(orExpression, "OR");
                }

                @Override
                public void visit(AndExpression andExpression)
                {
                    visitBinaryExpr(andExpression, "AND");
                }

                private void visitBinaryExpr(BinaryExpression expr, String operator)
                {
                    //if (expr.isNot())
                    //{
                    //    getBuffer().append("NOT");
                    //}

                    if (!(expr.getLeftExpression() instanceof OrExpression) 
                            && !(expr.getLeftExpression() instanceof AndExpression) 
                            && !(expr.getLeftExpression() instanceof Parenthesis)) {
                        getBuffer().append(StringUtils.repeat("-", depth)).append(">");
                    }
                    expr.getLeftExpression().accept(this);
                    getBuffer().append("\n").append(StringUtils.repeat("-", depth)).append(">");
                    getBuffer().append(operator).append("\n");
                    if (!(expr.getRightExpression() instanceof OrExpression) 
                            && !(expr.getRightExpression() instanceof AndExpression) 
                            && !(expr.getRightExpression() instanceof Parenthesis)) {
                        getBuffer().append(StringUtils.repeat("-", depth)).append(">");
                    }
                    expr.getRightExpression().accept(this);
                }
            });

            System.out.println(b);

            if ((filter instanceof Column))
            {
                Column a = (Column) filter;
                expressionVisitor.visit(a);
                
                System.out.println("Invalid expression encountered!");
            }
        }
        else
            throw new Exception("Could not create FileFilter, empty sqlfilter encountered");
    }

    /**
     * Creates a FileFilter based on an SQL filter object
     *
     * @param sqlfilter
     * @throws Exception
     */
    /*public FileFilter(SQLFilter sqlfilter) throws Exception
    {
        if (sqlfilter != null)
             ConvertToHPCCFileFilter(sqlfilter);
        else
            throw new Exception("Could not create FileFilter, empty sqlfilter encountered");
    }*/

    /**
     * Creates a FileFilter based on the provided fieldfilter
     * @param filter
     */
    public FileFilter(FieldFilter filter)
    {
        fieldfilters.add(filter);
    }

    /**
     * Creates a FileFilter based on the provided filefilter's fieldfilter(s)
     * @param filter
     */
    public FileFilter(FileFilter filter)
    {
        try
        {
            orFilter(filter);
        }
        catch (Exception e) {}
    }

    /**
     * A null filter which selects all records
     *
     * @return an empty filter
     */
    static public FileFilter nullFilter()
    {
        return new FileFilter();
    }

    /**
     * Is this filter empty?
     *
     * @return true when empty
     */
    public boolean isEmpty()
    {
        return fieldfilters.isEmpty();
    }

    /**
     * The filefilter expression is ANDed to this filefilter expression
     *
     * @param filefilter
     * @return
     * @throws Exception
     */
    public FileFilter andFilter(FileFilter filefilter) throws Exception
    {
        if (filefilter != null)
        {
            if (fieldfilters.isEmpty())
            {
                for (int fieldfilterindex = 0; fieldfilterindex < filefilter.getFieldFiltersCount(); fieldfilterindex++)
                {
                    orFilter(filefilter.getFieldFilter(fieldfilterindex));
                }
            }
            else
                andFileFilters.add(filefilter);
        }
        return this;
    }

    /**
     * The fieldfilter(s) expression is ANDed to this filefilter expression
     *
     * @param fieldfilter
     * @return
     * @throws Exception
     */
    public FileFilter andFilter(FieldFilter fieldfilter) throws Exception
    {
        if (fieldfilter != null)
        {
            if (fieldfilters.isEmpty())
                fieldfilters.add(fieldfilter);
            else
                andFileFilters.add(new FileFilter(fieldfilter));
        }
        return this;
    }

    /**
     * The filefilter expression is ORed to this filefilter expression
     *
     * @param filefilter
     * @return
     * @throws Exception
     */
    public FileFilter orFilter(FileFilter filefilter) throws Exception
    {
        if (filefilter != null)
        {
            for (int fieldfilterindex = 0; fieldfilterindex < filefilter.getFieldFiltersCount(); fieldfilterindex++)
            {
                orFilter(filefilter.getFieldFilter(fieldfilterindex));
            }
        }
        return this;
    }


    /**
     * The fieldfilter expression is ORed to this filefilter expression
     * (must target the same field)
     *
     * @param fieldfilter
     * @return
     * @throws Exception
     */
    public FileFilter orFilter(FieldFilter fieldfilter) throws Exception
    {
        if (fieldfilter != null)
        {
            if (andFileFilters.isEmpty())
            {
                if (fieldfilters.isEmpty() || fieldfilter.getFieldName().equals(fieldfilters.get(0).getFieldName()))
                    fieldfilters.add(fieldfilter);
                else
                    throw new Exception("FileFilter expressions must target the same field! Cannot append filter '" + fieldfilter.toString() + "' to FileFilter targeting field: '" + fieldfilters.get(0).getFieldName() + "'");
            }
            else
                andFileFilters.get(andFileFilters.size() - 1).orFilter(fieldfilter);
        }
        return this;
    }

    /**
     * private used for toString formatting
     * @return
     */
    private String outputOrFilter()
    {
        StringBuilder sb = new StringBuilder((fieldfilters.size() * 40) + 30);
        for (int index = 0; index < fieldfilters.size(); index++)
        {
            if (index != 0)
                sb.append(',');
            else
                sb.append(fieldfilters.get(0).getFieldName()).append("=");

            sb.append(fieldfilters.get(index).toString(false));
        }

        return sb.toString();
    }

    /**
     * Reports the number of filter clauses in this filefilter
     * @return
     */
    public int getFieldFiltersCount()
    {
        return fieldfilters.size();
    }

    /**
     * Fetches the ith filter clause in this filefilter
     * @param i
     * @return
     */
    public FieldFilter getFieldFilter(int i)
    {
        if (i < 0 || i >= fieldfilters.size())
            throw new IndexOutOfBoundsException("getFieldFilter(" + i + ") index out of bounds - fielfilters size: " + fieldfilters.size());

        return fieldfilters.get(i);
    }

    
    public void handleExpression(Expression expr, String output)
    {
        if(expr instanceof OrExpression)
        {
            handleOR((OrExpression) expr, output);
        }
        else if(expr instanceof AndExpression)
        {
            handleAndExpression((AndExpression) expr, output);
        }
        else if (expr instanceof Parenthesis)
        {
            handleExpression(((Parenthesis) expr).getExpression(), output);
        }
        else if (expr instanceof ComparisonOperator)
        {
            handleComparison(expr, output);   
        }
        else if (expr instanceof NotEqualsTo)
        {
            output += (FieldFilterRange.makeNE(expr.toString()).toString());
        }
        else if (expr instanceof EqualsTo)
        {
            EqualsTo et = (EqualsTo)expr;
            
            output += (FieldFilterRange.makeEq(expr.toString()).toString());
        }
        //else if (expr instanceof InExpression)
        //{
        //    String list = sqlfilter.getPostfixValue().replaceAll("^\\[|\\]$", ""); //List string representation is encapsulated in square brackets
        //    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeIn(list.split("\\s*,\\s*"), false)));  // each entry is comma+space delimited
        //}
    }

    private void handleComparison(Expression expr, String output)
    {
        ComparisonOperator c = (ComparisonOperator)expr;
        String operator = c.getStringExpression();
        Expression l = c.getLeftExpression();
        Expression r = c.getRightExpression();
        
    }

    private void handleOR(OrExpression expr, String output)
    {
        handleBinaryExpr(expr, " || ");
    }

    private void handleAndExpression(AndExpression expr, String output)
    {
        handleBinaryExpr(expr, " + ");
    }

    private void handleLongValue(LongValue expr, String output)
    {
        System.out.println(expr.toString());
    }

    public void handleConcatExpr(Concat expr, String output)
    {
        handleBinaryExpr(expr, "");

    }
    
    public void handleBinaryExpr(BinaryExpression expr, String output)
    {
        if (!(expr.getLeftExpression() instanceof OrExpression) 
                && !(expr.getLeftExpression() instanceof AndExpression) 
                && !(expr.getLeftExpression() instanceof Parenthesis))
        {
            //getBuffer().append(StringUtils.repeat("-", depth)).append(">");
            System.out.println("left expression: " + expr.getLeftExpression());
        }

        handleExpression(expr.getLeftExpression(), output);

        //getBuffer().append("\n").append(StringUtils.repeat("-", depth)).append(">");
        //getBuffer().append(operator).append("\n");
        if (!(expr.getRightExpression() instanceof OrExpression) 
                && !(expr.getRightExpression() instanceof AndExpression) 
                && !(expr.getRightExpression() instanceof Parenthesis))
        {
            System.out.println("right expression: " + expr.getRightExpression());
        }
        handleExpression(expr.getRightExpression(), output);
    }
    /**
     * JSon string representation of an array of filefilters
     *
     * @param filefilters
     * @return
     * @throws Exception
     */
    public String toJson()
    {
        JSONObject keyfilter = new JSONObject();
        JSONArray keyfilters= new JSONArray();

        String output = ""; 
        handleExpression(filter,output);
        System.out.println(output);

        keyfilters.put(outputOrFilter());

        for (int index = 0; index < andFileFilters.size(); index++)
        {
            FileFilter currentfilter = andFileFilters.get(index);
            String filef = currentfilter.outputOrFilter();
            keyfilters.put(filef);
        }
        keyfilter.put("KeyFilter", keyfilters);

        return keyfilter.toString();
    }

    private void ConvertToHPCCFileFilter(String sqlfilterstr) throws Exception
    {
        if (sqlfilterstr == null || sqlfilterstr.isEmpty())
            throw new Exception("Cannot convert empty SQL Filter");

        try
        {
            SQLFilter sqlfilter = new SQLFilter();
            filter = CCJSqlParserUtil.parseExpression(sqlfilterstr);
            sqlfilter.parseWhereClause(sqlfilterstr);

            ConvertToHPCCFileFilter(sqlfilter);
            //ConvertToHPCCFileFilter(expr);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
       }

    private void ConvertToHPCCFileFilter(SQLFilter sqlfilter) throws Exception
    {
        if (sqlfilter == null)
            throw new Exception("Cannot convert empty SQL Filter");

        Iterator<SQLExpression> expressions = sqlfilter.getExpressions();
        while (expressions.hasNext())
        {
            SQLExpression sqlExpression = (SQLExpression) expressions.next();

            SQLOperator prevunifier = sqlExpression.getPreviousExpUnifier();
            if (prevunifier == null || prevunifier.getValue().equals(SQLOperator.or))
                orFilter(ConvertToHPCCFileFilter(sqlExpression));
            else if (prevunifier.getValue().equals(SQLOperator.and))
                andFilter(ConvertToHPCCFileFilter(sqlExpression));
            else
                throw new Exception("Invalid filter expression unifier operator detected: '" + prevunifier.getValue() + "' in filter: '" + sqlExpression.toString() + "'");
        }
    }

    private static boolean isValidFilter(SQLExpression sqlfilter) throws Exception
    {
        SQLOperator op = sqlfilter.getOperator();
        if (op.getType() == OperatorType.PRE_UNARY)
        {
            return false; //no supported
        }
        else if (op.getType() == OperatorType.POST_UNARY)
        {
            if (op.equals(SQLOperator.isNull))
                throw new Exception("Cannot convert filter based on 'isNull' operator!");
            else if (op.equals(SQLOperator.isNotNull))
                return true;
            else
                return false;
        }
        else if (op.getType() == OperatorType.BINARY)
        {
            FragmentType prefixtype = sqlfilter.getPrefixType();
            FragmentType postfixtype = sqlfilter.getPostfixType();
            if (prefixtype == FragmentType.FIELD && postfixtype == FragmentType.FIELD)
                throw new Exception("Cannot convert filter comparing 2 fields -- '" + sqlfilter.toString() +"'");
            else if (prefixtype != FragmentType.FIELD && postfixtype != FragmentType.FIELD)
                throw new Exception("Cannot convert filter comparing 0 fields -- '" + sqlfilter.toString() +"'");
            return true;
        }

        return false;
    }

    public static FileFilter ConvertToHPCCFileFilter(SQLExpression sqlfilter) throws Exception
    {
        FileFilter hpccfilter = null;
        if (isValidFilter(sqlfilter)) //either pre or post type == field
        {
            boolean prefixcontainsfield = (sqlfilter.getPrefixType() ==  FragmentType.FIELD);
            SQLOperator op = sqlfilter.getOperator();
            if (op.getValue().equals(SQLOperator.eq))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeEq(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeEq(sqlfilter.getPrefixValue())));
            }
            else if (op.getValue().equals(SQLOperator.gt))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeGT(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeGT(sqlfilter.getPrefixValue())));
            }
            else if (op.getValue().equals(SQLOperator.gte))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeGE(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeGE(sqlfilter.getPrefixValue())));
            }
            else if (op.getValue().equals(SQLOperator.in))
            {
                String list = sqlfilter.getPostfixValue().replaceAll("^\\[|\\]$", ""); //List string representation is encapsulated in square brackets
                hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeIn(list.split("\\s*,\\s*"), false)));  // each entry is comma+space delimited
            }
            else if (op.getValue().equals(SQLOperator.isNotNull))
            {
                log.info("Filter 'IsNotNull' ignored -- No concept of NULL in HPCC/ECL");
            }
            else if (op.getValue().equals(SQLOperator.lt))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeLT(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeLT(sqlfilter.getPrefixValue())));
            }
            else if (op.getValue().equals(SQLOperator.lte))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeLE(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeLE(sqlfilter.getPrefixValue())));
            }
            else if (op.getValue().equals(SQLOperator.neq) || op.getValue().equals(SQLOperator.neq2))
            {
                if (prefixcontainsfield)
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPrefixValue(),FieldFilterRange.makeNE(sqlfilter.getPostfixValue())));
                else
                    hpccfilter = new FileFilter(new FieldFilter(sqlfilter.getPostfixValue(),FieldFilterRange.makeNE(sqlfilter.getPrefixValue())));
            }
            else
                throw new Exception("Invalid filter operator detected: '" + op.getValue() + "' In filter: '" + sqlfilter.toString() + "'");
        }
        else
            throw new Exception("Invalid filter clause: " + sqlfilter.toString());

        log.debug("Converted SQL filter: '" + sqlfilter.toString() + "' to HPCC filter: '" + hpccfilter);
        return hpccfilter;
    }

    public static void main(String [] args)
    {
        try
        {
            //FileFilter filter = new FileFilter("(table.field2 <= 'a' AND table.field2 != 4) OR table.field2 != 5 AND field3 In ('Germany', 'France', 'UK')");
            FileFilter filter = new FileFilter("table.field2 != 5 AND table.field2 != 4 OR (table.field2 != 5 AND field3 In ('Germany', 'France', 'UK'))");
            //expression expr = ccjsqlparserutil.parsecondexpression("(a=1 and (b=2 or (c=3 and d=4))) or e=2");
            System.out.println(filter.toJson());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
