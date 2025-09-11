/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2018 HPCC Systems®.
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

import java.io.Serializable;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;


import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.sql.execution.python.EvaluatePython;
import org.hpccsystems.dfs.cluster.RemapInfo;
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.utils.Connection;

import io.opentelemetry.api.trace.Span;

/**
 * Access to file content on a collection of one or more HPCC
 * clusters.
 *
 */
public class HpccFile extends org.hpccsystems.dfs.client.HPCCFile implements Serializable
{
  static private final long serialVersionUID = 2L;

  public static final double MIN_RECORD_SAMPLING_RATE = 1e-12;
  public static final double MAX_RECORD_SAMPLING_RATE = 1.0;
  public static final long USE_RANDOM_SEED = -1L;

  private String parentTraceID = "";
  private String parentSpanID = "";

  private int recordLimit = -1;
  private double recordSamplingRate = MAX_RECORD_SAMPLING_RATE;
  private long recordSamplingSeed = USE_RANDOM_SEED;
  private int stringProcessingFlags = org.hpccsystems.dfs.client.BinaryRecordReader.NO_STRING_PROCESSING;
  private boolean unsignedEightToDecimal = false;

  // Make sure Python picklers have been registered
  static { EvaluatePython.registerPicklers(); }

  /**
   * Constructor for the HpccFile.
   * Captures HPCC logical file  information from the DALI Server
   * for the clusters behind the ESP named by the Connection.
   *
   * @param fileName The HPCC file name
   * @param espconninfo The ESP connection info (protocol,address,port,user,pass)
   * @throws HpccFileException hpcc file exection
   */
  public HpccFile(String fileName, Connection espconninfo) throws HpccFileException
  {
    super(fileName,espconninfo);
  }

  /**
   * Constructor for the HpccFile.
   * Captures HPCC logical file  information from the DALI Server
   * for the clusters behind the ESP named by the Connection.
   *
   * @param fileName The HPCC file name
   * @param connectionString to eclwatch. Format: {http|https}://{HOST}:{PORT}.
   * @param user username
   * @param pass password
   * @throws MalformedURLException Malformed URL exception
   * @throws HpccFileException hpcc file exception
   */
  public HpccFile(String fileName, String connectionString, String user, String pass) throws MalformedURLException, HpccFileException
  {
    super(fileName,connectionString,user,pass);
  }

  /**
   * Constructor for the HpccFile.
   * Captures HPCC logical file information from the DALI Server for the
   * clusters behind the ESP named by the IP address and re-maps
   * the address information for the THOR nodes to visible addresses
   * when the THOR clusters are virtual.
   * @param fileName The HPCC file name
   * @param espconninfo esp connection information object
   * @param targetColumnList a comma separated list of column names in dotted
   * notation for columns within compound columns.
   * @param filter a file filter to select records of interest
   * @param remap_info address and port re-mapping info for THOR cluster
   * @param maxParts optional the maximum number of partitions or zero for no max
   * @param targetfilecluster optional - the hpcc cluster the target file resides in
   * @throws HpccFileException hpcc file exception
   */
  public HpccFile(String fileName, Connection espconninfo, String targetColumnList, String filter, RemapInfo remap_info, int maxParts, String targetfilecluster) throws HpccFileException
  {
    super(fileName,espconninfo,targetColumnList,filter,remap_info,maxParts,targetfilecluster);
  }

  /**
   * Set the opentelemetry trace context
   * @param span the span to use for the trace context
   */
  public void setTraceContext(Span span)
  {
    this.parentTraceID = span.getSpanContext().getTraceId();
    this.parentSpanID = span.getSpanContext().getSpanId();
  }

  /**
   * Set the opentelemetry trace context
   * @param parentTraceID hexadecimal trace id string
   * @param parentSpanID hexadecimal span id string
   */
  public void setTraceContext(String parentTraceID, String parentSpanID)
  {
    this.parentTraceID = parentTraceID;
    this.parentSpanID = parentSpanID;
  }

  /**
   * Set file part record limit
   * @param limit fire part record limit
   */
  public void setFilePartRecordLimit(int limit)
  {
    this.recordLimit = limit;
  }

  /**
   * Set the record sampling rate when reading the file.
   * @param recSamplingRate the percentage of records to read from the file.
   */
  public void setRecordSamplingRate(double recSamplingRate) throws IllegalArgumentException
  {
    if (recSamplingRate < MIN_RECORD_SAMPLING_RATE || recSamplingRate > MAX_RECORD_SAMPLING_RATE)
    {
      throw new IllegalArgumentException("Record sampling rate must be between " + MIN_RECORD_SAMPLING_RATE + " and " + MAX_RECORD_SAMPLING_RATE);
    }

    this.recordSamplingRate = recSamplingRate;
  }

  /**
   * Returns the current record sampling rate
   * @return returns record sampling rate
   */
  public double getRecordSamplingRate()
  {
    return this.recordSamplingRate;
  }

  /**
   * Set the record sampling seed when reading the file.
   * @param recSamplingSeed the seed to use for random sampling of records.
   */
  public void setRecordSamplingSeed(long recSamplingSeed) throws IllegalArgumentException
  {
    if (recSamplingSeed < 0 && recSamplingSeed != USE_RANDOM_SEED)
    {
      throw new IllegalArgumentException("Record sampling seed must be a positive number or -1 to use a random seed");
    }

    this.recordSamplingSeed = recSamplingSeed;
  }

