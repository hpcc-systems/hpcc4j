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

import org.hpccsystems.dfs.client.HPCCFile;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.DataPartition;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class DFSBenchmarkTest extends BaseRemoteTest
{
    private static final String[] datasets = {"benchmark::integer::100mb","benchmark::string::100mb","benchmark::varstring::100mb","benchmark::utf8::100mb",
                                            "benchmark::unicode::100mb","benchmark::real::100mb","benchmark::decimal::100mb"};
    private static final float[] minDatasetConstructionEfficiency = {0.90f,0.90f,0.90f,0.90f,0.90f,0.90f,0.90f};

    @Test
    public void integrationReadBenchmark() throws Exception
    {
        int numReadSamples = 5;
        for (int i = 0; i < datasets.length; i++)
        {
            HPCCFile file = new HPCCFile(datasets[i], connString , hpccUser, hpccPass);
            file.setFileAccessExpirySecs(1000);

            // Raw streaming
            ArrayList<Float> rawReadTimes = new ArrayList<Float>(numReadSamples);
            for (int j = 0; j < numReadSamples; j++)
            {
                long startTime = System.currentTimeMillis();
                try
                {
                    readRawFileData(file);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }

                long endTime = System.currentTimeMillis();

                float timeInSeconds = (endTime - startTime);
                timeInSeconds /= 1000.0;
                rawReadTimes.add(new Float(timeInSeconds));
            }

            // Remove longest sample (Remove long samples due to wwarmup)
            Float longestSample = rawReadTimes.get(0);
            int sampleToRemove = 0;
            for (int j = 0; j < rawReadTimes.size(); j++)
            {
                Float currentReadSample = rawReadTimes.get(j);
                if (longestSample < currentReadSample)
                {
                    longestSample = currentReadSample;
                    sampleToRemove = j;
                }
            }
            rawReadTimes.remove(sampleToRemove);
            System.out.println("Removing longest sample: " + longestSample + " due to warm up.");

            float avgRawReadTime = 0;
            for (int j = 0; j < rawReadTimes.size(); j++)
            {
                avgRawReadTime += rawReadTimes.get(j);
            }
            avgRawReadTime /= rawReadTimes.size();

            ArrayList<Float> serialReadTimes = new ArrayList<Float>(numReadSamples);
            for (int j = 0; j < numReadSamples; j++)
            {
                long startTime = System.currentTimeMillis();
                try
                {
                    readFileSerially(file);
                }
                catch(Exception e)
                {
                    Assert.fail(e.getMessage());
                }

                long endTime = System.currentTimeMillis();

                float timeInSeconds = (endTime - startTime);
                timeInSeconds /= 1000.0;
                serialReadTimes.add(new Float(timeInSeconds));
            }

            // Remove longest sample (Remove long samples due to wwarmup)
            longestSample = serialReadTimes.get(0);
            sampleToRemove = 0;
            for (int j = 0; j < serialReadTimes.size(); j++)
            {
                Float currentReadSample = serialReadTimes.get(j);
                if (longestSample < currentReadSample)
                {
                    longestSample = currentReadSample;
                    sampleToRemove = j;
                }
            }
            serialReadTimes.remove(sampleToRemove);
            System.out.println("Removing longest sample: " + longestSample + " due to warm up.");

            float avgSerialReadTime = 0;
            for (int j = 0; j < serialReadTimes.size(); j++)
            {
                avgSerialReadTime += serialReadTimes.get(j);
            }
            avgSerialReadTime /= serialReadTimes.size();

            float recordConstructionEfficiency = avgRawReadTime / avgSerialReadTime;
            if (recordConstructionEfficiency < minDatasetConstructionEfficiency[i])
            {
                Assert.fail("Record construction efficiency lower than expected for dataset: " 
                    + datasets[i] + " min efficiency: " + minDatasetConstructionEfficiency[i]
                    + " benchmarked efficiency: " + recordConstructionEfficiency);
            }
            System.out.println("Record construction efficiency: " + recordConstructionEfficiency + " for: " + datasets[i]);
        }
    }

    public void readRawFileData(HPCCFile file) throws Exception
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
            if (hasMoreData == false) {
                inputStream.mark(2);
                int nextByte = inputStream.read();
                inputStream.reset();

                hasMoreData = nextByte >= 0;
            }

            while (hasMoreData)
            {
                inputStream.read(buffer,0,inputStream.available()); 

                hasMoreData = inputStream.available() > 0;
                if (hasMoreData == false) {
                    inputStream.mark(2);
                    int nextByte = inputStream.read();
                    inputStream.reset();

                    hasMoreData = nextByte >= 0;
                }
            }
        }

    }

    public int readFileSerially(HPCCFile file) throws Exception
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
            int filePartRecordCount = 0;
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
                    filePartRecordCount++;
                }
            }
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
