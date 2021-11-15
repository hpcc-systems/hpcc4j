package org.hpccsystems.ws.client.wrappers.wsworkunits;

@Deprecated
public class ECLGraphWrapper
{
    private String name;
    private String label;
    private String type;
    private Boolean running;
    private Boolean complete;
    private Boolean failed;
    private Long runningId;
    private String whenStarted;
    private String whenFinished;

    /**
     * Instantiates a new ECL graph wrapper.
     */
    public ECLGraphWrapper() {}

    /**
     * Instantiates a new ECL graph wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph raw)
    {
        if (raw==null)
        {
            return;
        }
        this.setComplete(raw.getComplete());
        this.setFailed(raw.getFailed());
        this.setLabel(raw.getLabel());
        this.setName(raw.getName());
        this.setRunning(raw.getRunning());
        this.setRunningId(raw.getRunningId());
        this.setType(raw.getType());
        this.setWhenFinished(raw.getWhenFinished());
        this.setWhenStarted(raw.getWhenStarted());
    }

    /**
     * Instantiates a new ECL graph wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLGraph raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setComplete(raw.getComplete());
        this.setFailed(raw.getFailed());
        this.setLabel(raw.getLabel());
        this.setName(raw.getName());
        this.setRunning(raw.getRunning());
        this.setRunningId(raw.getRunningId());
        this.setType(raw.getType());
        this.setWhenFinished(raw.getWhenFinished());
        this.setWhenStarted(raw.getWhenStarted());
    }

    /**
     * Instantiates a new ECL graph wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLGraph raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setComplete(raw.getComplete());
        this.setFailed(raw.getFailed());
        this.setLabel(raw.getLabel());
        this.setName(raw.getName());
        this.setRunning(raw.getRunning());
        this.setRunningId(raw.getRunningId());
        this.setType(raw.getType());
        this.setWhenFinished(raw.getWhenFinished());
        this.setWhenStarted(raw.getWhenStarted());
    }

    /**
     * Instantiates a new ECL graph wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLGraph raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setComplete(raw.getComplete());
        this.setFailed(raw.getFailed());
        this.setLabel(raw.getLabel());
        this.setName(raw.getName());
        this.setRunning(raw.getRunning());
        this.setRunningId(raw.getRunningId());
        this.setType(raw.getType());
        this.setWhenFinished(raw.getWhenFinished());
        this.setWhenStarted(raw.getWhenStarted());
    }

    /**
     * Instantiates a new ECL graph wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLGraph raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setComplete(raw.getComplete());
        this.setFailed(raw.getFailed());
        this.setLabel(raw.getLabel());
        this.setName(raw.getName());
        this.setRunning(raw.getRunning());
        this.setRunningId(raw.getRunningId());
        this.setType(raw.getType());
        this.setWhenFinished(raw.getWhenFinished());
        this.setWhenStarted(raw.getWhenStarted());
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the latest version of ECLGraph.
     *
     * @return the latest version of ECLGraph
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph result =
                        new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLGraph();

        result.setComplete(this.getComplete());
        result.setFailed(this.getFailed());
        result.setLabel(this.getLabel());
        result.setName(this.getName());
        result.setRunning(this.getRunning());
        result.setRunningId(this.getRunningId());
        result.setType(this.getType());
        result.setWhenFinished(this.getWhenFinished());
        result.setWhenStarted(this.getWhenStarted());
        return result;
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
     *            the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the label.
     *
     * @return the label
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Sets the label.
     *
     * @param label
     *            the label to set
     */
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the type.
     *
     * @param type
     *            the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Gets the running.
     *
     * @return the running
     */
    public Boolean getRunning()
    {
        return running;
    }

    /**
     * Sets the running.
     *
     * @param running
     *            the running to set
     */
    public void setRunning(Boolean running)
    {
        this.running = running;
    }

    /**
     * Gets the complete.
     *
     * @return the complete
     */
    public Boolean getComplete()
    {
        return complete;
    }

    /**
     * Sets the complete.
     *
     * @param complete
     *            the complete to set
     */
    public void setComplete(Boolean complete)
    {
        this.complete = complete;
    }

    /**
     * Gets the failed.
     *
     * @return the failed
     */
    public Boolean getFailed()
    {
        return failed;
    }

    /**
     * Sets the failed.
     *
     * @param failed
     *            the failed to set
     */
    public void setFailed(Boolean failed)
    {
        this.failed = failed;
    }

    /**
     * Gets the running id.
     *
     * @return the runningId
     */
    public Long getRunningId()
    {
        return runningId;
    }

    /**
     * Sets the running id.
     *
     * @param runningId
     *            the runningId to set
     */
    public void setRunningId(Long runningId)
    {
        this.runningId = runningId;
    }

    /**
     * Gets the when started.
     *
     * @return the whenStarted
     */
    public String getWhenStarted()
    {
        return whenStarted;
    }

    /**
     * Sets the when started.
     *
     * @param whenStarted
     *            the whenStarted to set
     */
    public void setWhenStarted(String whenStarted)
    {
        this.whenStarted = whenStarted;
    }

    /**
     * Gets the when finished.
     *
     * @return the whenFinished
     */
    public String getWhenFinished()
    {
        return whenFinished;
    }

    /**
     * Sets the when finished.
     *
     * @param whenFinished
     *            the whenFinished to set
     */
    public void setWhenFinished(String whenFinished)
    {
        this.whenFinished = whenFinished;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLGraphWrapper [name=" + name + ", label=" + label + ", type=" + type + ", running=" + running
                + ", complete=" + complete + ", failed=" + failed + ", runningId=" + runningId + ", whenStarted="
                + whenStarted + ", whenFinished=" + whenFinished + "]";
    }
}
