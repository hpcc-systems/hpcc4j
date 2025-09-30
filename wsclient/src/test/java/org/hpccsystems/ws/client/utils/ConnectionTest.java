package org.hpccsystems.ws.client.utils;

/*******************************************************************************
 *     HPCC SYSTEMS software Copyright (C) 2022 HPCC Systems®.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *******************************************************************************/

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.util.regex.Matcher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(org.hpccsystems.commons.annotations.BaseTests.class)
public class ConnectionTest
{
    private static final Logger log = LogManager.getLogger(ConnectionTest.class);

    String http = "http";
    String httpCamel = "hTtP";
    String https = "https";
    String httpsCamel = "hTtPs";
    String protDelim = "://";
    String host = "xyz.com";
    String path = "somepath";
    String port = "8989";
    String param1 = "param=val";
    String param2 = "nextparam=somethingelse";

    @Test
    public void testHTTPProtocol() throws MalformedURLException
    {
        Connection con = new Connection(http+protDelim+host+":"+port);
        assertFalse(con.getIsHttps());
        assertEquals(con.getProtocol(), http);

    }

    @Test
    public void testHTTPCamelProtocol() throws MalformedURLException
    {
        Connection con = new Connection(httpCamel+protDelim+host+":"+port);
        assertFalse(con.getIsHttps());
        assertEquals(con.getProtocol(), http);
    }

    @Test
    public void testHTTPSProtocol() throws MalformedURLException
    {
        Connection con = new Connection(https+protDelim+host+":"+port);
        assertTrue(con.getIsHttps());
        assertEquals(con.getProtocol(), https);
    }

    @Test
    public void testHTTPSCamelProtocol() throws MalformedURLException
    {
        Connection con = new Connection(httpsCamel+protDelim+host+":"+port);
        assertTrue(con.getIsHttps());
        assertEquals(con.getProtocol(), https);
    }

    @Test
    public void testNotHTTPS() throws MalformedURLException
    {
        Connection con = new Connection(false, host, Integer.valueOf(port));
        assertFalse(con.getIsHttps());
        assertEquals(con.getProtocol(), http);
    }

    @Test
    public void testYesHTTPS() throws MalformedURLException
    {
        Connection con = new Connection(true, host, Integer.valueOf(port));
        assertTrue(con.getIsHttps());
        assertEquals(con.getProtocol(), https);
    }

    @Test
    public void testHTTPHostPort() throws MalformedURLException
    {
        Connection con = new Connection(http, host, port);
        assertFalse(con.getIsHttps());
        assertEquals(con.getProtocol(), http);
    }

    @Test
    public void testHTTPSHostPort() throws MalformedURLException
    {
        Connection con = new Connection(https, host, port);
        assertTrue(con.getIsHttps());
        assertEquals(con.getProtocol(), https);
    }

    @Test
    public void testInvalidProtHostPort() throws MalformedURLException
    {
        Connection con = new Connection("XYZ", host, port);
        assertFalse(con.getIsHttps());
        assertEquals(con.getProtocol(), http);
    }

    @Test
    public void hostNamePatternTest() throws MalformedURLException
    {
        // Note: we want to test improved error messaging with underscores, but not all versions
        // of Java throw an exception for underscores in hostnames.
        // So we are testing the pattern instead
        String[] urls = {
            "https://invalid_host_name.test:8010?params",
            "https://invalid_host_name.test:8010",
            "http://invalid_host_name.test:8010",
            "invalid_host_name.test:8010",
            "invalid_host_name.test"
        };

        String hostName = "invalid_host_name.test";
        for (String url : urls)
        {
            Matcher matcher = Connection.URL_HOSTNAME_PATTERN.matcher(url);
            assertTrue(matcher.matches());
            assertEquals(matcher.group("hostname"), hostName);
        }
    }

    @Test
    public void testUserNameLogging() throws Exception
    {
        log.info("Testing username logging functionality");

        Connection con = new Connection(http, host, port);

        // Test setUserName - should log the username
        con.setUserName("testuser1");
        assertEquals("testuser1", con.getUserName());

        // Test setCredentials - should log the username
        con.setCredentials("testuser2", "testpass");
        assertEquals("testuser2", con.getUserName());

        // Test setEncodedCredentials - should log the username
        // "testuser3:testpass3" in base64 is "dGVzdHVzZXIzOnRlc3RwYXNzMw=="
        String encodedCreds = java.util.Base64.getEncoder().encodeToString("testuser3:testpass3".getBytes());
        con.setEncodedCredentials(encodedCreds);
        assertEquals("testuser3", con.getUserName());

        log.info("Username logging test completed successfully");
    }
}
