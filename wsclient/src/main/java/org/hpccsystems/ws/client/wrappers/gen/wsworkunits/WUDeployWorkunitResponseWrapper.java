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
 * Class name: WUDeployWorkunitResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.522Z
 */
public class WUDeployWorkunitResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ECLWorkunitWrapper local_workunit;

    public WUDeployWorkunitResponseWrapper() {}

    public WUDeployWorkunitResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse wudeployworkunitresponse)
    {
        copy( wudeployworkunitresponse );
    }
    public WUDeployWorkunitResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ECLWorkunitWrapper _workunit )
    {
        this.local_exceptions = _exceptions;
        this.local_workunit = _workunit;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getWorkunit() != null)
            this.local_workunit = new ECLWorkunitWrapper( raw.getWorkunit());

    }

    @Override
    public String toString()
    {
        return "WUDeployWorkunitResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "workunit = " + local_workunit + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUDeployWorkunitResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_workunit != null)
            raw.setWorkunit( local_workunit.getRaw());
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
    public void setWorkunit( ECLWorkunitWrapper _workunit )
    {
        this.local_workunit = _workunit;
    }
    public ECLWorkunitWrapper getWorkunit( )
    {
        return this.local_workunit;
    }
}