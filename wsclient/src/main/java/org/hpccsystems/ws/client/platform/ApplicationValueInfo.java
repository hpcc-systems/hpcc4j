package org.hpccsystems.ws.client.platform;

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

    public ApplicationValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue raw) {
        application=raw.getApplication();
        name=raw.getName();
        value=raw.getValue();
    }

    public ApplicationValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue raw) 
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
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue getRawVersion1_73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue val=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ApplicationValue();
        val.setApplication(this.getApplication());
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue();
        result.setApplication(application);
        result.setName(name);
        result.setValue(value);
        return result;
    }
 
}
