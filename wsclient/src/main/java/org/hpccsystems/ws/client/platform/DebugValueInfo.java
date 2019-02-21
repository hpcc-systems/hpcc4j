package org.hpccsystems.ws.client.platform;

public class DebugValueInfo {

    private String name;
    private String value;

    public DebugValueInfo()
    {
    }
    
    public DebugValueInfo(String name,String value) {
        this.name=name;
        this.value=value;
    }

    public DebugValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue raw) {        
        name=raw.getName();
        value=raw.getValue();
    }
    
    public DebugValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue raw) {        
        name=raw.getName();
        value=raw.getValue();
    }
    
    public DebugValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue raw) {        
        name=raw.getName();
        value=raw.getValue();
    }

    public DebugValueInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue raw) 
    {
        name=raw.getName();
        value=raw.getValue();
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
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue getRawVersion1_73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue val=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue();
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
 
}
