package org.hpccsystems.ws.client.wrappers.gen.wsworkunits;



/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2021 HPCC Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfQueryStatsRecordWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.789Z
 */
public class ArrayOfQueryStatsRecordWrapper
{
    protected List<QueryStatsRecordWrapper> local_queryStatsRecord = null;

    public ArrayOfQueryStatsRecordWrapper() {}

    public ArrayOfQueryStatsRecordWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord arrayofquerystatsrecord)
    {
        copy( arrayofquerystatsrecord );
    }
    public ArrayOfQueryStatsRecordWrapper( List<QueryStatsRecordWrapper> _queryStatsRecord )
    {
        this.local_queryStatsRecord = _queryStatsRecord;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord raw )
    {
        if (raw == null)
            return;

        if (raw.getQueryStatsRecord() != null)
        {
            this.local_queryStatsRecord = new ArrayList<QueryStatsRecordWrapper>();
            for ( int i = 0; i < raw.getQueryStatsRecord().length; i++)
            {
                this.local_queryStatsRecord.add(new QueryStatsRecordWrapper(raw.getQueryStatsRecord()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQueryStatsRecordWrapper [" + "queryStatsRecord = " + local_queryStatsRecord + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQueryStatsRecord();
        if (this.local_queryStatsRecord!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStatsRecord[this.local_queryStatsRecord.size()];
            for ( int i = 0; i < this.local_queryStatsRecord.size(); i++)
            {
                arr[i] = this.local_queryStatsRecord.get(i) .getRaw();
            }
            raw.setQueryStatsRecord(arr);
        }
        return raw;
    }


    public void setQueryStatsRecord( List<QueryStatsRecordWrapper> _queryStatsRecord )
    {
        this.local_queryStatsRecord = _queryStatsRecord;
    }
    public List<QueryStatsRecordWrapper> getQueryStatsRecord( )
    {
        return this.local_queryStatsRecord;
    }
}