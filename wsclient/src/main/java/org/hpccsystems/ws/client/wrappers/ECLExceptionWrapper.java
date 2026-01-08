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


public class ECLExceptionWrapper extends BaseExceptionWrapper
{
    protected String severity;
    protected int    code;
    protected String fileName;
    protected int    lineNo;
    protected int    column;
    protected int    activity;
    protected String scope;
    protected int    priority;
    protected double cost;

    /**
     * Instantiates a new ECL exception wrapper.
     */
    public ECLExceptionWrapper()
    {
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param eclexception
     *            the eclexception
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException eclexception)
    {
        copy(eclexception);
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param _source
     *            the source
     * @param _severity
     *            the severity
     * @param _code
     *            the code
     * @param _message
     *            the message
     * @param _fileName
     *            the file name
     * @param _lineNo
     *            the line no
     * @param _column
     *            the column
     * @param _activity
     *            the activity
     * @param _scope
     *            the scope
     * @param _priority
     *            the priority
     * @param _cost
     *            the cost
     */
    public ECLExceptionWrapper(String _source, String _severity, int _code, String _message, String _fileName, int _lineNo, int _column,
            int _activity, String _scope, int _priority, double _cost)
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
        this.cost = _cost;
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param eclException
     *            the ecl exception
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException eclException)
    {
        copy(eclException);
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param eclException
     *            the ecl exception
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLException eclException)
    {
        copy(eclException);
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param eclException
     *            the ecl exception
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException eclException)
    {
        copy(eclException);
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param eclException
     *            the ecl exception
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException eclException)
    {
        copy(eclException);
    }

    /**
     * Instantiates a new ECL exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLException raw)
    {
        code = raw.getCode();
        column = raw.getColumn();
        fileName = raw.getFileName();
        lineNo = raw.getLineNo();
        message = raw.getMessage();
        severity = raw.getSeverity();
        source = raw.getSource();
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLException raw)
    {
        code = raw.getCode();
        column = raw.getColumn();
        fileName = raw.getFileName();
        lineNo = raw.getLineNo();
        message = raw.getMessage();
        severity = raw.getSeverity();
        source = raw.getSource();
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLException raw)
    {
        code = raw.getCode();
        column = raw.getColumn();
        fileName = raw.getFileName();
        lineNo = raw.getLineNo();
        message = raw.getMessage();
        severity = raw.getSeverity();
        source = raw.getSource();
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
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

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException raw)
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
        this.cost = raw.getCost();
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException raw)
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

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("code: " + getCode() + "\t");
        sb.append("scope: " + getScope() + "\t");
        sb.append("severity: " + getSeverity() + "\t");
        sb.append("activity: " + getActivity() + "\n\t");
        sb.append("file: " + getFileName() + "\t");
        sb.append("line: " + getLineNo() + "\t");
        sb.append("col: " + getColumn() + "\t");
        sb.append("cost: " + getCost() + "\t");
        sb.append("Message: " + getMessage());
        return sb.toString();
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException getRawWsSQL()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ECLException();
        raw.setSource(source);
        raw.setSeverity(severity);
        raw.setCode(code);
        raw.setMessage(message);
        raw.setFileName(fileName);
        raw.setLineNo(lineNo);
        raw.setColumn(column);
        raw.setActivity(activity);
        raw.setScope(scope);
        raw.setPriority(priority);
        return raw;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.wrappers.BaseExceptionWrapper#setSource(java.lang.String)
     */
    @Override
    public void setSource(String _source)
    {
        this.source = _source;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.wrappers.BaseExceptionWrapper#getSource()
     */
    @Override
    public String getSource()
    {
        return this.source;
    }

    /**
     * Sets the severity.
     *
     * @param _severity
     *            the new severity
     */
    public void setSeverity(String _severity)
    {
        this.severity = _severity;
    }

    /**
     * Gets the severity.
     *
     * @return the severity
     */
    public String getSeverity()
    {
        return this.severity;
    }

    /**
     * Sets the code.
     *
     * @param _code
     *            the new code
     */
    public void setCode(int _code)
    {
        this.code = _code;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public int getCode()
    {
        return this.code;
    }

    /**
     * Sets the file name.
     *
     * @param _fileName
     *            the new file name
     */
    public void setFileName(String _fileName)
    {
        this.fileName = _fileName;
    }

    /**
     * Gets the file name.
     *
     * @return the file name
     */
    public String getFileName()
    {
        return this.fileName;
    }

    /**
     * Sets the line no.
     *
     * @param _lineNo
     *            the new line no
     */
    public void setLineNo(int _lineNo)
    {
        this.lineNo = _lineNo;
    }

    /**
     * Gets the line no.
     *
     * @return the line no
     */
    public int getLineNo()
    {
        return this.lineNo;
    }

    /**
     * Sets the column.
     *
     * @param _column
     *            the new column
     */
    public void setColumn(int _column)
    {
        this.column = _column;
    }

    /**
     * Gets the column.
     *
     * @return the column
     */
    public int getColumn()
    {
        return this.column;
    }

    /**
     * Sets the activity.
     *
     * @param _activity
     *            the new activity
     */
    public void setActivity(int _activity)
    {
        this.activity = _activity;
    }

    /**
     * Gets the activity.
     *
     * @return the activity
     */
    public int getActivity()
    {
        return this.activity;
    }

    /**
     * Sets the scope.
     *
     * @param _scope
     *            the new scope
     */
    public void setScope(String _scope)
    {
        this.scope = _scope;
    }

    /**
     * Gets the scope.
     *
     * @return the scope
     */
    public String getScope()
    {
        return this.scope;
    }

    /**
     * Sets the priority.
     *
     * @param _priority
     *            the new priority
     */
    public void setPriority(int _priority)
    {
        this.priority = _priority;
    }

    /**
     * Gets the priority.
     *
     * @return the priority
     */
    public int getPriority()
    {
        return this.priority;
    }

    /**
     * Sets the cost.
     *
     * @param _cost
     *            the new cost
     */
    public void setCost(double _cost)
    {
        this.cost = _cost;
    }

    /**
     * Gets the cost.
     *
     * @return the cost
     */
    public double getCost()
    {
        return this.cost;
    }

    /**
     * Gets the raw version.
     *
     * @return the raw version
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException ex = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLException();
        ex.setActivity(activity);
        ex.setCode(code);
        ex.setColumn(column);
        ex.setFileName(fileName);
        ex.setLineNo(lineNo);
        ex.setMessage(message);
        ex.setSeverity(severity);
        ex.setSource(source);
        ex.setPriority(priority);
        ex.setScope(scope);
        ex.setCost(cost);
        return ex;
    }
}
