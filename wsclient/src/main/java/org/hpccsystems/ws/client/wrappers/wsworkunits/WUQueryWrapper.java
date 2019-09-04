package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.WUState;

/**
 * Wrapper class for inputs to WUQuery. the fields aren't an exact 1-to-1 with the esp service fields. some fields
 * are deprecated and no longer used, some fields have been replaced by others, some string fields are actually
 * expecting specific enum values.
 *
 */
public class WUQueryWrapper
{
    private String                        cluster;
    private Boolean                       descending;
    private Boolean                       archived;
    private String                        ECL;
    private Date                          endDate;
    private String                        jobname;
    private String                        logicalFile;
    //if logicalfilesearchtype is null, only inputs are searched.
    //setting input to be the default search to avoid user confusion later.
    private LogicalFileSearchType         logicalFileSearchType = LogicalFileSearchType.Input;
    private String                        owner;
    private Long                          pageSize;
    private Long                          pageStartFrom;
    private SortBy                        sortby;
    private Date                          startDate;
    private WUState                       state;
    private String                        wuid;

    private static String                 ARCHIVED_STR          = "archived workunits";
    private static String                 NONARCHIVED_STR       = "non-archived workunits";
    private static String                 CREATED_LF_STR        = "created";

    private List<ApplicationValueWrapper> applicationValues     = new ArrayList<ApplicationValueWrapper>();

    public WUQueryWrapper()
    {
    }

