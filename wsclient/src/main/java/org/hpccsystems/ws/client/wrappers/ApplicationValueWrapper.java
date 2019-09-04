package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue;

public class ApplicationValueWrapper
{

    private String application;
    private String name;
    private String value;

    public ApplicationValueWrapper()
    {
    }

    public ApplicationValueWrapper(String app, String name, String value)
    {
        this.application = app;
        this.name = name;
        this.value = value;
    }

    public ApplicationValueWrapper(ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    public ApplicationValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ApplicationValue raw)
    {
        application = raw.getApplication();
        name = raw.getName();
        value = raw.getValue();
    }

    public String getApplication()
    {
        return application;
    }

    public void setApplication(String application)
    {
        this.application = application;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue val = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue();
        val.setApplication(this.getApplication());
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }
}
