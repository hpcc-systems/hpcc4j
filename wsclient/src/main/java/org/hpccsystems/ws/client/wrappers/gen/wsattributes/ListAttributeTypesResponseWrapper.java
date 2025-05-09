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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ListAttributeTypesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ListAttributeTypesResponseWrapper
{
    protected Types_type0Wrapper local_types;

    public ListAttributeTypesResponseWrapper() {}

    public ListAttributeTypesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse listattributetypesresponse)
    {
        copy( listattributetypesresponse );
    }
    public ListAttributeTypesResponseWrapper( Types_type0Wrapper _types )
    {
        this.local_types = _types;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getTypes() != null)
            this.local_types = new Types_type0Wrapper( raw.getTypes());

    }

    @Override
    public String toString()
    {
        return "ListAttributeTypesResponseWrapper [" + "types = " + local_types + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ListAttributeTypesResponse();
        if (local_types != null)
            raw.setTypes( local_types.getRaw());
        return raw;
    }


    public void setTypes( Types_type0Wrapper _types )
    {
        this.local_types = _types;
    }
    public Types_type0Wrapper getTypes( )
    {
        return this.local_types;
    }
}