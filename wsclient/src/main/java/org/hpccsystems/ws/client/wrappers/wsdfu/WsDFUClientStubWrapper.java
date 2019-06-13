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

import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.hpccsystems.ws.client.platform.Version;

/**
 * This wrapper class allows an HPCCWsDFUClient instance to connect to HPCC Clusters using different
 * versions of the platform.
 *
 */
public class WsDFUClientStubWrapper
{
    private org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuStub stub1_51                     = null;
    private org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuStub stub1_39                     = null;
    private Version platformVersion;
    private String baseURL;

    /**
     * @return a lazy-loaded 1_39 soap proxy
     * @throws AxisFault
     */
    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuStub get1_51Stub(Options opts) throws AxisFault
    {
        if (stub1_51 == null)
        {
            stub1_51 = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_51.WsDfuStub(baseURL);
            if (opts != null)
                stub1_51._getServiceClient().setOptions(opts);
        }
        return stub1_51;
    }

    public org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuStub get1_39Stub(Options opts) throws AxisFault
    {
        if (stub1_39 == null)
        {
            stub1_39 = new org.hpccsystems.ws.client.gen.axis2.wsdfu.v1_39.WsDfuStub(baseURL);
            if (opts != null)
                stub1_39._getServiceClient().setOptions(opts);
        }
        return stub1_39;
    }

    /**
     * @param baseURL The URL of the cluster to connect to
     * @param platformVersion the version of the cluster
     */
     public WsDFUClientStubWrapper(String baseURL, Version platformVersion)
    {
        this.platformVersion=platformVersion;
        this.baseURL=baseURL;
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
