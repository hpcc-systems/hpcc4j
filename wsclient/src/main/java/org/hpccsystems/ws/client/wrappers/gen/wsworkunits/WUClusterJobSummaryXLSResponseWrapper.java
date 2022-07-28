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
import javax.activation.DataHandler;

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUClusterJobSummaryXLSResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.886Z
 */
public class WUClusterJobSummaryXLSResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected DataHandler local_result;

    public WUClusterJobSummaryXLSResponseWrapper() {}

    public WUClusterJobSummaryXLSResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse wuclusterjobsummaryxlsresponse)
    {
        copy( wuclusterjobsummaryxlsresponse );
    }
    public WUClusterJobSummaryXLSResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, DataHandler _result )
    {
        this.local_exceptions = _exceptions;
        this.local_result = _result;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_result = raw.getResult();

    }

    @Override
    public String toString()
    {
        return "WUClusterJobSummaryXLSResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "result = " + local_result + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUClusterJobSummaryXLSResponse();
        raw.setResult( local_result);
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
    public void setResult( DataHandler _result )
    {
        this.local_result = _result;
    }
    public DataHandler getResult( )
    {
        return this.local_result;
    }
}