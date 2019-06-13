package org.hpccsystems.ws.client.utils;

import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.apache.log4j.Logger;

public class Connection
{
    private class Credentials
    {
        private String             userName     = null;
        private String             password     = null;
        private boolean            isPopulated  = false;

        public boolean isPopulated()
        {
            return isPopulated;
        }

        public String getUserName()
        {
            return userName;
        }

        public void setUserName(String username)
        {
            if (username != null && username.length() >0 )
            {
                this.userName = username;
                if (password != null)
                    isPopulated = true;
                else
                    isPopulated = false;
            }
        }

        public String getPassword()
        {
            return password;
        }

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

        public String getEncodedCreds()
        {
            if (!isPopulated)
                return null;
            else
            {
                Encoder encoder = Base64.getEncoder();
                return new String(encoder.encode((userName+":"+password).getBytes()));
            }
        }

        public void setEncodedCreds(String encodedCreds) throws Exception
        {
            if (encodedCreds != null && encodedCreds.length() > 0)
            {
                this.password = null;
                this.userName = null;
                Decoder decoder = Base64.getDecoder();
                String credstring=new String(decoder.decode(encodedCreds));
                String[] creds = credstring.split(":");

                if (creds.length != 2)
                    throw new Exception("Invalid credentials: Should be base64-encoded <username>:<password>");

                this.userName=creds[0];
                this.password=creds[1];
                isPopulated = true;
            }
        }

        public void setCredentials(String username, String password)
        {
            if (username != null && username.length() > 0 && password != null)
            {
                this.userName = username;
                this.password = password;
                isPopulated = true;
            }
        }

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

    private final static Logger log                   = Logger.getLogger(Connection.class.getName());

    public final static String protDelimiter          = "://";
    public final static char   portDelimiter          = ':';
    public final static char   pathDelimiter          = '/';
    public final static char   firstOptDelimiter      = '?';
    public final static char   subsequentOptDelimiter = '&';

    public final static String protHttp               = "http";
    public final static String protHttps              = "https";

    private String             protocol;
    private String             host;
    private String             port;
    private String             path;
    private String[]           options;
    private Credentials        credentials            = null;
    private boolean            isHttps                = false;
    private boolean            allowInvalidCerts      = false;

    private StringBuffer       baseUrl;
    private StringBuffer       uriAndParams;

    final static public String  CONNECT_TIMEOUT_PARAM  = "connecttimeoutmillis";
    final static public String  READ_TIMEOUT_PARAM  = "readtimeoutmillis";
    final static public String  WRITE_TIMEOUT_PARAM  = "writetimeoutmillis";
    final static public String  SOCKET_TIMEOUT_PARAM  = "sockettimeoutmillis";

    final static public int  DEFAULT_CONNECT_TIMEOUT_MILLI  = 150000;
    final static public int  DEFAULT_SO_TIMEOUT_MILLI       = 150000;
    final static public int  DEFAULT_WRITE_TIMEOUT_MILLI    = 150000;
    final static public int  DEFAULT_READ_TIMEOUT_MILLI     = 180 * 1000;
    final static boolean     DEFAULT_MAINTAIN_SESSION       = true;

    protected int               connectTimeoutMilli         = DEFAULT_CONNECT_TIMEOUT_MILLI;
    protected int               readTimeoutMilli            = DEFAULT_READ_TIMEOUT_MILLI;
    protected int               writeTimeoutMilli           = DEFAULT_WRITE_TIMEOUT_MILLI;
    protected int               socketTimeoutMilli          = DEFAULT_SO_TIMEOUT_MILLI;


    public static String getProtocol(boolean ssl)
    {
        return ssl ? protHttps : protHttp;
    }

    public static boolean isSslProtocol(String protocol)
    {
        return protHttps.equalsIgnoreCase(protocol);
    }

    /**
     *
     * @param connectionstring as defined by java.net.URL
     * @throws MalformedURLException
     * @throws Exception
     */
    public Connection(String connectionstring) throws MalformedURLException
    {
        URL theurl = new URL(connectionstring);

        setProtocol(theurl.getProtocol());

        host = theurl.getHost();
        if (theurl.getPort() < 0)
            throw new MalformedURLException("Invalid port encountered: '" + theurl.getPort() + "'" );

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

    public Connection(boolean ssl, String host, int port)
    {
        this(getProtocol(ssl), host, String.valueOf(port), null, null);
    }

    public Connection(String protocol, String host, String port)
    {
        this(protocol, host, port, null, null);
    }

    public Connection(String protocol, String host, String port, String path)
    {
        this(protocol, host, port, path, null);
    }


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

    private void processOptions()
    {
        if (options != null && options.length != 0) //look for some known options, mainly timeouts
        {
            for (int i = 0; i < options.length; i++)
            {
                String [] kvoptions = options[i].split("=");
                if (kvoptions.length == 2)
                {
                    if (kvoptions[0].equalsIgnoreCase(CONNECT_TIMEOUT_PARAM))
                        connectTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(READ_TIMEOUT_PARAM))
                        readTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(WRITE_TIMEOUT_PARAM))
                        writeTimeoutMilli = Integer.valueOf(kvoptions[1]);
                    else if (kvoptions[0].equalsIgnoreCase(SOCKET_TIMEOUT_PARAM))
                        socketTimeoutMilli = Integer.valueOf(kvoptions[1]);
                }
            }
        }
    }

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

