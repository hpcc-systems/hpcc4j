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
 * Class name: WUCopyLogicalFilesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.890Z
 */
public class WUCopyLogicalFilesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected ClusterFiles_type1Wrapper local_clusterFiles;

    public WUCopyLogicalFilesResponseWrapper() {}

    public WUCopyLogicalFilesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse wucopylogicalfilesresponse)
    {
        copy( wucopylogicalfilesresponse );
    }
    public WUCopyLogicalFilesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, ClusterFiles_type1Wrapper _clusterFiles )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_clusterFiles = _clusterFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        if (raw.getClusterFiles() != null)
            this.local_clusterFiles = new ClusterFiles_type1Wrapper( raw.getClusterFiles());

    }

    @Override
    public String toString()
    {
        return "WUCopyLogicalFilesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "clusterFiles = " + local_clusterFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFilesResponse();
        raw.setWuid( local_wuid);
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
    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setClusterFiles( ClusterFiles_type1Wrapper _clusterFiles )
    {
        this.local_clusterFiles = _clusterFiles;
    }
    public ClusterFiles_type1Wrapper getClusterFiles( )
    {
        return this.local_clusterFiles;
    }
}