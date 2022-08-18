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
 * Class name: ActivatePackageRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-07-25T17:42:18.117Z
 */
public class ActivatePackageRequestWrapper
{
    protected String local_target;
    protected String local_packageMap;
    protected String local_process;
    protected boolean local_globalScope;

    public ActivatePackageRequestWrapper() {}

    public ActivatePackageRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest activatepackagerequest)
    {
        copy( activatepackagerequest );
    }
    public ActivatePackageRequestWrapper( String _target, String _packageMap, String _process, boolean _globalScope )
    {
        this.local_target = _target;
        this.local_packageMap = _packageMap;
        this.local_process = _process;
        this.local_globalScope = _globalScope;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_packageMap = raw.getPackageMap();
        this.local_process = raw.getProcess();
        this.local_globalScope = raw.getGlobalScope();

    }

    @Override
    public String toString()
    {
        return "ActivatePackageRequestWrapper [" + "target = " + local_target + ", " + "packageMap = " + local_packageMap + ", " + "process = " + local_process + ", " + "globalScope = " + local_globalScope + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ActivatePackageRequest();
        raw.setTarget( local_target);
        raw.setPackageMap( local_packageMap);
        raw.setProcess( local_process);
        raw.setGlobalScope( local_globalScope);
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
    public void setPackageMap( String _packageMap )
    {
        this.local_packageMap = _packageMap;
    }
    public String getPackageMap( )
    {
        return this.local_packageMap;
    }
    public void setProcess( String _process )
    {
        this.local_process = _process;
    }
    public String getProcess( )
    {
        return this.local_process;
    }
    public void setGlobalScope( boolean _globalScope )
    {
        this.local_globalScope = _globalScope;
    }
    public boolean getGlobalScope( )
    {
        return this.local_globalScope;
    }
}