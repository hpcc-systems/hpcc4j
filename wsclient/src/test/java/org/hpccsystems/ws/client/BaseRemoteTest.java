/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2019 HPCC Systems®.

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

package org.hpccsystems.ws.client;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.hpccsystems.ws.client.HPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsTopologyClient.TopologyGroupQueryKind;
import org.hpccsystems.ws.client.platform.Platform;
import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.gen.wstopology.TpGroupWrapper;
import org.junit.Assert;
import org.junit.experimental.categories.Category;

import java.net.URL;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

@Category(org.hpccsystems.commons.annotations.RemoteTests.class)
public abstract class BaseRemoteTest
{
    protected static Platform platform;
    protected static HPCCWsClient wsclient;

    protected final static String connString = System.getProperty("hpccconn", "http://localhost:8010");
    protected static String thorClusterFileGroup = System.getProperty("thorgroupname");
    protected final static String thorclustername = System.getProperty("thorclustername", "thor");

    protected static String roxieClusterGroup = System.getProperty("roxiegroupname");
    protected final static String roxieclustername = System.getProperty("roxieclustername", "roxie");

    protected final static String defaultUserName = "JunitUser";
    protected static Connection connection = null;

    protected final static String hpccUser = System.getProperty("hpccuser", defaultUserName);
    protected final static String hpccPass = System.getProperty("hpccpass", "");
    protected final static Integer connTO = System.getProperty("connecttimeoutmillis")==null?null:Integer.valueOf(System.getProperty("connecttimeoutmillis"));
    protected final static String sockTO = System.getProperty("sockettimeoutmillis");

    protected final static int  testThreadCount = Integer.parseInt(System.getProperty("testthreadcount", "10"));
    public static final String DEFAULTHPCCFILENAME      = "benchmark::all_types::200kb";

    /*
     * Code to generate superfile with default file as subfile
     * Import STD;
     * String subfilename := '~benchmark::all_types::200KB';
     * String sfname := '~benchmark::all_types::superfile';
     * IF(false = STD.file.SuperFileExists(sfname),STD.file.CreateSuperFile(sfname));
     * output(STD.file.SuperFileExists(sfname));
     * STD.file.AddSuperFile(sfname, subfilename);
     */
    public static final String DEFAULTHPCCSUPERFILENAME = "benchmark::all_types::superfile";

    static
    {
        // This allows testing against locally created self signed certs to work.
        // In production certs will need to be created valid hostnames
        javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
        new javax.net.ssl.HostnameVerifier()
        {
            public boolean verify(String hostname,javax.net.ssl.SSLSession sslSession)
            {
                if (hostname.equals("localhost"))
                {
                    return true;
                }

                return false;
            }
        });

        String legacythorcluster = System.getProperty("thorcluster");
        if (legacythorcluster != null && !legacythorcluster.isEmpty())
            System.out.println("WARNING! 'thorcluster' has been deprecated - Use 'thorclustername' and/or 'thorgroupname' instead");

        if (System.getProperty("thorclustername") == null)
            System.out.println("thorclustername not provided - defaulting to '" + thorclustername + "'");

        if (System.getProperty("roxieclustername") == null)
            System.out.println("roxieclustername not provided - defaulting to '" + roxieclustername + "'");

        InetAddress ip;
        String hostname;
        try
        {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("RemoteTest executing on: " + hostname + "(" + ip + ")");
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }

        if (System.getProperty("hpccconn") == null)
            System.out.println("RemoteTest: No 'hpccconn' provided, defaulting to http://localhost:8010");
        else
            System.out.println("RemoteTest: 'hpccconn' set to: '" + connString + "'");

        if (System.getProperty("hpccuser") == null)
            System.out.println("RemoteTest: No 'hpccuser' provided, defaulting to '" + defaultUserName + "'");
        else
            System.out.println("RemoteTest: 'hpccuser' set to: '" + hpccUser + "'");

        if (System.getProperty("hpccpass") == null)
            System.out.println("RemoteTest: No 'hpccpass' provided.");

