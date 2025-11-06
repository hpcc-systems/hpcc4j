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
import java.text.SimpleDateFormat;
import java.util.Iterator;

import java.util.Arrays;

import org.apache.spark.Dependency;
import org.apache.spark.InterruptibleIterator;
import org.apache.spark.Partition;
import org.apache.spark.SparkContext;
import org.apache.spark.TaskContext;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.rdd.RDD;
import org.apache.spark.sql.execution.python.EvaluatePython;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.StructType;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.hpccsystems.dfs.client.BinaryRecordReader;
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.StatusCode;

import org.hpccsystems.commons.ecl.FieldDef;

import scala.collection.JavaConverters;
import scala.collection.Seq;
import scala.collection.mutable.ArrayBuffer;
import scala.reflect.ClassTag;
import scala.reflect.ClassTag$;
import net.razorvine.pickle.Unpickler;

/**
 * The implementation of the RDD(GenericRowWithSchema) that allows reading a Dataset from HPCC Systems.
 *
 */
public class HpccRDD extends RDD<Row> implements Serializable
{
    private static final long          serialVersionUID = 1L;
    private static final Logger        log              = LogManager.getLogger(HpccRDD.class);
    private static final ClassTag<Row> CT_RECORD        = ClassTag$.MODULE$.apply(Row.class);

    public static int                  DEFAULT_CONNECTION_TIMEOUT = 120;

    private String                     parentTraceID = "";
    private String                     parentSpanID = "";

    private InternalPartition[]        parts;
    private FieldDef                   originalRecordDef = null;
    private FieldDef                   projectedRecordDef = null;
    private int                        connectionTimeout = DEFAULT_CONNECTION_TIMEOUT;
    private int                        recordLimit = -1;
    private double                     recordSamplingRate = HpccFile.MAX_RECORD_SAMPLING_RATE;
    private long                       recordSamplingSeed = HpccFile.USE_RANDOM_SEED;
    private int                        stringProcessingFlags = BinaryRecordReader.NO_STRING_PROCESSING;
    private boolean                    unsignedEightToDecimal = false;

    private static void registerPicklingFunctions()
    {
        EvaluatePython.registerPicklers();
        Unpickler.registerConstructor("pyspark.sql.types", "Row", new RowConstructor());
        Unpickler.registerConstructor("pyspark.sql.types", "_create_row", new RowConstructor());
    }

    private class InternalPartition implements Partition
    {
        private static final long serialVersionUID = 2L;

        public DataPartition      partition;
        public int                sparkPartitionIndex = 0;

        public int hashCode()
        {
            return this.index();
        }

        public int index()
        {
            return sparkPartitionIndex;
        }
    }

    /**
     * @param sc spark context
     * @param dataParts data parts
     * @param originalRD original record definition
    */
    public HpccRDD(SparkContext sc, DataPartition[] dataParts, FieldDef originalRD)
    {
        this(sc,dataParts,originalRD,originalRD);
    }

    /**
     * @param sc spark context
     * @param dataParts data parts
     * @param originalRD original record definition
     * @param projectedRD projected record definition
    */
    public HpccRDD(SparkContext sc, DataPartition[] dataParts, FieldDef originalRD, FieldDef projectedRD)
    {
        this(sc,dataParts,originalRD,projectedRD,DEFAULT_CONNECTION_TIMEOUT,-1);
    }

    /**
     * @param sc spark context
     * @param dataParts data parts
     * @param originalRD original record definition
     * @param projectedRD projected record definition
     * @param connectTimeout connection timeout
     * @param limit file limit
    */
    public HpccRDD(SparkContext sc, DataPartition[] dataParts, FieldDef originalRD, FieldDef projectedRD, int connectTimeout, int limit)
    {
        this(sc, dataParts, originalRD, projectedRD, connectTimeout, limit, 1.0);
    }
    
    /**
     * @param sc spark context
     * @param dataParts data parts
     * @param originalRD original record definition
     * @param projectedRD projected record definition
     * @param connectTimeout connection timeout
     * @param limit file limit
     * @param recSamplingRate record sampling rate
    */
    public HpccRDD(SparkContext sc, DataPartition[] dataParts, FieldDef originalRD, FieldDef projectedRD, int connectTimeout, int limit, double recSamplingRate)
    {
        this(sc, dataParts, originalRD, projectedRD, connectTimeout, limit, recSamplingRate, HpccFile.USE_RANDOM_SEED);
    }

    /**
     * @param sc spark context
     * @param dataParts data parts
     * @param originalRD original record definition
     * @param projectedRD projected record definition
     * @param connectTimeout connection timeout
     * @param limit file limit
     * @param recSamplingRate record sampling rate
     * @param recSamplingSeed record sampling seed
    */
    public HpccRDD(SparkContext sc, DataPartition[] dataParts, FieldDef originalRD, FieldDef projectedRD, int connectTimeout, int limit, double recSamplingRate, long recSamplingSeed)
    {
        super(sc, new ArrayBuffer<Dependency<?>>(), CT_RECORD);
        this.parts = new InternalPartition[dataParts.length];
        for (int i = 0; i < dataParts.length; i++)
        {
            this.parts[i] = new InternalPartition();
            this.parts[i].partition = dataParts[i];
            this.parts[i].sparkPartitionIndex = i;
        }

        this.originalRecordDef = originalRD;
        this.projectedRecordDef = projectedRD;
        this.connectionTimeout = connectTimeout;
        this.recordLimit = limit;
        this.recordSamplingRate = recSamplingRate;
        this.recordSamplingSeed = recSamplingSeed;
    }

