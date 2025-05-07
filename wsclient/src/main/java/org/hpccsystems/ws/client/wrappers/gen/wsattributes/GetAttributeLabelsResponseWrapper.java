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
 * Class name: GetAttributeLabelsResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 */
public class GetAttributeLabelsResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions;
    protected ArrayOfECLAttributeLabelWrapper local_labels;

    public GetAttributeLabelsResponseWrapper() {}

    public GetAttributeLabelsResponseWrapper( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse getattributelabelsresponse)
    {
        copy( getattributelabelsresponse );
    }
    public GetAttributeLabelsResponseWrapper( ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLAttributeLabelWrapper _labels )
    {
        this.local_exceptions = _exceptions;
        this.local_labels = _labels;

    }

    private void copy( org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse raw )
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper( raw.getExceptions());
        if (raw.getLabels() != null)
            this.local_labels = new ArrayOfECLAttributeLabelWrapper( raw.getLabels());

    }

    @Override
    public String toString()
    {
        return "GetAttributeLabelsResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "labels = " + local_labels + "]";
    }
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.GetAttributeLabelsResponse();
        if (local_exceptions != null)
            raw.setExceptions( local_exceptions.getRaw());
        if (local_labels != null)
            raw.setLabels( local_labels.getRaw());
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
    public void setLabels( ArrayOfECLAttributeLabelWrapper _labels )
    {
        this.local_labels = _labels;
    }
    public ArrayOfECLAttributeLabelWrapper getLabels( )
    {
        return this.local_labels;
    }
}