  /**
   * Returns the current record sampling seed
   * @return returns record sampling seed
   */
  public long getRecordSamplingSeed()
  {
    return this.recordSamplingSeed;
  }

  /**
   * Returns the current file part record limit
   * @return returns file part record limit
   */
  public int getFilePartRecordLimit()
  {
    return this.recordLimit;
  }

  /**
   * Set the string processing flags
   * @param flags the string processing flags
   */
  public void setStringProcessingFlags(int flags)
  {
    this.stringProcessingFlags = flags;
  }

  /**
   * Get the string processing flags
   * @return the string processing flags
   */
  public int getStringProcessingFlags()
  {
    return this.stringProcessingFlags;
  }

  /**
   * Set whether to convert unsigned 8 byte unsigned to decimal
   * @param convert true to convert, false to not convert
   */
  public void setUnsignedEightToDecimal(boolean convert)
  {
    this.unsignedEightToDecimal = convert;
  }

  /**
   * Get whether to convert unsigned 8 byte unsigned to decimal
   * @return true if converting, false if not
   */
  public boolean getUnsignedEightToDecimal()
  {
    return this.unsignedEightToDecimal;
  }

  /**
   * Make a Spark Resilient Distributed Dataset (RDD) that provides access
   * to THOR based datasets. Uses existing SparkContext, allows this function
   * to be used from PySpark.
   * @return An RDD of THOR data.
   * @throws HpccFileException When there are errors reaching the THOR data
   */
  public HpccRDD getRDD() throws HpccFileException
  {
    return getRDD(SparkContext.getOrCreate());
  }

  /**
   * Make a Spark Resilient Distributed Dataset (RDD) that provides access
   * to THOR based datasets.
   * @param sc Spark Context
   * @return An RDD of THOR data.
   * @throws HpccFileException When there are errors reaching the THOR data
   */
  public HpccRDD getRDD(SparkContext sc) throws HpccFileException
  {
	  HpccRDD rdd = new HpccRDD(sc, getFileParts(), this.getRecordDefinition(), this.getProjectedRecordDefinition(), this.getFileAccessExpirySecs(), 
                        this.recordLimit, this.recordSamplingRate, this.recordSamplingSeed);
    rdd.setTraceContext(parentTraceID, parentSpanID);
    rdd.setStringProcessingFlags(stringProcessingFlags);
    rdd.setUnsignedEightToDecimal(unsignedEightToDecimal);
    return rdd;
  }

  /**
   * Make a Spark Resilient Distributed Dataset (RDD) that provides access
   * to THOR based datasets.
   * @param sc Spark Context
   * @param filePartsToRead List of file parts to read
   * @return An RDD of THOR data.
   * @throws HpccFileException When there are errors reaching the THOR data
   */
  public HpccRDD getRDD(SparkContext sc, List<Integer> filePartsToRead) throws HpccFileException
  {
    if (filePartsToRead == null || filePartsToRead.size() == 0)
    {
      throw new HpccFileException("No file parts requested");
    }

    DataPartition[] fileParts = getFileParts();
    
    List<DataPartition> filteredFileParts = new ArrayList<DataPartition>();
    for (Integer filePart : filePartsToRead)
    {
      filePart--; // File parts are 1 based
      if (filePart < 0 || filePart >= fileParts.length)
      {
        throw new HpccFileException("Invalid file part requested: " + filePart + " of " + fileParts.length);
      }

      filteredFileParts.add(fileParts[filePart]);
    }

	  HpccRDD rdd = new HpccRDD(sc, filteredFileParts.toArray(new DataPartition[0]), this.getRecordDefinition(), this.getProjectedRecordDefinition(), this.getFileAccessExpirySecs(), 
                              this.recordLimit, this.recordSamplingRate, this.recordSamplingSeed);
    rdd.setTraceContext(parentTraceID, parentSpanID);
    rdd.setStringProcessingFlags(stringProcessingFlags);
    rdd.setUnsignedEightToDecimal(unsignedEightToDecimal);
    return rdd;
  }
  
  /**
   * Make a Spark Dataframe (Dataset (Row)) of THOR data available.
   * @param session the Spark Session object
   * @return a Dataframe of THOR data
   * @throws HpccFileException when htere are errors reaching the THOR data.
   */
  public Dataset<Row> getDataframe(SparkSession session) throws HpccFileException{
    FieldDef originalRD = this.getRecordDefinition();
    FieldDef projectedRD = this.getProjectedRecordDefinition();
    DataPartition[] fp = this.getFileParts();

    HpccRDD hpccRDD = new HpccRDD(session.sparkContext(), fp, originalRD, projectedRD, this.getFileAccessExpirySecs(), this.recordLimit, this.recordSamplingRate, this.recordSamplingSeed);
    hpccRDD.setTraceContext(parentTraceID, parentSpanID);
    hpccRDD.setStringProcessingFlags(stringProcessingFlags);
    hpccRDD.setUnsignedEightToDecimal(unsignedEightToDecimal);
    JavaRDD<Row > rdd = (hpccRDD).toJavaRDD();

    StructType schema = null;
    try
    {
      schema = SparkSchemaTranslator.toSparkSchema(projectedRD);
    }
    catch(Exception e)
    {
      throw new HpccFileException(e.getMessage());
    }

    return session.createDataFrame(rdd, schema);
  }
}
