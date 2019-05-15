package org.hpccsystems.ws.client;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis.client.Stub;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActionResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUArrayActions;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUBrowseDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileAccessV2Request;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileCreateV2Request;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFilePublishResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUFileViewResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetDataColumnsResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUGetFileMetaDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUInfoResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUQueryResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.DFUSearchDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.EspException;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.SuperfileListResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuLocator;
import org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DFUDataColumnInfo;
import org.hpccsystems.ws.client.platform.DFUFileDetailInfo;
import org.hpccsystems.ws.client.platform.DFULogicalFileInfo;
import org.hpccsystems.ws.client.platform.DFUResult;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.WsDFUClientSoapProxyWrapper;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Provides soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFUClient extends DataSingleton
{
    private static URL originalURL;
    private static final Logger log = Logger.getLogger(HPCCWsDFUClient.class.getName());

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null) originalURL = new URL(getOriginalWSDLURL());

        return originalURL;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        return getOriginalURL().getPort();
    }

    public static HPCCWsDFUClient get(Connection connection)
    {
        return new HPCCWsDFUClient(connection);
    }

    private String                initErrMessage        = "";
    private Version               targetVersion         = null;
    public static final String    WSDFUURI              = "/WsDFU";
    public static final String    ROW_ELEMENT           = "Row";
    public static final String    DATASET_ELEMENT       = "Dataset";
    private WsDfuServiceSoapProxy wsDfuServiceSoapProxy = null;
    private boolean               verbose               = false;
    private WsDFUClientSoapProxyWrapper soapproxywrapper = null;

    /**
     * Should be called after instantiation to confirm
     * Successful initialization.
     *
     * The client init can fail due to many different types of issues
     * including invalid connectivity options, invalid credentials, etc
     *
     * @return
     */
    public boolean hasInitError()
    {
        return !initErrMessage.isEmpty();
    }

    /**
     * Returns error message encountered during initialization of wsdfuclient.
     * Empty string if no error encountered
     * @return
     */
    public String getInitError()
    {
        return initErrMessage;
    }
    /**
     * @param verbose
     *            - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for HPCCWsDFUClient which can be used to access the web service methods directly
     *
     * @return soapproxy for HPCCWsDFUClient
     * @throws Exception
     */
    public WsDfuServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsDfuServiceSoapProxy != null)
        {
            return wsDfuServiceSoapProxy;
        }
        else
        {
            throw new Exception("wsDfuServiceSoapProxy not available.");
        }
    }

    /**
     * @param logicalname
     *            - logical file to get file info for, can start with '~' or not
     * @param clustername
     *            - Optional. If specified, the cluster on which to search for the file
     * @return a DFUInfoResponse object containing the file info
     * @throws Exception
     */
    public DFUInfoResponse getFileInfo(String logicalname, String clustername) throws Exception
    {
      return this.getFileInfo(logicalname,  clustername, false, false);
    }
    /**
     *
     * @param logicalname logical file name, can start with ~
     * @param clustername optional, if specified the cluster name used in the search
     * @param jsonTypeInfo want record structure information returned as JSON
     * @param binTypeInfo want record structure information returned in binary format
     * @return
     * @throws Exception
     */
    public DFUInfoResponse getFileInfo(String logicalname, String clustername, boolean jsonTypeInfo, boolean binTypeInfo) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUInfoRequest req = new DFUInfoRequest();
        req.setName(logicalname);
        req.setIncludeBinTypeInfo(binTypeInfo);
        req.setIncludeJsonTypeInfo(jsonTypeInfo);
        if (clustername != null)
        {
            req.setCluster(clustername);
        }
        try
        {
            DFUInfoResponse resp = proxy.DFUInfo(req);
            if (resp == null)
            {
                throw new FileNotFoundException(logicalname + " does not exist");
            }
            this.handleException(resp.getExceptions());
            return resp;
        }
        catch (ArrayOfEspException e)
        {
            if (e != null)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving file type for file: " + espexception.getSource() + espexception.getMessage());
                }
            }
            throw e;
        }

    }

    /**
     * @param logicalname
     *            - logical file to retrieve data for
     * @param beginrow
     *            - beginning row to retrieve data from
     * @param numrows
     *            - number of rows of data to retrieve
     * @param clustername
     *            - Optional. If specified, the cluster on which to find the logical file.
     * @return an XML Element object holding the '<Row>' elements containing data.
     * @throws Exception
     */
    public NodeList getFileData(String logicalname, Long beginrow, Integer numrows, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUBrowseDataRequest req = new DFUBrowseDataRequest();
        req.setLogicalName(logicalname);
        if (clustername != null)
        {
            req.setCluster(clustername);
        }
        if (beginrow == null)
        {
            beginrow = (long) 0;
        }
        if (numrows == null)
        {
            numrows = 1;
        }
        req.setStart(beginrow);
        req.setCount(numrows);

        try
        {

            DFUBrowseDataResponse resp = proxy.DFUBrowseData(req);
            if (resp == null)
            {
                return null;
            }
            this.handleException(resp.getExceptions());
            String xmlresult = resp.getResult();
            if (!xmlresult.contains("<" + DATASET_ELEMENT))
            {
                return null;
            }
            xmlresult = xmlresult.substring(xmlresult.indexOf("<" + DATASET_ELEMENT));
            try
            {
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document dom = db.parse(new ByteArrayInputStream(xmlresult.getBytes()));
                NodeList ds = dom.getDocumentElement().getChildNodes();
                if (ds != null && ds.getLength() > 0)
                {
                    return ds;
                }
            }
            catch (Exception e)
            {
                return null;
            }
            return null;
        }
        catch (ArrayOfEspException e)
        {
            if (e != null)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving file type for file: " + espexception.getSource()+ espexception.getMessage());
                }
            }
            throw e;
        }
    }

    /**
     * @param scope
     *            - file scope/directory to return files for
     * @return an array of DFULogicalFile objects
     * @throws Exception
     */
    public List<DFULogicalFileInfo> getFiles(String scope) throws Exception
    {
        List<DFULogicalFileInfo> result = new ArrayList<DFULogicalFileInfo>();
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUFileViewRequest params = new DFUFileViewRequest();
        params.setScope(scope);
        DFUFileViewResponse resp = proxy.DFUFileView(params);
        if (resp == null)
        {
            return result;
        }
        this.handleException(resp.getExceptions());
        if (resp.getDFULogicalFiles() != null && resp.getDFULogicalFiles().length > 0)
        {
            result = new ArrayList<DFULogicalFileInfo>();
            for (int i = 0; i < resp.getDFULogicalFiles().length; i++)
            {
                result.add(new DFULogicalFileInfo(resp.getDFULogicalFiles()[i]));
            }
        }
        return result;

    }

    private void checkSuperfileLayouts(String[] subfiles, String cluster) throws Exception
    {
        String eclrecord = null;
        String basefile = null;
        if (subfiles == null)
        {
            return;
        }
        for (int i = 0; i < subfiles.length; i++)
        {
            DFUInfoResponse details = this.getFileInfo(subfiles[i], cluster);
            if (details == null || details.getFileDetail() == null)
            {
                continue;
            }
            String thisecl = details.getFileDetail().getEcl() == null ? "" : details.getFileDetail().getEcl();
            if (eclrecord == null)
            {
                basefile = subfiles[i];
                eclrecord = thisecl;
            }
            if (!thisecl.equals(eclrecord))
            {
                throw new Exception(
                        basefile + " and " + subfiles[i] + " have different ecl layouts in the same superfile");
            }
        }
    }

    /**
     * Use this function to retrieve file metadata such as column information, for superfiles the metadata from the
     * first subfile will be returned.
     *
     * @param logicalname
     *            - Logical filename.
     * @param clustername
     *            - Optional - The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumnInfo
     * @throws Exception
     */
    public List<DFUDataColumnInfo> getFileMetaDataInfo(String logicalname, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();

        List<DFUDataColumnInfo> cols = new ArrayList<DFUDataColumnInfo>();
        String eclrecord = null;
        // getFileMetadata fails for superfiles; use first subfile to retrieve record structure if this is the case
        // also retrieve ecl to extract extra information (xpath, maxlength) not in getFileMetadata
        try
        {
            DFUInfoResponse details = this.getFileInfo(logicalname, clustername);
            if (details != null && details.getFileDetail() != null)
            {
                eclrecord = details.getFileDetail().getEcl();
                if (details.getFileDetail().getIsSuperfile())
                {
                    SuperfileListRequest sar = new SuperfileListRequest();
                    sar.setSuperfile(logicalname);
                    SuperfileListResponse sresp = this.getSoapProxy().superfileList(sar);

                    // this throws an exception if different layouts exist in a superfile;
                    checkSuperfileLayouts(sresp.getSubfiles(), clustername);

                    if (sresp != null && sresp.getSubfiles() != null && sresp.getSubfiles().length > 0)
                    {
                        logicalname = sresp.getSubfiles()[0];
                    }
                    else
                    {
                        throw new Exception(
                                logicalname + " is a superfile with no subfiles, cannot determine file structure");
                    }
                }
            }
        }
        catch (Exception e)
        {
            String msg = "Error calling DFUInfo for " + logicalname + ":" + e.getMessage();
            log.error(msg);
            throw new Exception(msg, e);
        }
        try
        {
            DFUGetFileMetaDataRequest req = new DFUGetFileMetaDataRequest();
            req.setLogicalFileName(logicalname);

            if (clustername != null)
            {
                req.setClusterName(clustername);
            }

            DFUGetFileMetaDataResponse resp = proxy.DFUGetFileMetaData(req);
            if (resp != null)
            {
                this.handleException(resp.getExceptions());
            }
            if (resp == null || resp.getDataColumns() == null || resp.getDataColumns().length == 0)
            {
                return cols;
            }
            DFUDataColumn[] datacolumns = resp.getDataColumns();

            for (int i = 0; i < datacolumns.length; i++)
            {
                cols.add(new DFUDataColumnInfo(datacolumns[i]));
            }
        }
        catch (ArrayOfEspException e)
        {
            if (e != null && verbose)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving field names for file: " + espexception.getSource()
                            + espexception.getMessage());
                }
            }
            throw e;
        }

        // attempt to add additional info in from ecl record
        try
        {
            if (eclrecord != null && !StringUtils.isEmpty(eclrecord))
            {
                EclRecordInfo recinfo = DFUFileDetailInfo.getRecordEcl(eclrecord);
                if (recinfo.getParseErrors().size() > 0)
                {
                    throw new Exception(StringUtils.join(recinfo.getParseErrors(), "\n"));
                }
                if (recinfo.getRecordsets().size() > 0 && recinfo.getRecordsets().containsKey(EclRecordInfo.UNNAMED)
                        && recinfo.getRecordsets().get(EclRecordInfo.UNNAMED).getChildColumns().size() == cols.size())
                {
                    for (int i = 0; i < cols.size(); i++)
                    {
                        DFUDataColumnInfo base = cols.get(i);
                        DFUDataColumnInfo extra = recinfo.getRecordsets().get(EclRecordInfo.UNNAMED).getChildColumns()
                                .get(i);
                        if (base.getColumnLabel().equals(extra.getColumnLabel()))
                        {
                            base.setAnnotations(extra.getAnnotations());
                            base.setBlob(extra.isBlob());
                            base.setMaxlength(extra.getMaxlength());
                            base.setMaxcount(extra.getMaxcount());
                            base.setMaxSize(extra.getMaxSize());
                            base.setXmlDefaultVal(extra.getXmlDefaultVal());
                            base.setXpath(extra.getXpath());
                        }
                    }
                }
            }
        }
        catch (Exception e)
        {
            log.error("Could not parse ecl for " + logicalname + ", returning base metadata. Ecl:" + eclrecord);
        }

        return cols;
    }

    /**
     * Deprecated, use getFileMetaDataInfo() Use this function to retrieve file metadata such as column information
     *
     * @param logicalname
     *            - Logical filename.
     * @param clustername
     *            - Optional - The cluster the logical filename is associated with.
     * @return Array of DFUDataColumns
     * @throws Exception
     */
    @Deprecated
    public DFUDataColumn[] getFileMetaData(String logicalname, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUGetFileMetaDataRequest req = new DFUGetFileMetaDataRequest();
        DFUDataColumn[] cols = null;

        req.setLogicalFileName(logicalname);

        if (clustername != null) req.setClusterName(clustername);

        try
        {
            DFUGetFileMetaDataResponse resp = proxy.DFUGetFileMetaData(req);
            if (resp == null) return cols;

            this.handleException(resp.getExceptions());

            cols = resp.getDataColumns();
        }

        catch (ArrayOfEspException e)
        {
            if (e != null && verbose)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving field names for file: " + espexception.getSource()
                            + espexception.getMessage());
                }
            }
            throw e;
        }

        return cols;
    }

    /**
     * @param logicalname
     *            - logical filename to retrieve the dfu data columns for. Currently this method/service call functions
     *            for THOR files but will return nothing for CSV/XML/FLAT data files
     * @param clustername
     *            - optional. The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumns
     * @throws Exception
     */
    public List<DFUDataColumnInfo> getFileDataColumns(String logicalname, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUGetDataColumnsRequest req = new DFUGetDataColumnsRequest();
        List<DFUDataColumnInfo> cols = new ArrayList<DFUDataColumnInfo>();

        req.setOpenLogicalName(logicalname);
        if (clustername != null)
        {
            req.setCluster(clustername);
        }
        try
        {
            DFUGetDataColumnsResponse resp = proxy.DFUGetDataColumns(req);
            if (resp == null)
            {
                return cols;
            }
            this.handleException(resp.getExceptions());

            // one of the few times reflection is more useful then it is confusing
            for (Method m : resp.getClass().getMethods())
            {
                if (m.getName().startsWith("getDFUDataKeyedColumns") && m.getParameterTypes().length == 0)
                {
                    final Object r = m.invoke(resp);
                    if (r != null)
                    {
                        DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                        for (DFUDataColumn col : Arrays.asList(thesecols))
                        {
                            cols.add(new DFUDataColumnInfo(col));
                        }
                    }
                }
                if (m.getName().startsWith("getDFUDataNonKeyedColumns") && m.getParameterTypes().length == 0)
                {
                    final Object r = m.invoke(resp);
                    if (r != null)
                    {
                        DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                        for (DFUDataColumn col : Arrays.asList(thesecols))
                        {
                            cols.add(new DFUDataColumnInfo(col));
                        }
                    }
                }
            }
        }

        catch (ArrayOfEspException e)
        {
            if (e != null && verbose)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving field names for file: " + espexception.getSource()
                            + espexception.getMessage());
                }
            }
            throw e;
        }
        return cols;
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new WsDfuLocator()).getWsDfuServiceSoapAddress();
    }

    /**
     * @param wsDfuServiceSoapProxy
     */
    protected HPCCWsDFUClient(WsDfuServiceSoapProxy wsDfuServiceSoapProxy)
    {
        this.wsDfuServiceSoapProxy = wsDfuServiceSoapProxy;
    }

    /**
     * @param baseConnection
     */
    protected HPCCWsDFUClient(Connection baseConnection)
    {
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(),
                baseConnection.getUserName(), baseConnection.getPassword());
    }

    /**
     * @param protocol
     *            - http or https
     * @param targetHost
     *            server IP/name of the HPCC Cluster
     * @param targetPort
     *            - port of the HPCC Cluster
     * @param user
     *            - username to use when connecting to the HPCC Cluster
     * @param pass
     *            - Password to use when connecting to the HPCC Cluster
     */
    protected HPCCWsDFUClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        try
        {
            initErrMessage = "";
            String address = Connection.buildUrl(protocol, targetHost, targetPort, WSDFUURI);
            HPCCWsSMCClient wssmc = new HPCCWsSMCClient(protocol, targetHost, targetPort, user, pass);
            targetVersion = new Version(wssmc.getHPCCBuild());
            initHPCCWsDFUSoapProxy(address, user, pass);
        }
        catch (Exception e)
        {
            log.error("HPCCWsDFUClient: Could not initialize SoapProxy to WsDFU - Review all HPCC connection values");
            if (!e.getLocalizedMessage().isEmpty())
            {
                initErrMessage = e.getLocalizedMessage();
                log.error("HPCCWsDFUClient: " + e.getLocalizedMessage()) ;
            }
        }
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL
     *            Target service base URL
     * @param user
     *            User credentials
     * @param pass
     *            User credentials
     * @throws Exception
     */
    private void initHPCCWsDFUSoapProxy(String baseURL, String user, String pass) throws Exception
    {
        if (targetVersion != null)
        {
            soapproxywrapper = new WsDFUClientSoapProxyWrapper(baseURL, user, pass, targetVersion);
            wsDfuServiceSoapProxy = soapproxywrapper.get1_51ServiceSoapProxy();
        }
        else
            throw new Exception("Cannot initialize HPCCWsDFUSoapProxy without valid HPCC version object");
    }

    /**
     * This method retrieves a list of columns for a THOR or CSV dataset. -if THOR, this is a straightforward service
     * call to get the columns. -if CSV, depending on whether or not the CSV was sprayed or output by thor, it may or
     * may not - have a record definition associated with it. If it doesn't, the number of fields in the CSV - is
     * calculated by retrieving the first line and splitting it on the separator, and returning - a list of string
     * Field1, Field2, etc. fields (that match the standard CSV field naming conventions.)
     *
     * @param datasetname
     *            - the name of the dataset to get dataset fields for. Can begin with '~' or not.
     * @param clusterName
     *            - optional. If given, the name of the cluster associated with the dataset.
     * @param fieldSeparator
     *            - optional. if given, and if the file being retrieved is a csv file, and if no field definitions exist
     *            for that csv,. this separator will be used rather than the separator defined during spraying when
     *            splitting up the first line of the file to define the number of fields
     * @return an ArrayList of DFUDataColumns containing the name and field type.
     * @throws Exception
     */
    public EclRecordInfo getDatasetFields(String datasetname, String clusterName, String fieldSeparator) throws Exception
    {
        DFUFileDetailInfo info = getFileDetails(datasetname, clusterName);
        if (fieldSeparator != null)
        {
            info.setCsvSeparate(fieldSeparator);
        }
        return info.deduceFields();
    }

    /**
     * Returns the first row of data for a dataset
     *
     * @param datasetname
     *            - logical filename, with or without '~' at the beginning
     * @param clustername
     *            - optional. name of the cluster the file's associated with
     * @return a String of data representing the first row in the file.
     * @throws Exception
     */
    public String getFirstRow(String datasetname, String clustername) throws Exception
    {
        NodeList rowdata = getFileData(datasetname, (long) 0, 1, clustername);
        if (rowdata != null && rowdata.getLength() > 0)
        {
            if (rowdata.item(0).hasChildNodes())
            {
                return rowdata.item(0).getFirstChild().getTextContent();
            }
            else
            {
                return rowdata.item(0).getTextContent();
            }
        }
        return null;
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exp, String message) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            String errs = message != null ? message + "\n" : "";
            if (!errs.isEmpty())
                log.error(errs);

            for (int i = 0; i < exp.getException().length; i++)
            {
                org.hpccsystems.ws.client.gen.wsdfu.v1_51.EspException ex = exp.getException()[i];
                if (ex.getMessage() != null)
                {
                    errs = errs + ex.getMessage() + "\n";
                }
                log.error("Source: " + ex.getSource() + " Message: " + ex.getMessage());
            }
            throw new Exception(errs, exp);
        }
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_51.ArrayOfEspException exp) throws Exception
    {
        handleException(exp, null);
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException exp, String message) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            String errs = message != null ? message + "\n" : "";
            if (!errs.isEmpty())
                log.error(errs);

            for (int i = 0; i < exp.getException().length; i++)
            {
                org.hpccsystems.ws.client.gen.wsdfu.v1_50.EspException ex = exp.getException()[i];
                if (ex.getMessage() != null)
                {
                    errs = errs + ex.getMessage() + "\n";
                }
                log.error("Source: " + ex.getSource() + " Message: " + ex.getMessage());
            }
            throw new Exception(errs, exp);
        }
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_50.ArrayOfEspException exp) throws Exception
    {
        handleException(exp, null);
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException exp, String message) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            String errs = message != null ? message + "\n" : "";
            if (!errs.isEmpty())
                log.error(errs);

            for (int i = 0; i < exp.getException().length; i++)
            {
                org.hpccsystems.ws.client.gen.wsdfu.v1_39.EspException ex = exp.getException()[i];
                if (ex.getMessage() != null)
                {
                    errs = errs + ex.getMessage() + "\n";
                }
                log.error("Source: " + ex.getSource() + " Message: " + ex.getMessage());
            }

            throw new Exception(errs, exp);
        }
    }

    private void handleException(org.hpccsystems.ws.client.gen.wsdfu.v1_39.ArrayOfEspException exp) throws Exception
    {
        handleException(exp, null);
    }
    /**
     * Get array of logical files on target HPCC system based on input parameters
     *
     * @param filename
     * @param cluster
     *            --- NO LONGER USED ---
     * @param firstN
     * @param pageStartFrom
     * @param pageSize
     * @return
     * @throws Exception
     */
    public List<DFULogicalFileInfo> getLogicalFiles(String filename, String cluster, int firstN, int pageStartFrom,
            int pageSize) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();

        List<DFULogicalFileInfo> logicalfiles = new ArrayList<DFULogicalFileInfo>();
        DFUQueryRequest request = new DFUQueryRequest();
        if (filename != null) request.setLogicalName(filename);
        request.setFirstN(firstN);
        request.setPageStartFrom(pageStartFrom);
        request.setPageSize(pageSize);

        DFUQueryResponse response = proxy.DFUQuery(request);
        if (response != null && response.getDFULogicalFiles() != null)
        {
            for (int i = 0; i < response.getDFULogicalFiles().length; i++)
            {
                logicalfiles.add(new DFULogicalFileInfo(response.getDFULogicalFiles()[i]));
            }
        }

        return logicalfiles;
    }

    /**
     * Return raw response from WsDFU DFUSearchData method requests
     *
     * @param openLogicalName
     * @param cluster
     * @param roxieSelections
     * @param chooseFile
     * @param count
     * @param schemaOnly
     * @param startIndex
     * @return
     * @throws Exception
     */
    public DFUSearchDataResponse getDFUData(String openLogicalName, String cluster, boolean roxieSelections,
            int chooseFile, int count, boolean schemaOnly, long startIndex) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();

        DFUSearchDataRequest dfuSearchDataRequest = new DFUSearchDataRequest();
        dfuSearchDataRequest.setOpenLogicalName(openLogicalName);
        dfuSearchDataRequest.setCluster(cluster);
        dfuSearchDataRequest.setRoxieSelections(roxieSelections);
        dfuSearchDataRequest.setChooseFile(chooseFile);
        dfuSearchDataRequest.setCount(count);
        dfuSearchDataRequest.setSchemaOnly(schemaOnly);
        dfuSearchDataRequest.setStartIndex(startIndex);

        return proxy.DFUSearchData(dfuSearchDataRequest);
    }

    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof HPCCWsDFUClient))
        {
            return false;
        }

        HPCCWsDFUClient that = (HPCCWsDFUClient) aThat;
        WsDfuServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch (Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsDfuServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint())
                && EqualsUtil.areEqual(((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getUsername(),
                        ((Stub) thatSoapProxy.getWsDfuServiceSoap()).getUsername())
                && EqualsUtil.areEqual(((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getPassword(),
                        ((Stub) thatSoapProxy.getWsDfuServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsDfuServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getPassword());
        return result;
    }

    /**
     * @param files
     *            - list of filenames to delete
     * @param cluster
     *            - name of cluster to delete from (will delete from all clusters if null)
     * @return list of results of file deletions
     * @throws Exception
     */
    public List<DFUResult> deleteFiles(Set<String> files, String cluster) throws Exception
    {
        DFUArrayActionRequest params = new DFUArrayActionRequest();
        params.setType(DFUArrayActions.fromString("Delete"));
        final String[] filesArray = files.toArray(new String[files.size()]);
        params.setLogicalFiles(filesArray);

        DFUArrayActionResponse resp = getSoapProxy().DFUArrayAction(params);
        handleException(resp.getExceptions());
        List<DFUResult> results = new ArrayList<DFUResult>();
        if (resp.getActionResults() == null)
        {
            return results;
        }
        for (int i = 0; i < resp.getActionResults().length; i++)
        {
            results.add(new DFUResult(resp.getActionResults()[i]));
        }
        return results;

    }

    /**
     * searchFiles
     *
     * @param logicalFilename
     *            - the filename to search for
     * @param cluster
     *            - the cluster to search on
     * @return - true if the file exists on the specified cluster (or on any cluster if the input cluster is null),
     *         false otherwise
     * @throws Exception
     */
    public List<DFULogicalFileInfo> searchFiles(String logicalFilename, String cluster) throws Exception
    {
        if (logicalFilename != null && logicalFilename.startsWith("~"))
        {
            logicalFilename = logicalFilename.substring(1);
        }
        DFUQueryRequest req = new DFUQueryRequest();
        req.setNodeGroup(cluster);
        req.setLogicalName(logicalFilename);

        DFUQueryResponse resp = getSoapProxy().DFUQuery(req);
        handleException(resp.getExceptions());
        List<DFULogicalFileInfo> result = new ArrayList<DFULogicalFileInfo>();
        if (resp.getDFULogicalFiles() != null && resp.getDFULogicalFiles().length > 0)
        {
            for (int i = 0; i < resp.getDFULogicalFiles().length; i++)
            {
                result.add(new DFULogicalFileInfo(resp.getDFULogicalFiles()[i]));
            }
        }
        return result;
    }

    /**
     * getFileAccessBlob - HPCC 7.0.x version
     * The response is to be used in conjunction with DAFILESRV's rowservice distributed file read stream.
     * The response grants the holder access to the target file for the duration of 'expiryseconds' seconds
     * since the Accessblob is generated.
     *
     * This version is to be used when targeting a 7.0.x HPCC (ESP and DAFILESRV)
     *
     * @param accesstype
     *            - the file access level to request to request
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws Exception
     */
    public String getFileAccessBlob(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType accesstype, String filename, String clustername, int expiryseconds, String jobid) throws Exception
    {
        if (targetVersion == null || wsDfuServiceSoapProxy == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            DFUFileAccessInfoWrapper fileaccessinfo = getFileAccess(accesstype, filename, clustername, expiryseconds, jobid, false, false, false);
            if (fileaccessinfo == null )
                throw new Exception("Could not acquire file access for '" + filename + "' on cluster: '" + clustername + "'");

            return fileaccessinfo.getFileAccessInfoBlob();
        }
        else if (targetVersion.major == 7 && targetVersion.minor > 0)
        {
            return getFileAccessBlob(filename, clustername, expiryseconds, jobid);
        }
        else
            throw new Exception("File access not supported in HPCC version: " + targetVersion.major + "." + targetVersion.minor + ".x");
    }

    /**
     * getFileAccessBlob
     * The response is to be used in conjunction with DAFILESRV's rowservice distributed file read/write stream.
     * The response grants the holder access to the target file for the duration of 'expiryseconds' seconds
     * since the Accessblob is generated.
     *
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws Exception
     */
    public String getFileAccessBlob(String filename, String clustername, int expiryseconds, String jobid) throws Exception
    {
        if (targetVersion == null || wsDfuServiceSoapProxy == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor > 0)
        {
            DFUFileAccessInfoWrapper fileaccessinfo = getFileAccess(filename, clustername, expiryseconds, jobid);
            if (fileaccessinfo == null )
                throw new Exception("Could not acquire file access for '" + filename + "' on cluster: '" + clustername + "'");

            return fileaccessinfo.getFileAccessInfoBlob();
        }
        else if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            return getFileAccessBlob(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType.Full, filename, clustername, expiryseconds, jobid);
        }
        else
            throw new Exception("File access blob not supported in HPCC version: " + targetVersion.major + "." + targetVersion.minor + ".x");
    }

    /**
     * To be used in conjunction with DAFILESRV's rowservice distributed file read stream.
     * The response wrapper provides access to the 'accessblob' which grants the holder read access
     * to the target file for the duration of 'expiryseconds' seconds. Other access details can be
     * fetched from the wrapper.
     *
     * since the Accessblob is generated.
     * @param accesstype HPCC 7.0.x version
     *            - the file access level to request to request
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @param includejsonTypeInfo
     *            - flag to request file info in JSON format
     * @param includebinTypeInfo
     *            - flag to request file info in Binary format
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws Exception
     */
    public DFUFileAccessInfoWrapper getFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType accesstype, String filename, String clustername, int expiryseconds, String jobid, boolean includejsonTypeInfo, boolean includebinTypeInfo, boolean requestfileinfo) throws Exception
    {
        if (targetVersion == null || soapproxywrapper == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoapProxy soapproxy = soapproxywrapper.get1_39ServiceSoapProxy();

            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequest req = new org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequest();
            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequestBase requestBase = new org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequestBase();

            requestBase.setAccessRole(requestfileinfo ? org.hpccsystems.ws.client.gen.wsdfu.v1_39.FileAccessRole.External : org.hpccsystems.ws.client.gen.wsdfu.v1_39.FileAccessRole.Token);
            requestBase.setAccessType(accesstype);
            requestBase.setCluster(clustername);
            requestBase.setExpirySeconds(expiryseconds);
            requestBase.setJobId(jobid);
            requestBase.setName(filename);
            requestBase.setReturnBinTypeInfo(includebinTypeInfo);
            requestBase.setReturnJsonTypeInfo(includejsonTypeInfo);

            req.setRequestBase(requestBase);

            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessResponse resp = soapproxy.DFUFileAccess(req);
            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileAccess response");
            }

            this.handleException(resp.getExceptions(), "Error acquiring read access for: '" + clustername + "::" + filename + "'");
            return new DFUFileAccessInfoWrapper(resp.getAccessInfo());
        }
        else if (targetVersion.major == 7 && targetVersion.minor > 0)
        {
            return getFileAccess(filename, clustername, expiryseconds, jobid);
        }
        else
            throw new Exception("WSDFU getFileAccess not available on HPCC v" + targetVersion.major + "." + targetVersion.minor);
    }

    /**
     * To be used in conjunction with DAFILESRV's rowservice distributed file read/write stream.
     * The response wrapper provides access to the 'accessblob' which grants the holder read access
     * to the target file for the duration of 'expiryseconds' seconds. Other access details can be
     * fetched from the wrapper.
     *
     * @param filename
     *            - the name of the target file to be accessed
     * @param clustername
     *            - the name of the target file's HPCC cluster (can be empty)
     * @param expiryseconds
     *            - the number of seconds file access is granted
     * @param jobid
     *            - unique identifier for access token
     * @return - Access artifact to be propagated as part of DAFILESERV file access requests
     * @throws Exception
     */
    public DFUFileAccessInfoWrapper getFileAccess(String filename, String clustername, int expiryseconds, String jobid) throws Exception
    {
        if (targetVersion == null || soapproxywrapper == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor > 0)
        {
            WsDfuServiceSoapProxy proxy = getSoapProxy();
            DFUFileAccessV2Request req = new DFUFileAccessV2Request();
            req.setCluster(clustername);
            req.setExpirySeconds(expiryseconds);
            req.setRequestId(jobid);
            req.setName(filename);
            req.setReturnTextResponse(true);

            DFUFileAccessResponse resp = proxy.DFUFileAccessV2(req);
            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileAccess response");
            }

            this.handleException(resp.getExceptions(), "Error acquiring read access for: '" + clustername + "::" + filename + "'");
            return new DFUFileAccessInfoWrapper(resp.getAccessInfo(), resp.getType());
        }
        else if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            return getFileAccess(org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType.Read, filename, clustername, expiryseconds, jobid, true, false, true);
        }
        else
            throw new Exception("WSDFU getFileAccess not available on HPCC v" + targetVersion.major + "." + targetVersion.minor);
    }


    /**
     * Create a new (unpublished) dfu file. Does not request all file metadata.
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param partitionHostMap Array declaring the Filepart[i] to Node mapping
     * @param expirySeconds
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, String[] partitionHostMap, int expirySeconds) throws Exception
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, partitionHostMap, expirySeconds, false, false,
                org.hpccsystems.ws.client.gen.wsdfu.v1_39.FileAccessRole.External, org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType.Write);
    }

    /**
     * Create a new (unpublished) dfu file. All file metadata can be requested.
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param partitionHostMap  Array declaring the Filepart[i] to Node mapping
     * @param expirySeconds
     * @param returnBinTypeInfo
     * @param returnJsonTypeInfo
     * @param accessRole
     * @param accessType
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFileAndAcquireAccess(String fileName, String cluster, String eclRecordDefinition, String[] partitionHostMap, int expirySeconds, Boolean returnBinTypeInfo,
            Boolean returnJsonTypeInfo, org.hpccsystems.ws.client.gen.wsdfu.v1_39.FileAccessRole accessRole, org.hpccsystems.ws.client.gen.wsdfu.v1_39.SecAccessType accessType) throws Exception
    {
        if (targetVersion == null || soapproxywrapper == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoapProxy soapproxy = soapproxywrapper.get1_39ServiceSoapProxy();
            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCreateRequest filecreatereq = new org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCreateRequest();
            filecreatereq.setECLRecordDefinition(eclRecordDefinition);
            filecreatereq.setPartLocations(partitionHostMap);
            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequestBase requestBase = new org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileAccessRequestBase();
            requestBase.setCluster(cluster);
            requestBase.setExpirySeconds(expirySeconds);
            requestBase.setName(fileName);
            requestBase.setReturnBinTypeInfo(returnBinTypeInfo);
            requestBase.setReturnJsonTypeInfo(returnJsonTypeInfo);
            requestBase.setAccessRole(accessRole);
            requestBase.setAccessType(accessType);

            filecreatereq.setRequestBase(requestBase);

            org.hpccsystems.ws.client.gen.wsdfu.v1_39.DFUFileCreateResponse resp = soapproxy.DFUFileCreate(filecreatereq);
            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileCreateResponse response");
            }

            this.handleException(resp.getExceptions(), "Error creating DFU file: '" + cluster + "::" + fileName + "'");
            return new DFUCreateFileWrapper (resp);
        }
        else if (targetVersion.major > 7 || targetVersion.major == 7 && targetVersion.minor > 0)
        {
            return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, null, null, null);
        }
        else
            throw new Exception("WSDFU File Create not available on HPCC v" + targetVersion.major + "." + targetVersion.minor);
    }

    /**
     * Create a new (unpublished), uncompressed dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     *
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param expirySeconds
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds) throws Exception
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, false, null, null);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC post 7.2.0
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param expirySeconds
     * @param compressed
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds, Boolean compressed) throws Exception
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, compressed, null, null);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC  post 7.2.0
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param expirySeconds
     * @param compressed
     * @param filetype - for example DFUFileTypeWrapper.Csv
     * @param requestid
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFile(String fileName, String cluster, String eclRecordDefinition, int expirySeconds, Boolean compressed, DFUFileTypeWrapper filetype, String requestid) throws Exception
    {
        return createFileAndAcquireAccess(fileName, cluster, eclRecordDefinition, expirySeconds, compressed, filetype, requestid);
    }

    /**
     * Create a new (unpublished) dfu file. JSON based info will be requested -- appropriate for HPCC  post 7.2.0
     * DAFILESERV fileaccess token is requested
     * @param fileName
     * @param cluster
     * @param eclRecordDefinition
     * @param expirySeconds
     * @param compressed
     * @param type - for example DFUFileTypeWrapper.Csv
     * @param requestId
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFileAndAcquireAccess(String fileName, String cluster, String eclRecordDefinition, int expirySeconds, Boolean compressed, DFUFileTypeWrapper type, String requestId) throws Exception
    {
        if (targetVersion == null || wsDfuServiceSoapProxy == null)
            throw new Exception("WSDFU client not available" + (hasInitError()  ? " - " +  initErrMessage : ""));

        if (targetVersion.major > 7 || targetVersion.major == 7 && targetVersion.minor > 0)
        {
            WsDfuServiceSoapProxy proxy = getSoapProxy();
            DFUFileCreateV2Request filecreatereq = new DFUFileCreateV2Request();
            filecreatereq.setECLRecordDefinition(eclRecordDefinition);
            filecreatereq.setCluster(cluster);
            filecreatereq.setExpirySeconds(expirySeconds);
            filecreatereq.setName(fileName);
            filecreatereq.setReturnTextResponse(true);
            if (compressed != null)
                filecreatereq.setCompressed(compressed);
            if (type != null)
                filecreatereq.setType(type);
            if (requestId != null)
                filecreatereq.setRequestId(requestId);

            DFUFileCreateResponse resp = proxy.DFUFileCreateV2(filecreatereq);
            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileCreateResponse");
            }

            this.handleException(resp.getExceptions(), "Error creating DFU file: '" + cluster + "::" + fileName + "'");
            if (resp.getFileId() == null)
            {
                throw new Exception("Invalid DFUFileCreateResponse. FildId is null.");
            }

            return new DFUCreateFileWrapper (resp);
        }
        else if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            throw new Exception("Must provide filepart mapping via createFileAndAcquireAccess() when targeting HPCC v" + targetVersion.major + "." + targetVersion.minor);
        }
        else
            throw new Exception("WSDFU File Create not available on HPCC v" + targetVersion.major + "." + targetVersion.minor);

    }

    /**
     * Publishes file created by WsDFUCreateFile. Requires fileId returned from createfile method call
     * @param fileId
     * @param eclRecordDefinition
     * @param totalRecords
     * @param fileSize
     * @throws Exception
     */
    public void publishFile(String fileId, String eclRecordDefinition, long totalRecords, long fileSize) throws Exception
    {
        publishFile(fileId, eclRecordDefinition, totalRecords, fileSize, null);
    }
    /**
     * Publishes file created by WsDFUCreateFile. Requires fileId returned from createfile method call
     * @param fileId
     * @param eclRecordDefinition
     * @param totalRecords
     * @param fileSize
     * @param overwrite
     * @throws Exception
     */
    public void publishFile(String fileId, String eclRecordDefinition, long totalRecords, long fileSize, Boolean overwrite) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUFilePublishRequest req = new DFUFilePublishRequest();
        req.setECLRecordDefinition(eclRecordDefinition);
        req.setFileId(fileId);
        req.setFileSize(fileSize);
        req.setRecordCount(totalRecords);
        if (overwrite != null)
            req.setOverwrite(overwrite);

        try
        {
            DFUFilePublishResponse resp = proxy.DFUFilePublish(req);

            if (resp == null)
            {
                throw new Exception("Did not receive DFUFileCreateResponse response");
            }

            this.handleException(resp.getExceptions());

            return;
        }
        catch (ArrayOfEspException e)
        {
            if (e != null)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error publishing DFU file: '" + fileId + "' \n" + espexception.getSource() + espexception.getMessage());
                }
            }
            throw e;
        }
    }

    /**
     * @param logicalname
     *            - logical file to get file info for, can start with '~' or not
     * @param clustername
     *            - Optional. If specified, the cluster on which to search for the file
     * @return a DFUInfoResponse object containing the file info
     * @throws Exception
     */
    public DFUFileDetailInfo getFileDetails(String logicalname, String clustername) throws Exception
    {
      return this.getFileDetails(logicalname,  clustername, false, false);
    }
    /**
     *
     * @param logicalname logical file for request, can start with ~
     * @param clustername optional
     * @param jsonTypeInfo true if record structure information in JSON format is to be returned
     * @param binTypeInfo true if record structure information in binary format is to be returned
     * @return DFUInfoResponse object containing the information
     * @throws Exception
     */
    public DFUFileDetailInfo getFileDetails(String logicalname, String clustername, boolean jsonTypeInfo, boolean binTypeInfo) throws Exception
    {
        try
        {
            DFUInfoResponse resp = this.getFileInfo(logicalname, clustername, jsonTypeInfo, binTypeInfo);
            if (resp == null)
            {
                throw new FileNotFoundException(logicalname + " does not exist");
            }
            this.handleException(resp.getExceptions());
            DFUFileDetailInfo info = new DFUFileDetailInfo(resp.getFileDetail());
            try
            {
                info.setFirstline(this.getFirstRow(logicalname, clustername));
            }
            catch (Exception e)
            {
                // error logged in getFirstRow, no need to log here
                info.setFirstline("");
            }
            if (info.getFilename() != null)
            {
                try
                {
                    info.setColumns(getFileMetaDataInfo(logicalname, clustername));
                }
                catch (ArrayOfEspException e)
                {
                    if (e.getException().length > 0 && e.getException(0).getMessage() != null
                            && e.getException(0).getMessage().contains("not available in service WsDfu"))
                    {
                        // for clusters on version < 5.0.2, this service doesn't exist; do it the old fashioned way
                        info.setColumns(this.getFileDataColumns(logicalname, clustername));
                    }
                }
            }
            if ((info.getEcl() == null || info.getEcl().isEmpty()) && info.getIsSuperfile() && info.getSubfiles() != null && info.getSubfiles().length != 0)
            {
                DFUFileDetailInfo subfile = this.getFileDetails(info.getSubfiles()[0], info.getNodeGroup());
                if (subfile != null)
                {
                    info.setEcl(subfile.getEcl());
                    info.setColumns(subfile.getColumns());
                    info.setContentType(subfile.getContentType());
                    info.setFormat(subfile.getFormat());
                }
            }
            return info;
        }
        catch (ArrayOfEspException e)
        {
            if (e != null)
            {
                for (EspException espexception : e.getException())
                {
                    log.error("Error retrieving file type for file: " + logicalname + ": "
                            + espexception.getSource() + espexception.getMessage());
                }
            }
            throw e;
        }
    }
}
