package org.hpccsystems.ws.client.utils;

/*##############################################################################

HPCC SYSTEMS software Copyright (C) 2025 HPCC Systems®.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
############################################################################## */

import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsSMCClient;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.platform.Version;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ConnectionTester
{
    private static void usage()
    {
        System.out.println("ConnectionTester -configFile <fully qualified config file>   DEFAULT:./config.json");


        System.out.println("\nconfigFile syntax:\n");
        System.out.println("{\r\n"
                + "  \"eclWatchHostName\": \"<host name of target eclwatch>\",\r\n"
                + "  \"eclWatchPort\": \"<port number of target eclwatch typically 18010 for https, 8010 otherwise>\",\r\n"
                + "  \"eclWatchProtocol\": \"<https|http>\",\r\n"
                + "  \"eclWatchUser\": \"<Target eclwatch user>\",\r\n"
                + "  \"eclWatchPass\": \"<Target eclwatch pass>\",\r\n"
                + "  \"connIntervalSecs\": <Frequency of EclWatch connection attempt>,\r\n"
                + "  \"verbose\" : <true|false Output debug logs>\r\n"
                + "}");

        System.exit(-1);
    }

    public static void main(String[] args)
    {
        String configFilePath = "./config.json";
        if (args.length == 2)
        {
            if ("-configFile".equals(args[0]))
                    configFilePath = args[1];
            else
            {
                System.out.println("Unknown argument detected: '" + args [0] + "'");
                usage();
            }
        }
        else if (args.length == 1)
        {
            if ("-configFile".equals(args[0]))
                System.out.println("-configFile argument detected, but actual config file path not provided!");
            else
                System.out.println("Unknown argument detected: '" + args [0] + "'");
        }
        else if (args.length == 0)
        {
            System.out.println("No config file argument detected, defaulting to ./config.json!");
        }
        else
        {
            System.out.println("Too many arguments detected");
            usage();
        }

        String hpccHostName = "localhost";
        int port = 8010;
        String protocol = "http";
        String user = "";
        String pass = "";
        boolean verbose = false;
        int intervalSecs = 30;
        try
        {
            String configStr = new String(Files.readAllBytes(Paths.get(configFilePath)));
            JSONObject configJSON = new JSONObject(configStr);

            if (!configJSON.has("eclWatchHostName"))
                System.out.println("eclWatchHostName not found, defaulting to 'localhost'!");
            else
                hpccHostName = configJSON.getString("eclWatchHostName");

            if (!configJSON.has("eclWatchPort"))
                System.out.println("eclWatchPort not found, defaulting to '8010'!");
            else
                port = configJSON.getInt("eclWatchPort");

            if (!configJSON.has("eclWatchProtocol"))
                System.out.println("eclWatchProtocol not found, defaulting to 'http'!");
            else
                protocol = configJSON.getString("eclWatchProtocol");

            if (!configJSON.has("eclWatchUser"))
                System.out.println("eclWatchUser not found!");
            else
                user = configJSON.getString("eclWatchUser");

            if (!configJSON.has("eclWatchPass"))
                System.out.println("eclWatchPass not found!");
            else
                pass = configJSON.getString("eclWatchPass");

            if (!configJSON.has("connIntervalSecs"))
                System.out.println("connIntervalSecs not found, defaulting to 30secs!");
            else
                intervalSecs = configJSON.getInt("connIntervalSecs");

            if (configJSON.has("verbose"))
                verbose = configJSON.getBoolean("verbose");
        }
        catch (IOException e1)
        {
            System.out.println("Could not read configuration file '" + configFilePath + "'");
            System.out.println(e1.getLocalizedMessage());
            System.exit(-1);
        }

        System.out.println("Starting scheduled task. Press Ctrl+C to stop.");
        System.out.println("Connecting to HPCC Platform: '" + protocol + "://" + hpccHostName + ":" + port + "'");
        System.out.println("With credentials: user: '" + user + "' pass: '<" + ( !pass.isEmpty() ? "not " : "") + "empty>'");

        if (verbose)
        {
            System.setProperty("javax.net.debug", "all");
        }

        while (true)
        {
            try
            {
                try
                {
                    Platform platform = Platform.get(protocol, hpccHostName, port, user, pass);

                    HPCCWsClient wsclient = platform.checkOutHPCCWsClient();
                    if (wsclient != null)
                    {

                        if (verbose)
                            System.out.println( "[" + java.time.LocalTime.now() + "] Contacting ECLWatch...");

                        HPCCWsSMCClient wssmc = platform.getWsClient().getWsSMCClient();

                        Version targetVersion = new Version(wssmc.getHPCCBuild());
                        System.out.println( "[" + java.time.LocalTime.now() + "] Successfully connected and extracted HPCC build version: '" + targetVersion.toString() + "'");
                    }
                    else
                    {
                        System.out.println( "[" + java.time.LocalTime.now() + "] Could not instantiate wsclient!");
                    }
                }
                catch (Exception e)
                {
                    System.out.println( "[" + java.time.LocalTime.now() + "] Encountered Connection issue: " + e.getLocalizedMessage());
                }
                Thread.sleep(intervalSecs*1000);
            }
            catch (InterruptedException e)
            {
                System.err.println( "[" + java.time.LocalTime.now() + "] Process interrupted. Exiting...");
                break;
            }
        }
    }
}
