package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.Stub;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient4.HttpTransportPropertiesImpl;
import org.apache.log4j.Logger;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_75.ECLException;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;
import org.hpccsystems.ws.client.wrappers.ArrayOfECLExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.ArrayOfEspExceptionWrapper;
import org.hpccsystems.ws.client.wrappers.EspSoapFaultWrapper;

public abstract class BaseHPCCWsClient extends DataSingleton
{
    protected static final Logger         log = Logger.getLogger(BaseHPCCWsClient.class.getName());

    protected Connection                  fsconn         = null;
    protected boolean                     verbose        = false;
    protected static URL              ORIGINALURL        = null;
    protected String                initErrMessage       = "";
    protected Version               targetVersion        = null;

    protected Stub stub;

     /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static URL getOriginalURL() throws MalformedURLException
    {
        return ORIGINALURL;
    }

    public static String getOriginalWSDLURL()
    {
        String wsdlurl = "";
        if (ORIGINALURL != null)
            wsdlurl = ORIGINALURL.getAuthority();

        return wsdlurl;
    }

    public static String getServiceURI()
    {
        String wsdluri = "";
        if (ORIGINALURL != null)
            wsdluri = ORIGINALURL.getPath();

        return wsdluri;
    }

    public static int getOriginalPort() throws MalformedURLException
    {
        int originalport = 8010;
        if (ORIGINALURL != null)
            originalport = ORIGINALURL.getPort();
        return originalport;
    }

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * @param verbose - sets verbose mode
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
     * Provides Stub object if available, otherwise throws
     * Object can be used to access the web service methods directly
     *
     * @return
     * @throws Exception
     */
    protected Stub verifyStub() throws Exception
    {
        if (stub != null)
            return stub;
        else
            throw new Exception("WS Client Stub not available.");
    }

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

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        if (hasInitError())
            return result = HashCodeUtil.hash(result, getInitError());

        Options ops = stub._getServiceClient().getOptions();

        result = HashCodeUtil.hash(result, ops.getTo());
        HttpTransportPropertiesImpl.Authenticator thisauth = (HttpTransportPropertiesImpl.Authenticator)ops.getProperty(HTTPConstants.AUTHENTICATE);
        result = HashCodeUtil.hash(result, thisauth.getUsername());
        result = HashCodeUtil.hash(result, thisauth.getPassword());
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.SO_TIMEOUT));
        result = HashCodeUtil.hash(result, ops.getProperty(HTTPConstants.CONNECTION_TIMEOUT));

        return result;
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

    protected void setStubConnectionTO(int millis) throws AxisFault
    {
        Options opt = stub._getServiceClient().getOptions();

        opt.setProperty(HTTPConstants.CONNECTION_TIMEOUT, millis);

        stub._getServiceClient().setOptions(opt);
    }

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
     * @param e
     * @param message
     * @throws EspSoapFaultWrapper
     */
    protected void handleEspSoapFaults(EspSoapFaultWrapper e) throws EspSoapFaultWrapper
    {
        if (e != null)
            handleEspSoapFaults(e,null);
    }

    /**
     * Logs and throws EspSoapFaultWrapper, if local message provided, added as wsclientmessage
     * @param e
     * @param message
     * @throws EspSoapFaultWrapper
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

    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp, String message) throws ArrayOfEspExceptionWrapper
    {
        if (exp == null || exp.getExceptions() == null || exp.getExceptions().size() <= 0)
            return;

        if (message != null && !message.isEmpty())
            exp.setWsClientMessage(message);

        log.error(exp.toString());
        throw exp;
    }

    protected void handleEspExceptions(ArrayOfEspExceptionWrapper exp) throws ArrayOfEspExceptionWrapper
    {
        handleEspExceptions(exp, null);
    }

    /**
     * Logs and throws arrayofeclexceptionwrapper without localized message response from WS client
     *
     * @param eclExceptions
     *            - the array of ECLException objects to throw
     * @param message
     *            - the prefix message
     * @throws Exception
     * @throws ArrayOfECLExceptionWrapper
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
     * @throws Exception
     * @throws ArrayOfECLExceptionWrapper
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
