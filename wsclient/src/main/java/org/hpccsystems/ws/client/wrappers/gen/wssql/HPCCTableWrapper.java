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
 * Class name: HPCCTableWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.398Z
 */
public class HPCCTableWrapper
{
    protected String local_name;
    protected Columns_type1Wrapper local_columns;
    protected String local_eCL;
    protected String local_format;
    protected String local_contentType;
    protected String local_description;
    protected boolean local_isKeyed;
    protected boolean local_isSuper;
    protected String local_csvQuote;
    protected String local_csvSeparate;
    protected String local_csvTerminate;
    protected String local_group;
    protected BigInteger local_maxRecordSize;
    protected String local_modified;
    protected BigInteger local_numParts;
    protected String local_owner;

    public HPCCTableWrapper() {}

    public HPCCTableWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable hpcctable)
    {
        copy( hpcctable );
    }
    public HPCCTableWrapper( String _name, Columns_type1Wrapper _columns, String _eCL, String _format, String _contentType, String _description, boolean _isKeyed, boolean _isSuper, String _csvQuote, String _csvSeparate, String _csvTerminate, String _group, BigInteger _maxRecordSize, String _modified, BigInteger _numParts, String _owner )
    {
        this.local_name = _name;
        this.local_columns = _columns;
        this.local_eCL = _eCL;
        this.local_format = _format;
        this.local_contentType = _contentType;
        this.local_description = _description;
        this.local_isKeyed = _isKeyed;
        this.local_isSuper = _isSuper;
        this.local_csvQuote = _csvQuote;
        this.local_csvSeparate = _csvSeparate;
        this.local_csvTerminate = _csvTerminate;
        this.local_group = _group;
        this.local_maxRecordSize = _maxRecordSize;
        this.local_modified = _modified;
        this.local_numParts = _numParts;
        this.local_owner = _owner;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        if (raw.getColumns() != null)
            this.local_columns = new Columns_type1Wrapper( raw.getColumns());
        this.local_eCL = raw.getECL();
        this.local_format = raw.getFormat();
        this.local_contentType = raw.getContentType();
        this.local_description = raw.getDescription();
        this.local_isKeyed = raw.getIsKeyed();
        this.local_isSuper = raw.getIsSuper();
        this.local_csvQuote = raw.getCsvQuote();
        this.local_csvSeparate = raw.getCsvSeparate();
        this.local_csvTerminate = raw.getCsvTerminate();
        this.local_group = raw.getGroup();
        this.local_maxRecordSize = raw.getMaxRecordSize();
        this.local_modified = raw.getModified();
        this.local_numParts = raw.getNumParts();
        this.local_owner = raw.getOwner();

    }

    @Override
    public String toString()
    {
        return "HPCCTableWrapper [" + "name = " + local_name + ", " + "columns = " + local_columns + ", " + "eCL = " + local_eCL + ", " + "format = " + local_format + ", " + "contentType = " + local_contentType + ", " + "description = " + local_description + ", " + "isKeyed = " + local_isKeyed + ", " + "isSuper = " + local_isSuper + ", " + "csvQuote = " + local_csvQuote + ", " + "csvSeparate = " + local_csvSeparate + ", " + "csvTerminate = " + local_csvTerminate + ", " + "group = " + local_group + ", " + "maxRecordSize = " + local_maxRecordSize + ", " + "modified = " + local_modified + ", " + "numParts = " + local_numParts + ", " + "owner = " + local_owner + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.HPCCTable();
        raw.setName( local_name);
        if (local_columns != null)
            raw.setColumns( local_columns.getRaw());
        raw.setECL( local_eCL);
        raw.setFormat( local_format);
        raw.setContentType( local_contentType);
        raw.setDescription( local_description);
        raw.setIsKeyed( local_isKeyed);
        raw.setIsSuper( local_isSuper);
        raw.setCsvQuote( local_csvQuote);
        raw.setCsvSeparate( local_csvSeparate);
        raw.setCsvTerminate( local_csvTerminate);
        raw.setGroup( local_group);
        raw.setMaxRecordSize( local_maxRecordSize);
        raw.setModified( local_modified);
        raw.setNumParts( local_numParts);
        raw.setOwner( local_owner);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setColumns( Columns_type1Wrapper _columns )
    {
        this.local_columns = _columns;
    }
    public Columns_type1Wrapper getColumns( )
    {
        return this.local_columns;
    }
    public void setECL( String _eCL )
    {
        this.local_eCL = _eCL;
    }
    public String getECL( )
    {
        return this.local_eCL;
    }
    public void setFormat( String _format )
    {
        this.local_format = _format;
    }
    public String getFormat( )
    {
        return this.local_format;
    }
    public void setContentType( String _contentType )
    {
        this.local_contentType = _contentType;
    }
    public String getContentType( )
    {
        return this.local_contentType;
    }
    public void setDescription( String _description )
    {
        this.local_description = _description;
    }
    public String getDescription( )
    {
        return this.local_description;
    }
    public void setIsKeyed( boolean _isKeyed )
    {
        this.local_isKeyed = _isKeyed;
    }
    public boolean getIsKeyed( )
    {
        return this.local_isKeyed;
    }
    public void setIsSuper( boolean _isSuper )
    {
        this.local_isSuper = _isSuper;
    }
    public boolean getIsSuper( )
    {
        return this.local_isSuper;
    }
    public void setCsvQuote( String _csvQuote )
    {
        this.local_csvQuote = _csvQuote;
    }
    public String getCsvQuote( )
    {
        return this.local_csvQuote;
    }
    public void setCsvSeparate( String _csvSeparate )
    {
        this.local_csvSeparate = _csvSeparate;
    }
    public String getCsvSeparate( )
    {
        return this.local_csvSeparate;
    }
    public void setCsvTerminate( String _csvTerminate )
    {
        this.local_csvTerminate = _csvTerminate;
    }
    public String getCsvTerminate( )
    {
        return this.local_csvTerminate;
    }
    public void setGroup( String _group )
    {
        this.local_group = _group;
    }
    public String getGroup( )
    {
        return this.local_group;
    }
    public void setMaxRecordSize( BigInteger _maxRecordSize )
    {
        this.local_maxRecordSize = _maxRecordSize;
    }
    public BigInteger getMaxRecordSize( )
    {
        return this.local_maxRecordSize;
    }
    public void setModified( String _modified )
    {
        this.local_modified = _modified;
    }
    public String getModified( )
    {
        return this.local_modified;
    }
    public void setNumParts( BigInteger _numParts )
    {
        this.local_numParts = _numParts;
    }
    public BigInteger getNumParts( )
    {
        return this.local_numParts;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
}