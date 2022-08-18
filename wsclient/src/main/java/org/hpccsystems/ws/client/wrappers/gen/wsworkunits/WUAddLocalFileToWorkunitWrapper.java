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
 * Class name: WUAddLocalFileToWorkunitWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.878Z
 */
public class WUAddLocalFileToWorkunitWrapper
{
    protected String local_wuid;
    protected String local_name;
    protected String local_val;
    protected String local_defVal;
    protected int local_type;
    protected int local_length;

    public WUAddLocalFileToWorkunitWrapper() {}

    public WUAddLocalFileToWorkunitWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit wuaddlocalfiletoworkunit)
    {
        copy( wuaddlocalfiletoworkunit );
    }
    public WUAddLocalFileToWorkunitWrapper( String _wuid, String _name, String _val, String _defVal, int _type, int _length )
    {
        this.local_wuid = _wuid;
        this.local_name = _name;
        this.local_val = _val;
        this.local_defVal = _defVal;
        this.local_type = _type;
        this.local_length = _length;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit raw )
    {
        if (raw == null)
            return;

        this.local_wuid = raw.getWuid();
        this.local_name = raw.getName();
        this.local_val = raw.getVal();
        this.local_defVal = raw.getDefVal();
        this.local_type = raw.getType();
        this.local_length = raw.getLength();

    }

    @Override
    public String toString()
    {
        return "WUAddLocalFileToWorkunitWrapper [" + "wuid = " + local_wuid + ", " + "name = " + local_name + ", " + "val = " + local_val + ", " + "defVal = " + local_defVal + ", " + "type = " + local_type + ", " + "length = " + local_length + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAddLocalFileToWorkunit();
        raw.setWuid( local_wuid);
        raw.setName( local_name);
        raw.setVal( local_val);
        raw.setDefVal( local_defVal);
        raw.setType( local_type);
        raw.setLength( local_length);
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
    public void setName( String _name )
    {
        this.local_name = _name;
    }
    public String getName( )
    {
        return this.local_name;
    }
    public void setVal( String _val )
    {
        this.local_val = _val;
    }
    public String getVal( )
    {
        return this.local_val;
    }
    public void setDefVal( String _defVal )
    {
        this.local_defVal = _defVal;
    }
    public String getDefVal( )
    {
        return this.local_defVal;
    }
    public void setType( int _type )
    {
        this.local_type = _type;
    }
    public int getType( )
    {
        return this.local_type;
    }
    public void setLength( int _length )
    {
        this.local_length = _length;
    }
    public int getLength( )
    {
        return this.local_length;
    }
}