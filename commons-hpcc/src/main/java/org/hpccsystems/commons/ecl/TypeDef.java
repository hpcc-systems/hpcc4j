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

public class TypeDef implements Serializable
{
    static final long serialVersionUID = 1L;

    // Inner tpe for returning revision information
    static public class Revision
    {
        final public long    revisedType;
        final public long    revisedLength;
        final public boolean revised;

        public Revision(long typ, long len, boolean rev)
        {
            this.revisedType = typ;
            this.revisedLength = len;
            this.revised = rev;
        }
    }

    private FieldType        type;
    private String           typeName;
    private int              len;
    private HpccSrcType      src;
    private FieldDef[]       struct;
    private boolean          unsignedFlag;
    private boolean          fixedLength;
    private boolean          payload;
    // flag values from eclhelper.hpp RtlFieldTypeMask enum definition
    final private static int flag_unsigned      = 256;
    final private static int flag_ebcdic        = 256;                                        // only if string type
    final private static int flag_unknownsize   = 1024;
    final private static int flag_biased        = 8192;
    final private static int flag_payload       = 65536;
    final private static int flag_ebcdic_pd     = 131072;
    final private static int mask_field_type    = 0x7fff;
    // type codes from rtlconst.hpp type_vals enum definition
    final private static int type_boolean       = 0;
    final private static int type_int           = 1;
    final private static int type_real          = 2;
    final private static int type_decimal       = 3;
    final private static int type_string        = 4;                                        // blot EBCDIC flag if on
    final private static int type_alias         = 5;                                         // Dropped
    final private static int type_date          = 6;                                          // Dropped
    final private static int type_swapfilepos   = 7;                                   // Dropped
    final private static int type_biasedswapint = 8;                                 // Convert to integer
    final private static int type_bitfield      = 9;                                      // Dropped
    final private static int type_keyedint      = 10;                                    // Convert to integer
    final private static int type_char          = 11;                                        // Convert to string
    final private static int type_enumerated    = 12;                                  // Dropped
    final private static int type_record        = 13;
    final private static int type_varstring     = 14;
    final private static int type_blob          = 15;                                        // Dropped
    final private static int type_data          = 16;
    final private static int type_pointer       = 17;                                     // Dropped
    final private static int type_class         = 18;                                       // Dropped
    final private static int type_array         = 19;                                       // Dropped
    final private static int type_table         = 20;
    final private static int type_set           = 21;
    final private static int type_row           = 22;                                         // Dropped
    final private static int type_groupedtable  = 23;                                // Dropped
    final private static int type_void          = 24;                                        // Dropped
    final private static int type_alien         = 25;                                       // Dropped
    final private static int type_swapint       = 26;                                     // Convert to integer
    final private static int type_none          = 27;                                        // Dropped
    final private static int type_packedint     = 28;                                   // Dropped
    final private static int type_filepos       = 29;
    final private static int type_qstring       = 30;                                     // Convert to string
    final private static int type_unicode       = 31;
    final private static int type_any           = 32;                                         // Dropped
    final private static int type_varunicode    = 33;
    final private static int type_pattern       = 34;                                     // Dropped
    final private static int type_rule          = 35;                                        // Dropped
    final private static int type_token         = 36;                                       // Dropped
    final private static int type_feature       = 37;                                     // Dropped
    final private static int type_event         = 38;                                       // Dropped
    final private static int type_null          = 39;                                        // Dropped
    final private static int type_scope         = 40;                                       // Dropped
    final private static int type_utf8          = 41;
    final private static int type_transform     = 42;                                   // Dropped
    final private static int type_ifblock       = 43;                                     // Dropped
    final private static int type_function      = 44;                                    // Dropped
    final private static int type_sortlist      = 45;                                    // Dropped
    final private static int type_dictionary    = 46;                                  // Dropped
    // End of known range of types
    final private static int type_max           = 46;
    // Combinations
    final private static int type_uint          = flag_unsigned + type_int;
    final private static int type_udecimal      = flag_unsigned + type_decimal;
    final private static int type_ufilepos      = flag_unsigned + type_filepos;
    final private static int type_vrecord       = flag_unknownsize + type_record;
    final private static int type_vtable        = flag_unknownsize + type_table;
    final private static int type_vstring       = flag_unknownsize + type_string;
    final private static int type_vvarstring    = flag_unknownsize + type_varstring;
    final private static int type_vset          = flag_unknownsize + type_set;
    final private static int type_vunicode      = flag_unknownsize + type_unicode;
    final private static int type_vvarunicode   = flag_unknownsize + type_varunicode;
    final private static int type_vutf8         = flag_unknownsize + type_utf8;
    final private static int type_vdata         = flag_unknownsize + type_data;

