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
 * Class name: ExecuteSQLRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.388Z
 */
public class ExecuteSQLRequestWrapper
{
    protected String local_sqlText;
    protected String local_userName;
    protected String local_targetCluster;
    protected AlternateClusters_type0Wrapper local_alternateClusters;
    protected String local_targetQuerySet;
    protected boolean local_suppressResults;
    protected boolean local_suppressXmlSchema;
    protected int local_wait;
    protected int local_resultLimit;
    protected int local_resultWindowStart;
    protected int local_resultWindowCount;
    protected boolean local_ignoreCache;

    public ExecuteSQLRequestWrapper() {}

    public ExecuteSQLRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest executesqlrequest)
    {
        copy( executesqlrequest );
    }
    public ExecuteSQLRequestWrapper( String _sqlText, String _userName, String _targetCluster, AlternateClusters_type0Wrapper _alternateClusters, String _targetQuerySet, boolean _suppressResults, boolean _suppressXmlSchema, int _wait, int _resultLimit, int _resultWindowStart, int _resultWindowCount, boolean _ignoreCache )
    {
        this.local_sqlText = _sqlText;
        this.local_userName = _userName;
        this.local_targetCluster = _targetCluster;
        this.local_alternateClusters = _alternateClusters;
        this.local_targetQuerySet = _targetQuerySet;
        this.local_suppressResults = _suppressResults;
        this.local_suppressXmlSchema = _suppressXmlSchema;
        this.local_wait = _wait;
        this.local_resultLimit = _resultLimit;
        this.local_resultWindowStart = _resultWindowStart;
        this.local_resultWindowCount = _resultWindowCount;
        this.local_ignoreCache = _ignoreCache;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest raw )
    {
        if (raw == null)
            return;

        this.local_sqlText = raw.getSqlText();
        this.local_userName = raw.getUserName();
        this.local_targetCluster = raw.getTargetCluster();
        if (raw.getAlternateClusters() != null)
            this.local_alternateClusters = new AlternateClusters_type0Wrapper( raw.getAlternateClusters());
        this.local_targetQuerySet = raw.getTargetQuerySet();
        this.local_suppressResults = raw.getSuppressResults();
        this.local_suppressXmlSchema = raw.getSuppressXmlSchema();
        this.local_wait = raw.getWait();
        this.local_resultLimit = raw.getResultLimit();
        this.local_resultWindowStart = raw.getResultWindowStart();
        this.local_resultWindowCount = raw.getResultWindowCount();
        this.local_ignoreCache = raw.getIgnoreCache();

    }

    @Override
    public String toString()
    {
        return "ExecuteSQLRequestWrapper [" + "sqlText = " + local_sqlText + ", " + "userName = " + local_userName + ", " + "targetCluster = " + local_targetCluster + ", " + "alternateClusters = " + local_alternateClusters + ", " + "targetQuerySet = " + local_targetQuerySet + ", " + "suppressResults = " + local_suppressResults + ", " + "suppressXmlSchema = " + local_suppressXmlSchema + ", " + "wait = " + local_wait + ", " + "resultLimit = " + local_resultLimit + ", " + "resultWindowStart = " + local_resultWindowStart + ", " + "resultWindowCount = " + local_resultWindowCount + ", " + "ignoreCache = " + local_ignoreCache + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLRequest();
        raw.setSqlText( local_sqlText);
        raw.setUserName( local_userName);
        raw.setTargetCluster( local_targetCluster);
        if (local_alternateClusters != null)
            raw.setAlternateClusters( local_alternateClusters.getRaw());
        raw.setTargetQuerySet( local_targetQuerySet);
        raw.setSuppressResults( local_suppressResults);
        raw.setSuppressXmlSchema( local_suppressXmlSchema);
        raw.setWait( local_wait);
        raw.setResultLimit( local_resultLimit);
        raw.setResultWindowStart( local_resultWindowStart);
        raw.setResultWindowCount( local_resultWindowCount);
        raw.setIgnoreCache( local_ignoreCache);
        return raw;
    }


    public void setSqlText( String _sqlText )
    {
        this.local_sqlText = _sqlText;
    }
    public String getSqlText( )
    {
        return this.local_sqlText;
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
    public void setAlternateClusters( AlternateClusters_type0Wrapper _alternateClusters )
    {
        this.local_alternateClusters = _alternateClusters;
    }
    public AlternateClusters_type0Wrapper getAlternateClusters( )
    {
        return this.local_alternateClusters;
    }
    public void setTargetQuerySet( String _targetQuerySet )
    {
        this.local_targetQuerySet = _targetQuerySet;
    }
    public String getTargetQuerySet( )
    {
        return this.local_targetQuerySet;
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
    public void setResultLimit( int _resultLimit )
    {
        this.local_resultLimit = _resultLimit;
    }
    public int getResultLimit( )
    {
        return this.local_resultLimit;
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
    public void setIgnoreCache( boolean _ignoreCache )
    {
        this.local_ignoreCache = _ignoreCache;
    }
    public boolean getIgnoreCache( )
    {
        return this.local_ignoreCache;
    }
}