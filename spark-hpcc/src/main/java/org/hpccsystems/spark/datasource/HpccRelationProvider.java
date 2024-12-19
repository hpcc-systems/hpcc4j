package org.hpccsystems.spark.datasource;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SaveMode;

import org.apache.spark.sql.sources.BaseRelation;
import org.apache.spark.sql.sources.CreatableRelationProvider;
import org.apache.spark.sql.sources.DataSourceRegister;
import org.apache.spark.sql.sources.RelationProvider;

import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.spark.HpccFileWriter;

import scala.collection.JavaConversions;
import scala.collection.immutable.Map;

import java.util.TreeMap;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Registers HPCC Systems as a DataSource. Allows reading of a dataset in HPCC Systems and writing a new dataset to HPCC Systems.
 */
public class HpccRelationProvider implements RelationProvider, CreatableRelationProvider, DataSourceRegister
{
    private static Logger log = LogManager.getLogger(HpccRelationProvider.class);

    @Override
    public String shortName()
    {
        return "hpcc";
    }

    @Override
    public BaseRelation createRelation(SQLContext sqlContext, Map<String, String> parameters)
    {
        HpccOptions options = null;
        try
        {
            options = extractOptions(parameters);
        }
        catch (Exception e)
        {
            String error = "Error while attempting to extract HpccOptions: " + e.getMessage();
            log.error(error);
            throw new RuntimeException(error);
        }
        return new HpccRelation(sqlContext, options);
    }

    @Override
    public BaseRelation createRelation(SQLContext sqlContext, SaveMode mode, Map<String, String> parameters, Dataset<Row> data)
    {
        boolean overwrite = false;
        if (mode == SaveMode.Append)
        {
            String error = "Append mode is not supported in HPCC.";
            log.error(error);
            throw new RuntimeException(error);
        }
        else if (mode == SaveMode.Overwrite)
        {
            overwrite = true;
        }

        HpccOptions options = null;
        try
        {
            options = extractOptions(parameters);
        }
        catch (Exception e)
        {
            String error = "Error while attempting to extract HpccOptions: " + e.getMessage();
            log.error(error);
            throw new RuntimeException(error);
        }

        try
        {
            HpccFileWriter fileWriter = new HpccFileWriter(options.connectionInfo);
            fileWriter.setTraceContext(options.traceID, options.spanID);
            fileWriter.saveToHPCC(sqlContext.sparkContext(), data.schema(), data.rdd().toJavaRDD(), options.clusterName, options.fileName,
                    options.compression, overwrite);

            // Attempt to open the new file
            return createRelation(sqlContext, parameters);
        }
        catch (Exception e)
        {
            String error = "Unable to save file to HPCC with error: " + e.getMessage();
            log.error(error);
            throw new RuntimeException(error,e);
        }
    }

    private HpccOptions extractOptions(Map<String, String> scalaParams) throws Exception
    {
        java.util.Map<String, String> parameters = JavaConversions.mapAsJavaMap(scalaParams);

        // Use TreeMap to avoid case sensitivity
        TreeMap<String, String> paramTreeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        paramTreeMap.putAll(parameters);

        HpccOptions options = new HpccOptions(paramTreeMap);
        return options;
    }

}
