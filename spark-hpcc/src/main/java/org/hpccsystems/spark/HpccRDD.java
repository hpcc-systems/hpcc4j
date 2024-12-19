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

    private static void registerPicklingFunctions()
    {
        EvaluatePython.registerPicklers();
        Unpickler.registerConstructor("pyspark.sql.types", "Row", new RowConstructor());
        Unpickler.registerConstructor("pyspark.sql.types", "_create_row", new RowConstructor());
    }

    private class InternalPartition implements Partition
    {
        private static final long serialVersionUID = 1L;

        public DataPartition      partition;

        public int hashCode()
        {
            return this.index();
        }

        public int index()
        {
            return partition.index();
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
        super(sc, new ArrayBuffer<Dependency<?>>(), CT_RECORD);
        this.parts = new InternalPartition[dataParts.length];
        for (int i = 0; i < dataParts.length; i++)
        {
            this.parts[i] = new InternalPartition();
            this.parts[i].partition = dataParts[i];
        }

        this.originalRecordDef = originalRD;
        this.projectedRecordDef = projectedRD;
        this.connectionTimeout = connectTimeout;
        this.recordLimit = limit;
    }

    /**
     * Set the trace context for this RDD.
     * @param parentTraceID
     * @param parentSpanID
     */
    public void setTraceContext(String parentTraceID, String parentSpanID)
    {
        this.parentTraceID = parentTraceID;
        this.parentSpanID = parentSpanID;
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
            return null;
        }

        if (projectedRD == null)
        {
            log.error("Projected record defintion is null. Aborting.");
            return null;
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

            HpccRemoteFileReader.FileReadContext context = new HpccRemoteFileReader.FileReadContext();
            context.originalRD = originalRD;
            context.connectTimeout = connectionTimeout;
            context.recordReadLimit = recordLimit;
            context.parentSpan = sparkPartReadSpan;
            final HpccRemoteFileReader<Row> fileReader = new HpccRemoteFileReader<Row>(context, this_part.partition, new GenericRowRecordBuilder(projectedRD));

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
            return null;
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
