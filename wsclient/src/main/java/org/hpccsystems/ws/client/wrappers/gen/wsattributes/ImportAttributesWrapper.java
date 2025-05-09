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
 * Class name: ImportAttributesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class ImportAttributesWrapper
{
    protected ArrayOfImportAttributeRequestWrapper local_attributes;

    public ImportAttributesWrapper() {}

    public ImportAttributesWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes importattributes)
    {
        copy( importattributes );
    }
    public ImportAttributesWrapper( ArrayOfImportAttributeRequestWrapper _attributes )
    {
        this.local_attributes = _attributes;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes raw )
    {
        if (raw == null)
            return;

        if (raw.getAttributes() != null)
            this.local_attributes = new ArrayOfImportAttributeRequestWrapper( raw.getAttributes());

    }

    @Override
    public String toString()
    {
        return "ImportAttributesWrapper [" + "attributes = " + local_attributes + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.ImportAttributes();
        if (local_attributes != null)
            raw.setAttributes( local_attributes.getRaw());
        return raw;
    }


    public void setAttributes( ArrayOfImportAttributeRequestWrapper _attributes )
    {
        this.local_attributes = _attributes;
    }
    public ArrayOfImportAttributeRequestWrapper getAttributes( )
    {
        return this.local_attributes;
    }
}