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

package org.hpccsystems.ws.client.wrappers.wsworkunits;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.BaseHPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.platform.Version;
import org.hpccsystems.ws.client.utils.Connection;

/**
 * This wrapper class allows an HPCCWsDFUClient instance to connect to HPCC Clusters using different
 * versions of the platform.
 *
 */
public class WsWorkunitsClientStubWrapper implements IWsWorkunitsClientStubWrapper
{

    final private Version                       platformVersion;
    final private Connection                    connection;
    final private IWsWorkunitsClientStubWrapper versionedStub;

    /**
     * Instantiates a new ws workunits client stub wrapper based on the target hpcc version
     *
     * @param conn
     *            the conn
     * @param targetVersion
     *            the target version
     */
    public WsWorkunitsClientStubWrapper(Connection conn, Version targetVersion)
    {
        this.connection = conn;
        this.platformVersion = targetVersion;

        if (useVersion1_79())
        {
            versionedStub = new WsWorkunitsClientStub1_79(connection);
        }
        else if (useVersion1_69())
        {
            versionedStub = new WsWorkunitsClientStub1_69(connection);
        }
        else if (useVersion1_62())
        {
            versionedStub = new WsWorkunitsClientStub1_62(connection);
        }
        else if (useVersion1_58())
        {
            versionedStub = new WsWorkunitsClientStub1_58(connection);
        }
        else
        {
            throw new UnsupportedOperationException("Can only handle cluster versions 6 and 7, not version " + String.valueOf(platformVersion.getMajor()));
        }
    }

    /**
        return platformVersion.major == 6 && platformVersion.minor >= 4;
     * Use version 1 58.
     *
     * @return true, if successful
     */
    private boolean useVersion1_58()
    {
        return platformVersion.getMajor() == 6 && platformVersion.getMinor() == 0;
    }

    /**
     * Use version 1 62.
     *
     * @return true, if successful
     */
    private boolean useVersion1_62()
    {
        return platformVersion.getMajor() == 6 && platformVersion.getMinor() == 2;
    }

    /**
     * Use version 1 69.
     *
     * @return true, if successful
     */
    private boolean useVersion1_69()
    {
        return platformVersion.major == 6 && platformVersion.minor >= 4;
    }
    /**
     * Use version 1 79.
     *
     * @return true, if successful
     */
    private boolean useVersion1_79()
    {
        return platformVersion.major == 7 && (platformVersion.minor == 0 || platformVersion.minor >= 2);
    }

    /**
     * WU info.
     *
     * @param params
     *            WUInfoRequestWrapper containing request info
     * @return a WUInfoResponseWrapper containing the response
     * @throws Exception
     *             if the WUInfo command fails or an unsupported version is specified
     */
    @Override
    public WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception
    {
        try
        {
            return versionedStub.WUInfo(params);
        }
        catch (RemoteException e)
        {
            throw new Exception("WUInfoResponseWrapper.WUInfo encountered RemoteException.", e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see
     * org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUCreateAndUpdate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUCreateAndUpdateWrapper)
     */
    @Override
    public WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception
    {
        return versionedStub.WUCreateAndUpdate(params);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUCreate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUCreateRequestWrapper)
     */
    @Override
    public WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception
    {
        return versionedStub.WUCreate(params);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUUpdate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUUpdateRequestWrapper)
     */
    @Override
    public WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception
    {
        return versionedStub.WUUpdate(params);
    }

    /**
     * Gets the latest WsWorkunits Stub.
     *
     * @return the latest
     * @throws AxisFault axis fault exception
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsStub getLatestStub() throws AxisFault
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsStub stub = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsStub(
                connection.getBaseUrl() + HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);

        return stub;
    }

    /**
     * Gets the 1 56 fallback stub.
     *
     * @return the 1 56 fallback stub
     * @throws Exception
     *             the exception
     */
    public org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub get1_56FallbackStub() throws Exception
    {
        org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub stub = new org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub(
                connection.getBaseUrl() + HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
        stub = ((org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_56.WsWorkunitsStub) BaseHPCCWsClient.setStubOptions(stub, connection));
        return stub;
    }
}
