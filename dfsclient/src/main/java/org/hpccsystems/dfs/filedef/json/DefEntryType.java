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
import org.hpccsystems.commons.ecl.TypeDef;
import org.hpccsystems.commons.errors.UnusableDataDefinitionException;

/**
 * A type definition object
 */
public class DefEntryType extends DefEntry implements Serializable
{
    static final long                      serialVersionUID = 1L;
    private int                            used;
    private String                         name;
    private String                         childType;
    private long                           length;
    private long                           fieldType;
    private boolean                        suppressType;
    private boolean                        updatedType;
    private ArrayList<DefEntryField>       fields;
    private HashMap<String, DefEntryField> fldDict;
    private int                            start_field_list;
    private int                            stop_field_list;

    /**
     * A DefEntryType for the objects described by the token sequence
     * @param toks the array of tokens from the JSON definition
     * @param startPos the ordinal of the start token
     * @param tokCount the number of tokens
     * @param parent the ordinal of the parent
     * @param typeDict the type dictionary, used to lookup a referenced
     * type if present to determine if this type references a suppressed
     * type
     */
    public DefEntryType(DefToken[] toks, int startPos, int tokCount, int parent, HashMap<String, DefEntryType> typeDict)
            throws UnusableDataDefinitionException
    {
        super(toks[startPos].getName(), startPos, startPos + tokCount - 1, parent);
        this.used = 0;
        this.name = toks[startPos].getName();
        this.childType = "";
        this.fieldType = 0;
        this.length = 0;
        for (int i = startPos + 1; i < startPos + tokCount - 1; i++)
        {
            if (DefEntry.CHILD.equals(toks[i].getName()))
            {
                this.childType = toks[i].getString();
            }
            else if (DefEntry.FIELDTYPE.equals(toks[i].getName()))
            {
                this.fieldType = toks[i].getInteger();
            }
            else if (DefEntry.LENGTH.equals(toks[i].getName()))
            {
                this.length = toks[i].getInteger();
            }
        }
        this.suppressType = TypeDef.suppressType(this.fieldType);
        if (!this.childType.equals(""))
        {
            if (!typeDict.containsKey(this.childType))
            {
                String msg = "Unknown child reference of " + this.childType;
                throw new UnusableDataDefinitionException(msg);
            }
            this.suppressType = this.suppressType || typeDict.get(this.childType).isSuppressed();
        }
        TypeDef.Revision rt = TypeDef.getRevision(this.fieldType, this.length);
        this.updatedType = rt.revised;
        this.fieldType = rt.revisedType;
        this.length = rt.revisedLength;
        this.fields = new ArrayList<DefEntryField>();
        this.fldDict = new HashMap<String, DefEntryField>();
        if (DefEntry.hasFields(toks, startPos, tokCount))
        {
            int curr_pos = startPos + 1;
            while (!DefEntry.FIELDS.equals(toks[curr_pos].getName()))
            {
                curr_pos++;
            }
            if (!toks[curr_pos].isArrayStart())
            {
                StringBuilder sb = new StringBuilder();
                sb.append(DefEntry.FIELDS);
                sb.append(" token was not an array.  Found ");
                sb.append(toks[curr_pos].toString());
                throw new UnusableDataDefinitionException(sb.toString());
            }
            this.start_field_list = curr_pos;
            curr_pos++;
            while (!toks[curr_pos].isArrayEnd())
            {
                int num_toks = DefEntry.getTokenCount(toks, curr_pos);
                DefEntryField fld = new DefEntryField(toks, curr_pos, num_toks, startPos, typeDict);
                this.fields.add(fld);
                this.fldDict.put(fld.getFieldName(), fld);
                if (this.suppressType) fld.suppressEntry();
                curr_pos += num_toks;
            }
            this.stop_field_list = curr_pos;
        }
        else
        {
            this.start_field_list = this.getEndPosition() - 1;
            this.stop_field_list = this.getEndPosition();
        }

    }