    /**
     * Normal constructor to use when this definition describes a structure
     *
     * @param type
     *            the value of the JSON pair named fieldType
     * @param typeName
     *            the name of the object for type objects
     * @param len
     *            the value of the JSON pair named length
     * @param childType
     *            the type of the child or UNKNWON if no child JSON pair
     * @param child
     *            length or 0 if no child JSON pair
     * @param child
     *            source enum type value
     * @param defs
     *            the field definitions specified by fields JSON pair
     */
    public TypeDef(long type_id, String typeName, int len, FieldDef[] defs)
    {
        this.payload = (type_id & flag_payload) != 0;
        int type = (int) (type_id & mask_field_type);
        this.typeName = typeName;
        this.len = len;
        this.struct = defs;
        this.unsignedFlag = (type_id & flag_unsigned) != 0;
        // Pick up FieldType and length
        switch (type)
        {
            case type_boolean:
                this.fixedLength = true;
                this.type = FieldType.BOOLEAN;
                break;
            case type_int:
            case type_uint:
            case type_filepos:
            case type_ufilepos:
                this.fixedLength = true;
                this.type = FieldType.INTEGER;
                break;
            case type_real:
                this.fixedLength = true;
                this.type = FieldType.REAL;
                break;
            case type_udecimal:
            case type_decimal:
                // Setting fixed length false because the length needs to
                // be extracted
                this.fixedLength = false;
                this.type = FieldType.DECIMAL;
                break;
            case type_vdata:
                this.fixedLength = false;
                this.type = FieldType.BINARY;
                break;
            case type_data:
                this.fixedLength = true;
                this.type = FieldType.BINARY;
                break;
            case type_string:
            case type_char:
            case type_unicode:
                this.fixedLength = true;
                this.type = FieldType.STRING;
                break;
            case type_vvarstring:
            case type_vvarunicode:
                this.fixedLength = false;
                this.type = FieldType.VAR_STRING;
                break;
            case type_varstring:
            case type_varunicode:
                this.fixedLength = true;
                this.type = FieldType.VAR_STRING;
                break;
            case type_vstring:
            case type_vunicode:
            case type_vutf8:
            case type_utf8:
                this.fixedLength = false;
                this.type = FieldType.STRING;
                break;
            case type_set:
                this.fixedLength = true;
                this.type = FieldType.SET;
                break;
            case type_vset:
                this.fixedLength = false;
                this.type = FieldType.SET;
                break;
            case type_record:
                this.fixedLength = true;
                this.type = FieldType.RECORD;
                break;
            case type_vrecord:
                this.fixedLength = false;
                this.type = FieldType.RECORD;
                break;
            case type_table:
                this.fixedLength = true;
                this.type = FieldType.DATASET;
                break;
            case type_vtable:
                this.fixedLength = false;
                this.type = FieldType.DATASET;
                break;
            default:
                this.fixedLength = false;
                this.type = FieldType.UNKNOWN;
                break;
        }
        // Pick up source type
        switch (type)
        {
            case type_int:
            case type_uint:
            case type_real:
                this.src = HpccSrcType.LITTLE_ENDIAN;
                break;
            case type_filepos:
            case type_ufilepos:
                this.src = HpccSrcType.BIG_ENDIAN;
                break;
            case type_utf8:
            case type_vutf8:
                this.src = HpccSrcType.UTF8;
                break;
            case type_string:
            case type_varstring:
            case type_vvarstring:
            case type_vstring:
                this.src = HpccSrcType.SINGLE_BYTE_CHAR;
                break;
            case type_unicode:
            case type_varunicode:
            case type_vvarunicode:
            case type_vunicode:
                this.src = HpccSrcType.UTF16LE;
                break;
            default:
                this.src = HpccSrcType.UNKNOWN;
        }

        // Combine child fields for datasets into a record
        if ((type == type_vtable || type == type_table) && (defs.length != 1 || defs[0].getFieldType() != FieldType.RECORD))
        {
            this.struct = new FieldDef[1];
            this.struct[0] = new FieldDef("record", FieldType.RECORD, "none", len, true, HpccSrcType.UNKNOWN, defs);
        }
    }

