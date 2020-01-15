package org.hpccsystems.ws.client.wrappers;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue;

public class DebugValueWrapper
{

    private String name;
    private String value;

    /**
     * Instantiates a new debug value wrapper.
     */
    public DebugValueWrapper() {}

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param name
     *            the name
     * @param value
     *            the value
     */
    public DebugValueWrapper(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param raw
     *            the raw
     */
    public DebugValueWrapper(DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param raw
     *            the raw
     */
    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue raw)
    {
        name=raw.getName();
        value=raw.getValue();
    }

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param raw
     *            the raw
     */
    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param raw
     *            the raw
     */
    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
    }

    /**
     * Instantiates a new debug value wrapper.
     *
     * @param raw
     *            the raw
     */
    public DebugValueWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.DebugValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
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
     * Gets the raw version 1 75.
     *
     * @return the raw version 1 75
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue val = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.DebugValue();
        val.setName(this.getName());
        val.setValue(this.getValue());
        return val;
    }

    /**
     * Gets the raw version 1 69.
     *
     * @return the raw version 1 69
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    /**
     * Gets the raw version 1 62.
     *
     * @return the raw version 1 62
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }

    /**
     * Gets the raw version 1 58.
     *
     * @return the raw version 1 58
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue result = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.DebugValue();
        result.setName(name);
        result.setValue(value);
        return result;
    }
}
