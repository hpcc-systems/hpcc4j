package org.hpccsystems.ws.client.wrappers.wsworkunits;

/**
 * The Interface IWsWorkunitsClientStubWrapper.
 */
@Deprecated
public interface IWsWorkunitsClientStubWrapper
{
    public WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception;
    public WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception;
    public WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception;
    public WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception;
}
