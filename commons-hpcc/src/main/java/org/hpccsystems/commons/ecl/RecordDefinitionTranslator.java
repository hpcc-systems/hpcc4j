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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import org.json.JSONArray;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.errors.UnparsableContentException;

public class RecordDefinitionTranslator
{
    private static final String FIELDS_KEY         = "fields";
    private static final String FIELD_TYPE_KEY     = "fieldType";
    private static final String LENGTH_KEY         = "length";
    private static final String NAME_KEY           = "name";
    private static final String TYPE_KEY           = "type";
    private static final String CHILD_KEY          = "child";
    private static final String FLAGS_KEY          = "flags";

    private static final int    FLAG_UNSIGNED      = 256;
    private static final int    FLAG_UNKNOWN_SIZE  = 1024;
    private static final int    TYPE_ID_MASK       = 0xff;       // 0x7fff & ~FLAG_UNKNOWN_SIZE & ~FLAG_UNSIGNED;
    final private static int    type_boolean       = 0;
    final private static int    type_int           = 1;
    final private static int    type_real          = 2;
    final private static int    type_decimal       = 3;
    final private static int    type_string        = 4;
    final private static int    type_biasedswapint = 8;          // Convert to integer
    final private static int    type_keyedint      = 10;         // Convert to integer
    final private static int    type_record        = 13;
    final private static int    type_varstring     = 14;
    final private static int    type_data          = 16;
    final private static int    type_table         = 20;
    final private static int    type_set           = 21;
    final private static int    type_swapint       = 26;         // Convert to integer
    final private static int    type_filepos       = 29;
    final private static int    type_unicode       = 31;
    final private static int    type_varunicode    = 33;
    final private static int    type_utf8          = 41;

    // These types need to be revised
    final private static int    type_char          = 11;         // Convert to string
    final private static int    type_qstring       = 30;         // Convert to string

    // Additional retained flags
    final private static int    FLAG_IS_PAYLOAD_FIELD = 0x00010000;

    private static FieldType getFieldType(int typeID)
    {
        int type = typeID & TYPE_ID_MASK;
        switch (type)
        {
            case type_boolean:
                return FieldType.BOOLEAN;
            case type_swapint:
            case type_biasedswapint:
            case type_keyedint:
            case type_int:
            case type_filepos:
                return FieldType.INTEGER;
            case type_real:
                return FieldType.REAL;
            case type_decimal:
                return FieldType.DECIMAL;
            case type_data:
                return FieldType.BINARY;
            case type_char:
                return FieldType.CHAR;
            case type_utf8:
            case type_string:
            case type_qstring:
            case type_unicode:
                return FieldType.STRING;
            case type_varstring:
            case type_varunicode:
                return FieldType.VAR_STRING;
            case type_set:
                return FieldType.SET;
            case type_record:
                return FieldType.RECORD;
            case type_table:
                return FieldType.DATASET;
            default:
                return FieldType.UNKNOWN;
        }
    }

    private static HpccSrcType getSourceType(int typeID)
    {
        int type = typeID & TYPE_ID_MASK;
        switch (type)
        {
            case type_int:
            case type_real:
                return HpccSrcType.LITTLE_ENDIAN;
            case type_swapint:
            case type_biasedswapint:
            case type_keyedint:
            case type_filepos:
                return HpccSrcType.BIG_ENDIAN;
            case type_utf8:
                return HpccSrcType.UTF8;
            case type_char:
            case type_string:
            case type_varstring:
                return HpccSrcType.SINGLE_BYTE_CHAR;
            case type_qstring:
                return HpccSrcType.QSTRING;
            case type_unicode:
            case type_varunicode:
                return HpccSrcType.UTF16LE;
            default:
                return HpccSrcType.UNKNOWN;
        }
    }

    private static boolean isFixedLength(int typeID)
    {
        return (typeID & FLAG_UNKNOWN_SIZE) == 0;
    }

    private static boolean isUnsigned(int typeID)
    {
        return (typeID & FLAG_UNSIGNED) != 0;
    }

    private static int getAdditionalFlags(int flags)
    {
        final int additionalFlagsMask = ~0x7FFF;
        return (flags & additionalFlagsMask);
    }

