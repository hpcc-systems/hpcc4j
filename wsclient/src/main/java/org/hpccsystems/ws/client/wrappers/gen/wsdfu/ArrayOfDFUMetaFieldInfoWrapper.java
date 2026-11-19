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
 * Class name: ArrayOfDFUMetaFieldInfoWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class ArrayOfDFUMetaFieldInfoWrapper
{
    protected List<DFUMetaFieldInfoWrapper> local_dFUMetaFieldInfo = null;

    public ArrayOfDFUMetaFieldInfoWrapper() {}

    public ArrayOfDFUMetaFieldInfoWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo arrayofdfumetafieldinfo)
    {
        copy( arrayofdfumetafieldinfo );
    }
    public ArrayOfDFUMetaFieldInfoWrapper( List<DFUMetaFieldInfoWrapper> _dFUMetaFieldInfo )
    {
        this.local_dFUMetaFieldInfo = _dFUMetaFieldInfo;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo raw )
    {
        if (raw == null)
            return;

        if (raw.getDFUMetaFieldInfo() != null)
        {
            this.local_dFUMetaFieldInfo = new ArrayList<DFUMetaFieldInfoWrapper>();
            for ( int i = 0; i < raw.getDFUMetaFieldInfo().length; i++)
            {
                this.local_dFUMetaFieldInfo.add(new DFUMetaFieldInfoWrapper(raw.getDFUMetaFieldInfo()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "ArrayOfDFUMetaFieldInfoWrapper [" + "dFUMetaFieldInfo = " + local_dFUMetaFieldInfo + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.ArrayOfDFUMetaFieldInfo();
        if (this.local_dFUMetaFieldInfo!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaFieldInfo[] arr = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUMetaFieldInfo[this.local_dFUMetaFieldInfo.size()];
            for ( int i = 0; i < this.local_dFUMetaFieldInfo.size(); i++)
            {
                arr[i] = this.local_dFUMetaFieldInfo.get(i) .getRaw();
            }
            raw.setDFUMetaFieldInfo(arr);
        }
        return raw;
    }


    public void setDFUMetaFieldInfo( List<DFUMetaFieldInfoWrapper> _dFUMetaFieldInfo )
    {
        this.local_dFUMetaFieldInfo = _dFUMetaFieldInfo;
    }
    public List<DFUMetaFieldInfoWrapper> getDFUMetaFieldInfo( )
    {
        return this.local_dFUMetaFieldInfo;
    }
}