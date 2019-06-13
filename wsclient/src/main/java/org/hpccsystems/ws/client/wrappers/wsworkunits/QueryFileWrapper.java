package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.FileUsedByQuery;

public class QueryFileWrapper
{
    private String fileName;
    private Long fileSize;
    private long numberOfParts;

    public QueryFileWrapper(FileUsedByQuery raw)
    {
        fileName=raw.getFileName();
        fileSize=raw.getFileSize();
        numberOfParts=raw.getNumberOfParts().longValue();
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public Long getFileSize()
    {
        return fileSize;
    }

    public void setFileSize(Long fileSize)
    {
        this.fileSize = fileSize;
    }

    public long getNumberOfParts()
    {
        return numberOfParts;
    }

    public void setNumberOfParts(long numberOfParts)
    {
        this.numberOfParts = numberOfParts;
    }
}
