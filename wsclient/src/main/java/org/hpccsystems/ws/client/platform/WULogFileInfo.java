package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.WULogFileResponse;

public class WULogFileInfo {

    private String daliServer;
    private String fileName;
    private String queryId;
    private String queryName;
    private String querySet;
    private String fileContent;
    private String wuid;

    public WULogFileInfo(WULogFileResponse raw) {
        daliServer=raw.getDaliServer();
        fileName=raw.getFileName();
        queryId=raw.getQueryId();
        queryName=raw.getQueryName();
        querySet=raw.getQuerySet();
        if (raw.getThefile()!= null) {
            fileContent=new String(raw.getThefile());
        }
        wuid=raw.getWuid();
    }

    public String getDaliServer() {
        return daliServer;
    }

    public void setDaliServer(String daliServer) {
        this.daliServer = daliServer;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getQuerySet() {
        return querySet;
    }

    public void setQuerySet(String querySet) {
        this.querySet = querySet;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }
}
