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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: AllowedClusters_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.768Z
 */
public class AllowedClusters_type0Wrapper
{
    protected List<String> local_allowedCluster = null;

    public AllowedClusters_type0Wrapper() {}

    public AllowedClusters_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0 allowedclusters_type0)
    {
        copy( allowedclusters_type0 );
    }
    public AllowedClusters_type0Wrapper( List<String> _allowedCluster )
    {
        this.local_allowedCluster = _allowedCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getAllowedCluster() != null)
        {
            this.local_allowedCluster = new ArrayList<String>();
            for ( int i = 0; i < raw.getAllowedCluster().length; i++)
            {
                this.local_allowedCluster.add(new String(raw.getAllowedCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "AllowedClusters_type0Wrapper [" + "allowedCluster = " + local_allowedCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.AllowedClusters_type0();
        if (this.local_allowedCluster!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_allowedCluster.size()];
            for ( int i = 0; i < this.local_allowedCluster.size(); i++)
            {
                arr[i] = this.local_allowedCluster.get(i) ;
            }
            raw.setAllowedCluster(arr);
        }
        return raw;
    }


    public void setAllowedCluster( List<String> _allowedCluster )
    {
        this.local_allowedCluster = _allowedCluster;
    }
    public List<String> getAllowedCluster( )
    {
        return this.local_allowedCluster;
    }
}