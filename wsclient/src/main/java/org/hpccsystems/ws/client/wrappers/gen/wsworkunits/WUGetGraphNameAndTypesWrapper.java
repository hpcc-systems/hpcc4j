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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUGetGraphNameAndTypesWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.917Z
 */
public class WUGetGraphNameAndTypesWrapper
{
    protected String local_wuid;
    protected String local_type;

    public WUGetGraphNameAndTypesWrapper() {}

    public WUGetGraphNameAndTypesWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes wugetgraphnameandtypes)
    {
        copy( wugetgraphnameandtypes );
    }
    public WUGetGraphNameAndTypesWrapper( String _wuid, String _type )
    {
        this.local_wuid = _wuid;
        this.local_type = _type;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_type = raw.getType();

    }

    @Override
    public String toString()
    {
        return "WUGetGraphNameAndTypesWrapper [" + "wuid = " + local_wuid + ", " + "type = " + local_type + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetGraphNameAndTypes();
        raw.setWuid( local_wuid);
        raw.setType( local_type);
        return raw;
    }


    public void setWuid( String _wuid )
    {
        this.local_wuid = _wuid;
    }
    public String getWuid( )
    {
        return this.local_wuid;
    }
    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
}