    private void setPort(String port_)
    {
        if (port_ != null && port_.length() > 0)
            port = port_;
        else
            port = "";
    }

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

    public String getUrl()
    {
        return baseUrl.toString()+uriAndParams.toString();
    }

    public String getBaseUrl()
    {
        return baseUrl.toString();
    }

    public boolean hasCredentials()
    {
        return credentials.isPopulated();
    }

    public void setEncodedCredentials(String encodedcreds) throws Exception
    {
        synchronized (credentials)
        {
            credentials.setEncodedCreds(encodedcreds);
        }
    }

    /**
     * @return String - "Basic " + encoded credentials, null if no credentials set
     */
    public String getBasicAuthString()
    {
        if (!credentials.isPopulated)
            return null;

        synchronized (credentials)
        {
            return "Basic " + credentials.getEncodedCreds();
        }
    }

    public String getHost()
    {
        return this.host;
    }

    public String getPort()
    {
        return this.port;
    }

    public int getPortInt()
    {
        if (port!=null && !port.isEmpty())
            return Integer.valueOf(port);
        else
            return -1;
    }

    public String getUserName()
    {
        synchronized (credentials)
        {
            return credentials.getUserName();
        }
    }

    public void setUserName(String userName)
    {
        synchronized (credentials)
        {
            credentials.setUserName(userName);
        }
    }

    public String getPassword()
    {
        synchronized (credentials)
        {
            return credentials.getPassword();
        }
    }

    public void setPassword(String password)
    {
        synchronized (credentials)
        {
            credentials.setPassword(password);
        }
    }

    public String getProtocol()
    {
        return protocol;
    }

    public Boolean getIsHttps()
    {
        return isHttps;
    }

    public boolean getAllowInvalidCerts()
    {
        return allowInvalidCerts;
    }

    public void setAllowInvalidCerts(boolean allowInvalidCerts)
    {
        this.allowInvalidCerts = allowInvalidCerts;
    }

    public void setCredentials(String username, String password)
    {
        synchronized (credentials)
        {
            credentials.setCredentials (username, password);
        }
    }

    public Credentials getCredentials()
    {
        synchronized (credentials)
        {
            return credentials;
        }
    }

    /**
     *
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
     */
    public static URLConnection createConnection(URL url)
            throws java.io.IOException
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
        urlConn.setRequestProperty("Accept",  "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        urlConn.setRequestProperty("ENCTYPE", "multipart/form-data");
        urlConn.setAllowUserInteraction(false);

        return urlConn;
    }

    static public String buildUrl(String protocol, String host, String port)
    {
        return buildUrl(protocol, host, port, null, null);
    }

    static public String buildUrl(String protocol, String host, String port, String path)
    {
        return buildUrl(protocol, host, port, path, null);
    }

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
     * @return the connectTimeoutMilli
     */
    public int getConnectTimeoutMilli()
    {
        return connectTimeoutMilli;
    }

    /**
     * @param connectTimeoutMilli the connectTimeoutMilli to set
     */
    public void setConnectTimeoutMilli(int connectTimeoutMilli)
    {
        this.connectTimeoutMilli = connectTimeoutMilli;
    }

    /**
     * @return the readTimeoutMilli
     */
    public int getReadTimeoutMilli()
    {
        return readTimeoutMilli;
    }

    /**
     * @param readTimeoutMilli the readTimeoutMilli to set
     */
    public void setReadTimeoutMilli(int readTimeoutMilli)
    {
        this.readTimeoutMilli = readTimeoutMilli;
    }

    /**
     * @return the writeTimeoutMilli
     */
    public int getWriteTimeoutMilli()
    {
        return writeTimeoutMilli;
    }

    /**
     * @param writeTimeoutMilli the writeTimeoutMilli to set
     */
    public void setWriteTimeoutMilli(int writeTimeoutMilli)
    {
        this.writeTimeoutMilli = writeTimeoutMilli;
    }

    /**
     * @return the socketTimeoutMilli
     */
    public int getSocketTimeoutMilli()
    {
        return socketTimeoutMilli;
    }

    /**
     * @param socketTimeoutMilli the socketTimeoutMilli to set
     */
    public void setSocketTimeoutMilli(int socketTimeoutMilli)
    {
        this.socketTimeoutMilli = socketTimeoutMilli;
    }

    public String toString()
    {
        return buildUrl(protocol, host, port, path, options);
    }

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

        return EqualsUtil.areEqual( getUrl(), that.getUrl()) && EqualsUtil.areEqual( credentials, that.getCredentials());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, getUrl());
        result = HashCodeUtil.hash(result, credentials);
        return result;
    }
}
