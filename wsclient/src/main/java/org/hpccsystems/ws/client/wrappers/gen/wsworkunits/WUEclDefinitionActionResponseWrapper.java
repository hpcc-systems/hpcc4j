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
 * Class name: WUEclDefinitionActionResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsworkunits
 * TimeStamp: 2022-07-22T20:33:16.907Z
 */
public class WUEclDefinitionActionResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfWUEclDefinitionActionResultWrapper local_actionResults;
    protected String local_dfuPublisherWuid;
    protected String local_dfuPublisherState;

    public WUEclDefinitionActionResponseWrapper() {}

    public WUEclDefinitionActionResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse wuecldefinitionactionresponse)
    {
        copy( wuecldefinitionactionresponse );
    }
    public WUEclDefinitionActionResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfWUEclDefinitionActionResultWrapper _actionResults, String _dfuPublisherWuid, String _dfuPublisherState )
    {
        this.local_exceptions = _exceptions;
        this.local_actionResults = _actionResults;
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
        this.local_dfuPublisherState = _dfuPublisherState;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getActionResults() != null)
            this.local_actionResults = new ArrayOfWUEclDefinitionActionResultWrapper( raw.getActionResults());
        this.local_dfuPublisherWuid = raw.getDfuPublisherWuid();
        this.local_dfuPublisherState = raw.getDfuPublisherState();

    }

    @Override
    public String toString()
    {
        return "WUEclDefinitionActionResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "actionResults = " + local_actionResults + ", " + "dfuPublisherWuid = " + local_dfuPublisherWuid + ", " + "dfuPublisherState = " + local_dfuPublisherState + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUEclDefinitionActionResponse();
        raw.setDfuPublisherWuid( local_dfuPublisherWuid);
        raw.setDfuPublisherState( local_dfuPublisherState);
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
    public void setActionResults( ArrayOfWUEclDefinitionActionResultWrapper _actionResults )
    {
        this.local_actionResults = _actionResults;
    }
    public ArrayOfWUEclDefinitionActionResultWrapper getActionResults( )
    {
        return this.local_actionResults;
    }
    public void setDfuPublisherWuid( String _dfuPublisherWuid )
    {
        this.local_dfuPublisherWuid = _dfuPublisherWuid;
    }
    public String getDfuPublisherWuid( )
    {
        return this.local_dfuPublisherWuid;
    }
    public void setDfuPublisherState( String _dfuPublisherState )
    {
        this.local_dfuPublisherState = _dfuPublisherState;
    }
    public String getDfuPublisherState( )
    {
        return this.local_dfuPublisherState;
    }
}