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
 * Class name: WUCopyLogicalFilesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.890Z
 */
public class WUCopyLogicalFilesWrapper
{
    protected String local_wuid;
    protected String local_cluster;
    protected boolean local_copyLocal;

    public WUCopyLogicalFilesWrapper() {}

    public WUCopyLogicalFilesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles wucopylogicalfiles)
    {
        copy( wucopylogicalfiles );
    }
    public WUCopyLogicalFilesWrapper( String _wuid, String _cluster, boolean _copyLocal )
    {
        this.local_wuid = _wuid;
        this.local_cluster = _cluster;
        this.local_copyLocal = _copyLocal;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_cluster = raw.getCluster();
        this.local_copyLocal = raw.getCopyLocal();

    }

    @Override
    public String toString()
    {
        return "WUCopyLogicalFilesWrapper [" + "wuid = " + local_wuid + ", " + "cluster = " + local_cluster + ", " + "copyLocal = " + local_copyLocal + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyLogicalFiles();
        raw.setWuid( local_wuid);
        raw.setCluster( local_cluster);
        raw.setCopyLocal( local_copyLocal);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setCopyLocal( boolean _copyLocal )
    {
        this.local_copyLocal = _copyLocal;
    }
    public boolean getCopyLocal( )
    {
        return this.local_copyLocal;
    }
}