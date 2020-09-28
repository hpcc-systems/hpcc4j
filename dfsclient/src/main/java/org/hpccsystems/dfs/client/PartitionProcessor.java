/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2020 HPCC Systems®.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *******************************************************************************/
package org.hpccsystems.dfs.client;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.hpccsystems.dfs.client.HPCCRecord;
import org.hpccsystems.dfs.client.HPCCRecordBuilder;
import org.hpccsystems.dfs.client.HpccRemoteFileReader;
import org.hpccsystems.dfs.client.DataPartition;
import org.hpccsystems.dfs.client.CompiledFieldFilter;

import org.hpccsystems.commons.ecl.FieldDef;
import org.hpccsystems.commons.ecl.FieldType;
import org.hpccsystems.commons.ecl.FieldFilter;
import org.hpccsystems.commons.ecl.FileFilter;
import org.hpccsystems.commons.ecl.FieldFilterRange;

public class PartitionProcessor 
{
    // A set field filters that are all OR'd togther
    private class CompiledFieldFilterSet
    {
        public ArrayList<CompiledFieldFilter> filters = new ArrayList<CompiledFieldFilter>();

        public String toString()
        {
            String ret = "{";
            for (CompiledFieldFilter filter : filters)
            {
                ret += filter.toString() + " ";
            }
            ret += "}";
            return ret;
        }
    };

    // A set of field filters AND'd together
    private class CompiledFileFilter
    {
        ArrayList<CompiledFieldFilterSet> filterSets = new ArrayList<CompiledFieldFilterSet>();

        CompiledFileFilter(FieldDef recordDef, FileFilter filter) throws Exception
        {
            CompiledFieldFilterSet filterSet = new CompiledFieldFilterSet();
            for (int i = 0; i < filter.getFieldFiltersCount(); i++)
            {
                FieldFilter fieldFilter = filter.getFieldFilter(i);

                int fieldIndex = recordDef.getDefIndexWithFieldName(fieldFilter.getFieldName());
                if (fieldIndex < 0)
                {
                    throw new Exception("Unable to find field definition for field: " + fieldFilter.getFieldName());
                }

                FieldType type = recordDef.getDef(fieldIndex).getFieldType();

                for (FieldFilterRange filterRange : fieldFilter.getRanges())
                {
                    filterSet.filters.add(new CompiledFieldFilter(fieldIndex, type, filterRange));
                }
            }
            filterSets.add(filterSet);

            List<FileFilter> andFileFilters = filter.getAndFileFilters();
            for (int i = 0; i < andFileFilters.size(); i++)
            {
                filterSet = new CompiledFieldFilterSet();
                FileFilter andFilter = andFileFilters.get(i);

                for (int j = 0; j < andFilter.getFieldFiltersCount(); j++)
                {
                    FieldFilter fieldFilter = andFilter.getFieldFilter(j);

                    int fieldIndex = recordDef.getDefIndexWithFieldName(fieldFilter.getFieldName());
                    if (fieldIndex < 0)
                    {
                        throw new Exception("Unable to find field definition for field: " + fieldFilter.getFieldName());
                    }

                    FieldType type = recordDef.getDef(fieldIndex).getFieldType();
                    
                    List<FieldFilterRange> ranges = fieldFilter.getRanges();
                    for (FieldFilterRange range : ranges)
                    {
                        filterSet.filters.add(new CompiledFieldFilter(fieldIndex, type, range));
                    }
                }
                filterSets.add(filterSet);
            }
        }

        private boolean partitionMatchesFilter(DataPartitionRecordRange partRange)
        {
            // Filter sets are AND'd together. So if there is any unmatched field break
            boolean hasMatch = true;
            for (CompiledFieldFilterSet filterSet : filterSets)
            {
                // All filters in the set filter on the same field
                CompiledFieldFilter firstFilter = filterSet.filters.get(0);
                Object fieldRangeBegin = partRange.begin.getField(firstFilter.getFieldIndex());
                Object fieldRangeEnd = partRange.end.getField(firstFilter.getFieldIndex());

                // The field set is OR'd together. So if any filter matches break
                boolean fieldWasMatched = false;
                for (CompiledFieldFilter filter : filterSet.filters)
                {
                    fieldWasMatched = filter.matchesRange(fieldRangeBegin, fieldRangeEnd);
                    if (fieldWasMatched)
                    {
                        break;
                    }
                }

                hasMatch = hasMatch && fieldWasMatched;
                if (hasMatch == false)
                {
                    break;
                }
            }

            return hasMatch;
        }

        @Override
        public String toString()
        {
            String ret = "[\n";
            for (CompiledFieldFilterSet filterSet : filterSets)
            {
                ret += "\t" + filterSet.toString() + "\n";
            }
            
            ret += "]\n";
            return ret;
        }

    }

    private class DataPartitionRecordRange
    {
        public HPCCRecord begin = null;
        public HPCCRecord end = null;
        public DataPartition dataPartition = null;
    };

    private static final Logger log = LogManager.getLogger(PartitionProcessor.class);
    private DataPartition[] dataPartitions = null;
    private ArrayList<DataPartitionRecordRange> dataPartitionRanges = new ArrayList<DataPartitionRecordRange>();
    private FieldDef recordDef = null;

