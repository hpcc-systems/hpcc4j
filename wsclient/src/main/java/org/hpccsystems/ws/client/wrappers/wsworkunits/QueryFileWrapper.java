package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.FileUsedByQuery;

public class QueryFileWrapper
{
    private String fileName;
    private Long fileSize;
    private long numberOfParts;

    /**
     * Instantiates a new query file wrapper.
     *
     * @param raw
     *            the raw
     */
    public QueryFileWrapper(FileUsedByQuery raw)
    {
        fileName=raw.getFileName();
        fileSize=raw.getFileSize();
        numberOfParts=raw.getNumberOfParts().longValue();
    }

    /**
     * Gets the file name.
     *
     * @return the file name
     */
    public String getFileName()
    {
        return fileName;
    }

    /**
     * Sets the file name.
     *
     * @param fileName
     *            the new file name
     */
    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    /**
     * Gets the file size.
     *
     * @return the file size
     */
    public Long getFileSize()
    {
        return fileSize;
    }

    /**
     * Sets the file size.
     *
     * @param fileSize
     *            the new file size
     */
    public void setFileSize(Long fileSize)
    {
        this.fileSize = fileSize;
    }

    /**
     * Gets the number of parts.
     *
     * @return the number of parts
     */
    public long getNumberOfParts()
    {
        return numberOfParts;
    }

    /**
     * Sets the number of parts.
     *
     * @param numberOfParts
     *            the new number of parts
     */
    public void setNumberOfParts(long numberOfParts)
    {
        this.numberOfParts = numberOfParts;
    }
}
