/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
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
package org.hpccsystems.dfs.client;

import org.apache.avro.LogicalType;
import org.apache.avro.LogicalTypes;
import org.apache.avro.LogicalTypes.Decimal;
import org.apache.avro.Schema;
import org.apache.avro.generic.IndexedRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.generic.GenericEnumSymbol;
import org.apache.avro.generic.GenericFixed;
import org.apache.avro.generic.GenericData;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.nio.ByteBuffer;

/*
ARRAY -> Collection
BOOLEAN  -> Boolean
BYTES -> ByteBuffer
DOUBLE -> Double
ENUM -> GenericEnumSymbol
FIXED -> GenericFixed
FLOAT -> Float
INT -> Int
LONG -> Long
MAP -> Map
NULL 
RECORD -> IndexedRecord
STRING -> CharSequence
UNION -> [Could be lots of types depending on meta info]
*/

public class AvroRecordTranslator 
{
    private final static ArrayList<Object> EMPTY_ARRAY_LIST = new ArrayList<Object>();
    private final static byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private final static String EMPTY_STRING = "";
    private final static Boolean DEFAULT_BOOLEAN = false;
    private final static Integer DEFAULT_INTEGER = 0;
    private final static Long DEFAULT_LONG = 0L;
    private final static Double DEFAULT_DOUBLE = 0.0;
    private final static Float DEFAULT_FLOAT = 0.0f;

    static int littleEndianFromByteArray(byte[] bytes, int offset)
    {
        return ( (bytes[offset + 3] & 0xFF) << 24) |
                ((bytes[offset + 2] & 0xFF) << 16) |
                ((bytes[offset + 1] & 0xFF) << 8 ) |
                ((bytes[offset + 0] & 0xFF) << 0 );
    }
    
    static void littleEndianToByteArray(Integer val, byte[] bytes, int offset)
    {
        bytes[offset + 3] = (byte) ((val & 0xFF000000) >> 24);
        bytes[offset + 2] = (byte) ((val & 0x00FF0000) >> 16);
        bytes[offset + 1] = (byte) ((val & 0x0000FF00) >> 8);
        bytes[offset + 0] = (byte) (val & 0x00000000);
    }

