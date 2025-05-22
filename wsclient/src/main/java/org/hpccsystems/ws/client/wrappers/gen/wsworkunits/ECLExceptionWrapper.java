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
 * Class name: ECLExceptionWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class ECLExceptionWrapper
{
    protected String local_severity;
    protected String local_source;
    protected int local_code;
    protected String local_message;
    protected int local_column;
    protected int local_lineNo;
    protected String local_fileName;
    protected int local_activity;
    protected String local_scope;
    protected int local_priority;
    protected double local_cost;

    public ECLExceptionWrapper() {}

    public ECLExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException eclexception)
    {
        copy( eclexception );
    }
    public ECLExceptionWrapper( String _severity, String _source, int _code, String _message, int _column, int _lineNo, String _fileName, int _activity, String _scope, int _priority, double _cost )
    {
        this.local_severity = _severity;
        this.local_source = _source;
        this.local_code = _code;
        this.local_message = _message;
        this.local_column = _column;
        this.local_lineNo = _lineNo;
        this.local_fileName = _fileName;
        this.local_activity = _activity;
        this.local_scope = _scope;
        this.local_priority = _priority;
        this.local_cost = _cost;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException raw )
    {
        if (raw == null)
            return;

        this.local_severity = raw.getSeverity();
        this.local_source = raw.getSource();
        this.local_code = raw.getCode();
        this.local_message = raw.getMessage();
        this.local_column = raw.getColumn();
        this.local_lineNo = raw.getLineNo();
        this.local_fileName = raw.getFileName();
        this.local_activity = raw.getActivity();
        this.local_scope = raw.getScope();
        this.local_priority = raw.getPriority();
        this.local_cost = raw.getCost();

    }

    @Override
    public String toString()
    {
        return "ECLExceptionWrapper [" + "severity = " + local_severity + ", " + "source = " + local_source + ", " + "code = " + local_code + ", " + "message = " + local_message + ", " + "column = " + local_column + ", " + "lineNo = " + local_lineNo + ", " + "fileName = " + local_fileName + ", " + "activity = " + local_activity + ", " + "scope = " + local_scope + ", " + "priority = " + local_priority + ", " + "cost = " + local_cost + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException();
        raw.setSeverity( local_severity);
        raw.setSource( local_source);
        raw.setCode( local_code);
        raw.setMessage( local_message);
        raw.setColumn( local_column);
        raw.setLineNo( local_lineNo);
        raw.setFileName( local_fileName);
        raw.setActivity( local_activity);
        raw.setScope( local_scope);
        raw.setPriority( local_priority);
        raw.setCost( local_cost);
        return raw;
    }


    public void setSeverity( String _severity )
    {
        this.local_severity = _severity;
    }
    public String getSeverity( )
    {
        return this.local_severity;
    }
    public void setSource( String _source )
    {
        this.local_source = _source;
    }
    public String getSource( )
    {
        return this.local_source;
    }
    public void setCode( int _code )
    {
        this.local_code = _code;
    }
    public int getCode( )
    {
        return this.local_code;
    }
    public void setMessage( String _message )
    {
        this.local_message = _message;
    }
    public String getMessage( )
    {
        return this.local_message;
    }
    public void setColumn( int _column )
    {
        this.local_column = _column;
    }
    public int getColumn( )
    {
        return this.local_column;
    }
    public void setLineNo( int _lineNo )
    {
        this.local_lineNo = _lineNo;
    }
    public int getLineNo( )
    {
        return this.local_lineNo;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setActivity( int _activity )
    {
        this.local_activity = _activity;
    }
    public int getActivity( )
    {
        return this.local_activity;
    }
    public void setScope( String _scope )
    {
        this.local_scope = _scope;
    }
    public String getScope( )
    {
        return this.local_scope;
    }
    public void setPriority( int _priority )
    {
        this.local_priority = _priority;
    }
    public int getPriority( )
    {
        return this.local_priority;
    }
    public void setCost( double _cost )
    {
        this.local_cost = _cost;
    }
    public double getCost( )
    {
        return this.local_cost;
    }
}