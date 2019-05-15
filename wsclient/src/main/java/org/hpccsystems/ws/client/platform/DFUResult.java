package org.hpccsystems.ws.client.platform;

import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUActionInfo;

public class DFUResult {
    
    private String actionResult;
    private Boolean failed;
    private String fileName;
    private String nodeGroup;

    public DFUResult(DFUActionInfo raw)
    {
        actionResult=raw.getActionResult();
        failed=raw.getFailed();
        fileName=raw.getFileName();
        nodeGroup=raw.getNodeGroup();
    }

    public String getActionResult()
    {
        return actionResult;
    }

    public void setActionResult(String actionResult)
    {
        this.actionResult = actionResult;
    }

    public Boolean getFailed()
    {
        return failed;
    }

    public void setFailed(Boolean failed)
    {
        this.failed = failed;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public String getNodeGroup()
    {
        return nodeGroup;
    }

    public void setNodeGroup(String nodeGroup)
    {
        this.nodeGroup = nodeGroup;
    }

}
