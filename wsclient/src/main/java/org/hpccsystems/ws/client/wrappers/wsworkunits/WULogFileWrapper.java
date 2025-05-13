package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WULogFileResponse;

import jakarta.activation.DataHandler;

@Deprecated
public class WULogFileWrapper
{
    private String daliServer;
    private String fileName;
    private String queryId;
    private String queryName;
    private String querySet;
    private String fileContent;
    private String wuid;

    /**
     * Instantiates a new WU log file wrapper.
     *
     * @param raw
     *            the raw
     */
    public WULogFileWrapper(WULogFileResponse raw)
    {
        daliServer = raw.getDaliServer();
        fileName = raw.getFileName();
        queryId = raw.getQueryId();
        queryName = raw.getQueryName();
        querySet = raw.getQuerySet();
        if (raw.getThefile() != null)
        {
            try
            {
                DataHandler handler = raw.getThefile();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                handler.writeTo(output);
                fileContent = output.toString();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        wuid = raw.getWuid();
    }

    /**
     * Gets the dali server.
     *
     * @return the dali server
     */
    public String getDaliServer()
    {
        return daliServer;
    }

    /**
     * Sets the dali server.
     *
     * @param daliServer
     *            the new dali server
     */
    public void setDaliServer(String daliServer)
    {
        this.daliServer = daliServer;
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
     * Gets the query id.
     *
     * @return the query id
     */
    public String getQueryId()
    {
        return queryId;
    }

    /**
     * Sets the query id.
     *
     * @param queryId
     *            the new query id
     */
    public void setQueryId(String queryId)
    {
        this.queryId = queryId;
    }

    /**
     * Gets the query name.
     *
     * @return the query name
     */
    public String getQueryName()
    {
        return queryName;
    }

    /**
     * Sets the query name.
     *
     * @param queryName
     *            the new query name
     */
    public void setQueryName(String queryName)
    {
        this.queryName = queryName;
    }

    /**
     * Gets the query set.
     *
     * @return the query set
     */
    public String getQuerySet()
    {
        return querySet;
    }

    /**
     * Sets the query set.
     *
     * @param querySet
     *            the new query set
     */
    public void setQuerySet(String querySet)
    {
        this.querySet = querySet;
    }

    /**
     * Gets the file content.
     *
     * @return the file content
     */
    public String getFileContent()
    {
        return fileContent;
    }

    /**
     * Sets the file content.
     *
     * @param fileContent
     *            the new file content
     */
    public void setFileContent(String fileContent)
    {
        this.fileContent = fileContent;
    }

    /**
     * Gets the wuid.
     *
     * @return the wuid
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * Sets the wuid.
     *
     * @param wuid
     *            the new wuid
     */
    public void setWuid(String wuid)
    {
        this.wuid = wuid;
    }
}
