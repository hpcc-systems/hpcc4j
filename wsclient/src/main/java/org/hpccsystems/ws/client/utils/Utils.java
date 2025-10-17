package org.hpccsystems.ws.client.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.management.ManagementFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.Context;
import io.opentelemetry.context.propagation.TextMapSetter;

/**
 * Provides multiple functions which support HPCCWsClient actions.
 *
 */
public class Utils
{
    private final static Logger log            = LogManager.getLogger(Utils.class);

    public final static char           LINUX_SEP      = '/';
    public final static char           WIN_SEP        = '\\';
    public final static String         ISO8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.sss'Z'";

    public enum LogLevel
    {
        DEBUG, ERROR, FATAL, INFO, TRACE, WARN
    }

    /**
     * Parses the version from WSDLURL.
     *
     * @param wsdlurl
     *            - url to web service definition
     * @return - version reported as ver_ parameter in url
     */
    public static String parseVersionFromWSDLURL(String wsdlurl)
    {
        if (wsdlurl != null && wsdlurl.length() > 0)
        {
            String[] pairs = wsdlurl.split("ver_=");

            if (pairs.length > 1)
            {
                return pairs[1];
            }
        }

        return "";
    }

    /**
     * Println.
     *
     * @param stream
     *            the stream
     * @param message
     *            the message
     * @param onlyifverbose
     *            the onlyifverbose
     * @param verbosemode
     *            the verbosemode
     */
    @Deprecated
    static public void println(PrintStream stream, String message, boolean onlyifverbose, boolean verbosemode)
    {
        if (onlyifverbose && verbosemode)
            log.warn(message);
        else
            log.info(message);
    }

    /**
     * Prints the.
     *
     * @param stream
     *            the stream
     * @param message
     *            the message
     * @param onlyifverbose
     *            the onlyifverbose
     * @param verbosemode
     *            the verbosemode
     */
    @Deprecated
    static public void print(PrintStream stream, String message, boolean onlyifverbose, boolean verbosemode)
    {
        if (onlyifverbose && verbosemode)
            log.warn(message);
        else
            log.info(message);
    }

    /**
     * Log.
     *
     * @param message
     *            the message
     * @param logLevel
     *            the log level
     */
    static public void log(String message, LogLevel logLevel)
    {
        switch (logLevel)
        {
            case DEBUG:
                log.debug(message);
                break;
            case ERROR:
                log.error(message);
                break;
            case FATAL:
                log.fatal(message);
                break;
            case INFO:
                log.info(message);
                break;
            case TRACE:
                log.trace(message);
                break;
            case WARN:
                log.warn(message);
                break;
            default:
                log.trace(message);
                break;
        }
    }

    /**
     * populates results object (List of Object Lists) based on HPCC result set string.
     *
     * @param results
     *            the results
     * @return the list
     */
    static public List<List<Object>> parseECLResults(String results)
    {
        Utils.println(System.out, "Parsing ECL results...", false, false);
        Utils.println(System.out, results, true, false);

        List<List<Object>> resultList = null;
        try
        {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(new ByteArrayInputStream(results.getBytes("UTF-8")));

            Utils.println(System.out, " Root element: " + doc.getDocumentElement().getNodeName(), false, false);

            NodeList exceptionList = doc.getElementsByTagName("Exception");
            if (exceptionList.getLength() > 0)
            {
                for (int temp = 0; temp < exceptionList.getLength(); temp++)
                {
                    resultList = new ArrayList<List<Object>>();

                    org.w3c.dom.Node nNode = exceptionList.item(temp);

                    if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE)
                    {
                        List<Object> row = new ArrayList<Object>();
                        NodeList datasetchildnodes = nNode.getChildNodes();
                        for (int rowsindex = 0; rowsindex < datasetchildnodes.getLength(); rowsindex++)
                        {
                            org.w3c.dom.Node ithrow = datasetchildnodes.item(rowsindex);
                            Element ithrowelement = (Element) ithrow;

                            row.add(ithrowelement.getNodeName() + ": " + ithrowelement.getTextContent());
                        }
                        resultList.add(row);
                    }
                }
            }

            NodeList nList = doc.getElementsByTagName("Dataset");

            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                org.w3c.dom.Node nNode = nList.item(temp);
                System.out.println("  Current Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == org.w3c.dom.Node.ELEMENT_NODE)
                {

                    Element eElement = (Element) nNode;

                    System.out.println("  Dataset Name: " + eElement.getAttribute("name"));

                    if (resultList == null) resultList = new ArrayList<List<Object>>();

                    NodeList datasetchildnodes = nNode.getChildNodes();
                    for (int rowsindex = 0; rowsindex < datasetchildnodes.getLength(); rowsindex++)
                    {
                        org.w3c.dom.Node ithrow = datasetchildnodes.item(rowsindex);

                        if (!(ithrow instanceof CharacterData))
                        {
                            Element ithrowelement = (Element) ithrow;
                            resultList.add(parseECLRowResultsToList(ithrowelement));
                        }
                        else
                        {
                            CharacterData data = (CharacterData) ithrow;
                            Utils.println(System.out, "ignoring: " + data, false, false);
                            continue;
                        }
                    }
                }
            }
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return resultList;
    }

