package org.hpccsystems.ws.client;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.soap.ecldirect.ECLDirectException;
import org.hpccsystems.ws.client.soap.ecldirect.EclDirectServiceSoap;
import org.hpccsystems.ws.client.soap.ecldirect.EclDirectServiceSoapProxy;
import org.hpccsystems.ws.client.soap.ecldirect.RunEclExFormat;
import org.hpccsystems.ws.client.soap.ecldirect.RunEclExRequest;
import org.hpccsystems.ws.client.soap.ecldirect.RunEclExResponse;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * Use as soap client for HPCC ECLDirect web service.
 * This includes submiting an ecl query for compilation/execution.
 *
 */
public class HPCCECLDirectClient
{
    public static final String ECLDIRECTWSDLURI     = "/EclDirect";
    private EclDirectServiceSoapProxy     wsEclDirectServiceSoapProxy = null;

    public EclDirectServiceSoapProxy getSoapProxy()
    {
        return wsEclDirectServiceSoapProxy;
    }

    public static String getOriginalWSDLURL()
    {
        return (new org.hpccsystems.ws.client.soap.ecldirect.EclDirectLocator()).getEclDirectServiceSoapAddress();
    }

    public HPCCECLDirectClient(EclDirectServiceSoapProxy wsEclDirectServiceSoapProxy)
    {
        this.wsEclDirectServiceSoapProxy = wsEclDirectServiceSoapProxy;
    }

    public HPCCECLDirectClient(Connection baseConnection)
    {
       this(baseConnection.getProtocol(), baseConnection.getHost(), baseConnection.getPort(), baseConnection.getUserName(), baseConnection.getPassword());
    }

    public HPCCECLDirectClient(String protocol, String targetHost, String targetPort, String user, String pass)
    {
        String address = Connection.buildUrl(protocol, targetHost, targetPort, ECLDIRECTWSDLURI);
        initWsEclDirectServiceSoapProxy(address, user, pass);
    }

    public void initWsEclDirectServiceSoapProxy(String baseURL, String user, String pass)
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
     * @param ecl                - The ecl query
     * @param targetcluster      - The target cluster on which to compile/execute
     * @param resultLimit        - Query results will be limited to this value
     * @param maxwait            - Maxwait in millis
     * @return                   - If successfully submited, the resulting WUID.
     * @throws Exception         - Caller must handle exceptions
     */
    public String submitECL(String ecl, String targetcluster, int resultLimit, int maxwait) throws Exception
    {
        String wuid = null;

        if (wsEclDirectServiceSoapProxy == null)
            throw new Exception("wsECLDirectServiceSoapProxy not available");
        else
        {
            RunEclExRequest runeclexreqparams = new RunEclExRequest();

            if (targetcluster.length() > 0)
                runeclexreqparams.setCluster(targetcluster);

            runeclexreqparams.setEclText(ecl);
            runeclexreqparams.setIncludeGraphs(false);
            runeclexreqparams.setIncludeResults(true);
            runeclexreqparams.setFormat(RunEclExFormat.None);
            runeclexreqparams.setWait(maxwait);
            runeclexreqparams.setResultLimit(resultLimit);

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
            else
            {
                wuid = runEclExResponse.getWuid();
            }
        }
        return wuid;
    }

    /**
     * Submit given ECL query for compilation/execution on a given target cluster
     * @param ecl                - The ecl query
     * @param targetcluster      - The target cluster on which to compile/execute
     * @param resultLimit        - Query results will be limited to this value
     * @param maxwait            - Maxwait in millis
     * @return                   - If successfully submited, the resulting Dataset(s).
     * @throws Exception         - Caller must handle exceptions
     */
    public String submitECLandGetResults(String ecl, String targetcluster, int resultLimit, int maxwait) throws Exception
    {
        String results = null;

        if (wsEclDirectServiceSoapProxy == null)
            throw new Exception("wsECLDirectServiceSoapProxy not available");
        else
        {
            RunEclExRequest runeclexreqparams = new RunEclExRequest();
            if (targetcluster.length() > 0)
                runeclexreqparams.setCluster(targetcluster);
            runeclexreqparams.setEclText(ecl);
            runeclexreqparams.setIncludeGraphs(false);
            runeclexreqparams.setIncludeResults(true);
                                      //RunEclExFormat.None
                                      //RunEclExFormat.Table
                                      //RunEclExFormat.Xml
                                      //RunEclExFormat.ExtendedXml
            runeclexreqparams.setFormat(RunEclExFormat.None);
            runeclexreqparams.setWait(maxwait);
            runeclexreqparams.setResultLimit(resultLimit);

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
            else
            {
                results = runEclExResponse.getResults();
            }
        }
        return results;
    }
}
