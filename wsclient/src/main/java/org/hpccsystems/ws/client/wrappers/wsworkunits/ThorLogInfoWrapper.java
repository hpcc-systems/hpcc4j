package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ThorLogInfo;

public class ThorLogInfoWrapper
{
    private String processName;
    private String clusterGroup;
    private String logDate;
    private Integer numberSlaves;

    /**
     * Instantiates a new thor log info wrapper.
     */
    public ThorLogInfoWrapper() {}

    /**
     * Instantiates a new thor log info wrapper.
     *
     * @param raw
     *            the raw
     */
    public ThorLogInfoWrapper(ThorLogInfo raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    /**
     * Instantiates a new thor log info wrapper.
     *
     * @param raw
     *            the raw
     */
    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ThorLogInfo raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    /**
     * Instantiates a new thor log info wrapper.
     *
     * @param raw
     *            the raw
     */
    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ThorLogInfo raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    /**
     * Instantiates a new thor log info wrapper.
     *
     * @param raw
     *            the raw
     */
    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ThorLogInfo raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    /**
     * Instantiates a new thor log info wrapper.
     *
     * @param raw
     *            the raw
     */
    public ThorLogInfoWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ThorLogInfo raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setClusterGroup(raw.getClusterGroup());
        this.setLogDate(raw.getLogDate());
        this.setNumberSlaves(raw.getNumberSlaves());
        this.setProcessName(raw.getProcessName());
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ThorLogInfo getRaw()
    {
        return getRawLatest();
    }

    /**
     * Gets the raw version 1_81.
     *
     * @return the raw version 1_81
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ThorLogInfo getRawLatest()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ThorLogInfo raw =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ThorLogInfo();

        raw.setClusterGroup(this.getClusterGroup());
        raw.setLogDate(this.getLogDate());
        raw.setNumberSlaves(this.getNumberSlaves());
        raw.setProcessName(this.getProcessName());
        return raw;
    }

    /**
     * Gets the process name.
     *
     * @return the processName
     */
    public String getProcessName()
    {
        return processName;
    }

    /**
     * Sets the process name.
     *
     * @param processName
     *            the processName to set
     */
    public void setProcessName(String processName)
    {
        this.processName = processName;
    }

    /**
     * Gets the cluster group.
     *
     * @return the clusterGroup
     */
    public String getClusterGroup()
    {
        return clusterGroup;
    }

    /**
     * Sets the cluster group.
     *
     * @param clusterGroup
     *            the clusterGroup to set
     */
    public void setClusterGroup(String clusterGroup)
    {
        this.clusterGroup = clusterGroup;
    }

    /**
     * Gets the log date.
     *
     * @return the logDate
     */
    public String getLogDate()
    {
        return logDate;
    }

    /**
     * Sets the log date.
     *
     * @param logDate
     *            the logDate to set
     */
    public void setLogDate(String logDate)
    {
        this.logDate = logDate;
    }

    /**
     * Gets the number slaves.
     *
     * @return the numberSlaves
     */
    public Integer getNumberSlaves()
    {
        return numberSlaves;
    }

    /**
     * Sets the number slaves.
     *
     * @param numberSlaves
     *            the numberSlaves to set
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
