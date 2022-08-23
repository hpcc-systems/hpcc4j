package org.hpccsystems.ws.client;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.axis2.kernel.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Defines functionality common to all HPCC Systmes web service clients.
 *
 * Typically implemented by specialized HPCC Web service clients.
 */
public abstract class BaseHPCCWsClient extends DataSingleton
{
    /** Constant <code>log</code> */
    protected static final Logger log                    = LogManager.getLogger(BaseHPCCWsClient.class);
    /** Constant <code>DEAFULTECLWATCHPORT="8010"</code> */
    public static final String    DEAFULTECLWATCHPORT    = "8010";
    /** Constant <code>DEFAULTECLWATCHTLSPORT="18010"</code> */
    public static final String    DEFAULTECLWATCHTLSPORT = "18010";
    /** Constant <code>DEFAULTSERVICEPORT="DEAFULTECLWATCHPORT"</code> */
    public static String          DEFAULTSERVICEPORT     = DEAFULTECLWATCHPORT;

    protected Connection          wsconn                 = null;
    protected boolean             verbose                = false;
    protected String              initErrMessage         = "";
    protected Version             targetHPCCBuildVersion = null;
    protected Double              targetESPInterfaceVer  = null;
    protected Boolean             targetsContainerizedHPCC = null;

    public boolean isTargetHPCCContainerized() throws Exception
    {
        if (targetsContainerizedHPCC == null)
        {
            if (wsconn == null)
                throw new Exception("BaseHPCCWsClient: Cannot get target HPCC containerized mode, client connection has not been initialized.");

            targetsContainerizedHPCC = getTargetHPCCIsContainerized(wsconn);
        }
        return targetsContainerizedHPCC;
    }

    private boolean getTargetHPCCIsContainerized(Connection conn) throws Exception
    {
        if (wsconn == null)
            throw new Exception("Cannot get target HPCC containerized mode, client connection has not been initialized.");

        String response = wsconn.sendGetRequest("wssmc/getbuildinfo");//throws

        if (response == null || response.isEmpty())
            throw new Exception("Cannot get target HPCC containerized mode, received empty " + wsconn.getBaseUrl() + " wssmc/getbuildinfo response");

        setUpContainerizedParser();

        Document document = m_XMLParser.parse(new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));

        NodeList namedValuesList = (NodeList) m_containerizedXpathExpression.evaluate(document,XPathConstants.NODESET);
        for(int i = 0; i < namedValuesList.getLength(); i++)
        {
            Node ithNamedValuePair = namedValuesList.item(i);
            NodeList nameAndValue = ithNamedValuePair.getChildNodes();
            if (nameAndValue.getLength() == 2)
            {
                String name = null;
                String value = null;
                if (nameAndValue.item(0).getNodeName().equalsIgnoreCase("Name"))
                {
                     name = nameAndValue.item(0).getFirstChild().getNodeValue();
                     value = nameAndValue.item(1).getFirstChild().getNodeValue();
                }
                else
                {
                    name = nameAndValue.item(1).getFirstChild().getNodeValue();
                    value = nameAndValue.item(0).getFirstChild().getNodeValue();
                }

                if (name.equalsIgnoreCase("CONTAINERIZED"))
                {
                    if (value.equalsIgnoreCase("ON"))
                        return true;
                    else
                        return false;
                }
            }
        }

