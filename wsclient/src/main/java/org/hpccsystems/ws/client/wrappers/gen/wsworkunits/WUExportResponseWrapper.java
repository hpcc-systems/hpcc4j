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
import jakarta.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUExportResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUExportResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DataHandler local_exportData;

    public WUExportResponseWrapper() {}

    public WUExportResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse wuexportresponse)
    {
        copy( wuexportresponse );
    }
    public WUExportResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _exportData )
    {
        this.local_exceptions = _exceptions;
        this.local_exportData = _exportData;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_exportData = raw.getExportData();

    }

    @Override
    public String toString()
    {
        return "WUExportResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "exportData = " + local_exportData + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUExportResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setExportData( local_exportData);
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
    public void setExportData( DataHandler _exportData )
    {
        this.local_exportData = _exportData;
    }
    public DataHandler getExportData( )
    {
        return this.local_exportData;
    }
}