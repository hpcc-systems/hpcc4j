package org.hpccsystems.ws.client.platform;

public class ECLAttributeInfo {
    
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

    public ECLAttributeInfo(org.hpccsystems.ws.client.gen.extended.wsattributes.v1_21.ECLAttribute raw) {
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

}
