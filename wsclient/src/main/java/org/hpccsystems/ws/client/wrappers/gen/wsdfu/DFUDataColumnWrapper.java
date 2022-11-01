package org.hpccsystems.ws.client.wrappers.gen.wsdfu;



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
 * Class name: DFUDataColumnWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.864Z
 */
public class DFUDataColumnWrapper
{
    protected int local_columnID;
    protected String local_columnLabel;
    protected String local_columnType;
    protected String local_columnValue;
    protected int local_columnSize;
    protected int local_maxSize;
    protected String local_columnEclType;
    protected int local_columnRawSize;
    protected boolean local_isNaturalColumn;
    protected boolean local_isKeyedColumn;
    protected ArrayOfDFUDataColumnWrapper local_dataColumns;

    public DFUDataColumnWrapper() {}

    public DFUDataColumnWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn dfudatacolumn)
    {
        copy( dfudatacolumn );
    }
    public DFUDataColumnWrapper( int _columnID, String _columnLabel, String _columnType, String _columnValue, int _columnSize, int _maxSize, String _columnEclType, int _columnRawSize, boolean _isNaturalColumn, boolean _isKeyedColumn, ArrayOfDFUDataColumnWrapper _dataColumns )
    {
        this.local_columnID = _columnID;
        this.local_columnLabel = _columnLabel;
        this.local_columnType = _columnType;
        this.local_columnValue = _columnValue;
        this.local_columnSize = _columnSize;
        this.local_maxSize = _maxSize;
        this.local_columnEclType = _columnEclType;
        this.local_columnRawSize = _columnRawSize;
        this.local_isNaturalColumn = _isNaturalColumn;
        this.local_isKeyedColumn = _isKeyedColumn;
        this.local_dataColumns = _dataColumns;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn raw )
    {
        if (raw == null)
            return;

        this.local_columnID = raw.getColumnID();
        this.local_columnLabel = raw.getColumnLabel();
        this.local_columnType = raw.getColumnType();
        this.local_columnValue = raw.getColumnValue();
        this.local_columnSize = raw.getColumnSize();
        this.local_maxSize = raw.getMaxSize();
        this.local_columnEclType = raw.getColumnEclType();
        this.local_columnRawSize = raw.getColumnRawSize();
        this.local_isNaturalColumn = raw.getIsNaturalColumn();
        this.local_isKeyedColumn = raw.getIsKeyedColumn();
        if (raw.getDataColumns() != null)
            this.local_dataColumns = new ArrayOfDFUDataColumnWrapper( raw.getDataColumns());

    }

    @Override
    public String toString()
    {
        return "DFUDataColumnWrapper [" + "columnID = " + local_columnID + ", " + "columnLabel = " + local_columnLabel + ", " + "columnType = " + local_columnType + ", " + "columnValue = " + local_columnValue + ", " + "columnSize = " + local_columnSize + ", " + "maxSize = " + local_maxSize + ", " + "columnEclType = " + local_columnEclType + ", " + "columnRawSize = " + local_columnRawSize + ", " + "isNaturalColumn = " + local_isNaturalColumn + ", " + "isKeyedColumn = " + local_isKeyedColumn + ", " + "dataColumns = " + local_dataColumns + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUDataColumn();
        raw.setColumnID( local_columnID);
        raw.setColumnLabel( local_columnLabel);
        raw.setColumnType( local_columnType);
        raw.setColumnValue( local_columnValue);
        raw.setColumnSize( local_columnSize);
        raw.setMaxSize( local_maxSize);
        raw.setColumnEclType( local_columnEclType);
        raw.setColumnRawSize( local_columnRawSize);
        raw.setIsNaturalColumn( local_isNaturalColumn);
        raw.setIsKeyedColumn( local_isKeyedColumn);
        raw.setDataColumns( local_dataColumns.getRaw());
        return raw;
    }


    public void setColumnID( int _columnID )
    {
        this.local_columnID = _columnID;
    }
    public int getColumnID( )
    {
        return this.local_columnID;
    }
    public void setColumnLabel( String _columnLabel )
    {
        this.local_columnLabel = _columnLabel;
    }
    public String getColumnLabel( )
    {
        return this.local_columnLabel;
    }
    public void setColumnType( String _columnType )
    {
        this.local_columnType = _columnType;
    }
    public String getColumnType( )
    {
        return this.local_columnType;
    }
    public void setColumnValue( String _columnValue )
    {
        this.local_columnValue = _columnValue;
    }
    public String getColumnValue( )
    {
        return this.local_columnValue;
    }
    public void setColumnSize( int _columnSize )
    {
        this.local_columnSize = _columnSize;
    }
    public int getColumnSize( )
    {
        return this.local_columnSize;
    }
    public void setMaxSize( int _maxSize )
    {
        this.local_maxSize = _maxSize;
    }
    public int getMaxSize( )
    {
        return this.local_maxSize;
    }
    public void setColumnEclType( String _columnEclType )
    {
        this.local_columnEclType = _columnEclType;
    }
    public String getColumnEclType( )
    {
        return this.local_columnEclType;
    }
    public void setColumnRawSize( int _columnRawSize )
    {
        this.local_columnRawSize = _columnRawSize;
    }
    public int getColumnRawSize( )
    {
        return this.local_columnRawSize;
    }
    public void setIsNaturalColumn( boolean _isNaturalColumn )
    {
        this.local_isNaturalColumn = _isNaturalColumn;
    }
    public boolean getIsNaturalColumn( )
    {
        return this.local_isNaturalColumn;
    }
    public void setIsKeyedColumn( boolean _isKeyedColumn )
    {
        this.local_isKeyedColumn = _isKeyedColumn;
    }
    public boolean getIsKeyedColumn( )
    {
        return this.local_isKeyedColumn;
    }
    public void setDataColumns( ArrayOfDFUDataColumnWrapper _dataColumns )
    {
        this.local_dataColumns = _dataColumns;
    }
    public ArrayOfDFUDataColumnWrapper getDataColumns( )
    {
        return this.local_dataColumns;
    }
}