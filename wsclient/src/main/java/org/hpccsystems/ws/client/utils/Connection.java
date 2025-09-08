package org.hpccsystems.ws.client.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hpccsystems.ws.client.BaseHPCCWsClient;

import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.context.Scope;
import io.opentelemetry.instrumentation.annotations.SpanAttribute;
import io.opentelemetry.instrumentation.annotations.WithSpan;
import io.opentelemetry.semconv.HttpAttributes;
import io.opentelemetry.semconv.ServerAttributes;

/**
 * Represents and structures connection information.
 *
 * Facilitates HPCC connectivity, provides several convenience methods such as credential encoding,
 * connection URL parsing, and others.
 */
public class Connection
{
    private class Credentials
    {
        private String  userName    = null;
        private String  password    = null;
        private boolean isPopulated = false;

        /**
         * Checks if is populated.
         *
         * @return true, if is populated
         */
        public boolean isPopulated()
        {
            return isPopulated;
        }

        /**
         * Gets the user name.
         *
         * @return the user name
         */
        public String getUserName()
        {
            return userName;
        }

        /**
         * Sets the user name.
         *
         * @param username
         *            the new user name
         */
        public void setUserName(String username)
        {
            if (username != null && username.length() > 0)
            {
                this.userName = username;
                if (password != null)
                    isPopulated = true;
                else
                    isPopulated = false;
            }
        }

        /**
         * Gets the password.
         *
         * @return the password
         */
        public String getPassword()
        {
            return password;
        }

        /**
         * Sets the password.
         *
         * @param password
         *            the new password
         */
        public void setPassword(String password)
        {
            if (password != null)
            {
                this.password = password;
                if (userName != null && userName.length() > 0)
                    isPopulated = true;
                else
                    isPopulated = false;
            }
        }

        /**
         * Gets the encoded creds.
         *
         * @return the encoded creds
         */
        public String getEncodedCreds()
        {
            if (!isPopulated)
                return null;
            else
            {
                Encoder encoder = Base64.getEncoder();
                return new String(encoder.encode((userName + ":" + password).getBytes()));
            }
        }

        /**
         * Sets the encoded creds.
         *
         * @param encodedCreds
         *            the new encoded creds
         * @throws Exception
         *             the exception
         */
        public void setEncodedCreds(String encodedCreds) throws Exception
        {
            if (encodedCreds != null && encodedCreds.length() > 0)
            {
                this.password = null;
                this.userName = null;
                Decoder decoder = Base64.getDecoder();
                String credstring = new String(decoder.decode(encodedCreds));
                String[] creds = credstring.split(":");

                if (creds.length != 2)
                    throw new Exception("Invalid credentials: Should be base64-encoded <username>:<password>");

                this.userName = creds[0];
                this.password = creds[1];
                isPopulated = true;
            }
        }

        /**
         * Sets the credentials.
         *
         * @param username
         *            the username
         * @param password
         *            the password
         */
        public void setCredentials(String username, String password)
        {
            if (username != null && username.length() > 0 && password != null)
            {
                this.userName = username;
                this.password = password;
                isPopulated = true;
            }
        }

        /*
         * (non-Javadoc)
         *
         * @see java.lang.Object#hashCode()
         */
        @Override
        public int hashCode()
        {
            int result = HashCodeUtil.SEED;
            result = HashCodeUtil.hash(result, getProtocol());
            result = HashCodeUtil.hash(result, getHost());
            result = HashCodeUtil.hash(result, getPortInt());
            result = HashCodeUtil.hash(result, getUserName());
            result = HashCodeUtil.hash(result, getPassword());
            return result;
        }
    }

    private final static Logger log                           = LogManager.getLogger(Connection.class);

    /** Constant <code>protDelimiter="://"</code> */
    public final static String  protDelimiter                 = "://";
    /** Constant <code>portDelimiter=':'</code> */
    public final static char    portDelimiter                 = ':';
    /** Constant <code>pathDelimiter='/'</code> */
    public final static char    pathDelimiter                 = '/';
    /** Constant <code>firstOptDelimiter='?'</code> */
    public final static char    firstOptDelimiter             = '?';
    /** Constant <code>subsequentOptDelimiter='&amp;'</code> */
    public final static char    subsequentOptDelimiter        = '&';

