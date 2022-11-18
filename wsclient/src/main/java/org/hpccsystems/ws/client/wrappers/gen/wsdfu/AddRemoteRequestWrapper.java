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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: AddRemoteRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2021-10-27T14:48:55.204Z
 */
public class AddRemoteRequestWrapper
{
    protected String local_dstname;
    protected String local_srcname;
    protected String local_srcdali;
    protected String local_srcusername;
    protected String local_srcpassword;

    public AddRemoteRequestWrapper() {}

    public AddRemoteRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest addremoterequest)
    {
        copy( addremoterequest );
    }
    public AddRemoteRequestWrapper( String _dstname, String _srcname, String _srcdali, String _srcusername, String _srcpassword )
    {
        this.local_dstname = _dstname;
        this.local_srcname = _srcname;
        this.local_srcdali = _srcdali;
        this.local_srcusername = _srcusername;
        this.local_srcpassword = _srcpassword;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest raw )
    {
        if (raw == null)
            return;

        this.local_dstname = raw.getDstname();
        this.local_srcname = raw.getSrcname();
        this.local_srcdali = raw.getSrcdali();
        this.local_srcusername = raw.getSrcusername();
        this.local_srcpassword = raw.getSrcpassword();

    }

    @Override
    public String toString()
    {
        return "AddRemoteRequestWrapper [" + "dstname = " + local_dstname + ", " + "srcname = " + local_srcname + ", " + "srcdali = " + local_srcdali + ", " + "srcusername = " + local_srcusername + ", " + "srcpassword = " + local_srcpassword + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRemoteRequest();
        raw.setDstname( local_dstname);
        raw.setSrcname( local_srcname);
        raw.setSrcdali( local_srcdali);
        raw.setSrcusername( local_srcusername);
        raw.setSrcpassword( local_srcpassword);
        return raw;
    }


    public void setDstname( String _dstname )
    {
        this.local_dstname = _dstname;
    }
    public String getDstname( )
    {
        return this.local_dstname;
    }
    public void setSrcname( String _srcname )
    {
        this.local_srcname = _srcname;
    }
    public String getSrcname( )
    {
        return this.local_srcname;
    }
    public void setSrcdali( String _srcdali )
    {
        this.local_srcdali = _srcdali;
    }
    public String getSrcdali( )
    {
        return this.local_srcdali;
    }
    public void setSrcusername( String _srcusername )
    {
        this.local_srcusername = _srcusername;
    }
    public String getSrcusername( )
    {
        return this.local_srcusername;
    }
    public void setSrcpassword( String _srcpassword )
    {
        this.local_srcpassword = _srcpassword;
    }
    public String getSrcpassword( )
    {
        return this.local_srcpassword;
    }
}