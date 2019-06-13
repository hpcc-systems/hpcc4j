package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.NamedValue;

public class NamedValueWrapper
{

    private String name;
    private String value;

    public NamedValueWrapper() {}
    
    public NamedValueWrapper(String name,String value) 
    {
        this.name=name;
        this.value=value;
    }
    public NamedValueWrapper(NamedValue raw) 
    {
        name=raw.getName();
        value=raw.getValue();
    }

	public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public NamedValue getRaw()
    {
    	NamedValue nv = new NamedValue();
    	nv.setName(name);
    	nv.setValue(value);
        return nv;
    }

	public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.NamedValue get1_75()
    {
	    org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.NamedValue nv = new NamedValue();
	    nv.setName(name);
	    nv.setValue(value);
        return nv;
    }
}
