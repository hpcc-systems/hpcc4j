package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile;

@Deprecated
public class ECLHelpFileWrapper
{
    private String name;
    private String type;
    private String IPAddress;
    private String description;
    private Long   fileSize;
    private long   PID;
    private long   minActivityId;
    private long   maxActivityId;

    /**
     * Instantiates a new ECL help file wrapper.
     */
    public ECLHelpFileWrapper() {}

    /**
     * Instantiates a new ECL help file wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLHelpFileWrapper(ECLHelpFile raw)
    {
        if (raw == null)
        {
            return;
        }
        this.description = raw.getDescription();
        this.IPAddress = raw.getIPAddress();
        this.fileSize = raw.getFileSize();
        this.maxActivityId = raw.getMaxActivityId().longValue();
        this.minActivityId = raw.getMinActivityId().longValue();
        this.name = raw.getName();
        this.PID = raw.getPID().longValue();
        this.type = raw.getType();
    }

    /**
     * Instantiates a new ECL help file wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLHelpFile raw)
    {
        if (raw==null)
        {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        this.maxActivityId=raw.getMaxActivityId().longValue();
        this.minActivityId=raw.getMinActivityId().longValue();
        this.name=raw.getName();
        this.PID=raw.getPID().longValue();
        this.type=raw.getType();
    }

    /**
     * Instantiates a new ECL help file wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLHelpFile raw)
    {
        if (raw == null)
        {
            return;
        }
        this.description = raw.getDescription();
        this.IPAddress = raw.getIPAddress();
        this.fileSize = raw.getFileSize();
        this.maxActivityId = raw.getMaxActivityId().longValue();
        this.minActivityId = raw.getMinActivityId().longValue();
        this.name = raw.getName();
        this.PID = raw.getPID().longValue();
        this.type = raw.getType();
    }

    /**
     * Instantiates a new ECL help file wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLHelpFile raw)
    {
        if (raw == null)
        {
            return;
        }
        this.description = raw.getDescription();
        this.IPAddress = raw.getIPAddress();
        this.fileSize = raw.getFileSize();
        this.maxActivityId = raw.getMaxActivityId().longValue();
        this.minActivityId = raw.getMinActivityId().longValue();
        this.name = raw.getName();
        this.PID = raw.getPID().longValue();
        this.type = raw.getType();
    }

    /**
     * Instantiates a new ECL help file wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLHelpFile raw)
    {
        if (raw == null)
        {
            return;
        }
        this.description = raw.getDescription();
        this.IPAddress = raw.getIPAddress();
        this.fileSize = raw.getFileSize();
        //this.maxActivityId = raw.getMaxActivityId().longValue();
        //this.minActivityId = raw.getMinActivityId().longValue();
        this.name = raw.getName();
        this.PID = raw.getPID().longValue();
        this.type = raw.getType();
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
     * Gets the IP address.
     *
     * @return the iPAddress
     */
    public String getIPAddress()
    {
        return IPAddress;
    }

    /**
     * Sets the IP address.
     *
     * @param iPAddress
     *            the iPAddress to set
     */
    public void setIPAddress(String iPAddress)
    {
        IPAddress = iPAddress;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets the file size.
     *
     * @return the fileSize
     */
    public Long getFileSize()
    {
        return fileSize;
    }

    /**
     * Sets the file size.
     *
     * @param fileSize
     *            the fileSize to set
     */
    public void setFileSize(Long fileSize)
    {
        this.fileSize = fileSize;
    }

    /**
     * Gets the pid.
     *
     * @return the pID
     */
    public long getPID()
    {
        return PID;
    }

    /**
     * Sets the pid.
     *
     * @param pID
     *            the pID to set
     */
    public void setPID(long pID)
    {
        PID = pID;
    }

    /**
     * Gets the min activity id.
     *
     * @return the minActivityId
     */
    public long getMinActivityId()
    {
        return minActivityId;
    }

    /**
     * Sets the min activity id.
     *
     * @param minActivityId
     *            the minActivityId to set
     */
    public void setMinActivityId(Integer minActivityId)
    {
        this.minActivityId = minActivityId;
    }

    /**
     * Gets the max activity id.
     *
     * @return the maxActivityId
     */
    public long getMaxActivityId()
    {
        return maxActivityId;
    }

    /**
     * Sets the max activity id.
     *
     * @param maxActivityId
     *            the maxActivityId to set
     */
    public void setMaxActivityId(Integer maxActivityId)
    {
        this.maxActivityId = maxActivityId;
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the latest version of ECLHelpFile.
     *
     * @return the latest version of ECLHelpFile
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ECLHelpFile();

        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        raw.setPID(new org.apache.axis2.databinding.types.UnsignedInt(this.getPID()));
        raw.setMaxActivityId(new org.apache.axis2.databinding.types.UnsignedInt(this.getMaxActivityId()));
        raw.setMinActivityId(new org.apache.axis2.databinding.types.UnsignedInt(this.getMinActivityId()));
        raw.setType(this.getType());
        return raw;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLHelpFileWrapper [name=" + name + ", type=" + type + ", IPAddress=" + IPAddress + ", description=" + description + ", fileSize="
                + fileSize + ", PID=" + PID + ", minActivityId=" + minActivityId + ", maxActivityId=" + maxActivityId + "]";
    }

}
