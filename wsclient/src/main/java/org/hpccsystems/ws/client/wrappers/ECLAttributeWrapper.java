package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckinAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckoutAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.SaveAttributeRequest;

public class ECLAttributeWrapper
{
    private Integer      version;
    private String       type;
    private String       text;
    private Integer      sandboxVersion;
    private Integer      resultType;
    private String       name;
    private String       moduleName;
    private String       modifiedDate;
    private String       modifiedBy;
    private String       lockedBy;
    private Integer      latestVersion;
    private Boolean      isSandbox;
    private Boolean      isOrphaned;
    private Boolean      isLocked;
    private Boolean      isCheckedOut;
    private Integer      flags;
    private String       description;
    private String       checksum;
    private Integer      access;
    private List<String> validtypes = Arrays.asList("ecl", "cmp", "dud", "spc", "kel");

    /**
     * Instantiates a new ECL attribute wrapper.
     */
    public ECLAttributeWrapper()
    {
    }

    /**
     * Instantiates a new ECL attribute wrapper.
     *
     * @param modulename
     *            the modulename
     * @param attributename
     *            the attributename
     * @param attributetype
     *            the attributetype
     * @param ecltext
     *            the ecltext
     */
    public ECLAttributeWrapper(String modulename, String attributename, String attributetype, String ecltext)
    {
        this.moduleName = modulename;
        this.name = attributename;
        this.type = attributetype;
        this.text = ecltext;
    }

    /**
     * Instantiates a new ECL attribute wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLAttributeWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ECLAttribute raw)
    {
        access = raw.getAccess();
        checksum = raw.getChecksum();
        description = raw.getDescription();
        flags = raw.getFlags();
        isCheckedOut = raw.getIsCheckedOut();
        isLocked = raw.getIsLocked();
        isOrphaned = raw.getIsOrphaned();
        isSandbox = raw.getIsSandbox();
        latestVersion = raw.getLatestVersion();
        lockedBy = raw.getLockedBy();
        modifiedBy = raw.getModifiedBy();
        modifiedDate = raw.getModifiedDate();
        moduleName = raw.getModuleName();
        name = raw.getName();
        resultType = raw.getResultType();
        sandboxVersion = raw.getSandboxVersion();
        text = raw.getText();
        type = raw.getType();
        version = raw.getVersion();
    }

    /**
     * Gets the version.
     *
     * @return the version
     */
    public Integer getVersion()
    {
        return version;
    }

