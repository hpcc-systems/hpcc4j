package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ApplicationValue;

public class ApplicationValueInfo {

    private String application;
    private String name;
    private String value;

    public ApplicationValueInfo()
    {
    }
    
    public ApplicationValueInfo(String app, String name,String value) {
        this.application=app;
        this.name=name;
        this.value=value;
    }
    
    public ApplicationValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_71allverinclusive.ApplicationValue raw) 
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
        val.setApplication(this.getApplication());
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }
}
