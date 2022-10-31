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
 * Class name: TpSwapNodeResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wstopology
 * TimeStamp: 2022-10-31T03:36:16.489Z
 */
public class TpSwapNodeResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected boolean local_tpSwapNodeResult;

    public TpSwapNodeResponseWrapper() {}

    public TpSwapNodeResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse tpswapnoderesponse)
    {
        copy( tpswapnoderesponse );
    }
    public TpSwapNodeResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, boolean _tpSwapNodeResult )
    {
        this.local_exceptions = _exceptions;
        this.local_tpSwapNodeResult = _tpSwapNodeResult;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_tpSwapNodeResult = raw.getTpSwapNodeResult();

    }

    @Override
    public String toString()
    {
        return "TpSwapNodeResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "tpSwapNodeResult = " + local_tpSwapNodeResult + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse raw = new org.hpccsystems.ws.client.gen.axis2.wstopology.latest.TpSwapNodeResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setTpSwapNodeResult( local_tpSwapNodeResult);
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
    public void setTpSwapNodeResult( boolean _tpSwapNodeResult )
    {
        this.local_tpSwapNodeResult = _tpSwapNodeResult;
    }
    public boolean getTpSwapNodeResult( )
    {
        return this.local_tpSwapNodeResult;
    }
}