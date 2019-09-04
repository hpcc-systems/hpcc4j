package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue;

public class DebugValueWrapper
{

    private String name;
    private String value;

    public DebugValueWrapper() {}

    public DebugValueWrapper(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    public DebugValueWrapper(DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue raw)
    {
        name=raw.getName();
        value=raw.getValue();
    }

    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
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

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue val = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue();
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
}
