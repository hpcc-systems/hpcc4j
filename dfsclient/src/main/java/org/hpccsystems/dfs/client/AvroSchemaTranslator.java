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
import org.apache.avro.Conversions.DecimalConversion;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

import java.util.List;
import java.util.ArrayList;

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

public class AvroSchemaTranslator
{
    public static FieldDef toHPCC(Schema schema, String fieldName) throws Exception
    {
        FieldDef ret = null;
        switch (schema.getType())
        {
            case ARRAY:
            {
                Schema elementSchema = schema.getElementType();
                FieldDef[] elementDef = new FieldDef[1];
                elementDef[0] = toHPCC(elementSchema, elementSchema.getName());

                if (elementDef[0].getFieldType() == FieldType.RECORD)
                {
                    ret = new FieldDef(fieldName, FieldType.DATASET, "DATASET", 0, false, false, 
                                        HpccSrcType.LITTLE_ENDIAN, elementDef);
                }
                else
                {
                    ret = new FieldDef(fieldName, FieldType.SET, "SET", 0, false, false, 
                                        HpccSrcType.LITTLE_ENDIAN, elementDef);
                }
                break;
            }
            case BOOLEAN:
            {
                ret = new FieldDef(fieldName, FieldType.BOOLEAN, "BOOL", 1, true, false,
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case BYTES:
            {
                // Also could be Decimal logical type, but decimal is always fixed on
                // The HPCC side. Do we just ignore this case and throw an error, 
                // or choose a default IE: DEC32_16 and change precision during translation?
                // For the moment lets treat this as an error
                if (schema.getLogicalType() instanceof LogicalTypes.Decimal)
                {
                    throw new Exception("Invalid field type. Non-fixed length decimal values are currently unsupported.");
                }

                ret = new FieldDef(fieldName, FieldType.BINARY, "BINARY", 0, false, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case DOUBLE:
            {
                ret = new FieldDef(fieldName, FieldType.REAL, "REAL8", 8, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case ENUM:
            {
                // Enum treat as int
                List<String> enumSymbols = schema.getEnumSymbols();
                
                // On the HPCC side we could unsigned, but sticking to signed here make things easier on us
                int bytesNeeded = 1;
                if (enumSymbols.size() >= Byte.MAX_VALUE)
                {
                    bytesNeeded = 2;
                    if (enumSymbols.size() >= Short.MAX_VALUE)
                    {
                        // If there are this many enum symbols we should probably treat it as an error
                        throw new Exception("Enum has too many symbols, a max of " + Short.MAX_VALUE + " symbols are supported.");
                    }
                }

                ret = new FieldDef(fieldName, FieldType.INTEGER, "INTEGER" + bytesNeeded, bytesNeeded, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case FIXED:
            {
                if (schema.getLogicalType() instanceof LogicalTypes.Decimal)
                {
                    // Fixed binary represents a big-endian encoded integer.
                    // BigInt -> Decimal conversion *= 10^-Scale
                    LogicalTypes.Decimal decimalInfo = (LogicalTypes.Decimal) schema.getLogicalType();

                    ret = new FieldDef(fieldName, FieldType.DECIMAL, "DECIMAL", 1, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                    ret.setPrecision(decimalInfo.getPrecision());
                    ret.setScale(decimalInfo.getScale());
                }
                else if (schema.getLogicalType().getName().equals("duration"))
                {
                    // Duration (3 ints: months, days, millis) move to INTEGER8 of millis
                    ret = new FieldDef(fieldName, FieldType.INTEGER, "INTEGER8", 8, true, true, 
                                        HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                }
                else
                {
                    ret = new FieldDef(fieldName, FieldType.BINARY, "BINARY", schema.getFixedSize(), true, false, 
                                        HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                }

                break;
            }
            case FLOAT:
            {
                ret = new FieldDef(fieldName, FieldType.REAL, "REAL4", 4, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case INT:
            {
                ret = new FieldDef(fieldName, FieldType.INTEGER, "INTEGER4", 4, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case LONG:
            {
                ret = new FieldDef(fieldName, FieldType.INTEGER, "INTEGER8", 8, true, false, 
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case MAP:
            {
                // Map<String,?> Represent as a set of key value records, this will allow DICTIONARY to be used
                FieldDef[] childFields = new FieldDef[2];
                childFields[0] = new FieldDef("key", FieldType.STRING, "UTF8", 0, false, false, 
                                    HpccSrcType.UTF8, new FieldDef[0]);
                childFields[1] = toHPCC(schema.getValueType(),"value");

                FieldDef[] elementDef = new FieldDef[1];
                elementDef[0] = new FieldDef("KeyValueRecord", FieldType.RECORD, "RECORD", 0, false, false,
                                   HpccSrcType.LITTLE_ENDIAN, childFields);

                ret = new FieldDef(fieldName, FieldType.DATASET, "DATASET", 0, false, false, 
                                    HpccSrcType.LITTLE_ENDIAN, elementDef);
                break;
            }
            case NULL:
            {
                // This seems to be primarily used in unions.
                // However, having a standard field type of Null isn't prohibited. 
                // Treat these as a bool value if encountered

                ret = new FieldDef(fieldName, FieldType.BOOLEAN, "BOOL", 1, true, false,
                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                break;
            }
            case RECORD:
            {
                List<Schema.Field> fields = schema.getFields();

                boolean hasNullableFields = false;
                for (Schema.Field field : fields)
                {
                    if (field.schema().getType() == Schema.Type.UNION)
                    {
                        for (Schema unionType : field.schema().getTypes())
                        {
                            if (unionType.getType() == Schema.Type.NULL)
                            {
                                hasNullableFields = true;
                            }
                        }
                    }
                }

                int numNullBitFields = 0;
                if (hasNullableFields)
                {
                    numNullBitFields = (fields.size() + 63) / 64;
                }

                FieldDef[] childFields = new FieldDef[fields.size() + numNullBitFields];
                for (int i = 0; i < fields.size(); i++)
                {
                    Schema.Field field = fields.get(i);
                    childFields[i] = toHPCC(field.schema(),field.name());
                }

                // Create nullable fields
                for (int i = 0; i < numNullBitFields; i++)
                {
                    childFields[fields.size() + i] = new FieldDef("nullBitField"+i, FieldType.INTEGER, "INTEGER8", 8, true, false, 
                                                                    HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
                }

                ret = new FieldDef(fieldName, FieldType.RECORD, "RECORD", 0, false, false,
                                   HpccSrcType.LITTLE_ENDIAN, childFields);

                break;
            }
            case STRING:
            {
                ret = new FieldDef(fieldName, FieldType.STRING, "UTF8", 0, false, false, 
                                    HpccSrcType.UTF8, new FieldDef[0]);
                break;
            }
            case UNION:
            {
                // Need to handle the simple union case of ["null", "string, etc"]
                // Complex unions IE ["string", "array", "record"] will be handled by creating a rec
                // with a unionType int
                List<Schema> unionTypes = schema.getTypes();

                boolean isNullable = false;
                ArrayList<Schema> types = new ArrayList<Schema>();
                for (Schema type : unionTypes)
                {
                    if (type.getType() == Schema.Type.UNION)
                    {
                        isNullable = true;
                    }
                    else
                    {
                        types.add(type);
                    }
                }
                
                boolean isSimpleNullable = (types.size() == 1 && isNullable);
                if (isSimpleNullable)
                {
                    // Nulls will be combined into a bitfield
                    ret = toHPCC(types.get(0), fieldName);
                }
                else
                {
                    ArrayList<Schema.Field> childFields = new ArrayList<Schema.Field>(); 
                    for (int i = 0; i < types.size(); i++)
                    {
                        Schema childSchema = types.get(i);
                        childFields.add(new Schema.Field(childSchema.getName() + "Type", childSchema, "", (Object)null));
                    }

                    // Add a union type field
                    childFields.add(new Schema.Field("unionType", Schema.create(Schema.Type.INT), "", (Object)null));

                    boolean isError = false;
                    ret = toHPCC(Schema.createRecord(fieldName+"Rec", "", "", isError),fieldName);
                }
                
                break;
            }
        };

        return ret;
    }

    public static Schema toAvro(FieldDef fd) throws Exception
    {
        switch (fd.getFieldType()) 
        {
            case VAR_STRING:
            case STRING:
            case CHAR:
                return Schema.create(Schema.Type.STRING);
            case INTEGER:
                if (fd.getDataLen() <= 4)
                {
                    return Schema.create(Schema.Type.INT);
                }
                else
                {
                    return Schema.create(Schema.Type.LONG);
                }
            case BINARY:
                return Schema.create(Schema.Type.BYTES);
            case BOOLEAN:
                return Schema.create(Schema.Type.BOOLEAN);
            case REAL:
                if (fd.getDataLen() <= 4)
                {
                    return Schema.create(Schema.Type.FLOAT);
                }
                else
                {
                    return Schema.create(Schema.Type.DOUBLE);
                }
            case DECIMAL:
                DecimalConversion conv = new DecimalConversion();
                return conv.getRecommendedSchema();
            case SET:
            case DATASET:
                Schema childSchema = toAvro(fd.getDef(0));
                return Schema.createArray(childSchema);
            case RECORD:
                {
                    ArrayList<Schema.Field> fields = new ArrayList<Schema.Field>();
                    for (int i = 0; i < fd.getNumDefs(); i++) 
                    {
                        FieldDef childField = fd.getDef(i);
                        fields.add(new Schema.Field(childField.getFieldName(), toAvro(childField), null, null));
                    }

                    Boolean isError = false;
                    Schema recSchema = Schema.createRecord(fd.getFieldName(),"","",isError,fields);
                    if (isError)
                    {
                        throw new Exception("AvroSchemaTranslator: Error translation record def.");
                    }
                    
                    recSchema.addAlias(fd.getFieldName());
                    return recSchema;
                }
            case UNKNOWN:
            default:
                throw new Exception("AvroSchemaTranslator: Unknown field type");
        }
    }
}