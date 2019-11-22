package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.BaseHPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_58.*;
import org.hpccsystems.ws.client.utils.Connection;

public class WsWorkunitsClientStub1_58 implements IWsWorkunitsClientStubWrapper
{
    private Connection connection;

    public WsWorkunitsClientStub1_58(final Connection connection)
    {
        this.connection = connection;
    }

    public WsWorkunitsStub getStub() throws AxisFault
    {
        WsWorkunitsStub stub = new WsWorkunitsStub(connection.getBaseUrl() + HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
        stub = (WsWorkunitsStub) BaseHPCCWsClient.setStubOptions(stub, connection);

        return stub;
    }

    @Override public WUInfoResponseWrapper WUInfo(final WUInfoRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        final WUInfoResponse response = stub.wUInfo(params.getRawVersion1_58());
        return new WUInfoResponseWrapper(response);
    }

    @Override public WUUpdateResponseWrapper WUCreateAndUpdate(final WUCreateAndUpdateWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUUpdateResponseWrapper(stub.wUCreateAndUpdate(params.getRawVersion1_58()));
    }

    @Override public WUCreateResponseWrapper WUCreate(final WUCreateRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUCreateResponseWrapper(stub.wUCreate(params.getRawVersion1_58()));
    }

    @Override public WUUpdateResponseWrapper WUUpdate(final WUUpdateRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUUpdateResponseWrapper(stub.wUUpdate(params.getRawVersion1_58()));
    }
}
