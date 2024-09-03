/*##############################################################################

    HPCC SYSTEMS software Copyright (C) 2024 HPCC Systems®.

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

import static org.junit.Assume.assumeTrue;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.hpccsystems.ws.client.utils.Connection;
import org.hpccsystems.ws.client.wrappers.gen.wsworkunits.WUPublishWorkunitResponseWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.QueryResultWrapper;
import org.hpccsystems.ws.client.wrappers.wsworkunits.WorkunitWrapper;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

public class WSECLTests extends BaseRemoteTest
{
    private static HPCCWsWorkUnitsClient wswuclient = null;
    private static boolean hasPublishedQuery = false;
    private final static String wsECLPort = System.getProperty("wseclport", "8002");
    private final static String eclScriptName = "SimpleFunction.ecl";
    private static Connection wseclConn = null;

    @BeforeClass
    public static void setup() throws Exception
    {
        wswuclient = wsclient.getWsWorkunitsClient(); //for publishing queries
        Assert.assertNotNull(wswuclient);
        
        try
        {
             InputStream resourceStream = BaseRemoteTest.class.getClassLoader().getResourceAsStream(eclScriptName);
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
             wu.setJobname(eclScriptName);
             wu.setCluster(thorclustername);

             //wswuclient.createAndRunWUFromECLAndGetResults(wu);
             WUPublishWorkunitResponseWrapper resp = wswuclient.publishWUFromEclWrapped(wu);
             System.out.println("Finished publishing query" + resp.toString());
             List<QueryResultWrapper> queries = wswuclient.listQueries(wu.getWuid(), wu.getJobname(), wu.getCluster(), null, null, null, null, null, null);
             for (QueryResultWrapper query : queries)
             {
                 if (query.getName().equalsIgnoreCase(eclScriptName))
                 {
                     hasPublishedQuery = true;
                     return;
                 }
             }
        }
        catch (Exception e)
        {
            System.out.println("Could not publish ECL query: " + e.getLocalizedMessage());
        }

        wseclConn = wsclient.getConnection();
        wseclConn.setPort(wsECLPort);
        wseclConn.setSocketTimeoutMilli(15000);
        wseclConn.setWriteTimeoutMilli(15000);
    }

    @Test
    public void testWsECLGetWSDL()
    {
        assumeTrue("WsECL connection not available", wseclConn != null);
        assumeTrue("WsECL connection port appears invalid", wseclConn.getPort().equals(wsECLPort));
        assumeTrue("Cannot test WsECL published query WSDL feature without published queries!", hasPublishedQuery);

        try
        {
            String wsdlURI = "/WsEcl/definitions/query/" + thorclustername + "/" + eclScriptName + "/main/" + eclScriptName + ".wsdl";
            
            String wsdlResponse = wseclConn.sendGetRequest(wsdlURI);
            Assert.assertNotNull("Unexpected Null response", wsdlResponse);
            //TODO determine good way to confirm success/failure
            //Assert.assertArrayEquals(expectedWsdlResponse, wsdlResponse)
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch WsECL query wsdl: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void testWsECLGetSampleReq()
    {
        assumeTrue("WsECL connection not available", wseclConn != null);
        assumeTrue("WsECL connection port appears invalid", wseclConn.getPort().equals(wsECLPort));
        assumeTrue("Cannot test WsECL published query WSDL feature without published queries!", hasPublishedQuery);

        try
        {
            //http://127.0.0.1:8002/WsEcl/example/request/query/<roxie>/<query>
            String sampleReqURI = "/WsEcl/example/request/query" + thorclustername + "/" + eclScriptName;
            String sampleReqResponse = wseclConn.sendGetRequest(sampleReqURI);
            Assert.assertNotNull("Unexpected Null response", sampleReqResponse);
            //TODO determine good way to confirm success/failure
            //Assert.assertArrayEquals(expectedWsdlResponse, wsdlResponse)
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch WsECL query wsdl: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void testWsECLGetSampleResp()
    {
        assumeTrue("WsECL connection not available", wseclConn != null);
        assumeTrue("WsECL connection port appears invalid", wseclConn.getPort().equals(wsECLPort));
        assumeTrue("Cannot test WsECL published query WSDL feature without published queries!", hasPublishedQuery);

        try
        {
            //http://127.0.0.1:8002/WsEcl/example/response/query/<roxie>/<query>
            String sampleRespURI = "/WsEcl/example/response/query" + thorclustername + "/" + eclScriptName;
            String sampleRespResponse = wseclConn.sendGetRequest(sampleRespURI);
            Assert.assertNotNull("Unexpected Null response", sampleRespResponse);
            //TODO determine good way to confirm success/failure
            //Assert.assertArrayEquals(expectedWsdlResponse, wsdlResponse)
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch WsECL query wsdl: " + e.getLocalizedMessage());
        }
    }

    @Test
    public void testWsECLGetSchema()
    {
        assumeTrue("WsECL connection not available", wseclConn != null);
        assumeTrue("WsECL connection port appears invalid", wseclConn.getPort().equals(wsECLPort));
        assumeTrue("Cannot test WsECL published query WSDL feature without published queries!", hasPublishedQuery);

        try
        {
            String xsdURI = "/WsEcl/definitions/query/" + thorclustername + "/" + eclScriptName + "/main/" + eclScriptName + ".xsd";
            String xsdResponse = wseclConn.sendGetRequest(xsdURI);
            Assert.assertNotNull("Unexpected Null response", xsdResponse);
            //TODO determine good way to confirm success/failure
            //Assert.assertArrayEquals(expectedWsdlResponse, wsdlResponse)
        }
        catch (Exception e)
        {
            Assert.fail("Could not fetch WsECL query xsd: " + e.getLocalizedMessage());
        }
    }
    
}
