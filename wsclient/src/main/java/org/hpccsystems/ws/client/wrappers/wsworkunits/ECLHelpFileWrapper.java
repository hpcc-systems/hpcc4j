package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.apache.axis.types.UnsignedInt;

public class ECLHelpFileWrapper
{
    private String name;

    private String type;

    private String IPAddress;

    private String description;

    private Long fileSize;

    private Integer PID;

    private Integer minActivityId;

    private Integer maxActivityId;

    public ECLHelpFileWrapper() {
        
    }
    
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLHelpFile raw) {
        if (raw==null) {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        if (raw.getMaxActivityId() != null) {
            this.maxActivityId=Integer.valueOf(raw.getMaxActivityId().toString());
        }
        if (raw.getMinActivityId() != null) {
            this.minActivityId=Integer.valueOf(raw.getMinActivityId().toString());
        }
        this.name=raw.getName();
        if (raw.getPID() != null) {
            this.PID=Integer.valueOf(raw.getPID().toString());
        }
        this.type=raw.getType();
    }
    
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLHelpFile raw) {
        if (raw==null) {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        if (raw.getMaxActivityId() != null) {
            this.maxActivityId=Integer.valueOf(raw.getMaxActivityId().toString());
        }
        if (raw.getMinActivityId() != null) {
            this.minActivityId=Integer.valueOf(raw.getMinActivityId().toString());
        }
        this.name=raw.getName();
        if (raw.getPID() != null) {
            this.PID=Integer.valueOf(raw.getPID().toString());
        }
        this.type=raw.getType();
    }

    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLHelpFile raw) {
        if (raw==null) {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        if (raw.getMaxActivityId() != null) {
            this.maxActivityId=Integer.valueOf(raw.getMaxActivityId().toString());
        }
        if (raw.getMinActivityId() != null) {
            this.minActivityId=Integer.valueOf(raw.getMinActivityId().toString());
        }
        this.name=raw.getName();
        if (raw.getPID() != null) {
            this.PID=Integer.valueOf(raw.getPID().toString());
        }
        this.type=raw.getType();
    }
    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLHelpFile raw) {
        if (raw==null) {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        if (raw.getMaxActivityId() != null) {
            this.maxActivityId=Integer.valueOf(raw.getMaxActivityId().toString());
        }
        if (raw.getMinActivityId() != null) {
            this.minActivityId=Integer.valueOf(raw.getMinActivityId().toString());
        }
        this.name=raw.getName();
        if (raw.getPID() != null) {
            this.PID=Integer.valueOf(raw.getPID().toString());
        }
        this.type=raw.getType();
    }

    public ECLHelpFileWrapper(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLHelpFile raw) {
        if (raw==null) {
            return;
        }
        this.description=raw.getDescription();
        this.IPAddress=raw.getIPAddress();
        this.fileSize=raw.getFileSize();
        if (raw.getMaxActivityId() != null) {
            this.maxActivityId=Integer.valueOf(raw.getMaxActivityId().toString());
        }
        if (raw.getMinActivityId() != null) {
            this.minActivityId=Integer.valueOf(raw.getMinActivityId().toString());
        }
        this.name=raw.getName();
        if (raw.getPID() != null) {
            this.PID=Integer.valueOf(raw.getPID().toString());
        }
        this.type=raw.getType();
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
    public Integer getPID()
    {
        return PID;
    }

    /**
     * @param pID the pID to set
     */
    public void setPID(Integer pID)
    {
        PID = pID;
    }

    /**
     * @return the minActivityId
     */
    public Integer getMinActivityId()
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
    public Integer getMaxActivityId()
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

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLHelpFile getRaw() {
        return getRawVersion74();
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLHelpFile getRawVersion74()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLHelpFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLHelpFile();
        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        if (this.getPID() != null) {
            raw.setPID(new UnsignedInt(this.getPID()));
        }
        if (this.getMaxActivityId() != null) {
            raw.setMaxActivityId(new UnsignedInt(this.getMaxActivityId()));
        }
        if (this.getMinActivityId() != null) {
            raw.setMinActivityId(new UnsignedInt(this.getMinActivityId()));
        }
        raw.setType(this.getType());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLHelpFile getRawVersion73()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLHelpFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLHelpFile();
        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        if (this.getPID() != null) {
            raw.setPID(new UnsignedInt(this.getPID()));
        }
        if (this.getMaxActivityId() != null) {
            raw.setMaxActivityId(new UnsignedInt(this.getMaxActivityId()));
        }
        if (this.getMinActivityId() != null) {
            raw.setMinActivityId(new UnsignedInt(this.getMinActivityId()));
        }
        raw.setType(this.getType());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLHelpFile getRawVersion1_69()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLHelpFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLHelpFile();
        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        if (this.getPID() != null) {
            raw.setPID(new UnsignedInt(this.getPID()));
        }
        if (this.getMaxActivityId() != null) {
            raw.setMaxActivityId(new UnsignedInt(this.getMaxActivityId()));
        }
        if (this.getMinActivityId() != null) {
            raw.setMinActivityId(new UnsignedInt(this.getMinActivityId()));
        }
        raw.setType(this.getType());
        return raw;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLHelpFile getRawVersion1_62()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLHelpFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLHelpFile();
        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        if (this.getPID() != null) {
            raw.setPID(new UnsignedInt(this.getPID()));
        }
        if (this.getMaxActivityId() != null) {
            raw.setMaxActivityId(new UnsignedInt(this.getMaxActivityId()));
        }
        if (this.getMinActivityId() != null) {
            raw.setMinActivityId(new UnsignedInt(this.getMinActivityId()));
        }
        raw.setType(this.getType());
        return raw;
    }
    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLHelpFile getRawVersion1_58()
    {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLHelpFile raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLHelpFile();
        raw.setDescription(this.getDescription());
        raw.setFileSize(this.getFileSize());
        raw.setIPAddress(this.getIPAddress());
        raw.setName(this.getName());
        if (this.getPID() != null) {
            raw.setPID(new UnsignedInt(this.getPID()));
        }
        if (this.getMaxActivityId() != null) {
            raw.setMaxActivityId(new UnsignedInt(this.getMaxActivityId()));
        }
        if (this.getMinActivityId() != null) {
            raw.setMinActivityId(new UnsignedInt(this.getMinActivityId()));
        }
        raw.setType(this.getType());
        return raw;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLHelpFileWrapper [name=" + name + ", type=" + type + ", IPAddress=" + IPAddress + ", description="
                + description + ", fileSize=" + fileSize + ", PID=" + PID + ", minActivityId=" + minActivityId
                + ", maxActivityId=" + maxActivityId + "]";
    }

}
