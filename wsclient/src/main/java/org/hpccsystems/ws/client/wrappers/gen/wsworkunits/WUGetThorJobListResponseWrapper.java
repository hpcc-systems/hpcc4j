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
 * Class name: WUGetThorJobListResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.540Z
 */
public class WUGetThorJobListResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLJobWrapper local_jobList;
    protected ArrayOfECLJobWrapper local_inProgressJobList;
    protected String local_warning;

    public WUGetThorJobListResponseWrapper() {}

    public WUGetThorJobListResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse wugetthorjoblistresponse)
    {
        copy( wugetthorjoblistresponse );
    }
    public WUGetThorJobListResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLJobWrapper _jobList, ArrayOfECLJobWrapper _inProgressJobList, String _warning )
    {
        this.local_exceptions = _exceptions;
        this.local_jobList = _jobList;
        this.local_inProgressJobList = _inProgressJobList;
        this.local_warning = _warning;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getJobList() != null)
            this.local_jobList = new ArrayOfECLJobWrapper( raw.getJobList());
        if (raw.getInProgressJobList() != null)
            this.local_inProgressJobList = new ArrayOfECLJobWrapper( raw.getInProgressJobList());
        this.local_warning = raw.getWarning();

    }

    @Override
    public String toString()
    {
        return "WUGetThorJobListResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "jobList = " + local_jobList + ", " + "inProgressJobList = " + local_inProgressJobList + ", " + "warning = " + local_warning + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUGetThorJobListResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_jobList != null)
            raw.setJobList( local_jobList.getRaw());
        if (local_inProgressJobList != null)
            raw.setInProgressJobList( local_inProgressJobList.getRaw());
        raw.setWarning( local_warning);
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
    public void setJobList( ArrayOfECLJobWrapper _jobList )
    {
        this.local_jobList = _jobList;
    }
    public ArrayOfECLJobWrapper getJobList( )
    {
        return this.local_jobList;
    }
    public void setInProgressJobList( ArrayOfECLJobWrapper _inProgressJobList )
    {
        this.local_inProgressJobList = _inProgressJobList;
    }
    public ArrayOfECLJobWrapper getInProgressJobList( )
    {
        return this.local_inProgressJobList;
    }
    public void setWarning( String _warning )
    {
        this.local_warning = _warning;
    }
    public String getWarning( )
    {
        return this.local_warning;
    }
}