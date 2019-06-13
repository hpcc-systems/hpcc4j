package org.hpccsystems.ws.client;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFUActionInfo;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.ArrayOfDFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUActionInfo;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUArrayActionRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUArrayActionResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUArrayActions;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUBrowseDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUBrowseDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUDataColumn;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileAccessV2Request;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileCreateV2Request;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePublishRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFilePublishResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileViewRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUFileViewResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetDataColumnsRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetDataColumnsResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetFileMetaDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUGetFileMetaDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFULogicalFile;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUQueryRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUQueryResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchDataRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.DFUSearchDataResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspSoapFault;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.EspStringArray;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileListRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.SuperfileListResponse;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuPingRequest;
import org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuStub;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EclRecordWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUCreateFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUDataColumnWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileAccessInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileDetailWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUFileTypeWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUInfoWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFULogicalFileWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.DFUResultWrapper;
import org.hpccsystems.ws.client.wrappers.wsdfu.WsDFUClientStubWrapper;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

/**
 * Provides soap client for HPCC WsDFU web service.
 *
 */
public class HPCCWsDFUClient extends BaseHPCCWsClient
{
    private static final Logger log = Logger.getLogger(HPCCWsDFUClient.class.getName());

    public static final String    WSDFUURI              = "/WsDFU/";
    public static final String    ROW_ELEMENT           = "Row";
    public static final String    DATASET_ELEMENT       = "Dataset";
    private WsDFUClientStubWrapper stubwrapper          = null;
    private Options stuboptions                         = null;

