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

package org.hpccsystems.ws.client.wrappers.wsdfu;

import org.apache.axis.client.Stub;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * This wrapper class allows an HPCCWsDFUClient instance to connect to HPCC Clusters using different
 * versions of the platform.
 *
 */
public class WsDFUClientSoapProxyWrapper
{
    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoap serviceSoapv1_51 = null;
    private org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoap serviceSoapv1_50 = null;
    private org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoap serviceSoapv1_39 = null;

    private org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoapProxy serviceSoapProxyv1_51 = null;
    private org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoapProxy serviceSoapProxyv1_50 = null;
    private org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoapProxy serviceSoapProxyv1_39 = null;

    private String user;
    private String password;
    private Version platformVersion;
    private String baseURL;

    /**
     * @param baseURL The URL of the cluster to connect to
     * @param user the username to use when connecting to the cluster
     * @param pass the password to use when connecting to the cluster
     * @param platformVersion the version of the cluster
     */
    public WsDFUClientSoapProxyWrapper(String baseURL, String user, String pass, Version platformVersion)
    {
        this.platformVersion=platformVersion;
        this.baseURL=baseURL;
        this.user=user;
        this.password=pass;
    }
    /**
     * @return a lazy-loaded 1_39 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoapProxy get1_39ServiceSoapProxy()
    {
        if (serviceSoapProxyv1_39 == null)
        {
            serviceSoapProxyv1_39 = new org.hpccsystems.ws.client.gen.wsdfu.v1_39.WsDfuServiceSoapProxy(baseURL);
            serviceSoapv1_39 = serviceSoapProxyv1_39.getWsDfuServiceSoap();

            if (user != null && password != null)
                Connection.initStub((Stub) serviceSoapv1_39, user, password);
        }
        return serviceSoapProxyv1_39;
    }

    /**
     * @return a lazy-loaded 1_50 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoapProxy get1_50ServiceSoapProxy()
    {
        if (serviceSoapProxyv1_50 == null)
        {
            serviceSoapProxyv1_50 = new org.hpccsystems.ws.client.gen.wsdfu.v1_50.WsDfuServiceSoapProxy(baseURL);
            serviceSoapv1_50 = serviceSoapProxyv1_50.getWsDfuServiceSoap();

            if (user != null && password != null)
                Connection.initStub((Stub) serviceSoapv1_50, user, password);
        }
        return serviceSoapProxyv1_50;
    }

    /**
     * @return a lazy-loaded 1_51 soap proxy
     */
    public org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoapProxy get1_51ServiceSoapProxy()
    {
        if (serviceSoapProxyv1_51 == null)
        {
            serviceSoapProxyv1_51 = new org.hpccsystems.ws.client.gen.wsdfu.v1_51.WsDfuServiceSoapProxy(baseURL);
            serviceSoapv1_51 = serviceSoapProxyv1_51.getWsDfuServiceSoap();

            if (user != null && password != null)
                Connection.initStub((Stub) serviceSoapv1_51, user, password);
        }
        return serviceSoapProxyv1_51;
    }

    public boolean useVersion1_39()
    {
        return platformVersion.major < 6 || platformVersion.major==7 && platformVersion.minor == 0;
    }

    public boolean useVersion1_50()
    {
        return platformVersion.major==7 && (platformVersion.minor == 1 || platformVersion.minor == 2);
    }

    public boolean useVersion1_51()
    {
        return platformVersion.major==7 && platformVersion.minor > 2;
    }

}
