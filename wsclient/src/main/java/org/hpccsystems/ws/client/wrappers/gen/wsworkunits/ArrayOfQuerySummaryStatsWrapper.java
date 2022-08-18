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
 * Class name: ArrayOfQuerySummaryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.790Z
 */
public class ArrayOfQuerySummaryStatsWrapper
{
    protected List<QuerySummaryStatsWrapper> local_querySummaryStats = null;

    public ArrayOfQuerySummaryStatsWrapper() {}

    public ArrayOfQuerySummaryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats arrayofquerysummarystats)
    {
        copy( arrayofquerysummarystats );
    }
    public ArrayOfQuerySummaryStatsWrapper( List<QuerySummaryStatsWrapper> _querySummaryStats )
    {
        this.local_querySummaryStats = _querySummaryStats;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats raw )
    {
        if (raw == null)
            return;

        if (raw.getQuerySummaryStats() != null)
        {
            this.local_querySummaryStats = new ArrayList<QuerySummaryStatsWrapper>();
            for ( int i = 0; i < raw.getQuerySummaryStats().length; i++)
            {
                this.local_querySummaryStats.add(new QuerySummaryStatsWrapper(raw.getQuerySummaryStats()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfQuerySummaryStatsWrapper [" + "querySummaryStats = " + local_querySummaryStats + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfQuerySummaryStats();
        if (this.local_querySummaryStats!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats[] arr = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySummaryStats[this.local_querySummaryStats.size()];
            for ( int i = 0; i < this.local_querySummaryStats.size(); i++)
            {
                arr[i] = this.local_querySummaryStats.get(i) .getRaw();
            }
            raw.setQuerySummaryStats(arr);
        }
        return raw;
    }


    public void setQuerySummaryStats( List<QuerySummaryStatsWrapper> _querySummaryStats )
    {
        this.local_querySummaryStats = _querySummaryStats;
    }
    public List<QuerySummaryStatsWrapper> getQuerySummaryStats( )
    {
        return this.local_querySummaryStats;
    }
}