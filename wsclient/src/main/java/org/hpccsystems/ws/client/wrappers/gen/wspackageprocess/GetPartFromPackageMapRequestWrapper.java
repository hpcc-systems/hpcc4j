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
 * Class name: GetPartFromPackageMapRequestWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 */
public class GetPartFromPackageMapRequestWrapper
{
    protected String local_target;
    protected String local_packageMap;
    protected boolean local_globalScope;
    protected String local_partName;

    public GetPartFromPackageMapRequestWrapper() {}

    public GetPartFromPackageMapRequestWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest getpartfrompackagemaprequest)
    {
        copy( getpartfrompackagemaprequest );
    }
    public GetPartFromPackageMapRequestWrapper( String _target, String _packageMap, boolean _globalScope, String _partName )
    {
        this.local_target = _target;
        this.local_packageMap = _packageMap;
        this.local_globalScope = _globalScope;
        this.local_partName = _partName;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest raw )
    {
        if (raw == null)
            return;

        this.local_target = raw.getTarget();
        this.local_packageMap = raw.getPackageMap();
        this.local_globalScope = raw.getGlobalScope();
        this.local_partName = raw.getPartName();

    }

    @Override
    public String toString()
    {
        return "GetPartFromPackageMapRequestWrapper [" + "target = " + local_target + ", " + "packageMap = " + local_packageMap + ", " + "globalScope = " + local_globalScope + ", " + "partName = " + local_partName + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.GetPartFromPackageMapRequest();
        raw.setTarget( local_target);
        raw.setPackageMap( local_packageMap);
        raw.setGlobalScope( local_globalScope);
        raw.setPartName( local_partName);
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
    public void setGlobalScope( boolean _globalScope )
    {
        this.local_globalScope = _globalScope;
    }
    public boolean getGlobalScope( )
    {
        return this.local_globalScope;
    }
    public void setPartName( String _partName )
    {
        this.local_partName = _partName;
    }
    public String getPartName( )
    {
        return this.local_partName;
    }
}