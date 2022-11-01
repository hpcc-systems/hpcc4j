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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: QueryStatsWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.488Z
 */
public class QueryStatsWrapper
{
    protected String local_iD;
    protected ArrayOfQuerySummaryStatsWrapper local_aggregateQueryStatsList;
    protected ArrayOfQueryStatsRecordWrapper local_queryStatsRecordList;

    public QueryStatsWrapper() {}

    public QueryStatsWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats querystats)
    {
        copy( querystats );
    }
    public QueryStatsWrapper( String _iD, ArrayOfQuerySummaryStatsWrapper _aggregateQueryStatsList, ArrayOfQueryStatsRecordWrapper _queryStatsRecordList )
    {
        this.local_iD = _iD;
        this.local_aggregateQueryStatsList = _aggregateQueryStatsList;
        this.local_queryStatsRecordList = _queryStatsRecordList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats raw )
    {
        if (raw == null)
            return;

        this.local_iD = raw.getID();
        if (raw.getAggregateQueryStatsList() != null)
            this.local_aggregateQueryStatsList = new ArrayOfQuerySummaryStatsWrapper( raw.getAggregateQueryStatsList());
        if (raw.getQueryStatsRecordList() != null)
            this.local_queryStatsRecordList = new ArrayOfQueryStatsRecordWrapper( raw.getQueryStatsRecordList());

    }

    @Override
    public String toString()
    {
        return "QueryStatsWrapper [" + "iD = " + local_iD + ", " + "aggregateQueryStatsList = " + local_aggregateQueryStatsList + ", " + "queryStatsRecordList = " + local_queryStatsRecordList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QueryStats();
        raw.setID( local_iD);
        if (local_aggregateQueryStatsList != null)
            raw.setAggregateQueryStatsList( local_aggregateQueryStatsList.getRaw());
        if (local_queryStatsRecordList != null)
            raw.setQueryStatsRecordList( local_queryStatsRecordList.getRaw());
        return raw;
    }


    public void setID( String _iD )
    {
        this.local_iD = _iD;
    }
    public String getID( )
    {
        return this.local_iD;
    }
    public void setAggregateQueryStatsList( ArrayOfQuerySummaryStatsWrapper _aggregateQueryStatsList )
    {
        this.local_aggregateQueryStatsList = _aggregateQueryStatsList;
    }
    public ArrayOfQuerySummaryStatsWrapper getAggregateQueryStatsList( )
    {
        return this.local_aggregateQueryStatsList;
    }
    public void setQueryStatsRecordList( ArrayOfQueryStatsRecordWrapper _queryStatsRecordList )
    {
        this.local_queryStatsRecordList = _queryStatsRecordList;
    }
    public ArrayOfQueryStatsRecordWrapper getQueryStatsRecordList( )
    {
        return this.local_queryStatsRecordList;
    }
}