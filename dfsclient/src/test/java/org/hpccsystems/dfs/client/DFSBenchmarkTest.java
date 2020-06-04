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

import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileWriter;

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;

import org.json.JSONObject;
import org.json.JSONArray;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import org.hpccsystems.commons.benchmarking.BenchmarkResult;
import org.hpccsystems.commons.benchmarking.BenchmarkParam;
import org.hpccsystems.commons.benchmarking.AveragedMetric;

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

    private static final String FIRST_BYTE_TIME_METRIC = "prefetchFirstByteTime";
    private static final String WAIT_TIME_METRIC = "parseWaitTime";
    private static final String MUTEX_WAIT_TIME_METRIC = "mutexWaitTime";
    private static final String SLEEP_TIME_METRIC = "prefetchSleepTime";

    private static final String FETCH_START_TIME_METRIC = "fetchRequestStartTime";
    private static final String FETCH_TIME_METRIC = "fetchRequestReadTime";
    private static final String FETCH_FINISH_TIME_METRIC = "fetchRequestFinishTime";
    private static final String CLOSE_TIME_METRIC = "connectionCloseTime";

    private static final String LONG_WAITS_METRIC = "numLongWaits";
    private static final String FETCHES_METRIC = "numFetches";
    private static final String PARTIAL_BLOCK_READS_RATIO = "partialReads";

    private static final String[] JENKINS_SELECTED_METRICS = {BANDWIDTH_METRIC, WAIT_TIME_METRIC, SLEEP_TIME_METRIC};

    @Test
    public void readBenchmarks() throws Exception
    {
        System.out.println("Starting Raw Read Tests");
        System.out.println("-------------------------------------------------------------");
        
        ArrayList<BenchmarkResult> rawReadTests = new ArrayList<BenchmarkResult>();
        int numReadSamples = 5;
        for (int i = 0; i < datasets.length; i++)
        {
            System.out.print(datasets[i] + " samples: [");

            BenchmarkResult result = new BenchmarkResult("Raw Read Tests", "read::" + datasets[i]);
            rawReadTests.add(result);

            result.addParameter(new BenchmarkParam("dataset",datasets[i]));

            result.addMetric(new AveragedMetric(READ_TIME_METRIC,"s"));
            result.addMetric(new AveragedMetric(BANDWIDTH_METRIC,"mb/s"));

            result.addMetric(new AveragedMetric(FIRST_BYTE_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(WAIT_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(MUTEX_WAIT_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(SLEEP_TIME_METRIC,"ms"));

            result.addMetric(new AveragedMetric(FETCH_START_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(FETCH_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(FETCH_FINISH_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(CLOSE_TIME_METRIC,"ms"));

            result.addMetric(new AveragedMetric(LONG_WAITS_METRIC));
            result.addMetric(new AveragedMetric(FETCHES_METRIC));
            result.addMetric(new AveragedMetric(PARTIAL_BLOCK_READS_RATIO,"%"));

            // Raw streaming
            for (int j = 0; j < numReadSamples; j++)
            {
                System.out.print(" " + j);
                HPCCFile file = new HPCCFile(datasets[i], connString, hpccUser, hpccPass);
                file.setFileAccessExpirySecs(1000);

                try
                {
                    readRawFileData(file,result);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }
            }

            System.out.println(" ]");
        }

        System.out.println("\nStarting Read & Parse Tests");
        System.out.println("-------------------------------------------------------------");

        ArrayList<BenchmarkResult> readParseTests = new ArrayList<BenchmarkResult>();
        for (int i = 0; i < datasets.length; i++)
        {
            System.out.print(datasets[i] + " samples: [");

            BenchmarkResult result = new BenchmarkResult("Read & Parse Tests","read_parse::" + datasets[i]);
            result.addParameter(new BenchmarkParam("dataset",datasets[i]));

            result.addMetric(new AveragedMetric(READ_TIME_METRIC,"s"));
            result.addMetric(new AveragedMetric(BANDWIDTH_METRIC,"mb/s"));
            result.addMetric(new AveragedMetric(RPS_METRIC,"rec/s"));

            result.addMetric(new AveragedMetric(FIRST_BYTE_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(WAIT_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(MUTEX_WAIT_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(SLEEP_TIME_METRIC,"ms"));

            result.addMetric(new AveragedMetric(FETCH_START_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(FETCH_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(FETCH_FINISH_TIME_METRIC,"ms"));
            result.addMetric(new AveragedMetric(CLOSE_TIME_METRIC,"ms"));

            result.addMetric(new AveragedMetric(LONG_WAITS_METRIC));
            result.addMetric(new AveragedMetric(FETCHES_METRIC));
            result.addMetric(new AveragedMetric(PARTIAL_BLOCK_READS_RATIO,"%"));

            // Raw streaming
            for (int j = 0; j < numReadSamples; j++)
            {
                System.out.print(" " + j);
                HPCCFile file = new HPCCFile(datasets[i], connString, hpccUser, hpccPass);
                file.setFileAccessExpirySecs(1000);

                try
                {
                    readFileSerially(file,result);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }
            }

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
        JSONArray elkResults = new JSONArray();
        for (int i = 0; i < rawReadTests.size(); i++)
        {
            JSONArray testResults = rawReadTests.get(i).toFlatJson();
            for (int j = 0; j < testResults.length(); j++)
            {
                elkResults.put(testResults.get(j));
            }
        }

        for (int i = 0; i < readParseTests.size(); i++)
        {
            JSONArray testResults = readParseTests.get(i).toFlatJson();
            for (int j = 0; j < testResults.length(); j++)
            {
                elkResults.put(testResults.get(j));
            }
        }

        outputPath = "elk_results.json";
        fileWriter = new FileWriter(outputPath);
        fileWriter.write(elkResults.toString());
        fileWriter.close();
    }

    public long readRawFileData(HPCCFile file, BenchmarkResult result) throws Exception
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

        long bytesRead = 0;
        long firstByteTimeNS = 0;
        long waitTimeNS = 0;
        long mutexWaitTimeNS = 0;
        long sleepTimeNS = 0;
        long fetchStartTimeNS = 0;
        long fetchTimeNS = 0;
        long fetchFinishTimeNS = 0;
        long closeTimeNS = 0;
        long numLongWaits = 0;
        long numFetches = 0;
        long numPartialBlockReads = 0;
        long numBlockReads = 0;

        byte[] buffer = new byte[4 * 1024 * 1024];

        long startTime = System.currentTimeMillis();
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
                if (bytesToRead > buffer.length) {
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

            inputStream.close();

            bytesRead += inputStream.getBytesRead();
            firstByteTimeNS += inputStream.getFirstByteTimeNS();
            waitTimeNS += inputStream.getWaitTimeNS();
            mutexWaitTimeNS += inputStream.getMutexWaitTimeNS();
            sleepTimeNS += inputStream.getSleepTimeNS();
            fetchStartTimeNS += inputStream.getFetchStartTimeNS();
            fetchTimeNS += inputStream.getFetchTimeNS();
            fetchFinishTimeNS += inputStream.getFetchFinishTimeNS();
            closeTimeNS += inputStream.getCloseTimeNS();
            numLongWaits += inputStream.getNumLongWaits();
            numFetches += inputStream.getNumFetches();
            numPartialBlockReads += inputStream.getNumPartialBlockReads();
            numBlockReads += inputStream.getNumBlockReads();
        }

        long endTime = System.currentTimeMillis();
        float timeInSeconds = (endTime - startTime) / 1000.0f;
        result.getMetric(READ_TIME_METRIC).addDataPoint(timeInSeconds);

        float bandwidthMBs = bytesRead / (1000 * 1000 * timeInSeconds);
        result.getMetric(BANDWIDTH_METRIC).addDataPoint(bandwidthMBs);

        // This is the avg time to first byte per file part
        final float NS_TO_MS = 1 / (1000.0f * 1000.0f); 
        float firstByteTimeMS = firstByteTimeNS * NS_TO_MS / fileParts.length;
        result.getMetric(FIRST_BYTE_TIME_METRIC).addDataPoint(firstByteTimeMS);

        float waitTimeMS = waitTimeNS * NS_TO_MS;
        result.getMetric(WAIT_TIME_METRIC).addDataPoint(waitTimeMS);

        float mutexWaitTimeMS = mutexWaitTimeNS * NS_TO_MS;
        result.getMetric(MUTEX_WAIT_TIME_METRIC).addDataPoint(mutexWaitTimeMS);

        float sleepTimeMS = sleepTimeNS * NS_TO_MS;
        result.getMetric(SLEEP_TIME_METRIC).addDataPoint(sleepTimeMS);

        float fetchStartTimeMS = fetchStartTimeNS * NS_TO_MS;
        result.getMetric(FETCH_START_TIME_METRIC).addDataPoint(fetchStartTimeMS);
        
        float fetchTimeMS = fetchTimeNS * NS_TO_MS;
        result.getMetric(FETCH_TIME_METRIC).addDataPoint(fetchTimeMS);

        float fetchFinishTimeMS = fetchFinishTimeNS * NS_TO_MS;
        result.getMetric(FETCH_FINISH_TIME_METRIC).addDataPoint(fetchFinishTimeMS);

        float closeTimeMS = closeTimeNS * NS_TO_MS;
        result.getMetric(CLOSE_TIME_METRIC).addDataPoint(closeTimeMS);

        result.getMetric(LONG_WAITS_METRIC).addDataPoint((float)numLongWaits);
        result.getMetric(FETCHES_METRIC).addDataPoint((float)numFetches);

        float partialReadsPercent = (numPartialBlockReads * 100.0f) / numBlockReads;
        result.getMetric(PARTIAL_BLOCK_READS_RATIO).addDataPoint(partialReadsPercent);
        

        return bytesRead;
    }

    public int readFileSerially(HPCCFile file, BenchmarkResult result) throws Exception
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

        long startTime = System.currentTimeMillis();
        int recordCount = 0;
        long bytesRead = 0;

        long firstByteTimeNS = 0;
        long waitTimeNS = 0;
        long mutexWaitTimeNS = 0;
        long sleepTimeNS = 0;
        long fetchStartTimeNS = 0;
        long fetchTimeNS = 0;
        long fetchFinishTimeNS = 0;
        long closeTimeNS = 0;
        long numLongWaits = 0;
        long numFetches = 0;
        long numPartialBlockReads = 0;
        long numBlockReads = 0;

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
            fileReader.close();

            bytesRead += fileReader.getInputStream().getBytesRead();
            firstByteTimeNS += fileReader.getInputStream().getFirstByteTimeNS();
            waitTimeNS += fileReader.getInputStream().getWaitTimeNS();
            mutexWaitTimeNS += fileReader.getInputStream().getMutexWaitTimeNS();
            sleepTimeNS += fileReader.getInputStream().getSleepTimeNS();
            fetchStartTimeNS += fileReader.getInputStream().getFetchStartTimeNS();
            fetchTimeNS += fileReader.getInputStream().getFetchTimeNS();
            fetchFinishTimeNS += fileReader.getInputStream().getFetchFinishTimeNS();
            closeTimeNS += fileReader.getInputStream().getCloseTimeNS();
            numLongWaits += fileReader.getInputStream().getNumLongWaits();
            numFetches += fileReader.getInputStream().getNumFetches();
            numPartialBlockReads += fileReader.getInputStream().getNumPartialBlockReads();
            numBlockReads += fileReader.getInputStream().getNumBlockReads();
        }

        long endTime = System.currentTimeMillis();
        float timeInSeconds = (endTime - startTime) / 1000.0f;
        result.getMetric(READ_TIME_METRIC).addDataPoint(timeInSeconds);

        float bandwidthMBs = bytesRead / (1000 * 1000 * timeInSeconds);
        result.getMetric(BANDWIDTH_METRIC).addDataPoint(bandwidthMBs);

        float rps = recordCount / timeInSeconds;
        result.getMetric(RPS_METRIC).addDataPoint(rps);

        // This is the avg time to first byte per file part
        final float NS_TO_MS = 1 / (1000.0f * 1000.0f); 
        float firstByteTimeMS = firstByteTimeNS * NS_TO_MS / fileParts.length;
        result.getMetric(FIRST_BYTE_TIME_METRIC).addDataPoint(firstByteTimeMS);

        float waitTimeMS = waitTimeNS * NS_TO_MS;
        result.getMetric(WAIT_TIME_METRIC).addDataPoint(waitTimeMS);

        float mutexWaitTimeMS = mutexWaitTimeNS * NS_TO_MS;
        result.getMetric(MUTEX_WAIT_TIME_METRIC).addDataPoint(mutexWaitTimeMS);

        float sleepTimeMS = sleepTimeNS * NS_TO_MS;
        result.getMetric(SLEEP_TIME_METRIC).addDataPoint(sleepTimeMS);

        float fetchStartTimeMS = fetchStartTimeNS * NS_TO_MS;
        result.getMetric(FETCH_START_TIME_METRIC).addDataPoint(fetchStartTimeMS);
        
        float fetchTimeMS = fetchTimeNS * NS_TO_MS;
        result.getMetric(FETCH_TIME_METRIC).addDataPoint(fetchTimeMS);

        float fetchFinishTimeMS = fetchFinishTimeNS * NS_TO_MS;
        result.getMetric(FETCH_FINISH_TIME_METRIC).addDataPoint(fetchFinishTimeMS);

        float closeTimeMS = closeTimeNS * NS_TO_MS;
        result.getMetric(CLOSE_TIME_METRIC).addDataPoint(closeTimeMS);

        result.getMetric(LONG_WAITS_METRIC).addDataPoint((float)numLongWaits);
        result.getMetric(FETCHES_METRIC).addDataPoint((float)numFetches);

        float partialReadsPercent = (numPartialBlockReads * 100.0f) / numBlockReads;
        result.getMetric(PARTIAL_BLOCK_READS_RATIO).addDataPoint(partialReadsPercent);
        
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
