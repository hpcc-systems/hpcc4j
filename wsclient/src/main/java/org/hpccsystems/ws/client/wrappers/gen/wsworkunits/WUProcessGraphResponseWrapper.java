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
 * Class name: WUProcessGraphResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-10-31T03:30:27.564Z
 */
public class WUProcessGraphResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected String local_theGraph;

    public WUProcessGraphResponseWrapper() {}

    public WUProcessGraphResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse wuprocessgraphresponse)
    {
        copy( wuprocessgraphresponse );
    }
    public WUProcessGraphResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, String _theGraph )
    {
        this.local_exceptions = _exceptions;
        this.local_theGraph = _theGraph;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        this.local_theGraph = raw.getTheGraph();

    }

    @Override
    public String toString()
    {
        return "WUProcessGraphResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "theGraph = " + local_theGraph + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUProcessGraphResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        raw.setTheGraph( local_theGraph);
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
    public void setTheGraph( String _theGraph )
    {
        this.local_theGraph = _theGraph;
    }
    public String getTheGraph( )
    {
        return this.local_theGraph;
    }
}