        if (platform == null)
        {
            try
            {
                connection = new Connection(connString);
            }
            catch (MalformedURLException e)
            {
                fail("Could not acquire connection object based on: '" + connString + "' - " + e.getLocalizedMessage());
            }

            Assert.assertNotNull("Could not acquire connection object", connection);
            connection.setCredentials(hpccUser, hpccPass);

            if (connTO != null)
                connection.setConnectTimeoutMilli(connTO);

            if (sockTO != null)
                connection.setSocketTimeoutMilli(Integer.valueOf(sockTO));

            platform = Platform.get(connection);

            Assert.assertNotNull("Could not acquire platform object", platform);
        }

        try
        {
            wsclient = platform.checkOutHPCCWsClient();
            if (thorClusterFileGroup == null || thorClusterFileGroup.isEmpty())
            {
                List<TpGroupWrapper> grouplist = wsclient.getTopologyGroups(wsclient.isContainerized() ? TopologyGroupQueryKind.PLANE : TopologyGroupQueryKind.THOR);
                for (TpGroupWrapper tpGroupWrapper : grouplist)
                {
                    thorClusterFileGroup = tpGroupWrapper.getName();
                    if (thorClusterFileGroup != null)
                        break;
                }
                System.out.println("RemoteTest: No 'thorClusterFileGroup' provided, using '" + thorClusterFileGroup + "'");
            }
            else
            {
                System.out.println("RemoteTest: 'thorClusterFileGroup': '" + thorClusterFileGroup + "'");
            }

            if (roxieClusterGroup == null || roxieClusterGroup.isEmpty())
            {
                List<TpGroupWrapper> grouplist =  wsclient.getTopologyGroups(wsclient.isContainerized() ? TopologyGroupQueryKind.PLANE : TopologyGroupQueryKind.ROXIE);
                for (TpGroupWrapper tpGroupWrapper : grouplist)
                {
                    roxieClusterGroup = tpGroupWrapper.getName();
                    if (roxieClusterGroup != null)
                        break;
                }
                System.out.println("RemoteTest: No 'roxiegroupname' provided, using '" + roxieClusterGroup + "'");
            }
            else
            {
            	System.out.println("RemoteTest: 'roxiegroupname': '" + roxieclustername + "'");
            }
        }
        catch (Exception e)
        {
            fail("Could not acquire wsclient object: " + e.getMessage() );
        }

        Assert.assertNotNull("Could not acquire wsclient object", wsclient);

        // Run the generate-datasets.ecl script if present in the project resources
        try
        {
            executeECLScript("generate-datasets.ecl");
        }
        catch (Exception e)
        {
            Assert.fail("Error executing test data generation scripts with error: " + e.getMessage());
        }
    }

    public static String executeECLScript(String eclFile) throws Exception
    {
        InputStream resourceStream = BaseRemoteTest.class.getClassLoader().getResourceAsStream(eclFile);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead = resourceStream.read(buffer);
        while (bytesRead > -1) {
            byteArrayOutputStream.write(buffer, 0, bytesRead);
            bytesRead = resourceStream.read(buffer);
        }

        byte[] eclData = byteArrayOutputStream.toByteArray();
        String ecl = new String(eclData, "UTF-8");

        WorkunitWrapper wu = new WorkunitWrapper();
        wu.setECL(ecl);
        wu.setJobname("UnitTest ECL Script: " + eclFile);
        wu.setCluster(thorclustername);

        HPCCWsWorkUnitsClient client = wsclient.getWsWorkunitsClient();
        return client.createAndRunWUFromECLAndGetResults(wu);
    }

    static public void executeMultiThreadedTask(Callable<String> callableTask, int threadCount) throws InterruptedException
    {
        List<Callable<String>> callableTasks = new ArrayList<>();
        for (int threadIndex=0; threadIndex<=threadCount; threadIndex++)
        {
            callableTasks.add(callableTask);
        }

        ExecutorService executor = Executors.newFixedThreadPool(threadCount);
        List<Future<String>> futures = executor.invokeAll(callableTasks);

        for (int threadIndex=0; threadIndex<=threadCount; threadIndex++)
        {
            try
            {
                assertTrue(futures.get(threadIndex).get().isEmpty());
            }
            catch (InterruptedException | ExecutionException e)
            {
                System.out.println("Multithreaded task test failed! Thread index: '" + threadIndex +"'");
                if (!e.getLocalizedMessage().isEmpty())
                    System.out.println("\n\t" + e.getLocalizedMessage());
                e.printStackTrace();
            }
        }
    }
}
