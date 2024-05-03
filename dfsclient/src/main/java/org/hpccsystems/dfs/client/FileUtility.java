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

package org.hpccsystems.dfs.client;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.hpccsystems.commons.ecl.FieldDef;
import org.json.JSONArray;
import org.json.JSONObject;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.utils.Connection;

import org.hpccsystems.dfs.cluster.*;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;
import org.hpccsystems.commons.errors.HpccFileException;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;

public class FileUtility
{
    // This value represents the maximum number of splits that will be created during
    // the reading process to allow for redistribution of clusters of varying sizes
    // IE: A 4GB file part will be redistributable in approximately 32MB blocks.
    private static final int DEFAULT_SPLIT_TABLE_SIZE = 128;

    private static final int NUM_DEFAULT_THREADS = 4;
    static private final int DEFAULT_ACCESS_EXPIRY_SECONDS = 120;

    private static class TaskContext
    {
        public AtomicLong recordsRead = new AtomicLong(0);
        public AtomicLong recordsWritten = new AtomicLong(0);

        public AtomicLong bytesRead = new AtomicLong(0);
        public AtomicLong bytesWritten = new AtomicLong(0);

        private List<String> errorMessages = new ArrayList<String>();
        private List<String> warnMessages = new ArrayList<String>();

        private String currentOperationDesc = "";
        private long operationStart = 0;
        private List<JSONObject> operationResults = new ArrayList<JSONObject>();

        public boolean hasError()
        {
            boolean err = false;
            synchronized(errorMessages)
            {
                err = errorMessages.size() > 0;
            }

            return err;
        }

        public void addError(String error)
        {
            synchronized(errorMessages)
            {
                errorMessages.add(error);
            }
        }

        public void addWarn(String warn)
        {
            synchronized(warnMessages)
            {
                warnMessages.add(warn);
            }
        }

        public void clear()
        {
            currentOperationDesc = "";
            operationStart = 0;
            recordsRead.set(0);
            recordsWritten.set(0);

            bytesRead.set(0);
            bytesWritten.set(0);

            errorMessages.clear();
            warnMessages.clear();
        }

        public boolean hasOperation()
        {
            return !currentOperationDesc.isEmpty();
        }

        public void startOperation(String operationName)
        {
            clear();
            currentOperationDesc = operationName;
            operationStart = System.nanoTime();
        }

        public void endOperation()
        {
            endOperation(true);
        }

        public void endOperation(boolean success)
        {
            if (!hasOperation())
            {
                return;
            }

            long totalOperationTime = System.nanoTime();
            totalOperationTime -= operationStart;

            double timeInSeconds = (double) totalOperationTime / 1_000_000_000.0;

            JSONObject results = new JSONObject();

            results.put("operation", currentOperationDesc);
            results.put("successful", success);

            JSONArray errors = new JSONArray();
            for (String err : errorMessages)
            {
                errors.put(err);
            }
            results.put("errors", errors);

            JSONArray warns = new JSONArray();
            for (String warn : warnMessages)
            {
                warns.put(warn);
            }
            results.put("warns", warns);

            results.put("bytesWritten", bytesWritten.get());
            results.put("recordsWritten", recordsWritten.get());

            results.put("bytesRead", bytesRead.get());
            results.put("recordsRead", recordsRead.get());

            results.put("time", String.format("%.2f s",timeInSeconds));

            double readBandwidth = (double) bytesRead.get() / (1_000_000.0 * timeInSeconds);
            results.put("Read Bandwidth", String.format("%.2f MB/s", readBandwidth));

            double writeBandwidth = (double) bytesWritten.get() / (1_000_000.0 * timeInSeconds);
            results.put("Write Bandwidth", String.format("%.2f MB/s", writeBandwidth));

            operationResults.add(results);

            clear();
        }

        public JSONArray generateResultsMessage()
        {
            JSONArray results = new JSONArray();
            for (JSONObject result : operationResults)
            {
                results.put(result);
            }

            return results;
        }
    };

    private static enum FileFormat
    {
        THOR,
        PARQUET
    };

    private static class SplitEntry
    {
        public long recordCount = 0;
        public long splitStart = 0;
        public long splitEnd = 0;

        public JSONObject toJson()
        {
            JSONObject res = new JSONObject();
            res.put("recordCount", recordCount);
            res.put("splitStart", splitStart);
            res.put("splitEnd", splitEnd);

            return res;
        }

        public static SplitEntry fromJson(JSONObject json) throws IOException
        {
            SplitEntry split = new SplitEntry();
            split.recordCount = json.getLong("recordCount");
            split.splitStart = json.getLong("splitStart");
            split.splitEnd = json.getLong("splitEnd");

            return split;
        }
    }

    private static class SplitTable
    {
        public List<SplitEntry> splits = new ArrayList<SplitEntry>();
        private long splitStride = 1;
        private int maxSplitEntries = DEFAULT_SPLIT_TABLE_SIZE;
        private SplitEntry currentSplit = new SplitEntry();

        public SplitTable(int maxSplits)
        {
            maxSplitEntries = maxSplits;
            if (maxSplitEntries % 2 == 1)
            {
                maxSplitEntries++;
            }
        }

        public void addRecordPosition(long fileOffset)
        {
            if (currentSplit.recordCount == splitStride)
            {
                currentSplit.splitEnd = fileOffset;
                splits.add(currentSplit);

                currentSplit = new SplitEntry();
                currentSplit.splitStart = fileOffset;
            }

            if (splits.size() == maxSplitEntries)
            {
                compactSplitTable();
            }

            currentSplit.recordCount++;
        }

        public void finish(long fileSize)
        {
            currentSplit.splitEnd = fileSize;
            splits.add(currentSplit);
        }

        private void compactSplitTable()
        {
            splitStride *= 2;

            List<SplitEntry> newSplits = new ArrayList<SplitEntry>();
            for (int i = 0; i < splits.size(); i+=2)
            {
                SplitEntry first = splits.get(i);
                SplitEntry second = splits.get(i+1);

                SplitEntry combined = new SplitEntry();
                combined.splitStart = first.splitStart;
                combined.splitEnd = second.splitEnd;
                combined.recordCount = first.recordCount + second.recordCount;

                newSplits.add(combined);
            }

            splits = newSplits;
        }