        return false; //No CONTAINERIZED entry has to be assumed to mean target is not CONTAINERIZED
    }

    private String getTargetHPCCBuildVersion() throws Exception
    {
        if (wsconn == null)
            throw new Exception("Cannot get target HPCC build version, client connection has not been initialized.");

        String response = wsconn.sendGetRequest("WsSMC/Activity?rawxml_");//throws

        if (response == null || response.isEmpty())
            throw new Exception("Cannot get target HPCC build version, received empty " + wsconn.getBaseUrl() + " wssmc/activity response");

        setUpBuildVersionParser();

        Document document = m_XMLParser.parse(new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));

        return (String) m_buildVersionXpathExpression.evaluate(document,XPathConstants.STRING);

    }

    /**
     * All instances of HPCCWsXYZClient should utilize this init function
     * Attempts to establish the target HPCC build version and its container mode
     *
     * Populates initErrMessage if any issues are encountered.
     * @param connection the WsClient connection
     * @param fetchVersionAndContainerMode services can choose not to fetch build version/containerized mode
     * @return true if target HPCC cluster is Containerized, otherwise false
     */
    protected boolean initBaseWsClient(Connection connection, boolean fetchVersionAndContainerMode)
    {
        boolean success = true;
        initErrMessage = "";
        setActiveConnectionInfo(connection);

        if (fetchVersionAndContainerMode)
        {
            try
            {
                targetHPCCBuildVersion = new Version(getTargetHPCCBuildVersion());
            }
            catch (Exception e)
            {
                initErrMessage = "BaseHPCCWsClient: Could not stablish target HPCC bulid version, review all HPCC connection values";
                if (!e.getLocalizedMessage().isEmpty())
                    initErrMessage = initErrMessage + "\n" + e.getLocalizedMessage();

                success = false;
            }

            try
            {
                targetsContainerizedHPCC = getTargetHPCCIsContainerized(wsconn);
            }
            catch (Exception e)
            {
                initErrMessage = initErrMessage + "\nBaseHPCCWsClient: Could not determine target HPCC Containerization mode, review all HPCC connection values";
                if (!e.getLocalizedMessage().isEmpty())
                    initErrMessage = initErrMessage + "\n" + e.getLocalizedMessage();

                success = false;
            }
        }
        if (!initErrMessage.isEmpty())
            log.error(initErrMessage);

        return success;
    }

    protected Stub                stub;

    static private XPathExpression m_containerizedXpathExpression = null;
    static private XPathExpression m_buildVersionXpathExpression = null;
    static private XPathExpression m_serviceInterfaceVersionXpathExpression = null;

    static private DocumentBuilder m_XMLParser = null;

    /**
     * Gets the default stub.
     *
     * @return the default stub
     * @throws org.apache.axis2.AxisFault
     *             the axis fault
     */
    abstract public Stub getDefaultStub() throws AxisFault;

    /**
     * Gets the service version.
     *
     * @param client
     *            the client
     * @return the service version
     */
    public static String getServiceVersion(BaseHPCCWsClient client)
    {
        String ver = null;
        if (client != null)
        {
            Stub stub;
            try
            {
                stub = client.getDefaultStub();
                ver = getServiceVersion(stub);
            }
            catch (AxisFault e)
            {
                e.printStackTrace();
            }
        }
        return ver;
    }

    /**
     * Gets the service version.
     *
     * @param stub
     *            the stub
     * @return the service version
     */
    public static String getServiceVersion(Stub stub)
    {
        String ver = null;
        if (stub != null)
        {
            String address = getServiceWSDLURL(stub);
            if (address != null && !address.isEmpty())
            {
                ver = Utils.parseVersionFromWSDLURL(address);
            }
        }

        return ver;
    }

    /**
     * Gets the service WSDLURL.
     *
     * @param stub
     *            the stub
     * @return the service WSDLURL
     */
    public static String getServiceWSDLURL(Stub stub)
    {
        String address = null;
        if (stub != null)
        {
            Options options = stub._getServiceClient().getOptions();
            if (options != null)
            {
                address = options.getTo().getAddress();
            }
        }

        return address;
    }

    /**
     * Gets the service WSDL port.
     *
     * @param stub
     *            the stub
     * @return the service WSDL port
     * @throws java.net.MalformedURLException
     *             the malformed URL exception
     */
    public static int getServiceWSDLPort(Stub stub) throws MalformedURLException
    {
        int port = -1;
        if (stub != null)
        {
            String address = getServiceWSDLURL(stub);
            if (address != null && !address.isEmpty())
            {
                port = (new URL(address)).getPort();
            }
        }

        return port;
    }

    /**
     * Gets the connection URL.
     *
     * @return the connection URL
     * @throws java.lang.Exception
     *             the exception
     */
    public URL getConnectionURL() throws Exception
    {
        URL address = null;

        verifyStub();
        Options opt = stub._getServiceClient().getOptions();

        EndpointReference toAddress = opt.getTo();
        if (toAddress != null) address = new URL(toAddress.getAddress());

        return address;
    }

    /**
     * Sets the verbose.
     *
     * @param verbose
     *            - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Gets the verbose.
     *
     * @return the verbose
     */
    public boolean getVerbose()
    {
        return this.verbose;
    }

    /**
     * Should be called after instantiation to confirm
     * Successful initialization.
     *
     * The client init can fail due to many different types of issues
     * including invalid connectivity options, invalid credentials, etc
     *
     * @return true, if successful
     */
    public boolean hasInitError()
    {
        return !initErrMessage.isEmpty();
    }

    /**
     * Returns error message encountered during initialization of wsdfuclient.
     * Empty string if no error encountered
     *
     * @return the inits the error
     */
    public String getInitError()
    {
        return initErrMessage;
    }

    /**
     * Provides Stub object if available, otherwise throws
     * Object can be used to access the web service methods directly.
     *
     * @return the stub
     * @throws java.lang.Exception
     *             the exception
     */
    protected Stub verifyStub() throws Exception
    {
        if (stub != null)
            return stub;
        else
            throw new Exception("WS Client Stub not available." + (hasInitError() ? "\n" + initErrMessage : ""));
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#equals(java.lang.Object)
     */
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat) return true;

        if (!(aThat instanceof BaseHPCCWsClient)) return false;

        if (!(aThat.getClass().isInstance(this))) return false;

        BaseHPCCWsClient that = (BaseHPCCWsClient) aThat;

        Options thatopt;
        try
        {
            Stub thatStub = that.verifyStub();
            thatopt = thatStub._getServiceClient().getOptions();
        }
        catch (Exception e)
        {
            thatopt = null;
        }

        if (thatopt == null) return false;

        Options thisoptions = stub._getServiceClient().getOptions();

        HttpTransportPropertiesImpl.Authenticator thisauth = (HttpTransportPropertiesImpl.Authenticator) thisoptions
                .getProperty(HTTPConstants.AUTHENTICATE);
        HttpTransportPropertiesImpl.Authenticator thatauth = (HttpTransportPropertiesImpl.Authenticator) thatopt
                .getProperty(HTTPConstants.AUTHENTICATE);

        if (!EqualsUtil.areSameNullState(thisauth, thatauth)) return false;

        return EqualsUtil.areEqual(thisoptions.getTo().toString(), thatopt.getTo().toString())
                && EqualsUtil.areEqual(thisoptions.getProperty(HTTPConstants.SO_TIMEOUT), thatopt.getProperty(HTTPConstants.SO_TIMEOUT))
                && EqualsUtil.areEqual(thisoptions.getProperty(HTTPConstants.CONNECTION_TIMEOUT),
                        thatopt.getProperty(HTTPConstants.CONNECTION_TIMEOUT))
                && EqualsUtil.areEqual(thisoptions.getProperty(HTTPConstants.CHUNKED),
                        thatopt.getProperty(HTTPConstants.CHUNKED))
                && (thisauth != null
                        ? (EqualsUtil.areEqual(thisauth.getUsername(), thatauth.getUsername())
                                && EqualsUtil.areEqual(thisauth.getPassword(), thatauth.getPassword()))
                        : true);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#hashCode()
     */
    /** {@inheritDoc} */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        if (hasInitError()) return result = HashCodeUtil.hash(result, getInitError());

        Options ops = stub._getServiceClient().getOptions();

        result = HashCodeUtil.hash(result, ops.getTo());
        HttpTransportPropertiesImpl.Authenticator thisauth = (HttpTransportPropertiesImpl.Authenticator) ops.getProperty(HTTPConstants.AUTHENTICATE);
        result = HashCodeUtil.hash(result, thisauth == null ? "" : thisauth.getUsername());
        result = HashCodeUtil.hash(result, thisauth == null ? "" : thisauth.getPassword());
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.SO_TIMEOUT));
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.CONNECTION_TIMEOUT));

        return result;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#isComplete()
     */
    /** {@inheritDoc} */
    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fastRefresh()
     */
    /** {@inheritDoc} */
    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.utils.DataSingleton#fullRefresh()
     */
    /** {@inheritDoc} */
    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    /**
     * Sets the stub connection TO.
     *
     * @param millis
     *            the new stub connection TO
     * @throws org.apache.axis2.AxisFault
     *             the axis fault
     */
    protected void setStubConnectionTO(int millis) throws AxisFault
    {
        Options opt = stub._getServiceClient().getOptions();

        opt.setProperty(HTTPConstants.CONNECTION_TIMEOUT, millis);

        stub._getServiceClient().setOptions(opt);
    }

    /**
     * Gets the stub connection TO.
     *
     * @return the stub connection TO
     * @throws org.apache.axis2.AxisFault
     *             the axis fault
     */
    protected Integer getStubConnectionTO() throws AxisFault
    {
        Integer to = null;
        if (stub != null)
        {
            Options opt = stub._getServiceClient().getOptions();
            try
            {
                to = (Integer) opt.getProperty(HTTPConstants.CONNECTION_TIMEOUT);
            }
            catch (Exception e)
            {}
        }
        return to;
    }

    final static UsernamePasswordCredentials emptyCreds = new UsernamePasswordCredentials("", null);

    /**
     * Sets the stub options defaults preemptiveauth to 'true;
     *
     * @param thestub
     *            The Axis generated service stub
     * @param connection
     *            The connection
     * @return the stub
     * @throws org.apache.axis2.AxisFault
     *             the axis fault
     */
    static public Stub setStubOptions(Stub thestub, Connection connection) throws AxisFault
    {
        Options opt = thestub._getServiceClient().getOptions();

        opt.setProperty(HTTPConstants.SO_TIMEOUT, connection.getSocketTimeoutMilli());
        opt.setProperty(HTTPConstants.CONNECTION_TIMEOUT, connection.getConnectTimeoutMilli());

        opt = setClientAuth(connection.getUserName(), connection.getPassword(), opt);

        opt.setProperty(HTTPConstants.CHUNKED, Boolean.FALSE);

        if (connection.getPreemptiveHTTPAuthenticate())
        {
            //Axis2 now forces connection authenticate, even if target is not secure
            CredentialsProvider credsProvider = new BasicCredentialsProvider();
            if (connection.hasCredentials())
                credsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(connection.getUserName(), connection.getPassword()));
            else
                credsProvider.setCredentials(AuthScope.ANY, emptyCreds);//if no credentials provided, allow empty user/null pass

            HttpClientBuilder builder = HttpClientBuilder.create();
            builder.addInterceptorFirst(new HPCCPreemptiveAuthInterceptor());
            builder.setDefaultCredentialsProvider(credsProvider);

            CloseableHttpClient httpClient = builder.build();
            opt.setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);
        }

        thestub._getServiceClient().setOptions(opt);

        return thestub;
    }

    /**
     * Sets the client auth.
     *
     * @param user
     *            the user
     * @param pass
     *            the pass
     * @param opt
     *            the opt
     * @return the options
     */
    static public Options setClientAuth(String user, String pass, Options opt)
    {
        if (user != null && pass != null && opt != null)
        {
            HttpTransportPropertiesImpl.Authenticator basicAuth = new HttpTransportPropertiesImpl.Authenticator();
            basicAuth.setUsername(user);
            basicAuth.setPassword(pass);
            basicAuth.setPreemptiveAuthentication(true);

            opt.setProperty(HTTPConstants.AUTHENTICATE, basicAuth);
            opt.setProperty(HttpTransportPropertiesImpl.Authenticator.BASIC, basicAuth);
        }

        return opt;
    }

    /**
     * Logs and throws EspSoapFaultWrapper.
     *
     * @param e
     *            the e
     * @throws org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper
     *             the esp soap fault wrapper
     */
    protected void handleEspSoapFaults(EspSoapFaultWrapper e) throws EspSoapFaultWrapper
    {
        if (e != null) handleEspSoapFaults(e, null);
    }

    /**
     * Logs and throws EspSoapFaultWrapper, if local message provided, added as wsclientmessage.
     *
     * @param e
     *            the e
     * @param message
     *            the message
     * @throws org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper
     *             the esp soap fault wrapper
     */
    protected void handleEspSoapFaults(EspSoapFaultWrapper e, String message) throws EspSoapFaultWrapper
    {
        if (e != null)
        {
            if (message != null && !message.isEmpty()) e.setWsClientMessage(message);

            log.error(e.toString());
            throw e;
        }
    }

    /**
     * Handle esp exceptions.
     *
     * @param exp
     *            the exp
     * @param message
     *            the message
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp, String message) throws ArrayOfEspExceptionWrapper
    {
        if (exp == null || exp.getExceptions() == null || exp.getExceptions().size() <= 0) return;

        if (message != null && !message.isEmpty()) exp.setWsClientMessage(message);

        log.error(exp.toString());
        throw exp;
    }

    /**
     * Handle esp exceptions.
     *
     * @param exp
     *            the exp
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper
     *             the array of esp exception wrapper
     */
    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp) throws ArrayOfEspExceptionWrapper
    {
        handleEspExceptions(exp, null);
    }

    /**
     * Logs and throws arrayofeclexceptionwrapper without localized message response from WS client.
     *
     * @param eclexceptions
     *            the eclexceptions
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    protected void handleECLExceptions(ArrayOfECLExceptionWrapper eclexceptions) throws Exception, ArrayOfECLExceptionWrapper
    {
        handleECLExceptions(eclexceptions, null);
    }

    /**
     * Logs and throws arrayofeclexceptionwrapper with localized message response from WS client.
     *
     * @param eclExceptions
     *            - the array of ECLException objects to throw
     * @param message
     *            - the prefix message
     * @throws java.lang.Exception
     *             the exception
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper
     *             the array of ECL exception wrapper
     */
    protected void handleECLExceptions(ArrayOfECLExceptionWrapper eclExceptions, String message) throws Exception, ArrayOfECLExceptionWrapper
    {
        if (eclExceptions == null || eclExceptions.getECLException() == null || eclExceptions.getECLException().size() <= 0) return;

        if (message != null && !message.isEmpty()) eclExceptions.setWsClientMessage(message);

        log.error(eclExceptions.toString());
        throw eclExceptions;
    }

    /**
     * Provides the target ESP Interface version
     *
     * @return The runtime ESP interface default version
     */
    public double getTargetESPInterfaceVersion()
    {
        if (targetESPInterfaceVer == null)
            loadESPRuntimeInterfaceVer();

        return targetESPInterfaceVer;
    }

    /**
     * Stores active connection information for post-initialization use
     *
     * @param conn Connection object
     */
    protected void setActiveConnectionInfo(Connection conn)
    {
        wsconn = conn;
    }


    /**
     * All implementations must provide the target web service URI
     *
     * @return a {@link java.lang.String} object.
     */
    public abstract String getServiceURI();


    protected void setUpBuildVersionParser() throws ParserConfigurationException, XPathExpressionException
    {
        if(m_XMLParser != null && m_buildVersionXpathExpression != null)
            return;

        m_XMLParser = Utils.newSafeXMLDocBuilder();
        if (m_XMLParser == null)
            throw new XPathExpressionException ("Could not create new version parser");

        XPath versionXpath = XPathFactory.newInstance().newXPath();
        m_buildVersionXpathExpression = versionXpath.compile("/ActivityResponse/Build");
        if (m_buildVersionXpathExpression == null)
            throw new XPathExpressionException ("Could not Compile m_buildVersionXpathExpression");

    }

    protected void setUpContainerizedParser() throws ParserConfigurationException, XPathExpressionException
    {
        if(m_XMLParser != null && m_containerizedXpathExpression != null)
            return;

        m_XMLParser = Utils.newSafeXMLDocBuilder();
        if (m_XMLParser == null)
            throw new XPathExpressionException ("Could not create new version parser");

        XPath versionXpath = XPathFactory.newInstance().newXPath();
        m_containerizedXpathExpression = versionXpath.compile("/GetBuildInfoResponse/BuildInfo/NamedValue");
        if (m_containerizedXpathExpression == null)
            throw new XPathExpressionException ("Could not Compile m_containerizedXpathExpression");
    }

    protected void setUpversionParser() throws ParserConfigurationException, XPathExpressionException
    {
        if(m_XMLParser != null && m_serviceInterfaceVersionXpathExpression != null)
            return;

        m_XMLParser = Utils.newSafeXMLDocBuilder();
        if (m_XMLParser == null)
            throw new XPathExpressionException ("Could not create new version parser");

        XPath versionXpath = XPathFactory.newInstance().newXPath();
        m_serviceInterfaceVersionXpathExpression = versionXpath.compile("string(/VersionInfo/Version)");
        if (m_serviceInterfaceVersionXpathExpression == null)
            throw new XPathExpressionException ("Could not Compile versionXpathExpression");

    }
    /**
     * Attempts to retrieve the default WSDL version of the target runtime ESP service
     * Appends the target ESP service path and the "version_" literal to the connection's base URL
     */
    protected void loadESPRuntimeInterfaceVer()
    {
        if (wsconn != null)
        {
            if (getServiceURI() == null || getServiceURI().isEmpty())
                log.warn("Could not load ESP interface version, ensure target ws name is provided");
            else
            {

                String response = null;
                try
                {
                    response = wsconn.sendGetRequest(getServiceURI()+"/version_");
                }
                catch (Exception httpGetException)
                {
                    log.error("Encountered error fetching ESP interface version for " + wsconn.getBaseUrl() + getServiceURI() + "\n" + httpGetException.getLocalizedMessage());
                }

                if (response == null || response.isEmpty())
                {
                    log.error("Received empty ESP interface version response (" + wsconn.getBaseUrl() + getServiceURI() + ")");
                }
                else
                {
                    try
                    {
                        setUpversionParser();
                        Document document = m_XMLParser.parse(new ByteArrayInputStream(response.getBytes(StandardCharsets.UTF_8)));

                        targetESPInterfaceVer = (double)m_serviceInterfaceVersionXpathExpression.evaluate(document, XPathConstants.NUMBER);
                        log.info(wsconn.getBaseUrl() + getServiceURI() + " version: " + targetESPInterfaceVer);
                    }
                    catch (Exception e)
                    {
                        log.error("Encountered error parsing ESP interface version for " + wsconn.getBaseUrl() + getServiceURI() + "\n" + e.getLocalizedMessage());
                    }
                }
            }
        }
        else
        {
            log.warn("Could not load ESP interface version, ensure client is properly initialized");
        }
    }

    /**
     *  Determine if target HPCC's build version is compatible with a given version.
     *
     * @param major a int.
     * @param minor a int.
     * @param point a int.
     * @return boolean true if server build version &gt;= input version
     */
    protected boolean compatibilityCheck(int major, int minor, int point)
    {
        if (targetHPCCBuildVersion == null)
            return false;

        return targetHPCCBuildVersion.isEqualOrNewerThan(major, minor, point);
    }

    /**
     * Determine if target HPCC's build version is compatible with a given version.
     *
     * @param input
     *            the input
     * @return boolean true if server build version &gt;= input version
     */
    protected boolean compatibilityCheck(Version input)
    {
        if (targetHPCCBuildVersion == null || input == null)
            return false;

        return targetHPCCBuildVersion.isEqualOrNewerThan(input);
    }
}
