package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ArrayOfApplicationValue;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ApplicationValueWrapper;
import org.hpccsystems.ws.client.wrappers.WUState;

/**
 * Wrapper class for inputs to WUQuery. the fields aren't an exact 1-to-1 with the esp service fields. some fields
 * are deprecated and no longer used, some fields have been replaced by others, some string fields are actually
 * expecting specific enum values.
 *
 */
@Deprecated
public class WUQueryWrapper
{
    private String                        cluster;
    private boolean                       descending=false;
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

    /**
     * Instantiates a new WU query wrapper.
     */
    public WUQueryWrapper()
    {
    }

    /**
     * Instantiates a new WU query wrapper.
     *
     * @param raw
     *            - the soap-version-specific WUQuery to use to initialize this WUQueryInfo object.
     * @throws Exception
     *             if the input start date / end date are not null and are invalid date strings.
     */
    public WUQueryWrapper(org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery raw) throws Exception
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
     * Gets the cluster.
     *
     * @return the cluster name to filter workunits by.
     */
    public String getCluster()
    {
        return cluster;
    }

    /**
     * Sets the cluster.
     *
     * @param cluster
     *            - the cluster name to return workunits from.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setCluster(String cluster)
    {
        this.cluster = cluster;
        return this;
    }

    /**
     * Gets the descending.
     *
     * @return if a sortby param is specified and getDescending is true, results will be returned descending.
     */
    public boolean getDescending()
    {
        return descending;
    }

    /**
     * Sets the descending.
     *
     * @param descending
     *            - if a sortby parameter is specified, descending will make that parameter sort descending.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setDescending(boolean descending)
    {
        this.descending = descending;
        return this;
    }

    /**
     * Gets the ecl.
     *
     * @return the ecl that will be searched for.
     */
    public String getECL()
    {
        return ECL;
    }

    /**
     * Sets the ECL.
     *
     * @param eCL
     *            the e CL
     * @return the WU query wrapper
     */
    public WUQueryWrapper setECL(String eCL)
    {
        ECL = eCL;
        return this;
    }

    /**
     * Gets the end date.
     *
     * @return - the end date to search for.
     */
    public Date getEndDate()
    {
        return endDate;
    }

    /**
     * Gets the jobname.
     *
     * @return jobname that will be searched for.
     */
    public String getJobname()
    {
        return jobname;
    }

    /**
     * Sets the jobname.
     *
     * @param jobname
     *            - find workunits with this jobname. Wildcards (*,?) are allowed.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setJobname(String jobname)
    {
        this.jobname = jobname;
        return this;
    }

    /**
     * Gets the logical file.
     *
     * @return the logical file to search for.
     */
    public String getLogicalFile()
    {
        return logicalFile;
    }

    /**
     * Sets the logical file.
     *
     * @param logicalFile
     *            - the name of the logical file to search for. Wildcards allowed (*,?)
     *            Should not start with "~"
     * @return the WU query wrapper
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
     * Gets the logical file search type.
     *
     * @return the type of logical files that will be searched for, Input or Output (can't be both). If null, input
     *         files are searched.
     */
    public LogicalFileSearchType getLogicalFileSearchType()
    {
        return this.logicalFileSearchType;
    }

    /**
     * Sets the output logical files only.
     *
     * @param lf
     *            the lf
     * @return the WU query wrapper
     */
    public WUQueryWrapper setOutputLogicalFilesOnly(LogicalFileSearchType lf)
    {
        this.logicalFileSearchType = lf;
        return this;
    }

    /**
     * Gets the owner.
     *
     * @return owner that workunits will be filtered by
     */
    public String getOwner()
    {
        return owner;
    }

    /**
     * Sets the owner.
     *
     * @param owner
     *            - return only workunits created by this username. Case insensitive
     * @return the WU query wrapper
     */
    public WUQueryWrapper setOwner(String owner)
    {
        this.owner = owner;
        return this;
    }

    /**
     * Gets the page size.
     *
     * @return number of results to return
     */
    public Long getPageSize()
    {
        return pageSize;
    }

    /**
     * Sets the page size.
     *
     * @param pageSize
     *            - the number of results to return. Overrides getPageEndAt. EG if 100 results are found,
     *            getPageStartFrom is 10, getPageEndAt is 50, and getPageSize is 10, workunits 10-20 will be returned.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setPageSize(Long pageSize)
    {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Gets the page start from.
     *
     * @return Which result to begin returning results from
     */
    public Long getPageStartFrom()
    {
        return pageStartFrom;
    }

