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
import org.apache.axis2.databinding.types.UnsignedInt;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: ExecuteSQLResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wssql
 * TimeStamp: 2022-10-31T03:44:01.389Z
 */
public class ExecuteSQLResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_parentWuId;
    protected String local_result;
    protected ECLWorkunitWrapper local_workunit;
    protected int local_resultLimit;
    protected UnsignedInt local_resultWindowStart;
    protected UnsignedInt local_resultWindowCount;

    public ExecuteSQLResponseWrapper() {}

    public ExecuteSQLResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse executesqlresponse)
    {
        copy( executesqlresponse );
    }
    public ExecuteSQLResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _parentWuId, String _result, ECLWorkunitWrapper _workunit, int _resultLimit, UnsignedInt _resultWindowStart, UnsignedInt _resultWindowCount )
    {
        this.local_exceptions = _exceptions;
        this.local_parentWuId = _parentWuId;
        this.local_result = _result;
        this.local_workunit = _workunit;
        this.local_resultLimit = _resultLimit;
        this.local_resultWindowStart = _resultWindowStart;
        this.local_resultWindowCount = _resultWindowCount;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_parentWuId = raw.getParentWuId();
        this.local_result = raw.getResult();
        if (raw.getWorkunit() != null)
            this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());
        this.local_resultLimit = raw.getResultLimit();
        this.local_resultWindowStart = raw.getResultWindowStart();
        this.local_resultWindowCount = raw.getResultWindowCount();

    }

    @Override
    public String toString()
    {
        return "ExecuteSQLResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "parentWuId = " + local_parentWuId + ", " + "result = " + local_result + ", " + "workunit = " + local_workunit + ", " + "resultLimit = " + local_resultLimit + ", " + "resultWindowStart = " + local_resultWindowStart + ", " + "resultWindowCount = " + local_resultWindowCount + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse raw = new org.hpccsystems.ws.client.gen.axis2.wssql.latest.ExecuteSQLResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setParentWuId( local_parentWuId);
        raw.setResult( local_result);
        if (local_workunit != null)
            raw.setWorkunit( local_workunit.getRaw());
        raw.setResultLimit( local_resultLimit);
        raw.setResultWindowStart( local_resultWindowStart);
        raw.setResultWindowCount( local_resultWindowCount);
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
    public void setParentWuId( String _parentWuId )
    {
        this.local_parentWuId = _parentWuId;
    }
    public String getParentWuId( )
    {
        return this.local_parentWuId;
    }
    public void setResult( String _result )
    {
        this.local_result = _result;
    }
    public String getResult( )
    {
        return this.local_result;
    }
    public void setWorkunit( ECLWorkunitWrapper _workunit )
    {
        this.local_workunit = _workunit;
    }
    public ECLWorkunitWrapper getWorkunit( )
    {
        return this.local_workunit;
    }
    public void setResultLimit( int _resultLimit )
    {
        this.local_resultLimit = _resultLimit;
    }
    public int getResultLimit( )
    {
        return this.local_resultLimit;
    }
    public void setResultWindowStart( UnsignedInt _resultWindowStart )
    {
        this.local_resultWindowStart = _resultWindowStart;
    }
    public UnsignedInt getResultWindowStart( )
    {
        return this.local_resultWindowStart;
    }
    public void setResultWindowCount( UnsignedInt _resultWindowCount )
    {
        this.local_resultWindowCount = _resultWindowCount;
    }
    public UnsignedInt getResultWindowCount( )
    {
        return this.local_resultWindowCount;
    }
}