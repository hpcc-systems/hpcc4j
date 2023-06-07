package org.hpccsystems.ws.client.wrappers.gen.wspackageprocess;

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
 * Class name: GetPackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 */
public class GetPackageRequestWrapper
{
    protected String local_target;
    protected String local_process;

    public GetPackageRequestWrapper() {}

    public GetPackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest getpackagerequest)
    {
        copy( getpackagerequest );
    }
    public GetPackageRequestWrapper( String _target, String _process )
    {
        this.local_target = _target;
        this.local_process = _process;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_process = raw.getProcess();

    }

    @Override
    public String toString()
    {
        return "GetPackageRequestWrapper [" + "target = " + local_target + ", " + "process = " + local_process + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPackageRequest();
        raw.setTarget( local_target);
        raw.setProcess( local_process);
        return raw;
    }


    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
}