    /**
     * The type of this field definition.
     *
     * @return FieldType enumeration value
     */
    public FieldType getType()
    {
        return type;
    }

    /**
     * The type name for this type
     *
     * @return type name
     */
    public String getTypeName()
    {
        return typeName;
    }

    /**
     * The description of this type. Either the type name or
     * the description of the underlying FieldType.
     *
     * @return a descriptive name of the type
     */
    public String description()
    {
        return type.description();
    }

    /**
     * The fixed length for this type or 0 if the length is variable
     *
     * @return the fixed length or zero
     */
    public int getLength()
    {
        return len;
    }

    /**
     * The list of fields that define a structure type
     *
     * @return the filed list or empty array
     */
    public FieldDef[] getStructDef()
    {
        return struct.clone();
    }

    /**
     * Is the numeric value an unsigned value?
     */
    public boolean isUnsigned()
    {
        return this.unsignedFlag;
    }

    /**
     * Is this a payload field in an index
     *
     * @return yes
     */
    public boolean isPayload()
    {
        return this.payload;
    }

    /**
     * Is the field a fixed length?
     */
    public boolean isFixedLength()
    {
        return fixedLength;
    }

    /**
     * The binary encoding type of the data source.
     *
     * @return source type
     */
    public HpccSrcType getSourceType()
    {
        return this.src;
    }

    /**
     * Can we support a read of this type of data?
     *
     * @return true if this type is unsupported
     */
    public boolean isUnsupported()
    {
        return this.src == HpccSrcType.UNKNOWN || this.type == FieldType.UNKNOWN;
    }

    /**
     * Create a revision type or a copy of input if no revision required
     *
     * @param typ
     *            the field type from the type definition
     * @param len
     *            the field length from the type definition
     * @return a revision or a copy if not revised
     */
    public static Revision getRevision(long typ, long len)
    {
        long unsigned_flag = typ & flag_unsigned;
        long unknown_size = typ & flag_unknownsize;
        long revisedType = typ;
        long revisedLength = len;
        boolean revised = false;
        int typAlone = ((int) typ) & 0xff;
        switch (typAlone)
        {
            case type_biasedswapint:
                revisedType = type_int + unsigned_flag;
                revised = true;
                break;
            case type_keyedint:
                revisedType = type_int + unsigned_flag;
                revised = true;
                break;
            case type_char:
                revisedType = type_string;
                revisedLength = 1;
                revised = true;
                break;
            case type_swapint:
                revisedType = type_int + unsigned_flag;
                revised = true;
                break;
            case type_qstring:
                revisedType = type_string;
                if (unknown_size != 0)
                {
                    revisedType = type_vstring;
                }
                revised = true;
                break;
            default:
                break;
        }
        return new Revision(revisedType, revisedLength, revised);
    }

    /**
     * Revise the Flag value (type information) as required
     *
     * @param flag
     *            the value from the field definition
     * @return the revised flag value reflaection the type
     */
    public static long reviseFlags(long flag)
    {
        long unsigned_value = (flag & flag_unsigned);
        long payload_value = (flag & flag_payload);
        int typAlone = ((int) flag) & 0xff;
        Revision rt = getRevision(typAlone, 0);
        long rslt = rt.revisedType + unsigned_value + payload_value;
        return rslt;
    }

    /**
     * Is this type private to the HPCC Cluster?
     *
     * @param typ
     *            suppress when true
     * @return
     */
    public static boolean suppressType(long typ)
    {
        int typAlone = ((int) typ) & 0x7F;
        switch (typAlone)
        {
            case type_alias:
            case type_date:
            case type_swapfilepos:
            case type_biasedswapint:
            case type_bitfield:
            case type_enumerated:
            case type_blob:
            case type_pointer:
            case type_class:
            case type_array:
            case type_row:
            case type_groupedtable:
            case type_void:
            case type_alien:
            case type_none:
            case type_packedint:
            case type_any:
            case type_pattern:
            case type_rule:
            case type_token:
            case type_feature:
            case type_event:
            case type_null:
            case type_scope:
            case type_transform:
            case type_ifblock:
            case type_function:
            case type_sortlist:
            case type_dictionary:
                return true;
            default:
                if (typAlone < 0 || typAlone > type_max) return true;
                break;
        }
        return false;
    }
}
