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
 * Class name: HistoryWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsdfu
 * TimeStamp: 2022-07-27T21:11:36.159Z
 */
public class HistoryWrapper
{
    protected String local_name;
    protected String local_operation;
    protected String local_timestamp;
    protected String local_iP;
    protected String local_path;
    protected String local_owner;
    protected String local_workunit;

    public HistoryWrapper() {}

    public HistoryWrapper( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History history)
    {
        copy( history );
    }
    public HistoryWrapper( String _name, String _operation, String _timestamp, String _iP, String _path, String _owner, String _workunit )
    {
        this.local_name = _name;
        this.local_operation = _operation;
        this.local_timestamp = _timestamp;
        this.local_iP = _iP;
        this.local_path = _path;
        this.local_owner = _owner;
        this.local_workunit = _workunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_operation = raw.getOperation();
        this.local_timestamp = raw.getTimestamp();
        this.local_iP = raw.getIP();
        this.local_path = raw.getPath();
        this.local_owner = raw.getOwner();
        this.local_workunit = raw.getWorkunit();

    }

    @Override
    public String toString()
    {
        return "HistoryWrapper [" + "name = " + local_name + ", " + "operation = " + local_operation + ", " + "timestamp = " + local_timestamp + ", " + "iP = " + local_iP + ", " + "path = " + local_path + ", " + "owner = " + local_owner + ", " + "workunit = " + local_workunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History raw = new org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.History();
        raw.setName( local_name);
        raw.setOperation( local_operation);
        raw.setTimestamp( local_timestamp);
        raw.setIP( local_iP);
        raw.setPath( local_path);
        raw.setOwner( local_owner);
        raw.setWorkunit( local_workunit);
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
    public void setOperation( String _operation )
    {
        this.local_operation = _operation;
    }
    public String getOperation( )
    {
        return this.local_operation;
    }
    public void setTimestamp( String _timestamp )
    {
        this.local_timestamp = _timestamp;
    }
    public String getTimestamp( )
    {
        return this.local_timestamp;
    }
    public void setIP( String _iP )
    {
        this.local_iP = _iP;
    }
    public String getIP( )
    {
        return this.local_iP;
    }
    public void setPath( String _path )
    {
        this.local_path = _path;
    }
    public String getPath( )
    {
        return this.local_path;
    }
    public void setOwner( String _owner )
    {
        this.local_owner = _owner;
    }
    public String getOwner( )
    {
        return this.local_owner;
    }
    public void setWorkunit( String _workunit )
    {
        this.local_workunit = _workunit;
    }
    public String getWorkunit( )
    {
        return this.local_workunit;
    }
}