package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.utils.Utils;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

/**
 * <p>Abstract BaseHPCCWsClient class.</p>
 */
public abstract class BaseHPCCWsClient extends DataSingleton
{
    /** Constant <code>log</code> */
    protected static final Logger         log = Logger.getLogger(BaseHPCCWsClient.class.getName());
    /** Constant <code>DEAFULTECLWATCHPORT="8010"</code> */
    public static final String     DEAFULTECLWATCHPORT = "8010";
    /** Constant <code>DEFAULTECLWATCHTLSPORT="18010"</code> */
    public static final String  DEFAULTECLWATCHTLSPORT = "18010";
    /** Constant <code>DEFAULTSERVICEPORT="DEAFULTECLWATCHPORT"</code> */
    public static String            DEFAULTSERVICEPORT = DEAFULTECLWATCHPORT;

    protected Connection                    fsconn     = null;
    protected boolean                      verbose     = false;
    protected String                initErrMessage     = "";
    protected Version                targetVersion     = null;

    protected Stub stub;
    /**
     * <p>getDefaultStub.</p>
     *
     * @return a {@link org.apache.axis2.client.Stub} object.
     * @throws org.apache.axis2.AxisFault if any.
     */
    abstract public Stub getDefaultStub() throws AxisFault;

    /**
     * <p>getServiceVersion.</p>
     *
     * @param client a {@link org.hpccsystems.ws.client.BaseHPCCWsClient} object.
     * @return a {@link java.lang.String} object.
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
     * <p>getServiceVersion.</p>
     *
     * @param stub a {@link org.apache.axis2.client.Stub} object.
     * @return a {@link java.lang.String} object.
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
     * <p>getServiceWSDLURL.</p>
     *
     * @param stub a {@link org.apache.axis2.client.Stub} object.
     * @return a {@link java.lang.String} object.
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
     * <p>getServiceWSDLPort.</p>
     *
     * @param stub a {@link org.apache.axis2.client.Stub} object.
     * @return a int.
     * @throws java.net.MalformedURLException if any.
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
     * <p>getConnectionURL.</p>
     *
     * @return a {@link java.net.URL} object.
     * @throws java.lang.Exception if any.
     */
    public URL getConnectionURL() throws Exception
    {
        URL address = null;

        verifyStub();
        Options opt = stub._getServiceClient().getOptions();

        EndpointReference toAddress = opt.getTo();
        if (toAddress != null)
            address = new URL(toAddress.getAddress());

        return address;
    }

    /**
     * <p>Setter for the field <code>verbose</code>.</p>
     *
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * <p>Getter for the field <code>verbose</code>.</p>
     *
     * @return true if verbose is on
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
     * @return true if init error message exists
     */
    public boolean hasInitError()
    {
        return !initErrMessage.isEmpty();
    }

    /**
     * Returns error message encountered during initialization of wsdfuclient.
     * Empty string if no error encountered
     *
     * @return init error message
     */
    public String getInitError()
    {
        return initErrMessage;
    }

    /**
     * Provides Stub object if available, otherwise throws
     * Object can be used to access the web service methods directly
     *
     * @return stub
     * @throws java.lang.Exception if any.
     */
    protected Stub verifyStub() throws Exception
    {
        if (stub != null)
            return stub;
        else
            throw new Exception("WS Client Stub not available.");
    }

