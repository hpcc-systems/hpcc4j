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
 * Class name: WUAbortResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 */
public class WUAbortResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfWUActionResultWrapper local_actionResults;

    public WUAbortResponseWrapper() {}

    public WUAbortResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse wuabortresponse)
    {
        copy( wuabortresponse );
    }
    public WUAbortResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfWUActionResultWrapper _actionResults )
    {
        this.local_exceptions = _exceptions;
        this.local_actionResults = _actionResults;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getActionResults() != null)
            this.local_actionResults = new ArrayOfWUActionResultWrapper( raw.getActionResults());

    }

    @Override
    public String toString()
    {
        return "WUAbortResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "actionResults = " + local_actionResults + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUAbortResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_actionResults != null)
            raw.setActionResults( local_actionResults.getRaw());
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
    public void setActionResults( ArrayOfWUActionResultWrapper _actionResults )
    {
        this.local_actionResults = _actionResults;
    }
    public ArrayOfWUActionResultWrapper getActionResults( )
    {
        return this.local_actionResults;
    }
}