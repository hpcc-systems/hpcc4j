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
 * Class name: WUQueryGetSummaryStatsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.969Z
 */
public class WUQueryGetSummaryStatsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfQuerySummaryStatsWrapper local_statsList;
    protected ArrayOfEndpointQueryStatsWrapper local_queryStatsList;

    public WUQueryGetSummaryStatsResponseWrapper() {}

    public WUQueryGetSummaryStatsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse wuquerygetsummarystatsresponse)
    {
        copy( wuquerygetsummarystatsresponse );
    }
    public WUQueryGetSummaryStatsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfQuerySummaryStatsWrapper _statsList, ArrayOfEndpointQueryStatsWrapper _queryStatsList )
    {
        this.local_exceptions = _exceptions;
        this.local_statsList = _statsList;
        this.local_queryStatsList = _queryStatsList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStatsList() != null)
            this.local_statsList = new ArrayOfQuerySummaryStatsWrapper( raw.getStatsList());
        if (raw.getQueryStatsList() != null)
            this.local_queryStatsList = new ArrayOfEndpointQueryStatsWrapper( raw.getQueryStatsList());

    }

    @Override
    public String toString()
    {
        return "WUQueryGetSummaryStatsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "statsList = " + local_statsList + ", " + "queryStatsList = " + local_queryStatsList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetSummaryStatsResponse();
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
    }
    public void setStatsList( ArrayOfQuerySummaryStatsWrapper _statsList )
    {
        this.local_statsList = _statsList;
    }
    public ArrayOfQuerySummaryStatsWrapper getStatsList( )
    {
        return this.local_statsList;
    }
    public void setQueryStatsList( ArrayOfEndpointQueryStatsWrapper _queryStatsList )
    {
        this.local_queryStatsList = _queryStatsList;
    }
    public ArrayOfEndpointQueryStatsWrapper getQueryStatsList( )
    {
        return this.local_queryStatsList;
    }
}