    /**
     * toECL Converts the provided FieldDef into an ECL record definition
     *
     * @param field
     *            the FieldDef to convert
     * @return ECL Record defintion as a String
     * @throws Exception
     */
    public static String toECLRecord(FieldDef field) throws Exception
    {
        if (field.getFieldType() != FieldType.RECORD)
        {
            throw new Exception("Invalid record structure. Root object must of type Record");
        }

        // Recurse through the tree structure and generate record defintions
        // LinkedHashMap to retain insertion order
        HashMap<String, String> recordDefinitionMap = new LinkedHashMap<String, String>();
        String rootRecordName = getEClTypeDefinition(field, recordDefinitionMap);

        // Get root record definition and remove it from the map
        String rootDefinition = recordDefinitionMap.get(rootRecordName); 
        recordDefinitionMap.remove(rootRecordName);
        rootDefinition = rootDefinition.replace(rootRecordName, "RD");

        // Combine the type definitions into a single ECL defintion
        StringBuilder sb = new StringBuilder(8192);
        for (HashMap.Entry<String, String> entry : recordDefinitionMap.entrySet())
        {
            sb.append("\n\n");
            sb.append(entry.getKey());
            sb.append(" := ");
            sb.append(entry.getValue());
        }

        sb.append("\n\n");
        sb.append(rootDefinition);
        String definition = sb.toString();
        
        // Replace the temporary hash key
        int numRecordDefinitions = 1;
        for (HashMap.Entry<String, String> entry : recordDefinitionMap.entrySet())
        {
            definition = definition.replace(entry.getKey(), "RD" + numRecordDefinitions);
            numRecordDefinitions++;
        }

        return definition;
    }

    private static String getEClTypeDefinition(FieldDef field, HashMap<String, String> recordDefinitionMap)
            throws Exception
    {
        switch (field.getFieldType())
        {
            case SET:
            {
                return "SET OF " + getEClTypeDefinition(field.getDef(0), recordDefinitionMap);
            }
            case DATASET:
            {
                return "DATASET(" + getEClTypeDefinition(field.getDef(0), recordDefinitionMap) + ")";
            }
            case BINARY:
            {
                return "DATA";
            }
            case BOOLEAN:
            {
                return "BOOLEAN";
            }
            case INTEGER:
            {
                String root = "INTEGER";
                if (field.isUnsigned())
                {
                    root = "UNSIGNED";
                }

                if (field.getDataLen() < 1 || field.getDataLen() > 8)
                {
                    throw new Exception("Error: Unsupported integer size: " + field.getDataLen() + " must 1-8.");
                }

                return root + field.getDataLen();
            }
            case DECIMAL:
            {
                String root = "DECIMAL";
                if (field.isUnsigned())
                {
                    root = "U" + root;
                }
                return root + field.getPrecision() + "_" + field.getScale();
            }
            case REAL:
            {
                if (field.getDataLen() == 4)
                {
                    return "REAL4";
                }
                else if (field.getDataLen() == 8)
                {
                    return "REAL8";
                }

                throw new Exception("Error: Unsupported real size: " + field.getDataLen() + " must 4 or 8.");
            }
            case CHAR:
            {
                return "STRING1";
            }
            case STRING:
            {
                String type = "";
                HpccSrcType srcType = field.getSourceType();
                if (srcType == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    type = "STRING";
                }
                else if (srcType == HpccSrcType.UTF16LE || srcType == HpccSrcType.UTF16BE)
                {
                    type = "UNICODE";
                }
                else if (srcType == HpccSrcType.UTF8)
                {
                    type = "UTF8";
                }
                else if (srcType == HpccSrcType.QSTRING)
                {
                    type = "QSTRING";
                }
                else
                {
                    throw new Exception(
                            "Unable to convert type to ECL string. Encountered unexpected string source type: "
                                    + srcType);
                }

                if (field.isFixed())
                {
                    type += field.getDataLen();
                }
                return type;
            }
            case VAR_STRING:
            {
                String type = "";
                HpccSrcType srcType = field.getSourceType();
                if (srcType == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    type = "VARSTRING";
                }
                else if (srcType == HpccSrcType.UTF16LE || srcType == HpccSrcType.UTF16BE)
                {
                    type = "VARUNICODE";
                }
                else
                {
                    throw new Exception(
                            "Unable to convert type to varstring. Encountered unexpected string source type: "
                                    + srcType);
                }

                if (field.isFixed())
                {
                    type += field.getDataLen();
                }
                return type;
            }
            case RECORD:
            {
                String definition = "RECORD\n";
                for (int i = 0; i < field.getNumDefs(); i++)
                {
                    FieldDef childField = field.getDef(i);
                    definition += "\t" + getEClTypeDefinition(childField, recordDefinitionMap) + " "
                            + childField.getFieldName() + ";\n";
                }
                definition += "END;\n";

                int hash = definition.hashCode();
                String recordDefnName = "##" + hash + "##";

                recordDefinitionMap.put(recordDefnName, definition);
                return recordDefnName;
            }
            default:
            {
                throw new Exception("Unable to generate ECL unknown field type: " + field.getFieldType().description());
            }
        }
    }

