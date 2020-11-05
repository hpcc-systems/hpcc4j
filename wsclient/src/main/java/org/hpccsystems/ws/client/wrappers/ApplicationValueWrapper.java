package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue;

public class ApplicationValueWrapper
{

    private String application;
    private String name;
    private String value;

    /**
     * Instantiates a new application value wrapper.
     */
    public ApplicationValueWrapper()
    {
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param app
     *            the app
     * @param name
     *            the name
     * @param value
     *            the value
     */
    public ApplicationValueWrapper(String app, String name, String value)
    {
        this.application = app;
        this.name = name;
        this.value = value;
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param raw
     *            the raw
     */
    public ApplicationValueWrapper(ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param raw
     *            the raw
     */
    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param raw
     *            the raw
     */
    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param raw
     *            the raw
     */
    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new application value wrapper.
     *
     * @param raw
     *            the raw
     */
    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Gets the application.
     *
     * @return the application
     */
    public String getApplication()
    {
        return application;
    }

    /**
     * Sets the application.
     *
     * @param application
     *            the new application
     */
    public void setApplication(String application)
    {
        this.application = application;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name
     *            the new name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue()
    {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    /**
     * Gets the raw version 1 79.
     *
     * @return the raw version 1 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue val = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ApplicationValue();
        val.setApplication(this.getApplication());
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }

    /**
     * Gets the raw version 1 69.
     *
     * @return the raw version 1 69
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }

    /**
     * Gets the raw version 1 62.
     *
     * @return the raw version 1 62
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }

    /**
     * Gets the raw version 1 58.
     *
     * @return the raw version 1 58
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }
}
