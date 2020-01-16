package org.hpccsystems.ws.client.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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

                if (creds.length != 2) throw new Exception("Invalid credentials: Should be base64-encoded <username>:<password>");

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

    public final static String  protDelimiter                 = "://";
    public final static char    portDelimiter                 = ':';
    public final static char    pathDelimiter                 = '/';
    public final static char    firstOptDelimiter             = '?';
    public final static char    subsequentOptDelimiter        = '&';

    public final static String  protHttp                      = "http";
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

    final static public String  CONNECT_TIMEOUT_PARAM         = "connecttimeoutmillis";
    final static public String  READ_TIMEOUT_PARAM            = "readtimeoutmillis";
    final static public String  WRITE_TIMEOUT_PARAM           = "writetimeoutmillis";
    final static public String  SOCKET_TIMEOUT_PARAM          = "sockettimeoutmillis";

    final static public int     DEFAULT_CONNECT_TIMEOUT_MILLI = 150000;
    final static public int     DEFAULT_SO_TIMEOUT_MILLI      = 150000;
    final static public int     DEFAULT_WRITE_TIMEOUT_MILLI   = 150000;
    final static public int     DEFAULT_READ_TIMEOUT_MILLI    = 180 * 1000;
    final static boolean        DEFAULT_MAINTAIN_SESSION      = true;

    protected int               connectTimeoutMilli           = DEFAULT_CONNECT_TIMEOUT_MILLI;
    protected int               readTimeoutMilli              = DEFAULT_READ_TIMEOUT_MILLI;
    protected int               writeTimeoutMilli             = DEFAULT_WRITE_TIMEOUT_MILLI;
    protected int               socketTimeoutMilli            = DEFAULT_SO_TIMEOUT_MILLI;

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
     * @throws MalformedURLException
     *             the malformed URL exception
     */
    public Connection(String connectionstring) throws MalformedURLException
    {
        URL theurl = new URL(connectionstring);

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

    /**
     * Sets the protocol.
     *
     * @param protocol_
     *            the new protocol
     */
    private void setProtocol(String protocol_)
    {
        if (protocol_ != null && protocol_.length() > 0)
        {
            protocol = protocol_;
        }
        else
        {
            isHttps = true;
            protocol = protHttp;
        }
    }

    /**
     * Sets the port.
     *
     * @param port_
     *            the new port
     */
    private void setPort(String port_)
    {
        if (port_ != null && port_.length() > 0)
            port = port_;
        else
            port = "";
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
    private void constructUrl()
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
     * @throws Exception
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
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, getUrl());
        result = HashCodeUtil.hash(result, credentials);
        return result;
    }
}