    /**
     * 
     * @param raw - the soap-version-specific WUQuery to use to initialize this WUQueryInfo object.
     * @throws Exception if the input start date / end date are not null and are invalid date strings.
     */
    public WUQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery raw) throws Exception
    {
        //not setting before or after or count. They've been replaced by pageStartFrom and papgeSize.
        //not setting roxiecluster, it's deprecated and cluster is used. This is as of
        //not setting lastndays, it's deprecated. using startdate 
        //all this as per Kevin Wang

        if (raw.getApplicationValues() != null)
        {
            ApplicationValue[] applicationValuearray = raw.getApplicationValues().getApplicationValue();
            for (int i = 0; i < applicationValuearray.length; i++)
            {
                applicationValues.add(new ApplicationValueWrapper(applicationValuearray[i]));
            }
        }

        cluster = raw.getCluster();
        descending = raw.getDescending();
        ECL = raw.getECL();
        try
        {
            endDate = Utils.UTCStringToDate(raw.getEndDate());
        }
        catch (Exception e)
        {
            throw new Exception("Invalid end date value " + raw.getEndDate());
        }
        jobname = raw.getJobname();
        logicalFile = raw.getLogicalFile();
        //the way this works is: if "created" is sent in, only outputs are searched.
        //otherwise, if it's null OR some other value is passed in, only inputs are searched.
        if (CREATED_LF_STR.equalsIgnoreCase(raw.getLogicalFileSearchType()))
        {
            this.logicalFileSearchType = LogicalFileSearchType.Output;
        }
        owner = raw.getOwner();
        pageSize = raw.getPageSize();
        pageStartFrom = raw.getPageStartFrom();
        sortby = SortBy.valueOf(raw.getSortby());
        try
        {
            startDate = Utils.UTCStringToDate(raw.getStartDate());
        }
        catch (Exception e)
        {
            throw new Exception("Invalid start date value " + raw.getStartDate());
        }
        state = WUState.valueOf(raw.getState());
        if (raw.getType() != null)
        {
            if (ARCHIVED_STR.equals(raw.getType()))
            {
                archived = true;
            }
            else if (NONARCHIVED_STR.equals(raw.getType()))
            {
                archived = false;
            }
        }
        wuid = raw.getWuid();
    }

    /**
     * @return the cluster name to filter workunits by.
     */
    public String getCluster()
    {
        return cluster;
    }

    /**
     * @param cluster - the cluster name to return workunits from.
     */
    public WUQueryWrapper setCluster(String cluster)
    {
        this.cluster = cluster;
        return this;
    }

    /**
     * @return if a sortby param is specified and getDescending is true, results will be returned descending.
     * 
     */
    public Boolean getDescending()
    {
        return descending;
    }

    /**
     * @param descending - if a sortby parameter is specified, descending will make that parameter sort descending.
     */
    public WUQueryWrapper setDescending(Boolean descending)
    {
        this.descending = descending;
        return this;
    }

    /**
     * @return the ecl that will be searched for.
     */
    public String getECL()
    {
        return ECL;
    }

    /**
     * @param ecl - the ecl to search for. Wildcards (*,?) are allowed.
     */
    public WUQueryWrapper setECL(String eCL)
    {
        ECL = eCL;
        return this;
    }

    /**
     * @return - the end date to search for.
     */
    public Date getEndDate()
    {
        return endDate;
    }

    /**
     * @return jobname that will be searched for.
     */
    public String getJobname()
    {
        return jobname;
    }

    /**
     * @param jobname - find workunits with this jobname. Wildcards (*,?) are allowed.
     */
    public WUQueryWrapper setJobname(String jobname)
    {
        this.jobname = jobname;
        return this;
    }

    /**
     * @return the logical file to search for.
     */
    public String getLogicalFile()
    {
        return logicalFile;
    }

    /**
     * @param logicalFile - the name of the logical file to search for. Wildcards allowed (*,?)
     * Should not start with "~"
     */
    public WUQueryWrapper setLogicalFile(String logicalFile)
    {
        if (logicalFile != null && logicalFile.startsWith("~"))
        {
            logicalFile = logicalFile.substring(1);
        }
        this.logicalFile = logicalFile;
        return this;
    }

    /**
     * @return the type of logical files that will be searched for, Input or Output (can't be both). If null, input
     * files are searched.
     */
    public LogicalFileSearchType getLogicalFileSearchType()
    {
        return this.logicalFileSearchType;
    }

    /**
     * @param b  If searching for a logical file, if this is true, only logical files output by the workunit
     * will be considered.
     */
    public WUQueryWrapper setOutputLogicalFilesOnly(LogicalFileSearchType lf)
    {
        this.logicalFileSearchType = lf;
        return this;
    }

    /**
     * @return owner that workunits will be filtered by
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * @param owner - return only workunits created by this username. Case insensitive
     */
    public WUQueryWrapper setOwner(String owner)
    {
        this.owner = owner;
        return this;
    }

    /**
     * @return number of results to return
     */
    public Long getPageSize()
    {
        return pageSize;
    }

    /**
     * @param pageSize - the number of results to return. Overrides getPageEndAt. EG if 100 results are found,
     * getPageStartFrom is 10, getPageEndAt is 50, and getPageSize is 10, workunits 10-20 will be returned.
     */
    public WUQueryWrapper setPageSize(Long pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * @return  Which result to begin returning results from
     */
    public Long getPageStartFrom()
    {
        return pageStartFrom;
    }

    /**
     * @param pageStartFrom - Which result to begin returning results from. e.g. if 100 workunits were found and
     * this value is 4, the first three workunits will not be included in the results. Default value is 1
     * */
    public WUQueryWrapper setPageStartFrom(Long pageStartFrom)
    {
        this.pageStartFrom = pageStartFrom;
        return this;
    }

    /**
     * @return the SortBy enum indicating the sort order in which results will be returned.
     */
    public SortBy getSortby()
    {
        return sortby;
    }

    /**
     * @return the WUState enum for the state that will be searched for.
     */
    public WUState getState()
    {
        return state;
    }

    /**
     * @return the workunit id that will be searched for.
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * @param wuid - the Workunit ID to search for. Case Insensitive.
     */
    public WUQueryWrapper setWuid(String wuid)
    {
        this.wuid = wuid;
        return this;
    }

    /**
     * @return the application values that will be searched for. If none have been specified,
     * an empty list is returned.
     */
    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    /**
     * @param applicationValues - the application values to search for. Any workunits containing these
     * application values will be returned.
     */
    public WUQueryWrapper setApplicationValues(List<ApplicationValueWrapper> applicationValues)
    {
        this.applicationValues = applicationValues;
        return this;
    }

    /**
     * @param sort how to sort the returned workunits. If null, results are returned by wuid descending.
     */
    public WUQueryWrapper setSortBy(SortBy sort)
    {
        this.sortby = sort;
        return this;
    }

    /**
     * @param stateenum - return workunits with only the specified state.
     */
    public WUQueryWrapper setState(WUState stateenum)
    {
        this.state = stateenum;
        return this;
    }

    /**
     * @param date - the start date for which workunits will be retrieved.
     */
    public WUQueryWrapper setStartDate(Date date)
    {
        this.startDate = date;
        return this;
    }

    /**
     * @param date - the end date for which workunits will be retrieved.
     */
    public WUQueryWrapper setEndDate(Date date)
    {
        this.endDate = date;
        return this;
    }

    /**
     * @param b - if true, only archived workunits will be returned. if false or null, only unarchived workunits will be
     * returned.
     */
    public WUQueryWrapper setArchived(Boolean b)
    {
        this.archived = b;
        return this;
    }

    /**
     * @return the start date for which workunits will be retrieved.
     */
    public Date getStartDate()
    {
        return startDate;
    }

    public void validate() throws Exception
    {
        // sanitize ApplicationValue[]
        if (applicationValues != null)
        {
            for (ApplicationValueWrapper v : applicationValues)
            {
                if (v.getApplication() != null && !v.getApplication().isEmpty()
                        && ((v.getName() == null || v.getName().isEmpty()) && (v.getValue() == null || v.getValue().isEmpty())))
                {
                    throw new Exception("Application set but no name/value given");
                }
            }
        }
    }

    /**
     * @return the raw WUQuery object
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery getRaw()
    {
        return getRaw1_75();
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery getRaw1_75()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.WUQuery();
        if (applicationValues.size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue[] appvalues = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue[applicationValues.size()];
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfApplicationValue arrayofappvalues = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ArrayOfApplicationValue();
            for (int i = 0; i < applicationValues.size(); i++)
            {
                ApplicationValueWrapper wrapped = applicationValues.get(i);
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue item = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ApplicationValue();
                item.setApplication(wrapped.getApplication());
                item.setName(wrapped.getName());
                item.setValue(wrapped.getValue());
                appvalues[i] = item;
            }
            arrayofappvalues.setApplicationValue(appvalues);
            
            raw.setApplicationValues(arrayofappvalues);
        }

        raw.setCluster(cluster);
        raw.setDescending(descending);
        raw.setECL(ECL);
        raw.setEndDate(Utils.dateToUTCString(endDate));
        raw.setJobname(jobname);
        raw.setLogicalFile(logicalFile);

        if (logicalFile != null && logicalFileSearchType != null)
        {
            if (LogicalFileSearchType.Output.equals(logicalFileSearchType))
                raw.setLogicalFileSearchType(CREATED_LF_STR);
        }
        raw.setOwner(owner);
        if (pageSize != null)
            raw.setPageSize(pageSize);
        if (pageStartFrom != null)
            raw.setPageStartFrom(pageStartFrom);

        if (sortby != null)
        {
            raw.setSortby(sortby.toString());
        }

        raw.setStartDate(Utils.dateToUTCString(startDate));

        if (state != null)
        {
            raw.setState(state.toString());
        }

        if (archived != null)
        {
            if (archived == false)
            {
                raw.setType(NONARCHIVED_STR);
            }
            else if (archived == true)
            {
                raw.setType(ARCHIVED_STR);
            }
        }
        raw.setWuid(wuid);
        return raw;
    }

    /**
     * This enum was created to address the profound lack of documentation about what values are valid
     * for the string sortby parameter. The list was lifted from ws_workunitsService.cpp readWUQuerySortOrder
     *  in HPCC_Platform. It's specific to WUQuery, therefore it's an internal class
     *
     */
    public enum SortBy
    {
        WUID, Owner, Jobname, Cluster, Protected, State
    }

    /**
     * either input or output logical files can be searched; but not both, apparently.
     * @author LeedDX
     *
     */
    public enum LogicalFileSearchType
    {
        Input, Output
    }

    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQuery getRaw156(int appvalue) throws Exception
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WUQuery();

        if (cluster != null)
            raw.setCluster(cluster);

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

        raw.setStartDate(Utils.dateToUTCString(startDate));

        if (state != null)
        {
            raw.setState(state.toString());
        }

        raw.setEndDate(Utils.dateToUTCString(endDate));
        raw.setWuid(wuid);
        raw.setJobname(jobname);
        raw.setOwner(owner);
        raw.setPageSize(pageSize); 
        
        if (sortby != null)
        {
            raw.setSortby(sortby.toString());
        }

        raw.setDescending(descending);

        if (applicationValues.size()>0)
        {
            if (appvalue >= applicationValues.size())
            {
                throw new Exception("Can't use application value at 0-based index " + appvalue + ", there are only " + applicationValues.size() + " values");
            }
            raw.setApplicationName(applicationValues.get(appvalue).getApplication());
            raw.setApplicationKey(applicationValues.get(appvalue).getName());
            raw.setApplicationData(applicationValues.get(appvalue).getValue());
        }
        return raw;
    }
}
