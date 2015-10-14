package org.hpccsystems.ws.client;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.ArrayOfEspException;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUBrowseDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUBrowseDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUDataColumn;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUFileViewRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUFileViewResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUGetDataColumnsRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUGetDataColumnsResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUGetFileMetaDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUGetFileMetaDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUInfoRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUInfoResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFULogicalFile;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUQueryRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUQueryResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUSearchDataRequest;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.DFUSearchDataResponse;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.EspException;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.WsDfuLocator;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.WsDfuServiceSoap;
import org.hpccsystems.ws.client.gen.wsdfu.v1_29.WsDfuServiceSoapProxy;
import org.hpccsystems.ws.client.platform.DFUDataColumnInfo;
import org.hpccsystems.ws.client.platform.DFUFileDetailInfo;
import org.hpccsystems.ws.client.platform.DataSingleton;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Use as soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFUClient extends DataSingleton
{
    private static URL                  originalURL;

    public static URL getOriginalURL() throws MalformedURLException
    {
        if (originalURL == null)
            originalURL = new URL(getOriginalWSDLURL());

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

    public static final String    WSDFUURI              = "/WsDFU";
    public static final String    ROW_ELEMENT           = "Row";
    public static final String    DATASET_ELEMENT       = "Dataset";
    private WsDfuServiceSoapProxy wsDfuServiceSoapProxy = null;
    private boolean               verbose               = false;

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
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUInfoRequest req = new DFUInfoRequest();
        req.setName(logicalname);
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
                    Utils.println(System.out, "Error retrieving file type for file: " + espexception.getSource()
                            + espexception.getMessage(), false, true);
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
     * @return an XML Element object holding the <Row> elements containing data.
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
                    Utils.println(System.out, "Error retrieving file type for file: " + espexception.getSource()
                            + espexception.getMessage(), false, true);
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
    public DFULogicalFile[] getFiles(String scope) throws Exception
    {
        DFULogicalFile[] result = null;
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUFileViewRequest params = new DFUFileViewRequest();
        params.setScope(scope);
        DFUFileViewResponse resp = proxy.DFUFileView(params);
        if (resp == null)
        {
            return result;
        }
        this.handleException(resp.getExceptions());
        result = resp.getDFULogicalFiles();
        return result;

    }

    /**
     * Use this function to retrieve file metadata such as column information
     * @param logicalname    - Logical filename.
     * @param clustername    - Optional - The cluster the logical filename is associated with.
     * @return Array of DFUDataColumns
     * @throws Exception
     */
    public DFUDataColumn[] getFileMetaData(String logicalname, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUGetFileMetaDataRequest req = new DFUGetFileMetaDataRequest();
        DFUDataColumn[] cols = null;

        req.setLogicalFileName(logicalname);

        if (clustername != null)
            req.setClusterName(clustername);

        try
        {
            DFUGetFileMetaDataResponse resp = proxy.DFUGetFileMetaData(req);
            if (resp == null)
                return cols;

            this.handleException(resp.getExceptions());

            cols = resp.getDataColumns();
        }

        catch (ArrayOfEspException e)
        {
            if (e != null && verbose)
            {
                for (EspException espexception : e.getException())
                {
                    Utils.println(System.out, "Error retrieving field names for file: " + espexception.getSource()
                            + espexception.getMessage(), false, true);
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
    public ArrayList<DFUDataColumn> getFileDataColumns(String logicalname, String clustername) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();
        DFUGetDataColumnsRequest req = new DFUGetDataColumnsRequest();
        ArrayList<DFUDataColumn> cols = new ArrayList<DFUDataColumn>();

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
                    DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                    if (r != null)
                    {
                        cols.addAll(Arrays.asList(thesecols));
                    }
                }
                if (m.getName().startsWith("getDFUDataNonKeyedColumns") && m.getParameterTypes().length == 0)
                {
                    final Object r = m.invoke(resp);
                    DFUDataColumn[] thesecols = (DFUDataColumn[]) r;
                    if (r != null)
                    {
                        cols.addAll(Arrays.asList(thesecols));
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
                    Utils.println(System.out, "Error retrieving field names for file: " + espexception.getSource()
                            + espexception.getMessage(), false, true);
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
        this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection
                .getUserName(), baseConnection.getPassword());
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
        String address = Connection.buildUrl(protocol, targetHost, targetPort, WSDFUURI);

        initHPCCWsDFUSoapProxy(address, user, pass);
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
     */
    private void initHPCCWsDFUSoapProxy(String baseURL, String user, String pass)
    {
        wsDfuServiceSoapProxy = new WsDfuServiceSoapProxy(baseURL);
        if (wsDfuServiceSoapProxy != null)
        {
            WsDfuServiceSoap wsDfuServiceSoap = wsDfuServiceSoapProxy.getWsDfuServiceSoap();
            if (wsDfuServiceSoap != null)
            {
                if (user != null && pass != null) Connection.initStub((Stub) wsDfuServiceSoap, user, pass);
            }
        }
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
    public EclRecordInfo getDatasetFields(String datasetname, String clusterName, String fieldSeparator)
            throws Exception
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

    private void handleException(ArrayOfEspException exp) throws Exception
    {
        if (exp != null && exp.getException() != null && exp.getException().length > 0)
        {
            for (int i = 0; i < exp.getException().length; i++)
            {
                EspException ex = exp.getException()[i];
                Utils.println(System.out, ex.getMessage(), true, verbose);
            }
            throw exp;
        }
    }

    /**
     * Get array of logical files on target HPCC system based on input parameters
     * 
     * @param filename
     * @param cluster --- NO LONGER USED ---
     * @param firstN
     * @param pageStartFrom
     * @param pageSize
     * @return
     * @throws Exception
     */
    public DFULogicalFile[] getLogicalFiles(String filename, String cluster, int firstN, int pageStartFrom, int pageSize) throws Exception
    {
        WsDfuServiceSoapProxy proxy = getSoapProxy();

        DFULogicalFile[] logicalfiles = null;
        DFUQueryRequest request = new DFUQueryRequest();
        if (filename != null)
            request.setLogicalName(filename);
        request.setFirstN(firstN);
        request.setPageStartFrom(pageStartFrom);
        request.setPageSize(pageSize);

        DFUQueryResponse response = proxy.DFUQuery(request);
        if (response != null)
            logicalfiles = response.getDFULogicalFiles();

        return logicalfiles;
    }

    public DFUSearchDataResponse getDFUData(String openLogicalName, String cluster, boolean roxieSelections, int chooseFile, int count, boolean schemaOnly, long startIndex) throws Exception
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
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsDfuServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getWsDfuServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getWsDfuServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsDfuServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsDfuServiceSoapProxy.getWsDfuServiceSoap()).getPassword());
        return result;
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
        try
        {
            DFUInfoResponse resp = this.getFileInfo(logicalname, clustername);
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
                    info.setColumns(getFileMetaData(logicalname, clustername));
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
            if ((info.getEcl() == null || info.getEcl().isEmpty()) && info.getIsSuperfile()
                    && info.getSubfiles() != null && info.getSubfiles().length != 0)
            {
                DFUFileDetailInfo subfile = this.getFileDetails(info.getSubfiles()[0], info.getCluster());
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
                    Utils.println(System.out, "Error retrieving file type for file: " + logicalname + ": " + espexception.getSource()
                            + espexception.getMessage(), false, true);
                }
            }
            throw e;
        }
    }
}
