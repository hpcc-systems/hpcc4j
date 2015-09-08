package org.hpccsystems.ws.client.utils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.hpccsystems.ws.client.antlr.CaseControlStringStream;
import org.hpccsystems.ws.client.antlr.EclRecordLexer;
import org.hpccsystems.ws.client.antlr.EclRecordParser;
import org.hpccsystems.ws.client.antlr.EclRecordParser.ProgramContext;
import org.hpccsystems.ws.client.antlr.EclRecordReader;
import org.hpccsystems.ws.client.platform.EclRecordInfo;
import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Utils
{
    final static char LINUX_SEP =  '/';
    final static char WIN_SEP =  '\\';

    /**
     * @param wsdlurl - url to web service definition
     * @return        - version reported as ver_ parameter in url
     */
    public static String parseVersionFromWSDLURL(String wsdlurl)
    {
        if (wsdlurl != null && wsdlurl.length() > 0)
        {
            String[] pairs = wsdlurl.split("ver_=");

            if(pairs.length > 1)
            {
                return pairs[1];
            }
        }

        return "";
    }

    static public void println(PrintStream stream, String message, boolean onlyifverbose, boolean verbosemode )
    {
        if (verbosemode || !onlyifverbose)
            stream.println(message);
    }

    static public void print(PrintStream stream, String message, boolean onlyifverbose, boolean verbosemode)
    {
        if (verbosemode || !onlyifverbose)
            stream.print(message);
    }

    /**
     * populates results object (List of Object Lists) based on HPCC result set string
     * @param results
     * @return
     */
    static public List<List <Object>> parseECLResults(String results)
    {
        Utils.println(System.out, "Parsing ECL results...", false, false);
        Utils.println(System.out, results, true, false);

        List<List <Object>> resultList = null;
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

                    if (resultList == null)
                        resultList = new ArrayList<List<Object>>();

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

    private static String nodeToString(Node node) throws TransformerException
    {
        StringWriter buf = new StringWriter();
        Transformer xform = TransformerFactory.newInstance().newTransformer();
        xform.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        xform.transform(new DOMSource(node), new StreamResult(buf));
        return(buf.toString());
    }

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
            if (exceptionList.getLength() > 0)
                return null;

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

                    schemaCol.add(0,rowChild.getNodeName());
                    schemaCol.add(1,rowChild.getNodeType());

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
                            ((List<Object>)cell).add(parseECLRowResultsToList((Element)childSubNodes.item(subchildindex)));
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
     * Serializes results object List of Object Lists to string in table format
     * @param resultlist
     * @param celldelimiter
     * @param rowdelimiter
     * @return
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
                int rowlength = ((List<Object>)row).size();
                for (int cellindex = 0; cellindex < rowlength; cellindex++)
                {
                    Object cell = ((List<Object>)row).get(cellindex);
                    if (cell != null)
                    {
                        if (cell instanceof String)
                        {
                            resultstr.append((String)cell);
                        }
                        else if ( cell instanceof List<?>)
                        {
                            resultstr.append("[ ");

                            for (Object subcell : (List<Object>)cell)
                            {
                                if (subcell != null)
                                {
                                    if (subcell instanceof String)
                                    {
                                        resultstr.append((String)subcell);
                                    }
                                    else if (subcell instanceof List<?>)
                                    {
                                        resultstr.append(eclResultsToString((List<List<Object>>)cell, celldelimiter, " | "));
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

                    if (cellindex < rowlength - 1)
                        resultstr.append(celldelimiter);
                }
            }

            if (rowindex < rowscount - 1)
                resultstr.append(rowdelimiter);
        }

        return resultstr.toString();
    }

    private static final byte[] NEWLINE = "\r\n".getBytes();
    private static final byte[] PREFIX = "--".getBytes();
    private static final String BOUNDRYPREFIX = "--------------------";

    /**
     * Writes an char field value.
     *
     * @param name
     *            the field name (required)
     * @param value
     *            the field value
     * @throws java.io.IOException
     *             on input/output errors
     */
    public void writeField(OutputStream out, String boundary, String name, char value) throws java.io.IOException
    {
        writeField(out, boundary, name, new Character(value).toString());
    }

    /**
     * Writes an string field value. If the value is null, an empty string is
     * sent ("").
     *
     * @param name
     *            the field name (required)
     * @param value
     *            the field value
     * @throws java.io.IOException
     *             on input/output errors
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
     * Writes outputstream to file in local file system
     * @param out
     * @param name
     * @param mimeType
     * @param file
     * @throws java.io.IOException
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
     */
    public void writeFile(OutputStream out, String boundary, String name, String mimeType, String fileName, InputStream is)    throws java.io.IOException
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
        out.write(("Content-Disposition: form-data; name=\"" + name + "\"; filename=\""+ fileName + "\"").getBytes());
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
        {
        }
        out.write(NEWLINE);
        out.flush();
    }

    /**
     * Writes the given bytes. The bytes are assumed to be the contents of a
     * file, and will be sent as such.
     */
    static public void writeFile(OutputStream out, String boundary, String mimeType, String fileName, byte[] data)    throws java.io.IOException
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

    static public void startMulti(OutputStream out, String filename, String boundary, String mimeType) throws IOException
    {
        out.write(Utils.PREFIX);
        out.write(boundary.getBytes());
        out.write(Utils.NEWLINE);

        //output.write(("Content-Disposition: form-data; name=\"machine\" 10.0.2.15").getBytes());
        //output.write(NEWLINE.getBytes());
        //output.write(boundary.getBytes());
        //output.write(NEWLINE.getBytes());

        out.write(("Content-Disposition: form-data; name=\"FilesToUpload\"; filename=\""    + filename + "\"").getBytes());
        out.write(NEWLINE);

        if (mimeType == null)
            mimeType = "application/octet-stream";
        out.write(("Content-Type: " + mimeType).getBytes());
        out.write(NEWLINE);
        out.write(NEWLINE);
    }

    /**
     * Finishes multipart and closes stream
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
     */
    public static URLConnection createConnection(URL url) throws java.io.IOException
    {

        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof HttpURLConnection)
        {
            HttpURLConnection httpConn = (HttpURLConnection)urlConn;
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
     *  creates a Multipart boundry based on current time
     *
     */
    public static String createBoundary()
    {
        return BOUNDRYPREFIX + Long.toString(System.currentTimeMillis(), 16);
    }

      public enum OSType
      {
            Windows,
            MacOS,
            Linux,
            Other
      };

      protected static OSType detectedOS;

     /**
       * detect the operating system from the os.name System property and cache
       * the result
       *
       * @returns - the operating system detected
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
      * @param enumclass reference to target enumaration
      * @param strvalue string value to be mapped to enum value
      *
      * @return The corresponding enum value if found
      *
      * @throws IllegalArgumentException if strvalue cannot be mapped to
      * given enum
      *
      **/
      public static <T extends Enum<T>> T findEnumValFromString(Class<T> enumclass, String strvalue)
      {
          for(Enum enumValue : enumclass.getEnumConstants())
          {
              if(enumValue.name().equalsIgnoreCase(strvalue))
              {
                  return (T) enumValue;
              }
          }
          throw new IllegalArgumentException(enumclass.getName() +".'" + strvalue + "' is not valid.");
      }

    public static EclRecordInfo getRecordEcl(String content)
    {
        if (content == null || content.isEmpty())
        {
            return new EclRecordInfo();
        }
        EclRecordReader cr = new EclRecordReader();
        try
        {
            ANTLRInputStream is = new CaseControlStringStream(content);
            ((CaseControlStringStream) is).toUpperCase = true; //ANTLR TOKENS should be upper cased
            EclRecordLexer dl = new EclRecordLexer(is);
            EclRecordParser dp = new EclRecordParser(new BufferedTokenStream(dl));
            cr.getErrorHandler().attach(dl);
            cr.getErrorHandler().attach(dp);
            cr.setParser(dp);
            ProgramContext pc = dp.program();
            ParseTreeWalker pw = new ParseTreeWalker();
            pw.walk(cr, pc);
        }
        catch (Exception e)
        {
            System.out.println("Error parsing Record:" + e.getMessage());
        }
        if (cr.getEclRecordInfo() != null)
        {
            cr.getEclRecordInfo().setOriginalEcl(content);
        }
        return cr.getEclRecordInfo();

    }
}