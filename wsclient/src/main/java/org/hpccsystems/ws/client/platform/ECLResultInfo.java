package org.hpccsystems.ws.client.platform;

public class ECLResultInfo {

    private String filename;
    private Boolean isSupplied;
    private String link;
    private String name;
    private Integer sequence;
    private Boolean showFileContent;
    private Long total;
    private String value;
    private String xmlSchema;

    public ECLResultInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLResult raw) {
        filename=raw.getFileName();
        isSupplied=raw.getIsSupplied();
        link=raw.getLink();
        name=raw.getName();
        sequence=raw.getSequence();
        showFileContent=raw.getShowFileContent();
        total=raw.getTotal();
        value=raw.getValue();
        xmlSchema=raw.getXmlSchema();
    }

    public ECLResultInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLResult raw) {
        filename=raw.getFileName();
        isSupplied=raw.getIsSupplied();
        link=raw.getLink();
        name=raw.getName();
        sequence=raw.getSequence();
        showFileContent=raw.getShowFileContent();
        total=raw.getTotal();
        value=raw.getValue();
        xmlSchema=raw.getXmlSchema();
    }

    public ECLResultInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLResult raw) {
        filename=raw.getFileName();
        isSupplied=raw.getIsSupplied();
        link=raw.getLink();
        name=raw.getName();
        sequence=raw.getSequence();
        showFileContent=raw.getShowFileContent();
        total=raw.getTotal();
        value=raw.getValue();
        xmlSchema=raw.getXmlSchema();
    }

    public ECLResultInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLResult raw) {
        filename=raw.getFileName();
        isSupplied=raw.getIsSupplied();
        link=raw.getLink();
        name=raw.getName();
        sequence=raw.getSequence();
        showFileContent=raw.getShowFileContent();
        total=raw.getTotal();
        value=raw.getValue();
        xmlSchema=raw.getXmlSchema();
    }

    public ECLResultInfo(org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLResult raw) {
        filename=raw.getFileName();
        isSupplied=raw.getIsSupplied();
        link=raw.getLink();
        name=raw.getName();
        sequence=raw.getSequence();
        showFileContent=raw.getShowFileContent();
        total=raw.getTotal();
        value=raw.getValue();
        xmlSchema=raw.getXmlSchema();
    }
    public ECLResultInfo() { }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLResult getRawVersion1_58() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLResult raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_58.ECLResult();
        raw.setFileName(this.getFilename());
        raw.setIsSupplied(this.getIsSupplied());
        raw.setLink(this.getLink());
        raw.setName(this.getName());
        raw.setSequence(raw.getSequence());
        raw.setShowFileContent(this.getShowFileContent());
        raw.setTotal(raw.getTotal());
        raw.setValue(this.getValue());
        raw.setXmlSchema(this.getXmlSchema());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLResult getRawVersion1_62() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLResult raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_62.ECLResult();
        raw.setFileName(this.getFilename());
        raw.setIsSupplied(this.getIsSupplied());
        raw.setLink(this.getLink());
        raw.setName(this.getName());
        raw.setSequence(raw.getSequence());
        raw.setShowFileContent(this.getShowFileContent());
        raw.setTotal(raw.getTotal());
        raw.setValue(this.getValue());
        raw.setXmlSchema(this.getXmlSchema());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLResult getRawVersion1_69() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLResult raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ECLResult();
        raw.setFileName(this.getFilename());
        raw.setIsSupplied(this.getIsSupplied());
        raw.setLink(this.getLink());
        raw.setName(this.getName());
        raw.setSequence(raw.getSequence());
        raw.setShowFileContent(this.getShowFileContent());
        raw.setTotal(raw.getTotal());
        raw.setValue(this.getValue());
        raw.setXmlSchema(this.getXmlSchema());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLResult getRawVersion1_73() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLResult raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_73.ECLResult();
        raw.setFileName(this.getFilename());
        raw.setIsSupplied(this.getIsSupplied());
        raw.setLink(this.getLink());
        raw.setName(this.getName());
        raw.setSequence(raw.getSequence());
        raw.setShowFileContent(this.getShowFileContent());
        raw.setTotal(raw.getTotal());
        raw.setValue(this.getValue());
        raw.setXmlSchema(this.getXmlSchema());
        return raw;
    }

    public org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLResult getRawVersion1_74() {
        org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLResult raw=new org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ECLResult();
        raw.setFileName(this.getFilename());
        raw.setIsSupplied(this.getIsSupplied());
        raw.setLink(this.getLink());
        raw.setName(this.getName());
        raw.setSequence(raw.getSequence());
        raw.setShowFileContent(this.getShowFileContent());
        raw.setTotal(raw.getTotal());
        raw.setValue(this.getValue());
        raw.setXmlSchema(this.getXmlSchema());
        return raw;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Boolean getIsSupplied() {
        return isSupplied;
    }

    public void setIsSupplied(Boolean isSupplied) {
        this.isSupplied = isSupplied;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Boolean getShowFileContent() {
        return showFileContent;
    }

    public void setShowFileContent(Boolean showFileContent) {
        this.showFileContent = showFileContent;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getXmlSchema() {
        return xmlSchema;
    }

    public void setXmlSchema(String xmlSchema) {
        this.xmlSchema = xmlSchema;
    }

    @Override
    public String toString() {
        return "ECLResultInfo [ name=" + name + ", sequence=" + sequence + ", value=" + value +
                ", showFileContent=" + showFileContent + ", total=" + total
                + " xmlSchema=" + xmlSchema + "]";
    }
}