        public JSONObject toJson()
        {
            JSONObject res = new JSONObject();
            res.put("splitStride", splitStride);
            res.put("maxSplitEntries", maxSplitEntries);

            JSONArray splitsJson = new JSONArray();
            for (int i = 0; i < splits.size(); i++)
            {
                splitsJson.put(splits.get(i).toJson());
            }

            res.put("splits", splitsJson);
            return res;
        }

        public static SplitTable fromJson(JSONObject json) throws IOException
        {
            int maxSplits = json.getInt("maxSplitEntries");
            SplitTable table = new SplitTable(maxSplits);

            table.splitStride = json.getLong("splitStride");
            JSONArray splitsJson = json.getJSONArray("splits");
            if (splitsJson != null)
            {
                for (int i = 0; i < splitsJson.length(); i++)
                {
                    table.splits.add(SplitEntry.fromJson(splitsJson.getJSONObject(i)));
                }
            }

            return table;
        }
    }

    private static class SplitFile
    {
        private List<SplitTable> splitTables = new ArrayList<SplitTable>();

        public SplitFile()
        {
        }

        public SplitFile(SplitTable[] tables)
        {
            splitTables.addAll(Arrays.asList(tables));
        }

        public SplitTable[] getSplitTableArray()
        {
            return splitTables.toArray(new SplitTable[0]);
        }

        public void load(FileInputStream inStream) throws IOException
        {
            long fileSize = inStream.getChannel().size();
            if (fileSize > Integer.MAX_VALUE)
            {
                throw new IOException("Error: Input file is too large to load.");
            }

            byte[] byteData = new byte[(int) fileSize];
            inStream.read(byteData);

            String jsonStr = new String(byteData, StandardCharsets.UTF_8);
            JSONObject data = new JSONObject(jsonStr);

            int version = data.getInt("version");
            if (version != 0)
            {
                throw new IOException("Error: Unsupported file format version: " + version + ", halting file load.");
            }

            JSONArray jsonSplitTables = data.getJSONArray("tables");
            if (jsonSplitTables != null)
            {
                for (int i = 0; i < jsonSplitTables.length(); i++)
                {
                    splitTables.add(SplitTable.fromJson(jsonSplitTables.getJSONObject(i)));
                }
            }
        }

        public void save(OutputStream outStream) throws IOException
        {
            JSONObject data = new JSONObject();

            JSONArray splitTablesJson = new JSONArray();
            for (int i = 0; i < splitTables.size(); i++)
            {
                splitTablesJson.put(splitTables.get(i).toJson());
            }

            data.put("version", 0);
            data.put("tables", splitTablesJson);

            byte[] byteData = data.toString().getBytes(StandardCharsets.UTF_8);

            outStream.write(byteData);
        }
    }

    private static Options getReadOptions()
    {
        Options options = new Options();
        options.addRequiredOption("url", "Source Cluster URL", true, "Specifies the URL of the ESP to connect to.");
        options.addOption("user", true, "Specifies the username used to connect. Defaults to null.");
        options.addOption("pass", true, "Specifies the password used to connect. Defaults to null.");
        options.addOption("format", true, "Specifies the output format to be used when writing files to disk. Defaults to Thor files.");
        options.addOption("num_threads", true, "Specifies the number of parallel to use to perform operations.");
        options.addOption("out", true, "Specifies the directory that the files should be written to.");

        options.addOption(Option.builder("read")
                                .argName("files")
                                .hasArgs()
                                .valueSeparator(',')
                                .desc("Reads the specified file(s) and writes a copy of the files to the local directory")
                                .required(true)
                                .build());
        return options;
    }

    private static Options getReadTestOptions()
    {
        Options options = new Options();
        options.addRequiredOption("read_test", "Read test", true, "Specifies the file that should be read.");
        options.addRequiredOption("url", "Source Cluster URL", true, "Specifies the URL of the ESP to connect to.");
        options.addOption("user", true, "Specifies the username used to connect. Defaults to null.");
        options.addOption("pass", true, "Specifies the password used to connect. Defaults to null.");
        options.addOption("num_threads", true, "Specifies the number of parallel to use to perform operations.");
        options.addOption("access_expiry_seconds", true, "Access token expiration seconds.");

        options.addOption(Option.builder("file_parts")
                                .argName("_file_parts")
                                .hasArgs()
                                .valueSeparator(',')
                                .desc("Specifies the file parts that should be read. Defaults to all file parts.")
                                .build());
        return options;
    }

    private static Options getCopyOptions()
    {
        Options options = new Options();
        options.addRequiredOption("url", "Source Cluster URL", true, "Specifies the URL of the ESP to read from / write to.");
        options.addOption("user", true, "Specifies the username used to connect. Defaults to null.");
        options.addOption("pass", true, "Specifies the password used to connect. Defaults to null.");
        options.addRequiredOption("dest_cluster", "Destination Cluster Name", true, "Specifies the name of the cluster to write files back to.");
        options.addOption("dest_url", "Destination Cluster URL", true, "Specifies the URL of the ESP to write to.");
        options.addOption("num_threads", true, "Specifies the number of parallel to use to perform operations.");

        options.addOption(Option.builder("copy")
                                .argName("files")
                                .hasArgs()
                                .valueSeparator(' ')
                                .desc("Copies the specified remote source file to the specified remote destination cluster / file.")
                                .required(true)
                                .build());

        return options;
    }

    private static Options getWriteOptions()
    {
        Options options = new Options();
        options.addRequiredOption("url", "Source Cluster URL", true, "Specifies the URL of the ESP to read from / write to.");
        options.addOption("user", true, "Specifies the username used to connect. Defaults to null.");
        options.addOption("pass", true, "Specifies the password used to connect. Defaults to null.");
        options.addOption("dest_url", "Destination Cluster URL", true, "Specifies the URL of the ESP to write to.");
        options.addRequiredOption("dest_cluster", "Destination Cluster Name", true, "Specifies the name of the cluster to write files back to.");
        options.addOption("num_threads", true, "Specifies the number of parallel to use to perform operations.");

        options.addOption(Option.builder("write")
                                .argName("files")
                                .hasArgs()
                                .valueSeparator(' ')
                                .desc("Write the specified local files to the specified remote destination cluster / file.")
                                .required(true)
                                .build());

        return options;
    }

    private static Options getTopLevelOptions()
    {
        Options options = new Options();
        options.addOption("read", "Reads the specified file(s) and writes a copy of the files to the local directory.");
        options.addOption("read_test", "Reads the specified file and/or particular file parts without writing it locally.");
        options.addOption("copy", "Copies the specified remote source file to the specified remote destination cluster / file.");
        options.addOption("write", "Writes the specified local source file to the specified remote destination cluster / file.");

        return options;
    }

