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
 * Class name: DFUGetFileMetaDataRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.129Z
 */
public class DFUGetFileMetaDataRequestWrapper
{
    protected String local_logicalFileName;
    protected String local_clusterName;
    protected boolean local_includeXmlSchema;
    protected boolean local_addHeaderInXmlSchema;
    protected boolean local_includeXmlXPathSchema;
    protected boolean local_addHeaderInXmlXPathSchema;

    public DFUGetFileMetaDataRequestWrapper() {}

    public DFUGetFileMetaDataRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest dfugetfilemetadatarequest)
    {
        copy( dfugetfilemetadatarequest );
    }
    public DFUGetFileMetaDataRequestWrapper( String _logicalFileName, String _clusterName, boolean _includeXmlSchema, boolean _addHeaderInXmlSchema, boolean _includeXmlXPathSchema, boolean _addHeaderInXmlXPathSchema )
    {
        this.local_logicalFileName = _logicalFileName;
        this.local_clusterName = _clusterName;
        this.local_includeXmlSchema = _includeXmlSchema;
        this.local_addHeaderInXmlSchema = _addHeaderInXmlSchema;
        this.local_includeXmlXPathSchema = _includeXmlXPathSchema;
        this.local_addHeaderInXmlXPathSchema = _addHeaderInXmlXPathSchema;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest raw )
    {
        if (raw == null)
            return;

        this.local_logicalFileName = raw.getLogicalFileName();
        this.local_clusterName = raw.getClusterName();
        this.local_includeXmlSchema = raw.getIncludeXmlSchema();
        this.local_addHeaderInXmlSchema = raw.getAddHeaderInXmlSchema();
        this.local_includeXmlXPathSchema = raw.getIncludeXmlXPathSchema();
        this.local_addHeaderInXmlXPathSchema = raw.getAddHeaderInXmlXPathSchema();

    }

    @Override
    public String toString()
    {
        return "DFUGetFileMetaDataRequestWrapper [" + "logicalFileName = " + local_logicalFileName + ", " + "clusterName = " + local_clusterName + ", " + "includeXmlSchema = " + local_includeXmlSchema + ", " + "addHeaderInXmlSchema = " + local_addHeaderInXmlSchema + ", " + "includeXmlXPathSchema = " + local_includeXmlXPathSchema + ", " + "addHeaderInXmlXPathSchema = " + local_addHeaderInXmlXPathSchema + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUGetFileMetaDataRequest();
        raw.setLogicalFileName( local_logicalFileName);
        raw.setClusterName( local_clusterName);
        raw.setIncludeXmlSchema( local_includeXmlSchema);
        raw.setAddHeaderInXmlSchema( local_addHeaderInXmlSchema);
        raw.setIncludeXmlXPathSchema( local_includeXmlXPathSchema);
        raw.setAddHeaderInXmlXPathSchema( local_addHeaderInXmlXPathSchema);
        return raw;
    }


    public void setLogicalFileName( String _logicalFileName )
    {
        this.local_logicalFileName = _logicalFileName;
    }
    public String getLogicalFileName( )
    {
        return this.local_logicalFileName;
    }
    public void setClusterName( String _clusterName )
    {
        this.local_clusterName = _clusterName;
    }
    public String getClusterName( )
    {
        return this.local_clusterName;
    }
    public void setIncludeXmlSchema( boolean _includeXmlSchema )
    {
        this.local_includeXmlSchema = _includeXmlSchema;
    }
    public boolean getIncludeXmlSchema( )
    {
        return this.local_includeXmlSchema;
    }
    public void setAddHeaderInXmlSchema( boolean _addHeaderInXmlSchema )
    {
        this.local_addHeaderInXmlSchema = _addHeaderInXmlSchema;
    }
    public boolean getAddHeaderInXmlSchema( )
    {
        return this.local_addHeaderInXmlSchema;
    }
    public void setIncludeXmlXPathSchema( boolean _includeXmlXPathSchema )
    {
        this.local_includeXmlXPathSchema = _includeXmlXPathSchema;
    }
    public boolean getIncludeXmlXPathSchema( )
    {
        return this.local_includeXmlXPathSchema;
    }
    public void setAddHeaderInXmlXPathSchema( boolean _addHeaderInXmlXPathSchema )
    {
        this.local_addHeaderInXmlXPathSchema = _addHeaderInXmlXPathSchema;
    }
    public boolean getAddHeaderInXmlXPathSchema( )
    {
        return this.local_addHeaderInXmlXPathSchema;
    }
}