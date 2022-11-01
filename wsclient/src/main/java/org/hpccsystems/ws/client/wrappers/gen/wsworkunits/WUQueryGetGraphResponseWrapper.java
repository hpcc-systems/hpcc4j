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

/**
 * Generated Axis2 ADB stub class wrapper
 * Class name: WUQueryGetGraphResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.583Z
 */
public class WUQueryGetGraphResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLGraphExWrapper local_graphs;

    public WUQueryGetGraphResponseWrapper() {}

    public WUQueryGetGraphResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse wuquerygetgraphresponse)
    {
        copy( wuquerygetgraphresponse );
    }
    public WUQueryGetGraphResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLGraphExWrapper _graphs )
    {
        this.local_exceptions = _exceptions;
        this.local_graphs = _graphs;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getGraphs() != null)
            this.local_graphs = new ArrayOfECLGraphExWrapper( raw.getGraphs());

    }

    @Override
    public String toString()
    {
        return "WUQueryGetGraphResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "graphs = " + local_graphs + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQueryGetGraphResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_graphs != null)
            raw.setGraphs( local_graphs.getRaw());
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
    public void setGraphs( ArrayOfECLGraphExWrapper _graphs )
    {
        this.local_graphs = _graphs;
    }
    public ArrayOfECLGraphExWrapper getGraphs( )
    {
        return this.local_graphs;
    }
}