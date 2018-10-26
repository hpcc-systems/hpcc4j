package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.DebugValue;

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

    public DebugValueInfo(DebugValue raw) 
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
    
    public DebugValue getRaw() {
        DebugValue val=new DebugValue();
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue getRawVersion6() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
 
}
