package org.hpccsystems.ws.client.wrappers;

public class ClusterQueryWrapper
{

    String  name;
    String  errors;
    boolean mixedNodeStates;
    String  state;

    /**
     * Instantiates a new cluster query wrapper.
     */
    public ClusterQueryWrapper() {}

    /**
     * Instantiates a new cluster query wrapper.
     *
     * @param raw
     *            the raw
     */
    public ClusterQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ClusterQueryState raw)
    {
        this.name = raw.getCluster();
        this.state = raw.getState();
        this.errors = raw.getErrors();
        this.mixedNodeStates = raw.getMixedNodeStates();
    }

    /**
     * Gets the cluster.
     *
     * @return the cluster
     */
    public String getCluster()
    {
        return name;
    }

    /**
     * Sets the cluster.
     *
     * @param name
     *            the new cluster
     */
    public void setCluster(String name)
    {
        this.name = name;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public String getErrors()
    {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors
     *            the new errors
     */
    public void setErrors(String errors)
    {
        this.errors = errors;
    }

    /**
     * Checks if is mixed node states.
     *
     * @return true, if is mixed node states
     */
    public boolean isMixedNodeStates()
    {
        return mixedNodeStates;
    }

    /**
     * Sets the mixed node states.
     *
     * @param mixedNodeStates
     *            the new mixed node states
     */
    public void setMixedNodeStates(boolean mixedNodeStates)
    {
        this.mixedNodeStates = mixedNodeStates;
    }

    /**
     * Gets the state.
     *
     * @return the state
     */
    public String getState()
    {
        return state;
    }

    /**
     * Sets the state.
     *
     * @param state
     *            the new state
     */
    public void setState(String state)
    {
        this.state = state;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClusterInfo [name=" + name + ", errors=" + errors + ", mixedNodeStates=" + mixedNodeStates + ", state=" + state + "]";
    }

}
