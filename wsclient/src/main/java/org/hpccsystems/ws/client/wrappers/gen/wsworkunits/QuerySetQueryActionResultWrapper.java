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
 * Class name: QuerySetQueryActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.855Z
 */
public class QuerySetQueryActionResultWrapper
{
    protected String local_queryId;
    protected boolean local_suspended;
    protected boolean local_success;
    protected int local_code;
    protected String local_message;

    public QuerySetQueryActionResultWrapper() {}

    public QuerySetQueryActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult querysetqueryactionresult)
    {
        copy( querysetqueryactionresult );
    }
    public QuerySetQueryActionResultWrapper( String _queryId, boolean _suspended, boolean _success, int _code, String _message )
    {
        this.local_queryId = _queryId;
        this.local_suspended = _suspended;
        this.local_success = _success;
        this.local_code = _code;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult raw )
    {
        if (raw == null)
            return;

        this.local_queryId = raw.getQueryId();
        this.local_suspended = raw.getSuspended();
        this.local_success = raw.getSuccess();
        this.local_code = raw.getCode();
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "QuerySetQueryActionResultWrapper [" + "queryId = " + local_queryId + ", " + "suspended = " + local_suspended + ", " + "success = " + local_success + ", " + "code = " + local_code + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetQueryActionResult();
        raw.setQueryId( local_queryId);
        raw.setSuspended( local_suspended);
        raw.setSuccess( local_success);
        raw.setCode( local_code);
        raw.setMessage( local_message);
        return raw;
    }


    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setSuspended( boolean _suspended )
    {
        this.local_suspended = _suspended;
    }
    public boolean getSuspended( )
    {
        return this.local_suspended;
    }
    public void setSuccess( boolean _success )
    {
        this.local_success = _success;
    }
    public boolean getSuccess( )
    {
        return this.local_success;
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
}