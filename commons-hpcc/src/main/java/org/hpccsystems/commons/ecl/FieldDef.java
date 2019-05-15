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
    private int               additionalFlags    = 0;

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
        this.additionalFlags = rhs.additionalFlags;
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
     * @param isUnsigned
     *            Only applies to integers and decimal fields. Ignored otherwise
     * @param HpccSrcType
     *            Field encoding type. Primairly applies to strings. Non-strings should use LITTLE_ENDIAN.
     * @param childDefs
     *            Child field defs. Only used for Records, Sets & Datasets. Sets & Dataset should have a single child. Null otherwise.
     */
    public FieldDef(String fieldName, FieldType fieldType, String typeName, long len, boolean isFixedLength,
            boolean isUnsigned, HpccSrcType sourceType, FieldDef[] childDefs)
    {
        this(fieldName, fieldType, typeName, len, isFixedLength, isUnsigned, 0, sourceType, childDefs);
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
     * @param isUnsigned
     *            Only applies to integers and decimal fields. Ignored otherwise
     * @param additionalFlags 
     *            Additional flags. Primarily used to retain layout information in HPCC records during conversion. 
     * @param HpccSrcType
     *            Field encoding type. Primairly applies to strings. Non-strings should use LITTLE_ENDIAN.
     * @param childDefs
     *            Child field defs. Only used for Records, Sets & Datasets. Sets & Dataset should have a single child. Null otherwise.
     */
    public FieldDef(String fieldName, FieldType fieldType, String typeName, long len, boolean isFixedLength,
            boolean isUnsigned, int additionalFlags, HpccSrcType sourceType, FieldDef[] childDefs)
    {
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.typeName = typeName;
        this.additionalFlags = additionalFlags;
        this.defs = childDefs;
        if (this.defs == null)
        {
            this.defs = new FieldDef[0];
        }

        this.srcType = sourceType;
        this.fixedLength = isFixedLength;
        this.isUnsigned = isUnsigned;
        this.len = len;

        if (this.fieldType == FieldType.VAR_STRING && (sourceType.isUTF16() == false && sourceType != HpccSrcType.SINGLE_BYTE_CHAR))
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
     * Length of data or minimum length if variable
     * @param dataLen
     */
    public void setDataLen(long dataLen)
    {
        this.len = dataLen;
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
     * Get the additional flags for this fields.
     * 
     * @return
     */
    public int getAdditionalFlags()
    {
        return this.additionalFlags;
    }

    /**
     * Set the additional flags for this fields.
     * 
     * @return
     */
    public void setAdditionalFlags(int flags)
    {
        this.additionalFlags = flags;
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
        if (childDefs == null)
        {
            childDefs = new FieldDef[0];
        }

        this.defs = childDefs;
        updateRecordMeta(this);
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

    private static void updateRecordMeta(FieldDef recordDef)
    {
        updateRecordMinLength(recordDef);
    }

    private static void updateRecordMinLength(FieldDef recordDef)
    {
        for (int i = 0; i < recordDef.getNumDefs(); i++)
        {
            FieldDef childDef = recordDef.getDef(i);
            if (childDef.getFieldType() == FieldType.RECORD)
            {
                updateRecordMinLength(childDef);
            }
        }

        long minDataLength = getMinLengthInBytes(recordDef);
        recordDef.setDataLen(minDataLength);
    }

    private static long getMinLengthInBytes(FieldDef def)
    {
        switch (def.getFieldType())
        {
            case RECORD:
            {
                long minDataLength = 0;
                for (int i = 0; i < def.getNumDefs(); i++)
                {
                    FieldDef childDef = def.getDef(i);
                    minDataLength += getMinLengthInBytes(childDef);
                }
                return minDataLength;
            }
            case SET:
            {
                // Sets include 4 byte integer dataLength and an additional byte
                return 5;
            }
            default:
            {
                long dataLength = 0;
                if (def.isFixed())
                {
                    // Var strings can be fixed length
                    dataLength = def.getDataLen();
                    if (def.getFieldType() == FieldType.VAR_STRING)
                    {
                        dataLength++;
                    }
                    
                    // Unicode datalength is in code points not bytes
                    if (def.getSourceType().isUTF16())
                    {
                        dataLength *= 2;
                    }
                }
                else
                {
                    dataLength = 4;
                }
                return dataLength;
            }
        }
    }
}
