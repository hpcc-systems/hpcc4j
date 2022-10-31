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
 * Class name: WUListQueriesUsingFileResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.559Z
 */
public class WUListQueriesUsingFileResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_process;
    protected String local_fileName;
    protected ArrayOfTargetQueriesUsingFileWrapper local_targets;

    public WUListQueriesUsingFileResponseWrapper() {}

    public WUListQueriesUsingFileResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse wulistqueriesusingfileresponse)
    {
        copy( wulistqueriesusingfileresponse );
    }
    public WUListQueriesUsingFileResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _process, String _fileName, ArrayOfTargetQueriesUsingFileWrapper _targets )
    {
        this.local_exceptions = _exceptions;
        this.local_process = _process;
        this.local_fileName = _fileName;
        this.local_targets = _targets;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_process = raw.getProcess();
        this.local_fileName = raw.getFileName();
        if (raw.getTargets() != null)
            this.local_targets = new ArrayOfTargetQueriesUsingFileWrapper( raw.getTargets());

    }

    @Override
    public String toString()
    {
        return "WUListQueriesUsingFileResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "process = " + local_process + ", " + "fileName = " + local_fileName + ", " + "targets = " + local_targets + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUListQueriesUsingFileResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setProcess( local_process);
        raw.setFileName( local_fileName);
        if (local_targets != null)
            raw.setTargets( local_targets.getRaw());
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
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setFileName( String _fileName )
    {
        this.local_fileName = _fileName;
    }
    public String getFileName( )
    {
        return this.local_fileName;
    }
    public void setTargets( ArrayOfTargetQueriesUsingFileWrapper _targets )
    {
        this.local_targets = _targets;
    }
    public ArrayOfTargetQueriesUsingFileWrapper getTargets( )
    {
        return this.local_targets;
    }
}