    /** Constant <code>protHttp="http"</code> */
    public final static String  protHttp                      = "http";
    /** Constant <code>protHttps="https"</code> */
    public final static String  protHttps                     = "https";

    private String              protocol;
    private String              host;
    private String              port;
    private String              path;
    private String[]            options;
    private Credentials         credentials                   = null;
    private boolean             isHttps                       = false;
    private boolean             allowInvalidCerts             = false;

    private StringBuffer        baseUrl;
    private StringBuffer        uriAndParams;

    // Note: this pattern is very basic and is only meant to extract hostnames from URLs
    public final static Pattern URL_HOSTNAME_PATTERN = Pattern.compile("((https?|ftp|file):\\/\\/)?(?<hostname>([\\da-z\\.\\-_]+)(\\.[a-z\\.]{2,6})?)(:\\d{2,6})?.*");

    /** Constant <code>CONNECT_TIMEOUT_PARAM="connecttimeoutmillis"</code> */
    final static public String  CONNECT_TIMEOUT_PARAM         = "connecttimeoutmillis";
    /** Constant <code>READ_TIMEOUT_PARAM="readtimeoutmillis"</code> */
    final static public String  READ_TIMEOUT_PARAM            = "readtimeoutmillis";
    /** Constant <code>WRITE_TIMEOUT_PARAM="writetimeoutmillis"</code> */
    final static public String  WRITE_TIMEOUT_PARAM           = "writetimeoutmillis";
    /** Constant <code>SOCKET_TIMEOUT_PARAM="sockettimeoutmillis"</code> */
    final static public String  SOCKET_TIMEOUT_PARAM          = "sockettimeoutmillis";

    /** Constant <code>DEFAULT_CONNECT_TIMEOUT_MILLI=150000</code> */
    final static public int     DEFAULT_CONNECT_TIMEOUT_MILLI = 150000;
    /** Constant <code>DEFAULT_SO_TIMEOUT_MILLI=150000</code> */
    final static public int     DEFAULT_SO_TIMEOUT_MILLI      = 150000;
    /** Constant <code>DEFAULT_WRITE_TIMEOUT_MILLI=150000</code> */
    final static public int     DEFAULT_WRITE_TIMEOUT_MILLI   = 150000;
    /** Constant <code>DEFAULT_READ_TIMEOUT_MILLI=180 * 1000</code> */
    final static public int     DEFAULT_READ_TIMEOUT_MILLI    = 180 * 1000;
    final static boolean        DEFAULT_MAINTAIN_SESSION      = true;

    protected int               connectTimeoutMilli           = DEFAULT_CONNECT_TIMEOUT_MILLI;
    protected int               readTimeoutMilli              = DEFAULT_READ_TIMEOUT_MILLI;
    protected int               writeTimeoutMilli             = DEFAULT_WRITE_TIMEOUT_MILLI;
    protected int               socketTimeoutMilli            = DEFAULT_SO_TIMEOUT_MILLI;

    private boolean             preemptiveHTTPAuthenticate    = true;


    /**
     * Sets option to pre-emptively process HTTP authentication
     *
     * @param preemtiveauth
     *               Flag determining if pre-emptive HTTP authentication should be processed before connection is challenged
     */
    public void setPreemptiveHTTPAuthenticate(boolean preemtiveauth)
    {
        preemptiveHTTPAuthenticate = preemtiveauth;
    }

    /**
     * Returns option to pre-emptively process HTTP Authentication
     * @return
     *       Flag determining if pre-emptive HTTP authentication should be processed before connection is challenged
     */
    public boolean getPreemptiveHTTPAuthenticate()
    {
        return preemptiveHTTPAuthenticate;
    }

    /**
     * Gets the protocol.
     *
     * @param ssl
     *            the ssl
     * @return the protocol
     */
    public static String getProtocol(boolean ssl)
    {
        return ssl ? protHttps : protHttp;
    }

    /**
     * Checks if is ssl protocol.
     *
     * @param protocol
     *            the protocol
     * @return true, if is ssl protocol
     */
    public static boolean isSslProtocol(String protocol)
    {
        return protHttps.equalsIgnoreCase(protocol);
    }

