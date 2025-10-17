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

public class EspExceptionWrapper extends BaseExceptionWrapper
{
    protected String audience;
    protected String code;

    /**
     * Instantiates a new esp exception wrapper.
     */
    public EspExceptionWrapper()
    {
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param espexception
     *            the espexception
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException espexception)
    {
        copy(espexception);
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param _code
     *            the code
     * @param _audience
     *            the audience
     * @param _source
     *            the source
     * @param _message
     *            the message
     */
    public EspExceptionWrapper(String _code, String _audience, String _source, String _message)
    {
        this.code = _code;
        this.audience = _audience;
        this.source = _source;
        this.message = _message;

    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param espExceptionWrapper
     *            the esp exception wrapper
     */
    public EspExceptionWrapper(EspExceptionWrapper espExceptionWrapper)
    {
        this.code = espExceptionWrapper.getCode();
        this.audience = espExceptionWrapper.getAudience();
        this.source = espExceptionWrapper.getSource();
        this.message = espExceptionWrapper.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsfileio.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }



    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wspackageprocess.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssql.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsstore.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wstopology.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Instantiates a new esp exception wrapper.
     *
     * @param raw
     *            the raw
     */
    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsresources.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wscodesign.latest.EspException raw)
    {
         this.code = raw.getCode();
         this.audience = raw.getAudience();
         this.source = raw.getSource();
         this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wsdfuxref.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    public EspExceptionWrapper(org.hpccsystems.ws.client.gen.axis2.wssmc.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /**
     * Copy.
     *
     * @param raw
     *            the raw
     */
    private void copy(org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException raw)
    {
        this.code = raw.getCode();
        this.audience = raw.getAudience();
        this.source = raw.getSource();
        this.message = raw.getMessage();
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "EspException: Audience: " + getAudience() + " Source: " + getSource() + " Message: " + getMessage();
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException raw = new org.hpccsystems.ws.client.gen.axis2.filespray.latest.EspException();
        raw.setCode(code);
        raw.setAudience(audience);
        raw.setSource(source);
        raw.setMessage(message);
        return raw;
    }

    /**
     * Sets the audience.
     *
     * @param _audience
     *            the new audience
     */
    public void setAudience(String _audience)
    {
        this.audience = _audience;
    }

    /**
     * Gets the audience.
     *
     * @return the audience
     */
    public String getAudience()
    {
        return this.audience;
    }

    /**
     * Sets the code.
     *
     * @param _code
     *            the new code
     */
    public void setCode(String _code)
    {
        this.code = _code;
    }

    /**
     * Gets the code.
     *
     * @return the code
     */
    public String getCode()
    {
        return this.code;
    }

}
