package org.hpccsystems.ws.client;

import java.net.MalformedURLException;
import java.net.URL;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.ECLDirectException;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoap;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectServiceSoapProxy;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExFormat;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExRequest;
import org.hpccsystems.ws.client.gen.ecldirect.v1_0.RunEclExResponse;
import org.hpccsystems.ws.client.platform.WorkunitInfo;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.utils.DataSingleton;
import org.hpccsystems.ws.client.utils.EqualsUtil;
import org.hpccsystems.ws.client.utils.HashCodeUtil;

/**
 * Use as soap client for HPCC ECLDirect web service.
 * This includes submiting an ecl query for compilation/execution.
 *
 */
public class HPCCECLDirectClient extends DataSingleton
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

    public static HPCCECLDirectClient get(Connection connection)
    {
        return new HPCCECLDirectClient(connection);
    }

    public static final String ECLDIRECTWSDLURI     = "/EclDirect";
    private EclDirectServiceSoapProxy     wsEclDirectServiceSoapProxy = null;
    private boolean verbose = false;
    public static final int noresultlimit = -1;

    /**
     * @param verbose - sets verbose mode
     */
    public void setVerbose(boolean verbose)
    {
        this.verbose = verbose;
    }

    /**
     * Provides soapproxy object for WsECLDirectClient which can be used to access
     * the web service methods directly
     * @return  soapproxy for WsECLDirectClient
     * @throws Exception
     */
    public EclDirectServiceSoapProxy getSoapProxy() throws Exception
    {
        if (wsEclDirectServiceSoapProxy != null)
            return wsEclDirectServiceSoapProxy;
        else
            throw new Exception("wsECLDirectServiceSoapProxy not available");
    }

    /**
     * Provides the WSDL URL originally used to create the underlying stub code
     *
     * @return original WSLD URL
     */
    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.gen.ecldirect.v1_0.EclDirectLocator()).getEclDirectServiceSoapAddress();
    }

    /**
     * @param wsEclDirectServiceSoapProxy
     */
    protected HPCCECLDirectClient(EclDirectServiceSoapProxy wsEclDirectServiceSoapProxy)
    {
        this.wsEclDirectServiceSoapProxy = wsEclDirectServiceSoapProxy;
    }

    /**
     * @param baseConnection
     */
    protected HPCCECLDirectClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    /**
     * @param protocol
     * @param targetHost
     * @param targetPort
     * @param user
     * @param pass
     */
    protected HPCCECLDirectClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, ECLDIRECTWSDLURI);
        initWsEclDirectServiceSoapProxy(address, user, pass);
    }

    /**
     * Initializes the service's underlying soap proxy. Should only be used by constructors
     *
     * @param baseURL   Target service base URL
     * @param user      User credentials
     * @param pass      User credentials
     */
    private void initWsEclDirectServiceSoapProxy(String baseURL, String user, String pass)
    {
        wsEclDirectServiceSoapProxy = new EclDirectServiceSoapProxy(baseURL);

        if (wsEclDirectServiceSoapProxy != null)
        {
            EclDirectServiceSoap wsEclDirectServiceSoap = wsEclDirectServiceSoapProxy.getEclDirectServiceSoap();
            if (wsEclDirectServiceSoap != null)
            {
                if (user != null && pass != null)
                    Connection.initStub((Stub) wsEclDirectServiceSoap, user, pass);
            }
        }
    }

    /**
     * Submit given ECL query for compilation/execution on a given target cluster
     * @param wu      - The workunitinfo object containing all pertinent ecl query info
     *                  such as: The ecl query, The target cluster on which to compile/execute,
     *                  Query results limit, Maxwait in millis
     * @return                   - If successfully submitted, the resulting WUID.
     * @throws Exception         - Caller must handle exceptions
     */
    public String submitECL(WorkunitInfo wu) throws Exception
    {
        String wuid = null;

        getSoapProxy();

        RunEclExRequest runeclexreqparams = new RunEclExRequest();

        if (wu.getCluster() != null && wu.getCluster().length() > 0)
            runeclexreqparams.setCluster(wu.getCluster());

        runeclexreqparams.setEclText(wu.getECL());
        runeclexreqparams.setIncludeGraphs(false);
        runeclexreqparams.setIncludeResults(true);
        runeclexreqparams.setFormat(RunEclExFormat.None);
        runeclexreqparams.setWait(wu.getMaxMonitorMillis());
        runeclexreqparams.setResultLimit(wu.getResultLimit());

        RunEclExResponse runEclExResponse = wsEclDirectServiceSoapProxy.runEclEx(runeclexreqparams);

        ECLDirectException[] directExceptions = runEclExResponse.getErrors();
        if (directExceptions != null && directExceptions.length > 0)
        {
            for (ECLDirectException exception : directExceptions)
            {
                String severity = exception.getSeverity();
                if (severity.equalsIgnoreCase("ERROR"))
                    throw new Exception(exception.getMessage());
            }
        }

        wuid = runEclExResponse.getWuid();

        return wuid;
    }

    /**
     * Submit given ECL query for compilation/execution on a given target cluster
     *  @param wu      - The workunitinfo object containing all pertinent ecl query info
     *                  such as: The ecl query, The target cluster on which to compile/execute,
     *                  Query results limit, Maxwait in millis

     * @return                   - If successfully submitted, the resulting Dataset(s).
     * @throws Exception         - Caller must handle exceptions
     */
    public String submitECLandGetResults(WorkunitInfo wu) throws Exception
    {
        String results = null;

        getSoapProxy();

        RunEclExRequest runeclexreqparams = new RunEclExRequest();
        if (wu.getCluster() != null && wu.getCluster().length() > 0)
            runeclexreqparams.setCluster(wu.getCluster());
        runeclexreqparams.setEclText(wu.getECL());
        runeclexreqparams.setIncludeGraphs(false);
        runeclexreqparams.setIncludeResults(true);
                                  //RunEclExFormat.None
                                  //RunEclExFormat.Table
                                  //RunEclExFormat.Xml
                                  //RunEclExFormat.ExtendedXml
        runeclexreqparams.setFormat(RunEclExFormat.None);
        runeclexreqparams.setWait(wu.getMaxMonitorMillis());
        runeclexreqparams.setResultLimit(wu.getResultLimit());

        RunEclExResponse runEclExResponse = wsEclDirectServiceSoapProxy.runEclEx(runeclexreqparams);

        ECLDirectException[] directExceptions = runEclExResponse.getErrors();
        if (directExceptions != null && directExceptions.length > 0)
        {
            for (ECLDirectException exception : directExceptions)
            {
                String severity = exception.getSeverity();
                if (severity.equalsIgnoreCase("ERROR"))
                    throw new Exception(exception.getMessage());
            }
        }

        return runEclExResponse.getResults();

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

        if (!(aThat instanceof HPCCECLDirectClient))
        {
            return false;
        }

        HPCCECLDirectClient that = (HPCCECLDirectClient) aThat;
        EclDirectServiceSoapProxy thatSoapProxy;
        try
        {
            thatSoapProxy = that.getSoapProxy();
        }
        catch(Exception e)
        {
            thatSoapProxy = null;
        }

        return EqualsUtil.areEqual(wsEclDirectServiceSoapProxy.getEndpoint(), thatSoapProxy.getEndpoint()) &&
                EqualsUtil.areEqual(((Stub) wsEclDirectServiceSoapProxy.getEclDirectServiceSoap()).getUsername(), ((Stub) thatSoapProxy.getEclDirectServiceSoap()).getUsername()) &&
                EqualsUtil.areEqual(((Stub) wsEclDirectServiceSoapProxy.getEclDirectServiceSoap()).getPassword(), ((Stub) thatSoapProxy.getEclDirectServiceSoap()).getPassword());
    }

    @Override
    public int hashCode()
    {
        int result = HashCodeUtil.SEED;
        result = HashCodeUtil.hash(result, wsEclDirectServiceSoapProxy.getEndpoint());
        result = HashCodeUtil.hash(result, ((Stub)  wsEclDirectServiceSoapProxy.getEclDirectServiceSoap()).getUsername());
        result = HashCodeUtil.hash(result, ((Stub)  wsEclDirectServiceSoapProxy.getEclDirectServiceSoap()).getPassword());
        return result;
    }
}
