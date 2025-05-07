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
import org.apache.axiom.om.OMElement;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: CreateTableAndLoadRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class CreateTableAndLoadRequestWrapper
{
    protected String local_tableName;
    protected String local_tableDescription;
    protected OMElement local_overwrite;
    protected EclFields_type0Wrapper local_eclFields;
    protected String local_targetCluster;
    protected String local_owner;
    protected DataSourceInfoWrapper local_dataSource;
    protected DataTypeWrapper local_dataSourceType;
    protected int local_wait;

    public CreateTableAndLoadRequestWrapper() {}

    public CreateTableAndLoadRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest createtableandloadrequest)
    {
        copy( createtableandloadrequest );
    }
    public CreateTableAndLoadRequestWrapper( String _tableName, String _tableDescription, OMElement _overwrite, EclFields_type0Wrapper _eclFields, String _targetCluster, String _owner, DataSourceInfoWrapper _dataSource, DataTypeWrapper _dataSourceType, int _wait )
    {
        this.local_tableName = _tableName;
        this.local_tableDescription = _tableDescription;
        this.local_overwrite = _overwrite;
        this.local_eclFields = _eclFields;
        this.local_targetCluster = _targetCluster;
        this.local_owner = _owner;
        this.local_dataSource = _dataSource;
        this.local_dataSourceType = _dataSourceType;
        this.local_wait = _wait;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest raw )
    {
        if (raw == null)
            return;

        this.local_tableName = raw.getTableName();
        this.local_tableDescription = raw.getTableDescription();
        this.local_overwrite = raw.getOverwrite();
        if (raw.getEclFields() != null)
            this.local_eclFields = new EclFields_type0Wrapper( raw.getEclFields());
        this.local_targetCluster = raw.getTargetCluster();
        this.local_owner = raw.getOwner();
        if (raw.getDataSource() != null)
            this.local_dataSource = new DataSourceInfoWrapper( raw.getDataSource());
        if (raw.getDataSourceType() != null)
            this.local_dataSourceType = new DataTypeWrapper( raw.getDataSourceType());
        this.local_wait = raw.getWait();

    }

    @Override
    public String toString()
    {
        return "CreateTableAndLoadRequestWrapper [" + "tableName = " + local_tableName + ", " + "tableDescription = " + local_tableDescription + ", " + "overwrite = " + local_overwrite + ", " + "eclFields = " + local_eclFields + ", " + "targetCluster = " + local_targetCluster + ", " + "owner = " + local_owner + ", " + "dataSource = " + local_dataSource + ", " + "dataSourceType = " + local_dataSourceType + ", " + "wait = " + local_wait + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.CreateTableAndLoadRequest();
        raw.setTableName( local_tableName);
        raw.setTableDescription( local_tableDescription);
        raw.setOverwrite( local_overwrite);
        if (local_eclFields != null)
            raw.setEclFields( local_eclFields.getRaw());
        raw.setTargetCluster( local_targetCluster);
        raw.setOwner( local_owner);
        if (local_dataSource != null)
            raw.setDataSource( local_dataSource.getRaw());
        if (local_dataSourceType != null)
            raw.setDataSourceType( local_dataSourceType.getRaw());
        raw.setWait( local_wait);
        return raw;
    }


    public void setTableName( String _tableName )
    {
        this.local_tableName = _tableName;
    }
    public String getTableName( )
    {
        return this.local_tableName;
    }
    public void setTableDescription( String _tableDescription )
    {
        this.local_tableDescription = _tableDescription;
    }
    public String getTableDescription( )
    {
        return this.local_tableDescription;
    }
    public void setOverwrite( OMElement _overwrite )
    {
        this.local_overwrite = _overwrite;
    }
    public OMElement getOverwrite( )
    {
        return this.local_overwrite;
    }
    public void setEclFields( EclFields_type0Wrapper _eclFields )
    {
        this.local_eclFields = _eclFields;
    }
    public EclFields_type0Wrapper getEclFields( )
    {
        return this.local_eclFields;
    }
    public void setTargetCluster( String _targetCluster )
    {
        this.local_targetCluster = _targetCluster;
    }
    public String getTargetCluster( )
    {
        return this.local_targetCluster;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setDataSource( DataSourceInfoWrapper _dataSource )
    {
        this.local_dataSource = _dataSource;
    }
    public DataSourceInfoWrapper getDataSource( )
    {
        return this.local_dataSource;
    }
    public void setDataSourceType( DataTypeWrapper _dataSourceType )
    {
        this.local_dataSourceType = _dataSourceType;
    }
    public DataTypeWrapper getDataSourceType( )
    {
        return this.local_dataSourceType;
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