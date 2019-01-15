/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.hpccsystems.commons.ecl;

import java.io.Serializable;
import java.util.Iterator;

/**
 * The name and field type for an item from the HPCC environment. The types may be single scalar types or may be arrays
 * or structures.
 *
 */

public class FieldDef implements Serializable
{
    private static final long serialVersionUID   = 1L;
    private static final int  MASK_32_LOWER_HALF = 0xffff;
    private static final int  MASK_32_UPPER_HALF = 0xffff0000;

    private String            fieldName          = "";
    private FieldType         fieldType          = FieldType.UNKNOWN;
    private String            typeName           = FieldType.UNKNOWN.description();
    private FieldDef[]        defs               = new FieldDef[0];
    private HpccSrcType       srcType            = HpccSrcType.UNKNOWN;
    private long              len                = 0;
    private boolean           fixedLength        = false;
    private boolean           isUnsigned         = false;

    /**
     * @param rhs
     *            FieldDef to be copied
     */
    public FieldDef(FieldDef rhs)
    {
        this.fieldName = rhs.fieldName;
        this.fieldType = rhs.fieldType;
        this.typeName = rhs.typeName;
        this.defs = rhs.defs;
        this.srcType = rhs.srcType;
        this.len = rhs.len;
        this.fixedLength = rhs.fixedLength;
        this.isUnsigned = rhs.isUnsigned;
    }

    /**
     * @param fieldName
     *            the name of the field
     * @param fieldType
     *            the FieldType value
     * @param typeName
     *            the name of this composite type
     * @param len
     *            the field length
     * @param isFixedLength
     *            len may be non-zero and variable
     * @param defs
     *            the array of fields composing this def
     */
    public FieldDef(String fieldName, FieldType fieldType, String typeName, long len, boolean isFixedLength,
            boolean isUnsigned, HpccSrcType styp, FieldDef[] defs)
    {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.typeName = typeName;
        this.defs = defs;
        this.srcType = styp;
        this.fixedLength = isFixedLength;
        this.isUnsigned = isUnsigned;
        this.len = len;

        if (this.fieldType == FieldType.VAR_STRING && (styp.isUTF16() == false && styp != HpccSrcType.SINGLE_BYTE_CHAR))
        {
            throw new IllegalArgumentException("Invalid field defintion for: " + fieldName
                    + "VarStrings must be encoded in either UTF16 or ASCII");
        }

    }

    /**
     * the name of the field
     *
     * @return the name
     */
    public String getFieldName()
    {
        return fieldName;
    }

    /**
     * @param String
     *            field name
     */
    public void setFieldName(String newFieldName)
    {
        this.fieldName = newFieldName;
    }

    /**
     * the type of the field using the FieldType ENUM type.
     *
     * @return the type as an enumeration value
     */
    public FieldType getFieldType()
    {
        return fieldType;
    }

    /**
     * Data type on the HPCC cluster.
     *
     * @return type enumeration
     */
    public HpccSrcType getSourceType()
    {
        return this.srcType;
    }

    /**
     * Length of the data or minimum length if variable
     *
     * @return length
     */
    public long getDataLen()
    {
        if (this.fieldType != FieldType.DECIMAL)
        {
            return this.len;
        }

        if (this.isUnsigned())
        {
            int precision = (int) (this.len & MASK_32_LOWER_HALF);
            int dataLen = (precision + 1) / 2;
            return dataLen;
        }
        else
        {
            int precision = (int) (this.len & MASK_32_LOWER_HALF);
            int dataLen = (precision + 2) / 2;
            return dataLen;
        }
    }

    /**
     * Returns precision for decimal fields. Return 0 if this field is not a decimal
     *
     * @return precision
     */
    public int getPrecision()
    {
        if (this.fieldType != FieldType.DECIMAL)
        {
            return 0;
        }

        return (int) (this.len & MASK_32_LOWER_HALF);
    }

    /**
     * Sets precision for decimal fields
     */
    public void setPrecision(int precision)
    {
        if (this.fieldType != FieldType.DECIMAL)
        {
            return;
        }

        if (precision > 64)
        {
            precision = 64;
        }

        this.len &= MASK_32_UPPER_HALF;
        this.len |= (precision & MASK_32_LOWER_HALF);
    }

    /**
     * Returns scale for decimal fields. Return 0 if this field is not a decimal
     *
     * @return scale
     */
    public int getScale()
    {
        if (this.fieldType != FieldType.DECIMAL)
        {
            return 0;
        }

        int scale = (int) (this.len >> 16);
        return scale;
    }

    /**
     * Sets scale for decimal fields
     */
    public void setScale(int scale)
    {
        if (this.fieldType != FieldType.DECIMAL)
        {
            return;
        }

        if (scale > 32)
        {
            scale = 32;
        }

        this.len &= MASK_32_LOWER_HALF;
        this.len |= (scale << 16);
    }

    /**
     * Fixed or variable length
     *
     * @return true when fixed length
     */
    public boolean isFixed()
    {
        return this.fixedLength;
    }

    /**
     * Is the underlying value type unsigned?
     *
     * @return true when unsigned
     */
    public boolean isUnsigned()
    {
        return this.isUnsigned;
    }

    /**
     * Number of field definitions. Zero if this is not a record
     *
     * @return number
     */
    public int getNumDefs()
    {
        return this.defs.length;
    }

    /**
     * Get the FieldDef at position. Will throw an array out of bounds exception.
     *
     * @param ndx
     *            index position
     * @return the FieldDef object
     */
    public FieldDef getDef(int ndx)
    {
        return this.defs[ndx];
    }

    /**
     * Set the Child FieldDefs
     *
     * @param childDefs
     */
    public void setDefs(FieldDef[] childDefs)
    {
        this.defs = childDefs;
    }

    /**
     * An iterator to walk though the type definitions that compose this type.
     *
     * @return an iterator returning FieldDef objects
     */
    public Iterator<FieldDef> getDefinitions()
    {
        final FieldDef[] defRef = this.defs;
        Iterator<FieldDef> rslt = new Iterator<FieldDef>() {
            int        pos  = 0;
            FieldDef[] copy = defRef;

            public boolean hasNext()
            {
                return (pos < copy.length) ? true : false;
            }

            public FieldDef next()
            {
                return copy[pos++];
            }
        };
        return rslt;
    }
}
