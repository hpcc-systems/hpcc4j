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
 * Class name: ECLSchemaItemWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.808Z
 */
public class ECLSchemaItemWrapper
{
    protected String local_columnName;
    protected String local_columnType;
    protected int local_columnTypeCode;
    protected boolean local_isConditional;

    public ECLSchemaItemWrapper() {}

    public ECLSchemaItemWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem eclschemaitem)
    {
        copy( eclschemaitem );
    }
    public ECLSchemaItemWrapper( String _columnName, String _columnType, int _columnTypeCode, boolean _isConditional )
    {
        this.local_columnName = _columnName;
        this.local_columnType = _columnType;
        this.local_columnTypeCode = _columnTypeCode;
        this.local_isConditional = _isConditional;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem raw )
    {
        if (raw == null)
            return;

        this.local_columnName = raw.getColumnName();
        this.local_columnType = raw.getColumnType();
        this.local_columnTypeCode = raw.getColumnTypeCode();
        this.local_isConditional = raw.getIsConditional();

    }

    @Override
    public String toString()
    {
        return "ECLSchemaItemWrapper [" + "columnName = " + local_columnName + ", " + "columnType = " + local_columnType + ", " + "columnTypeCode = " + local_columnTypeCode + ", " + "isConditional = " + local_isConditional + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLSchemaItem();
        raw.setColumnName( local_columnName);
        raw.setColumnType( local_columnType);
        raw.setColumnTypeCode( local_columnTypeCode);
        raw.setIsConditional( local_isConditional);
        return raw;
    }


    public void setColumnName( String _columnName )
    {
        this.local_columnName = _columnName;
    }
    public String getColumnName( )
    {
        return this.local_columnName;
    }
    public void setColumnType( String _columnType )
    {
        this.local_columnType = _columnType;
    }
    public String getColumnType( )
    {
        return this.local_columnType;
    }
    public void setColumnTypeCode( int _columnTypeCode )
    {
        this.local_columnTypeCode = _columnTypeCode;
    }
    public int getColumnTypeCode( )
    {
        return this.local_columnTypeCode;
    }
    public void setIsConditional( boolean _isConditional )
    {
        this.local_isConditional = _isConditional;
    }
    public boolean getIsConditional( )
    {
        return this.local_isConditional;
    }
}