    /**
     * Instantiates a new connection.
     *
     * @param connectionstring
     *            as defined by java.net.URL
     * @throws java.net.MalformedURLException
     *             the malformed URL exception
     */
    public Connection(String connectionstring) throws MalformedURLException
    {
        URL theurl = null;
        try
        {
            theurl = new URL(connectionstring);
        }
        catch (MalformedURLException e)
        {
            Matcher matcher = URL_HOSTNAME_PATTERN.matcher(connectionstring);
            if (matcher.matches())
            {
                String hostName = matcher.group("hostname");
                if (hostName.contains("_"))
                {
                    throw new MalformedURLException("Invalid URL: Hostname contains invalid underscores: '" + connectionstring + "': " + e.getMessage());
                }
            }
            else
            {
                throw e;
            }
        }

        setProtocol(theurl.getProtocol());

        host = theurl.getHost();
        if (theurl.getPort() < 0) throw new MalformedURLException("Invalid port encountered: '" + theurl.getPort() + "'");

        setPort(Integer.toString(theurl.getPort()));
        setURIPath(theurl.getPath());

        options = null;
        if (theurl.getQuery() != null)
        {
            options = theurl.getQuery().split("&");
            processOptions();
        }

        constructUrl();

        credentials = new Credentials();
    }

    /**
     * Instantiates a new connection.
     *
     * @param ssl
     *            the ssl
     * @param host
     *            the host
     * @param port
     *            the port
     */
    public Connection(boolean ssl, String host, int port)
    {
        this(getProtocol(ssl), host, String.valueOf(port), null, null);
    }

    /**
     * Instantiates a new connection.
     *
     * @param protocol
     *            the protocol
     * @param host
     *            the host
     * @param port
     *            the port
     */
    public Connection(String protocol, String host, String port)
    {
        this(protocol, host, port, null, null);
    }

    /**
     * Instantiates a new connection.
     *
     * @param protocol
     *            the protocol
     * @param host
     *            the host
     * @param port
     *            the port
     * @param path
     *            the path
     */
    public Connection(String protocol, String host, String port, String path)
    {
        this(protocol, host, port, path, null);
    }

    /**
     * Instantiates a new connection.
     *
     * @param protocol_
     *            the protocol
     * @param host_
     *            the host
     * @param port_
     *            the port
     * @param path_
     *            the path
     * @param options_
     *            the options
     */
    public Connection(String protocol_, String host_, String port_, String path_, String[] options_)
    {
        setProtocol(protocol_);

        host = host_;
        setPort(port_);
        setURIPath(path_);

        options = options_;

        processOptions();

        constructUrl();

        credentials = new Credentials();
    }

