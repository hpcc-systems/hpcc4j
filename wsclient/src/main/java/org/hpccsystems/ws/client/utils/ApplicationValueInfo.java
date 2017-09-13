package org.hpccsystems.ws.client.utils;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue;

public class ApplicationValueInfo {

    private String application;
    private String name;
    private String value;

    public ApplicationValueInfo()
    {
    }
    
    public ApplicationValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue raw) 
    {
        application=raw.getApplication();
        name=raw.getName();
        value=raw.getValue();
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public ApplicationValue getRaw() {
        ApplicationValue val=new ApplicationValue();
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }
}