    /**
     * toJson Converts the provided FieldDef into a json record definition
     *
     * @param field
     *            the FieldDef to convert
     * @return Record as a JSONObject
     * @throws Exception
     */
    public static JSONObject toJsonRecord(FieldDef field) throws Exception
    {
        if (field.getFieldType() != FieldType.RECORD)
        {
            throw new Exception("Invalid record structure. Root object must of type Record");
        }

        // Recurse through the tree structure and generate type defintions

        // Type Hash -> Type Index
        HashMap<Integer, Integer> typeDefinitionMap = new HashMap<Integer, Integer>();
        ArrayList<JSONObject> typeDefinitions = new ArrayList<JSONObject>();
        Integer rootRecordHash = getJsonTypeDefinition(field, typeDefinitionMap, typeDefinitions);

        // Get root record definition and remove it from the map
        Integer rootDefinitionIndex = typeDefinitionMap.get(rootRecordHash);
        JSONObject rootDefinition = typeDefinitions.get(rootDefinitionIndex);
        typeDefinitions.set(rootDefinitionIndex, null);

        // Add types to root definition
        for (int i = 0; i < typeDefinitions.size(); i++)
        {
            JSONObject typeDefinition = typeDefinitions.get(i);
            if (typeDefinition == null)
            {
                continue;
            }

            rootDefinition.put("ty" + (i + 1), typeDefinition);
        }

        return rootDefinition;
    }

