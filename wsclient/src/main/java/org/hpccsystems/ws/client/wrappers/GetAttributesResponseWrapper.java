package org.hpccsystems.ws.client.wrappers;

/*******************************************************************************
 * HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems.
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
 * Class name: GetAttributesResponseWrapper
 * Wraps class: org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse
 * Output package : org.hpccsystems.ws.client.wrappers.gen.wsattributes
 * TimeStamp: 2019-09-06T14:44:27.943Z
 */
public class GetAttributesResponseWrapper
{
    protected ArrayOfEspExceptionWrapper local_exceptions = null;
    protected ArrayOfECLAttributeWrapper local_outAttributes = null;

    /**
     * Instantiates a new gets the attributes response wrapper.
     */
    public GetAttributesResponseWrapper()
    {
    }

    /**
     * Instantiates a new gets the attributes response wrapper.
     *
     * @param getattributesresponse
     *            the getattributesresponse
     */
    public GetAttributesResponseWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse getattributesresponse)
    {
        copy(getattributesresponse);
    }

    /**
     * Instantiates a new gets the attributes response wrapper.
     *
     * @param _exceptions
     *            the exceptions
     * @param _outAttributes
     *            the out attributes
     */
    public GetAttributesResponseWrapper(ArrayOfEspExceptionWrapper _exceptions, ArrayOfECLAttributeWrapper _outAttributes)
    {
        this.local_exceptions = _exceptions;
        this.local_outAttributes = _outAttributes;

    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse raw)
    {
        if (raw == null)
            return;

        if (raw.getExceptions() != null)
            this.local_exceptions = new ArrayOfEspExceptionWrapper(raw.getExceptions());
        if (raw.getOutAttributes() != null)
            this.local_outAttributes = new ArrayOfECLAttributeWrapper(raw.getOutAttributes());
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "GetAttributesResponseWrapper [" + "exceptions = " + local_exceptions + ", " + "outAttributes = " + local_outAttributes + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.GetAttributesResponse();
        return raw;
    }

    /**
     * Sets the exceptions.
     *
     * @param _exceptions
     *            the new exceptions
     */
    public void setExceptions(ArrayOfEspExceptionWrapper _exceptions)
    {
        this.local_exceptions = _exceptions;
    }

    /**
     * Gets the exceptions.
     *
     * @return the exceptions
     */
    public ArrayOfEspExceptionWrapper getExceptions()
    {
        return this.local_exceptions;
    }

    /**
     * Sets the out attributes.
     *
     * @param _outAttributes
     *            the new out attributes
     */
    public void setOutAttributes(ArrayOfECLAttributeWrapper _outAttributes)
    {
        this.local_outAttributes = _outAttributes;
    }

    /**
     * Gets the out attributes.
     *
     * @return the out attributes
     */
    public ArrayOfECLAttributeWrapper getOutAttributes()
    {
        return this.local_outAttributes;
    }
}
