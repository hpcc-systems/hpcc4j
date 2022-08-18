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
 * Class name: SubfileNames_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.164Z
 */
public class SubfileNames_type0Wrapper
{
    protected List<String> local_subfileName = null;

    public SubfileNames_type0Wrapper() {}

    public SubfileNames_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0 subfilenames_type0)
    {
        copy( subfilenames_type0 );
    }
    public SubfileNames_type0Wrapper( List<String> _subfileName )
    {
        this.local_subfileName = _subfileName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getSubfileName() != null)
        {
            this.local_subfileName = new ArrayList<String>();
            for ( int i = 0; i < raw.getSubfileName().length; i++)
            {
                this.local_subfileName.add(new String(raw.getSubfileName()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "SubfileNames_type0Wrapper [" + "subfileName = " + local_subfileName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.SubfileNames_type0();
        if (this.local_subfileName!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_subfileName.size()];
            for ( int i = 0; i < this.local_subfileName.size(); i++)
            {
                arr[i] = this.local_subfileName.get(i) ;
            }
            raw.setSubfileName(arr);
        }
        return raw;
    }


    public void setSubfileName( List<String> _subfileName )
    {
        this.local_subfileName = _subfileName;
    }
    public List<String> getSubfileName( )
    {
        return this.local_subfileName;
    }
}