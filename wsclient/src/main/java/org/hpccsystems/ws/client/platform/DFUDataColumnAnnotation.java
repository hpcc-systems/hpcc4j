package org.hpccsystems.ws.client.platform;

import java.util.Arrays;
import java.util.List;

public class DFUDataColumnAnnotation
{
    private final String name;
    private final List<String> parameters;

    public DFUDataColumnAnnotation(final String name, final List<String> parameters)
    {
        this.name = name;
        this.parameters = parameters;
    }

    public String getName()
    {
        return name;
    }

    public List<String> getParameters()
    {
        return parameters;
    }

    public String toString()
    {
    	StringBuffer sb=new StringBuffer();
    	sb.append("name:").append(String.valueOf(name));
    	sb.append(" parameters:").append(Arrays.toString(parameters.toArray()));
    	return sb.toString();
    }
}
