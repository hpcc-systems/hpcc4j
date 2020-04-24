package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ClusterQueryState;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQuery;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.QuerySetQueryActionResult;
import org.hpccsystems.ws.client.wrappers.ClusterQueryWrapper;

public class QueryResultWrapper
{
    private Boolean   activated;
    List<ClusterQueryWrapper> clusters;
    private String    comment;
    private String    dll;
    private String    id;
    private Boolean   library;
    private String    memoryLimit;
    private String    name;
    private String    priority;
    private String    publishedBy;
    private String    querySetId;
    private String    snapshot;
    private Boolean   suspended;
    private String    wuid;
    private Integer   code;
    private String    message;
    private Boolean   success;

    /**
     * Instantiates a new query result wrapper.
     *
     * @param raw
     *            the raw
     */
    public QueryResultWrapper(QuerySetQueryActionResult raw)
    {
        code = raw.getCode();
        message = raw.getMessage();
        id = raw.getQueryId();
        success = raw.getSuccess();
        suspended = raw.getSuspended();
    }

    /**
     * Instantiates a new query result wrapper.
     *
     * @param qr
     *            the qr
     */
    public QueryResultWrapper(QuerySetQuery qr)
    {
        activated = qr.getActivated();
        if (qr.getClusters() != null)
        {
            this.clusters = new ArrayList<ClusterQueryWrapper>();
            ClusterQueryState[] rawclusters = qr.getClusters().getClusterQueryState();
            for (ClusterQueryState rawc : rawclusters)
            {
                this.clusters.add(new ClusterQueryWrapper(rawc));
            }
        }
        comment = qr.getComment();
        dll = qr.getDll();
        id = qr.getId();
        library = qr.getIsLibrary();
        memoryLimit = qr.getMemoryLimit();
        name = qr.getName();
        priority = qr.getPriority();
        publishedBy = qr.getPublishedBy();
        querySetId = qr.getQuerySetId();
        snapshot = qr.getSnapshot();
        suspended = qr.getSuspended();
        wuid = qr.getWuid();
    }

    /**
     * Gets the activated.
     *
     * @return the activated
     */
    public Boolean getActivated()
    {
        return activated;
    }

    /**
     * Sets the activated.
     *
     * @param activated
     *            the new activated
     */
    public void setActivated(Boolean activated)
    {
        this.activated = activated;
    }

    /**
     * Gets the clusters.
     *
     * @return the clusters
     */
    public List<ClusterQueryWrapper> getClusters()
    {
        return clusters;
    }

    /**
     * Sets the clusters.
     *
     * @param clusters
     *            the new clusters
     */
    public void setClusters(List<ClusterQueryWrapper> clusters)
    {
        this.clusters = clusters;
    }

    /**
     * Gets the comment.
     *
     * @return the comment
     */
    public String getComment()
    {
        return comment;
    }

    /**
     * Sets the comment.
     *
     * @param comment
     *            the new comment
     */
    public void setComment(String comment)
    {
        this.comment = comment;
    }

    /**
     * Gets the dll.
     *
     * @return the dll
     */
    public String getDll()
    {
        return dll;
    }

    /**
     * Sets the dll.
     *
     * @param dll
     *            the new dll
     */
    public void setDll(String dll)
    {
        this.dll = dll;
    }

    /**
     * Gets the id.
     *
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Sets the id.
     *
     * @param id
     *            the new id
     */
    public void setId(String id)
    {
        this.id = id;
    }

    /**
     * Gets the library.
     *
     * @return the library
     */
    public Boolean getLibrary()
    {
        return library;
    }

    /**
     * Sets the library.
     *
     * @param library
     *            the new library
     */
    public void setLibrary(Boolean library)
    {
        this.library = library;
    }

    /**
     * Gets the memory limit.
     *
     * @return the memory limit
     */
    public String getMemoryLimit()
    {
        return memoryLimit;
    }

    /**
     * Sets the memory limit.
     *
     * @param memoryLimit
     *            the new memory limit
     */
    public void setMemoryLimit(String memoryLimit)
    {
        this.memoryLimit = memoryLimit;
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
     * Gets the priority.
     *
     * @return the priority
     */
    public String getPriority()
    {
        return priority;
    }

    /**
     * Sets the priority.
     *
     * @param priority
     *            the new priority
     */
    public void setPriority(String priority)
    {
        this.priority = priority;
    }

    /**
     * Gets the published by.
     *
     * @return the published by
     */
    public String getPublishedBy()
    {
        return publishedBy;
    }

    /**
     * Sets the published by.
     *
     * @param publishedBy
     *            the new published by
     */
    public void setPublishedBy(String publishedBy)
    {
        this.publishedBy = publishedBy;
    }

    /**
     * Gets the query set id.
     *
     * @return the query set id
     */
    public String getQuerySetId()
    {
        return querySetId;
    }

    /**
     * Sets the query set id.
     *
     * @param querySetId
     *            the new query set id
     */
    public void setQuerySetId(String querySetId)
    {
        this.querySetId = querySetId;
    }

    /**
     * Gets the snapshot.
     *
     * @return the snapshot
     */
    public String getSnapshot()
    {
        return snapshot;
    }

    /**
     * Sets the snapshot.
     *
     * @param snapshot
     *            the new snapshot
     */
    public void setSnapshot(String snapshot)
    {
        this.snapshot = snapshot;
    }

    /**
     * Gets the suspended.
     *
     * @return the suspended
     */
    public Boolean getSuspended()
    {
        return suspended;
    }

    /**
     * Sets the suspended.
     *
     * @param suspended
     *            the new suspended
     */
    public void setSuspended(Boolean suspended)
    {
        this.suspended = suspended;
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

    /**
     * Gets the code.
     *
     * @return the code
     */
    public Integer getCode()
    {
        return code;
    }

    /**
     * Sets the code.
     *
     * @param code
     *            the new code
     */
    public void setCode(Integer code)
    {
        this.code = code;
    }

    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets the message.
     *
     * @param message
     *            the new message
     */
    public void setMessage(String message)
    {
        this.message = message;
    }

    /**
     * Gets the success.
     *
     * @return the success
     */
    public Boolean getSuccess()
    {
        return success;
    }

    /**
     * Sets the success.
     *
     * @param success
     *            the new success
     */
    public void setSuccess(Boolean success)
    {
        this.success = success;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "QueryResult [activated=" + activated + ", clusters=" + clusters + ", comment=" + comment + ", dll=" + dll + ", id=" + id
                + ", library=" + library + ", memoryLimit=" + memoryLimit + ", name=" + name + ", priority=" + priority + ", publishedBy="
                + publishedBy + ", querySetId=" + querySetId + ", snapshot=" + snapshot + ", suspended=" + suspended + ", wuid=" + wuid + ", code="
                + code + ", message=" + message + ", success=" + success + "]";
    }
}
