package org.hpccsystems.ws.client.platform;

public class NamedValueInfo {

    private String name;
    private String value;

    public NamedValueInfo() {}
    
    public NamedValueInfo(String name,String value) 
    {
        this.name=name;
        this.value=value;
    }
    public NamedValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.NamedValue raw) 
    {
        name=raw.getName();
        value=raw.getValue();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.NamedValue getRaw()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.NamedValue nv=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.NamedValue(name,value);
        return nv;
    }
}
