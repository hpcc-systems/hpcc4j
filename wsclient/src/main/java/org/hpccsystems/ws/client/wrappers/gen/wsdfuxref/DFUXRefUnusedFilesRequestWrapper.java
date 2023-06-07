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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: DFUXRefUnusedFilesRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 */
public class DFUXRefUnusedFilesRequestWrapper
{
    protected String local_processCluster;
    protected boolean local_checkPackageMaps;
    protected boolean local_getFileDetails;
    protected List<String> local_processClusterList = null;
    protected List<String> local_checkPlanes = null;

    public DFUXRefUnusedFilesRequestWrapper() {}

    public DFUXRefUnusedFilesRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest dfuxrefunusedfilesrequest)
    {
        copy( dfuxrefunusedfilesrequest );
    }
    public DFUXRefUnusedFilesRequestWrapper( String _processCluster, boolean _checkPackageMaps, boolean _getFileDetails, List<String> _processClusterList, List<String> _checkPlanes )
    {
        this.local_processCluster = _processCluster;
        this.local_checkPackageMaps = _checkPackageMaps;
        this.local_getFileDetails = _getFileDetails;
        this.local_processClusterList = _processClusterList;
        this.local_checkPlanes = _checkPlanes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest raw )
    {
        if (raw == null)
            return;

        this.local_processCluster = raw.getProcessCluster();
        this.local_checkPackageMaps = raw.getCheckPackageMaps();
        this.local_getFileDetails = raw.getGetFileDetails();
        if (raw.getProcessClusterList() != null && raw.getProcessClusterList().getItem() != null)
        {
            this.local_processClusterList = new ArrayList<String>();
            for ( int i = 0; i < raw.getProcessClusterList().getItem().length; i++)
            {
                this.local_processClusterList.add(new String(raw.getProcessClusterList().getItem()[i]));
            }
        }        if (raw.getCheckPlanes() != null && raw.getCheckPlanes().getItem() != null)
        {
            this.local_checkPlanes = new ArrayList<String>();
            for ( int i = 0; i < raw.getCheckPlanes().getItem().length; i++)
            {
                this.local_checkPlanes.add(new String(raw.getCheckPlanes().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "DFUXRefUnusedFilesRequestWrapper [" + "processCluster = " + local_processCluster + ", " + "checkPackageMaps = " + local_checkPackageMaps + ", " + "getFileDetails = " + local_getFileDetails + ", " + "processClusterList = " + local_processClusterList + ", " + "checkPlanes = " + local_checkPlanes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefUnusedFilesRequest();
        raw.setProcessCluster( local_processCluster);
        raw.setCheckPackageMaps( local_checkPackageMaps);
        raw.setGetFileDetails( local_getFileDetails);
        if (this.local_processClusterList!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_processClusterList.size(); i++)
            {
                arr.addItem(this.local_processClusterList.get(i));
            }
            raw.setProcessClusterList(arr);
        }
        if (this.local_checkPlanes!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_checkPlanes.size(); i++)
            {
                arr.addItem(this.local_checkPlanes.get(i));
            }
            raw.setCheckPlanes(arr);
        }
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
    public void setProcessClusterList( List<String> _processClusterList )
    {
        this.local_processClusterList = _processClusterList;
    }
    public List<String> getProcessClusterList( )
    {
        return this.local_processClusterList;
    }
    public void setCheckPlanes( List<String> _checkPlanes )
    {
        this.local_checkPlanes = _checkPlanes;
    }
    public List<String> getCheckPlanes( )
    {
        return this.local_checkPlanes;
    }
}