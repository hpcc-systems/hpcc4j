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
import java.util.List;
import java.util.ArrayList;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ArrayOfDFUFilePartsOnClusterWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.228Z
 */
public class ArrayOfDFUFilePartsOnClusterWrapper
{
    protected List<DFUFilePartsOnClusterWrapper> local_dFUFilePartsOnCluster = null;

    public ArrayOfDFUFilePartsOnClusterWrapper() {}

    public ArrayOfDFUFilePartsOnClusterWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster arrayofdfufilepartsoncluster)
    {
        copy( arrayofdfufilepartsoncluster );
    }
    public ArrayOfDFUFilePartsOnClusterWrapper( List<DFUFilePartsOnClusterWrapper> _dFUFilePartsOnCluster )
    {
        this.local_dFUFilePartsOnCluster = _dFUFilePartsOnCluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUFilePartsOnCluster() != null)
        {
            this.local_dFUFilePartsOnCluster = new ArrayList<DFUFilePartsOnClusterWrapper>();
            for ( int i = 0; i < raw.getDFUFilePartsOnCluster().length; i++)
            {
                this.local_dFUFilePartsOnCluster.add(new DFUFilePartsOnClusterWrapper(raw.getDFUFilePartsOnCluster()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUFilePartsOnClusterWrapper [" + "dFUFilePartsOnCluster = " + local_dFUFilePartsOnCluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUFilePartsOnCluster();
        if (this.local_dFUFilePartsOnCluster!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUFilePartsOnCluster[this.local_dFUFilePartsOnCluster.size()];
            for ( int i = 0; i < this.local_dFUFilePartsOnCluster.size(); i++)
            {
                arr[i] = this.local_dFUFilePartsOnCluster.get(i) .getRaw();
            }
            raw.setDFUFilePartsOnCluster(arr);
        }
        return raw;
    }


    public void setDFUFilePartsOnCluster( List<DFUFilePartsOnClusterWrapper> _dFUFilePartsOnCluster )
    {
        this.local_dFUFilePartsOnCluster = _dFUFilePartsOnCluster;
    }
    public List<DFUFilePartsOnClusterWrapper> getDFUFilePartsOnCluster( )
    {
        return this.local_dFUFilePartsOnCluster;
    }
}