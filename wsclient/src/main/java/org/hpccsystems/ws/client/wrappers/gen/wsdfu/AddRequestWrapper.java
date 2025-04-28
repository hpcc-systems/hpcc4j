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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: AddRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 */
public class AddRequestWrapper
{
    protected String local_dstname;
    protected DataHandler local_xmlmap;
    protected String local_dstcluster;

    public AddRequestWrapper() {}

    public AddRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest addrequest)
    {
        copy( addrequest );
    }
    public AddRequestWrapper( String _dstname, DataHandler _xmlmap, String _dstcluster )
    {
        this.local_dstname = _dstname;
        this.local_xmlmap = _xmlmap;
        this.local_dstcluster = _dstcluster;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest raw )
    {
        if (raw == null)
            return;

        this.local_dstname = raw.getDstname();
        this.local_xmlmap = raw.getXmlmap();
        this.local_dstcluster = raw.getDstcluster();

    }

    @Override
    public String toString()
    {
        return "AddRequestWrapper [" + "dstname = " + local_dstname + ", " + "xmlmap = " + local_xmlmap + ", " + "dstcluster = " + local_dstcluster + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.AddRequest();
        raw.setDstname( local_dstname);
        raw.setXmlmap( local_xmlmap);
        raw.setDstcluster( local_dstcluster);
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
    public void setXmlmap( DataHandler _xmlmap )
    {
        this.local_xmlmap = _xmlmap;
    }
    public DataHandler getXmlmap( )
    {
        return this.local_xmlmap;
    }
    public void setDstcluster( String _dstcluster )
    {
        this.local_dstcluster = _dstcluster;
    }
    public String getDstcluster( )
    {
        return this.local_dstcluster;
    }
}