    public static String[] findFilesMatching(String filePath) throws Exception
    {
        boolean isWildcard = filePath.endsWith("*");
        if (!isWildcard)
        {
            File file = new File(filePath);
            if (!file.exists())
            {
                throw new Exception("File path is invalid: " + filePath);
            }

            String[] res = {filePath};
            return res;
        }

        int indexOfSep = filePath.lastIndexOf(File.separator)+1;
        String dirStr = filePath.substring(0,indexOfSep);
        String filePattern = filePath.substring(indexOfSep,filePath.length()-1);

        File dir = new File(dirStr);
        if (!dir.isDirectory() || !dir.exists())
        {
            throw new Exception("File path is invalid: " + filePath);
        }

        List<String> result = new ArrayList<String>();
        for(File file : dir.listFiles())
        {
            String name = file.getName();
            boolean startsWithPattern = name.startsWith(filePattern);
            if (startsWithPattern)
            {
                result.add(file.getAbsolutePath());
            }
        }

        return result.toArray(new String[0]);
    }

    private static FileFormat getFormat(String[] srcFiles) throws Exception
    {
        return FileFormat.THOR;
    }

    private static String getFormatExtension(FileFormat format)
    {
        return "";
    }

    private static FieldDef getRecordDefinition(String[] srcFiles, FileFormat format) throws Exception
    {
        switch (format)
        {
            case THOR:
            {
                String metaFile = null;
                for (int i = 0; i < srcFiles.length; i++)
                {
                    String file = srcFiles[i].toLowerCase();
                    if (file.endsWith(".meta"))
                    {
                        metaFile = file;
                    }
                }

                if (metaFile == null)
                {
                    throw new Exception("Unable to find Thor meta-data file.");
                }

                byte[] metaData = Files.readAllBytes(Paths.get(metaFile));
                String metaStr = new String(metaData, Charset.defaultCharset());

                JSONObject metaJson = new JSONObject(metaStr);
                return RecordDefinitionTranslator.parseJsonRecordDefinition(metaJson);
            }
            case PARQUET:
            default:
                throw new Exception("File format: " + format + " is not currently supported");
        }
    }

    private static SplitTable[] getSplitTables(String[] srcFiles, FileFormat format) throws Exception
    {
        if (format != FileFormat.THOR)
        {
            return null;
        }

        String splitFile = null;
        for (int i = 0; i < srcFiles.length; i++)
        {
            String file = srcFiles[i].toLowerCase();
            if (file.endsWith(".split"))
            {
                splitFile = file;
                break;
            }
        }

        if (splitFile == null)
        {
            return null;
        }

        FileInputStream inStream = new FileInputStream(splitFile);
        SplitFile file = new SplitFile();
        file.load(inStream);
        inStream.close();

        return file.getSplitTableArray();
    }

    private static String[] filterFilesByFormat(String[] srcFiles, FileFormat format) throws Exception
    {
        Pattern pattern = null;
        switch (format)
        {
            case THOR:
            {
                pattern = Pattern.compile("^[^\\.]*\\._[0-9]+_of_[0-9]+");
                break;
            }
            case PARQUET:
            default:
                throw new Exception("File format: " + format + " is not currently supported");
        }

        List<String> filteredFiles = new ArrayList<String>();
        for (int i = 0; i < srcFiles.length; i++)
        {
            int indexOfSep = srcFiles[i].lastIndexOf(File.separator)+1;
            String fileName = srcFiles[i].substring(indexOfSep);

            if (pattern.matcher(fileName).matches())
            {
                filteredFiles.add(srcFiles[i]);
            }
        }

        return filteredFiles.toArray(new String[0]);
    }

    private static void executeTasks(Runnable[] tasks, int numThreads) throws Exception
    {
        int numTasksPerThread = tasks.length / numThreads;
        int numResidualTasks = tasks.length % numThreads;

        int taskNum = 0;
        Thread[] taskThreads = new Thread[numThreads];
        for (int threadNum = 0; threadNum < numThreads; threadNum++)
        {
            int residualTasks = 0;
            if (threadNum < numResidualTasks)
            {
                residualTasks = 1;
            }

            final int currentTaskStart = taskNum;
            final int currentNumTasks = numTasksPerThread + residualTasks;

            taskThreads[threadNum] = new Thread(new Runnable()
            {
                Runnable[] subTasks = tasks;
                int startingSubTask = currentTaskStart;
                int numSubTasks = currentNumTasks;

                public void run()
                {
                    for (int j = 0; j < numSubTasks; j++)
                    {
                        subTasks[startingSubTask + j].run();
                    }
                }
            });

            taskNum += currentNumTasks;
            taskThreads[threadNum].start();
        }

        for (int threadNum = 0; threadNum < numThreads; threadNum++)
        {
            taskThreads[threadNum].join();
        }
    }

    private static Runnable[] createReadTestTasks(DataPartition[] fileParts, FieldDef recordDef, TaskContext context) throws Exception
    {
        Runnable[] tasks = new Runnable[fileParts.length];
        for (int i = 0; i < tasks.length; i++)
        {
            final int taskIndex = i;
            final DataPartition filePart = fileParts[taskIndex];

            tasks[taskIndex] = new Runnable()
            {
                public void run()
                {
                    try
                    {
                        HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(filePart, recordDef, new HPCCRecordBuilder(recordDef));

                        while (fileReader.hasNext())
                        {
                            HPCCRecord record = fileReader.next();
                            context.recordsRead.incrementAndGet();
                        }

                        fileReader.close();
                        context.bytesRead.addAndGet(fileReader.getStreamPosition());
                    }
                    catch (Exception e)
                    {
                        context.addError("Error while reading file part index: '" + filePart.getThisPart() + " Error message: " + e.getMessage());
                        return;
                    }
                }
            };
        }

        return tasks;
    }

