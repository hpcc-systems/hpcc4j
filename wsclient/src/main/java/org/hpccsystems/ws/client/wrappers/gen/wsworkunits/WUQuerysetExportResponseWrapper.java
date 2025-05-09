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
 * Class name: WUQuerysetExportResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUQuerysetExportResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_target;
    protected boolean local_compressed;
    protected DataHandler local_data;

    public WUQuerysetExportResponseWrapper() {}

    public WUQuerysetExportResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse wuquerysetexportresponse)
    {
        copy( wuquerysetexportresponse );
    }
    public WUQuerysetExportResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _target, boolean _compressed, DataHandler _data )
    {
        this.local_exceptions = _exceptions;
        this.local_target = _target;
        this.local_compressed = _compressed;
        this.local_data = _data;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_target = raw.getTarget();
        this.local_compressed = raw.getCompressed();
        this.local_data = raw.getData();

    }

    @Override
    public String toString()
    {
        return "WUQuerysetExportResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "target = " + local_target + ", " + "compressed = " + local_compressed + ", " + "data = " + local_data + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuerysetExportResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setTarget( local_target);
        raw.setCompressed( local_compressed);
        raw.setData( local_data);
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
    public void setTarget( String _target )
    {
        this.local_target = _target;
    }
    public String getTarget( )
    {
        return this.local_target;
    }
    public void setCompressed( boolean _compressed )
    {
        this.local_compressed = _compressed;
    }
    public boolean getCompressed( )
    {
        return this.local_compressed;
    }
    public void setData( DataHandler _data )
    {
        this.local_data = _data;
    }
    public DataHandler getData( )
    {
        return this.local_data;
    }
}