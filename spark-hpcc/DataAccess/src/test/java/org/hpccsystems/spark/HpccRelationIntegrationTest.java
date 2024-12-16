package org.hpccsystems.spark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

import javax.xml.validation.Schema;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.rdd.RDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.catalyst.expressions.GenericRowWithSchema;
import org.apache.spark.sql.sources.EqualTo;
import org.apache.spark.sql.sources.Filter;
import org.apache.spark.sql.sources.GreaterThan;
import org.apache.spark.sql.sources.In;
import org.apache.spark.sql.sources.IsNull;
import org.apache.spark.sql.sources.LessThan;
import org.apache.spark.sql.sources.Not;
import org.apache.spark.sql.sources.Or;
import org.apache.spark.sql.sources.StringContains;
import org.apache.spark.sql.sources.StringEndsWith;
import org.apache.spark.sql.sources.StringStartsWith;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.hpccsystems.dfs.client.CompressionAlgorithm;
import org.hpccsystems.spark.datasource.HpccOptions;
import org.hpccsystems.spark.datasource.HpccRelation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import scala.collection.JavaConverters;
import scala.collection.Seq;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class HpccRelationIntegrationTest extends BaseIntegrationTest
{
    @Test
    public void testbuildScanAllValid() throws Exception
    {
        SparkSession spark = getOrCreateSparkSession();
        SQLContext sqlcontext = new SQLContext(spark);

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

        String testDataset = "spark::test::integer_kv";
        writtenDataSet.write()
                    .format("hpcc")
                    .mode("overwrite")
                    .option("cluster", getThorCluster())
                    .option("host", getHPCCClusterURL())
                    .option("username", getHPCCClusterUser())
                    .option("password", getHPCCClusterPass())
                    .save(testDataset);

        TreeMap<String, String> paramTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        paramTreeMap.put("host", getHPCCClusterURL());
        paramTreeMap.put("path", testDataset);
        paramTreeMap.put("cluster", getThorCluster());
        paramTreeMap.put("username", getHPCCClusterUser());
        paramTreeMap.put("password", getHPCCClusterPass());

        HpccOptions hpccopts = new HpccOptions(paramTreeMap);
        HpccRelation hpccRelation = new HpccRelation(sqlcontext, hpccopts);

        Filter[] supportedSparkFilters = {
            new Or(new LessThan("key", 12), new GreaterThan("key", 8)),
            new In("key", new Object [] { 1, 2, 3, 4, 5}),
            new EqualTo("key", 5),
            new Not(new LessThan("key", 3)),
        };

        RDD<Row> rdd = hpccRelation.buildScan(new String[]{"key"}, supportedSparkFilters);
        Assert.assertTrue("Unexpected filter result count", rdd.count() == 1);
    }

    @Test
    public void testOptionsPassThrough() throws Exception
    {
        SparkSession spark = getOrCreateSparkSession();
        SQLContext sqlcontext = new SQLContext(spark);

        TreeMap<String, String> paramTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

        String url = getHPCCClusterURL();
        String user = "user";
        String pass = "pass";
        paramTreeMap.put("host", url);
        paramTreeMap.put("username", user);
        paramTreeMap.put("password", pass);

        String path = "spark::test::integer_kv";
        paramTreeMap.put("path", path);

        paramTreeMap.put("cluster", getThorCluster());
        paramTreeMap.put("useTLK", "True"); // Defaults to false, also should be case insensitive
        paramTreeMap.put("fileAccessTimeout", "120000");
        paramTreeMap.put("limitPerFilePart", "100");

        String projectList = "key, value";
        paramTreeMap.put("projectList", projectList);

        String filterStr = "key > 5";
        paramTreeMap.put("filter", filterStr);

        paramTreeMap.put("compression", "LZ4");

        HpccOptions hpccopts = new HpccOptions(paramTreeMap);

        // These options don't currently have accessors in HPCCFile
        Assert.assertEquals(url, hpccopts.connectionInfo.getUrl());
        Assert.assertEquals(user, hpccopts.connectionInfo.getUserName());
        Assert.assertEquals(pass, hpccopts.connectionInfo.getPassword());
        Assert.assertEquals(filterStr, hpccopts.filterString);
        Assert.assertEquals(CompressionAlgorithm.LZ4, hpccopts.compression);

        HpccRelation hpccRelation = new HpccRelation(sqlcontext, hpccopts);

        Assert.assertEquals(true, hpccRelation.getFile().getUseTLK());
        Assert.assertEquals(getThorCluster(), hpccRelation.getFile().getTargetfilecluster());
        Assert.assertEquals(path, hpccRelation.getFile().getFileName());
        Assert.assertEquals(120000, hpccRelation.getFile().getFileAccessExpirySecs());
        Assert.assertEquals(100, hpccRelation.getFile().getFilePartRecordLimit());
        Assert.assertEquals(projectList, hpccRelation.getFile().getProjectList());
    }

    @Test
    public void testUnhandledFiltersAllValid() throws Exception
    {
        HpccRelation hpccRelation = new HpccRelation(null, null);

        Filter[] supportedSparkFilters = {
            new StringStartsWith("fixstr8", "Rod"),
            new Or(new LessThan("int8", 12), new GreaterThan("int8", 8)),
            new In("int8", new Object [] { "str", "values", "etc"}),
            new In("int8", new Object [] { 1, 2, 3, 4, 5.6}),
            new LessThan("fixstr8", "XYZ"),
            new Not(new EqualTo("fixstr8", "true")),
            new EqualTo("int8", 5),
            new Not(new LessThan("int8", 3))
        };

        Filter [] unhandledsparkfilters = hpccRelation.unhandledFilters(supportedSparkFilters);

        Assert.assertTrue("Unexpected unhandled filters detected" , unhandledsparkfilters.length == 0);
    }

    @Test
    public void testUnhandledFiltersNoneValid() throws Exception
    {
        HpccRelation hpccRelation = new HpccRelation(null, null);

        Filter[] unsupportedSparkFilters = {
            new IsNull("something"),
            new Or(new LessThan("int8", 12), new GreaterThan("int4", 8)),
            new Not(new Or(new LessThan("int8", 12), new GreaterThan("int8", 8))),
            new Not(new In("int8", new Object [] { 1, 2, 3, 4, 5.6})),
            new StringContains("somestring", "some"),
            new StringEndsWith("somestring", "ing")
        };

        Filter[] unhandledsparkfilters = hpccRelation.unhandledFilters(unsupportedSparkFilters);

        Assert.assertTrue("Unexpected unhandled filters detected" , unhandledsparkfilters.length == unsupportedSparkFilters.length);
    }
}