    /**
     * Node to string.
     *
     * @param node
     *            the node
     * @return the string
     * @throws TransformerException
     *             the transformer exception
     */
    private static String nodeToString(Node node) throws TransformerException
    {
        StringWriter buf = new StringWriter();
        Transformer xform = TransformerFactory.newInstance().newTransformer();
        xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        xform.transform(new DOMSource(node), new StreamResult(buf));
        return (buf.toString());
    }

    /**
     * Extact result schema.
     *
     * @param results
     *            the results
     * @return the string
     */
    static public String extactResultSchema(String results)
    {
        Utils.println(System.out, "Parsing ECL results...", false, false);
        Utils.println(System.out, results, true, false);

        try
        {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(new ByteArrayInputStream(results.getBytes("UTF-8")));

            Utils.println(System.out, " Root element: " + doc.getDocumentElement().getNodeName(), false, false);

            NodeList exceptionList = doc.getElementsByTagName("Exception");
            if (exceptionList.getLength() > 0)
            {
                return null;
            }

            NodeList nList = doc.getElementsByTagName("XmlSchema");

            if (nList.getLength() > 0)
            {
                return nodeToString(nList.item(0));
            }
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (TransformerException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * Parses the out result schema.
     *
     * @param results
     *            the results
     * @return the list
     */
    static public List<List<Object>> parseOutResultSchema(String results)
    {
        Utils.println(System.out, "Parsing ECL results...", false, false);
        Utils.println(System.out, results, true, false);

        List<List<Object>> schemaCols = null;
        try
        {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(new ByteArrayInputStream(results.getBytes("UTF-8")));

            Utils.println(System.out, " Root element: " + doc.getDocumentElement().getNodeName(), false, false);

            NodeList exceptionList = doc.getElementsByTagName("Exception");
            if (exceptionList.getLength() > 0) return null;

            NodeList rowNodeList = doc.getElementsByTagName("Row");

            if (rowNodeList.getLength() > 0)
            {
                schemaCols = new ArrayList<List<Object>>();
                Node rowNode = rowNodeList.item(0);

                NodeList rowChildNodes = rowNode.getChildNodes();
                for (int rowChildNodeIndex = 0; rowChildNodeIndex < rowChildNodes.getLength(); rowChildNodeIndex++)
                {
                    List<Object> schemaCol = new ArrayList<Object>();
                    Node rowChild = rowChildNodes.item(rowChildNodeIndex);

                    schemaCol.add(0, rowChild.getNodeName());
                    schemaCol.add(1, rowChild.getNodeType());

                    schemaCols.add(rowChildNodeIndex, schemaCol);
                }
            }
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return schemaCols;
    }

    /**
     * Parses the ECL row results to list.
     *
     * @param rowelement
     *            the rowelement
     * @return the list
     */
    @SuppressWarnings("unchecked")
    static private List<Object> parseECLRowResultsToList(Element rowelement)
    {
        List<Object> row = null;
        try
        {
            String rowelementname = rowelement.getNodeName();
            if (rowelementname.equalsIgnoreCase("ROW"))
            {
                row = new ArrayList<Object>();
                NodeList childNodes = rowelement.getChildNodes();
                for (int rowdataindex = 0; rowdataindex < childNodes.getLength(); rowdataindex++)
                {
                    Object cell = null;

                    org.w3c.dom.Node rowdataitem = childNodes.item(rowdataindex);

                    NodeList childSubNodes = rowdataitem.getChildNodes();
                    int length = childSubNodes.getLength();
                    if (length > 1)
                    {
                        cell = new ArrayList<Object>();
                        for (int subchildindex = 0; subchildindex < length; subchildindex++)
                        {
                            ((List<Object>) cell).add(parseECLRowResultsToList((Element) childSubNodes.item(subchildindex)));
                        }
                    }
                    else
                    {
                        cell = new String(rowdataitem.getTextContent());
                    }
                    row.add(cell);
                }
            }
        }
        catch (Exception e)
        {
            println(System.err, "Error parsing ECL Results: " + e.getLocalizedMessage(), false, false);
        }

        return row;
    }

    /**
     * Serializes results object List of Object Lists to string in table format.
     *
     * @param resultlist
     *            the resultlist
     * @param celldelimiter
     *            the celldelimiter
     * @param rowdelimiter
     *            the rowdelimiter
     * @return the string
     */
    @SuppressWarnings("unchecked")
    static public String eclResultsToString(List<List<Object>> resultlist, String celldelimiter, String rowdelimiter)
    {
        StringBuilder resultstr = new StringBuilder();

        int rowscount = resultlist.size();
        for (int rowindex = 0; rowindex < rowscount; rowindex++)
        {
            Object row = resultlist.get(rowindex);
            if (row != null)
            {
                int rowlength = ((List<Object>) row).size();
                for (int cellindex = 0; cellindex < rowlength; cellindex++)
                {
                    Object cell = ((List<Object>) row).get(cellindex);
                    if (cell != null)
                    {
                        if (cell instanceof String)
                        {
                            resultstr.append((String) cell);
                        }
                        else if (cell instanceof List<?>)
                        {
                            resultstr.append("[ ");

                            for (Object subcell : (List<Object>) cell)
                            {
                                if (subcell != null)
                                {
                                    if (subcell instanceof String)
                                    {
                                        resultstr.append((String) subcell);
                                    }
                                    else if (subcell instanceof List<?>)
                                    {
                                        resultstr.append(eclResultsToString((List<List<Object>>) cell, celldelimiter, " | "));
                                    }
                                }
                                else
                                {
                                    resultstr.append("NULL");
                                }
                            }
                            resultstr.append(" ]");
                        }
                    }
                    else
                    {
                        resultstr.append("NULL");
                    }

                    if (cellindex < rowlength - 1) resultstr.append(celldelimiter);
                }
            }

            if (rowindex < rowscount - 1) resultstr.append(rowdelimiter);
        }

        return resultstr.toString();
    }

    private static final byte[] NEWLINE       = "\r\n".getBytes();
    private static final byte[] PREFIX        = "--".getBytes();
    private static final String BOUNDRYPREFIX = "--------------------";

    /**
     * Writes an char field value.
     *
     * @param out
     *            the out
     * @param boundary
     *            the boundary
     * @param name
     *            the field name (required)
     * @param value
     *            the field value
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void writeField(OutputStream out, String boundary, String name, char value) throws java.io.IOException
    {
        writeField(out, boundary, name, Character.valueOf(value));
    }

    /**
     * Writes an string field value. If the value is null, an empty string is
     * sent ("").
     *
     * @param out
     *            the out
     * @param boundary
     *            the boundary
     * @param name
     *            the field name (required)
     * @param value
     *            the field value
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void writeField(OutputStream out, String boundary, String name, String value) throws java.io.IOException
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        if (value == null)
        {
            value = "";
        }

        out.write(PREFIX);
        out.write(boundary.getBytes());
        out.write(NEWLINE);
        // write content header
        out.write(("Content-Disposition: form-data; name=\"" + name + "\"").getBytes());
        out.write(NEWLINE);
        out.write(NEWLINE);
        // write content
        out.write(value.getBytes());
        out.write(NEWLINE);
        out.flush();
    }

    /**
     * Writes outputstream to file in local file system.
     *
     * @param out
     *            the out
     * @param name
     *            the name
     * @param mimeType
     *            the mime type
     * @param file
     *            the file
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void writeFile(OutputStream out, String name, String mimeType, File file) throws java.io.IOException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("File cannot be null.");
        }
        if (!file.exists())
        {
            throw new IllegalArgumentException("File does not exist.");
        }
        if (file.isDirectory())
        {
            throw new IllegalArgumentException("File cannot be a directory.");
        }

        writeFile(out, createBoundary(), name, mimeType, file.getCanonicalPath(), new FileInputStream(file));
    }

    /**
     * Writes a input stream's contents. If the input stream is null, a
     * <code>java.lang.IllegalArgumentException</code> will be thrown.
     *
     * @param out
     *            the out
     * @param boundary
     *            the boundary
     * @param name
     *            the name
     * @param mimeType
     *            the mime type
     * @param fileName
     *            the file name
     * @param is
     *            the is
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public void writeFile(OutputStream out, String boundary, String name, String mimeType, String fileName, InputStream is) throws java.io.IOException
    {
        if (is == null)
        {
            throw new IllegalArgumentException("Input stream cannot be null.");
        }
        if (fileName == null || fileName.length() == 0)
        {
            throw new IllegalArgumentException("File name cannot be null or empty.");
        }
        /*
         * --boundary\r\n Content-Disposition: form-data; name="<fieldName>";
         * filename="<filename>"\r\n Content-Type: <mime-type>\r\n \r\n
         * <file-data>\r\n
         */
        // write boundary
        out.write(PREFIX);
        out.write(boundary.getBytes());
        out.write(NEWLINE);
        // write content header
        out.write(("Content-Disposition: form-data; name=\"" + name + "\"; filename=\"" + fileName + "\"").getBytes());
        out.write(NEWLINE);
        if (mimeType != null)
        {
            out.write(("Content-Type: " + mimeType).getBytes());
            out.write(NEWLINE);
        }
        out.write(NEWLINE);
        // write content
        byte[] data = new byte[1024];
        int r = 0;
        while ((r = is.read(data, 0, data.length)) != -1)
        {
            out.write(data, 0, r);
        }
        // close input stream, but ignore any possible exception for it
        try
        {
            is.close();
        }
        catch (Exception e)
        {}
        out.write(NEWLINE);
        out.flush();
    }

    /**
     * Writes the given bytes. The bytes are assumed to be the contents of a
     * file, and will be sent as such.
     *
     * @param out
     *            the out
     * @param boundary
     *            the boundary
     * @param mimeType
     *            the mime type
     * @param fileName
     *            the file name
     * @param data
     *            the data
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    static public void writeFile(OutputStream out, String boundary, String mimeType, String fileName, byte[] data) throws java.io.IOException
    {
        if (out == null)
        {
            throw new IllegalArgumentException("Outputstream cannot be null.");
        }
        if (data == null)
        {
            throw new IllegalArgumentException("Data cannot be null.");
        }
        if (fileName == null || fileName.length() == 0)
        {
            throw new IllegalArgumentException("File name cannot be null or empty.");
        }

        startMulti(out, fileName, boundary, mimeType);
        out.write(data, 0, data.length);
        closeMulti(out, boundary);
    }

    /**
     * Start multi.
     *
     * @param out
     *            the out
     * @param filename
     *            the filename
     * @param boundary
     *            the boundary
     * @param mimeType
     *            the mime type
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    static public void startMulti(OutputStream out, String filename, String boundary, String mimeType) throws IOException
    {
        out.write(Utils.PREFIX);
        out.write(boundary.getBytes());
        out.write(Utils.NEWLINE);

        // output.write(("Content-Disposition: form-data; name=\"machine\" 10.0.2.15").getBytes());
        // output.write(NEWLINE.getBytes());
        // output.write(boundary.getBytes());
        // output.write(NEWLINE.getBytes());

        out.write(("Content-Disposition: form-data; name=\"FilesToUpload\"; filename=\"" + filename + "\"").getBytes());
        out.write(NEWLINE);

        if (mimeType == null) mimeType = "application/octet-stream";
        out.write(("Content-Type: " + mimeType).getBytes());
        out.write(NEWLINE);
        out.write(NEWLINE);
    }

    /**
     * Finishes multipart and closes stream.
     *
     * @param out
     *            the out
     * @param boundary
     *            the boundary
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    static public void closeMulti(OutputStream out, String boundary) throws java.io.IOException
    {

        out.write(NEWLINE);
        out.write(PREFIX);
        out.write(boundary.getBytes());
        out.write(PREFIX);
        out.write(NEWLINE);
        out.flush();
    }

    /**
     * Creates a new <code>java.net.URLConnection</code> object from the
     * specified <code>java.net.URL</code>. This is a convenience method
     * which will set the <code>doInput</code>, <code>doOutput</code>,
     * <code>useCaches</code> and <code>defaultUseCaches</code> fields to
     * the appropriate settings in the correct order.
     *
     * @param url
     *            the url
     * @return the URL connection
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static URLConnection createConnection(URL url) throws java.io.IOException
    {

        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof HttpURLConnection)
        {
            HttpURLConnection httpConn = (HttpURLConnection) urlConn;
            httpConn.setRequestMethod("POST");
        }
        urlConn.setDoOutput(true);
        urlConn.setDoInput(true);
        urlConn.setUseCaches(false);
        urlConn.setDefaultUseCaches(false);
        urlConn.setRequestProperty("Connection", "Keep-Alive");
        urlConn.setRequestProperty("DNT", "1");
        urlConn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        urlConn.setRequestProperty("ENCTYPE", "multipart/form-data");

        return urlConn;
    }

    /**
     * creates a Multipart boundry based on current time.
     *
     * @return the string
     */
    public static String createBoundary()
    {
        return BOUNDRYPREFIX + Long.toString(System.currentTimeMillis(), 16);
    }

    public enum OSType
    {
        Windows, MacOS, Linux, Other
    }

    /**
     * HPCC Environment OS codes as defined in
     * /HPCC-Platform/common/environment/environment.hpp
     */
    public enum HPCCEnvOSCode
    {
        MachineOsW2K (
                0
        ), MachineOsSolaris (
                1
        ), MachineOsLinux (
                2
        ), MachineOsUnknown (
                3
        );

        private int    code;
        private String name;

        /**
         * Instantiates a new HPCC env OS code.
         *
         * @param code
         *            the code
         */
        HPCCEnvOSCode(int code)
        {
            this.code = code;
            switch (code)
            {
                case 0:
                    name = "W2K";
                    break;
                case 1:
                    name = "Solaris";
                    break;
                case 2:
                    name = "Linux";
                    break;
                case 3:
                default:
                    name = "Unknown";
                    break;
            }
        }

        /**
         * From name.
         *
         * @param name
         *            the name
         * @return the HPCC env OS code
         */
        public HPCCEnvOSCode fromName(String name)
        {
            if (name == null || name.length() == 0)
                return MachineOsUnknown;
            else if (name.equalsIgnoreCase("W2k"))
                return MachineOsW2K;
            else if (name.equalsIgnoreCase("Solaris"))
                return MachineOsSolaris;
            else if (name.equalsIgnoreCase("Linux"))
                return MachineOsLinux;
            else
                return MachineOsUnknown;
        }

        /**
         * From code.
         *
         * @param code
         *            the code
         * @return the HPCC env OS code
         */
        static public HPCCEnvOSCode fromCode(int code)
        {
            switch (code)
            {
                case 0:
                    return MachineOsW2K;
                case 1:
                    return MachineOsSolaris;
                case 2:
                    return MachineOsLinux;
                case 3:
                default:
                    return MachineOsUnknown;
            }
        }

        /**
         * Gets the code.
         *
         * @return the code
         */
        public int getCode()
        {
            return code;
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
    }

    protected static OSType detectedOS;

    /**
     * detect the operating system from the os.name System property and cache
     * the result
     *
     * @return the operating system type
     */
    public static OSType getOperatingSystemType()
    {
        if (detectedOS == null)
        {
            String OS = System.getProperty("os.name", "generic").toLowerCase();
            if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0))
            {
                detectedOS = OSType.MacOS;
            }
            else if (OS.indexOf("win") >= 0)
            {
                detectedOS = OSType.Windows;
            }
            else if (OS.indexOf("nux") >= 0)
            {
                detectedOS = OSType.Linux;
            }
            else
            {
                detectedOS = OSType.Other;
            }
        }
        return detectedOS;
    }

    /**
     * Current O sis linux.
     *
     * @return true, if successful
     */
    public static boolean currentOSisLinux()
    {
        return getOperatingSystemType() == OSType.Linux;
    }

    /**
     * Attempts to map a string value to an enum value of
     * a given enum class.
     *
     * Iterates through all enum values of given enum class,
     * and compares to given string.
     * Returns enum value if it finds match, otherwise throws Exception
     *
     * @param <T>
     *            the generic type
     * @param enumclass
     *            reference to target enumaration
     * @param strvalue
     *            string value to be mapped to enum value
     * @return The corresponding enum value if found
     * @throws IllegalArgumentException
     *             if strvalue cannot be mapped to
     *             given enum
     */
    public static <T extends Enum<T>> T findEnumValFromString(Class<T> enumclass, String strvalue)
    {
        for (Enum enumValue : enumclass.getEnumConstants())
        {
            if (enumValue.name().equalsIgnoreCase(strvalue))
            {
                return (T) enumValue;
            }
        }
        throw new IllegalArgumentException(enumclass.getName() + ".'" + strvalue + "' is not valid.");
    }

    /**
     * Date to UTC string.
     *
     * @param date
     *            - java date to convert to string
     * @return UTC String for querying esp services in format yyyy-mm-ddThh:MM:ssZ
     */
    public static String dateToUTCString(Date date)
    {
        if (date == null)
        {
            return null;
        }
        DateFormat df = new SimpleDateFormat(ISO8601_FORMAT);
        return df.format(date);
    }

    /**
     * UTC string to date.
     *
     * @param utc
     *            - String in yyyy-mm-ddThh:MM:ssZ format
     * @return Date equivalent to string
     * @throws ParseException
     *             the parse exception
     */
    public static Date UTCStringToDate(String utc) throws ParseException
    {
        if (utc == null)
        {
            return null;
        }
        DateFormat df = new SimpleDateFormat(ISO8601_FORMAT);
        return df.parse(utc);
    }

    public static DocumentBuilderFactory newSafeXMLDocBuilderFactory() throws ParserConfigurationException
    {
	    DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	    // Settings for secure XML parsing
        docBuilderFactory.setAttribute(XMLConstants.FEATURE_SECURE_PROCESSING, true);
        docBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        docBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

        docBuilderFactory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        docBuilderFactory.setFeature("http://xml.org/sax/features/external-general-entities", false);
        docBuilderFactory.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        // Disable external DTDs as well
        docBuilderFactory.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        // and these as well, per Timothy Morgan's 2014 paper: "XML Schema, DTD, and Entity Attacks"
        docBuilderFactory.setXIncludeAware(false);
        docBuilderFactory.setExpandEntityReferences(false);

        return docBuilderFactory;
    }

    public static DocumentBuilder newSafeXMLDocBuilder() throws ParserConfigurationException, XPathExpressionException
    {
        DocumentBuilderFactory docBuilderFactory = newSafeXMLDocBuilderFactory();
        DocumentBuilder safeXMLDocBuilder = docBuilderFactory.newDocumentBuilder();
        if (safeXMLDocBuilder == null)
            throw new XPathExpressionException ("Could not create new safe XML doc builder");

        return safeXMLDocBuilder;
    }

    /**
     * Ensures the given path contains a trailing path delimiter.
     * Does not introduce duplicate trailing path delimiter if one already exists.
     * Defaults to Linux style separator if the given path either contains a Linux style separator, or the path is empty.
     * Strips all trailing white space character
     * @param path The path to be postfixed
     * @return original path with proper trailing path delimiter
     */
    public static String ensureTrailingPathSlash(String path)
    {
        return ensureTrailingPathSlash(path, (path.contains(Character.toString(LINUX_SEP)) || path.length() == 0) ? LINUX_SEP : WIN_SEP);
    }

    /**
     * Ensures the given path contains a trailing path delimiter.
     * Does not introduce duplicate trailing path delimiter if one already exists.
     * Uses Linux style path separator 'useLinuxSep' == "true", otherwise uses windows style path separator
     * Strips all trailing white space character
     * @param path path The path to be postfixed
     * @param useLinuxSep String, if "true" linux styled path delimiter will be used
     * @return original path with proper trailing path delimiter
     */
    public static String ensureTrailingPathSlash(String path, String useLinuxSep)
    {
        return ensureTrailingPathSlash(path, useLinuxSep.equalsIgnoreCase("true") ? LINUX_SEP : WIN_SEP);
    }

    /**
     * Ensures the given path contains a trailing path delimiter.
     * Does not introduce duplicate trailing path delimiter if one already exists.
     * Uses provided 'slash' as trailing path delimiter
     * Strips all trailing white space character
     * @param path The path to be postfixed
     * @param slash The character to append
     * @return original path with proper trailing path delimiter
     */
    public static String ensureTrailingPathSlash(String path, char slash)
    {
        path = trimTrailing(path);

        if (path.length() == 0 || path.charAt(path.length()-1) != slash)
            path = path + slash;

        return path;
    }

    /**
     * Constructs new path based on provided pre and post path sections
     * Ensures resulting path is properly delimited at the point of concatenation
     * Uses Linux path style path separator
     *
     * @param prefixPath - the prefix path
     * @param postfixPath - the postfix path
     * @return - new path comprised of path prefix a linux style path separator and path postfix
     */
    public static String appendLinuxPathSections(String prefixPath, String postfixPath)
    {
        return appendPathSections(prefixPath, LINUX_SEP, postfixPath);
    }

    /**
     * Constructs new path based on provided pre and post path sections
     * Ensures resulting path is properly delimited at the point of concatenation
     * Uses Windows path style path separator
     *
     * @param prefixPath - the prefix path
     * @param postfixPath - the postfix path
     * @return - new path comprised of path prefix a windows style path separator and path postfix
     */
    public static String appendWindowsPathSections(String prefixPath, String postfixPath)
    {
        return appendPathSections(prefixPath, WIN_SEP, postfixPath);
    }

    /**
     * Constructs new path based on provided pre and post path sections
     * Ensures resulting path is properly delimited at the point of concatenation
     * Infers proper path separator on presence of Linux or Windows style path separator in prefix path
     *
     * @param prefixPath - the prefix path
     * @param postfixPath - the postfix path
     * @return - new path comprised of path prefix a path separator and path postfix
     * @throws Exception - Invalid paths, indiscernible path style
     */
    public static String appendPathSections(String prefixPath, String postfixPath) throws Exception
    {
        if (prefixPath == null)
            prefixPath = "";

        if (postfixPath == null)
            postfixPath = "";

        if (prefixPath.length() == 0 && postfixPath.length() == 0)
            return "";

        try
        {
            char pathSep = inferPathSeperatorType(prefixPath.length() != 0 ? prefixPath : postfixPath);
            return appendPathSections(prefixPath, pathSep, postfixPath);
        }
        catch (Exception e)
        {
            throw new Exception("Could not append path sections, ensure original path sections are valid and contain path seperator");
        }
    }

    /**
     * Constructs new path based on provided pre and post path sections
     * Ensures resulting path is properly delimited at the point of concatenation
     * Uses provided char as delimiter between pre and post path sections
     *
     * @param prefixPath - the prefix path
     * @param slash - separator to use when appending path sections
     * @param postfixPath - the postfix path
     * @return - new path comprised of path prefix a path separator and path postfix
     */
    public static String appendPathSections(String prefixPath, char slash, String postfixPath)
    {
        prefixPath = trimTrailing(prefixPath);

        if (prefixPath.length() == 0 || prefixPath.charAt(prefixPath.length()-1) != slash)
            prefixPath = prefixPath + slash;

        postfixPath = postfixPath.trim();

        if (postfixPath.length() > 0 && postfixPath.charAt(0) == slash)
            prefixPath = prefixPath + postfixPath.substring(1);
        else
            prefixPath = prefixPath + postfixPath;

        return prefixPath;
    }

    /**
     * Infers path style (linux/windows) based on presence of Linux separator
     * @param path - the path
     * @return - new path comprised of path prefix a path separator and path postfix
     * @throws Exception - Invalid paths, indiscernible path style
     */
    public static char inferPathSeperatorType(String path) throws Exception
    {
        if (path.length() == 0)
            throw new Exception("Zero len path detected!");

        return path.contains(Character.toString(LINUX_SEP)) ? LINUX_SEP : WIN_SEP;
    }

    /**
     * Removes trailing whitespace characters from a string.
     *
     * @param originalStr the original string from which trailing whitespace should be removed
     * @return a new string with the same characters as the original string, minus any trailing whitespace
     */
    public static String trimTrailing(String originalStr)
    {
        int strIndex = originalStr.length()-1;
        while(strIndex >= 0 && Character.isWhitespace(originalStr.charAt(strIndex)))
            strIndex--;

        return originalStr.substring(0,strIndex+1);
    }

    /**
     * Returns traceparent value for Open Telemetry based context propagation
     * @return traceparent of current span if valid, otherwise invalid traceparent header value
     */
    static public String getCurrentSpanTraceParentHeader()
    {
        Span currentSpan = Span.current();
        return getTraceParentHeader(currentSpan);
    }

    /**
     * Returns traceparent value for Open Telemetry based context propagation
     * @param span Span to extract traceparent from
     * @return traceparent of the provided span if valid, otherwise invalid traceparent header value
     */
    static public String getTraceParentHeader(Span span)
    {

        String traceparent = null;
        if (span != null && span.getSpanContext().isValid())
        {
            Map<String, String> carrier = new HashMap<>();
            TextMapSetter<Map<String, String>> setter = Map::put;
            W3CTraceContextPropagator.getInstance().inject(Context.current(), carrier, setter);

            // If the propagator didn't inject a traceparent (should not happen with valid span),
            // create one manually using the span's actual sampling flags
            if (!carrier.containsKey("traceparent"))
            {
                String traceFlags = span.getSpanContext().getTraceFlags().asHex();
                traceparent = "00-" + span.getSpanContext().getTraceId() + "-" + span.getSpanContext().getSpanId() + "-" + traceFlags;
            }
            else
            {
                traceparent = carrier.get("traceparent");
            }
            carrier.clear();
        }

        return traceparent;
    }

    /**
     * Checks if a specified VM argument is present.
     *
     * This method retrieves the list of VM arguments and searches for the specified argument name.
     * If the argument is found, it returns true. If the argument is not found, it returns false.
     *
     * @param vmArgName the name of the VM argument to search for
     * @return {@code true} if the specified VM argument is present, {@code false} otherwise
     */
    static public boolean containsVMArgument(String vmArgName)
    {
        List<String> argslist = ManagementFactory.getRuntimeMXBean().getInputArguments();
        for (String string : argslist)
        {
            if(string.matches("(?i)(" + vmArgName + "):.*"))
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Fetches the value of a specified VM argument.
     *
     * This method retrieves the list of VM arguments and searches for the specified argument name.
     * If the argument is found, it returns the value associated with it. If the argument is not found,
     * it returns an empty string.
     *
     * @param vmArgName the name of the VM argument to search for
     * @return the value of the specified VM argument, or an empty string if the argument is not found
     */
    static public String fetchVMArgument(String vmArgName)
    {
        List<String> argslist = ManagementFactory.getRuntimeMXBean().getInputArguments();
        for (String string : argslist)
        {
            if(string.matches("(?i)(" + vmArgName + "):.*"))
            {
                String[] keyval = string.split(vmArgName+":");

                return keyval[1];
            }
        }
        return "";
    }

    /**
     * Checks if the OpenTelemetry Java agent is used by inspecting the VM arguments.
     *
     * This method fetches the VM argument specified by "-javaagent" and checks if it contains
     * the term "opentelemetry". If the argument is found and contains "opentelemetry", it returns true.
     * Otherwise, it returns false.
     *
     * @return {@code true} if the OpenTelemetry Java agent is detected, {@code false} otherwise.
     */
    static public boolean isOtelJavaagentUsed()
    {
        String javaAgentPath = fetchVMArgument("-javaagent");
        if (!javaAgentPath.isEmpty())
        {
            System.out.println("javaagent VM argument detected: " + javaAgentPath);

            File jaFile = new File(javaAgentPath);

            if (jaFile.getName().contains("opentelemetry") || jaFile.getName().contains("otel"))
            {
                System.out.println("Otel javaagent argument detected: " + javaAgentPath);
                return true;
            }
        }
        return false;
    }
}
