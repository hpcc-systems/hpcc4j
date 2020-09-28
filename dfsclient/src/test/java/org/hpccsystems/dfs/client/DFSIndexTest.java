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
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.Math;

import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.platform.test.BaseRemoteTest;
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

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public class DFSIndexTest extends BaseRemoteTest
{
    @Test
    public void hpccTLKFilterTest() throws Exception
    {

        String[] datasetNames = {"~test::index::integer", "~test::index::string"};
        FieldDef[] datasetRecordDefinitions = new FieldDef[2];

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

            ArrayList<HPCCRecord> partitionRangeStart = new ArrayList<HPCCRecord>();
            ArrayList<HPCCRecord> partitionRangeEnd = new ArrayList<HPCCRecord>();

            String datasetName = datasetNames[i];
            FieldDef recordDef = datasetRecordDefinitions[i];
            createIndexableFile(datasetName, recordDef, partitionRangeStart, partitionRangeEnd);
            
            //------------------------------------------------------------------------------
            // Create index
            //------------------------------------------------------------------------------

            String indexName = datasetName + "::key";
            String ecl = "rec := " + RecordDefinitionTranslator.toECLRecord(recordDef);
            ecl += "ds := DATASET('" + datasetName + "', rec, THOR);";
            ecl += "idx := INDEX(ds, {key}, {payload},'" + indexName + "');";
            ecl += "BUILDINDEX(idx, OVERWRITE);";
            
            WorkunitWrapper wu = new WorkunitWrapper();
            wu.setECL(ecl);
            wu.setJobname("IndexCreation" + datasetName);
            wu.setCluster(thorcluster);

            try
            {
                HPCCWsWorkUnitsClient client = wsclient.getWsWorkunitsClient();
                String result = client.createAndRunWUFromECLAndGetResults(wu);
            }
            catch(Exception e)
            {
                Assert.fail("Test failed with error: " + e.getMessage());
            }

            //------------------------------------------------------------------------------
            // Read index and check TLK against known partition ranges
            //------------------------------------------------------------------------------
            
            HPCCFile file = new HPCCFile(indexName, connString , hpccUser, hpccPass);

            DataPartition[] fileParts = file.getFileParts();
            for (int j = 0; j < fileParts.length-1; j++)
            {
                // Check starting range
                HPCCRecord rangeStart = partitionRangeStart.get(j);
            
                FileFilter filter = new FileFilter("key = \"" + rangeStart.getField(0).toString() + "\"");
                List<DataPartition> matchedPartitions = file.findMatchingPartitions(filter);
                if (matchedPartitions.size() != 1)
                {
                    Assert.fail("PartitionProcessor: " + j 
                              + " not return expected partitions"
                              + partitionListToString(matchedPartitions));
                }

                // Check ending range
                HPCCRecord rangeEnd = partitionRangeEnd.get(j);
            
                filter = new FileFilter("key = \"" + rangeEnd.getField(0).toString() + "\"");
                matchedPartitions = file.findMatchingPartitions(filter);
                if (matchedPartitions.size() != 1)
                {
                    Assert.fail("PartitionProcessor: " + j 
                              + " not return expected partitions"
                              + partitionListToString(matchedPartitions));
                }
            }
        }
    }

    private String partitionListToString(List<DataPartition> partitions)
    {
        String matchedPartitionStr = "[ ";
        for (DataPartition part : partitions)
        {
            matchedPartitionStr += part.this_part + " ";
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

            String clusterName = this.thorcluster;
            DFUCreateFileWrapper createResult = dfuClient.createFile(fileName, clusterName, eclRecordDefn, 300, false, DFUFileTypeWrapper.Flat, "");

            DFUFilePartWrapper[] dfuFileParts = createResult.getFileParts();
            DataPartition[] hpccPartitions = DataPartition.createPartitions(dfuFileParts,
                    new NullRemapper(new RemapInfo(), createResult.getFileAccessInfo()), dfuFileParts.length, createResult.getFileAccessInfoBlob());

            //------------------------------------------------------------------------------
            //  Write partitions to file parts and keep track of record ranges
            //------------------------------------------------------------------------------
            
            partitionRangeStart.clear();
            partitionRangeEnd.clear();

            int bytesWritten = 0;
            int numRecords = 0;
            for (int partitionIndex = 0; partitionIndex < hpccPartitions.length; partitionIndex++)
            {
                int numRecordsInPartition = 2;

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
                    return new Boolean(isStart == false);
                }
                case INTEGER:
                {
                    if (isStart)
                    {
                        return new Integer(partitionIndex*2);
                    }
                    else
                    {
                        return new Integer(partitionIndex*2+1);
                    }
                }
                case STRING:
                {
                    // Convert partitionIndex * 2 + 0/1 into base 26 string
                    int rangeNum = 0;
                    if (isStart)
                    {
                        rangeNum = partitionIndex * 2;
                    }
                    else
                    {
                        rangeNum = partitionIndex * 2 + 1;
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

}
