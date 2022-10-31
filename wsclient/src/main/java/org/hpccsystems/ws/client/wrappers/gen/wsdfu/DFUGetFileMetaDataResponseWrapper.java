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
 * Class name: DFUGetFileMetaDataResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.895Z
 */
public class DFUGetFileMetaDataResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected int local_totalColumnCount;
    protected int local_keyedColumnCount;
    protected ArrayOfDFUDataColumnWrapper local_dataColumns;
    protected String local_xmlSchema;
    protected String local_xmlXPathSchema;
    protected long local_totalResultRows;

    public DFUGetFileMetaDataResponseWrapper() {}

    public DFUGetFileMetaDataResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse dfugetfilemetadataresponse)
    {
        copy( dfugetfilemetadataresponse );
    }
    public DFUGetFileMetaDataResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, int _totalColumnCount, int _keyedColumnCount, ArrayOfDFUDataColumnWrapper _dataColumns, String _xmlSchema, String _xmlXPathSchema, long _totalResultRows )
    {
        this.local_exceptions = _exceptions;
        this.local_totalColumnCount = _totalColumnCount;
        this.local_keyedColumnCount = _keyedColumnCount;
        this.local_dataColumns = _dataColumns;
        this.local_xmlSchema = _xmlSchema;
        this.local_xmlXPathSchema = _xmlXPathSchema;
        this.local_totalResultRows = _totalResultRows;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_totalColumnCount = raw.getTotalColumnCount();
        this.local_keyedColumnCount = raw.getKeyedColumnCount();
        if (raw.getDataColumns() != null)
            this.local_dataColumns = new ArrayOfDFUDataColumnWrapper( raw.getDataColumns());
        this.local_xmlSchema = raw.getXmlSchema();
        this.local_xmlXPathSchema = raw.getXmlXPathSchema();
        this.local_totalResultRows = raw.getTotalResultRows();

    }

    @Override
    public String toString()
    {
        return "DFUGetFileMetaDataResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "totalColumnCount = " + local_totalColumnCount + ", " + "keyedColumnCount = " + local_keyedColumnCount + ", " + "dataColumns = " + local_dataColumns + ", " + "xmlSchema = " + local_xmlSchema + ", " + "xmlXPathSchema = " + local_xmlXPathSchema + ", " + "totalResultRows = " + local_totalResultRows + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setTotalColumnCount( local_totalColumnCount);
        raw.setKeyedColumnCount( local_keyedColumnCount);
        raw.setDataColumns( local_dataColumns.getRaw());
        raw.setXmlSchema( local_xmlSchema);
        raw.setXmlXPathSchema( local_xmlXPathSchema);
        raw.setTotalResultRows( local_totalResultRows);
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
    public void setTotalColumnCount( int _totalColumnCount )
    {
        this.local_totalColumnCount = _totalColumnCount;
    }
    public int getTotalColumnCount( )
    {
        return this.local_totalColumnCount;
    }
    public void setKeyedColumnCount( int _keyedColumnCount )
    {
        this.local_keyedColumnCount = _keyedColumnCount;
    }
    public int getKeyedColumnCount( )
    {
        return this.local_keyedColumnCount;
    }
    public void setDataColumns( ArrayOfDFUDataColumnWrapper _dataColumns )
    {
        this.local_dataColumns = _dataColumns;
    }
    public ArrayOfDFUDataColumnWrapper getDataColumns( )
    {
        return this.local_dataColumns;
    }
    public void setXmlSchema( String _xmlSchema )
    {
        this.local_xmlSchema = _xmlSchema;
    }
    public String getXmlSchema( )
    {
        return this.local_xmlSchema;
    }
    public void setXmlXPathSchema( String _xmlXPathSchema )
    {
        this.local_xmlXPathSchema = _xmlXPathSchema;
    }
    public String getXmlXPathSchema( )
    {
        return this.local_xmlXPathSchema;
    }
    public void setTotalResultRows( long _totalResultRows )
    {
        this.local_totalResultRows = _totalResultRows;
    }
    public long getTotalResultRows( )
    {
        return this.local_totalResultRows;
    }
}