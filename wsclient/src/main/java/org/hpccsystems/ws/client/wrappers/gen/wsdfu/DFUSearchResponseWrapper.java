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
 * Class name: DFUSearchResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-10-28T23:07:50.919Z
 */
public class DFUSearchResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_showExample;
    protected ClusterNames_type0Wrapper local_clusterNames;
    protected FileTypes_type0Wrapper local_fileTypes;

    public DFUSearchResponseWrapper() {}

    public DFUSearchResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse dfusearchresponse)
    {
        copy( dfusearchresponse );
    }
    public DFUSearchResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _showExample, ClusterNames_type0Wrapper _clusterNames, FileTypes_type0Wrapper _fileTypes )
    {
        this.local_exceptions = _exceptions;
        this.local_showExample = _showExample;
        this.local_clusterNames = _clusterNames;
        this.local_fileTypes = _fileTypes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_showExample = raw.getShowExample();
        if (raw.getClusterNames() != null)
            this.local_clusterNames = new ClusterNames_type0Wrapper( raw.getClusterNames());
        if (raw.getFileTypes() != null)
            this.local_fileTypes = new FileTypes_type0Wrapper( raw.getFileTypes());

    }

    @Override
    public String toString()
    {
        return "DFUSearchResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "showExample = " + local_showExample + ", " + "clusterNames = " + local_clusterNames + ", " + "fileTypes = " + local_fileTypes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUSearchResponse();
        raw.setExceptions( local_exceptions.getRaw());
        raw.setShowExample( local_showExample);
        raw.setClusterNames( local_clusterNames.getRaw());
        raw.setFileTypes( local_fileTypes.getRaw());
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
    public void setShowExample( String _showExample )
    {
        this.local_showExample = _showExample;
    }
    public String getShowExample( )
    {
        return this.local_showExample;
    }
    public void setClusterNames( ClusterNames_type0Wrapper _clusterNames )
    {
        this.local_clusterNames = _clusterNames;
    }
    public ClusterNames_type0Wrapper getClusterNames( )
    {
        return this.local_clusterNames;
    }
    public void setFileTypes( FileTypes_type0Wrapper _fileTypes )
    {
        this.local_fileTypes = _fileTypes;
    }
    public FileTypes_type0Wrapper getFileTypes( )
    {
        return this.local_fileTypes;
    }
}