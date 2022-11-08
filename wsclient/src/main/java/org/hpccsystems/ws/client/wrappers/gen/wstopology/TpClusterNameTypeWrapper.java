package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * WrapperMaker version: 1.7
 * Class name: TpClusterNameTypeWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * Service version: 1.31
 */
public class TpClusterNameTypeWrapper
{
    protected String local_name;
    protected String local_type;
    protected boolean local_isDefault;

    public TpClusterNameTypeWrapper() {}

    public TpClusterNameTypeWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType tpclusternametype)
    {
        copy( tpclusternametype );
    }
    public TpClusterNameTypeWrapper( String _name, String _type, boolean _isDefault )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_isDefault = _isDefault;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_isDefault = raw.getIsDefault();

    }

    @Override
    public String toString()
    {
        return "TpClusterNameTypeWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "isDefault = " + local_isDefault + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpClusterNameType();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setIsDefault( local_isDefault);
        return raw;
    }


    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setIsDefault( boolean _isDefault )
    {
        this.local_isDefault = _isDefault;
    }
    public boolean getIsDefault( )
    {
        return this.local_isDefault;
    }
}