    private static int getTypeID(FieldDef field) throws Exception
    {
        int typeID = 0;
        switch (field.getFieldType())
        {
            case SET:
            {
                typeID = type_set;
                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }
                break;
            }
            case DATASET:
            {
                typeID = type_table;
                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }
                break;
            }
            case BINARY:
            {
                typeID = type_data;
                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }
                break;
            }
            case BOOLEAN:
            {
                typeID = type_boolean;
                break;
            }
            case INTEGER:
            {
                typeID = type_int;
                if (field.isUnsigned())
                {
                    typeID |= FLAG_UNSIGNED;
                }
                break;
            }
            case DECIMAL:
            {
                typeID = type_decimal;
                if (field.isUnsigned())
                {
                    typeID |= FLAG_UNSIGNED;
                }
                break;
            }
            case REAL:
            {
                typeID = type_real;
                break;
            }
            case CHAR:
            {
                typeID = type_char;
                if (field.isUnsigned())
                {
                    typeID |= FLAG_UNSIGNED;
                }
                break;
            }
            case STRING:
            {
                typeID = -1;
                HpccSrcType srcType = field.getSourceType();
                if (srcType == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    typeID = type_string;
                }
                else if (srcType == HpccSrcType.UTF16LE || srcType == HpccSrcType.UTF16BE)
                {
                    typeID = type_unicode;
                }
                else if (srcType == HpccSrcType.UTF8)
                {
                    typeID = type_utf8;
                }
                else if (srcType == HpccSrcType.QSTRING)
                {
                    typeID = type_qstring;
                }
                else
                {
                    throw new Exception(
                            "Unable to convert type to json. Encountered unexpected string source type: " + srcType);
                }

                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }

                break;
            }
            case VAR_STRING:
            {
                typeID = -1;
                HpccSrcType srcType = field.getSourceType();
                if (srcType == HpccSrcType.SINGLE_BYTE_CHAR)
                {
                    typeID = type_varstring;
                }
                else if (srcType == HpccSrcType.UTF16LE || srcType == HpccSrcType.UTF16BE)
                {
                    typeID = type_varunicode;
                }
                else
                {
                    throw new Exception(
                            "Unable to convert type to json. Encountered unexpected varstring source type: " + srcType);
                }

                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }

                break;
            }
            case RECORD:
            {
                typeID = type_record;
                if (field.isFixed() == false)
                {
                    typeID |= FLAG_UNKNOWN_SIZE;
                }
                break;
            }
            default:
            {
                throw new Exception("Unable to generate JSON for field : " + field.getFieldName()
                        + " with unknown type: " + field.getFieldType().description());
            }
        }

        return typeID;
    }

    private static int getTypeHash(FieldDef field) throws Exception
    {
        int numHashComponents = 2 + field.getNumDefs();
        if (field.getFieldType() == FieldType.DECIMAL)
        {
            numHashComponents += 2;
        }

        long[] hashComponents = new long[numHashComponents];
        hashComponents[0] = getTypeID(field);
        hashComponents[1] = field.getDataLen();

        int hashCompIndex = 2;
        for (int i = 0; i < field.getNumDefs(); i++, hashCompIndex++)
        {
            hashComponents[hashCompIndex] = getTypeHash(field.getDef(i));
        }

        if (field.getFieldType() == FieldType.DECIMAL)
        {
            hashComponents[hashCompIndex] = field.getPrecision();
            hashComponents[hashCompIndex + 1] = field.getScale();
        }

        return Arrays.hashCode(hashComponents);
    }

    private static int getJsonTypeDefinition(FieldDef field, HashMap<Integer, Integer> typeDefinitionMap,
            ArrayList<JSONObject> typeDefinitions) throws Exception
    {
        int typeHash = getTypeHash(field);
        Integer typeIndex = typeDefinitionMap.get(typeHash);
        if (typeIndex != null)
        {
            return typeHash;
        }

        JSONObject typeDef = new JSONObject();
        int typeID = getTypeID(field);
        switch (field.getFieldType())
        {
            case DATASET:
            case SET:
            {
                typeDef.put("fieldType", typeID);
                typeDef.put("length", field.getDataLen());

                int childTypeHash = getJsonTypeDefinition(field.getDef(0), typeDefinitionMap, typeDefinitions);
                int childTypeIndex = typeDefinitionMap.get(childTypeHash);
                String childTypeName = "ty" + (childTypeIndex + 1);
                typeDef.put("child", childTypeName);
                break;
            }
            case BOOLEAN:
            case BINARY:
            case INTEGER:
            case REAL:
            case CHAR:
            case STRING:
            case VAR_STRING:
            {
                typeDef.put("fieldType", typeID);
                typeDef.put("length", field.getDataLen());
                break;
            }
            case DECIMAL:
            {
                typeDef.put("fieldType", typeID);
                int len = field.getScale() << 16 | field.getPrecision();
                typeDef.put("length", len);
                break;
            }
            case RECORD:
            {
                typeDef.put("fieldType", typeID);
                typeDef.put("length", field.getDataLen());

                JSONArray fields = new JSONArray();
                for (int i = 0; i < field.getNumDefs(); i++)
                {
                    FieldDef childField = field.getDef(i);

                    int childTypeHash = getJsonTypeDefinition(childField, typeDefinitionMap, typeDefinitions);
                    int childTypeIndex = typeDefinitionMap.get(childTypeHash);
                    String childTypeName = "ty" + (childTypeIndex + 1);
                    int childTypeID = getTypeID(childField);

                    JSONObject childJson = new JSONObject();
                    childJson.put("name", childField.getFieldName());
                    childJson.put("type", childTypeName);
                    if (childTypeID > 0)
                    {
                        int flags = childTypeID | childField.getAdditionalFlags();
                        childJson.put("flags", flags);
                    }

                    if (childField.getFieldType() == FieldType.DATASET)
                    {
                        char delim = 0x0001;
                        childJson.put("xpath", childField.getFieldName() + delim + "Row");
                    }

                    fields.put(childJson);
                }

                typeDef.put("fields", fields);
                break;
            }
            default:
            {
                throw new Exception("Unable to generate JSON for field : " + field.getFieldName()
                        + " with unknown type: " + field.getFieldType().description());
            }
        }

        int newTypeIndex = typeDefinitions.size();
        typeDefinitions.add(typeDef);
        typeDefinitionMap.put(typeHash, newTypeIndex);

        return typeHash;
    }

    public static FieldDef parseJsonRecordDefinition(JSONObject recordDefinition) throws UnparsableContentException
    {
        HashMap<String, FieldDef> typeDefinitions = new HashMap<String, FieldDef>();
        return parseJsonRecordDefinition(recordDefinition, typeDefinitions, recordDefinition);
    }

    private static FieldDef parseJsonRecordDefinition(JSONObject jsonTypeDefinitions,
            HashMap<String, FieldDef> protoTypeDefs, JSONObject recordDefinition) throws UnparsableContentException
    {
        int typeID = recordDefinition.getInt(FIELD_TYPE_KEY);
        long length = recordDefinition.getLong(LENGTH_KEY);

        FieldType fieldType = getFieldType(typeID);
        if (fieldType != FieldType.RECORD)
        {
            throw new UnparsableContentException(
                    "Expected top-level field to be of type Record. Found: " + fieldType.description());
        }

        JSONArray fields = recordDefinition.getJSONArray(FIELDS_KEY);
        ArrayList<FieldDef> childDefs = new ArrayList<FieldDef>();

        for (int i = 0; i < fields.length(); i++)
        {
            JSONObject value = fields.getJSONObject(i);
            if (value == null)
            {
                continue;
            }

            JSONObject jsonFieldDefinition = (JSONObject) value;
            FieldDef childFieldDef = parseFieldDefinition(jsonTypeDefinitions, protoTypeDefs, jsonFieldDefinition);
            childDefs.add(childFieldDef);
        }

        boolean isFixedLength = isFixedLength(typeID);
        boolean isUnsigned = isUnsigned(typeID);
        HpccSrcType srcType = getSourceType(typeID);
        return new FieldDef("RootRecord", fieldType, fieldType.description(), length, isFixedLength, isUnsigned,
                    srcType, childDefs.toArray(new FieldDef[0]));
    }

    private static FieldDef parseFieldDefinition(JSONObject jsonTypeDefinitions,
            HashMap<String, FieldDef> protoTypeDefs, JSONObject jsonFieldDefinition) throws UnparsableContentException
    {
        String name = jsonFieldDefinition.getString(NAME_KEY);
        String type = jsonFieldDefinition.getString(TYPE_KEY);

        int flags = 0;
        try
        {
            flags = jsonFieldDefinition.getInt(FLAGS_KEY);
        }
        catch(Exception e) {}

        FieldDef protoTypeDef = getOrParseJsonTypeDefintion(type, jsonTypeDefinitions, protoTypeDefs);
        FieldDef ret = new FieldDef(protoTypeDef);
        ret.setAdditionalFlags(getAdditionalFlags(flags));
        ret.setFieldName(name);
        return ret;
    }

    private static FieldDef getOrParseJsonTypeDefintion(String type, JSONObject jsonTypeDefinitions,
            HashMap<String, FieldDef> protoTypeDefs) throws UnparsableContentException
    {
        FieldDef protoTypeDef = protoTypeDefs.get(type);
        if (protoTypeDef == null)
        {
            JSONObject typeDefnJson = jsonTypeDefinitions.getJSONObject(type);
            if (typeDefnJson == null)
            {
                throw new UnparsableContentException("Unable to find type defintion for type: " + type);
            }

            protoTypeDef = parseJsonTypeDefinition(jsonTypeDefinitions, protoTypeDefs, typeDefnJson);
            protoTypeDef.setFieldName(type);
            protoTypeDefs.put(type, protoTypeDef);
        }

        return protoTypeDef;
    }

    private static FieldDef parseJsonTypeDefinition(JSONObject jsonTypeDefinitions,
            HashMap<String, FieldDef> protoTypeDefs, JSONObject typeDef) throws UnparsableContentException
    {
        int typeID = typeDef.getInt(FIELD_TYPE_KEY);
        long length = typeDef.getLong(LENGTH_KEY);

        FieldType fieldType = getFieldType(typeID);
        switch (fieldType)
        {
            case RECORD:
            {
                return parseJsonRecordDefinition(jsonTypeDefinitions, protoTypeDefs, typeDef);
            }
            case SET:
            case DATASET:
            {
                String childType = typeDef.getString(CHILD_KEY);
                FieldDef childProtoTypeDef = getOrParseJsonTypeDefintion(childType, jsonTypeDefinitions, protoTypeDefs);

                FieldDef[] childDefs = { childProtoTypeDef };
                return new FieldDef("", fieldType, fieldType.description(), length, isFixedLength(typeID),
                        isUnsigned(typeID), getSourceType(typeID), childDefs);
            }
            default:
            {
                return new FieldDef("", fieldType, fieldType.description(), length, isFixedLength(typeID),
                        isUnsigned(typeID), getSourceType(typeID), new FieldDef[0]);
            }
        }
    }
}
