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
 * Class name: QuerySetAliasActionResultWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.851Z
 */
public class QuerySetAliasActionResultWrapper
{
    protected String local_name;
    protected boolean local_success;
    protected int local_code;
    protected String local_message;

    public QuerySetAliasActionResultWrapper() {}

    public QuerySetAliasActionResultWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult querysetaliasactionresult)
    {
        copy( querysetaliasactionresult );
    }
    public QuerySetAliasActionResultWrapper( String _name, boolean _success, int _code, String _message )
    {
        this.local_name = _name;
        this.local_success = _success;
        this.local_code = _code;
        this.local_message = _message;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult raw )
    {
        if (raw == null)
            return;

        this.local_name = raw.getName();
        this.local_success = raw.getSuccess();
        this.local_code = raw.getCode();
        this.local_message = raw.getMessage();

    }

    @Override
    public String toString()
    {
        return "QuerySetAliasActionResultWrapper [" + "name = " + local_name + ", " + "success = " + local_success + ", " + "code = " + local_code + ", " + "message = " + local_message + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.QuerySetAliasActionResult();
        raw.setName( local_name);
        raw.setSuccess( local_success);
        raw.setCode( local_code);
        raw.setMessage( local_message);
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