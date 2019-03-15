package org.hpccsystems.ws.client.platform;

import org.apache.axis.types.UnsignedInt;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.FileUsedByQuery;
public class QueryFileInfo {

    private String fileName;
    private Long fileSize;
    private UnsignedInt numberOfParts;

    public QueryFileInfo(FileUsedByQuery raw) {
        fileName=raw.getFileName();
        fileSize=raw.getFileSize();
        numberOfParts=raw.getNumberOfParts();
        
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public UnsignedInt getNumberOfParts() {
        return numberOfParts;
    }

    public void setNumberOfParts(UnsignedInt numberOfParts) {
        this.numberOfParts = numberOfParts;
    }
}
