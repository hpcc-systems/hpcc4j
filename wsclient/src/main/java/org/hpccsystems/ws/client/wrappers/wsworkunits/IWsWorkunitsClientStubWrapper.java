package org.hpccsystems.ws.client.wrappers.wsworkunits;

public interface IWsWorkunitsClientStubWrapper
{
    WUInfoResponseWrapper WUInfo(WUInfoRequestWrapper params) throws Exception;

    WUUpdateResponseWrapper WUCreateAndUpdate(WUCreateAndUpdateWrapper params) throws Exception;

    WUCreateResponseWrapper WUCreate(WUCreateRequestWrapper params) throws Exception;

    WUUpdateResponseWrapper WUUpdate(WUUpdateRequestWrapper params) throws Exception;
}
