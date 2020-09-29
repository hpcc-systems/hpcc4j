package org.hpccsystems.ws.client.wrappers.wsworkunits;

import org.apache.axis2.AxisFault;
import org.hpccsystems.ws.client.BaseHPCCWsClient;
import org.hpccsystems.ws.client.HPCCWsWorkUnitsClient;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WUInfoResponse;
import org.hpccsystems.ws.client.gen.axis2.wsworkunits.v1_79.WsWorkunitsStub;
import org.hpccsystems.ws.client.utils.Connection;

public class WsWorkunitsClientStub1_79 implements IWsWorkunitsClientStubWrapper
{

    private Connection connection;

    /**
     * Instantiates a new ws workunits client stub 1 79.
     *
     * @param connection
     *            the connection
     */
    public WsWorkunitsClientStub1_79(final Connection connection)
    {
        this.connection = connection;
    }

    /**
     * Gets the stub.
     *
     * @return the stub
     * @throws AxisFault
     *             the axis fault
     */
    public WsWorkunitsStub getStub() throws AxisFault
    {
        WsWorkunitsStub stub = new WsWorkunitsStub(connection.getBaseUrl() + HPCCWsWorkUnitsClient.WSWORKUNITSWSDLURI);
        stub = (WsWorkunitsStub) BaseHPCCWsClient.setStubOptions(stub, connection);

        return stub;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUInfo(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUInfoRequestWrapper)
     */
    @Override
    public WUInfoResponseWrapper WUInfo(final WUInfoRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        final WUInfoResponse response = stub.wUInfo(params.getRaw());
        return new WUInfoResponseWrapper(response);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUCreateAndUpdate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUCreateAndUpdateWrapper)
     */
    @Override
    public WUUpdateResponseWrapper WUCreateAndUpdate(final WUCreateAndUpdateWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUUpdateResponseWrapper(stub.wUCreateAndUpdate(params.getRaw()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUCreate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUCreateRequestWrapper)
     */
    @Override
    public WUCreateResponseWrapper WUCreate(final WUCreateRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUCreateResponseWrapper(stub.wUCreate(params.getRaw()));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.hpccsystems.ws.client.wrappers.wsworkunits.IWsWorkunitsClientStubWrapper#WUUpdate(org.hpccsystems.ws.client.wrappers.wsworkunits.
     * WUUpdateRequestWrapper)
     */
    @Override
    public WUUpdateResponseWrapper WUUpdate(final WUUpdateRequestWrapper params) throws Exception
    {
        final WsWorkunitsStub stub = getStub();
        return new WUUpdateResponseWrapper(stub.wUUpdate(params.getRaw()));
    }
}
