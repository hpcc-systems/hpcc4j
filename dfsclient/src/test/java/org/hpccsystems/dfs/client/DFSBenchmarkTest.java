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
package org.hpccsystems.dfs.client;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileWriter;

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.ws.client.BaseRemoteTest;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.errors.HpccFileException;
import org.json.JSONObject;
import org.json.JSONArray;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import org.hpccsystems.commons.benchmarking.BenchmarkResult;
import org.hpccsystems.commons.benchmarking.BenchmarkParam;
import org.hpccsystems.commons.benchmarking.SimpleMetric;
import org.hpccsystems.commons.benchmarking.AveragedMetric;
import org.hpccsystems.commons.benchmarking.IMetric;
import org.hpccsystems.commons.benchmarking.Units;
import org.hpccsystems.commons.benchmarking.MetricSumTransformer;
import org.hpccsystems.commons.benchmarking.MetricAverageTransformer;

@Category(org.hpccsystems.commons.annotations.Benchmark.class)
public class DFSBenchmarkTest extends BaseRemoteTest
{
    private static final String[] datasets = {  "benchmark::integer::100mb",
                                                "benchmark::string::100mb",
                                                "benchmark::varstring::100mb",
                                                "benchmark::utf8::100mb",
                                                "benchmark::unicode::100mb",
                                                "benchmark::real::100mb",
                                                "benchmark::decimal::100mb" };

    private static final String READ_TIME_METRIC = "readTime";
    private static final String BANDWIDTH_METRIC = "bandwidth";
    private static final String RPS_METRIC = "recordsPerSecond";

    private static final String[] JENKINS_SELECTED_METRICS = {BANDWIDTH_METRIC, RowServiceInputStream.WAIT_TIME_METRIC, RowServiceInputStream.SLEEP_TIME_METRIC};

    private void setDesiredMetricScales(BenchmarkResult result)
    {
        result.setMetricDesiredUnitScale(READ_TIME_METRIC, Units.Scale.UNIT);
        result.setMetricDesiredUnitScale(BANDWIDTH_METRIC, Units.Scale.MEGA);
        result.setMetricDesiredUnitScale(RPS_METRIC, Units.Scale.MEGA);
        result.setMetricDesiredUnitScale(RowServiceInputStream.BYTES_READ_METRIC, Units.Scale.MEGA);
        result.setMetricDesiredUnitScale(RowServiceInputStream.FIRST_BYTE_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.WAIT_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.SLEEP_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.FETCH_START_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.FETCH_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.FETCH_FINISH_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.CLOSE_TIME_METRIC, Units.Scale.MILLI);
        result.setMetricDesiredUnitScale(RowServiceInputStream.MUTEX_WAIT_TIME_METRIC, Units.Scale.MILLI);
    }

