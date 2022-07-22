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
 * Class name: Ids_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.836Z
 */
public class Ids_type0Wrapper
{
    protected List<String> local_id = null;

    public Ids_type0Wrapper() {}

    public Ids_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 ids_type0)
    {
        copy( ids_type0 );
    }
    public Ids_type0Wrapper( List<String> _id )
    {
        this.local_id = _id;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getId() != null)
        {
            this.local_id = new ArrayList<String>();
            for ( int i = 0; i < raw.getId().length; i++)
            {
                this.local_id.add(new String(raw.getId()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Ids_type0Wrapper [" + "id = " + local_id + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.Ids_type0();
        if (this.local_id!= null)
        {
            java.lang.String[] arr = new java.lang.String[this.local_id.size()];
            for ( int i = 0; i < this.local_id.size(); i++)
            {
                arr[i] = this.local_id.get(i) ;
            }
            raw.setId(arr);
        }
        return raw;
    }


    public void setId( List<String> _id )
    {
        this.local_id = _id;
    }
    public List<String> getId( )
    {
        return this.local_id;
    }
}