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
 * Class name: WUJobListResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.934Z
 */
public class WUJobListResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_startDate;
    protected String local_endDate;
    protected ArrayOfECLJobWrapper local_jobs;

    public WUJobListResponseWrapper() {}

    public WUJobListResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse wujoblistresponse)
    {
        copy( wujoblistresponse );
    }
    public WUJobListResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _startDate, String _endDate, ArrayOfECLJobWrapper _jobs )
    {
        this.local_exceptions = _exceptions;
        this.local_startDate = _startDate;
        this.local_endDate = _endDate;
        this.local_jobs = _jobs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_startDate = raw.getStartDate();
        this.local_endDate = raw.getEndDate();
        if (raw.getJobs() != null)
            this.local_jobs = new ArrayOfECLJobWrapper( raw.getJobs());

    }

    @Override
    public String toString()
    {
        return "WUJobListResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "startDate = " + local_startDate + ", " + "endDate = " + local_endDate + ", " + "jobs = " + local_jobs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUJobListResponse();
        raw.setStartDate( local_startDate);
        raw.setEndDate( local_endDate);
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
    public void setStartDate( String _startDate )
    {
        this.local_startDate = _startDate;
    }
    public String getStartDate( )
    {
        return this.local_startDate;
    }
    public void setEndDate( String _endDate )
    {
        this.local_endDate = _endDate;
    }
    public String getEndDate( )
    {
        return this.local_endDate;
    }
    public void setJobs( ArrayOfECLJobWrapper _jobs )
    {
        this.local_jobs = _jobs;
    }
    public ArrayOfECLJobWrapper getJobs( )
    {
        return this.local_jobs;
    }
}