    @Test
    public void readBenchmarks() throws Exception
    {
        System.out.println("Starting Raw Read Tests");
        System.out.println("-------------------------------------------------------------");

        MetricSumTransformer sumTransformer = new MetricSumTransformer();
        MetricAverageTransformer aggregateTransformer = new MetricAverageTransformer();
        ArrayList<BenchmarkResult> rawReadTests = new ArrayList<BenchmarkResult>();
        int numReadSamples = 20;
        for (int i = 0; i < datasets.length; i++)
        {
            System.out.print(datasets[i] + " samples: [");

            BenchmarkResult result = new BenchmarkResult("DFSClient: Read", datasets[i]);
            rawReadTests.add(result);
            setDesiredMetricScales(result);

            result.addParameter(new BenchmarkParam("dataset",datasets[i]));

            // Raw streaming
            List<IMetric> avgdMetrics = new ArrayList<IMetric>();
            for (int j = 0; j < numReadSamples; j++)
            {
                System.out.print(" " + j);
                HPCCFile file = new HPCCFile(datasets[i], connString, hpccUser, hpccPass);
                file.setFileAccessExpirySecs(1000);

                try
                {
                    List<IMetric> metrics = new ArrayList<IMetric>();
                    long readTimeNS = System.nanoTime();
                    readRawFileData(file,metrics);
                    readTimeNS = System.nanoTime() - readTimeNS;

                    metrics = sumTransformer.transform(metrics);
                    metrics.add(new SimpleMetric((double)readTimeNS, READ_TIME_METRIC, new Units(Units.Type.SECONDS, Units.Scale.NANO)));

                    avgdMetrics.addAll(metrics);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }
            }
            avgdMetrics = aggregateTransformer.transform(avgdMetrics);
            result.addMetrics(avgdMetrics);

            // Calculate and add bandwidth
            IMetric readTimeMetric = result.getMetric(READ_TIME_METRIC);
            double avgReadTime = readTimeMetric.getValue() * Units.calculateScaleConversion(readTimeMetric.getUnits().scale,Units.Scale.UNIT);

            IMetric bytesReadMetric = result.getMetric(RowServiceInputStream.BYTES_READ_METRIC);
            double fileSize = bytesReadMetric.getValue() * Units.calculateScaleConversion(bytesReadMetric.getUnits().scale,Units.Scale.UNIT);
            double avgBandwidth = fileSize / avgReadTime;
            result.addMetric(new SimpleMetric(avgBandwidth, BANDWIDTH_METRIC, new Units(Units.Type.BYTES)));

            System.out.println(" ]");
        }

        System.out.println("\nStarting Read & Parse Tests");
        System.out.println("-------------------------------------------------------------");

        ArrayList<BenchmarkResult> readParseTests = new ArrayList<BenchmarkResult>();
        for (int i = 0; i < datasets.length; i++)
        {
            System.out.print(datasets[i] + " samples: [");

            BenchmarkResult result = new BenchmarkResult("DFSClient: Read & Parse",datasets[i]);
            readParseTests.add(result);
            setDesiredMetricScales(result);

            result.addParameter(new BenchmarkParam("dataset",datasets[i]));
            List<IMetric> avgdMetrics = new ArrayList<IMetric>();

            // Raw streaming
            long numRecords = 0;
            for (int j = 0; j < numReadSamples; j++)
            {
                System.out.print(" " + j);
                HPCCFile file = new HPCCFile(datasets[i], connString, hpccUser, hpccPass);
                file.setFileAccessExpirySecs(1000);

                try
                {

                    List<IMetric> metrics = new ArrayList<IMetric>();
                    long readTimeNS = System.nanoTime();
                    numRecords = readFileSerially(file,metrics);
                    readTimeNS = System.nanoTime() - readTimeNS;

                    metrics = sumTransformer.transform(metrics);
                    metrics.add(new SimpleMetric((double)readTimeNS, READ_TIME_METRIC, new Units(Units.Type.SECONDS, Units.Scale.NANO)));

                    avgdMetrics.addAll(metrics);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }
            }
            avgdMetrics = aggregateTransformer.transform(avgdMetrics);
            result.addMetrics(avgdMetrics);

            // Calculate and add bandwidth
            IMetric readTimeMetric = result.getMetric(READ_TIME_METRIC);
            double avgReadTime = readTimeMetric.getValue() * Units.calculateScaleConversion(readTimeMetric.getUnits().scale,Units.Scale.UNIT);

            IMetric bytesReadMetric = result.getMetric(RowServiceInputStream.BYTES_READ_METRIC);
            double fileSize = bytesReadMetric.getValue() * Units.calculateScaleConversion(bytesReadMetric.getUnits().scale,Units.Scale.UNIT);
            double avgBandwidth = fileSize / avgReadTime;
            result.addMetric(new SimpleMetric(avgBandwidth, BANDWIDTH_METRIC, new Units(Units.Type.BYTES)));

            // Calculate and add RPS
            double avgRPS = numRecords / avgReadTime;
            result.addMetric(new SimpleMetric(avgRPS, RPS_METRIC, new Units(Units.Type.COUNT)));

            System.out.println(" ]");
        }

        // Output plugin results
        JSONArray testGroups = new JSONArray();

        JSONObject rawReadGroup = new JSONObject();
        rawReadGroup.put("name","Raw Read Tests");

        JSONArray jsonTests = new JSONArray();
        for (int i = 0; i < rawReadTests.size(); i++)
        {
            jsonTests.put(rawReadTests.get(i).toJson(JENKINS_SELECTED_METRICS));
        }

        rawReadGroup.put("tests",jsonTests);
        testGroups.put(rawReadGroup);

        JSONObject readParseGroup = new JSONObject();
        readParseGroup.put("name","Read & Parse Tests");

        jsonTests = new JSONArray();
        for (int i = 0; i < readParseTests.size(); i++)
        {
            jsonTests.put(readParseTests.get(i).toJson(JENKINS_SELECTED_METRICS));
        }

        readParseGroup.put("tests",jsonTests);
        testGroups.put(readParseGroup);

        JSONObject output = new JSONObject();
        output.put("groups",testGroups);

        String outputPath = "results.json";
        FileWriter fileWriter = new FileWriter(outputPath);
        fileWriter.write(output.toString());
        fileWriter.close();

        // Output ELK results
        outputPath = "elk_results_" + System.currentTimeMillis() + ".json";
        fileWriter = new FileWriter(outputPath);
        for (int i = 0; i < rawReadTests.size(); i++)
        {
            JSONArray testResults = rawReadTests.get(i).toFlatJson();
            for (int j = 0; j < testResults.length(); j++)
            {
                fileWriter.write(testResults.get(j).toString() + "\n");
            }
        }

        for (int i = 0; i < readParseTests.size(); i++)
        {
            JSONArray testResults = readParseTests.get(i).toFlatJson();
            for (int j = 0; j < testResults.length(); j++)
            {
                fileWriter.write(testResults.get(j).toString() + "\n");
            }
        }

        fileWriter.close();
    }