    /** {@inheritDoc} */
    @Override
    public boolean equals(Object aThat)
    {
        if (this == aThat)
            return true;

        if (!(aThat instanceof BaseHPCCWsClient))
            return false;

        if (!(aThat.getClass().isInstance(this)))
            return false;

        BaseHPCCWsClient that = (BaseHPCCWsClient) aThat;

        Options thatopt;
        try
        {
            Stub thatStub = that.verifyStub();
            thatopt = thatStub._getServiceClient().getOptions();
        }
        catch(Exception e)
        {
            thatopt = null;
        }

        if (thatopt == null)
            return false;

        Options thisoptions = stub._getServiceClient().getOptions();

        HttpTransportPropertiesImpl.Authenticator thisauth = (HttpTransportPropertiesImpl.Authenticator)thisoptions.getProperty(HTTPConstants.AUTHENTICATE);
        HttpTransportPropertiesImpl.Authenticator thatauth = (HttpTransportPropertiesImpl.Authenticator)thatopt.getProperty(HTTPConstants.AUTHENTICATE);

        if (!EqualsUtil.areSameNullState(thisauth, thatauth))
            return false;

        return EqualsUtil.areEqual(thisoptions.getTo().toString(), thatopt.getTo().toString()) &&
               EqualsUtil.areEqual(thisoptions.getProperty(HTTPConstants.SO_TIMEOUT), thatopt.getProperty(HTTPConstants.SO_TIMEOUT)) &&
               EqualsUtil.areEqual(thisoptions.getProperty(HTTPConstants.CONNECTION_TIMEOUT), thatopt.getProperty(HTTPConstants.CONNECTION_TIMEOUT)) &&
               EqualsUtil.areEqual(thisoptions.getProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED), thatopt.getProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED)) &&
               (thisauth != null ? (EqualsUtil.areEqual(thisauth.getUsername(), thatauth.getUsername()) && EqualsUtil.areEqual(thisauth.getPassword(), thatauth.getPassword())) : true);
    }

    /** {@inheritDoc} */
    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        if (hasInitError())
            return result = HashCodeUtil.hash(result, getInitError());

        Options ops = stub._getServiceClient().getOptions();

        result = HashCodeUtil.hash(result, ops.getTo());
        HttpTransportPropertiesImpl.Authenticator thisauth = (HttpTransportPropertiesImpl.Authenticator)ops.getProperty(HTTPConstants.AUTHENTICATE);
        result = HashCodeUtil.hash(result, thisauth==null?"":thisauth.getUsername());
        result = HashCodeUtil.hash(result, thisauth==null?"":thisauth.getPassword());
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.SO_TIMEOUT));
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.CONNECTION_TIMEOUT));

        return result;
    }

    /** {@inheritDoc} */
    @Override
    protected boolean isComplete()
    {
        // TODO Auto-generated method stub
        return false;
    }

    /** {@inheritDoc} */
    @Override
    protected void fastRefresh()
    {
        // TODO Auto-generated method stub
    }

    /** {@inheritDoc} */
    @Override
    protected void fullRefresh()
    {
        // TODO Auto-generated method stub
    }

    /**
     * <p>setStubConnectionTO.</p>
     *
     * @param millis a int.
     * @throws org.apache.axis2.AxisFault if any.
     */
    protected void setStubConnectionTO(int millis) throws AxisFault
    {
        Options opt = stub._getServiceClient().getOptions();

        opt.setProperty(HTTPConstants.CONNECTION_TIMEOUT, millis);

        stub._getServiceClient().setOptions(opt);
    }

    /**
     * <p>getStubConnectionTO.</p>
     *
     * @return a {@link java.lang.Integer} object.
     * @throws org.apache.axis2.AxisFault if any.
     */
    protected Integer getStubConnectionTO() throws AxisFault
    {
        Integer to = null;
        if (stub != null)
        {
            Options opt = stub._getServiceClient().getOptions();
            try
            {
                to = (Integer)opt.getProperty(HTTPConstants.CONNECTION_TIMEOUT);
            }
            catch (Exception e) {}
        }
        return to;
    }

    /**
     * <p>setStubOptions.</p>
     *
     * @param thestub a {@link org.apache.axis2.client.Stub} object.
     * @param connection a {@link org.hpccsystems.ws.client.utils.Connection} object.
     * @return a {@link org.apache.axis2.client.Stub} object.
     * @throws org.apache.axis2.AxisFault if any.
     */
    static public Stub setStubOptions(Stub thestub, Connection connection) throws AxisFault
    {
        Options opt = thestub._getServiceClient().getOptions();

        opt.setProperty(HTTPConstants.SO_TIMEOUT, connection.getSocketTimeoutMilli());
        opt.setProperty(HTTPConstants.CONNECTION_TIMEOUT, connection.getConnectTimeoutMilli());

        opt = setClientAuth(connection.getUserName(), connection.getPassword(), opt);

        opt.setProperty(org.apache.axis2.transport.http.HTTPConstants.CHUNKED, Boolean.FALSE);

        thestub._getServiceClient().setOptions(opt);
        return thestub;
    }

    /**
     * <p>setClientAuth.</p>
     *
     * @param user a {@link java.lang.String} object.
     * @param pass a {@link java.lang.String} object.
     * @param opt a {@link org.apache.axis2.client.Options} object.
     * @return a {@link org.apache.axis2.client.Options} object.
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
     * Logs and throws EspSoapFaultWrapper
     *
     * @param e a {@link org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper} object.
     * @throws org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper if any.
     */
    protected void handleEspSoapFaults(EspSoapFaultWrapper e) throws EspSoapFaultWrapper
    {
        if (e != null)
            handleEspSoapFaults(e,null);
    }

    /**
     * Logs and throws EspSoapFaultWrapper, if local message provided, added as wsclientmessage
     *
     * @param e a {@link org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper} object.
     * @param message a {@link java.lang.String} object.
     * @throws org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper if any.
     */
    protected void handleEspSoapFaults(EspSoapFaultWrapper e, String message) throws EspSoapFaultWrapper
    {
        if (e != null)
        {
            if (message != null && !message.isEmpty())
                e.setWsClientMessage(message);

            log.error(e.toString());
            throw e;
        }
    }

    /**
     * <p>handleEspExceptions.</p>
     *
     * @param exp a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
     * @param message a {@link java.lang.String} object.
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper if any.
     */
    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp, String message) throws ArrayOfEspExceptionWrapper
    {
        if (exp == null || exp.getExceptions() == null || exp.getExceptions().size() <= 0)
            return;

        if (message != null && !message.isEmpty())
            exp.setWsClientMessage(message);

        log.error(exp.toString());
        throw exp;
    }

    /**
     * <p>handleEspExceptions.</p>
     *
     * @param exp a {@link org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper} object.
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper if any.
     */
    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp) throws ArrayOfEspExceptionWrapper
    {
        handleEspExceptions(exp, null);
    }

    /**
     * Logs and throws arrayofeclexceptionwrapper without localized message response from WS client
     *
     * @param eclexceptions
     *            - the array of ECLException objects to throw
     * @throws java.lang.Exception if any.
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper if any.
     */
    protected void handleECLExceptions(ArrayOfECLExceptionWrapper eclexceptions) throws Exception, ArrayOfECLExceptionWrapper
    {
        handleECLExceptions(eclexceptions, null);
    }

    /**
     * Logs and throws arrayofeclexceptionwrapper with localized message response from WS client
     *
     * @param eclExceptions
     *            - the array of ECLException objects to throw
     * @param message
     *            - the prefix message
     * @throws java.lang.Exception if any.
     * @throws org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper if any.
     */
    protected void handleECLExceptions(ArrayOfECLExceptionWrapper eclExceptions, String message) throws Exception, ArrayOfECLExceptionWrapper
    {
        if (eclExceptions == null || eclExceptions.getECLException() == null || eclExceptions.getECLException().size() <= 0)
            return;

        if (message != null && !message.isEmpty())
            eclExceptions.setWsClientMessage(message);

        log.error(eclExceptions.toString());
        throw eclExceptions;
    }
}