    /**
     * Sets the page start from.
     *
     * @param pageStartFrom
     *            - Which result to begin returning results from. e.g. if 100 workunits were found and
     *            this value is 4, the first three workunits will not be included in the results. Default value is 1
     * @return the WU query wrapper
     */
    public WUQueryWrapper setPageStartFrom(Long pageStartFrom)
    {
        this.pageStartFrom = pageStartFrom;
        return this;
    }

    /**
     * Gets the sortby.
     *
     * @return the SortBy enum indicating the sort order in which results will be returned.
     */
    public SortBy getSortby()
    {
        return sortby;
    }

    /**
     * Gets the state.
     *
     * @return the WUState enum for the state that will be searched for.
     */
    public WUState getState()
    {
        return state;
    }

    /**
     * Gets the wuid.
     *
     * @return the workunit id that will be searched for.
     */
    public String getWuid()
    {
        return wuid;
    }

    /**
     * Sets the wuid.
     *
     * @param wuid
     *            - the Workunit ID to search for. Case Insensitive.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setWuid(String wuid)
    {
        this.wuid = wuid;
        return this;
    }

    /**
     * Gets the application values.
     *
     * @return the application values that will be searched for. If none have been specified,
     *         an empty list is returned.
     */
    public List<ApplicationValueWrapper> getApplicationValues()
    {
        return applicationValues;
    }

    /**
     * Sets the application values.
     *
     * @param applicationValues
     *            - the application values to search for. Any workunits containing these
     *            application values will be returned.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setApplicationValues(List<ApplicationValueWrapper> applicationValues)
    {
        this.applicationValues = applicationValues;
        return this;
    }

    /**
     * Sets the sort by.
     *
     * @param sort
     *            how to sort the returned workunits. If null, results are returned by wuid descending.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setSortBy(SortBy sort)
    {
        this.sortby = sort;
        return this;
    }

    /**
     * Sets the state.
     *
     * @param stateenum
     *            - return workunits with only the specified state.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setState(WUState stateenum)
    {
        this.state = stateenum;
        return this;
    }

    /**
     * Sets the start date.
     *
     * @param date
     *            - the start date for which workunits will be retrieved.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setStartDate(Date date)
    {
        this.startDate = date;
        return this;
    }

    /**
     * Sets the end date.
     *
     * @param date
     *            - the end date for which workunits will be retrieved.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setEndDate(Date date)
    {
        this.endDate = date;
        return this;
    }

    /**
     * Sets the archived.
     *
     * @param b
     *            - if true, only archived workunits will be returned. if false or null, only unarchived workunits will be
     *            returned.
     * @return the WU query wrapper
     */
    public WUQueryWrapper setArchived(Boolean b)
    {
        this.archived = b;
        return this;
    }

    /**
     * Gets the start date.
     *
     * @return the start date for which workunits will be retrieved.
     */
    public Date getStartDate()
    {
        return startDate;
    }

    /**
     * Validate.
     *
     * @throws Exception
     *             the exception
     */
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
     * Gets the raw.
     *
     * @return the raw WUQuery object
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery getRaw()
    {
        return getRawLatestVersion();
    }

    /**
     * Gets the latest raw.
     *
     * @return the latest raw
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery getRawLatestVersion()
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery raw = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.WUQuery();
        if (applicationValues.size() > 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue[] appvalues = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue[applicationValues.size()];
            org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue arrayofappvalues = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ArrayOfApplicationValue();
            for (int i = 0; i < applicationValues.size(); i++)
            {
                ApplicationValueWrapper wrapped = applicationValues.get(i);
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue item = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.latest.ApplicationValue();
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

    /**
     * Gets the raw 156.
     *
     * @param appvalue
     *            the appvalue
     * @return the raw 156
     * @throws Exception
     *             the exception
     */
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

            ArrayOfApplicationValue applications = new ArrayOfApplicationValue();
            for (ApplicationValueWrapper applicationValue : applicationValues)
            {
                org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ApplicationValue apv = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.ApplicationValue();
                apv.setApplication(applicationValue.getApplication());
                apv.setName(applicationValue.getName());
                apv.setValue(applicationValue.getValue());
                applications.addApplicationValue(apv);
            }
            raw.setApplicationValues(applications);
        }
        return raw;
    }
}
