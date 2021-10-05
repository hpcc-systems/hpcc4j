package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.hpccsystems.ws.client.gen.axis2.wsdfu.latest.DFUActionInfo;

public class DFUResultWrapper
{
    private String actionResult;
    private Boolean failed;
    private String fileName;
    private String nodeGroup;

    /**
     * Instantiates a new DFU result wrapper.
     *
     * @param raw
     *            the raw
     */
    public DFUResultWrapper(DFUActionInfo raw)
    {
        actionResult=raw.getActionResult();
        failed=raw.getFailed();
        fileName=raw.getFileName();
        nodeGroup=raw.getNodeGroup();
    }

    /**
     * Gets the action result.
     *
     * @return the action result
     */
    public String getActionResult()
    {
        return actionResult;
    }

    /**
     * Sets the action result.
     *
     * @param actionResult
     *            the new action result
     */
    public void setActionResult(String actionResult)
    {
        this.actionResult = actionResult;
    }

    /**
     * Gets the failed.
     *
     * @return the failed
     */
    public Boolean getFailed()
    {
        return failed;
    }

    /**
     * Sets the failed.
     *
     * @param failed
     *            the new failed
     */
    public void setFailed(Boolean failed)
    {
        this.failed = failed;
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
     * Gets the node group.
     *
     * @return the node group
     */
    public String getNodeGroup()
    {
        return nodeGroup;
    }

    /**
     * Sets the node group.
     *
     * @param nodeGroup
     *            the new node group
     */
    public void setNodeGroup(String nodeGroup)
    {
        this.nodeGroup = nodeGroup;
    }
}
