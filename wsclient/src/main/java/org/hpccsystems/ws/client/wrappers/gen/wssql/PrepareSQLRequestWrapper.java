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
 * Class name: PrepareSQLRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.402Z
 */
public class PrepareSQLRequestWrapper
{
    protected String local_sqlText;
    protected String local_targetCluster;
    protected AlternateClusters_type1Wrapper local_alternateClusters;
    protected String local_targetQuerySet;
    protected int local_wait;

    public PrepareSQLRequestWrapper() {}

    public PrepareSQLRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest preparesqlrequest)
    {
        copy( preparesqlrequest );
    }
    public PrepareSQLRequestWrapper( String _sqlText, String _targetCluster, AlternateClusters_type1Wrapper _alternateClusters, String _targetQuerySet, int _wait )
    {
        this.local_sqlText = _sqlText;
        this.local_targetCluster = _targetCluster;
        this.local_alternateClusters = _alternateClusters;
        this.local_targetQuerySet = _targetQuerySet;
        this.local_wait = _wait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest raw )
    {
        if (raw == null)
            return;

        this.local_sqlText = raw.getSqlText();
        this.local_targetCluster = raw.getTargetCluster();
        if (raw.getAlternateClusters() != null)
            this.local_alternateClusters = new AlternateClusters_type1Wrapper( raw.getAlternateClusters());
        this.local_targetQuerySet = raw.getTargetQuerySet();
        this.local_wait = raw.getWait();

    }

    @Override
    public String toString()
    {
        return "PrepareSQLRequestWrapper [" + "sqlText = " + local_sqlText + ", " + "targetCluster = " + local_targetCluster + ", " + "alternateClusters = " + local_alternateClusters + ", " + "targetQuerySet = " + local_targetQuerySet + ", " + "wait = " + local_wait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.PrepareSQLRequest();
        raw.setSqlText( local_sqlText);
        raw.setTargetCluster( local_targetCluster);
        if (local_alternateClusters != null)
            raw.setAlternateClusters( local_alternateClusters.getRaw());
        raw.setTargetQuerySet( local_targetQuerySet);
        raw.setWait( local_wait);
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
    public void setTargetCluster( String _targetCluster )
    {
        this.local_targetCluster = _targetCluster;
    }
    public String getTargetCluster( )
    {
        return this.local_targetCluster;
    }
    public void setAlternateClusters( AlternateClusters_type1Wrapper _alternateClusters )
    {
        this.local_alternateClusters = _alternateClusters;
    }
    public AlternateClusters_type1Wrapper getAlternateClusters( )
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
    public void setWait( int _wait )
    {
        this.local_wait = _wait;
    }
    public int getWait( )
    {
        return this.local_wait;
    }
}