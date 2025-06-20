package org.hpccsystems.ws.client.platform.test;

import java.util.StringTokenizer;

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;

public class ConnectionTester
{
     private static void usage()
    {
        System.out.println("Options: \n"
                + "-server=<ECLWatchAddress>            DEFAULT:localhost\n"
                + "-port=<ECLWatchPort>                 DEFAULT:8010\n"
                + "-protocol=<ECLWatchAddressProtocol>  DEFAULT:http\n"
                + "-user=<ECLWatch User>                DEFAULT:\n"
                + "-pass=<ECLWatch Pass>                DEFAULT:\n"
                + "-verbose=true                        DEFAULT:false\n");

        System.exit(-1);
    }

    static private final String PARAMPREFIX          = "-(?i)";
    static public final String  SERVERPATTERN    = PARAMPREFIX + "server";
    static public final String  PORTPATTERN    = PARAMPREFIX + "port";
    static public final String  PROTOCOLPATTERN    = PARAMPREFIX + "protocol";
    static public final String  USERPATTERN    = PARAMPREFIX + "user";
    static public final String  PASSPATTERN    = PARAMPREFIX + "pass";
    static public final String  VERBOSEPATTERN    = PARAMPREFIX + "verbose";

    public static void main(String[] args)
    {
        String hpccServer = "localhost";
        int port = 8010;
        String protocol = "http";
        String user = "";
        String pass = "";
        boolean verbose = false;

        for (int i = 0; i < args.length; i++)
        {
            StringTokenizer params = new StringTokenizer(args[i], "=");

            while (params.hasMoreElements())
            {
                String currentParam = (String) params.nextElement();
                String currentParamVal = null;

                if (params.hasMoreElements())
                {
                    currentParamVal = (String) params.nextElement();
                }
                else
                {
                    System.out.println("ERROR: " + currentParam + "=??");
                    usage();
                }

                if (currentParam.matches(SERVERPATTERN))
                {
                    hpccServer = currentParamVal;
                }
                else if (currentParam.matches(PORTPATTERN))
                {
                    port = Integer.parseInt(currentParamVal);
                }
                else if (currentParam.matches(PROTOCOLPATTERN))
                {
                    protocol = currentParamVal;
                }
                else if (currentParam.matches(USERPATTERN))
                {
                    user = currentParamVal;
                }
                else if (currentParam.matches(PASSPATTERN))
                {
                    pass = currentParamVal;
                }
                else if (currentParam.matches(VERBOSEPATTERN))
                {
                    verbose = currentParamVal.isEmpty() || currentParamVal.equalsIgnoreCase("true");
                }
                else
                {
                    System.out.println("Unrecognized param: " + currentParam);
                    usage();
                }
            }
        }
        try
        {
            if (verbose)
            {
                System.out.println("Connecting to HPCC Platform: '" + protocol + "://" + hpccServer + ":" + port + "'");
                System.out.println("With credentials: user: '" + user + "' pass: '<" + ( !pass.isEmpty() ? "not " : "") + "empty>'");
            }

            Platform platform = Platform.get(protocol, hpccServer, port, user, pass);

            HPCCWsClient wsclient = platform.checkOutHPCCWsClient();
            if (wsclient != null)
            {

                if (verbose)
                {
                    System.out.println("Determining HPCC version and containerized mode via wssmc...");
                }

                HPCCWsSMCClient wssmc = platform.getWsClient().getWsSMCClient();

                Version targetVersion = new Version(wssmc.getHPCCBuild());
                System.out.println("Successfully connected and extracted HPCC build version: '" + targetVersion.toString() + "'");
            }
            else
            {
                System.out.println("Could not instantiate wsclient!");
            }
        }
        catch (Exception e)
        {
            System.out.println("Encountered Connection issue:" + e.getLocalizedMessage());
        }
    }
}
