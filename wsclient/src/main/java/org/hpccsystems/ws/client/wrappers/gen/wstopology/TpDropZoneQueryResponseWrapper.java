package org.hpccsystems.ws.client.wrappers.gen.wstopology;



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
 * Class name: TpDropZoneQueryResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.461Z
 */
public class TpDropZoneQueryResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfTpDropZoneWrapper local_tpDropZones;

    public TpDropZoneQueryResponseWrapper() {}

    public TpDropZoneQueryResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse tpdropzonequeryresponse)
    {
        copy( tpdropzonequeryresponse );
    }
    public TpDropZoneQueryResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfTpDropZoneWrapper _tpDropZones )
    {
        this.local_exceptions = _exceptions;
        this.local_tpDropZones = _tpDropZones;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getTpDropZones() != null)
            this.local_tpDropZones = new ArrayOfTpDropZoneWrapper( raw.getTpDropZones());

    }

    @Override
    public String toString()
    {
        return "TpDropZoneQueryResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tpDropZones = " + local_tpDropZones + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpDropZoneQueryResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_tpDropZones != null)
            raw.setTpDropZones( local_tpDropZones.getRaw());
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
    public void setTpDropZones( ArrayOfTpDropZoneWrapper _tpDropZones )
    {
        this.local_tpDropZones = _tpDropZones;
    }
    public ArrayOfTpDropZoneWrapper getTpDropZones( )
    {
        return this.local_tpDropZones;
    }
}