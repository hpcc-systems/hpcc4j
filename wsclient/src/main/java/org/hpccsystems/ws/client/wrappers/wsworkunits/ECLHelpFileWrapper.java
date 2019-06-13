package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile;

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

    public ECLHelpFileWrapper() {}

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
     * @return the iPAddress
     */
    public String getIPAddress()
    {
        return IPAddress;
    }

    /**
     * @param iPAddress the iPAddress to set
     */
    public void setIPAddress(String iPAddress)
    {
        IPAddress = iPAddress;
    }

    /**
     * @return the description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * @return the fileSize
     */
    public Long getFileSize()
    {
        return fileSize;
    }

    /**
     * @param fileSize the fileSize to set
     */
    public void setFileSize(Long fileSize)
    {
        this.fileSize = fileSize;
    }

    /**
     * @return the pID
     */
    public long getPID()
    {
        return PID;
    }

    /**
     * @param pID the pID to set
     */
    public void setPID(long pID)
    {
        PID = pID;
    }

    /**
     * @return the minActivityId
     */
    public long getMinActivityId()
    {
        return minActivityId;
    }

    /**
     * @param minActivityId the minActivityId to set
     */
    public void setMinActivityId(Integer minActivityId)
    {
        this.minActivityId = minActivityId;
    }

    /**
     * @return the maxActivityId
     */
    public long getMaxActivityId()
    {
        return maxActivityId;
    }

    /**
     * @param maxActivityId the maxActivityId to set
     */
    public void setMaxActivityId(Integer maxActivityId)
    {
        this.maxActivityId = maxActivityId;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile getRaw()
    {
        return getRawVersion1_75();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile getRawVersion1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLHelpFile();

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