    /**
     * Set the trace context for this RDD.
     * @param parentTraceID parent trace ID
     * @param parentSpanID parent span ID
     */
    public void setTraceContext(String parentTraceID, String parentSpanID)
    {
        this.parentTraceID = parentTraceID;
        this.parentSpanID = parentSpanID;
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
     * Set whether to convert unsigned 8 byte unsigneds to decimal
     * @param convert true to convert, false to not convert
     */
    public void setUnsignedEightToDecimal(boolean convert)
    {
        this.unsignedEightToDecimal = convert;
    }

    /**
     * Wrap this RDD as a JavaRDD so the Java API can be used.
     * @return a JavaRDD wrapper of the HpccRDD.
     */
    public JavaRDD<Row> asJavaRDD()
    {
        JavaRDD<Row> jRDD = new JavaRDD<Row>(this, CT_RECORD);
        return jRDD;
    }

    /* (non-Javadoc)
     * @see org.apache.spark.rdd.RDD#compute(org.apache.spark.Partition, org.apache.spark.TaskContext)
     */
    @Override
    public InterruptibleIterator<Row> compute(Partition p_arg, TaskContext ctx)
    {
        HpccRDD.registerPicklingFunctions();

        final InternalPartition this_part = (InternalPartition) p_arg;
        final FieldDef originalRD = this.originalRecordDef;
        final FieldDef projectedRD = this.projectedRecordDef;

        if (originalRD == null)
        {
            log.error("Original record defintion is null. Aborting.");
            return new InterruptibleIterator<Row>(ctx, JavaConverters.asScalaIteratorConverter(Arrays.asList(new Row[0]).iterator()).asScala());
        }

        if (projectedRD == null)
        {
            log.error("Projected record defintion is null. Aborting.");
            return new InterruptibleIterator<Row>(ctx, JavaConverters.asScalaIteratorConverter(Arrays.asList(new Row[0]).iterator()).asScala());
        }

        scala.collection.Iterator<Row> iter = null;
        try
        {
            Span sparkPartReadSpan = Utils.createChildSpan(parentTraceID, parentSpanID, "HpccRDD.Compute/Read_" + this_part.partition.getThisPart());

            // Add taskID, stageID, stage attempt number, and task attempt number as attributes to the span
            sparkPartReadSpan.setAttribute("task.id", ctx.taskAttemptId());
            sparkPartReadSpan.setAttribute("task.attempt", ctx.attemptNumber());
            sparkPartReadSpan.setAttribute("stage.id", ctx.stageId());
            sparkPartReadSpan.setAttribute("stage.attempt", ctx.stageAttemptNumber());

            // Defaulting to OK, to reduce state tracking complexity below. If an error occurs this will be overwritten
            sparkPartReadSpan.setStatus(StatusCode.OK);

            // Create string timestamp in time format for logging
            String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
            log.info("Starting file part read: " + this_part.partition.getThisPart() + " from: " + this_part.partition.getCopyLocations()[0] + " timestamp: " + timeStamp);

            HpccRemoteFileReader.FileReadContext context = new HpccRemoteFileReader.FileReadContext();
            context.originalRD = originalRD;
            context.connectTimeout = connectionTimeout;
            context.recordReadLimit = recordLimit;
            context.parentSpan = sparkPartReadSpan;
            context.recordSamplingRate = recordSamplingRate;
            context.recordSamplingSeed = recordSamplingSeed;
            final HpccRemoteFileReader<Row> fileReader = new HpccRemoteFileReader<Row>(context, this_part.partition, new GenericRowRecordBuilder(projectedRD));
            fileReader.getRecordReader().setStringProcessingFlags(stringProcessingFlags);
            fileReader.getRecordReader().setUseDecimalForUnsigned8(unsignedEightToDecimal);

            // This will be called for both failure & success
            ctx.addTaskCompletionListener(taskContext ->
            {
                if (fileReader != null)
                {
                    try
                    {
                        fileReader.close();
                    }
                    catch(Exception e)
                    {
                        log.error("Error while attempting to close file reader: " + e.getMessage());
                        sparkPartReadSpan.recordException(e);
                    }
                }

                if (taskContext.isInterrupted())
                {
                    sparkPartReadSpan.setStatus(StatusCode.ERROR);
                }
            
                String endTimeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
                log.info("Finished file part read: " + this_part.partition.getThisPart() + " from: " + this_part.partition.getCopyLocations()[0] + " timestamp: " + endTimeStamp);

                sparkPartReadSpan.end();
            });

            // This will be called before the above completion listener
            ctx.addTaskFailureListener((TaskContext taskContext, Throwable error) -> {
                sparkPartReadSpan.recordException(error);
                sparkPartReadSpan.setStatus(StatusCode.ERROR);
            });

            iter = JavaConverters.asScalaIteratorConverter(fileReader).asScala();
        }
        catch (Exception e)
        {
            log.error("Failed to create remote file reader with error: " + e.getMessage());
            return new InterruptibleIterator<Row>(ctx, JavaConverters.asScalaIteratorConverter(Arrays.asList(new Row[0]).iterator()).asScala());
        }

        return new InterruptibleIterator<Row>(ctx, iter);
    }

    @Override
    public Seq<String> getPreferredLocations(Partition split)
    {
        final InternalPartition part = (InternalPartition) split;
        return JavaConverters.asScalaBufferConverter(Arrays.asList(part.partition.getCopyLocations()[0])).asScala().seq();
    }

    /* (non-Javadoc)
     * @see org.apache.spark.rdd.RDD#getPartitions()
     */
    @Override
    public Partition[] getPartitions()
    {
        return parts;
    }

}