    /**
     * Sets the version.
     *
     * @param version
     *            the new version
     */
    public void setVersion(Integer version)
    {
        this.version = version;
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
     *            the new type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Gets the text.
     *
     * @return the text
     */
    public String getText()
    {
        return text;
    }

    /**
     * Sets the text.
     *
     * @param text
     *            the new text
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * Gets the sandbox version.
     *
     * @return the sandbox version
     */
    public Integer getSandboxVersion()
    {
        return sandboxVersion;
    }

    /**
     * Sets the sandbox version.
     *
     * @param sandboxVersion
     *            the new sandbox version
     */
    public void setSandboxVersion(Integer sandboxVersion)
    {
        this.sandboxVersion = sandboxVersion;
    }

    /**
     * Gets the result type.
     *
     * @return the result type
     */
    public Integer getResultType()
    {
        return resultType;
    }

    /**
     * Sets the result type.
     *
     * @param resultType
     *            the new result type
     */
    public void setResultType(Integer resultType)
    {
        this.resultType = resultType;
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
     *            the new name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Gets the module name.
     *
     * @return the module name
     */
    public String getModuleName()
    {
        return moduleName;
    }

    /**
     * Sets the module name.
     *
     * @param moduleName
     *            the new module name
     */
    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

    /**
     * Gets the modified date.
     *
     * @return the modified date
     */
    public String getModifiedDate()
    {
        return modifiedDate;
    }

    /**
     * Sets the modified date.
     *
     * @param modifiedDate
     *            the new modified date
     */
    public void setModifiedDate(String modifiedDate)
    {
        this.modifiedDate = modifiedDate;
    }

    /**
     * Gets the modified by.
     *
     * @return the modified by
     */
    public String getModifiedBy()
    {
        return modifiedBy;
    }

    /**
     * Sets the modified by.
     *
     * @param modifiedBy
     *            the new modified by
     */
    public void setModifiedBy(String modifiedBy)
    {
        this.modifiedBy = modifiedBy;
    }

    /**
     * Gets the locked by.
     *
     * @return the locked by
     */
    public String getLockedBy()
    {
        return lockedBy;
    }

    /**
     * Sets the locked by.
     *
     * @param lockedBy
     *            the new locked by
     */
    public void setLockedBy(String lockedBy)
    {
        this.lockedBy = lockedBy;
    }

    /**
     * Gets the latest version.
     *
     * @return the latest version
     */
    public Integer getLatestVersion()
    {
        return latestVersion;
    }

    /**
     * Sets the latest version.
     *
     * @param latestVersion
     *            the new latest version
     */
    public void setLatestVersion(Integer latestVersion)
    {
        this.latestVersion = latestVersion;
    }

    /**
     * Gets the checks if is sandbox.
     *
     * @return the checks if is sandbox
     */
    public Boolean getIsSandbox()
    {
        return isSandbox;
    }

    /**
     * Sets the checks if is sandbox.
     *
     * @param isSandbox
     *            the new checks if is sandbox
     */
    public void setIsSandbox(Boolean isSandbox)
    {
        this.isSandbox = isSandbox;
    }

    /**
     * Gets the checks if is orphaned.
     *
     * @return the checks if is orphaned
     */
    public Boolean getIsOrphaned()
    {
        return isOrphaned;
    }

    /**
     * Sets the checks if is orphaned.
     *
     * @param isOrphaned
     *            the new checks if is orphaned
     */
    public void setIsOrphaned(Boolean isOrphaned)
    {
        this.isOrphaned = isOrphaned;
    }

    /**
     * Gets the checks if is locked.
     *
     * @return the checks if is locked
     */
    public Boolean getIsLocked()
    {
        return isLocked;
    }

    /**
     * Sets the checks if is locked.
     *
     * @param isLocked
     *            the new checks if is locked
     */
    public void setIsLocked(Boolean isLocked)
    {
        this.isLocked = isLocked;
    }

    /**
     * Gets the checks if is checked out.
     *
     * @return the checks if is checked out
     */
    public Boolean getIsCheckedOut()
    {
        return isCheckedOut;
    }

    /**
     * Sets the checks if is checked out.
     *
     * @param isCheckedOut
     *            the new checks if is checked out
     */
    public void setIsCheckedOut(Boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }

    /**
     * Gets the flags.
     *
     * @return the flags
     */
    public Integer getFlags()
    {
        return flags;
    }

    /**
     * Sets the flags.
     *
     * @param flags
     *            the new flags
     */
    public void setFlags(Integer flags)
    {
        this.flags = flags;
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
     *            the new description
     */
    public void setDescription(String description)
    {
        this.description = description;
    }

    /**
     * Gets the checksum.
     *
     * @return the checksum
     */
    public String getChecksum()
    {
        return checksum;
    }

    /**
     * Sets the checksum.
     *
     * @param checksum
     *            the new checksum
     */
    public void setChecksum(String checksum)
    {
        this.checksum = checksum;
    }

    /**
     * Gets the access.
     *
     * @return the access
     */
    public Integer getAccess()
    {
        return access;
    }

    /**
     * Sets the access.
     *
     * @param access
     *            the new access
     */
    public void setAccess(Integer access)
    {
        this.access = access;
    }

    /**
     * Gets the unique name.
     *
     * @return the unique name
     */
    public String getUniqueName()
    {
        String val = "";
        if (moduleName != null)
        {
            val = val + moduleName.toLowerCase();
        }
        if (name != null)
        {
            val = val + name.toLowerCase();
        }
        if (type != null)
        {
            val = val + type.toLowerCase();
        }
        return val;
    }

    /**
     * To create attribute.
     *
     * @return the creates the attribute
     */
    public CreateAttribute toCreateAttribute()
    {
        CreateAttribute attr = new CreateAttribute();
        attr.setAttributeName(name);
        attr.setType(type);
        attr.setModuleName(moduleName);
        return attr;
    }

    /**
     * To save attribute request.
     *
     * @return the save attribute request
     */
    public SaveAttributeRequest toSaveAttributeRequest()
    {
        SaveAttributeRequest attr = new SaveAttributeRequest();
        attr.setAttributeName(name);
        attr.setModuleName(moduleName);
        attr.setText(text);
        return attr;
    }

    /**
     * To checkin attribute request.
     *
     * @param checkinmsg
     *            the checkinmsg
     * @return the checkin attribute request
     */
    public CheckinAttributeRequest toCheckinAttributeRequest(String checkinmsg)
    {
        CheckinAttributeRequest req = new CheckinAttributeRequest();
        req.setAttributeName(name);
        req.setModuleName(moduleName);
        req.setDescription(checkinmsg);
        return req;
    }

    /**
     * To checkout attribute request.
     *
     * @return the checkout attribute request
     */
    public CheckoutAttributeRequest toCheckoutAttributeRequest()
    {
        CheckoutAttributeRequest req = new CheckoutAttributeRequest();
        req.setAttributeName(name);
        req.setModuleName(moduleName);
        return req;
    }

    /**
     * Checkitem.
     *
     * @param val
     *            the val
     * @param label
     *            the label
     * @return the string
     * @throws Exception
     *             the exception
     */
    private String checkitem(String val, String label) throws Exception
    {
        if (val == null || val.isEmpty())
        {
            return label + " is required";
        }
        else if (!val.equals(val.replaceAll("[^0-9A-Za-z]", "_")))
        {
            return label + "'" + val + "' is not a valid ecl " + label;
        }
        return null;
    }

    /**
     * Validate.
     *
     * @throws Exception
     *             the exception
     */
    public void validate() throws Exception
    {
        List<String> errs = new ArrayList<String>();
        String res = checkitem(moduleName, "module name");
        if (res != null)
        {
            errs.add(res);
        }
        res = checkitem(name, "attribute name");
        if (res != null)
        {
            errs.add(res);
        }
        if (text == null || text.isEmpty())
        {
            errs.add("Ecl is required");
        }
        if (type == null || type.isEmpty())
        {
            errs.add("attribute type is required");
        }
        else if (!validtypes.contains(type.toLowerCase()))
        {
            errs.add("attribute type " + type + " is not a valid attribute type for an legacy mysql ecl repo");
        }
        if (errs.size() > 0)
        {
            throw new Exception(String.join("\n", errs));
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLAttributeInfo [ name=" + name + ", moduleName=" + moduleName + ", version=" + version + ", type=" + type + ", sandboxVersion="
                + sandboxVersion + ", resultType=" + resultType + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", lockedBy="
                + lockedBy + ", latestVersion=" + latestVersion + ", isSandbox=" + isSandbox + ", isOrphaned=" + isOrphaned + ", isLocked=" + isLocked
                + ", isCheckedOut=" + isCheckedOut + ", flags=" + flags + ", description=" + description + ", checksum=" + checksum + ", access="
                + access + ", text=" + text + "]";
    }

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ECLAttribute getRaw()
    {
        org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ECLAttribute raw = new org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ECLAttribute();
        raw.setModuleName(moduleName);
        raw.setName(name);
        raw.setType(type);
        raw.setVersion(version);
        raw.setLatestVersion(latestVersion);
        raw.setSandboxVersion(sandboxVersion);
        raw.setFlags(flags);
        raw.setAccess(access);
        raw.setIsLocked(isLocked);
        raw.setIsCheckedOut(isCheckedOut);
        raw.setIsSandbox(isSandbox);
        raw.setIsOrphaned(isOrphaned);
        raw.setResultType(resultType);
        raw.setLockedBy(lockedBy);
        raw.setModifiedBy(modifiedBy);
        raw.setModifiedDate(modifiedDate);
        raw.setDescription(description);
        raw.setChecksum(checksum);
        raw.setText(text);
        return raw;
    }

}