    /**
     * Process options.
     */
    private void processOptions()
    {
        if (options != null && options.length != 0) // look for some known options, mainly timeouts
        {
            for (int i = 0; i < options.length; i++)
            {
                String[] kvoptions = options[i].split("=");
                if (kvoptions.length == 2)
                {
                    if (kvoptions[0].equalsIgnoreCase(CONNECT_TIMEOUT_PARAM))
                        connectTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(READ_TIMEOUT_PARAM))
                        readTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(WRITE_TIMEOUT_PARAM))
                        writeTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(SOCKET_TIMEOUT_PARAM)) socketTimeoutMilli = Integer.valueOf(kvoptions[1]);
                }
            }
        }
    }

    private void setHTTPProtocol(boolean https)
    {
        if (https)
        {
            isHttps = true;
            protocol = protHttps;
        }
        else
        {
            isHttps = false;
            protocol = protHttp;
        }

    }

    /**
     * Sets the protocol. If invalid protocol detected, defaults to http
     *
     * @param protocol_
     *            the new protocol ("http" || "https")
     */
    private void setProtocol(String protocol_)
    {
        if (protocol_ != null && protocol_.length() > 0)
        {
            if (protocol_.equalsIgnoreCase(protHttps))
            {
                setHTTPProtocol(true);
                return;
            }
        }

        setHTTPProtocol(false);
    }

    /**
     * Sets the port.
     *
     * @param port_
     *            the new port
     */
    public void setPort(String port_)
    {
        boolean hasChanged = false;

        if (port_ != null && !port_.isEmpty())
        {
            if (port != null && !port.equals(port_))
                hasChanged = true;

            port = port_;
        }
        else
        {
            if (port != null && !port.isEmpty())
                hasChanged = true;

            port = "";
        }

        if(baseUrl != null && !baseUrl.isEmpty() && hasChanged)
            constructUrl();
    }

    /**
     * Sets the URI path.
     *
     * @param path
     *            the new URI path
     */
    private void setURIPath(String path)
    {
        if (path != null && path.length() > 0)
        {
            if (path.charAt(0) == pathDelimiter)
                this.path = path;
            else
                this.path = pathDelimiter + path;
        }
        else
            this.path = "";
    }

    /**
     * Construct url.
     */
    public void constructUrl()
    {
        baseUrl = new StringBuffer();
        baseUrl.append(protocol).append(protDelimiter);
        baseUrl.append(host);
        baseUrl.append(port.length() > 0 ? portDelimiter + port : "");

        uriAndParams = new StringBuffer();
        uriAndParams.append(path);

        if (options != null)
        {
            for (int i = 0; i < options.length; i++)
            {
                if (i == 0)
                    uriAndParams.append(firstOptDelimiter);
                else
                    uriAndParams.append(subsequentOptDelimiter);

                try
                {
                    uriAndParams.append(URLEncoder.encode(options[i], "UTF-8"));
                }
                catch (UnsupportedEncodingException e)
                {
                    log.warn("Warning: could not encode URL option: " + options[i]);
                    uriAndParams.append(options[i]);
                }
            }
        }
    }

    /**
     * Gets the url.
     *
     * @return the url
     */
    public String getUrl()
    {
        return baseUrl.toString() + uriAndParams.toString();
    }

    /**
     * Gets the base url.
     *
     * @return the base url
     */
    public String getBaseUrl()
    {
        return baseUrl.toString();
    }

    /**
     * Checks for credentials.
     *
     * @return true, if successful
     */
    public boolean hasCredentials()
    {
        return credentials.isPopulated();
    }

    /**
     * Sets the encoded credentials.
     *
     * @param encodedcreds
     *            the new encoded credentials
     * @throws java.lang.Exception
     *             the exception
     */
    public void setEncodedCredentials(String encodedcreds) throws Exception
    {
        synchronized (credentials)
        {
            credentials.setEncodedCreds(encodedcreds);
        }
    }

    /**
     * Gets the basic auth string.
     *
     * @return String - "Basic " + encoded credentials, null if no credentials set
     */
    public String getBasicAuthString()
    {
        if (!credentials.isPopulated) return null;

        synchronized (credentials)
        {
            return "Basic " + credentials.getEncodedCreds();
        }
    }

    /**
     * Gets the host.
     *
     * @return the host
     */
    public String getHost()
    {
        return this.host;
    }

    /**
     * Gets the port.
     *
     * @return the port
     */
    public String getPort()
    {
        return this.port;
    }

    /**
     * Gets the port int.
     *
     * @return the port int
     */
    public int getPortInt()
    {
        if (port != null && !port.isEmpty())
            return Integer.valueOf(port);
        else
            return -1;
    }

    /**
     * Gets the user name.
     *
     * @return the user name
     */
    public String getUserName()
    {
        synchronized (credentials)
        {
            return credentials.getUserName();
        }
    }

    /**
     * Sets the user name.
     *
     * @param userName
     *            the new user name
     */
    public void setUserName(String userName)
    {
        synchronized (credentials)
        {
            credentials.setUserName(userName);
        }
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public String getPassword()
    {
        synchronized (credentials)
        {
            return credentials.getPassword();
        }
    }

    /**
     * Sets the password.
     *
     * @param password
     *            the new password
     */
    public void setPassword(String password)
    {
        synchronized (credentials)
        {
            credentials.setPassword(password);
        }
    }

    /**
     * Gets the protocol.
     *
     * @return the protocol
     */
    public String getProtocol()
    {
        return protocol;
    }

    /**
     * Gets the checks if is https.
     *
     * @return the checks if is https
     */
    public Boolean getIsHttps()
    {
        return isHttps;
    }

    /**
     * Gets the allow invalid certs.
     *
     * @return the allow invalid certs
     */
    public boolean getAllowInvalidCerts()
    {
        return allowInvalidCerts;
    }

    /**
     * Sets the allow invalid certs.
     *
     * @param allowInvalidCerts
     *            the new allow invalid certs
     */
    public void setAllowInvalidCerts(boolean allowInvalidCerts)
    {
        this.allowInvalidCerts = allowInvalidCerts;
    }

    /**
     * Sets the credentials.
     *
     * @param username
     *            the username
     * @param password
     *            the password
     */
    public void setCredentials(String username, String password)
    {
        synchronized (credentials)
        {
            credentials.setCredentials(username, password);
        }
    }

    /**
     * Gets the credentials.
     *
     * @return the credentials
     */
    public Credentials getCredentials()
    {
        synchronized (credentials)
        {
            return credentials;
        }
    }

    /**
     * Creates the connection.
     *
     * @return the URL connection
     * @throws java.io.IOException
     *             Signals that an I/O exception has occurred.
     */
    public URLConnection createConnection() throws java.io.IOException
    {
        return createConnection(new URL(baseUrl.toString()));
    }

    /**
     * Creates a new <code>java.net.URLConnection</code> object from the
     * specified <code>java.net.URL</code>. This is a convenience method which
     * will set the <code>doInput</code>, <code>doOutput</code>,
     * <code>useCaches</code> and <code>defaultUseCaches</code> fields to the
     * appropriate settings in the correct order.
     *
     * @param url
     *            the url
     * @return the URL connection
     * @throws java.io.IOException
     *             Signals that an I/O exception has occurred.
     */
    public static URLConnection createConnection(URL url) throws java.io.IOException
    {

        URLConnection urlConn = url.openConnection();
        if (urlConn instanceof HttpURLConnection)
        {
            HttpURLConnection httpConn = (HttpURLConnection) urlConn;
            httpConn.setRequestMethod("POST");
            HttpURLConnection.setFollowRedirects(false);
        }

        urlConn.setDoOutput(true);
        urlConn.setDoInput(true);
        urlConn.setUseCaches(false);
        urlConn.setDefaultUseCaches(false);
        urlConn.setRequestProperty("Connection", "Keep-Alive");
        urlConn.setRequestProperty("DNT", "1");
        urlConn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        urlConn.setRequestProperty("ENCTYPE", "multipart/form-data");
        urlConn.setAllowUserInteraction(false);

        return urlConn;
    }

    /**
     * Builds the url.
     *
     * @param protocol
     *            the protocol
     * @param host
     *            the host
     * @param port
     *            the port
     * @return the string
     */
    static public String buildUrl(String protocol, String host, String port)
    {
        return buildUrl(protocol, host, port, null, null);
    }

    /**
     * Builds the url.
     *
     * @param protocol
     *            the protocol
     * @param host
     *            the host
     * @param port
     *            the port
     * @param path
     *            the path
     * @return the string
     */
    static public String buildUrl(String protocol, String host, String port, String path)
    {
        return buildUrl(protocol, host, port, path, null);
    }

    /**
     * Builds the url.
     *
     * @param protocol
     *            the protocol
     * @param host
     *            the host
     * @param port
     *            the port
     * @param path
     *            the path
     * @param options
     *            the options
     * @return the string
     */
    static public String buildUrl(String protocol, String host, String port, String path, String[] options)
    {
        StringBuffer url = new StringBuffer();
        url.append((protocol != null && protocol.length() > 0) ? protocol : protHttp).append(protDelimiter);
        url.append(host);
        url.append((port != null && port.length() > 0) ? portDelimiter + port : "");
        url.append((path != null && path.length() > 0) ? (path.charAt(0) == pathDelimiter) ? path : pathDelimiter + path : "");

        if (options != null)
        {
            for (int i = 0; i < options.length; i++)
            {
                if (i == 0)
                    url.append(firstOptDelimiter);
                else
                    url.append(subsequentOptDelimiter);

                try
                {
                    url.append(URLEncoder.encode(options[i], "UTF-8"));
                }
                catch (UnsupportedEncodingException e)
                {
                    log.warn("Warning: could not encode URL option: " + options[i]);
                    url.append(options[i]);
                }
            }
        }

        return url.toString();
    }

    /**
     * Gets the connect timeout milli.
     *
     * @return the connectTimeoutMilli
     */
    public int getConnectTimeoutMilli()
    {
        return connectTimeoutMilli;
    }

    /**
     * Sets the connect timeout milli.
     *
     * @param connectTimeoutMilli
     *            the connectTimeoutMilli to set
     */
    public void setConnectTimeoutMilli(int connectTimeoutMilli)
    {
        this.connectTimeoutMilli = connectTimeoutMilli;
    }

    /**
     * Gets the read timeout milli.
     *
     * @return the readTimeoutMilli
     */
    public int getReadTimeoutMilli()
    {
        return readTimeoutMilli;
    }

    /**
     * Sets the read timeout milli.
     *
     * @param readTimeoutMilli
     *            the readTimeoutMilli to set
     */
    public void setReadTimeoutMilli(int readTimeoutMilli)
    {
        this.readTimeoutMilli = readTimeoutMilli;
    }

    /**
     * Gets the write timeout milli.
     *
     * @return the writeTimeoutMilli
     */
    public int getWriteTimeoutMilli()
    {
        return writeTimeoutMilli;
    }

    /**
     * Sets the write timeout milli.
     *
     * @param writeTimeoutMilli
     *            the writeTimeoutMilli to set
     */
    public void setWriteTimeoutMilli(int writeTimeoutMilli)
    {
        this.writeTimeoutMilli = writeTimeoutMilli;
    }

    /**
     * Gets the socket timeout milli.
     *
     * @return the socketTimeoutMilli
     */
    public int getSocketTimeoutMilli()
    {
        return socketTimeoutMilli;
    }

    /**
     * Sets the socket timeout milli.
     *
     * @param socketTimeoutMilli
     *            the socketTimeoutMilli to set
     */
    public void setSocketTimeoutMilli(int socketTimeoutMilli)
    {
        this.socketTimeoutMilli = socketTimeoutMilli;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    /** {@inheritDoc} */
    @Override
    public String toString()
    {
        return buildUrl(protocol, host, port, path, options);
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#equals(java.lang.Object)
     */
    /** {@inheritDoc} */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
        {
            return true;
        }

        if (!(aThat instanceof Connection))
        {
            return false;
        }

        Connection that = (Connection) aThat;

        return EqualsUtil.areEqual(getUrl(), that.getUrl()) && EqualsUtil.areEqual(credentials, that.getCredentials());
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#hashCode()
     */
    /** {@inheritDoc} */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, getUrl());
        result = HashCodeUtil.hash(result, credentials);
        return result;
    }

    /**
     * Sends HTTP Get request to connection's URL + uri
     * Returns entire response payload
     *
     * @param uri - Appended to connection URL
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link java.lang.String} object.
     */
    public String sendGetRequest(String uri) throws Exception
    {
        return sendHTTPRequest(uri, "GET");
    }

    /**
     * Sends HTTP request to connection's URL + uri
     * Caller specifies the desired HTTP method
     *
     * Returns entire response payload
     *
     * @param uri a {@link java.lang.String} object.
     * @param method - One of GET|POST|HEAD|OPTIONS|PUT|DELETE|TRACE
     * @throws Exception a {@link java.lang.Exception} object.
     * @return a {@link java.lang.String} object.
     */
    @WithSpan
    public String sendHTTPRequest(@SpanAttribute String uri, @SpanAttribute String method) throws Exception
    {
        if (method == null || method.isEmpty())
            throw new Exception ("Must provide valid HTTP method");

        URL url = new URL (getBaseUrl() + (uri != null && uri.startsWith("/") ? "" : "/") + uri);

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection(); //throws IOException

        Connection.log.info("Sending HTTP " + method + "Request to:" + url.toString());

        boolean isTraced = Span.current().isRecording();
        if (hasCredentials())
        {
            httpURLConnection.setRequestProperty("Authorization", getBasicAuthString());
            if (isTraced)
                Span.current().setAttribute("hasCredentials", true);
        }
        else
        {
            if (isTraced)
                Span.current().setAttribute("hasCredentials", false);
        }

        if (isTraced)
             httpURLConnection.setRequestProperty("traceparent", Utils.getCurrentSpanTraceParentHeader());

        httpURLConnection.setRequestMethod(method); //throws ProtocolException

        int responseCode = httpURLConnection.getResponseCode(); //throws IOException

        Connection.log.info("HTTP Response code: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) //success
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream())); //throws IOException
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) // throws IOException
            {
                response.append(inputLine);
            }

            in.close(); //throws IOException

            return response.toString();
        }
        else
        {
            throw new IOException("HTTP request failed! Code (" + responseCode + ") " + httpURLConnection.getResponseMessage() );
        }
    }
}
