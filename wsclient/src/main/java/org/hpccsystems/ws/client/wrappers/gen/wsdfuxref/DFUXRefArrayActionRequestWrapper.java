package org.hpccsystems.ws.client.wrappers.gen.wsdfuxref;



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
import org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspStringArray;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: DFUXRefArrayActionRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfuxref
 * Service version: 1.02
 */
public class DFUXRefArrayActionRequestWrapper
{
    protected String local_type;
    protected String local_cluster;
    protected String local_action;
    protected List<String> local_xRefFiles = null;

    public DFUXRefArrayActionRequestWrapper() {}

    public DFUXRefArrayActionRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest dfuxrefarrayactionrequest)
    {
        copy( dfuxrefarrayactionrequest );
    }
    public DFUXRefArrayActionRequestWrapper( String _type, String _cluster, String _action, List<String> _xRefFiles )
    {
        this.local_type = _type;
        this.local_cluster = _cluster;
        this.local_action = _action;
        this.local_xRefFiles = _xRefFiles;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest raw )
    {
        if (raw == null)
            return;

        this.local_type = raw.getType();
        this.local_cluster = raw.getCluster();
        this.local_action = raw.getAction();
        if (raw.getXRefFiles() != null)
        {
            this.local_xRefFiles = new ArrayList<String>();
            for ( int i = 0; i < raw.getXRefFiles().getItem().length; i++)
            {
                this.local_xRefFiles.add(new String(raw.getXRefFiles().getItem()[i]));
            }
        }
    }

    @Override
    public String toString()
    {
        return "DFUXRefArrayActionRequestWrapper [" + "type = " + local_type + ", " + "cluster = " + local_cluster + ", " + "action = " + local_action + ", " + "xRefFiles = " + local_xRefFiles + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest raw = new org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.DFUXRefArrayActionRequest();
        raw.setType( local_type);
        raw.setCluster( local_cluster);
        raw.setAction( local_action);
        if (this.local_xRefFiles!= null)
        {
            EspStringArray arr = new EspStringArray();
            for ( int i = 0; i < this.local_xRefFiles.size(); i++)
            {
                arr.addItem(this.local_xRefFiles.get(i));
            }
            raw.setXRefFiles(arr);
        }
        return raw;
    }


    public void setType( String _type )
    {
        this.local_type = _type;
    }
    public String getType( )
    {
        return this.local_type;
    }
    public void setCluster( String _cluster )
    {
        this.local_cluster = _cluster;
    }
    public String getCluster( )
    {
        return this.local_cluster;
    }
    public void setAction( String _action )
    {
        this.local_action = _action;
    }
    public String getAction( )
    {
        return this.local_action;
    }
    public void setXRefFiles( List<String> _xRefFiles )
    {
        this.local_xRefFiles = _xRefFiles;
    }
    public List<String> getXRefFiles( )
    {
        return this.local_xRefFiles;
    }
}