package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLGraph;

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

    public ECLGraphWrapper() {}

    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLGraph raw) {
        if (raw==null) {
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

    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLGraph raw) {
        if (raw==null) {
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

    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLGraph raw) {
        if (raw==null) {
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

    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLGraph raw) {
        if (raw==null) {
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


    public ECLGraphWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLGraph raw) {
        if (raw==null) {
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
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLGraph getRaw() {
        return getRawVersion74();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLGraph getRawVersion74() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLGraph result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLGraph();
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

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLGraph getRawVersion73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLGraph result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLGraph();
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

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLGraph getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLGraph result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLGraph();
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
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLGraph getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLGraph result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLGraph();
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

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLGraph getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLGraph result=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLGraph();
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
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * @return the label
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * @return the type
     */
    public String getType()
    {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * @return the running
     */
    public Boolean getRunning()
    {
        return running;
    }

    /**
     * @param running the running to set
     */
    public void setRunning(Boolean running)
    {
        this.running = running;
    }

    /**
     * @return the complete
     */
    public Boolean getComplete()
    {
        return complete;
    }

    /**
     * @param complete the complete to set
     */
    public void setComplete(Boolean complete)
    {
        this.complete = complete;
    }

    /**
     * @return the failed
     */
    public Boolean getFailed()
    {
        return failed;
    }

    /**
     * @param failed the failed to set
     */
    public void setFailed(Boolean failed)
    {
        this.failed = failed;
    }

    /**
     * @return the runningId
     */
    public Long getRunningId()
    {
        return runningId;
    }

    /**
     * @param runningId the runningId to set
     */
    public void setRunningId(Long runningId)
    {
        this.runningId = runningId;
    }

    /**
     * @return the whenStarted
     */
    public String getWhenStarted()
    {
        return whenStarted;
    }

    /**
     * @param whenStarted the whenStarted to set
     */
    public void setWhenStarted(String whenStarted)
    {
        this.whenStarted = whenStarted;
    }

    /**
     * @return the whenFinished
     */
    public String getWhenFinished()
    {
        return whenFinished;
    }

    /**
     * @param whenFinished the whenFinished to set
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