    public static Object toAvro(Schema schema, FieldDef fd, Object field) throws Exception
    {
        switch (schema.getType())
        {
            case ARRAY:
            {
                if (fd.getFieldType() != FieldType.SET && fd.getFieldType() != FieldType.DATASET)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                List<Object> hpccArray = (List<Object>) field;
                ArrayList<Object> ret = new ArrayList<Object>();
                for (int i = 0; i < hpccArray.size(); i++)
                {
                    ret.add(toAvro(schema.getElementType(),fd.getDef(0),hpccArray.get(i)));
                }
                return ret;
            }
            case BOOLEAN:
            {
                if (fd.getFieldType() != FieldType.BOOLEAN)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                // No translation necessary
                return field;
            }
            case BYTES:
            {
                if (fd.getFieldType() != FieldType.BINARY)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                byte[] data = (byte[]) field;
                ByteBuffer ret = ByteBuffer.allocate(data.length);
                ret.put(data);
                return ret;
            }
            case DOUBLE:
            {
                if (fd.getFieldType() != FieldType.REAL)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof Double)
                {
                    return field;
                }
                else if (field instanceof Float)
                {
                    Float fltVal = (Float) field;
                    return Double.valueOf(fltVal);
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Double: Unexpected value type: " + field.getClass());
                }
            }
            case ENUM:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Integer enumVal = -1;
                if (field instanceof Integer)
                {
                    enumVal = (Integer) field;
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Enum: Unexpected value type: " + field.getClass());
                }

                GenericData.EnumSymbol enumSymbol = new GenericData.EnumSymbol(schema,schema.getEnumSymbols().get(enumVal));
                return enumSymbol;
            }
            case FIXED:
            {
                if (schema.getLogicalType() instanceof LogicalTypes.Decimal)
                {
                    if (fd.getFieldType() != FieldType.DECIMAL)
                    {
                        throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                            + schema.getLogicalType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    // Fixed binary represents a big-endian encoded integer.
                    BigDecimal decimalVal = BigDecimal.ZERO;
                    if (field instanceof BigDecimal)
                    {
                        decimalVal = (BigDecimal) field;
                    }
                    else
                    {
                        throw new Exception("AvroFieldTranslator toAvro: LogicalType.Decimal: Unexpected value type: " + field.getClass());
                    }

                    LogicalTypes.Decimal decimalInfo = (LogicalTypes.Decimal) schema.getLogicalType();
                    decimalVal = decimalVal.setScale(decimalInfo.getScale());

                    GenericData.Fixed fixedVal = new GenericData.Fixed(schema, decimalVal.unscaledValue().toByteArray());
                    return fixedVal;
                }
                else if (schema.getLogicalType().getName().equals("duration"))
                {
                    if (fd.getFieldType() != FieldType.RECORD)
                    {
                        throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                            + schema.getLogicalType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    // Duration (3 ints: months, days, millis) little-endian move to INTEGER4 of millis
                    if (field instanceof HPCCRecord)
                    {
                        HPCCRecord recValue = (HPCCRecord) field;
 
                        Integer months = (Integer) recValue.getField(0);
                        Integer days = (Integer) recValue.getField(1);
                        Integer millis = (Integer) recValue.getField(2);
                       
                        byte[] data = new byte[12];
                        littleEndianToByteArray(months,data,0);
                        littleEndianToByteArray(days,data,4);
                        littleEndianToByteArray(millis,data,8);
                        
                        GenericData.Fixed fixedVal = new GenericData.Fixed(schema,data);
                        return fixedVal;
                    }
                    else
                    {
                        throw new Exception("AvroFieldTranslator toAvro: LogicalType.Duration: Unexpected value type: " + field.getClass());
                    }
                }
                else
                {
                    if (fd.getFieldType() != FieldType.BINARY)
                    {
                        throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                            + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    if (field instanceof byte[])
                    {
                        byte[] data = (byte[]) field;
                        return new GenericData.Fixed(schema,data);
                    }
                    else
                    {
                        throw new Exception("AvroFieldTranslator toAvro: GenericFixed: Unexpected value type: " + field.getClass());
                    }
                }
            }
            case FLOAT:
            {
                if (fd.getFieldType() != FieldType.REAL)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof Number)
                {
                    Number numVal = (Number) field;
                    return Float.valueOf(numVal.floatValue());
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Float: Unexpected value type: " + field.getClass());
                }
            }
            case INT:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof Number)
                {
                    Number numVal = (Number) field;
                    return Integer.valueOf(numVal.intValue());
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Integer: Unexpected value type: " + field.getClass());
                }
            }
            case LONG:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof Number)
                {
                    Number numVal = (Number) field;
                    return Long.valueOf(numVal.longValue());
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Long: Unexpected value type: " + field.getClass());
                }
            }
            case MAP:
            {
                if (fd.getFieldType() != FieldType.DATASET)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof List)
                {
                    HashMap<String,Object> map = new HashMap<String,Object>();
                    List<HPCCRecord> recordList = (List<HPCCRecord>) field;
                    for (int i = 0; i < recordList.size(); i++)
                    {
                        HPCCRecord rec = recordList.get(i);
                        if (rec.getNumFields() != 2)
                        {
                            throw new Exception("AvroFieldTranslator toAvro: Map: Unexpected num fields in map record: " + rec.getNumFields());
                        }

                        String key = (String) rec.getField(0);
                        Object val = toAvro(schema.getValueType(), fd.getDef(0).getDef(1),rec.getField(1));
                        map.put(key,val);
                    }

                    return map;
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Map: Unexpected value type: " + field.getClass());
                }
            }
            case NULL:
            {
                if (fd.getFieldType() != FieldType.BOOLEAN)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof Boolean)
                {
                    return field;
                }
                else
                {
                    throw new Exception("AvroFieldTranslator toAvro: Null: Unexpected value type: " + field.getClass());
                }
            }
            case RECORD:
            {
                if (fd.getFieldType() != FieldType.RECORD)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if ((field instanceof HPCCRecord) == false)
                {
                    throw new Exception("AvroFieldTranslator toAvro: Record: Unexpected value type: " + field.getClass());
                }

                HPCCRecord record = (HPCCRecord) field;

                // Translate child fields
                List<Schema.Field> schemaFields = schema.getFields();
                ArrayList<Object> translatedFields = new ArrayList<Object>();
                
                int fieldIndex = 0;
                for (Schema.Field schemaField : schemaFields)
                {
                    Object childField = record.getField(fieldIndex);
                    if (schemaField.schema().getType() == Schema.Type.UNION)
                    {
                        Object outField = hpccUnionToAvro(schemaField.schema(), fd.getDef(fieldIndex), childField, false);
                        translatedFields.add(outField);
                    }
                    else
                    {
                        Object outField = toAvro(schemaField.schema(), fd.getDef(fieldIndex), childField);
                        translatedFields.add(outField);
                    }

                    fieldIndex++;
                }

                // If we have additional child fields then null bit fields were created
                int numNullBitFields = 0;
                if (schemaFields.size() != fd.getNumDefs())
                {
                    numNullBitFields = (translatedFields.size() + 63) / 64;
                }

                int totalFields = numNullBitFields + translatedFields.size();
                if (totalFields != fd.getNumDefs())
                {
                    throw new Exception("AvroFieldTranslation: toAvro: Error: Mismatch between record and expected record definition.");
                }

                // Fill in null bit fields
                for (int i = 0; i < numNullBitFields; i++)
                {
                    Long nullBitField = (Long) record.getField(i);
                    for (int j = 0; j < 64; j++)
                    {
                        int hpccFieldIndex = i*64 + j;
                        if (hpccFieldIndex >= fd.getNumDefs())
                        {
                            break;
                        }

                        if ((nullBitField & (1 << j)) != 0)
                        {
                            translatedFields.set(hpccFieldIndex,null);
                        }
                    }
                }
                
                GenericRecordBuilder avroRecordBuilder = new GenericRecordBuilder(schema);
                fieldIndex = 0;
                for (Schema.Field schemaField : schemaFields)
                {
                    avroRecordBuilder.set(schemaField,translatedFields.get(fieldIndex));
                    fieldIndex++;
                }

                return avroRecordBuilder.build();
            }
            case STRING:
            {
                if (fd.getFieldType() != FieldType.STRING)
                {
                    throw new Exception("AvroFieldTranslator toAvro: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                if (field instanceof String)
                {
                    return field;
                }
                else 
                {
                    throw new Exception("AvroFieldTranslator toAvro: String: Unexpected value type: " + field.getClass());
                }
            }
            case UNION:
            {
                return hpccUnionToAvro(schema, fd, field, true);
            }
            default:
            {
                throw new Exception("AvroFieldTranslator toAvro: Unhandled field type: " + schema.getType());
            }
        }
    }

    public static Object toHPCC(Schema schema, Schema.Field fieldMeta, FieldDef fd, Object field) throws Exception
    {
        switch (schema.getType())
        {
            case ARRAY:
            {
                if (fd.getFieldType() != FieldType.SET && fd.getFieldType() != FieldType.DATASET)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                ArrayList<Object> ret = EMPTY_ARRAY_LIST;
                if (field != null)
                {
                    Schema elementSchema = schema.getElementType();
                    ret = new ArrayList<Object>();

                    Collection<Object> arrayCol = (Collection<Object>) field;
                    for (Object val : arrayCol)
                    {
                        ret.add(toHPCC(elementSchema, null, fd.getDef(0), val));
                    }
                }

                return ret;
            }
            case BOOLEAN:
            {
                if (fd.getFieldType() != FieldType.BOOLEAN)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Boolean ret = DEFAULT_BOOLEAN;
                if (field != null)
                {
                    ret = (Boolean) field;
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case BYTES:
            {
                if (fd.getFieldType() != FieldType.BINARY)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                byte[] ret = EMPTY_BYTE_ARRAY;
                if (field != null)
                {
                    ByteBuffer byteBuffer = (ByteBuffer) field;
                    ret = byteBuffer.array();
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case DOUBLE:
            {
                if (fd.getFieldType() != FieldType.REAL)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Double ret = DEFAULT_DOUBLE;
                if (field != null)
                {
                    ret = (Double) field;
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case ENUM:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Integer ret = -1;
                if (field != null)
                {
                    GenericEnumSymbol enumSymbol = (GenericEnumSymbol) field;
                    ret = schema.getEnumOrdinal(enumSymbol.toString());
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case FIXED:
            {
                if (schema.getLogicalType() instanceof LogicalTypes.Decimal)
                {
                    if (fd.getFieldType() != FieldType.DECIMAL)
                    {
                        throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                            + schema.getLogicalType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    // Fixed binary represents a big-endian encoded integer.
                    // BigInt -> Decimal conversion *= 10^-Scale
                    LogicalTypes.Decimal decimalInfo = (LogicalTypes.Decimal) schema.getLogicalType();

                    BigDecimal ret = BigDecimal.ZERO;
                    if (field != null)
                    {
                        byte[] data = ((GenericFixed) field).bytes();
                        BigInteger intValue = new BigInteger(data);

                        ret = new BigDecimal(intValue,decimalInfo.getScale());
                    }

                    return ret;
                }
                else if (schema.getLogicalType().getName().equals("duration"))
                {
                    if (fd.getFieldType() != FieldType.RECORD)
                    {
                        throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                            + schema.getLogicalType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    // Duration (3 ints: months, days, millis) little-endian move to INTEGER8 of millis
                    Object[] fields = new Object[3];
                    fields[0] = DEFAULT_INTEGER;
                    fields[1] = DEFAULT_INTEGER;
                    fields[2] = DEFAULT_INTEGER;

                    if (field != null)
                    {
                        byte[] data = ((GenericFixed) field).bytes();

                        Integer months = littleEndianFromByteArray(data,0);
                        Integer days = littleEndianFromByteArray(data,4);
                        Integer millis = littleEndianFromByteArray(data,8);

                        fields[0] = months ;
                        fields[1] = days;
                        fields[2] = millis;
                    }

                    return new HPCCRecord(fields, fd);
                }
                else
                {
                    if (fd.getFieldType() != FieldType.BINARY)
                    {
                        throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                            + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                    }

                    byte[] ret = EMPTY_BYTE_ARRAY;
                    if (field != null)
                    {
                        ret = ((GenericFixed) field).bytes();
                    }
                    else if (fieldMeta != null)
                    {
                        return fieldMeta.defaultVal();
                    }

                    return ret;
                }
            }
            case FLOAT:
            {
                if (fd.getFieldType() != FieldType.REAL)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Float ret = DEFAULT_FLOAT;
                if (field != null)
                {
                    ret = (Float) field;
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case INT:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Integer ret = DEFAULT_INTEGER;
                if (field != null)
                {
                    ret = (Integer) field;
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case LONG:
            {
                if (fd.getFieldType() != FieldType.INTEGER)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                Long ret = DEFAULT_LONG;
                if (field != null)
                {
                    ret = (Long) field;
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case MAP:
            {
                if (fd.getFieldType() != FieldType.DATASET)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                ArrayList<Object> ret = EMPTY_ARRAY_LIST;
                if (field != null)
                {
                    ret = new ArrayList<Object>();
                    Map<String,Object> map = (Map<String,Object>) field;
                    FieldDef elementFieldDef = fd.getDef(0);
                    for (Map.Entry<String,Object> entry : map.entrySet())
                    {
                        Object convertedFieldValue = toHPCC(schema.getValueType(), null, elementFieldDef.getDef(1), entry.getValue());
                        HPCCRecord record = new HPCCRecord(new Object[] {entry.getKey(),convertedFieldValue}, elementFieldDef);
                        ret.add(record);
                    }
                }

                return ret;
            }
            case NULL:
            {
                if (fd.getFieldType() != FieldType.BOOLEAN)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                // This seems to be primarily used in unions.
                // However, having a standard field type of Null isn't prohibited. 
                // Treat these as a bool value if encountered
                if (field != null) 
                {
                    return (Boolean) field;
                }

                Boolean val = true;
                return val;
            }
            case RECORD:
            {
                if (fd.getFieldType() != FieldType.RECORD)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                // Translate child fields
                List<Schema.Field> schemaFields = schema.getFields();
                boolean hasNullableFields = false;

                ArrayList<Object> translatedFields = new ArrayList<Object>();
                
                IndexedRecord avroRecord = (IndexedRecord) field;
                int fieldIndex = 0;
                for (Schema.Field schemaField : schemaFields)
                {
                    Object childField = avroRecord.get(fieldIndex);
                    if (schemaField.schema().getType() == Schema.Type.UNION)
                    {
                        Boolean isNullable = false;
                        Boolean isNull = false;
                        
                        // Translate union with simple nullable types being inlined
                        Object outField = avroUnionToHpcc(schemaField.schema(), fd.getDef(fieldIndex), childField, isNullable, isNull, false);
                        translatedFields.add(outField);

                        if (isNullable)
                        {
                            hasNullableFields = true;
                        }
                    }
                    else
                    {
                        Object outField = toHPCC(schemaField.schema(), null, fd.getDef(fieldIndex), childField);
                        translatedFields.add(outField);
                    }

                    fieldIndex++;
                }

                // Add null fields
                int numNullBitFields = 0;
                if (hasNullableFields)
                {
                    numNullBitFields = (translatedFields.size() + 63) / 64;
                }

                int totalFields = numNullBitFields + translatedFields.size();
                if (totalFields != fd.getNumDefs())
                {
                    throw new Exception("AvroFieldTranslation: Error: Mismatch between record and expected record definition.");
                }

                // Fill in null bit fields
                for (int i = 0; i < numNullBitFields; i++)
                {
                    long nullBitField = 0;
                    for (int j = 0; j < 64; j++)
                    {
                        int avroFieldIndex = i*64 + j;
                        if (avroFieldIndex >= schemaFields.size())
                        {
                            break;
                        }

                        if (avroRecord.get(avroFieldIndex) == null)
                        {
                            nullBitField |= (1 << j);
                        }
                    }

                    translatedFields.add(Long.valueOf(nullBitField));
                }

                return new HPCCRecord(translatedFields.toArray(), fd);
            }
            case STRING:
            {
                if (fd.getFieldType() != FieldType.STRING)
                {
                    throw new Exception("AvroFieldTranslator toHPCC: incompatible avro schema type: " 
                                        + schema.getType() + "  to hpcc field type: " + fd.getFieldType());
                }

                String ret = EMPTY_STRING;
                if (field != null)
                {
                    ret = ((CharSequence) field).toString();
                }
                else if (fieldMeta != null)
                {
                    return fieldMeta.defaultVal();
                }

                return ret;
            }
            case UNION:
            {
                Boolean isNullable = true;
                Boolean isNull = true;
                return avroUnionToHpcc(schema, fd, field, isNullable, isNull, true);
            }
            default:
            {
                throw new Exception("AvroFieldTranslator toHPCC: Unhandled field type: " + schema.getType());
            }
        }
    }

    static boolean objectIsOfType(Object val, Schema type)
    {
        if (val == null)
        {
            return false;
        }

        switch (type.getType())
        {
            case ARRAY:
            {
                return val instanceof Collection;
            }
            case BOOLEAN:
            {
                return val instanceof Boolean; 
            }
            case BYTES:
            {
                return val instanceof byte[]; 
            }
            case DOUBLE:
            {
                return val instanceof Double;
            }
            case ENUM:
            {
                return val instanceof GenericEnumSymbol;
            }
            case FIXED:
            {
                return val instanceof GenericFixed;
            }
            case FLOAT:
            {
                return val instanceof Float;
            }
            case INT:
            {
                return val instanceof Integer;
            }
            case LONG:
            {
                return val instanceof Long;
            }
            case MAP:
            {
                return val instanceof Map;
            }
            case NULL:
            {
                return false;
            }
            case RECORD:
            {
                return val instanceof IndexedRecord;
            }
            case STRING:
            {
                return val instanceof CharSequence;
            }
            case UNION:
            {
                // A value could always be part of a union
                return true;
            }
            default:
            {
                return false;
            }
        }
    }

    // Notes on union translation:

    // Union structure changes based on the parent context, there are two highlevel use cases; the union is being created as a field in a record,
    // and the union is part of dataset or map. If the union is a child field in a record, and is nullable its null field be combined 
    // into a null bit-field in the parent record; otherwise nullable unions should have a null field.

    // Besides changes due to the parent context, there are two possible union types: simple nullable unions and complex unions.
    // Simple nullable unions are unions that are created to allow a field to be nullable; complex unions allow a field to have multiple possible types.
    // Complex unions are represented as a record with each possible type being a field, and a typeID field that determines the type of the value.
    // Complex unions may also be nullable, and may have an isNull field depending on the parent context.
    static Object avroUnionToHpcc(Schema schema, FieldDef fd, Object unionVal, Boolean isNullable, Boolean isNull, boolean inlineNull) throws Exception
    {
        // Need to handle the simple union case of ["null", "string, etc"]
        // Complex unions IE ["string", "array", "record"] will be handled by creating a rec
        // with a unionType int
        List<Schema> unionTypes = schema.getTypes();
        
        Integer actualTypeIndex = -1;
        int typeIndex = 0;
        ArrayList<Object> childFields = new ArrayList<Object>(); 
        for (Schema type : unionTypes)
        {
            if (type.getType() == Schema.Type.NULL)
            {
                isNullable = true;

                // Should we create an inline null field?
                if (inlineNull)
                {
                    isNull = (unionVal == null);
                    childFields.add(toHPCC(type, null, fd.getDef(typeIndex), isNull));
                }
            }
            else
            {
                if (objectIsOfType(unionVal, type))
                {
                    childFields.add(toHPCC(type, null, fd.getDef(typeIndex), unionVal));
                    actualTypeIndex = typeIndex;
                }
                else
                {
                    // We don't have field meta inside of a union unfortunately
                    childFields.add(toHPCC(type, null, fd.getDef(typeIndex), null));
                }
            }

            typeIndex++;
        }

        // If we only have on type for this Union it is a simple nullable union.
        // Return the union type
        if (childFields.size() == 1)
        {
            return childFields.get(0);
        }

        // If we couldn't find the type of the union set it to null
        if (actualTypeIndex == -1)
        {
            isNull = true;
        }

        // This is a complex union add the typeIndex to the union
        childFields.add(actualTypeIndex);

        return new HPCCRecord(childFields.toArray(), fd);
    }

    static Object hpccUnionToAvro(Schema schema, FieldDef fd, Object unionVal, boolean inlineNull) throws Exception
    {
        // Need to handle the simple union case of ["null", "string, etc"]
        // Complex unions IE ["string", "array", "record"] will be handled by creating a rec
        // with a unionType int

        Object translatedVal = null;
        List<Schema> unionTypes = schema.getTypes();
        if (unionVal instanceof HPCCRecord)
        {
            int numExpectedFields = unionTypes.size() + 1;
            if (numExpectedFields != fd.getNumDefs())
            {
                throw new Exception("AvroFieldTranslator toAvro: HPCC Union Record has unexpected number of fields: " 
                                    + fd.getNumDefs() + " Expected: " + numExpectedFields);
            }
            
            // This is the index of the actual type of the union
            HPCCRecord record = (HPCCRecord) unionVal;
            Integer typeIndex = (Integer) record.getField(numExpectedFields-1);
            translatedVal = toAvro(unionTypes.get(typeIndex), fd.getDef(typeIndex), record.getField(typeIndex));
        }
        else
        {
            if (unionTypes.size() != 2)
            {
                throw new Exception("AvroFieldTranslator toAvro: Avro Union schema has unexpected number of types: " 
                                    + unionTypes.size() + " Expected: 2");
            }

            int typeIndex = 0;
            if (unionTypes.get(0).getType() == Schema.Type.NULL)
            {
                typeIndex = 1;
            }

            translatedVal = toAvro(unionTypes.get(typeIndex), fd, unionVal);
        }

        return translatedVal;
    }
}
