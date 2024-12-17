/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.
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
package org.hpccsystems.spark;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.HpccSrcType;

import org.apache.spark.sql.types.*;

/**
 * A helper class that translates an HPCC Systems record defintion to a Spark Schema.
 */
public class SparkSchemaTranslator
{
    private static StructField toSchemaElement(FieldDef field) throws Exception
    {
        Metadata empty = Metadata.empty();
        boolean nullable = false;

        DataType type = DataTypes.NullType;
        switch (field.getFieldType())
        {
            case VAR_STRING:
            case STRING:
            case CHAR:
                type = DataTypes.StringType;
                break;
            case FILEPOS:
            case INTEGER:
                type = DataTypes.LongType;
                break;
            case BINARY:
                type = DataTypes.BinaryType;
                break;
            case BOOLEAN:
                type = DataTypes.BooleanType;
                break;
            case REAL:
                type = DataTypes.DoubleType;
                break;
            case DECIMAL:
                int precision = field.getPrecision();
                int scale = field.getScale();

                // Spark SQL only supports 38 digits in decimal values
                if (precision > DecimalType.MAX_PRECISION())
                {
                    scale -= (precision - DecimalType.MAX_PRECISION());
                    if (scale < 0)
                    {
                        scale = 0;
                    }

                    precision = DecimalType.MAX_PRECISION();
                }

                type = DataTypes.createDecimalType(precision,scale);
                break;
            case SET:
            case DATASET:
                StructField childField = toSchemaElement(field.getDef(0));
                type = DataTypes.createArrayType(childField.dataType());
                nullable = true;
                break;
            case RECORD:
                StructField[] childFields = new StructField[field.getNumDefs()];
                for (int i = 0; i < field.getNumDefs(); i++)
                {
                    childFields[i] = toSchemaElement(field.getDef(i));
                }
                type = DataTypes.createStructType(childFields);
                break;
            case UNKNOWN:
                type = DataTypes.NullType;
                throw new Exception("Conversion from HPCC FieldDef to Spark StructField failed. Encountered unknown type.");
        }

        return new StructField(field.getFieldName(), type, nullable, empty);
    }

    /**
    * translate a FieldDef into a StructField object of the schema
    * @param recordDef field definition
    * @return datatype from fields
    * @throws Exception general exception
    */
    public static StructType toSparkSchema(FieldDef recordDef) throws Exception
    {
        if (recordDef.getFieldType() != FieldType.RECORD)
        {
            return null;
        }

        StructField[] fields = new StructField[recordDef.getNumDefs()];
        for (int i = 0; i < recordDef.getNumDefs(); i++)
        {
            fields[i] = toSchemaElement(recordDef.getDef(i));
        }

        return DataTypes.createStructType(fields);
    }

    private static FieldDef toFieldDef(StructField sparkField) throws Exception
    {
        DataType type = sparkField.dataType();
        if (type instanceof ArrayType) {
            ArrayType array = (ArrayType) sparkField.dataType();
            StructField tempField = new StructField(sparkField.name(),array.elementType(),
                                                    false,Metadata.empty());

            FieldDef[] childDef = new FieldDef[1];
            childDef[0] = toFieldDef(tempField);

            if (array.elementType() instanceof StructType) {
                return new FieldDef(sparkField.name(), FieldType.DATASET, "DATASET", 0, false, false,
                                    HpccSrcType.LITTLE_ENDIAN, childDef);
            } else {
                return new FieldDef(sparkField.name(), FieldType.SET, "SET", 0, false, false,
                                    HpccSrcType.LITTLE_ENDIAN, childDef);
            }
        } else if (type instanceof BinaryType) {
            return new FieldDef(sparkField.name(), FieldType.BINARY, "BINARY", 0, false, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof BooleanType) {
            return new FieldDef(sparkField.name(), FieldType.BOOLEAN, "BOOL", 1, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof ByteType) {
            return new FieldDef(sparkField.name(), FieldType.INTEGER, "INTEGER1", 1, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof DecimalType) {
            FieldDef ret = new FieldDef(sparkField.name(), FieldType.DECIMAL, "DECIMAL", 1, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
            DecimalType decimal = (DecimalType) type;
            ret.setPrecision(decimal.precision());
            ret.setScale(decimal.scale());
            return ret;
        } else if (type instanceof DoubleType) {
            return new FieldDef(sparkField.name(), FieldType.REAL, "REAL8", 8, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof FloatType) {
            return new FieldDef(sparkField.name(), FieldType.REAL, "REAL4", 4, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof IntegerType) {
            return new FieldDef(sparkField.name(), FieldType.INTEGER, "INTEGER4", 4, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof LongType) {
            return new FieldDef(sparkField.name(), FieldType.INTEGER, "INTEGER8", 8, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof ShortType) {
            return new FieldDef(sparkField.name(), FieldType.INTEGER, "INTEGER2", 2, true, false,
                                HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        } else if (type instanceof StringType) {
            return new FieldDef(sparkField.name(), FieldType.STRING, "UTF8", 0, false, false,
                                HpccSrcType.UTF8, new FieldDef[0]);
        } else if (type instanceof StructType) {
            StructType schema = (StructType) type;
            StructField schemaFields[] = schema.fields();
            FieldDef[] children = new FieldDef[schemaFields.length];

            for (int i = 0; i < schemaFields.length; i++) {
                children[i] = toFieldDef(schemaFields[i]);
            }

            return new FieldDef(sparkField.name(), FieldType.RECORD, "RECORD", 0, false, false,
                                HpccSrcType.LITTLE_ENDIAN,children);
        } else {
            throw new Exception("Conversion from Spark StuctField to HPCC FieldDef failed. Encountered unexpected type: " + type);
        }
    }

    public static FieldDef toHPCCRecordDef(StructType schema) throws Exception
    {

        StructField tempField = new StructField("RootRecord",schema,false,Metadata.empty());
        return toFieldDef(tempField);
    }
}
