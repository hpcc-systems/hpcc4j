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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ExecutePreparedSQLRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.386Z
 */
public class ExecutePreparedSQLRequestWrapper
{
    protected String local_wuId;
    protected String local_userName;
    protected String local_targetCluster;
    protected boolean local_suppressResults;
    protected boolean local_suppressXmlSchema;
    protected int local_wait;
    protected int local_resultWindowStart;
    protected int local_resultWindowCount;
    protected ArrayOfNamedValueWrapper local_variables;

    public ExecutePreparedSQLRequestWrapper() {}

    public ExecutePreparedSQLRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest executepreparedsqlrequest)
    {
        copy( executepreparedsqlrequest );
    }
    public ExecutePreparedSQLRequestWrapper( String _wuId, String _userName, String _targetCluster, boolean _suppressResults, boolean _suppressXmlSchema, int _wait, int _resultWindowStart, int _resultWindowCount, ArrayOfNamedValueWrapper _variables )
    {
        this.local_wuId = _wuId;
        this.local_userName = _userName;
        this.local_targetCluster = _targetCluster;
        this.local_suppressResults = _suppressResults;
        this.local_suppressXmlSchema = _suppressXmlSchema;
        this.local_wait = _wait;
        this.local_resultWindowStart = _resultWindowStart;
        this.local_resultWindowCount = _resultWindowCount;
        this.local_variables = _variables;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest raw )
    {
        if (raw == null)
            return;

        this.local_wuId = raw.getWuId();
        this.local_userName = raw.getUserName();
        this.local_targetCluster = raw.getTargetCluster();
        this.local_suppressResults = raw.getSuppressResults();
        this.local_suppressXmlSchema = raw.getSuppressXmlSchema();
        this.local_wait = raw.getWait();
        this.local_resultWindowStart = raw.getResultWindowStart();
        this.local_resultWindowCount = raw.getResultWindowCount();
        if (raw.getVariables() != null)
            this.local_variables = new ArrayOfNamedValueWrapper( raw.getVariables());

    }

    @Override
    public String toString()
    {
        return "ExecutePreparedSQLRequestWrapper [" + "wuId = " + local_wuId + ", " + "userName = " + local_userName + ", " + "targetCluster = " + local_targetCluster + ", " + "suppressResults = " + local_suppressResults + ", " + "suppressXmlSchema = " + local_suppressXmlSchema + ", " + "wait = " + local_wait + ", " + "resultWindowStart = " + local_resultWindowStart + ", " + "resultWindowCount = " + local_resultWindowCount + ", " + "variables = " + local_variables + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecutePreparedSQLRequest();
        raw.setWuId( local_wuId);
        raw.setUserName( local_userName);
        raw.setTargetCluster( local_targetCluster);
        raw.setSuppressResults( local_suppressResults);
        raw.setSuppressXmlSchema( local_suppressXmlSchema);
        raw.setWait( local_wait);
        raw.setResultWindowStart( local_resultWindowStart);
        raw.setResultWindowCount( local_resultWindowCount);
        if (local_variables != null)
            raw.setVariables( local_variables.getRaw());
        return raw;
    }


    public void setWuId( String _wuId )
    {
        this.local_wuId = _wuId;
    }
    public String getWuId( )
    {
        return this.local_wuId;
    }
    public void setUserName( String _userName )
    {
        this.local_userName = _userName;
    }
    public String getUserName( )
    {
        return this.local_userName;
    }
    public void setTargetCluster( String _targetCluster )
    {
        this.local_targetCluster = _targetCluster;
    }
    public String getTargetCluster( )
    {
        return this.local_targetCluster;
    }
    public void setSuppressResults( boolean _suppressResults )
    {
        this.local_suppressResults = _suppressResults;
    }
    public boolean getSuppressResults( )
    {
        return this.local_suppressResults;
    }
    public void setSuppressXmlSchema( boolean _suppressXmlSchema )
    {
        this.local_suppressXmlSchema = _suppressXmlSchema;
    }
    public boolean getSuppressXmlSchema( )
    {
        return this.local_suppressXmlSchema;
    }
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
    public void setResultWindowStart( int _resultWindowStart )
    {
        this.local_resultWindowStart = _resultWindowStart;
    }
    public int getResultWindowStart( )
    {
        return this.local_resultWindowStart;
    }
    public void setResultWindowCount( int _resultWindowCount )
    {
        this.local_resultWindowCount = _resultWindowCount;
    }
    public int getResultWindowCount( )
    {
        return this.local_resultWindowCount;
    }
    public void setVariables( ArrayOfNamedValueWrapper _variables )
    {
        this.local_variables = _variables;
    }
    public ArrayOfNamedValueWrapper getVariables( )
    {
        return this.local_variables;
    }
}