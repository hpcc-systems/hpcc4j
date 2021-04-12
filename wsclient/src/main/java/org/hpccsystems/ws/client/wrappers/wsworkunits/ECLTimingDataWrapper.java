package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLTimingData;

public class ECLTimingDataWrapper
{
    private String name;
    private Integer graphNum;
    private Integer subGraphNum;
    private Integer GID;
    private Integer min;
    private Integer MS;

    /**
     * Instantiates a new ECL timing data wrapper.
     */
    public ECLTimingDataWrapper() {}

    /**
     * Instantiates a new ECL timing data wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLTimingDataWrapper(ECLTimingData raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    /**
     * Instantiates a new ECL timing data wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLTimingData raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    /**
     * Instantiates a new ECL timing data wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLTimingData raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    /**
     * Instantiates a new ECL timing data wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLTimingData raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    /**
     * Instantiates a new ECL timing data wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLTimingDataWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLTimingData raw)
    {
        if (raw==null)
        {
            return;
        }

        this.setGID(raw.getGID());
        this.setGraphNum(raw.getGraphNum());
        this.setMin(raw.getMin());
        this.setMS(raw.getMS());
        this.setName(raw.getName());
        this.setSubGraphNum(raw.getSubGraphNum());
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLTimingData getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the raw version 1 79.
     *
     * @return the raw version 1 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLTimingData getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLTimingData raw = 
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_81.ECLTimingData();

        raw.setGID(this.getGID());
        raw.setGraphNum(this.getGraphNum());
        raw.setMin(this.getMin());
        raw.setMS(this.getMS());
        raw.setName(this.getName());
        raw.setSubGraphNum(this.getSubGraphNum());
        return raw;
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
     * Gets the graph num.
     *
     * @return the graphNum
     */
    public Integer getGraphNum()
    {
        return graphNum;
    }
    
    /**
     * Sets the graph num.
     *
     * @param graphNum
     *            the graphNum to set
     */
    public void setGraphNum(Integer graphNum)
    {
        this.graphNum = graphNum;
    }
    
    /**
     * Gets the sub graph num.
     *
     * @return the subGraphNum
     */
    public Integer getSubGraphNum()
    {
        return subGraphNum;
    }
    
    /**
     * Sets the sub graph num.
     *
     * @param subGraphNum
     *            the subGraphNum to set
     */
    public void setSubGraphNum(Integer subGraphNum)
    {
        this.subGraphNum = subGraphNum;
    }
    
    /**
     * Gets the gid.
     *
     * @return the gID
     */
    public Integer getGID()
    {
        return GID;
    }
    
    /**
     * Sets the gid.
     *
     * @param gID
     *            the gID to set
     */
    public void setGID(Integer gID)
    {
        GID = gID;
    }
    
    /**
     * Gets the min.
     *
     * @return the min
     */
    public Integer getMin()
    {
        return min;
    }
    
    /**
     * Sets the min.
     *
     * @param min
     *            the min to set
     */
    public void setMin(Integer min)
    {
        this.min = min;
    }
    
    /**
     * Gets the ms.
     *
     * @return the mS
     */
    public Integer getMS()
    {
        return MS;
    }
    
    /**
     * Sets the ms.
     *
     * @param mS
     *            the mS to set
     */
    public void setMS(Integer mS)
    {
        MS = mS;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLTimingDataWrapper [name=" + name + ", graphNum=" + graphNum + ", subGraphNum=" + subGraphNum
                + ", GID=" + GID + ", min=" + min + ", MS=" + MS + "]";
    }

}
