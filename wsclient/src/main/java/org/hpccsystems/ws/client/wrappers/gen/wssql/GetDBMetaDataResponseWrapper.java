package org.hpccsystems.ws.client.wrappers.gen.wssql;



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
import java.math.BigInteger;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: GetDBMetaDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.392Z
 */
public class GetDBMetaDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected Tables_type0Wrapper local_tables;
    protected BigInteger local_tableCount;
    protected QuerySets_type0Wrapper local_querySets;
    protected ClusterNames_type0Wrapper local_clusterNames;

    public GetDBMetaDataResponseWrapper() {}

    public GetDBMetaDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse getdbmetadataresponse)
    {
        copy( getdbmetadataresponse );
    }
    public GetDBMetaDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, Tables_type0Wrapper _tables, BigInteger _tableCount, QuerySets_type0Wrapper _querySets, ClusterNames_type0Wrapper _clusterNames )
    {
        this.local_exceptions = _exceptions;
        this.local_tables = _tables;
        this.local_tableCount = _tableCount;
        this.local_querySets = _querySets;
        this.local_clusterNames = _clusterNames;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getTables() != null)
            this.local_tables = new Tables_type0Wrapper( raw.getTables());
        this.local_tableCount = raw.getTableCount();
        if (raw.getQuerySets() != null)
            this.local_querySets = new QuerySets_type0Wrapper( raw.getQuerySets());
        if (raw.getClusterNames() != null)
            this.local_clusterNames = new ClusterNames_type0Wrapper( raw.getClusterNames());

    }

    @Override
    public String toString()
    {
        return "GetDBMetaDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tables = " + local_tables + ", " + "tableCount = " + local_tableCount + ", " + "querySets = " + local_querySets + ", " + "clusterNames = " + local_clusterNames + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.GetDBMetaDataResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_tables != null)
            raw.setTables( local_tables.getRaw());
        raw.setTableCount( local_tableCount);
        if (local_querySets != null)
            raw.setQuerySets( local_querySets.getRaw());
        if (local_clusterNames != null)
            raw.setClusterNames( local_clusterNames.getRaw());
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
    public void setTables( Tables_type0Wrapper _tables )
    {
        this.local_tables = _tables;
    }
    public Tables_type0Wrapper getTables( )
    {
        return this.local_tables;
    }
    public void setTableCount( BigInteger _tableCount )
    {
        this.local_tableCount = _tableCount;
    }
    public BigInteger getTableCount( )
    {
        return this.local_tableCount;
    }
    public void setQuerySets( QuerySets_type0Wrapper _querySets )
    {
        this.local_querySets = _querySets;
    }
    public QuerySets_type0Wrapper getQuerySets( )
    {
        return this.local_querySets;
    }
    public void setClusterNames( ClusterNames_type0Wrapper _clusterNames )
    {
        this.local_clusterNames = _clusterNames;
    }
    public ClusterNames_type0Wrapper getClusterNames( )
    {
        return this.local_clusterNames;
    }
}