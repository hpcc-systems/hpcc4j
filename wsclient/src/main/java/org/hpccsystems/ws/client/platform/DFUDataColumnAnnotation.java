package org.hpccsystems.ws.client.platform;

import java.util.Arrays;
import java.util.List;

public class DFUDataColumnAnnotation
{
    private final String name;
    private final List<String> parameters;

    /**
     * Instantiates a new DFU data column annotation.
     *
     * @param name
     *            the name
     * @param parameters
     *            the parameters
     */
    public DFUDataColumnAnnotation(final String name, final List<String> parameters)
    {
        this.name = name;
        this.parameters = parameters;
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
     * Gets the parameters.
     *
     * @return the parameters
     */
    public List<String> getParameters()
    {
        return parameters;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
    	StringBuffer sb=new StringBuffer();
    	sb.append("name:").append(String.valueOf(name));
    	sb.append(" parameters:").append(Arrays.toString(parameters.toArray()));
    	return sb.toString();
    }
}
