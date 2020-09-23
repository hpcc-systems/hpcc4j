package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ECLResult;

public class ECLResultWrapper
{

    private String filename;
    private Boolean isSupplied;
    private String link;
    private String name;
    private Integer sequence;
    private Boolean showFileContent;
    private Long total;
    private String value;
    private String xmlSchema;

    /**
     * Instantiates a new ECL result wrapper.
     */
    public ECLResultWrapper() { }

    /**
     * Instantiates a new ECL result wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLResultWrapper(ECLResult raw)
    {
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

    /**
     * Instantiates a new ECL result wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLResultWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.ECLResult raw)
    {
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

    /**
     * Instantiates a new ECL result wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLResultWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_62.ECLResult raw)
    {
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

    /**
     * Instantiates a new ECL result wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLResultWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_69.ECLResult raw)
    {
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

    /**
     * Instantiates a new ECL result wrapper.
     *
     * @param raw
     *            the raw
     */
    public ECLResultWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ECLResult raw)
    {
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

    /**
     * Gets the raw version 1 79.
     *
     * @return the raw version 1 79
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ECLResult getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ECLResult raw =
                new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ECLResult();

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

    /**
     * Gets the raw.
     *
     * @return the raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.ECLResult getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the filename.
     *
     * @return the filename
     */
    public String getFilename()
    {
        return filename;
    }

    /**
     * Sets the filename.
     *
     * @param filename
     *            the new filename
     */
    public void setFilename(String filename)
    {
        this.filename = filename;
    }

    /**
     * Gets the checks if is supplied.
     *
     * @return the checks if is supplied
     */
    public Boolean getIsSupplied()
    {
        return isSupplied;
    }

    /**
     * Sets the checks if is supplied.
     *
     * @param isSupplied
     *            the new checks if is supplied
     */
    public void setIsSupplied(Boolean isSupplied)
    {
        this.isSupplied = isSupplied;
    }

    /**
     * Gets the link.
     *
     * @return the link
     */
    public String getLink()
    {
        return link;
    }

    /**
     * Sets the link.
     *
     * @param link
     *            the new link
     */
    public void setLink(String link)
    {
        this.link = link;
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
     * Gets the sequence.
     *
     * @return the sequence
     */
    public Integer getSequence()
    {
        return sequence;
    }

    /**
     * Sets the sequence.
     *
     * @param sequence
     *            the new sequence
     */
    public void setSequence(Integer sequence)
    {
        this.sequence = sequence;
    }

    /**
     * Gets the show file content.
     *
     * @return the show file content
     */
    public Boolean getShowFileContent()
    {
        return showFileContent;
    }

    /**
     * Sets the show file content.
     *
     * @param showFileContent
     *            the new show file content
     */
    public void setShowFileContent(Boolean showFileContent)
    {
        this.showFileContent = showFileContent;
    }

    /**
     * Gets the total.
     *
     * @return the total
     */
    public Long getTotal()
    {
        return total;
    }

    /**
     * Sets the total.
     *
     * @param total
     *            the new total
     */
    public void setTotal(Long total)
    {
        this.total = total;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public String getValue()
    {
        return value;
    }

    /**
     * Sets the value.
     *
     * @param value
     *            the new value
     */
    public void setValue(String value)
    {
        this.value = value;
    }

    /**
     * Gets the xml schema.
     *
     * @return the xml schema
     */
    public String getXmlSchema()
    {
        return xmlSchema;
    }

    /**
     * Sets the xml schema.
     *
     * @param xmlSchema
     *            the new xml schema
     */
    public void setXmlSchema(String xmlSchema)
    {
        this.xmlSchema = xmlSchema;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ECLResultWrapper [ name=" + name + ", sequence=" + sequence + ", value=" + value +
                ", showFileContent=" + showFileContent + ", total=" + total
                + " xmlSchema=" + xmlSchema + "]";
    }
}
