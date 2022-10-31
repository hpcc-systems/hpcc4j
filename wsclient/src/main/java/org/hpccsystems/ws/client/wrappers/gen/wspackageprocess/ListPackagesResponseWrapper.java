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
 * Class name: ListPackagesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-10-31T03:36:33.194Z
 */
public class ListPackagesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected BasePackageStatusWrapper local_status;
    protected ArrayOfPackageListMapDataWrapper local_packageMapList;

    public ListPackagesResponseWrapper() {}

    public ListPackagesResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse listpackagesresponse)
    {
        copy( listpackagesresponse );
    }
    public ListPackagesResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, ArrayOfPackageListMapDataWrapper _packageMapList )
    {
        this.local_exceptions = _exceptions;
        this.local_status = _status;
        this.local_packageMapList = _packageMapList;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStatus() != null)
            this.local_status = new BasePackageStatusWrapper( raw.getStatus());
        if (raw.getPackageMapList() != null)
            this.local_packageMapList = new ArrayOfPackageListMapDataWrapper( raw.getPackageMapList());

    }

    @Override
    public String toString()
    {
        return "ListPackagesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "packageMapList = " + local_packageMapList + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackagesResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_status != null)
            raw.setStatus( local_status.getRaw());
        if (local_packageMapList != null)
            raw.setPackageMapList( local_packageMapList.getRaw());
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
    public void setStatus( BasePackageStatusWrapper _status )
    {
        this.local_status = _status;
    }
    public BasePackageStatusWrapper getStatus( )
    {
        return this.local_status;
    }
    public void setPackageMapList( ArrayOfPackageListMapDataWrapper _packageMapList )
    {
        this.local_packageMapList = _packageMapList;
    }
    public ArrayOfPackageListMapDataWrapper getPackageMapList( )
    {
        return this.local_packageMapList;
    }
}