    public void readRawFileData(HPCCFile file, List<IMetric> metrics) throws Exception
    {
        if (file == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }

        DataPartition[] fileParts = file.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = file.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() == 0)
        {
            Assert.fail("Invalid or null record definition");
        }

        byte[] buffer = new byte[4 * 1024 * 1024];

        for (int i = 0; i < fileParts.length; i++)
        {
            RowServiceInputStream inputStream = new RowServiceInputStream(fileParts[i],originalRD,originalRD,120,-1);

            boolean hasMoreData = inputStream.available() > 0;
            if (hasMoreData == false)
            {
                inputStream.mark(2);
                int nextByte = inputStream.read();
                inputStream.reset();

                hasMoreData = nextByte >= 0;
            }

            while (hasMoreData)
            {
                int bytesToRead = inputStream.available();
                if (bytesToRead > buffer.length)
                {
                    bytesToRead = buffer.length;
                }
                inputStream.read(buffer,0,bytesToRead);

                try
                {
                    hasMoreData = inputStream.available() > 0;
                }
                catch(Exception e)
                {
                    hasMoreData = false;
                }

                if (hasMoreData == false)
                {
                    inputStream.mark(2);
                    int nextByte = inputStream.read();
                    inputStream.reset();

                    hasMoreData = nextByte >= 0;
                }
            }

            metrics.addAll(inputStream.getMetrics());
            inputStream.close();
        }
    }

    public int readFileSerially(HPCCFile file, List<IMetric> metrics) throws Exception
    {
        if (file == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }

        DataPartition[] fileParts = file.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = file.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() == 0)
        {
            Assert.fail("Invalid or null record definition");
        }

        int recordCount = 0;
        for (int i = 0; i < fileParts.length; i++)
        {
            HpccRemoteFileReader<HPCCRecord> fileReader = null;
            try
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
                fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[i], originalRD, recordBuilder);
            }
            catch (Exception e)
            {
                Throwable cause = e.getCause();
                if (cause instanceof  HpccFileException)
                {
                    if (cause.getCause() instanceof java.net.SocketTimeoutException)
                        Assert.fail("File Read failed due to connect timeout, if filepart location is on an unreachable ip consider setting up a cluster remapper");
                }

                Assert.fail("Error constructing reader: " + e.getMessage());
            }

            while (fileReader.hasNext())
            {
                HPCCRecord record = fileReader.next();
                if (record == null)
                {
                    Assert.fail("Received null record during read");
                }
                else
                {
                    recordCount++;
                }
            }

            metrics.addAll(fileReader.getInputStream().getMetrics());
            fileReader.close();
        }

        return recordCount;
    }

    public int readFileInParallel(HPCCFile file, int numThreads) throws Exception
    {
        if (file == null)
        {
            Assert.fail("HPCCFile construction failed.");
        }

        DataPartition[] fileParts = file.getFileParts();
        if (fileParts == null || fileParts.length == 0)
        {
            Assert.fail("No file parts found");
        }

        FieldDef originalRD = file.getRecordDefinition();
        if (originalRD == null || originalRD.getNumDefs() == 0)
        {
            Assert.fail("Invalid or null record definition");
        }

        int currentFilePartIndex = 0;
        Integer[] recordCounts = new Integer[fileParts.length];
        for (int i = 0; i < fileParts.length; i++)
        {
            recordCounts[i] = new Integer(0);
        }

        int numReadingRounds = (fileParts.length + (numThreads-1)) / numThreads;
        for (int round = 0; round < numReadingRounds; round++)
        {
            int numFilePartsRemaining = fileParts.length - currentFilePartIndex;
            int filePartsToRead = numThreads;
            if (filePartsToRead > numFilePartsRemaining)
            {
                filePartsToRead = numFilePartsRemaining;
            }

            Thread[] currentThreads = new Thread[numThreads];
            for (int threadNum = 0; threadNum < filePartsToRead; threadNum++, currentFilePartIndex++)
            {
                final int filePartIndex = currentFilePartIndex;
                Runnable threadTask = new Runnable()
                {
                    DataPartition filePart = fileParts[filePartIndex];
                    Integer filePartRecordCount = 0;
                    FieldDef recordDefinition = originalRD;
                    public void run()
                    {
                        HpccRemoteFileReader<HPCCRecord> fileReader = null;
                        try
                        {
                            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(recordDefinition);
                            fileReader = new HpccRemoteFileReader<HPCCRecord>(filePart, recordDefinition, recordBuilder);
                        }
                        catch (Exception e)
                        {
                            Throwable cause = e.getCause();
                            if (cause instanceof  HpccFileException)
                            {
                                if (cause.getCause() instanceof java.net.SocketTimeoutException)
                                    Assert.fail("File Read failed due to connect timeout, if filepart location is on an unreachable ip consider setting up a cluster remapper");
                            }

                            Assert.fail("Error constructing reader: " + e.getMessage());
                        }
                        while (fileReader.hasNext())
                        {
                            HPCCRecord record = fileReader.next();
                            if (record == null)
                            {
                                Assert.fail("Received null record during read");
                            }

                            filePartRecordCount++;
                        }

                        recordCounts[filePartIndex] = filePartRecordCount;
                        try
                        {
                            fileReader.close();
                        }
                        catch (Exception e){}
                    }
                };

                currentThreads[threadNum] = new Thread(threadTask);
                currentThreads[threadNum].start();
            }

            for (int threadNum = 0; threadNum < filePartsToRead; threadNum++)
            {
                currentThreads[threadNum].join();
            }
        }

        int recordCount = 0;
        for (int i = 0; i < recordCounts.length; i++)
        {
            recordCount += recordCounts[i];
        }

        return recordCount;
    }

    @After
    public void shutdown()
    {

    }
}
