package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2019-08-03T01:14:54.545Z
 */

public class ECLExceptionWrapper extends BaseExceptionWrapper
{
    protected String severity;
    protected int code;
    protected String fileName;
    protected int lineNo;
    protected int column;
    protected int activity;
    protected String scope;
    protected int priority;

    public ECLExceptionWrapper() {}

    public ECLExceptionWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException eclexception)
    {
        copy( eclexception );
    }

    public ECLExceptionWrapper( String _source, String _severity, int _code, String _message, String _fileName, int _lineNo, int _column, int _activity, String _scope, int _priority )
    {
        this.source = _source;
        this.severity = _severity;
        this.code = _code;
        this.message = _message;
        this.fileName = _fileName;
        this.lineNo = _lineNo;
        this.column = _column;
        this.activity = _activity;
        this.scope = _scope;
        this.priority = _priority;
    }

    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException eclException)
    {
        copy(eclException);
    }

    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException eclException)
    {
        copy(eclException);
    }

    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException eclException)
    {
        copy(eclException);
    }

    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException eclException)
    {
        copy(eclException);
    }

    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException raw)
    {
        code=raw.getCode();
        column=raw.getColumn();
        fileName=raw.getFileName();
        lineNo=raw.getLineNo();
        message=raw.getMessage();
        severity=raw.getSeverity();
        source=raw.getSource();
    }

    private void copy(ECLException raw)
    {
        this.source = raw.getSource();
        this.severity = raw.getSeverity();
        this.code = raw.getCode();
        this.message = raw.getMessage();
        this.fileName = raw.getFileName();
        this.lineNo = raw.getLineNo();
        this.column = raw.getColumn();
    }

    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException raw)
    {
        this.source = raw.getSource();
        this.severity = raw.getSeverity();
        this.code = raw.getCode();
        this.message = raw.getMessage();
        this.fileName = raw.getFileName();
        this.lineNo = raw.getLineNo();
        this.column = raw.getColumn();
        this.activity = raw.getActivity();
        this.scope = raw.getScope();
        this.priority = raw.getPriority();
    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException raw )
    {
        this.source = raw.getSource();
        this.severity = raw.getSeverity();
        this.code = raw.getCode();
        this.message = raw.getMessage();
        this.fileName = raw.getFileName();
        this.lineNo = raw.getLineNo();
        this.column = raw.getColumn();
        this.activity = raw.getActivity();
        this.scope = raw.getScope();
        this.priority = raw.getPriority();
    }

    @Override
    public String toString()
    {
        StringBuffer sb=new StringBuffer();
        sb.append("code: " + getCode() + "\t");
        sb.append("scope: " + getScope() + "\t");
        sb.append("severity: " + getSeverity() + "\t");
        sb.append("activity: " + getActivity() + "\n\t");
        sb.append("file: " + getFileName() + "\t");
        sb.append("line: " + getLineNo() + "\t");
        sb.append("col: " + getColumn() + "\t");
        sb.append("Message: " + getMessage());
        return sb.toString();
    }

    public org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException raw = new org.hpccsystems.ws.client.gen.axis2.wssql.v1_05.ECLException();
        raw.setSource( source);
        raw.setSeverity( severity);
        raw.setCode( code);
        raw.setMessage( message);
        raw.setFileName( fileName);
        raw.setLineNo( lineNo);
        raw.setColumn( column);
        raw.setActivity( activity);
        raw.setScope( scope);
        raw.setPriority( priority);
        return raw;
    }

    public void setSource( String _source )
    {
        this.source = _source;
    }
    public String getSource( )
    {
        return this.source;
    }
    public void setSeverity( String _severity )
    {
        this.severity = _severity;
    }
    public String getSeverity( )
    {
        return this.severity;
    }
    public void setCode( int _code )
    {
        this.code = _code;
    }
    public int getCode( )
    {
        return this.code;
    }
    public void setFileName( String _fileName )
    {
        this.fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.fileName;
    }
    public void setLineNo( int _lineNo )
    {
        this.lineNo = _lineNo;
    }
    public int getLineNo( )
    {
        return this.lineNo;
    }
    public void setColumn( int _column )
    {
        this.column = _column;
    }
    public int getColumn( )
    {
        return this.column;
    }
    public void setActivity( int _activity )
    {
        this.activity = _activity;
    }
    public int getActivity( )
    {
        return this.activity;
    }
    public void setScope( String _scope )
    {
        this.scope = _scope;
    }
    public String getScope( )
    {
        return this.scope;
    }
    public void setPriority( int _priority )
    {
        this.priority = _priority;
    }
    public int getPriority( )
    {
        return this.priority;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException ex=new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException();
        ex.setActivity(activity);
        ex.setCode(code);
        ex.setColumn(column);
        ex.setFileName(fileName);
        ex.setLineNo(lineNo);
        ex.setMessage(message);
        ex.setSeverity(severity);
        ex.setSource(source);
        return ex;
    }
}
