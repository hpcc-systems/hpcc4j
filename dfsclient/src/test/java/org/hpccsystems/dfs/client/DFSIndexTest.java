/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
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

import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import io.opentelemetry.instrumentation.annotations.WithSpan;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.Math;

import org.hpccsystems.ws.client.BaseRemoteTest;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFilePartWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;

import org.hpccsystems.dfs.cluster.*;
import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.dfs.client.CompiledFieldFilter;

import org.hpccsystems.commons.ecl.HpccSrcType;
import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FieldFilter;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldFilterRange;
import org.hpccsystems.commons.ecl.RecordDefinitionTranslator;

import static org.junit.Assert.assertTrue;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class DFSIndexTest extends BaseRemoteTest
{
    String[] datasetNames = {"~test::index::integer","~test::index::string"};
    FieldDef[] datasetRecordDefinitions = new FieldDef[2];

    ArrayList<HPCCRecord> partitionRangeStart = new ArrayList<HPCCRecord>();
    ArrayList<HPCCRecord> partitionRangeEnd = new ArrayList<HPCCRecord>();

    static boolean isSetup = false;

    @Before
    public void setup() throws Exception
    {
        if (isSetup)
        {
            return;
        }
        isSetup = true;

        // Integer key
        FieldDef[] fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("key", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("payload", FieldType.STRING, "STRING16", 16, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

        datasetRecordDefinitions[0]= new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        // String key
        fieldDefs = new FieldDef[2];
        fieldDefs[0] = new FieldDef("key", FieldType.STRING, "STRING4", 4, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);
        fieldDefs[1] = new FieldDef("payload", FieldType.STRING, "STRING16", 16, true, false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]);

        datasetRecordDefinitions[1]= new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, fieldDefs);

        for (int i = 0; i < datasetNames.length; i++)
        {
            //------------------------------------------------------------------------------
            // Create indexable dataset
            //------------------------------------------------------------------------------

            String datasetName = datasetNames[i];
            FieldDef recordDef = datasetRecordDefinitions[i];
            createIndexableFile(datasetName, recordDef, partitionRangeStart, partitionRangeEnd);

            //------------------------------------------------------------------------------
            // Create index
            //------------------------------------------------------------------------------

            String indexName = null;
            try
            {
                indexName = createIndexOnDataset(datasetName,recordDef);
            }
            catch (Exception e)
            {
                Assume.assumeNoException("Failed to create index with error: ", e);
            }
        }
    }

    // Ignoring this test until underlying TLK support changes have been made
    @Ignore @Test
    public void hpccTLKFilterTest() throws Exception
    {
        for (int i = 0; i < datasetNames.length; i++)
        {
            String datasetName = datasetNames[i];
            FieldDef recordDef = datasetRecordDefinitions[i];
            String indexName = datasetName + "::key";

            //------------------------------------------------------------------------------
            // Read index and check TLK against known partition ranges
            //------------------------------------------------------------------------------

            HPCCFile file = new HPCCFile(indexName, connString , hpccUser, hpccPass);
            assertTrue(file.isTlkIndex());

            DataPartition[] fileParts = file.getFileParts();

            FieldDef originalRD = file.getRecordDefinition();
            for (int j = 0; j < fileParts.length-1; j++)
            {
                HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
                HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[j], originalRD, recordBuilder);
                while (fileReader.hasNext())
                {
                    HPCCRecord record = fileReader.next();
                    if (record == null)
                    {
                        Assert.fail("PartitionProcessor: " + j + " failed to read record.");
                    }

                    // Check starting range
                    String filterStr = null;
                    if (record.getField(0) instanceof String)
                    {
                        filterStr = "key = \'" + record.getField(0).toString() + "\'";
                    }
                    else
                    {
                        filterStr = "key = " + record.getField(0).toString();
                    }

                    FileFilter filter = new FileFilter(filterStr);
                    List<DataPartition> matchedPartitions = file.findMatchingPartitions(filter);

                    // Due to how TLK works we can get more that one partition
                    boolean hadExpectedPartition = false;
                    for (int k = 0; k < matchedPartitions.size(); k++)
                    {
                        if (matchedPartitions.get(k).index() == j)
                        {
                            hadExpectedPartition = true;
                            break;
                        }
                    }

                    if (hadExpectedPartition == false)
                    {
                        System.out.println("Partition: " + j + " Filter: " + filterStr);
                        System.out.println("Partition range: " + file.getPartitionProcessor().getPartitionRangeAsString(j));
                        Assert.fail("PartitionProcessor: " + j
                                + " filtering result did not contain partition"
                                + partitionListToString(matchedPartitions));
                    }
                }
            }
        }
    }

    @Test
    public void tlkFilterExample() throws Exception
    {
        System.out.println("Starting tlk filter test.");
        //------------------------------------------------------------------------------
        // Read index and check TLK against known partition ranges
        //------------------------------------------------------------------------------

        HPCCFile file = new HPCCFile("~test::index::integer::key", connString , hpccUser, hpccPass);

        // Find partitions that match the provided filter
        Long searchValue = 3L;
        FileFilter filter = new FileFilter("key = " + searchValue);
        List<DataPartition> filteredPartitions = file.findMatchingPartitions(filter);

        assertTrue("Unexpected number of partitions", filteredPartitions.size() == 1);

        DataPartition matchedPart = filteredPartitions.get(0);
        HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
        HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(matchedPart, file.getRecordDefinition(), recordBuilder);

        boolean foundRecord = false;
        while (fileReader.hasNext())
        {
            HPCCRecord record = fileReader.next();
            if (record == null)
            {
                Assert.fail("Received null record during read");
            }

            Long keyValue = (Long) record.getField(0);
            if (keyValue.equals(searchValue))
            {
                foundRecord = true;
            }
            System.out.println("Key: " + keyValue + " Search value: " + searchValue + " found: " + foundRecord);
        }
        fileReader.close();
    }

    @Test
    public void biasedIntTest() throws Exception
    {
        HPCCFile file = new HPCCFile("~test::index::integer::key", connString , hpccUser, hpccPass);

        DataPartition[] fileParts = file.getFileParts();

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        FieldDef originalRD = file.getRecordDefinition();
        for (int j = 0; j < fileParts.length; j++)
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[j], originalRD, recordBuilder);
            while (fileReader.hasNext())
            {
                records.add(fileReader.next());
            }
            fileReader.close();
        }

        assertTrue(records.size() >= 2);

        // Read the data from the first partition and make sure that biased integers have been corrected
        int partitionIndex = 0;
        {
            HPCCRecord startRecord = records.get(0);
            long expectedStart = partitionIndex * 4;
            Long start = (Long) startRecord.getField(0);
            assertTrue(expectedStart == start);

            HPCCRecord endRecord = records.get(1);
            long expectedEnd = partitionIndex * 4 + 3;
            Long end = (Long) endRecord.getField(0);
            assertTrue(expectedEnd == end);
        }
    }

    @Test
    public void indexBlobTest() throws Exception
    {
        HPCCFile file = new HPCCFile("~test::index::blobs::key", connString , hpccUser, hpccPass);

        DataPartition[] fileParts = file.getFileParts();

        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        FieldDef originalRD = file.getRecordDefinition();
        for (int j = 0; j < fileParts.length; j++)
        {
            HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
            HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(fileParts[j], originalRD, recordBuilder);
            while (fileReader.hasNext())
            {
                records.add(fileReader.next());
            }
            fileReader.close();
        }
    }

    @Test
    @WithSpan
    public void writeIndexTest() throws Exception
    {
        FieldDef[] childDefs = new FieldDef[]
        {
            new FieldDef("key", FieldType.INTEGER, "INTEGER4", 4, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]),
            new FieldDef("payload", FieldType.STRING, "STRING16", 16, true, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0])
        };
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 4, false, false, HpccSrcType.LITTLE_ENDIAN, childDefs);

        int numRecords = 1000000;
        List<HPCCRecord> records = new ArrayList<HPCCRecord>();
        for (int i = 0; i < numRecords; i++)
        {
            Object[] fields = new Object[2];
            fields[0] = Long.valueOf(i);
            fields[1] = "payload_" + (numRecords - i);
            records.add(new HPCCRecord(fields, recordDef));
        }

        writeIndexFile("test::index::write", recordDef, records, CompressionAlgorithm.INDEX_DEFAULT);
    }

    @Test
    @WithSpan
    public void writeAllTypesIndexTest() throws Exception
    {
        // childRec := {STRING8 childField1, INTEGER8 childField2, REAL8 childField3}
        FieldDef childRecDef = new FieldDef("childRec", FieldType.RECORD, "childRec", 0, false, false,
                HpccSrcType.UNKNOWN, new FieldDef[]
                {
                    new FieldDef("childField1", FieldType.STRING,  "STRING8",  8, true,  false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
                    new FieldDef("childField2", FieldType.INTEGER, "INTEGER8", 8, true,  false, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
                    new FieldDef("childField3", FieldType.REAL,    "REAL8",    8, true,  false, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0])
                });

        // Decimal len encoding: (scale << 16) | precision
        long dec16Len = ((long) 8 << 16) | 16L; // DECIMAL16_8  / UDECIMAL16_8
        long dec15Len = ((long) 8 << 16) | 15L; // DECIMAL15_8  / UDECIMAL15_8

        // Key fields match the index definition from generate-datasets.ecl:
        //   INDEX(Ptbl, {int8, uint8, int4, uint4, int2, uint2, udec16, fixStr8, RecPtr}, key_name)
        // Payload fields cover the remaining types supported by the writer.
        FieldDef[] fieldDefs = new FieldDef[]
        {
            // --- Key fields (no FLAG_PAYLOAD_FIELD) ---
            new FieldDef("int8",    FieldType.INTEGER,     "INTEGER8",       8,        true,  false, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("uint8",   FieldType.INTEGER,     "UNSIGNED8",      8,        true,  true,  HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("int4",    FieldType.INTEGER,     "INTEGER4",       4,        true,  false, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("uint4",   FieldType.INTEGER,     "UNSIGNED4",      4,        true,  true,  HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("int2",    FieldType.INTEGER,     "INTEGER2",       2,        true,  false, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("uint2",   FieldType.INTEGER,     "UNSIGNED2",      2,        true,  true,  HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("udec16",  FieldType.DECIMAL,     "UDECIMAL16_8",   dec16Len, true,  true,  HpccSrcType.LITTLE_ENDIAN,          new FieldDef[0]),
            new FieldDef("fixStr8", FieldType.STRING,      "STRING8",        8,        true,  false, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
            // --- Payload fields (FLAG_PAYLOAD_FIELD) ---
            new FieldDef("r8",         FieldType.REAL,       "REAL8",          8,        true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("r4",         FieldType.REAL,       "REAL4",          4,        true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.LITTLE_ENDIAN,    new FieldDef[0]),
            new FieldDef("dec16",      FieldType.DECIMAL,    "DECIMAL16_8",    dec16Len, true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.LITTLE_ENDIAN,          new FieldDef[0]),
            new FieldDef("dec15",      FieldType.DECIMAL,    "DECIMAL15_8",    dec15Len, true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.LITTLE_ENDIAN,          new FieldDef[0]),
            new FieldDef("udec15",     FieldType.DECIMAL,    "UDECIMAL15_8",   dec15Len, true,  true,  FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.LITTLE_ENDIAN,          new FieldDef[0]),
            new FieldDef("qStr",       FieldType.STRING,     "QSTRING",        0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.QSTRING,          new FieldDef[0]),
            new FieldDef("fixStr8pay", FieldType.STRING,     "STRING8",        8,        true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
            new FieldDef("str",        FieldType.STRING,     "STRING",         0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
            new FieldDef("varStr",     FieldType.VAR_STRING, "VARSTRING",      0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
            new FieldDef("varStr8",    FieldType.VAR_STRING, "VARSTRING8",     8,        true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.SINGLE_BYTE_CHAR, new FieldDef[0]),
            new FieldDef("utfStr",     FieldType.STRING,     "UTF8",           0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UTF8,             new FieldDef[0]),
            new FieldDef("uni8",       FieldType.STRING,     "UNICODE8",       8,        true,  false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UTF16LE,          new FieldDef[0]),
            new FieldDef("uni",        FieldType.STRING,     "UNICODE",        0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UTF16LE,          new FieldDef[0]),
            new FieldDef("varUni",     FieldType.VAR_STRING, "VARUNICODE",     0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UTF16LE,          new FieldDef[0]),
            new FieldDef("childDataset", FieldType.DATASET,  "DATASET(childRec)", 0,     false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UNKNOWN, new FieldDef[]{ childRecDef }),
            new FieldDef("int1Set",    FieldType.SET,        "SET OF INTEGER1", 0,        false, false, FieldDef.FLAG_PAYLOAD_FIELD, HpccSrcType.UNKNOWN,
                    new FieldDef[]{ new FieldDef("", FieldType.INTEGER, "INTEGER1", 1, true, false, HpccSrcType.LITTLE_ENDIAN, new FieldDef[0]) })
        };
        FieldDef recordDef = new FieldDef("RootRecord", FieldType.RECORD, "rec", 0, false, false,
                HpccSrcType.UNKNOWN, fieldDefs);

        // Shared child dataset and set values used in every record
        List<Object> childDatasetValue = new ArrayList<Object>();
        childDatasetValue.add(new HPCCRecord(new Object[]{ "childval ", Long.valueOf(42L), Double.valueOf(3.14) }, childRecDef));

        List<Object> int1SetValue = new ArrayList<Object>();
        int1SetValue.add(Long.valueOf(1L));
        int1SetValue.add(Long.valueOf(2L));
        int1SetValue.add(Long.valueOf(3L));

        int numRecords = 1000;
        List<HPCCRecord> records = new ArrayList<HPCCRecord>(numRecords);
        for (int i = 0; i < numRecords; i++)
        {
            String fixStr = String.format("%-8s", "s" + i).substring(0, 8);
            String uni8Str = String.format("%-8s", "u" + i).substring(0, 8);
            Object[] fields = new Object[]
            {
                // Key fields
                Long.valueOf(i),                           // int8
                Long.valueOf(i),                           // uint8
                Long.valueOf(i),                           // int4
                Long.valueOf(i),                           // uint4
                Long.valueOf(i % 30000),                   // int2  (fits in 2-byte signed)
                Long.valueOf(i % 60000),                   // uint2 (fits in 2-byte unsigned)
                BigDecimal.valueOf(i),                     // udec16
                fixStr,                                    // fixStr8
                // Payload fields
                Double.valueOf(i * 1.5),                   // r8
                Double.valueOf((float)(i * 0.5)),          // r4
                BigDecimal.valueOf(i),                     // dec16
                BigDecimal.valueOf(i),                     // dec15
                BigDecimal.valueOf(i),                     // udec15
                "q" + i,                                   // qStr  (printable ASCII only)
                fixStr,                                    // fixStr8pay
                "str" + i,                                 // str
                "var" + i,                                 // varStr
                "vs" + (i % 100),                          // varStr8 (max 5 chars, fits in 8)
                "utf" + i,                                 // utfStr
                uni8Str,                                   // uni8
                "uni" + i,                                 // uni
                "vu" + i,                                  // varUni
                childDatasetValue,                         // childDataset
                int1SetValue                               // int1Set
            };
            records.add(new HPCCRecord(fields, recordDef));
        }

        writeIndexFile("test::index::all_types_write", recordDef, records, CompressionAlgorithm.INDEX_DEFAULT);
    }

    /**
     * Creates, writes, and publishes an index file to HPCC.
     * Key fields in recordDef should have no FLAG_PAYLOAD_FIELD; payload fields should have FLAG_PAYLOAD_FIELD set.
     *
     * @param fileName           the target file name (without ~)
     * @param recordDef          the input record definition
     * @param records            the records to write, sorted by key fields
     * @param compressionAlgorithm the compression algorithm to use
     * @throws Exception if an error occurs
     */
    private void writeIndexFile(String fileName, FieldDef recordDef, List<HPCCRecord> records,
            CompressionAlgorithm compressionAlgorithm) throws Exception
    {
        FieldDef indexRecordDef = recordDef.toIndexRecordDef();

        // Need to use inline record definition for indices due to lack of support for index definitions in the standard ECL record ESP side.
        String indexEclRecordDef = RecordDefinitionTranslator.toInlineECLRecord(indexRecordDef, true);
        HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

        DFUCreateFileWrapper createResult = dfuClient.createFile(fileName, this.thorClusterFileGroup,
                indexEclRecordDef, 300, true, DFUFileTypeWrapper.Index, "");

        DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
        DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts,
                new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()),
                dfuFileParts.length, null, createResult.getFileAccessInfoBlob(), DataPartition.FileType.INDEX);

        int tlkPartitionIndex = -1;
        List<HPCCRecord> tlkRecords = new ArrayList<HPCCRecord>();

        int numNonTLKParts = dfuFileParts.length - 1;
        int recordsPerPartition = records.size() / numNonTLKParts;
        int residualRecords = records.size() % numNonTLKParts;

        int currentRecord = 0;
        long bytesWritten = 0;
        for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++)
        {
            int numRecordsInPartition = recordsPerPartition;

            // These should be distributed evenly but we will add them to the last partition for this test
            if (partitionIndex == dfuFileParts.length - 1)
            {
                numRecordsInPartition += residualRecords;
            }

            if (hpccPartitions[partitionIndex].isTLK())
            {
                tlkPartitionIndex = partitionIndex;
                continue;
            }
            tlkRecords.add(records.get(currentRecord + numRecordsInPartition - 1));

            HPCCRemoteFileWriter.FileWriteContext writeContext = new HPCCRemoteFileWriter.FileWriteContext();
            writeContext.recordDef = recordDef;
            writeContext.outputRecordDef = indexRecordDef;
            writeContext.fileCompression = compressionAlgorithm;

            HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
            HPCCRemoteFileWriter<HPCCRecord> fileWriter = new HPCCRemoteFileWriter<HPCCRecord>(writeContext,
                    hpccPartitions[partitionIndex], recordAccessor);

            for (int j = 0; j < numRecordsInPartition; j++, currentRecord++)
            {
                fileWriter.writeRecord(records.get(currentRecord));
            }

            fileWriter.close();
            bytesWritten += fileWriter.getBytesWritten();
        }

        //------------------------------------------------------------------------------
        //  Write the TLK
        //------------------------------------------------------------------------------

        if (tlkPartitionIndex != -1)
        {
            System.out.println("Writing TLK partition: " + tlkPartitionIndex);
            HPCCRemoteFileWriter.FileWriteContext writeContext = new HPCCRemoteFileWriter.FileWriteContext();
            writeContext.recordDef = recordDef;
            writeContext.outputRecordDef = indexRecordDef;
            writeContext.fileCompression = compressionAlgorithm;

            HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
            HPCCRemoteFileWriter<HPCCRecord> fileWriter = new HPCCRemoteFileWriter<HPCCRecord>(writeContext,
                    hpccPartitions[tlkPartitionIndex], recordAccessor);

            for (HPCCRecord tlkRecord : tlkRecords)
            {
                fileWriter.writeRecord(tlkRecord);
            }

            fileWriter.close();
            bytesWritten += fileWriter.getBytesWritten();
        }

        //------------------------------------------------------------------------------
        //  Publish and finalize the temp file
        //------------------------------------------------------------------------------

        dfuClient.publishFile(createResult.getFileID(), indexEclRecordDef, currentRecord, bytesWritten, true);
    }

    private String partitionListToString(List<DataPartition> partitions)
    {
        String matchedPartitionStr = "[ ";
        for (DataPartition part : partitions)
        {
            matchedPartitionStr += part.index() + " ";
        }
        matchedPartitionStr += "]";

        return matchedPartitionStr;
    }

    private void createIndexableFile(String fileName, FieldDef recordDef, List<HPCCRecord> partitionRangeStart, List<HPCCRecord> partitionRangeEnd)
    {
        try
        {
            //------------------------------------------------------------------------------
            //  Request a temp file be created in HPCC to write to
            //------------------------------------------------------------------------------

            String eclRecordDefn = RecordDefinitionTranslator.toECLRecord(recordDef);

            HPCCWsDFUClient dfuClient = wsclient.getWsDFUClient();

            String filegroupname = this.thorClusterFileGroup;
            DFUCreateFileWrapper createResult = dfuClient.createFile(fileName, filegroupname, eclRecordDefn, 300, false, DFUFileTypeWrapper.Flat, "");

            DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
            DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts,
                    new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()), dfuFileParts.length, createResult.getFileAccessInfoBlob());

            //------------------------------------------------------------------------------
            //  Write partitions to file parts and keep track of record ranges
            //------------------------------------------------------------------------------

            partitionRangeStart.clear();
            partitionRangeEnd.clear();

            long bytesWritten = 0;
            int numRecords = 0;
            for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++)
            {
                HPCCRecordAccessor recordAccessor = new HPCCRecordAccessor(recordDef);
                HPCCRemoteFileWriter<HPCCRecord> fileWriter = new HPCCRemoteFileWriter<HPCCRecord>(hpccPartitions[partitionIndex], recordDef, recordAccessor, CompressionAlgorithm.NONE);

                try
                {
                    List<HPCCRecord> recordRange = createRecordRange(partitionIndex, hpccPartitions.length, recordDef);
                    for (HPCCRecord record : recordRange) {
                        fileWriter.writeRecord(record);
                        numRecords++;
                    }

                    partitionRangeStart.add(recordRange.get(0));
                    partitionRangeEnd.add(recordRange.get(1));

                    fileWriter.close();
                    bytesWritten += fileWriter.getBytesWritten();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                    Assert.fail(e.getMessage());
                }
            }

            //------------------------------------------------------------------------------
            //  Publish and finalize the temp file
            //------------------------------------------------------------------------------

            dfuClient.publishFile(createResult.getFileID(), eclRecordDefn, numRecords, bytesWritten, true);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            Assert.fail("Failed to write file with error: " + e.getMessage());
        }
    }

    String createIndexOnDataset(String datasetName, FieldDef recordDef) throws Exception {
        String indexName = datasetName + "::key";
        String ecl = "rec := " + RecordDefinitionTranslator.toECLRecord(recordDef);
        ecl += "ds := DATASET('" + datasetName + "', rec, THOR);";
        ecl += "idx := INDEX(ds, {key}, {payload},'" + indexName + "');";
        ecl += "BUILDINDEX(idx, OVERWRITE);";

        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL(ecl);
        wu.setJobname("IndexCreation" + datasetName);
        wu.setCluster(thorclustername);

        HPCCWsWorkUnitsClient client = wsclient.getWsWorkunitsClient();
        String result = client.createAndRunWUFromECLAndGetResults(wu);
        return indexName;
    }

    public void testBatchRandomAccess() throws Exception
    {
        try
        {
            HPCCFile file = new HPCCFile("~test::index::integer", connString , hpccUser, hpccPass);
            DataPartition[] fileParts = file.getFileParts();
            FieldDef originalRD = file.getRecordDefinition();

            System.out.println("Num file parts: " + fileParts.length);
            ArrayList<HPCCRecord> records = new ArrayList<HPCCRecord>();

            for (long i = 0; i < fileParts.length; i++)
            {
                long start = System.currentTimeMillis();
                HpccRandomAccessFileReader<HPCCRecord> fileReader = null;
                try
                {
                    DataPartition fp = fileParts[(int)i];
                    HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(file.getProjectedRecordDefinition());
                    fileReader = new HpccRandomAccessFileReader<HPCCRecord>(fp, originalRD, recordBuilder,-1);
                }
                catch (Exception e)
                {
                    Assert.fail("Error: " + e.getMessage());
                }
                long end = System.currentTimeMillis();
                System.out.println("Time to create batch record reader: " + (end - start) + "ms");

                start = System.currentTimeMillis();
                Long[] recOffsets = {20L};
                fileReader.addRecordRequests(Arrays.asList(recOffsets));

                while (fileReader.hasNext())
                {
                    HPCCRecord record = fileReader.next();
                    if (record == null)
                    {
                        Assert.fail("Error: failed to read record.");
                    }

                    long expectedKeyValue = 3 + 4 * i;
                    Long keyValue = (Long) record.getField(0);
                    if (keyValue != expectedKeyValue)
                    {
                        Assert.fail("Error: key values did not match.");
                    }
                }
                end = System.currentTimeMillis();
                System.out.println("Time required to perform batch request: " + (end - start) + "ms");

                fileReader.close();
            }
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    List<HPCCRecord> createRecordRange(int partitionIndex, int numPartitions, FieldDef recordDef)
    {
        Object[] rangeStartFields = new Object[recordDef.getNumDefs()];
        Object[] rangeEndFields = new Object[recordDef.getNumDefs()];

        for (int i = 0; i < recordDef.getNumDefs(); i++)
        {
            boolean isKeyField = (i == 0);
            boolean isStart = true;
            rangeStartFields[i] = createFieldValue(partitionIndex, numPartitions, recordDef.getDef(i), isKeyField, isStart);

            isStart = false;
            rangeEndFields[i] = createFieldValue(partitionIndex, numPartitions, recordDef.getDef(i),isKeyField, isStart);
        }

        ArrayList<HPCCRecord> recordRange = new ArrayList<HPCCRecord>();
        recordRange.add(new HPCCRecord(rangeStartFields,recordDef));
        recordRange.add(new HPCCRecord(rangeEndFields,recordDef));

        return recordRange;
    }

    Object createFieldValue(int partitionIndex, int numPartitions, FieldDef fd, boolean isKeyField, boolean isStart)
    {
        if (isKeyField)
        {
            if (fd.isFixed() == false)
            {
                Assert.fail("Invalid key field type");
            }

            switch (fd.getFieldType())
            {
                case BOOLEAN:
                {
                    return Boolean.valueOf(isStart == false);
                }
                case INTEGER:
                {
                    if (isStart)
                    {
                        return new Integer(partitionIndex*4);
                    }
                    else
                    {
                        return new Integer(partitionIndex*4+3);
                    }
                }
                case STRING:
                {
                    // Convert partitionIndex * 4 + 0/3 into base 26 string
                    int rangeNum = 0;
                    if (isStart)
                    {
                        rangeNum = partitionIndex * 4;
                    }
                    else
                    {
                        rangeNum = partitionIndex * 4 + 3;
                    }

                    StringBuilder builder = new StringBuilder("                ");
                    int charIndex = (int) Math.ceil(Math.log(numPartitions) / Math.log(26));
                    while (rangeNum > 0)
                    {
                        char currentLetter = (char) ('A' + (rangeNum % 26));
                        builder.setCharAt(charIndex,currentLetter);

                        rangeNum /= 26;
                        charIndex--;
                    }

                    return builder.toString();
                }
                default:
                    Assert.fail("Invalid key field type");
                    return null;
            }
        }
        else
        {
            if (fd.getFieldType() != FieldType.STRING)
            {
                Assert.fail("Invalid payload field type.");
                return null;
            }

            return new String("Payload value");
        }
    }

    public static void main(String[] args)
    {
        DFSIndexTest test = new DFSIndexTest();
        try {
            test.hpccTLKFilterTest();
            test.tlkFilterExample();
        } catch(Exception e) {}
    }
}