    private static Runnable[] createReadToThorTasks(DataPartition[] fileParts, SplitTable[] splitTables, String[] outFilePaths, FieldDef recordDef, TaskContext context) throws Exception
    {
        Runnable[] tasks = new Runnable[fileParts.length];
        for (int i = 0; i < tasks.length; i++)
        {
            final int taskIndex = i;
            final HpccRemoteFileReader<HPCCRecord> filePartReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[taskIndex], recordDef, new HPCCRecordBuilder(recordDef));

            final String filePath = outFilePaths[taskIndex];
            final FileOutputStream outStream = new FileOutputStream(filePath);

            final BinaryRecordWriter filePartWriter = new BinaryRecordWriter(outStream);
            filePartWriter.initialize(new HPCCRecordAccessor(recordDef));

            tasks[taskIndex] = new Runnable()
            {
                HpccRemoteFileReader<HPCCRecord> fileReader = filePartReader;
                BinaryRecordWriter fileWriter = filePartWriter;
                FileOutputStream outputStream = outStream;
                SplitTable splitTable = splitTables[taskIndex];

                public void run()
                {
                    try
                    {
                        while (fileReader.hasNext())
                        {
                            splitTable.addRecordPosition(fileReader.getStreamPosition());
                            HPCCRecord record = fileReader.next();
                            fileWriter.writeRecord(record);
                            context.recordsRead.incrementAndGet();
                        }

                        splitTable.finish(fileReader.getStreamPosition());

                        fileReader.close();
                        context.bytesRead.addAndGet(fileReader.getStreamPosition());

                        fileWriter.finalize();
                        outputStream.close();
                    }
                    catch (Exception e)
                    {
                        context.addError("Error while reading file: '" + filePath + "'," + taskIndex + ": " + e.getMessage());
                        return;
                    }
                }
            };
        }