    /**
     * Count the use of this type and fields defined by this type and named
     * (perhaps implicitly) by the TargetColumn filter
     * @param tc Columns targeted.  If this type has columns and the TargetColumn
     * has no entries, then all columns are selected.
     * @param typDict the type dictionary so referenced types can be updated
     */
    public void countUse(TargetColumn tc, HashMap<String, DefEntryType> typDict) throws UnusableDataDefinitionException
    {
        this.used++;
        if (this.childType != "")
        {
            if (!typDict.containsKey(this.childType))
            {
                throw new UnusableDataDefinitionException("Unknown type " + this.childType);
            }
            DefEntryType chld = typDict.get(this.childType);
            chld.countUse(tc, typDict);
        }
        if (this.fields.size() == 0) return;
        int marked = 0;
        for (TargetColumn col : tc.getColumns())
        {
            if (this.fldDict.containsKey(col.getName()))
            {
                marked++;
                this.fldDict.get(col.getName()).countUse(col, typDict);
            }
        }
        if (tc.allFields() || marked == 0)
        {
            for (DefEntryField fld : this.fields)
            {
                fld.countUse(typDict);
            }
        }
    }

    public void countUse(HashMap<String, DefEntryType> typDict) throws UnusableDataDefinitionException
    {
        this.used++;
        if (this.childType != "")
        {
            if (!typDict.containsKey(this.childType))
            {
                throw new UnusableDataDefinitionException("Unknown type " + this.childType);
            }
            DefEntryType chld = typDict.get(this.childType);
            chld.countUse(typDict);
        }
        if (this.fields.size() == 0) return;
        for (DefEntryField fld : this.fields)
        {
            fld.countUse(typDict);
        }
    }

    /* (non-Javadoc)
     * @see org.hpccsystems.spark.thor.DefEntry#toTokens(java.util.ArrayList)
     */
    @Override
    public void toTokens(ArrayList<DefToken> toksNew, DefToken[] toksInput)
    {
        if (this.used == 0 || this.suppressType) return;
        for (int i = this.getBeginPosition(); i <= this.start_field_list; i++)
        {
            toksNew.add(reviseToken(toksInput[i]));
        }
        for (DefEntryField fld : this.fields)
        {
            fld.toTokens(toksNew, toksInput);
        }
        for (int i = this.stop_field_list; i <= this.getEndPosition(); i++)
        {
            toksNew.add(reviseToken(toksInput[i]));
        }
    }

    @Override
    public String toString()
    {
        if (this.suppressType) return "type " + this.name + " supressed";
        int initialSize = 40 * (this.getEndPosition() - this.getBeginPosition() + 1);
        StringBuilder sb = new StringBuilder(initialSize);
        sb.append("type ");
        sb.append(this.name);
        if (!this.childType.equals(""))
        {
            sb.append("(");
            sb.append(this.childType);
            sb.append(")");
        }
        sb.append("{");
        sb.append(this.getBeginPosition());
        sb.append("-");
        sb.append(this.getEndPosition());
        sb.append(";");
        sb.append(this.getTokenCount());
        sb.append("} ");
        if (this.fields.size() > 0)
        {
            sb.append(" [");
            Iterator<DefEntryField> flds = this.fields.iterator();
            while (flds.hasNext())
            {
                DefEntryField fld = flds.next();
                sb.append(fld.toString());
                sb.append(";");
            }
            sb.append("]");
        }
        sb.append((this.used > 0) ? " used" : " unused");
        return sb.toString();
    }

    @Override
    public boolean isSuppressed()
    {
        return this.suppressType;
    }

    @Override
    public void suppressEntry()
    {
        this.suppressType = true;
    }

    /**
     * A revised token if update values
     * @param tok the token to be evaluated for change
     * @return the original or a revised token
     */
    private DefToken reviseToken(DefToken tok)
    {
        if (this.updatedType && FIELDTYPE.equals(tok.getName()))
        {
            return new DefToken(tok, this.fieldType);
        }
        else if (this.updatedType && LENGTH.equals(tok.getName()))
        {
            return new DefToken(tok, this.length);
        }
        return tok;
    }
}
