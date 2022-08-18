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
 * Class name: ECLResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.808Z
 */
public class ECLResultWrapper
{
    protected String local_name;
    protected int local_sequence;
    protected String local_value;
    protected String local_link;
    protected String local_fileName;
    protected boolean local_isSupplied;
    protected boolean local_showFileContent;
    protected long local_total;
    protected ArrayOfECLSchemaItemWrapper local_eCLSchemas;
    protected String local_xmlSchema;

    public ECLResultWrapper() {}

    public ECLResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult eclresult)
    {
        copy( eclresult );
    }
    public ECLResultWrapper( String _name, int _sequence, String _value, String _link, String _fileName, boolean _isSupplied, boolean _showFileContent, long _total, ArrayOfECLSchemaItemWrapper _eCLSchemas, String _xmlSchema )
    {
        this.local_name = _name;
        this.local_sequence = _sequence;
        this.local_value = _value;
        this.local_link = _link;
        this.local_fileName = _fileName;
        this.local_isSupplied = _isSupplied;
        this.local_showFileContent = _showFileContent;
        this.local_total = _total;
        this.local_eCLSchemas = _eCLSchemas;
        this.local_xmlSchema = _xmlSchema;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_sequence = raw.getSequence();
        this.local_value = raw.getValue();
        this.local_link = raw.getLink();
        this.local_fileName = raw.getFileName();
        this.local_isSupplied = raw.getIsSupplied();
        this.local_showFileContent = raw.getShowFileContent();
        this.local_total = raw.getTotal();
        if (raw.getECLSchemas() != null)
            this.local_eCLSchemas = new ArrayOfECLSchemaItemWrapper( raw.getECLSchemas());
        this.local_xmlSchema = raw.getXmlSchema();

    }

    @Override
    public String toString()
    {
        return "ECLResultWrapper [" + "name = " + local_name + ", " + "sequence = " + local_sequence + ", " + "value = " + local_value + ", " + "link = " + local_link + ", " + "fileName = " + local_fileName + ", " + "isSupplied = " + local_isSupplied + ", " + "showFileContent = " + local_showFileContent + ", " + "total = " + local_total + ", " + "eCLSchemas = " + local_eCLSchemas + ", " + "xmlSchema = " + local_xmlSchema + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLResult();
        raw.setName( local_name);
        raw.setSequence( local_sequence);
        raw.setValue( local_value);
        raw.setLink( local_link);
        raw.setFileName( local_fileName);
        raw.setIsSupplied( local_isSupplied);
        raw.setShowFileContent( local_showFileContent);
        raw.setTotal( local_total);
        raw.setXmlSchema( local_xmlSchema);
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
    public void setSequence( int _sequence )
    {
        this.local_sequence = _sequence;
    }
    public int getSequence( )
    {
        return this.local_sequence;
    }
    public void setValue( String _value )
    {
        this.local_value = _value;
    }
    public String getValue( )
    {
        return this.local_value;
    }
    public void setLink( String _link )
    {
        this.local_link = _link;
    }
    public String getLink( )
    {
        return this.local_link;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setIsSupplied( boolean _isSupplied )
    {
        this.local_isSupplied = _isSupplied;
    }
    public boolean getIsSupplied( )
    {
        return this.local_isSupplied;
    }
    public void setShowFileContent( boolean _showFileContent )
    {
        this.local_showFileContent = _showFileContent;
    }
    public boolean getShowFileContent( )
    {
        return this.local_showFileContent;
    }
    public void setTotal( long _total )
    {
        this.local_total = _total;
    }
    public long getTotal( )
    {
        return this.local_total;
    }
    public void setECLSchemas( ArrayOfECLSchemaItemWrapper _eCLSchemas )
    {
        this.local_eCLSchemas = _eCLSchemas;
    }
    public ArrayOfECLSchemaItemWrapper getECLSchemas( )
    {
        return this.local_eCLSchemas;
    }
    public void setXmlSchema( String _xmlSchema )
    {
        this.local_xmlSchema = _xmlSchema;
    }
    public String getXmlSchema( )
    {
        return this.local_xmlSchema;
    }
}