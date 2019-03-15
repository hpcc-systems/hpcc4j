package org.hpccsystems.ws.client.platform;

import java.util.ArrayList;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.ClusterQueryState;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerySetQuery;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_74.QuerySetQueryActionResult;

public class QueryResult {
    private Boolean activated;
    List<ClusterInfo> clusters;
    private String comment;
    private String dll;
    private String id;
    private Boolean library;
    private String memoryLimit;
    private String name;
    private String priority;
    private String publishedBy;
    private String querySetId;
    private String snapshot;
    private Boolean suspended;
    private String wuid;
    private Integer code;
    private String message;
    private Boolean success;
    
    public QueryResult(QuerySetQueryActionResult raw) {
        code=raw.getCode();
        message=raw.getMessage();
        id=raw.getQueryId();
        success=raw.getSuccess();
        suspended=raw.getSuspended();
    }
    public QueryResult(QuerySetQuery qr) {
        activated=qr.getActivated();
        this.clusters=new ArrayList<ClusterInfo>();
        if (qr.getClusters() != null) 
        {
            ClusterQueryState[] rawclusters=qr.getClusters();
            for (ClusterQueryState rawc:rawclusters) {
                this.clusters.add(new ClusterInfo(rawc));
            }
        }
        comment=qr.getComment();
        dll=qr.getDll();
        id=qr.getId();
        library=qr.getIsLibrary();
        memoryLimit=qr.getMemoryLimit();
        name=qr.getName();
        priority=qr.getPriority();
        publishedBy=qr.getPublishedBy();
        querySetId=qr.getQuerySetId();
        snapshot=qr.getSnapshot();
        suspended=qr.getSuspended();
        wuid=qr.getWuid();
    }

    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    public List<ClusterInfo> getClusters() {
        return clusters;
    }

    public void setClusters(List<ClusterInfo> clusters) {
        this.clusters = clusters;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDll() {
        return dll;
    }

    public void setDll(String dll) {
        this.dll = dll;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getLibrary() {
        return library;
    }

    public void setLibrary(Boolean library) {
        this.library = library;
    }

    public String getMemoryLimit() {
        return memoryLimit;
    }

    public void setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public String getQuerySetId() {
        return querySetId;
    }

    public void setQuerySetId(String querySetId) {
        this.querySetId = querySetId;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public Boolean getSuspended() {
        return suspended;
    }

    public void setSuspended(Boolean suspended) {
        this.suspended = suspended;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    @Override
    public String toString() {
        return "QueryResult [activated=" + activated + ", clusters=" + clusters + ", comment=" + comment + ", dll="
                + dll + ", id=" + id + ", library=" + library + ", memoryLimit=" + memoryLimit + ", name=" + name
                + ", priority=" + priority + ", publishedBy=" + publishedBy + ", querySetId=" + querySetId
                + ", snapshot=" + snapshot + ", suspended=" + suspended + ", wuid=" + wuid + ", code=" + code
                + ", message=" + message + ", success=" + success + "]";
    }
}