    PartitionProcessor(FieldDef recDef, DataPartition[] partitions, DataPartition tlkPartition) throws Exception 
    {
        this.dataPartitions = partitions;
        this.recordDef = recDef;

        if (tlkPartition == null)
        {
            log.warn("No TLK partition provided to partition processor; all partitions will be returned for all filters.");
            return;
        }

        //------------------------------------------------------------------------------
        // Read the TLK file part
        //------------------------------------------------------------------------------
        
        boolean success = false;
        int numRetries = 0;
        Exception readFailureException = null;

        HPCCRecordBuilder recordBuilder = new HPCCRecordBuilder(recDef);
        ArrayList<HPCCRecord> tlkRecords = new ArrayList<HPCCRecord>(partitions.length);
        
        while (numRetries < 3 && success == false)
        {
            tlkRecords.clear();
            try
            {
                HpccRemoteFileReader<HPCCRecord> fileReader = new HpccRemoteFileReader<HPCCRecord>(tlkPartition, recDef, recordBuilder);
                while (fileReader.hasNext())
                {
                    HPCCRecord record = fileReader.next();

                    // Correct integer key fields.
                    // Signed values are coming back as expectedValue - (2^31)
                    // Max unsigned value is negative
                    for (int i = 0; i < record.getNumFields(); i++)
                    {
                        Object field = record.getField(i);
                        FieldDef fd = recordDef.getDef(i);
                        if (fd.getFieldType() == FieldType.INTEGER)
                        {
                            Long longVal = (Long) field;
                            long intBitLength = recordDef.getDef(i).getDataLen() * 8;

                            if (fd.isUnsigned())
                            {
                                if (longVal < 0)
                                {
                                    longVal = Long.MAX_VALUE;
                                }
                            }
                            else
                            {
                                longVal &= (~(1L << (intBitLength-1)));
                            }
                            record.setField(i,longVal);
                        }
                        else if (fd.getFieldType() == FieldType.STRING)
                        {
                            String strVal = (String) field;

                            // rtrim
                            strVal = strVal.replaceAll("\\s+$", "");
                            record.setField(i,strVal);
                        }
                    }

                    tlkRecords.add(record);
                }

                success = true;
                fileReader.close();
            }
            catch (Exception e)
            {
                numRetries++;
                readFailureException = e;
            }
        }

        if (success == false)
        {
            throw new Exception("PartitionProcessor: Error while attempting to read TLK: " + readFailureException.getMessage());
        }

        //------------------------------------------------------------------------------
        // Construct data partition ranges
        //------------------------------------------------------------------------------

        if ((tlkRecords.size()-1) != this.dataPartitions.length)
        {
            throw new Exception("Mismatch between # of data partitions and records in TLK: " + (tlkRecords.size()-1) + " # partitions: " + this.dataPartitions.length);
        }

        // Construct ranges
        for (int i = 1; i < tlkRecords.size()-1; i++)
        {
            DataPartitionRecordRange range = new DataPartitionRecordRange();
            range.begin = tlkRecords.get(i);
            range.end = tlkRecords.get(i+1);
            range.dataPartition = this.dataPartitions[i-1];
            dataPartitionRanges.add(range);
        }

        // Last record in TLK encompasses the last two partitions range for some reason.
        // So duplicate its range to cover the last partition
        DataPartitionRecordRange secondToLast = dataPartitionRanges.get(dataPartitionRanges.size()-1);

        DataPartitionRecordRange lastRange = new DataPartitionRecordRange();
        lastRange.begin = secondToLast.begin;
        lastRange.end = secondToLast.end;
        lastRange.dataPartition = this.dataPartitions[this.dataPartitions.length-1];

        dataPartitionRanges.add(lastRange);
    }

    public List<DataPartition> findMatchingPartitions(FileFilter filter)
    {
        // If we don't have a set of partition ranges. There wasn't a TLK
        // associated with the file, so return all partitions.
        if (dataPartitionRanges.size() == 0)
        {
            return Arrays.asList(dataPartitions);
        }

        CompiledFileFilter compiledFileFilter = null;
        try
        {
            compiledFileFilter = new CompiledFileFilter(this.recordDef,filter);
        }
        catch (Exception e)
        {
            return Arrays.asList(dataPartitions);
        }

        ArrayList<DataPartition> matchingPartitions = new ArrayList<DataPartition>();
        for (int i = 0; i < dataPartitionRanges.size(); i++)
        {
            DataPartitionRecordRange partitionRange = dataPartitionRanges.get(i);
            if (compiledFileFilter.partitionMatchesFilter(partitionRange))
            {
                matchingPartitions.add(partitionRange.dataPartition);
            }
        }

        return matchingPartitions;
    }

    public int getNumPartitionRanges()
    {
        return dataPartitionRanges.size();
    }

    public String getPartitionRangeAsString(int index)
    {
        DataPartitionRecordRange range = dataPartitionRanges.get(index);
        String rangeStr = "[" + range.begin.toString() 
                        + "," + range.end.toString() + "]\n";
        return rangeStr;
    }

    @Override
    public String toString()
    {
        String out = "[\n";
        for (int i = 0; i < dataPartitionRanges.size(); i++)
        {
            DataPartitionRecordRange range = dataPartitionRanges.get(i);
            out += i + "\t[" + range.begin.toString() 
                + "," + range.end.toString() + "]\n";
        }
        out += "]\n";
        return out;
    }
};
