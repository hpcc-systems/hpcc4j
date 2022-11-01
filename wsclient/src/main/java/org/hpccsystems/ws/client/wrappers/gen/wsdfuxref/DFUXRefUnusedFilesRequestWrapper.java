package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
 * WrapperMaker version: 1.7
 * Class name: DFUXRefUnusedFilesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * Service version: 1.02
 */
public class DFUXRefUnusedFilesRequestWrapper
{
    protected String local_processCluster;
    protected boolean local_checkPackageMaps;
    protected boolean local_getFileDetails;

    public DFUXRefUnusedFilesRequestWrapper() {}

    public DFUXRefUnusedFilesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest dfuxrefunusedfilesrequest)
    {
        copy( dfuxrefunusedfilesrequest );
    }
    public DFUXRefUnusedFilesRequestWrapper( String _processCluster, boolean _checkPackageMaps, boolean _getFileDetails )
    {
        this.local_processCluster = _processCluster;
        this.local_checkPackageMaps = _checkPackageMaps;
        this.local_getFileDetails = _getFileDetails;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest raw )
    {
        if (raw == null)
            return;

        this.local_processCluster = raw.getProcessCluster();
        this.local_checkPackageMaps = raw.getCheckPackageMaps();
        this.local_getFileDetails = raw.getGetFileDetails();

    }

    @Override
    public String toString()
    {
        return "DFUXRefUnusedFilesRequestWrapper [" + "processCluster = " + local_processCluster + ", " + "checkPackageMaps = " + local_checkPackageMaps + ", " + "getFileDetails = " + local_getFileDetails + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest();
        raw.setProcessCluster( local_processCluster);
        raw.setCheckPackageMaps( local_checkPackageMaps);
        raw.setGetFileDetails( local_getFileDetails);
        return raw;
    }


    public void setProcessCluster( String _processCluster )
    {
        this.local_processCluster = _processCluster;
    }
    public String getProcessCluster( )
    {
        return this.local_processCluster;
    }
    public void setCheckPackageMaps( boolean _checkPackageMaps )
    {
        this.local_checkPackageMaps = _checkPackageMaps;
    }
    public boolean getCheckPackageMaps( )
    {
        return this.local_checkPackageMaps;
    }
    public void setGetFileDetails( boolean _getFileDetails )
    {
        this.local_getFileDetails = _getFileDetails;
    }
    public boolean getGetFileDetails( )
    {
        return this.local_getFileDetails;
    }
}