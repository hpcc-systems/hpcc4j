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
 * Class name: WUQuerySetCopyQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_83.WUQuerySetCopyQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2021-09-30T21:52:48.565Z
 */
public class WUQuerySetCopyQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_queryId;
    protected FileErrors_type1Wrapper local_fileErrors;

    public WUQuerySetCopyQueryResponseWrapper() {}

    public WUQuerySetCopyQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetCopyQueryResponse wuquerysetcopyqueryresponse)
    {
        copy( wuquerysetcopyqueryresponse );
    }
    public WUQuerySetCopyQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _queryId, FileErrors_type1Wrapper _fileErrors )
    {
        this.local_exceptions = _exceptions;
        this.local_queryId = _queryId;
        this.local_fileErrors = _fileErrors;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetCopyQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_queryId = raw.getQueryId();
        if (raw.getFileErrors() != null)
            this.local_fileErrors = new FileErrors_type1Wrapper( raw.getFileErrors());

    }

    @Override
    public String toString()
    {
        return "WUQuerySetCopyQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "queryId = " + local_queryId + ", " + "fileErrors = " + local_fileErrors + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetCopyQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetCopyQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerySetCopyQueryResponse();
        raw.setQueryId( local_queryId);
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
    public void setQueryId( String _queryId )
    {
        this.local_queryId = _queryId;
    }
    public String getQueryId( )
    {
        return this.local_queryId;
    }
    public void setFileErrors( FileErrors_type1Wrapper _fileErrors )
    {
        this.local_fileErrors = _fileErrors;
    }
    public FileErrors_type1Wrapper getFileErrors( )
    {
        return this.local_fileErrors;
    }
}