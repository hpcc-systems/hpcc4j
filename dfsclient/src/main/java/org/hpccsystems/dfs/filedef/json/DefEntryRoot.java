/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.filedef.json;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.hpccsystems.commons.ecl.TargetColumn;
import org.hpccsystems.commons.errors.UnusableDataDefinitionException;

/**
 * Map of the tokens using object maps.  Prunes as requested.  The map
 * works without needing detailed knowledge of the makeup of the token
 * sequence from the JSON file structure definition.  The definition
 * roughly is a sequence of format definition objects followed by a
 * definition of the top level record structure.  The record structure
 * has an array named "fields" as well as some other information.
 *
 * Step 1, we want to copy the tokens before the first type definition token,
 * which is denoted by the last_pre_type field..
 *
 * Step 2, we want to copy the tokens associated with each type that is used.
 *
 * Step 3, we want to copy the record structure definition tokens after the
 * last type definition token and before the first field list token.  These
 * positions are first_post_type and last_pre_fields respectively.
 *
 * Step 4, we copy the tokens associated with each field that is used.
 *
 * Step 5, we want to copy the tokens after the last field definition token,
 * which is denoted by first_post_fields.
 */
public class DefEntryRoot extends DefEntry implements Serializable
{
    static final long                      serialVersionUID = 1L;
    private ArrayList<DefEntryType>        types;
    private HashMap<String, DefEntryType>  typeDict;
    private ArrayList<DefEntryField>       fields;
    private HashMap<String, DefEntryField> fieldDict;
    private int                            last_pre_types;        // pos of the last token before the first types token
    private int                            first_post_type;       // pos of the first token after the last types token
    private int                            last_pre_fields;        // pos of the last tok bef the first fields tok
    private int                            first_post_fields;     // pos of the first tok after the last fields tok

    /**
     * @param toks the array of definition tokens
     */
    public DefEntryRoot(DefToken[] toks) throws UnusableDataDefinitionException
    {
        super("", 0, toks.length - 1, -1);
        this.types = new ArrayList<DefEntryType>();
        this.typeDict = new HashMap<String, DefEntryType>();
        this.fields = new ArrayList<DefEntryField>();
        this.fieldDict = new HashMap<String, DefEntryField>();
        this.last_pre_types = 0; // assumes only the start precedes the types
        int curr_pos = 1;
        int num_tokens = 0;
        boolean supportedTypes = false;
        // pick up the type definition objects
        while (toks[curr_pos].isObjectStart())
        {
            num_tokens = DefEntry.getTokenCount(toks, curr_pos);
            DefEntryType typ = new DefEntryType(toks, curr_pos, num_tokens, 0, this.typeDict);
            types.add(typ);
            typeDict.put(typ.getName(), typ);
            supportedTypes = supportedTypes || ((!typ.isSuppressed()) ? true : false);
            curr_pos += num_tokens;
        }
        if (this.types.size() == 0 || !supportedTypes)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("No supported types found.  Current token is ");
            sb.append(toks[curr_pos].toString());
            throw new UnusableDataDefinitionException(sb.toString());
        }
        // walk past the entries prior to the field list
        this.first_post_type = curr_pos;
        while (!toks[curr_pos].isArrayStart() && !DefEntry.FIELDS.equals(toks[curr_pos].getName()))
        {
            curr_pos++;
            if (curr_pos >= this.getEndPosition())
            {
                throw new UnusableDataDefinitionException("Unexpected end looking for list");
            }
        }
        this.last_pre_fields = curr_pos;
        // pick up the fields
        curr_pos++;
        supportedTypes = false;
        while (toks[curr_pos].isObjectStart())
        {
            num_tokens = DefEntry.getTokenCount(toks, curr_pos);
            DefEntryField fld = new DefEntryField(toks, curr_pos, num_tokens, 0, typeDict);
            this.fields.add(fld);
            this.fieldDict.put(fld.getFieldName(), fld);
            supportedTypes = supportedTypes || ((fld.isSuppressed()) ? false : true);
            curr_pos += num_tokens;
        }
        if (!toks[curr_pos].isArrayEnd())
        {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected end, found ");
            sb.append(toks[curr_pos].toString());
            throw new UnusableDataDefinitionException(sb.toString());
        }
        this.first_post_fields = curr_pos;
        if (this.fields.size() == 0 || !supportedTypes)
        {
            StringBuilder sb = new StringBuilder();
            sb.append("No fields found with supported types.");
            throw new UnusableDataDefinitionException(sb.toString());
        }
    }

    public void countUse(TargetColumn tc) throws UnusableDataDefinitionException
    {
        int fieldsUsed = 0;
        for (TargetColumn col : tc.getColumns())
        {
            if (this.fieldDict.containsKey(col.getName()))
            {
                fieldsUsed++;
                this.fieldDict.get(col.getName()).countUse(col, this.typeDict);
            }
        }
        if (fieldsUsed == 0 || tc.allFields())
        {
            for (DefEntryField fld : this.fields)
            {
                fld.countUse(this.typeDict);
            }
        }
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.spark.thor.DefEntry#toTokens(java.util.ArrayList)
     */
    @Override
    public void toTokens(ArrayList<DefToken> toksNew, DefToken[] toksInput)
    {
        for (int i = 0; i <= this.last_pre_types; i++)
        {
            toksNew.add(toksInput[i]);
        }
        Iterator<DefEntryType> typIter = this.types.iterator();
        while (typIter.hasNext())
        {
            typIter.next().toTokens(toksNew, toksInput);
        }
        for (int i = this.first_post_type; i <= this.last_pre_fields; i++)
        {
            toksNew.add(toksInput[i]);
        }
        Iterator<DefEntryField> fldIter = this.fields.iterator();
        while (fldIter.hasNext())
        {
            fldIter.next().toTokens(toksNew, toksInput);
        }
        for (int i = this.first_post_fields; i < toksInput.length; i++)
        {
            toksNew.add(toksInput[i]);
        }
    }

    @Override
    public String toString()
    {
        int initialSize = 50 * (this.getEndPosition() - this.getBeginPosition() + 1);
        StringBuilder sb = new StringBuilder(initialSize);
        sb.append("{");
        sb.append(this.getBeginPosition());
        sb.append("-");
        sb.append(this.last_pre_types);
        sb.append(",");
        sb.append(this.first_post_type);
        sb.append("-");
        sb.append(this.last_pre_fields);
        sb.append(",");
        sb.append(this.first_post_fields);
        sb.append("-");
        sb.append(this.getEndPosition());
        sb.append("}\n");
        sb.append("Types:\n");
        Iterator<DefEntryType> types_iter = this.types.iterator();
        while (types_iter.hasNext())
        {
            DefEntryType typ = types_iter.next();
            if (typ.isSuppressed()) continue;
            sb.append("   ");
            sb.append(typ.toString());
            sb.append("\n");
        }
        sb.append("Fields:\n");
        Iterator<DefEntryField> flds_iter = this.fields.iterator();
        while (flds_iter.hasNext())
        {
            DefEntryField fld = flds_iter.next();
            if (fld.isSuppressed()) continue;
            sb.append("   ");
            sb.append(fld.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean isSuppressed()
    {
        return false;
    }

    @Override
    public void suppressEntry()
    {
        throw new UnsupportedOperationException("Cannot suppress the root");
    }
}
