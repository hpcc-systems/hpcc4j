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
import java.util.List;
import java.util.ArrayList;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WULogicalFileCopyInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-28T23:25:24.673Z
 */
public class WULogicalFileCopyInfoWrapper
{
    protected boolean local_isIndex;
    protected String local_logicalName;
    protected String local_dfuCopyWuid;
    protected String local_dfuCopyError;
    protected List<String> local_clusters = null;

    public WULogicalFileCopyInfoWrapper() {}

    public WULogicalFileCopyInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo wulogicalfilecopyinfo)
    {
        copy( wulogicalfilecopyinfo );
    }
    public WULogicalFileCopyInfoWrapper( boolean _isIndex, String _logicalName, String _dfuCopyWuid, String _dfuCopyError, List<String> _clusters )
    {
        this.local_isIndex = _isIndex;
        this.local_logicalName = _logicalName;
        this.local_dfuCopyWuid = _dfuCopyWuid;
        this.local_dfuCopyError = _dfuCopyError;
        this.local_clusters = _clusters;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo raw )
    {
        if (raw == null)
            return;

        this.local_isIndex = raw.getIsIndex();
        this.local_logicalName = raw.getLogicalName();
        this.local_dfuCopyWuid = raw.getDfuCopyWuid();
        this.local_dfuCopyError = raw.getDfuCopyError();
        if (raw.getClusters() != null)
        {
            this.local_clusters = new ArrayList<String>();
            for ( int i = 0; i < raw.getClusters().getItem().length; i++)
            {
                this.local_clusters.add(new String(raw.getClusters().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "WULogicalFileCopyInfoWrapper [" + "isIndex = " + local_isIndex + ", " + "logicalName = " + local_logicalName + ", " + "dfuCopyWuid = " + local_dfuCopyWuid + ", " + "dfuCopyError = " + local_dfuCopyError + ", " + "clusters = " + local_clusters + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogicalFileCopyInfo();
        raw.setIsIndex( local_isIndex);
        raw.setLogicalName( local_logicalName);
        raw.setDfuCopyWuid( local_dfuCopyWuid);
        raw.setDfuCopyError( local_dfuCopyError);
        if (this.local_clusters!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_clusters.size(); i++)
            {
                arr.addItem(this.local_clusters.get(i));
            }
            raw.setClusters(arr);
        }
        return raw;
    }


    public void setIsIndex( boolean _isIndex )
    {
        this.local_isIndex = _isIndex;
    }
    public boolean getIsIndex( )
    {
        return this.local_isIndex;
    }
    public void setLogicalName( String _logicalName )
    {
        this.local_logicalName = _logicalName;
    }
    public String getLogicalName( )
    {
        return this.local_logicalName;
    }
    public void setDfuCopyWuid( String _dfuCopyWuid )
    {
        this.local_dfuCopyWuid = _dfuCopyWuid;
    }
    public String getDfuCopyWuid( )
    {
        return this.local_dfuCopyWuid;
    }
    public void setDfuCopyError( String _dfuCopyError )
    {
        this.local_dfuCopyError = _dfuCopyError;
    }
    public String getDfuCopyError( )
    {
        return this.local_dfuCopyError;
    }
    public void setClusters( List<String> _clusters )
    {
        this.local_clusters = _clusters;
    }
    public List<String> getClusters( )
    {
        return this.local_clusters;
    }
}