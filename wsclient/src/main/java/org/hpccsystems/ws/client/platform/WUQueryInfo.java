package org.hpccsystems.ws.client.platform;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hpccsystems.ws.client.gen.wsworkunits.v1_69.ApplicationValue;
import org.hpccsystems.ws.client.gen.wsworkunits.v1_69.WUQuery;
import org.hpccsystems.ws.client.utils.Utils;

public class WUQueryInfo {

    private String after;
    private String before;
    private String cluster;
    private Integer count;
    private Boolean descending;
    private Boolean archived;
    private String ECL;
    private Date endDate;
    private String jobname;
    private Integer lastNDays;
    private String logicalFile;
    private String logicalFileSearchType;
    private String owner;
    private Long pageEndAt;
    private Long pageSize;
    private Long pageStartFrom;
    private SortBy sortby;
    private Date startDate;
    private WUState state;
    private String type;
    private String wuid;
    
    private static String ARCHIVED_STR="archived workunits";
    private static String NONARCHIVED_STR="non-archived workunits";
    
    private List<ApplicationValueInfo> applicationValues=new ArrayList<ApplicationValueInfo>();

    public WUQueryInfo() { }
    
    public WUQueryInfo(WUQuery raw) throws Exception 
    {
        after=raw.getAfter();
        ApplicationValue[] appvalues = raw.getApplicationValues();
        if (appvalues != null) 
        {
            for (int i=0; i < appvalues.length;i++) {
                applicationValues.add(new ApplicationValueInfo(appvalues[i]));
            }
        }
        before=raw.getBefore();
        cluster=raw.getCluster();
        count=raw.getCount();
        descending=raw.getDescending();
        ECL=raw.getECL();
        try 
        {
            endDate=Utils.UTCStringToDate(raw.getEndDate());
        } catch (Exception e) 
        {
            throw new Exception("Invalid end date value " + raw.getEndDate());
        }
        jobname=raw.getJobname();
        lastNDays=raw.getLastNDays();
        logicalFile=raw.getLogicalFile();
        logicalFileSearchType=raw.getLogicalFileSearchType();
        owner=raw.getOwner();
        pageEndAt=raw.getPageEndAt();
        pageSize=raw.getPageSize();
        pageStartFrom=raw.getPageStartFrom();
        //not copying getRoxieCluster; it's not in use with the 6.0.0+ versions of the platform. getCluster() is used instead
        sortby=SortBy.valueOf(raw.getSortby());
        try 
        {
            startDate=Utils.UTCStringToDate(raw.getStartDate());
        } catch (Exception e) 
        {
            throw new Exception("Invalid start date value " + raw.getStartDate());
        }
        state=WUState.valueOf(raw.getState());
        if (raw.getType()!=null)
        {
            if (ARCHIVED_STR.equals(raw.getType()))
            {
                archived=true;
            }
            else if (NONARCHIVED_STR.equals(raw.getType()))
            {
                archived=false;
            }
        }
        wuid=raw.getWuid();
    }
    
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public String getCluster() {
        return cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getDescending() {
        return descending;
    }

    public void setDescending(Boolean descending) {
        this.descending = descending;
    }

    public String getECL() {
        return ECL;
    }

    public void setECL(String eCL) {
        ECL = eCL;
    }

    public Date getEndDate() throws ParseException {
        return endDate;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public Integer getLastNDays() {
        return lastNDays;
    }

    public void setLastNDays(Integer lastNDays) {
        this.lastNDays = lastNDays;
    }

    public String getLogicalFile() {
        return logicalFile;
    }

    public void setLogicalFile(String logicalFile) {
        this.logicalFile = logicalFile;
    }

    public String getLogicalFileSearchType() {
        return logicalFileSearchType;
    }

    public void setLogicalFileSearchType(String logicalFileSearchType) {
        this.logicalFileSearchType = logicalFileSearchType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getPageEndAt() {
        return pageEndAt;
    }

    public void setPageEndAt(Long pageEndAt) {
        this.pageEndAt = pageEndAt;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageStartFrom() {
        return pageStartFrom;
    }

    public void setPageStartFrom(Long pageStartFrom) {
        this.pageStartFrom = pageStartFrom;
    }

    public SortBy getSortby() {
        return sortby;
    }

    public void setSortby(SortBy sortby) {
        this.sortby = sortby;
    }

    public WUState getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWuid() {
        return wuid;
    }

    public void setWuid(String wuid) {
        this.wuid = wuid;
    }

    public List<ApplicationValueInfo> getApplicationValues() {
        return applicationValues;
    }

    public void setApplicationValues(List<ApplicationValueInfo> applicationValues) {
        this.applicationValues = applicationValues;
    }
    
    public WUQuery getRaw() {
        WUQuery raw=new WUQuery();
        raw.setAfter(after);
        if (applicationValues.size()>0)
        {
            ApplicationValue[] appvalues = new ApplicationValue[applicationValues.size()];
            for (int i=0; i < applicationValues.size();i++) 
            {
                ApplicationValueInfo wrapped=applicationValues.get(i);
                ApplicationValue item=new ApplicationValue();
                item.setApplication(wrapped.getApplication());
                item.setName(wrapped.getName());
                item.setValue(wrapped.getValue());
                appvalues[i]=item;
            }
            raw.setApplicationValues(appvalues);
        } 
        raw.setBefore(before);
        raw.setCluster(cluster);
        raw.setCount(count);
        raw.setDescending(descending);
        raw.setECL(ECL);
        raw.setEndDate(Utils.dateToUTCString(endDate));
        raw.setJobname(jobname);
        raw.setLastNDays(lastNDays);
        raw.setLogicalFile(logicalFile);
        raw.setLogicalFileSearchType(logicalFileSearchType);
        raw.setOwner(owner);
        raw.setPageEndAt(pageEndAt);
        raw.setPageSize(pageSize);
        raw.setPageStartFrom(pageStartFrom);
        raw.setSortby(sortby.toString());
        raw.setStartDate(Utils.dateToUTCString(startDate));
        raw.setState(state.toString());
        if (archived != null)
        {
            if (archived==false)
            {
                raw.setType(NONARCHIVED_STR);
            }
            else if (archived==true)
            {
                raw.setType(ARCHIVED_STR);
            }
        }
        raw.setWuid(wuid);
        return raw;
    }

    public void setSortBy(SortBy sort)
    {
        this.sortby=sort;
    }

    public void setState(WUState stateenum) 
    {
       this.state=stateenum;
    }
    
    public void setStartDate(Date date) 
    {
        this.startDate=date;
    }

    public void setEndDate(Date date) 
    {
        this.endDate=date;
    }
    
    /**
     * This enum was created to address the profound lack of documentation about what values are valid
     * for the string sortby parameter. The list was lifted from ws_workunitsService.cpp readWUQuerySortOrder
     *  in HPCC_Platform. It's specific to WUQuery, therefore it's an internal class
     * @author LeedDX
     *
     */
    public enum SortBy
    {
        WUID,
        Owner,
        Jobname,
        Cluster,
        Protected,
        State
    }

    public void setArchived(Boolean b) {
        this.archived=b;
    }

    public Date getStartDate() {
        return startDate;
    }
}
