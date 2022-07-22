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
 * Class name: WUGVCGraphInfoResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.929Z
 */
public class WUGVCGraphInfoResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_wuid;
    protected String local_name;
    protected String local_gID;
    protected boolean local_running;
    protected String local_theGraph;
    protected int local_batchWU;

    public WUGVCGraphInfoResponseWrapper() {}

    public WUGVCGraphInfoResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse wugvcgraphinforesponse)
    {
        copy( wugvcgraphinforesponse );
    }
    public WUGVCGraphInfoResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _wuid, String _name, String _gID, boolean _running, String _theGraph, int _batchWU )
    {
        this.local_exceptions = _exceptions;
        this.local_wuid = _wuid;
        this.local_name = _name;
        this.local_gID = _gID;
        this.local_running = _running;
        this.local_theGraph = _theGraph;
        this.local_batchWU = _batchWU;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_wuid = raw.getWuid();
        this.local_name = raw.getName();
        this.local_gID = raw.getGID();
        this.local_running = raw.getRunning();
        this.local_theGraph = raw.getTheGraph();
        this.local_batchWU = raw.getBatchWU();

    }

    @Override
    public String toString()
    {
        return "WUGVCGraphInfoResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "wuid = " + local_wuid + ", " + "name = " + local_name + ", " + "gID = " + local_gID + ", " + "running = " + local_running + ", " + "theGraph = " + local_theGraph + ", " + "batchWU = " + local_batchWU + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGVCGraphInfoResponse();
        raw.setWuid( local_wuid);
        raw.setName( local_name);
        raw.setGID( local_gID);
        raw.setRunning( local_running);
        raw.setTheGraph( local_theGraph);
        raw.setBatchWU( local_batchWU);
        return raw;
    }


    public void setExceptions( ArrayOfEspExceptionWrapper _exceptions )
    {
        this.local_exceptions = _exceptions;
    }
    public ArrayOfEspExceptionWrapper getExceptions( )
    {
        return this.local_exceptions;
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
    public void setGID( String _gID )
    {
        this.local_gID = _gID;
    }
    public String getGID( )
    {
        return this.local_gID;
    }
    public void setRunning( boolean _running )
    {
        this.local_running = _running;
    }
    public boolean getRunning( )
    {
        return this.local_running;
    }
    public void setTheGraph( String _theGraph )
    {
        this.local_theGraph = _theGraph;
    }
    public String getTheGraph( )
    {
        return this.local_theGraph;
    }
    public void setBatchWU( int _batchWU )
    {
        this.local_batchWU = _batchWU;
    }
    public int getBatchWU( )
    {
        return this.local_batchWU;
    }
}