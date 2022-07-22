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
 * Class name: WUCopyQuerySetResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.892Z
 */
public class WUCopyQuerySetResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected CopiedQueries_type0Wrapper local_copiedQueries;
    protected ExistingQueries_type1Wrapper local_existingQueries;
    protected FileErrors_type3Wrapper local_fileErrors;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public WUCopyQuerySetResponseWrapper() {}

    public WUCopyQuerySetResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse wucopyquerysetresponse)
    {
        copy( wucopyquerysetresponse );
    }
    public WUCopyQuerySetResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, CopiedQueries_type0Wrapper _copiedQueries, ExistingQueries_type1Wrapper _existingQueries, FileErrors_type3Wrapper _fileErrors, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_copiedQueries = _copiedQueries;
        this.local_existingQueries = _existingQueries;
        this.local_fileErrors = _fileErrors;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getCopiedQueries() != null)
            this.local_copiedQueries = new CopiedQueries_type0Wrapper( raw.getCopiedQueries());
        if (raw.getExistingQueries() != null)
            this.local_existingQueries = new ExistingQueries_type1Wrapper( raw.getExistingQueries());
        if (raw.getFileErrors() != null)
            this.local_fileErrors = new FileErrors_type3Wrapper( raw.getFileErrors());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "WUCopyQuerySetResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "copiedQueries = " + local_copiedQueries + ", " + "existingQueries = " + local_existingQueries + ", " + "fileErrors = " + local_fileErrors + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUCopyQuerySetResponse();
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setDfuPublisherState( local_dfuPublisherState);
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
    public void setCopiedQueries( CopiedQueries_type0Wrapper _copiedQueries )
    {
        this.local_copiedQueries = _copiedQueries;
    }
    public CopiedQueries_type0Wrapper getCopiedQueries( )
    {
        return this.local_copiedQueries;
    }
    public void setExistingQueries( ExistingQueries_type1Wrapper _existingQueries )
    {
        this.local_existingQueries = _existingQueries;
    }
    public ExistingQueries_type1Wrapper getExistingQueries( )
    {
        return this.local_existingQueries;
    }
    public void setFileErrors( FileErrors_type3Wrapper _fileErrors )
    {
        this.local_fileErrors = _fileErrors;
    }
    public FileErrors_type3Wrapper getFileErrors( )
    {
        return this.local_fileErrors;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setDfuPublisherState( String _dfuPublisherState )
    {
        this.local_dfuPublisherState = _dfuPublisherState;
    }
    public String getDfuPublisherState( )
    {
        return this.local_dfuPublisherState;
    }
}