        return tasks;
    }

    private static Runnable[] createThorSplitTableTasks(String[] thorFiles, SplitTable[] splitTables, FieldDef recordDef, TaskContext context) throws Exception
    {
        Runnable[] tasks = new Runnable[thorFiles.length];
        for (int i = 0; i < tasks.length; i++)
        {
            final int taskIndex = i;
            final SplitTable splitTable = new SplitTable(DEFAULT_SPLIT_TABLE_SIZE);
            splitTables[taskIndex] = splitTable;

            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(thorFiles[taskIndex]));
            BinaryRecordReader filePartReader = new BinaryRecordReader(bufferedInputStream);
            filePartReader.initialize(new HPCCRecordBuilder(recordDef));

            tasks[taskIndex] = new Runnable()
            {
                InputStream inputStream = bufferedInputStream;
                BinaryRecordReader fileReader = filePartReader;

                public void run()
                {
                    try
                    {
                        while (fileReader.hasNext())
                        {
                            splitTable.addRecordPosition(fileReader.getStreamPosAfterLastRecord());
                            HPCCRecord record = (HPCCRecord) fileReader.getNext();
                        }

                        splitTable.finish(fileReader.getStreamPosAfterLastRecord());
                        inputStream.close();
                    }
                    catch (Exception e)
                    {
                        context.addError("Error while writing file taskIndex: " + taskIndex + " - " + e.getMessage());
                        return;
                    }
                }
            };
        }

        return tasks;
    }

    private static Runnable[] createNonRedistributingCopyTasks(HPCCFile file, DFUCreateFileWrapper createResult, TaskContext context) throws Exception
    {
        FieldDef recordDef = null;
        DataPartition[] inFileParts  = null;
        DataPartition[] outFileParts = null;

        inFileParts = file.getFileParts();
        recordDef = file.getRecordDefinition();

        DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
        NullRemapper remapper = new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo());
        outFileParts = DataPartition.createPartitions(dfuFileParts, remapper, dfuFileParts.length, createResult.getFileAccessInfoBlob());

        int incomingPerOutgoing = inFileParts.length / outFileParts.length;
        int residualIncomingFileParts = inFileParts.length % outFileParts.length;

        int incomingFilePartIndex = 0;
        Runnable[] tasks = new Runnable[outFileParts.length];
        for (int i = 0; i < tasks.length; i++)
        {
            final int taskIndex = i;

            DataPartition outFilePart = outFileParts[taskIndex];

            final int numIncomingParts = incomingPerOutgoing + ((taskIndex < residualIncomingFileParts) ? 1 : 0);
            HpccRemoteFileReader<HPCCRecord>[] filePartReaders = new HpccRemoteFileReader[numIncomingParts];

            for (int j = 0; j < numIncomingParts; j++)
            {
                DataPartition inFilePart = inFileParts[incomingFilePartIndex + j];
                filePartReaders[j] = new HpccRemoteFileReader<HPCCRecord>(inFilePart, recordDef, new HPCCRecordBuilder(recordDef));
            }
            incomingFilePartIndex += numIncomingParts;

            HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
            final HPCCRemoteFileWriter<HPCCRecord> partFileWriter = new HPCCRemoteFileWriter<HPCCRecord>(outFilePart, recordDef, recordAccessor, CompressionAlgorithm.NONE);

            tasks[taskIndex] = new Runnable()
            {
                HpccRemoteFileReader<HPCCRecord>[] fileReaders = filePartReaders;
                HPCCRemoteFileWriter<HPCCRecord> fileWriter = partFileWriter;

                public void run()
                {
                    try
                    {
                        for (int k = 0; k < fileReaders.length; k++)
                        {
                            HpccRemoteFileReader<HPCCRecord> fileReader = fileReaders[k];
                            while (fileReader.hasNext())
                            {
                                HPCCRecord record = fileReader.next();
                                fileWriter.writeRecord(record);
                                context.recordsWritten.incrementAndGet();
                                context.recordsRead.incrementAndGet();
                            }

                            fileReader.close();
                            context.bytesRead.addAndGet(fileReader.getStreamPosition());
                        }
                        System.out.println("Closing file writer for task: " + taskIndex);
                        fileWriter.close();
                        context.bytesWritten.addAndGet(fileWriter.getBytesWritten());
                    }
                    catch (Exception e)
                    {
                        context.addError("Error while copying file: '" + file.getFileName() + "'," + taskIndex + ": " + e.getMessage());
                        return;
                    }
                }
            };
        }

        return tasks;
    }

    /*
     * Redistribution notes:
     * Download file locally and build split table, or build split table if one does not exist.
     * Create write with redistribution using the split table
     */

    private static class SplitEntryMapping
    {
        int startingSrcFile = 0;
        int splitEntryStart = 0;

        int endingSrcFile = 0;
        int splitEntryEnd = 0;
    }

    private static Runnable[] createWriteTasks(String[] srcFiles, SplitTable[] splitTables, FieldDef recordDef, FileFormat format, DFUCreateFileWrapper createResult, TaskContext context) throws Exception
    {
        DataPartition[] outFileParts = null;

        DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
        NullRemapper remapper = new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo());
        outFileParts = DataPartition.createPartitions(dfuFileParts, remapper, dfuFileParts.length, createResult.getFileAccessInfoBlob());

        // Determine mapping from split entries to output file parts
        SplitEntryMapping[] srcFileToOutPartsMapping = new SplitEntryMapping[outFileParts.length];
        if (srcFiles.length != outFileParts.length)
        {
            int totalSplitEntries = 0;
            for (int i = 0; i < splitTables.length; i++)
            {
                totalSplitEntries += splitTables[i].splits.size();
            }

            int splitsPerOutFile = totalSplitEntries / outFileParts.length;
            int residualSplits = totalSplitEntries % outFileParts.length;

            int currentSrcFile = 0;
            int currentSrcFileSplitStart = 0;
            int currentSrcFileSplitEnd = splitTables[0].splits.size();
            int splitStart = 0;
            for (int i = 0; i < srcFileToOutPartsMapping.length; i++)
            {
                int numSplits = splitsPerOutFile + ((i < residualSplits ) ? 1 : 0);

                SplitEntryMapping mapping = new SplitEntryMapping();
                mapping.startingSrcFile = currentSrcFile;
                mapping.splitEntryStart = splitStart - currentSrcFileSplitStart;

                int splitEnd = splitStart + numSplits;
                while (currentSrcFileSplitEnd < splitEnd)
                {
                    currentSrcFile++;
                    currentSrcFileSplitStart = currentSrcFileSplitEnd;
                    currentSrcFileSplitEnd += splitTables[currentSrcFile].splits.size();
                }

                mapping.endingSrcFile = currentSrcFile;
                mapping.splitEntryEnd = splitEnd - currentSrcFileSplitStart;
                srcFileToOutPartsMapping[i] = mapping;

                splitStart = splitEnd;
            }
        }
        else
        {
            for (int i = 0; i < srcFileToOutPartsMapping.length; i++)
            {
                SplitEntryMapping mapping = new SplitEntryMapping();
                mapping.startingSrcFile = i;
                mapping.splitEntryStart = 0;
                mapping.endingSrcFile = i;
                mapping.splitEntryEnd = splitTables[i].splits.size();
                srcFileToOutPartsMapping[i] = mapping;
            }
        }

        Runnable[] tasks = new Runnable[outFileParts.length];
        for (int i = 0; i < tasks.length; i++)
        {
            final int taskIndex = i;

            DataPartition outFilePart = outFileParts[taskIndex];
            HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
            HPCCRemoteFileWriter<HPCCRecord> filePartWriter = new HPCCRemoteFileWriter<HPCCRecord>(outFilePart, recordDef, recordAccessor, CompressionAlgorithm.NONE);

            tasks[taskIndex] = new Runnable()
            {
                SplitEntryMapping mapping = srcFileToOutPartsMapping[taskIndex];
                HPCCRemoteFileWriter<HPCCRecord> fileWriter = filePartWriter;

                public void run()
                {
                    try
                    {
                        int numIncomingParts = (mapping.endingSrcFile+1) - mapping.startingSrcFile;
                        BinaryRecordReader[] fileReaders = new BinaryRecordReader[numIncomingParts];
                        BufferedInputStream[] inputStreams = new BufferedInputStream[numIncomingParts];

                        for (int j = 0; j < numIncomingParts; j++)
                        {
                            String srcFile = srcFiles[mapping.startingSrcFile + j];
                            inputStreams[j] = new BufferedInputStream(new FileInputStream(srcFile));

                            if (j == 0)
                            {
                                SplitEntry startingSplit = splitTables[mapping.startingSrcFile].splits.get(mapping.splitEntryStart);
                                fileReaders[j] = new BinaryRecordReader(inputStreams[j], startingSplit.splitStart);
                            }
                            else
                            {
                                fileReaders[j] = new BinaryRecordReader(inputStreams[j]);
                            }

                            fileReaders[j].initialize(new HPCCRecordBuilder(recordDef));
                        }

                        for (int j = 0; j < fileReaders.length; j++)
                        {
                            BinaryRecordReader fileReader = fileReaders[j];
                            long splitEnd = Long.MAX_VALUE;
                            if (j == (fileReaders.length-1))
                            {
                                SplitEntry endingSplit = splitTables[mapping.endingSrcFile].splits.get(mapping.splitEntryEnd-1);
                                splitEnd = endingSplit.splitEnd;
                            }

                            while (fileReader.hasNext() && fileReader.getStreamPosAfterLastRecord() < splitEnd)
                            {
                                HPCCRecord record = (HPCCRecord) fileReader.getNext();
                                fileWriter.writeRecord(record);
                                context.recordsWritten.incrementAndGet();
                                context.recordsRead.incrementAndGet();
                            }

                            context.bytesRead.addAndGet(fileReader.getStreamPosAfterLastRecord());
                            inputStreams[j].close();
                        }
                        fileWriter.close();
                        context.bytesWritten.addAndGet(fileWriter.getBytesWritten());
                    }
                    catch (Exception e)
                    {
                        context.addError("Error while writing file taskIndex: " + taskIndex + " - " + e.getMessage());
                        return;
                    }
                }
            };
        }

        return tasks;
    }

    private static void performRead(String[] args, TaskContext context)
    {
        Options options = getReadOptions();
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;
        try
        {
            cmd = parser.parse(options, args);
        }
        catch (ParseException e)
        {
            System.out.println("Error parsing commandline options:\n" + e.getMessage());
            return;
        }

        String connString = cmd.getOptionValue("url");
        String user = cmd.getOptionValue("user");
        String pass = cmd.getOptionValue("pass");

        String outputPath = cmd.getOptionValue("out",".");

        int numThreads = NUM_DEFAULT_THREADS;
        String numThreadsStr = cmd.getOptionValue("num_threads", "" + numThreads);
        try
        {
            numThreads = Integer.parseInt(numThreadsStr);
        }
        catch(Exception e)
        {
            System.out.println("Invalid option value for num_threads: "
                              + numThreadsStr + ", must be an integer. Defaulting to: " + NUM_DEFAULT_THREADS + " threads.");
        }

        String formatStr = cmd.getOptionValue("format");
        if (formatStr == null)
        {
            formatStr = "THOR";
        }

        FileFormat format = FileFormat.THOR;
        switch (formatStr.toUpperCase())
        {
            case "THOR":
                format = FileFormat.THOR;
                break;
            case "PARQUET":
                format = FileFormat.PARQUET;
                break;
            default:
                System.out.println("Error unsupported format specified: " + format);
                return;
        }

        String[] datasets = cmd.getOptionValues("read");
        for (int i = 0; i < datasets.length; i++)
        {
            String datasetName = datasets[i];
            context.startOperation("Read " + datasetName);

            HPCCFile file = null;
            try
            {
                file = new HPCCFile(datasetName, connString, user, pass);
            }
            catch (Exception e)
            {
                System.out.println("Error while attempting to open file: '" + datasetName + "': " + e.getMessage());
                return;
            }

            DataPartition[] fileParts = null;
            FieldDef recordDef = null;
            try
            {
                fileParts = file.getFileParts();
                recordDef = file.getRecordDefinition();
            }
            catch (Exception e)
            {
                System.out.println("Error while retrieving file parts for: '" + datasetName + "': " + e.getMessage());
                return;
            }

            // Figure out the format string needed based on the number of file parts
            String lenStr = "" + fileParts.length;
            String fileNumFormat = "%0" + lenStr.length() + "d";
            String fileExt = getFormatExtension(format);

            File outDir = new File(outputPath);
            if (!outDir.exists())
            {
                outDir.mkdirs();
            }

            SplitTable[] splitTables = new SplitTable[fileParts.length];
            String[] outFilePaths = new String[fileParts.length];
            for (int j = 0; j < fileParts.length; j++)
            {
                String fileName = file.getFileName().replace(":","_");
                outFilePaths[j] = outputPath + File.separator + fileName + "._" + String.format(fileNumFormat, j+1) + "_of_" + fileParts.length + fileExt;

                splitTables[j] = new SplitTable(DEFAULT_SPLIT_TABLE_SIZE);
            }

            Runnable[] tasks = null;
            try
            {
                switch (format)
                {
                    case THOR:
                        tasks = createReadToThorTasks(fileParts, splitTables, outFilePaths, recordDef, context);
                        break;
                    case PARQUET:
                    default:
                        throw new Exception("Error unsupported format specified: " + format);
                };
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to create read tasks for file: '" + datasetName + "': " + e.getMessage());
                return;
            }

            try
            {
                executeTasks(tasks, numThreads);
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to execute read tasks for file: '" + datasetName + "': " + e.getMessage());
                return;
            }

            if (context.hasError())
            {
                return;
            }

            try
            {
                String fileName = file.getFileName().replace(":","_");
                String filePath = outputPath + File.separator + fileName + ".meta";
                FileOutputStream metaFile = new FileOutputStream(filePath);

                String metaStr = RecordDefinitionTranslator.toJsonRecord(file.getRecordDefinition()).toString();
                metaFile.write(metaStr.getBytes());
                metaFile.close();
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to write meta-data for file: '" + datasetName + "': " + e.getMessage());
                return;
            }

            try
            {
                String fileName = file.getFileName().replace(":","_");
                String filePath = outputPath + File.separator + fileName + ".split";
                FileOutputStream splitFileOut = new FileOutputStream(filePath);

                SplitFile splitFile = new SplitFile(splitTables);
                splitFile.save(splitFileOut);
                splitFileOut.close();
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to write split table file for dataset: '" + datasetName + "': " + e.getMessage());
                return;
            }

            context.endOperation();
        }
    }

    private static void performReadTest(String[] args, TaskContext context)
    {
        Options options = getReadTestOptions();
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;
        try
        {
            cmd = parser.parse(options, args);
        }
        catch (ParseException e)
        {
            System.out.println("Error parsing commandline options:\n" + e.getMessage());
            return;
        }

        String connString = cmd.getOptionValue("url");
        String user = cmd.getOptionValue("user");
        String pass = cmd.getOptionValue("pass");

        String outputPath = cmd.getOptionValue("out",".");

        int numThreads = NUM_DEFAULT_THREADS;
        String numThreadsStr = cmd.getOptionValue("num_threads", "" + numThreads);
        try
        {
            numThreads = Integer.parseInt(numThreadsStr);
        }
        catch(Exception e)
        {
            System.out.println("Invalid option value for num_threads: "
                              + numThreadsStr + ", must be an integer. Defaulting to: " + NUM_DEFAULT_THREADS + " threads.");
        }

        int expirySeconds = DEFAULT_ACCESS_EXPIRY_SECONDS;
        String expirySecondsStr = cmd.getOptionValue("access_expiry_seconds", "" + expirySeconds);
        try
        {
            expirySeconds = Integer.parseInt(expirySecondsStr);
        }
        catch(Exception e)
        {
            System.out.println("Invalid option value for access_expiry_seconds: "
                              + numThreadsStr + ", must be an integer. Defaulting to: " + DEFAULT_ACCESS_EXPIRY_SECONDS + "s.");
        }

        String formatStr = cmd.getOptionValue("format");
        if (formatStr == null)
        {
            formatStr = "THOR";
        }

        FileFormat format = FileFormat.THOR;
        switch (formatStr.toUpperCase())
        {
            case "THOR":
                format = FileFormat.THOR;
                break;
            case "PARQUET":
                format = FileFormat.PARQUET;
                break;
            default:
                System.out.println("Error unsupported format specified: " + format);
                return;
        }

        String datasetName = cmd.getOptionValue("read_test");
        context.startOperation("Read Test " + datasetName);

        HPCCFile file = null;
        try
        {
            file = new HPCCFile(datasetName, connString, user, pass);
            file.setFileAccessExpirySecs(expirySeconds);
        }
        catch (Exception e)
        {
            System.out.println("Error while attempting to open file: '" + datasetName + "': " + e.getMessage());
            return;
        }

        DataPartition[] fileParts = null;
        FieldDef recordDef = null;
        try
        {
            fileParts = file.getFileParts();
            recordDef = file.getRecordDefinition();
        }
        catch (Exception e)
        {
            System.out.println("Error while retrieving file parts for: '" + datasetName + "': " + e.getMessage());
            return;
        }

        String[] filePartsStrs = cmd.getOptionValues("file_parts");
        if (filePartsStrs != null && filePartsStrs.length > 0)
        {
            ArrayList<DataPartition> filePartList = new ArrayList<DataPartition>();
            for (int i = 0; i < filePartsStrs.length; i++)
            {
                try
                {
                    int filePartIndex = Integer.parseInt(filePartsStrs[i]) - 1;
                    if (filePartIndex < 0 || filePartIndex >= fileParts.length)
                    {
                        System.out.println("Skipping invalid file part index: " + filePartsStrs[i]
                                        + " outside of range: [0," + fileParts.length + "]");
                        continue;
                    }

                    filePartList.add(fileParts[filePartIndex]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println("Skipping invalid file part index: " + filePartsStrs[i]);
                }
            }
        }

        Runnable[] tasks = null;
        try
        {
            switch (format)
            {
                case THOR:
                    tasks = createReadTestTasks(fileParts, recordDef, context);
                    break;
                case PARQUET:
                default:
                    throw new Exception("Error unsupported format specified: " + format);
            };
        }
        catch (Exception e)
        {
            context.addError("Error while attempting to create read tasks for file: '" + datasetName + "': " + e.getMessage());
            return;
        }

        try
        {
            executeTasks(tasks, numThreads);
        }
        catch (Exception e)
        {
            context.addError("Error while attempting to execute read tasks for file: '" + datasetName + "': " + e.getMessage());
            return;
        }

        if (context.hasError())
        {
            return;
        }

        try
        {
            String fileName = file.getFileName().replace(":","_");
            String filePath = outputPath + File.separator + fileName + ".meta";
            FileOutputStream metaFile = new FileOutputStream(filePath);

            String metaStr = RecordDefinitionTranslator.toJsonRecord(file.getRecordDefinition()).toString();
            metaFile.write(metaStr.getBytes());
            metaFile.close();
        }
        catch (Exception e)
        {
            context.addError("Error while attempting to write meta-data for file: '" + datasetName + "': " + e.getMessage());
            return;
        }

        context.endOperation();
    }

    private static void performCopy(String[] args, TaskContext context)
    {
        Options options = getCopyOptions();
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;
        try
        {
            cmd = parser.parse(options, args);
        }
        catch (ParseException e)
        {
            System.out.println("Error parsing commandline options:\n" + e.getMessage());
            return;
        }

        int numThreads = NUM_DEFAULT_THREADS;
        String numThreadsStr = cmd.getOptionValue("num_threads", "" + numThreads);
        try
        {
            numThreads = Integer.parseInt(numThreadsStr);
        }
        catch(Exception e)
        {
            System.out.println("Invalid option value for num_threads: "
                              + numThreadsStr + ", must be an integer. Defaulting to: " + NUM_DEFAULT_THREADS + " threads.");
        }

        String user = cmd.getOptionValue("user");
        String pass = cmd.getOptionValue("pass");

        String destClusterName = cmd.getOptionValue("dest_cluster");

        String srcURL = cmd.getOptionValue("url");
        String destURL = cmd.getOptionValue("dest_url");
        if (destURL == null)
        {
            destURL = srcURL;
        }

        Connection destConn = null;
        try
        {
            destConn = new Connection(destURL);
        }
        catch (Exception e)
        {
            System.out.println("Error while attempting to construct connection: " + e.getMessage());
            return;
        }

        destConn.setCredentials(user, pass);
        Platform platform = Platform.get(destConn);
        HPCCWsClient wsclient = null;

        try
        {
            wsclient = platform.checkOutHPCCWsClient();
        }
        catch (Exception e)
        {
            System.out.println("Error while attempting to connect to platform: " + e.getMessage());
            return;
        }

        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

        String[] copyPairs = cmd.getOptionValues("copy");
        if ((copyPairs.length % 2) != 0)
        {
            System.out.println("Error copy operation must specify both a source and destination file pairs separated by a space.");
            return;
        }

        for (int i = 0; i < copyPairs.length; i+=2)
        {
            String srcFile = copyPairs[i];
            String destFile = copyPairs[i+1];

            context.startOperation("Copy " + srcFile + " -> " + destFile);

            HPCCFile file = null;
            try
            {
                file = new HPCCFile(srcFile, srcURL, user, pass);
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to open file: '" + srcFile + "': " + e.getMessage());
                return;
            }

            DataPartition[] srcFileParts = null;
            try
            {
                srcFileParts = file.getFileParts();
            }
            catch (HpccFileException e)
            {
                context.addError("Error while retrieving file parts for: '" + srcFile + "': " + e.getMessage());
            }

            boolean shouldRedistribute = true;
            if (!shouldRedistribute)
            {
                int expirySecs = 300;
                DFUCreateFileWrapper createResult = null;
                String eclRecordDefn = null;
                try
                {
                    eclRecordDefn = RecordDefinitionTranslator.toECLRecord(file.getRecordDefinition());
                    createResult = dfuClient.createFile(destFile, destClusterName, eclRecordDefn,
                                expirySecs, false, DFUFileTypeWrapper.Flat, "");
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to start file creation for: '" + destFile + "': " + e.getMessage());
                    return;
                }

                Runnable[] tasks = null;
                try
                {
                    tasks = createNonRedistributingCopyTasks(file, createResult, context);
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to create copy tasks for file: '" + srcFile + "': " + e.getMessage());
                    return;
                }

                try
                {
                    executeTasks(tasks, numThreads);
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to execute copy tasks for file: '" + srcFile + "': " + e.getMessage());
                    return;
                }

                if (context.hasError())
                {
                    return;
                }

                try
                {
                    long bytesWritten = context.bytesWritten.get();
                    long recordsWritten = context.recordsWritten.get();
                    dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, recordsWritten, bytesWritten, true);
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to publish file: '" + destFile + "': " + e.getMessage());
                    return;
                }
            }
            else
            {
                String readArgs[] = {"-read", srcFile, "-url", srcURL,
                                "-format", "thor", "-user", user, "-pass", pass,
                                "-out", "tmp-read"};

                performRead(readArgs, context);

                String writeArgs[] = {"-write", "tmp-read" + File.separator +  srcFile.replace(':', '_') + "*" +  " " + destFile,
                                "-url", srcURL, "-dest_url", destURL,
                                "-dest_cluster", destClusterName,
                                "-user", user, "-pass", pass };

                performWrite(writeArgs, context);
            }

            context.endOperation();
        }
    }

    private static void performWrite(String[] args, TaskContext context)
    {
        Options options = getWriteOptions();
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;
        try
        {
            cmd = parser.parse(options, args);
        }
        catch (ParseException e)
        {
            System.out.println("Error parsing commandline options:\n" + e.getMessage());
            return;
        }

        int numThreads = NUM_DEFAULT_THREADS;
        String numThreadsStr = cmd.getOptionValue("num_threads", "" + numThreads);
        try
        {
            numThreads = Integer.parseInt(numThreadsStr);
        }
        catch(Exception e)
        {
            System.out.println("Invalid option value for num_threads: "
                              + numThreadsStr + ", must be an integer. Defaulting to: " + NUM_DEFAULT_THREADS + " threads.");
        }

        String user = cmd.getOptionValue("user");
        String pass = cmd.getOptionValue("pass");

        String destClusterName = cmd.getOptionValue("dest_cluster");

        String srcURL = cmd.getOptionValue("url");
        String destURL = cmd.getOptionValue("dest_url");
        if (destURL == null)
        {
            destURL = srcURL;
        }

        Connection destConn = null;
        try
        {
            destConn = new Connection(destURL);
        }
        catch (Exception e)
        {
            System.out.println("Error while attempting to construct connection: " + e.getMessage());
            return;
        }

        destConn.setCredentials(user, pass);
        Platform platform = Platform.get(destConn);
        HPCCWsClient wsclient = null;

        try
        {
            wsclient = platform.checkOutHPCCWsClient();
        }
        catch (Exception e)
        {
            System.out.println("Error while attempting to connect to platform: " + e.getMessage());
            return;
        }

        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

        String[] writePairs = cmd.getOptionValues("write");
        if ((writePairs.length % 2) != 0)
        {
            System.out.println("Error write operation must specify both a source and destination file pairs separated by a space.");
            return;
        }

        for (int pairIdx = 0; pairIdx < writePairs.length; pairIdx += 2)
        {
            String srcFile = writePairs[pairIdx];
            String destFile = writePairs[pairIdx+1];

            context.startOperation("Write " + srcFile + " -> " + destFile);

            SplitTable[] splitTables = null;
            String[] srcFiles = null;
            FileFormat format = FileFormat.THOR;
            FieldDef recordDefinition = null;
            try
            {
                srcFiles = findFilesMatching(srcFile);
                format = getFormat(srcFiles);
                recordDefinition = getRecordDefinition(srcFiles, format);
                splitTables = getSplitTables(srcFiles, format);
                srcFiles = filterFilesByFormat(srcFiles, format);
            }
            catch (Exception e)
            {
                context.addError("Error while constructing source file list: " + e.getMessage());
                return;
            }

            Arrays.sort(srcFiles);
            if (srcFiles.length == 0)
            {
                context.addError("Error no files matching: " + srcFile);
                return;
            }

            boolean needToCreateSplitTable = (splitTables == null || splitTables.length == 0) && format == FileFormat.THOR;
            if (needToCreateSplitTable)
            {
                Runnable[] tasks = null;
                try
                {
                    splitTables = new SplitTable[srcFiles.length];
                    tasks = createThorSplitTableTasks(srcFiles, splitTables, recordDefinition, context);
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to create split table creation tasks for file: '" + srcFile + "': " + e.getMessage());
                    return;
                }

                try
                {
                    executeTasks(tasks, numThreads);
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to execute create split table creation tasks for file: '" + srcFile + "': " + e.getMessage());
                    return;
                }
            }

            if (needToCreateSplitTable)
            {
                try
                {
                    String fileName = srcFiles[0].substring(0,srcFiles[0].lastIndexOf('.'));
                    String filePath = fileName + ".split";
                    FileOutputStream splitFileOut = new FileOutputStream(filePath);

                    SplitFile splitFile = new SplitFile(splitTables);
                    splitFile.save(splitFileOut);
                    splitFileOut.close();
                }
                catch (Exception e)
                {
                    context.addError("Error while attempting to write split table file for dataset: '" + srcFile + "': " + e.getMessage());
                    return;
                }
            }

            int expirySecs = 300;
            DFUCreateFileWrapper createResult = null;
            String eclRecordDefn = null;
            try
            {
                eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDefinition);
                createResult = dfuClient.createFile(destFile, destClusterName, eclRecordDefn,
                            expirySecs, false, DFUFileTypeWrapper.Flat, "");
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to start file creation for: '" + destFile + "': " + e.getMessage());
                return;
            }

            Runnable[] tasks = null;
            try
            {
                tasks = createWriteTasks(srcFiles, splitTables, recordDefinition, format, createResult, context);
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to create write tasks for file: '" + srcFile + "': " + e.getMessage());
                return;
            }

            try
            {
                executeTasks(tasks, numThreads);
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to execute write tasks for file: '" + srcFile + "': " + e.getMessage());
                return;
            }

            if (context.hasError())
            {
                return;
            }

            try
            {
                long bytesWritten = context.bytesWritten.get();
                long recordsWritten = context.recordsWritten.get();
                dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, recordsWritten, bytesWritten, true);
            }
            catch (Exception e)
            {
                context.addError("Error while attempting to publish file: '" + destFile + "': " + e.getMessage());
                return;
            }

            context.endOperation();
        }
    }

    /**
     * Executes an operation based on the provided args.
     * @param args Operation args
     * @return JSONArray
     */
    public static JSONArray run(String[] args)
    {
        Options options = getTopLevelOptions();
        CommandLineParser parser = new DefaultParser();

        CommandLine cmd = null;
        try
        {
            boolean stopAtNonOption = false;

            // Stop at non-option doesn't seem to work 1.5, so we are only taking the first arg to prevent unknown option exception
            String[] truncatedArgs = new String[1];
            truncatedArgs[0] = args[0];
            cmd = parser.parse(options, truncatedArgs, stopAtNonOption);
        }
        catch (ParseException e)
        {
            System.out.println("Error parsing commandline options:\n" + e.getMessage());
            return new JSONArray();
        }

        TaskContext context = new TaskContext();
        if (cmd.hasOption("read"))
        {
            performRead(args, context);
        }
        else if (cmd.hasOption("read_test"))
        {
            performReadTest(args, context);
        }
        else if (cmd.hasOption("copy"))
        {
            performCopy(args, context);
        }
        else if (cmd.hasOption("write"))
        {
            performWrite(args, context);
        }

        // If we are still in the middle of an operation there was a failure
        if (context.hasOperation())
        {
            boolean succeded = false;
            context.endOperation(succeded);
        }

        return context.generateResultsMessage();
    }

    public static void main(String[] args)
    {
        JSONArray results = run(args);

        System.out.println("Results:\n--------------------------------------------------\n");
        System.out.println(results.toString(2));

        return;
    }
}