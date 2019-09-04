package org.hpccsystems.ws.client.wrappers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckinAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CheckoutAttributeRequest;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.CreateAttribute;
import org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.SaveAttributeRequest;

public class ECLAttributeWrapper 
{    
    private Integer version;
    private String type;
    private String text;
    private Integer sandboxVersion;
    private Integer resultType;
    private String name;
    private String moduleName;
    private String modifiedDate;
    private String modifiedBy;
    private String lockedBy;
    private Integer latestVersion;
    private Boolean isSandbox;
    private Boolean isOrphaned;
    private Boolean isLocked;
    private Boolean isCheckedOut;
    private Integer flags;
    private String description;
    private String checksum;
    private Integer access;
    private List<String> validtypes=Arrays.asList("ecl","cmp","dud","spc","kel");
    
    public ECLAttributeWrapper() {}
    
    public ECLAttributeWrapper(String modulename, String attributename,String attributetype, String ecltext)
    {
        this.moduleName=modulename;
        this.name=attributename;
        this.type=attributetype;
        this.text=ecltext;
    }

    public ECLAttributeWrapper(org.hpccsystems.ws.client.gen.axis2.wsattributes.v1_21.ECLAttribute raw)
    {
        access=raw.getAccess();
        checksum=raw.getChecksum();
        description=raw.getDescription();
        flags=raw.getFlags();
        isCheckedOut=raw.getIsCheckedOut();
        isLocked=raw.getIsLocked();
        isOrphaned=raw.getIsOrphaned();
        isSandbox=raw.getIsSandbox();
        latestVersion=raw.getLatestVersion();
        lockedBy=raw.getLockedBy();
        modifiedBy=raw.getModifiedBy();
        modifiedDate=raw.getModifiedDate();
        moduleName=raw.getModuleName();
        name=raw.getName();
        resultType=raw.getResultType();
        sandboxVersion=raw.getSandboxVersion();
        text=raw.getText();
        type=raw.getType();
        version=raw.getVersion();
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getSandboxVersion() {
        return sandboxVersion;
    }

    public void setSandboxVersion(Integer sandboxVersion) {
        this.sandboxVersion = sandboxVersion;
    }

    public Integer getResultType() {
        return resultType;
    }

    public void setResultType(Integer resultType) {
        this.resultType = resultType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getLockedBy() {
        return lockedBy;
    }

    public void setLockedBy(String lockedBy) {
        this.lockedBy = lockedBy;
    }

    public Integer getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(Integer latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Boolean getIsSandbox() {
        return isSandbox;
    }

    public void setIsSandbox(Boolean isSandbox) {
        this.isSandbox = isSandbox;
    }

    public Boolean getIsOrphaned() {
        return isOrphaned;
    }

    public void setIsOrphaned(Boolean isOrphaned) {
        this.isOrphaned = isOrphaned;
    }

    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public Boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setIsCheckedOut(Boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public Integer getAccess() {
        return access;
    }

    public void setAccess(Integer access) {
        this.access = access;
    }
    
    public String getUniqueName() {
        String val="";
        if (moduleName != null)
        {
            val=val + moduleName.toLowerCase();
        }
        if (name != null)
        {
            val=val + name.toLowerCase();
        }
        if (type != null)
        {
            val=val + type.toLowerCase();
        }
        return val;
    }
    public CreateAttribute toCreateAttribute()
    {
        CreateAttribute attr = new CreateAttribute();
        attr.setAttributeName(name);
        attr.setType(type);
        attr.setModuleName(moduleName);
        return attr;
    }
    
    public SaveAttributeRequest toSaveAttributeRequest()
    {
        SaveAttributeRequest attr = new SaveAttributeRequest();
        attr.setAttributeName(name);
        attr.setModuleName(moduleName);
        attr.setText(text);
        return attr;
    }

    public CheckinAttributeRequest toCheckinAttributeRequest(String checkinmsg)
    {
        CheckinAttributeRequest req = new CheckinAttributeRequest();
        req.setAttributeName(name);
        req.setModuleName(moduleName);
        req.setDescription(checkinmsg);
        return req;
    }

    public CheckoutAttributeRequest toCheckoutAttributeRequest()
    {
        CheckoutAttributeRequest req = new CheckoutAttributeRequest();
        req.setAttributeName(name);
        req.setModuleName(moduleName);
        return req;
    }
    private String checkitem(String val, String label) throws Exception
    {
        if (StringUtils.isEmpty(val)) 
        {
            return label + " is required";
        } 
        else if (!val.equals(val.replaceAll("[^0-9A-Za-z]","_")))
        {
            return label + "'" + val + "' is not a valid ecl " + label;    
        }
        return null;
    }
    public void validate() throws Exception
    {
        List<String> errs=new ArrayList<String>();
        String res=checkitem(moduleName,"module name");
        if (res != null)
        {
            errs.add(res);
        }
        res=checkitem(name,"attribute name");
        if (res != null)
        {
            errs.add(res);
        }
        if (StringUtils.isEmpty(text)) 
        {
            errs.add("Ecl is required");
        }        
        if (StringUtils.isEmpty(type)) 
        {
            errs.add("attribute type is required");
        } 
        else if (!validtypes.contains(type.toLowerCase()))
        {
            errs.add("attribute type " + type + " is not a valid attribute type for an legacy mysql ecl repo");    
        }
        if (errs.size()>0)
        {
            throw new Exception(StringUtils.join(errs,"\n"));
        }
    }

    @Override
    public String toString() {
        return "ECLAttributeInfo [ name=" + name + ", moduleName=" + moduleName + ", version=" + version 
                + ", type=" + type + ", sandboxVersion="
                + sandboxVersion + ", resultType=" + resultType 
                + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy + ", lockedBy=" + lockedBy
                + ", latestVersion=" + latestVersion + ", isSandbox=" + isSandbox + ", isOrphaned=" + isOrphaned
                + ", isLocked=" + isLocked + ", isCheckedOut=" + isCheckedOut + ", flags=" + flags + ", description="
                + description + ", checksum=" + checksum + ", access=" + access 
                +  ", text=" + text + "]";
    }

}
