package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: Types_type0Wrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class Types_type0Wrapper
{
    protected List<AttributeTypeWrapper> local_type = null;

    public Types_type0Wrapper() {}

    public Types_type0Wrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0 types_type0)
    {
        copy( types_type0 );
    }
    public Types_type0Wrapper( List<AttributeTypeWrapper> _type )
    {
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0 raw )
    {
        if (raw == null)
            return;

        if (raw.getType() != null)
        {
            this.local_type = new ArrayList<AttributeTypeWrapper>();
            for ( int i = 0; i < raw.getType().length; i++)
            {
                this.local_type.add(new AttributeTypeWrapper(raw.getType()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "Types_type0Wrapper [" + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0 getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0 raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.Types_type0();
        if (this.local_type!= null)
        {
            org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType[] arr = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.AttributeType[this.local_type.size()];
            for ( int i = 0; i < this.local_type.size(); i++)
            {
                arr[i] = this.local_type.get(i) .getRaw();
            }
            raw.setType(arr);
        }
        return raw;
    }


    public void setType( List<AttributeTypeWrapper> _type )
    {
        this.local_type = _type;
    }
    public List<AttributeTypeWrapper> getType( )
    {
        return this.local_type;
    }
}