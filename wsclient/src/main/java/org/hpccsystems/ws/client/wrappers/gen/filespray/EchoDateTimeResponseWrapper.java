package org.hpccsystems.ws.client.wrappers.gen.filespray;



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
import java.util.Calendar;

/**
 * Generated Axis2 ADB stub class wrapper
 * WrapperMaker version: 1.7
 * Class name: EchoDateTimeResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.filespray
 * Service version: 1.23
 */
public class EchoDateTimeResponseWrapper
{
    protected Calendar local_result;

    public EchoDateTimeResponseWrapper() {}

    public EchoDateTimeResponseWrapper( org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse echodatetimeresponse)
    {
        copy( echodatetimeresponse );
    }
    public EchoDateTimeResponseWrapper( Calendar _result )
    {
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse raw )
    {
        if (raw == null)
            return;

        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "EchoDateTimeResponseWrapper [" + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.EchoDateTimeResponse();
        raw.setResult( local_result);
        return raw;
    }


    public void setResult( Calendar _result )
    {
        this.local_result = _result;
    }
    public Calendar getResult( )
    {
        return this.local_result;
    }
}