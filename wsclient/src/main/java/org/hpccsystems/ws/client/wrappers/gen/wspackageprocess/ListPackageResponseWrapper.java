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
 * Class name: ListPackageResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wspackageprocess
 * TimeStamp: 2022-10-31T03:36:33.193Z
 */
public class ListPackageResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected BasePackageStatusWrapper local_status;
    protected ArrayOfPackageListMapDataWrapper local_pkgListMapData;

    public ListPackageResponseWrapper() {}

    public ListPackageResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse listpackageresponse)
    {
        copy( listpackageresponse );
    }
    public ListPackageResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, BasePackageStatusWrapper _status, ArrayOfPackageListMapDataWrapper _pkgListMapData )
    {
        this.local_exceptions = _exceptions;
        this.local_status = _status;
        this.local_pkgListMapData = _pkgListMapData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getStatus() != null)
            this.local_status = new BasePackageStatusWrapper( raw.getStatus());
        if (raw.getPkgListMapData() != null)
            this.local_pkgListMapData = new ArrayOfPackageListMapDataWrapper( raw.getPkgListMapData());

    }

    @Override
    public String toString()
    {
        return "ListPackageResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "status = " + local_status + ", " + "pkgListMapData = " + local_pkgListMapData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse raw = new org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.ListPackageResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_status != null)
            raw.setStatus( local_status.getRaw());
        if (local_pkgListMapData != null)
            raw.setPkgListMapData( local_pkgListMapData.getRaw());
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
    public void setPkgListMapData( ArrayOfPackageListMapDataWrapper _pkgListMapData )
    {
        this.local_pkgListMapData = _pkgListMapData;
    }
    public ArrayOfPackageListMapDataWrapper getPkgListMapData( )
    {
        return this.local_pkgListMapData;
    }
}