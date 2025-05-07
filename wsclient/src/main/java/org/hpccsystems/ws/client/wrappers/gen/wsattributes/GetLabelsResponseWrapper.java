package org.hpccsystems.ws.client.wrappers.gen.wsattributes;

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
 * Class name: GetLabelsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetLabelsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLLabelWrapper local_outLabels;

    public GetLabelsResponseWrapper() {}

    public GetLabelsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse getlabelsresponse)
    {
        copy( getlabelsresponse );
    }
    public GetLabelsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLLabelWrapper _outLabels )
    {
        this.local_exceptions = _exceptions;
        this.local_outLabels = _outLabels;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getOutLabels() != null)
            this.local_outLabels = new ArrayOfECLLabelWrapper( raw.getOutLabels());

    }

    @Override
    public String toString()
    {
        return "GetLabelsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "outLabels = " + local_outLabels + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetLabelsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_outLabels != null)
            raw.setOutLabels( local_outLabels.getRaw());
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
    public void setOutLabels( ArrayOfECLLabelWrapper _outLabels )
    {
        this.local_outLabels = _outLabels;
    }
    public ArrayOfECLLabelWrapper getOutLabels( )
    {
        return this.local_outLabels;
    }
}