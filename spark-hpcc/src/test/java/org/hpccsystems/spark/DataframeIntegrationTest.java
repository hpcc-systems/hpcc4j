/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2023 HPCC Systems®.
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

import java.util.List;
import java.math.BigDecimal;
import java.util.ArrayList;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;

import org.junit.Assert;
import org.junit.Test;

public class DataframeIntegrationTest extends BaseIntegrationTest
{

    @Test
    public void integerKeyValueWriteReadTest()
    {
        SparkSession spark = getOrCreateSparkSession();

        // Create the schema
        StructType schema = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("key", DataTypes.LongType, false),
            DataTypes.createStructField("value", DataTypes.LongType, false)
        });

        // Write dataset to HPCC
        List<Row> rows = new ArrayList<Row>();
        for (int i = 0; i < 1000; i++) {
            Object[] fields = new Object[2];
            fields[0] = Long.valueOf(i);
            fields[1] = Long.valueOf(i);
            rows.add(new GenericRowWithSchema(fields, schema));
        }

        Dataset<Row> writtenDataSet = spark.createDataFrame(rows, schema);

        String datasetPath = "spark::test::integer_kv";
        writtenDataSet.write()
                      .format("hpcc")
                      .mode("overwrite")
                      .option("cluster", getThorCluster())
                      .option("host", getHPCCClusterURL())
                      .option("username", getHPCCClusterUser())
                      .option("password", getHPCCClusterPass())
                      .save(datasetPath);

        // Read dataset from HPCC
        Dataset<Row> readDataSet = spark.read()
                                    .format("hpcc")
                                    .option("cluster", getThorCluster())
                                    .option("host", getHPCCClusterURL())
                                    .option("username", getHPCCClusterUser())
                                    .option("password", getHPCCClusterPass())
                                    .load(datasetPath);

        StructType readSchema = readDataSet.schema();
        System.out.println(readSchema);

        Dataset<Row> diff = writtenDataSet.exceptAll(readDataSet);
        Assert.assertTrue("Difference found between written and read datasets", diff.isEmpty());
    }

    @Test
    public void allTypesWriteReadTest()
    {
        SparkSession spark = getOrCreateSparkSession();

        StructType inlineSchema = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("key", DataTypes.IntegerType, false),
            DataTypes.createStructField("val", DataTypes.IntegerType, false)
        });

        StructType childSchema = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("test", DataTypes.IntegerType, false),
            DataTypes.createStructField("test2", DataTypes.IntegerType, false)
        });

        // Create the schema
        StructType schema = DataTypes.createStructType(new StructField[] {
            DataTypes.createStructField("byteVal", DataTypes.ByteType, false),
            DataTypes.createStructField("shortVal", DataTypes.ShortType, false),
            DataTypes.createStructField("intVal", DataTypes.IntegerType, false),
            DataTypes.createStructField("longVal", DataTypes.LongType, false),
            DataTypes.createStructField("floatVal", DataTypes.FloatType, false),
            DataTypes.createStructField("doubleVal", DataTypes.DoubleType, false),
            DataTypes.createStructField("decimalVal", DataTypes.createDecimalType(16, 8), false),
            DataTypes.createStructField("stringVal", DataTypes.StringType, false),
            DataTypes.createStructField("binaryVal", DataTypes.BinaryType, false),
            DataTypes.createStructField("setVal", DataTypes.createArrayType(DataTypes.IntegerType), false),
            DataTypes.createStructField("inlineRec", inlineSchema, false),
            DataTypes.createStructField("childDataset", DataTypes.createArrayType(childSchema), false),
        });

        // Write dataset to HPCC
        List<Row> rows = new ArrayList<Row>();
        for (int i = 0; i < 1000; i++)
        {
            Object[] fields = new Object[12];
            fields[0] = Byte.valueOf((byte) i);
            fields[1] = Short.valueOf((short) i);
            fields[2] = Integer.valueOf((int) i);
            fields[3] = Long.valueOf((long) i);
            fields[4] = Float.valueOf(0);
            fields[5] = Double.valueOf(10.42);
            fields[6] = new BigDecimal(10.42);
            fields[7] = "TestString";
            fields[8] = new String("BinaryVal").getBytes();

            Integer[] set = new Integer[2];
            set[0] = Integer.valueOf(i);
            set[1] = Integer.valueOf(i);
            fields[9] = set;

            Object[] inlineRec = new Object[2];
            inlineRec[0] = Integer.valueOf(i);
            inlineRec[1] = Integer.valueOf(i);
            fields[10] = new GenericRowWithSchema(inlineRec, childSchema);

            int numChildRows = 10;
            List<Row> childDataset = new ArrayList<Row>();
            for (int j = 0; j < numChildRows; j++)
            {
                Object[] childRec = new Object[2];
                childRec[0] = Integer.valueOf(j);
                childRec[1] = Integer.valueOf(j);

                childDataset.add(new GenericRowWithSchema(childRec, childSchema));
            }
            fields[11] = childDataset.toArray();

            rows.add(new GenericRowWithSchema(fields, schema));
        }

        Dataset<Row> writtenDataSet = spark.createDataFrame(rows, schema);

        String datasetPath = "spark::test::all_types";
        writtenDataSet.write()
                      .format("hpcc")
                      .mode("overwrite")
                      .option("cluster", getThorCluster())
                      .option("host", getHPCCClusterURL())
                      .option("username", getHPCCClusterUser())
                      .option("password", getHPCCClusterPass())
                      .save(datasetPath);

        // Read dataset from HPCC
        Dataset<Row> readDataSet = spark.read()
                                    .format("hpcc")
                                    .option("cluster", getThorCluster())
                                    .option("host", getHPCCClusterURL())
                                    .option("username", getHPCCClusterUser())
                                    .option("password", getHPCCClusterPass())
                                    .load(datasetPath);

        Dataset<Row> diff = writtenDataSet.exceptAll(readDataSet);
        Assert.assertTrue("Difference found between written and read datasets", diff.isEmpty());
    }
}