    static
    {
        try
        {
            WsDfuStub def = new WsDfuStub();
            Options opt = def._getServiceClient().getOptions();
            ORIGINALURL = new URL(opt.getTo().getAddress());
        }
        catch (AxisFault e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }

    public static HPCCWsDFUClient get(Connection connection)
    {
         return new HPCCWsDFUClient(connection);
    }

    public static HPCCWsDFUClient get(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        return new HPCCWsDFUClient(conn);
    }

    public static HPCCWsDFUClient get(String protocol, String targetHost, String targetPort, String user, String pass, int timeout)
    {
        Connection conn = new Connection(protocol,targetHost,targetPort);
        conn.setCredentials(user, pass);
        conn.setConnectTimeoutMilli(timeout);
        conn.setSocketTimeoutMilli(timeout);

        return new HPCCWsDFUClient(conn);
    }

    protected HPCCWsDFUClient(Connection baseConnection)
    {
        initWsDFUClientStub(baseConnection);
    }

    /**
     * Initializes the service's underlying stub Should only be used by constructors
     *
     * @param conn  -- All connection settings included
     */
    protected void initWsDFUClientStub(Connection conn)
    {
         initErrMessage = "";

         try
         {
             HPCCWsSMCClient wssmc = HPCCWsSMCClient.get(conn);
             targetVersion = new Version(wssmc.getHPCCBuild());

             if (targetVersion != null)
             {
                 stubwrapper = new WsDFUClientStubWrapper(conn.getBaseUrl()+WSDFUURI, targetVersion);
                 stub = stubwrapper.get1_51Stub(null);
             }
             else
                 throw new Exception("Cannot initialize HPCCWsDFUStub without valid HPCC version object");

             stub = setStubOptions(stub, conn);
         }
         catch (Exception e)
         {
             log.error("HPCCWsDFUClient: Could not initialize WsDFU Stub - Review all HPCC connection values");
             if (!e.getLocalizedMessage().isEmpty())
             {
                 initErrMessage = e.getLocalizedMessage();
                 log.error("HPCCWsDFUClient: " + e.getLocalizedMessage()) ;
             }
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
    public DFUInfoWrapper getFileInfo(String logicalname, String clustername) throws Exception
    {
      return getFileInfo(logicalname,  clustername, false, false);
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

    public DFUInfoWrapper getFileInfo(String logicalname, String clustername, boolean jsonTypeInfo, boolean binTypeInfo) throws Exception
    {

        verifyStub(); //Throws exception if stub failed

        DFUInfoRequest request = new DFUInfoRequest();

        request.setName(logicalname);
        request.setIncludeBinTypeInfo(binTypeInfo);
        request.setIncludeJsonTypeInfo(jsonTypeInfo);

        if (clustername != null)
        {
            request.setCluster(clustername);
        }

        DFUInfoResponse response = null;

        try
        {
            response = ((WsDfuStub)stub).dFUInfo(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getFileInfo(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getFileInfo");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not ListFiles");

        return new DFUInfoWrapper (response);
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
        verifyStub(); //Throws exception if stub failed

        DFUBrowseDataRequest request = new DFUBrowseDataRequest();

        request.setLogicalName(logicalname);
        if (clustername != null)
        {
            request.setCluster(clustername);
        }
        if (beginrow == null)
        {
            beginrow = (long) 0;
        }
        if (numrows == null)
        {
            numrows = 1;
        }

        request.setStart(beginrow);
        request.setCount(numrows);

        DFUBrowseDataResponse response = null;

        try
        {
            response = ((WsDfuStub)stub).dFUBrowseData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getFileData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getFileData");
        }

        if (response.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(response.getExceptions()), "Could Not getFileData");

        String xmlresult = response.getResult();
        if (!xmlresult.contains("<" + DATASET_ELEMENT))
            return null;

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

    /**
     * @param scope
     *            - file scope/directory to return files for
     * @return an array of DFULogicalFile objects
     * @throws Exception
     */
    public List<DFULogicalFileWrapper> getFiles(String scope) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        List<DFULogicalFileWrapper> result = new ArrayList<DFULogicalFileWrapper>();
        DFUFileViewRequest request = new DFUFileViewRequest();

        request.setScope(scope);

        DFUFileViewResponse resp= null;

        try
        {
            resp = ((WsDfuStub)stub).dFUFileView(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getFiles("+scope+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getFiles");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getFiles");

        ArrayOfDFULogicalFile filesarray = resp.getDFULogicalFiles();

        if (filesarray != null)
        {
            DFULogicalFile[] files = filesarray.getDFULogicalFile();
            result = new ArrayList<DFULogicalFileWrapper>();
            for (int i = 0; i < files.length; i++)
            {
                result.add(new DFULogicalFileWrapper(files[i]));
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
            DFUInfoWrapper details = this.getFileInfo(subfiles[i], cluster);
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

    public String[] getSuperFileSubfiles(String filename) throws Exception
    {
        SuperfileListRequest request = new SuperfileListRequest();
        request.setSuperfile(filename);

        SuperfileListResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).superfileList(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getSuperFile("+filename+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not get getSuperFileList");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not get superfilelist");

        String [] result = new String [] { "" };

        EspStringArray subfilesarray = resp.getSubfiles();
        if (subfilesarray != null)
        {
            result = subfilesarray.getItem();
        }
        return result;
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
    public List<DFUDataColumnWrapper> getFileMetaData(String logicalname, String clustername) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        List<DFUDataColumnWrapper> cols = new ArrayList<DFUDataColumnWrapper>();
        String eclrecord = null;
        // getFileMetadata fails for superfiles; use first subfile to retrieve record structure if this is the case
        // also retrieve ecl to extract extra information (xpath, maxlength) not in getFileMetadata
        try
        {
            DFUInfoWrapper details = this.getFileInfo(logicalname, clustername);
            if (details != null && details.getFileDetail() != null)
            {
                eclrecord = details.getFileDetail().getEcl();
                if (details.getFileDetail().getIsSuperfile())
                {
                    String [] subfiles = null;
                    try
                    {
                        subfiles = getSuperFileSubfiles(logicalname);
                    }
                    catch (Exception e)
                    {
                        log.info("Failure while verifying superfile list for '"+ logicalname +"'");
                    }

                    // this throws an exception if different layouts exist in a superfile;
                    checkSuperfileLayouts(subfiles, clustername);

                    if (subfiles != null  && subfiles.length != 0)
                    {
                        logicalname = subfiles[0];
                    }
                    else
                    {
                        throw new Exception(logicalname + " is a superfile with no subfiles, cannot determine file structure");
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

        DFUGetFileMetaDataRequest request = new DFUGetFileMetaDataRequest();

        request.setLogicalFileName(logicalname);

        if (clustername != null)
        {
            request.setClusterName(clustername);
        }

        DFUGetFileMetaDataResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUGetFileMetaData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getFileMetaDataInfo(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getFileMetaDataInfo");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getFileMetaDataInfo");

        if (resp == null || resp.getDataColumns() == null)
        {
            return cols;
        }

        DFUDataColumn[] datacolumns = resp.getDataColumns().getDFUDataColumn();

        for (int i = 0; i < datacolumns.length; i++)
        {
            cols.add(new DFUDataColumnWrapper(datacolumns[i]));
        }

        // attempt to add additional info in from ecl record
        try
        {
            if (eclrecord != null && !StringUtils.isEmpty(eclrecord))
            {
                EclRecordWrapper recinfo = DFUFileDetailWrapper.getRecordEcl(eclrecord);
                if (recinfo.getParseErrors().size() > 0)
                {
                    throw new Exception(StringUtils.join(recinfo.getParseErrors(), "\n"));
                }
                if (recinfo.getRecordsets().size() > 0 && recinfo.getRecordsets().containsKey(EclRecordWrapper.UNNAMED)
                        && recinfo.getRecordsets().get(EclRecordWrapper.UNNAMED).getChildColumns().size() == cols.size())
                {
                    for (int i = 0; i < cols.size(); i++)
                    {
                        DFUDataColumnWrapper base = cols.get(i);
                        DFUDataColumnWrapper extra = recinfo.getRecordsets().get(EclRecordWrapper.UNNAMED).getChildColumns().get(i);
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
    //@Deprecated
    /*public DFUDataColumn[] getFileMetaData(String logicalname, String clustername) throws Exception {}*/

    /**
     * @param logicalname
     *            - logical filename to retrieve the dfu data columns for. Currently this method/service call functions
     *            for THOR files but will return nothing for CSV/XML/FLAT data files
     * @param clustername
     *            - optional. The cluster the logical filename is associated with.
     * @return ArrayList of DFUDataColumns
     * @throws Exception
     */
    public List<DFUDataColumnWrapper> getFileDataColumns(String logicalname, String clustername) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        DFUGetDataColumnsRequest request = new DFUGetDataColumnsRequest();

        request.setOpenLogicalName(logicalname);
        if (clustername != null)
            request.setCluster(clustername);

        DFUGetDataColumnsResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUGetDataColumns(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getFileDataColumns("+logicalname+","+clustername+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getFileDataColumns");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not perform getFileDataColumns");

        List<DFUDataColumnWrapper> cols = new ArrayList<DFUDataColumnWrapper>();

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
                        cols.add(new DFUDataColumnWrapper(col));
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
                        cols.add(new DFUDataColumnWrapper(col));
                    }
                }
            }
        }

        return cols;
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
    public EclRecordWrapper getDatasetFields(String datasetname, String clusterName, String fieldSeparator) throws Exception
    {
        DFUFileDetailWrapper info = getFileDetails(datasetname, clusterName);
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
    public List<DFULogicalFileWrapper> getLogicalFiles(String filename, String cluster, int firstN,
            int pageStartFrom,int pageSize) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        DFUQueryRequest request = new DFUQueryRequest();

        if (filename != null)
            request.setLogicalName(filename);

        request.setFirstN(firstN);
        request.setPageStartFrom(pageStartFrom);
        request.setPageSize(pageSize);

        DFUQueryResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getLogicalFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getLogicalFiles");
        }

        List<DFULogicalFileWrapper> logicalfiles = new ArrayList<DFULogicalFileWrapper>();

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getLogicalFiles");

        ArrayOfDFULogicalFile logicalfilesarray = resp.getDFULogicalFiles();
        if (logicalfilesarray != null)
        {
            DFULogicalFile [] dfulogicalfilesarray = logicalfilesarray.getDFULogicalFile();

            for (int i = 0; i < dfulogicalfilesarray.length; i++)
            {
                logicalfiles.add(new DFULogicalFileWrapper(dfulogicalfilesarray[i]));
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
        verifyStub(); //Throws exception if stub failed

        DFUSearchDataRequest request = new DFUSearchDataRequest();

        request.setOpenLogicalName(openLogicalName);
        request.setCluster(cluster);
        request.setRoxieSelections(roxieSelections);
        request.setChooseFile(chooseFile);
        request.setCount(count);
        request.setSchemaOnly(schemaOnly);
        request.setStartIndex(startIndex);

        DFUSearchDataResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUSearchData(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.getDFUData(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not perform getDFUData");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not getDFUData");

        return resp;
    }


    /**
     * @param files
     *            - list of filenames to delete
     * @param cluster
     *            - name of cluster to delete from (will delete from all clusters if null)
     * @return list of results of file deletions
     * @throws Exception
     */
    public List<DFUResultWrapper> deleteFiles(Set<String> files, String cluster) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        DFUArrayActionRequest request = new DFUArrayActionRequest();

        request.setType(DFUArrayActions.Factory.fromValue("Delete"));
        EspStringArray logicalfilesarray = new EspStringArray();
        logicalfilesarray.setItem(files.toArray(new String[files.size()]));
        request.setLogicalFiles(logicalfilesarray);

        DFUArrayActionResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUArrayAction(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.deleteFiles(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not deleteFiles");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not deleteFiles");

        List<DFUResultWrapper> results = new ArrayList<DFUResultWrapper>();

        ArrayOfDFUActionInfo actioninfoarray = resp.getActionResults();
        if (actioninfoarray != null)
        {
            DFUActionInfo[] actionresp = actioninfoarray.getDFUActionInfo();

            for (int i = 0; i < actionresp.length; i++)
            {
                results.add(new DFUResultWrapper(actionresp[i]));
            }
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
    public List<DFULogicalFileWrapper> searchFiles(String logicalFilename, String cluster) throws Exception
    {
        verifyStub(); //Throws exception if stub failed

        if (logicalFilename != null && logicalFilename.startsWith("~"))
            logicalFilename = logicalFilename.substring(1);

        DFUQueryRequest request = new DFUQueryRequest();

        request.setNodeGroup(cluster);
        request.setLogicalName(logicalFilename);

        DFUQueryResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUQuery(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.searchFiles("+logicalFilename+","+cluster+") encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Could Not SearchFiles");
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Could Not SearchFiles");

        List<DFULogicalFileWrapper> result = new ArrayList<DFULogicalFileWrapper>();
        ArrayOfDFULogicalFile logicalfilearray = resp.getDFULogicalFiles();
        if (logicalfilearray != null)
        {
            DFULogicalFile[] dfulogicalfilearray = resp.getDFULogicalFiles().getDFULogicalFile();

            for (int i = 0; i < dfulogicalfilearray.length; i++)
            {
                result.add(new DFULogicalFileWrapper(dfulogicalfilearray[i]));
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
    public String getFileAccessBlob(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype, String filename, String clustername, int expiryseconds, String jobid) throws Exception
    {
        if (targetVersion == null || stub == null)
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
        if (targetVersion == null || stub == null)
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
            return getFileAccessBlob(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType.Full, filename, clustername, expiryseconds, jobid);
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
    public DFUFileAccessInfoWrapper getFileAccess(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype, String filename, String clustername, int expiryseconds, String jobid, boolean includejsonTypeInfo, boolean includebinTypeInfo, boolean requestfileinfo) throws Exception
    {
        if (targetVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuStub stub1_39 = stubwrapper.get1_39Stub(stuboptions);

            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest request = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequest();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequestBase requestbase = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequestBase();

            requestbase.setAccessRole(requestfileinfo ? org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole.External
                                                      : org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole.Token);
            requestbase.setAccessType(accesstype);
            requestbase.setCluster(clustername);
            requestbase.setExpirySeconds(expiryseconds);
            requestbase.setJobId(jobid);
            requestbase.setName(filename);
            requestbase.setReturnBinTypeInfo(includebinTypeInfo);
            requestbase.setReturnJsonTypeInfo(includejsonTypeInfo);

            request.setRequestBase(requestbase);

            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessResponse resp = null;

            try
            {
                resp = stub1_39.dFUFileAccess(request);
            }
            catch (RemoteException e)
            {
                throw new Exception ("HPCCWsDFUClient.getFileAccess(...) encountered RemoteException.", e);
            }

            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error acquiring read access for: '" + clustername + "::" + filename + "'");

            if (resp == null || resp.getAccessInfo() == null)
            {
                throw new Exception("Did not receive DFUFileAccess response");
            }
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
        if (targetVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor > 0)
        {
            verifyStub(); //Throws exception if stub failed

            DFUFileAccessV2Request request = new DFUFileAccessV2Request();

            request.setCluster(clustername);
            request.setExpirySeconds(expiryseconds);
            request.setRequestId(jobid);
            request.setName(filename);
            request.setReturnTextResponse(true);

            DFUFileAccessResponse resp = null;

            try
            {
                resp = ((WsDfuStub)stub).dFUFileAccessV2(request);
            }
            catch (RemoteException e)
            {
                throw new Exception ("Error acquiring read access for: '" + clustername + "::" + filename + "'", e);
            }
            catch (EspSoapFault e)
            {
                handleEspExceptions(new EspSoapFaultWrapper(e), "Error acquiring read access for: '" + clustername + "::" + filename + "'");
            }

            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error acquiring read access for: '" + clustername + "::" + filename + "'");

            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileAccess response");
            }

            return new DFUFileAccessInfoWrapper(resp.getAccessInfo(), resp.getType());
        }
        else if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            return getFileAccess(org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType.Read,
                                 filename, clustername, expiryseconds, jobid, true, false, true);
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
                org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole.External, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType.Write);
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
     * @param accessrole
     * @param accesstype
     * @return
     * @throws Exception
     */
    public DFUCreateFileWrapper createFileAndAcquireAccess(String fileName, String cluster, String eclRecordDefinition, String[] partitionHostMap, int expirySeconds, Boolean returnBinTypeInfo,
            Boolean returnJsonTypeInfo, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.FileAccessRole accessrole, org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.SecAccessType accesstype ) throws Exception
    {
        if (targetVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError() ? " - " +  initErrMessage : ""));

        if (targetVersion.major == 7 && targetVersion.minor == 0)
        {
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuStub stub1_39 = stubwrapper.get1_39Stub(stuboptions);

            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest request = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateRequest();
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequestBase requestbase = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileAccessRequestBase();

            request.setECLRecordDefinition(eclRecordDefinition);
            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspStringArray espStringArray = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.EspStringArray();

            for (int i = 0; i < partitionHostMap.length; i++)
            {
                espStringArray.addItem(partitionHostMap[i]);
            }
            request.setPartLocations(espStringArray);

            requestbase.setCluster(cluster);
            requestbase.setExpirySeconds(expirySeconds);
            requestbase.setName(fileName);
            requestbase.setReturnBinTypeInfo(returnBinTypeInfo);
            requestbase.setReturnJsonTypeInfo(returnJsonTypeInfo);
            requestbase.setAccessRole(accessrole);
            requestbase.setAccessType(accesstype);

            request.setRequestBase(requestbase);

            org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.DFUFileCreateResponse resp = null;

            try
            {
                resp = stub1_39.dFUFileCreate(request);
            }
            catch (RemoteException e)
            {
                throw new Exception ("HPCCWsDFUClient.getFileAccess(...) encountered RemoteException.", e);
            }

            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error creating DFU file: '" + cluster + "::" + fileName + "'");

            if (resp == null || resp.getAccessInfo() == null)
            {
                throw new Exception("Did not receive DFUFileCreateResponse response");
            }

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
        if (targetVersion == null || stub == null)
            throw new Exception("WSDFU client not available" + (hasInitError()  ? " - " +  initErrMessage : ""));

        if (targetVersion.major > 7 || targetVersion.major == 7 && targetVersion.minor > 0)
        {
            verifyStub(); //Throws exception if stub failed

            DFUFileCreateV2Request request = new DFUFileCreateV2Request();

            request.setECLRecordDefinition(eclRecordDefinition);
            request.setCluster(cluster);
            request.setExpirySeconds(expirySeconds);
            request.setName(fileName);
            request.setReturnTextResponse(true);
            if (compressed != null)
                request.setCompressed(compressed);
            if (type != null)
                request.setType(type.getFUFileType());
            if (requestId != null)
                request.setRequestId(requestId);

            DFUFileCreateResponse resp = null;

            try
            {
                resp = ((WsDfuStub)stub).dFUFileCreateV2(request);
            }
            catch (RemoteException e)
            {
                throw new Exception ("HPCCWsDFUClient.createFileAndAcquireAccess(...) encountered RemoteException.", e);
            }
            catch (EspSoapFault e)
            {
                handleEspExceptions(new EspSoapFaultWrapper(e), "Error creating DFU file: '" + cluster + "::" + fileName + "'");
            }

            if (resp == null || resp.getAccessInfo() == null && (resp.getExceptions() == null || resp.getExceptions().getException().length == 0))
            {
                throw new Exception("Did not receive DFUFileCreateResponse");
            }
            if (resp.getExceptions() != null)
                handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error creating DFU file: '" + cluster + "::" + fileName + "'");

            if (resp.getFileId() == null)
            {
                throw new Exception("Invalid DFUFileCreateResponse. FildId is null.");
            }

            return new DFUCreateFileWrapper(resp);
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
        verifyStub(); //Throws exception if stub failed

        DFUFilePublishRequest request = new DFUFilePublishRequest();

        request.setECLRecordDefinition(eclRecordDefinition);
        request.setFileId(fileId);
        request.setFileSize(fileSize);
        request.setRecordCount(totalRecords);
        if (overwrite != null)
            request.setOverwrite(overwrite);

        DFUFilePublishResponse resp = null;

        try
        {
            resp = ((WsDfuStub)stub).dFUFilePublish(request);
        }
        catch (RemoteException e)
        {
            throw new Exception ("HPCCWsDFUClient.publishFile(...) encountered RemoteException.", e);
        }
        catch (EspSoapFault e)
        {
            handleEspExceptions(new EspSoapFaultWrapper(e), "Error publishing DFU file: '" + fileId + "' \n" + e.getMessage());
        }

        if (resp.getExceptions() != null)
            handleEspExceptions(new ArrayOfEspExceptionWrapper(resp.getExceptions()), "Error publishing DFU file: '" + fileId + "'");
    }

    /**
     * @param logicalname
     *            - logical file to get file info for, can start with '~' or not
     * @param clustername
     *            - Optional. If specified, the cluster on which to search for the file
     * @return a DFUInfoResponse object containing the file info
     * @throws Exception
     */
    public DFUFileDetailWrapper getFileDetails(String logicalname, String clustername) throws Exception
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
    public DFUFileDetailWrapper getFileDetails(String logicalname, String clustername, boolean jsonTypeInfo, boolean binTypeInfo) throws Exception
    {
        //try
        //{
            DFUInfoWrapper resp = this.getFileInfo(logicalname, clustername, jsonTypeInfo, binTypeInfo);
            if (resp == null)
            {
                throw new FileNotFoundException(logicalname + " does not exist");
            }

            if (resp.getExceptions() != null)
                handleEspExceptions(resp.getExceptions(), "Retrieving file details");

            DFUFileDetailWrapper info = resp.getFileDetail();
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
                catch (Exception e)
                {
                    /*if (e.getException().length > 0 && e.getException(0).getMessage() != null
                            && e.getException(0).getMessage().contains("not available in service WsDfu"))
                    {
                        // for clusters on version < 5.0.2, this service doesn't exist; do it the old fashioned way
                        info.setColumns(this.getFileDataColumns(logicalname, clustername));
                    }
                    rodrigo
                    */
                }
            }
            if ((info.getEcl() == null || info.getEcl().isEmpty()) && info.getIsSuperfile() && info.getSubfiles() != null && info.getSubfiles().getItem().length != 0)
            {
                String[] strings = info.getSubfiles().getItem();
                DFUFileDetailWrapper subfile = this.getFileDetails(strings[0], info.getNodeGroup());
                if (subfile != null)
                {
                    info.setEcl(subfile.getEcl());
                    info.setColumns(subfile.getColumns());
                    info.setContentType(subfile.getContentType());
                    info.setFormat(subfile.getFormat());
                }
            }
            return info;
        /*}
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
        }*/
    }

    public boolean ping() throws Exception
    {
        verifyStub();

        WsDfuPingRequest request = new WsDfuPingRequest();

        try
        {
            ((WsDfuStub)stub).ping(request);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }
}
