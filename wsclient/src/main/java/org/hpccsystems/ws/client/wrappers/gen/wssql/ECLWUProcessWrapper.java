package org.hpccsystems.ws.client.wrappers.gen.wssql;

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
 * Class name: ECLWUProcessWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 */
public class ECLWUProcessWrapper
{
    protected String local_name;
    protected String local_type;
    protected String local_podName;
    protected int local_instanceNumber;
    protected String local_log;
    protected String local_pID;
    protected String local_pattern;
    protected int local_max;

    public ECLWUProcessWrapper() {}

    public ECLWUProcessWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess eclwuprocess)
    {
        copy( eclwuprocess );
    }
    public ECLWUProcessWrapper( String _name, String _type, String _podName, int _instanceNumber, String _log, String _pID, String _pattern, int _max )
    {
        this.local_name = _name;
        this.local_type = _type;
        this.local_podName = _podName;
        this.local_instanceNumber = _instanceNumber;
        this.local_log = _log;
        this.local_pID = _pID;
        this.local_pattern = _pattern;
        this.local_max = _max;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_type = raw.getType();
        this.local_podName = raw.getPodName();
        this.local_instanceNumber = raw.getInstanceNumber();
        this.local_log = raw.getLog();
        this.local_pID = raw.getPID();
        this.local_pattern = raw.getPattern();
        this.local_max = raw.getMax();

    }

    @Override
    public String toString()
    {
        return "ECLWUProcessWrapper [" + "name = " + local_name + ", " + "type = " + local_type + ", " + "podName = " + local_podName + ", " + "instanceNumber = " + local_instanceNumber + ", " + "log = " + local_log + ", " + "pID = " + local_pID + ", " + "pattern = " + local_pattern + ", " + "max = " + local_max + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLWUProcess();
        raw.setName( local_name);
        raw.setType( local_type);
        raw.setPodName( local_podName);
        raw.setInstanceNumber( local_instanceNumber);
        raw.setLog( local_log);
        raw.setPID( local_pID);
        raw.setPattern( local_pattern);
        raw.setMax( local_max);
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
    public void setPodName( String _podName )
    {
        this.local_podName = _podName;
    }
    public String getPodName( )
    {
        return this.local_podName;
    }
    public void setInstanceNumber( int _instanceNumber )
    {
        this.local_instanceNumber = _instanceNumber;
    }
    public int getInstanceNumber( )
    {
        return this.local_instanceNumber;
    }
    public void setLog( String _log )
    {
        this.local_log = _log;
    }
    public String getLog( )
    {
        return this.local_log;
    }
    public void setPID( String _pID )
    {
        this.local_pID = _pID;
    }
    public String getPID( )
    {
        return this.local_pID;
    }
    public void setPattern( String _pattern )
    {
        this.local_pattern = _pattern;
    }
    public String getPattern( )
    {
        return this.local_pattern;
    }
    public void setMax( int _max )
    {
        this.local_max = _max;
    }
    public int getMax( )
    {
        return this.local_max;
    }
}