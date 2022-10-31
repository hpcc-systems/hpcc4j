package org.hpccsystems.ws.client.wrappers.gen.wsresources;



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
 * Class name: DiscoveredWebLinkWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsresources
 * TimeStamp: 2022-10-31T03:36:28.634Z
 */
public class DiscoveredWebLinkWrapper
{
    protected String local_serviceName;
    protected String local_nameSpace;
    protected ArrayOfNamedValueWrapper local_annotations;

    public DiscoveredWebLinkWrapper() {}

    public DiscoveredWebLinkWrapper( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink discoveredweblink)
    {
        copy( discoveredweblink );
    }
    public DiscoveredWebLinkWrapper( String _serviceName, String _nameSpace, ArrayOfNamedValueWrapper _annotations )
    {
        this.local_serviceName = _serviceName;
        this.local_nameSpace = _nameSpace;
        this.local_annotations = _annotations;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink raw )
    {
        if (raw == null)
            return;

        this.local_serviceName = raw.getServiceName();
        this.local_nameSpace = raw.getNameSpace();
        if (raw.getAnnotations() != null)
            this.local_annotations = new ArrayOfNamedValueWrapper( raw.getAnnotations());

    }

    @Override
    public String toString()
    {
        return "DiscoveredWebLinkWrapper [" + "serviceName = " + local_serviceName + ", " + "nameSpace = " + local_nameSpace + ", " + "annotations = " + local_annotations + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink raw = new org.hpccsystems.ws.client.gen.axis2.wsresources.latest.DiscoveredWebLink();
        raw.setServiceName( local_serviceName);
        raw.setNameSpace( local_nameSpace);
        if (local_annotations != null)
            raw.setAnnotations( local_annotations.getRaw());
        return raw;
    }


    public void setServiceName( String _serviceName )
    {
        this.local_serviceName = _serviceName;
    }
    public String getServiceName( )
    {
        return this.local_serviceName;
    }
    public void setNameSpace( String _nameSpace )
    {
        this.local_nameSpace = _nameSpace;
    }
    public String getNameSpace( )
    {
        return this.local_nameSpace;
    }
    public void setAnnotations( ArrayOfNamedValueWrapper _annotations )
    {
        this.local_annotations = _annotations;
    }
    public ArrayOfNamedValueWrapper getAnnotations( )
    {
        return this.local_annotations;
    }
}