package org.hpccsystems.ws.client.wrappers.wsworkunits;

public class ThorLogInfoWrapper
{
    private String processName;

    private String clusterGroup;

    private String logDate;

    private Integer numberSlaves;

    public ThorLogInfoWrapper() {}
    
    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ThorLogInfo raw) {
        if (raw==null) {
            return;
        }
        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ThorLogInfo raw) {
        if (raw==null) {
            return;
        }
        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ThorLogInfo getRaw() {
        return this.getRawVersion73();
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ThorLogInfo getRawVersion73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ThorLogInfo raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ThorLogInfo();
        raw.setClusterGroup(this.getClusterGroup());
        raw.setLogDate(this.getLogDate());
        raw.setNumberSlaves(this.getNumberSlaves());
        raw.setProcessName(this.getProcessName());
        return raw;
    }
    
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ThorLogInfo getRawVersion6() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ThorLogInfo raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ThorLogInfo();
        raw.setClusterGroup(this.getClusterGroup());
        raw.setLogDate(this.getLogDate());
        raw.setNumberSlaves(this.getNumberSlaves());
        raw.setProcessName(this.getProcessName());        
        return raw;
    }

    /**
     * @return the processName
     */
    public String getProcessName()
    {
        return processName;
    }

    /**
     * @param processName the processName to set
     */
    public void setProcessName(String processName)
    {
        this.processName = processName;
    }

    /**
     * @return the clusterGroup
     */
    public String getClusterGroup()
    {
        return clusterGroup;
    }

    /**
     * @param clusterGroup the clusterGroup to set
     */
    public void setClusterGroup(String clusterGroup)
    {
        this.clusterGroup = clusterGroup;
    }

    /**
     * @return the logDate
     */
    public String getLogDate()
    {
        return logDate;
    }

    /**
     * @param logDate the logDate to set
     */
    public void setLogDate(String logDate)
    {
        this.logDate = logDate;
    }

    /**
     * @return the numberSlaves
     */
    public Integer getNumberSlaves()
    {
        return numberSlaves;
    }

    /**
     * @param numberSlaves the numberSlaves to set
     */
    public void setNumberSlaves(Integer numberSlaves)
    {
        this.numberSlaves = numberSlaves;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ThorLogInfoWrapper [processName=" + processName + ", clusterGroup=" + clusterGroup + ", logDate="
                + logDate + ", numberSlaves=" + numberSlaves + "]";
    }
  
}
