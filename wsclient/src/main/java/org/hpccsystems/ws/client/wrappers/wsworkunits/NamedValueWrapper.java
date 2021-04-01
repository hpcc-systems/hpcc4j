package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.NamedValue;

public class NamedValueWrapper
{

    private String name;
    private String value;

    /**
     * Instantiates a new named value wrapper.
     */
    public NamedValueWrapper()
    {
    }

    /**
     * Instantiates a new named value wrapper.
     *
     * @param name
     *            the name
     * @param value
     *            the value
     */
    public NamedValueWrapper(String name, String value)
    {
        this.name = name;
        this.value = value;
    }

    /**
     * Instantiates a new named value wrapper.
     *
     * @param raw
     *            the raw
     */
    public NamedValueWrapper(NamedValue raw)
    {
        name = raw.getName();
        value = raw.getValue();
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
     * Gets the raw.
     *
     * @return the raw
     */
    public NamedValue getRaw()
    {
        NamedValue nv = new NamedValue();
        nv.setName(name);
        nv.setValue(value);
        return nv;
    }

    /**
     * Gets the 1 79.
     *
     * @return the 1 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.NamedValue get1_81()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.NamedValue nv = new NamedValue();
        nv.setName(name);
        nv.setValue(value);
        return nv;
    }
}
