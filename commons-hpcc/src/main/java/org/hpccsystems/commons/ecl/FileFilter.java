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
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

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
    public static final long serialVersionUID = 2L;

    private List<FieldFilter> fieldfilters = new ArrayList<FieldFilter>();

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
        return fieldfilters.size() == 0;
    }

    /**
     * Make the JSON object for the filter expression
     * keyFilter : "[clause,clause,...,clause]"
     *
     * @return JSON object as a string (name : expression)
     */
    public String toJson()
    {
        if (this.isEmpty())
            return "";

        JSONObject keyfilter = new JSONObject();
        keyfilter.put("keyFilter", this.toString());
        return keyfilter.toString();
    }

    /**
     * @param filefilter
     * @return
     * @throws Exception
     */
    public FileFilter appendFileFilter(FileFilter filefilter) throws Exception
    {
        if (filefilter != null)
        {
            for (int fieldfilterindex = 0; fieldfilterindex < filefilter.getFieldFiltersCount(); fieldfilterindex++)
            {
                appendFieldFilter(filefilter.getFieldFilter(fieldfilterindex));
            }
        }
        return this;
    }

    /**
     * Does targetfieldfilter and this FileFilter target the same field
     *
     * @param targetfieldfilter
     * @return
     */
    public boolean targetsSameField(FieldFilter targetfieldfilter)
    {
        return (fieldfilters.isEmpty() || targetfieldfilter.getFieldName().equals(fieldfilters.get(0).getFieldName()));
    }

    /**
     * Append fieldfilter to this FileFilter (must target the same field)
     * @param fieldfilter
     * @return
     * @throws Exception
     */
    public FileFilter appendFieldFilter(FieldFilter fieldfilter) throws Exception
    {
        if (fieldfilter != null)
        {
            if (targetsSameField(fieldfilter))
                fieldfilters.add(fieldfilter);
            else
                throw new Exception("FileFilter expressions must target the same field! Cannot append filter '" + fieldfilter.toString() + "' to FileFilter targeting field: '" + fieldfilters.get(0).getFieldName() + "'");
        }
        return this;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder((fieldfilters.size() * 40) + 30);
        for (int index = 0; index < fieldfilters.size(); index++)
        {
            if (index != 0)
                sb.append(',');
            //else
            //    sb.append(fieldfilters.get(0).getFieldName());

            sb.append(fieldfilters.get(index).toString());
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

    /**
     * JSon string representation of an array of filefilters
     *
     * @param filefilters
     * @return
     * @throws Exception
     */
    public static String toJson(FileFilter [] filefilters) throws Exception
    {
        JSONObject keyfilter = new JSONObject();
        JSONArray keyfilters= new JSONArray();

        for (int index = 0; index < filefilters.length; index++)
        {
            FileFilter currentfilter = filefilters[index];
            if (currentfilter == null)
                throw new Exception("Canot serialize to JSON: filefilters[" + index + "] == null");

            String filef = filefilters[index].toString();
            keyfilters.put(filef);
        }
        keyfilter.put("KeyFilter", keyfilters);

        return keyfilter.toString();
    }
}
